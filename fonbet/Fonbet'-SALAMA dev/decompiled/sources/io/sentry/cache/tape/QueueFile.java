package io.sentry.cache.tape;

import W5.AbstractC0486a1;
import e1.k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class QueueFile implements Closeable, Iterable<byte[]> {
    private static final int VERSIONED_HEADER = -2147483647;
    boolean closed;
    int elementCount;
    final File file;
    long fileLength;
    Element first;
    private Element last;
    private final int maxElements;
    RandomAccessFile raf;
    private final boolean zero;
    static final int INITIAL_LENGTH = 4096;
    private static final byte[] ZEROES = new byte[INITIAL_LENGTH];
    final int headerLength = 32;
    private final byte[] buffer = new byte[32];
    int modCount = 0;

    public static final class Builder {
        final File file;
        boolean zero = true;
        int size = -1;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.file = file;
        }

        public QueueFile build() {
            RandomAccessFile initializeFromFile = QueueFile.initializeFromFile(this.file);
            try {
                return new QueueFile(this.file, initializeFromFile, this.zero, this.size);
            } catch (Throwable th) {
                initializeFromFile.close();
                throw th;
            }
        }

        public Builder size(int i7) {
            this.size = i7;
            return this;
        }

        public Builder zero(boolean z4) {
            this.zero = z4;
            return this;
        }
    }

    public static final class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final long position;

        public Element(long j, int i7) {
            this.position = j;
            this.length = i7;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Element.class.getSimpleName());
            sb.append("[position=");
            sb.append(this.position);
            sb.append(", length=");
            return k.g(sb, this.length, "]");
        }
    }

    public final class ElementIterator implements Iterator<byte[]> {
        int expectedModCount;
        int nextElementIndex = 0;
        private long nextElementPosition;

        public ElementIterator() {
            this.nextElementPosition = QueueFile.this.first.position;
            this.expectedModCount = QueueFile.this.modCount;
        }

        private void checkForComodification() {
            if (QueueFile.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            return this.nextElementIndex != QueueFile.this.elementCount;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                QueueFile.this.remove();
                this.expectedModCount = QueueFile.this.modCount;
                this.nextElementIndex--;
            } catch (IOException e7) {
                throw ((Error) QueueFile.getSneakyThrowable(e7));
            }
        }

        @Override // java.util.Iterator
        public byte[] next() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i7 = this.nextElementIndex;
            QueueFile queueFile = QueueFile.this;
            if (i7 >= queueFile.elementCount) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    Element readElement = queueFile.readElement(this.nextElementPosition);
                    byte[] bArr = new byte[readElement.length];
                    long wrapPosition = QueueFile.this.wrapPosition(readElement.position + 4);
                    this.nextElementPosition = wrapPosition;
                    if (!QueueFile.this.ringRead(wrapPosition, bArr, 0, readElement.length)) {
                        this.nextElementIndex = QueueFile.this.elementCount;
                        return QueueFile.ZEROES;
                    }
                    this.nextElementPosition = QueueFile.this.wrapPosition(readElement.position + 4 + readElement.length);
                    this.nextElementIndex++;
                    return bArr;
                } catch (IOException e7) {
                    throw ((Error) QueueFile.getSneakyThrowable(e7));
                }
            } catch (IOException e8) {
                throw ((Error) QueueFile.getSneakyThrowable(e8));
            } catch (OutOfMemoryError unused) {
                QueueFile.this.resetFile();
                this.nextElementIndex = QueueFile.this.elementCount;
                return QueueFile.ZEROES;
            }
        }
    }

    public QueueFile(File file, RandomAccessFile randomAccessFile, boolean z4, int i7) {
        this.file = file;
        this.raf = randomAccessFile;
        this.zero = z4;
        this.maxElements = i7;
        readInitialData();
    }

    private void expandIfNecessary(long j) {
        long j3;
        long j7;
        long j8 = j + 4;
        long remainingBytes = remainingBytes();
        if (remainingBytes >= j8) {
            return;
        }
        long j9 = this.fileLength;
        while (true) {
            remainingBytes += j9;
            j3 = j9 << 1;
            if (remainingBytes >= j8) {
                break;
            } else {
                j9 = j3;
            }
        }
        setLength(j3);
        long wrapPosition = wrapPosition(this.last.position + 4 + r2.length);
        if (wrapPosition <= this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            j7 = wrapPosition - 32;
            if (channel.transferTo(32L, j7, channel) != j7) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j7 = 0;
        }
        long j10 = j7;
        long j11 = this.last.position;
        long j12 = this.first.position;
        if (j11 < j12) {
            long j13 = (this.fileLength + j11) - 32;
            writeHeader(j3, this.elementCount, j12, j13);
            this.last = new Element(j13, this.last.length);
        } else {
            writeHeader(j3, this.elementCount, j12, j11);
        }
        this.fileLength = j3;
        if (this.zero) {
            ringErase(32L, j10);
        }
    }

    public static RandomAccessFile initializeFromFile(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile open = open(file2);
            try {
                open.setLength(4096L);
                open.seek(0L);
                open.writeInt(VERSIONED_HEADER);
                open.writeLong(4096L);
                open.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                open.close();
                throw th;
            }
        }
        return open(file);
    }

    private static RandomAccessFile open(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void readInitialData() {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        this.fileLength = readLong(this.buffer, 4);
        this.elementCount = readInt(this.buffer, 12);
        long readLong = readLong(this.buffer, 16);
        long readLong2 = readLong(this.buffer, 24);
        if (this.fileLength <= this.raf.length()) {
            if (this.fileLength <= 32) {
                throw new IOException(AbstractC0486a1.i(new StringBuilder("File is corrupt; length stored in header ("), this.fileLength, ") is invalid."));
            }
            this.first = readElement(readLong);
            this.last = readElement(readLong2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
    }

    private static int readInt(byte[] bArr, int i7) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    private static long readLong(byte[] bArr, int i7) {
        return ((bArr[i7] & 255) << 56) + ((bArr[i7 + 1] & 255) << 48) + ((bArr[i7 + 2] & 255) << 40) + ((bArr[i7 + 3] & 255) << 32) + ((bArr[i7 + 4] & 255) << 24) + ((bArr[i7 + 5] & 255) << 16) + ((bArr[i7 + 6] & 255) << 8) + (bArr[i7 + 7] & 255);
    }

    private long remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFile() {
        this.raf.close();
        this.file.delete();
        this.raf = initializeFromFile(this.file);
        readInitialData();
    }

    private void ringErase(long j, long j3) {
        while (j3 > 0) {
            byte[] bArr = ZEROES;
            int min = (int) Math.min(j3, bArr.length);
            ringWrite(j, bArr, 0, min);
            long j7 = min;
            j3 -= j7;
            j += j7;
        }
    }

    private void ringWrite(long j, byte[] bArr, int i7, int i8) {
        long wrapPosition = wrapPosition(j);
        long j3 = i8 + wrapPosition;
        long j7 = this.fileLength;
        if (j3 <= j7) {
            this.raf.seek(wrapPosition);
            this.raf.write(bArr, i7, i8);
            return;
        }
        int i9 = (int) (j7 - wrapPosition);
        this.raf.seek(wrapPosition);
        this.raf.write(bArr, i7, i9);
        this.raf.seek(32L);
        this.raf.write(bArr, i7 + i9, i8 - i9);
    }

    private void setLength(long j) {
        this.raf.setLength(j);
        this.raf.getChannel().force(true);
    }

    private long usedBytes() {
        if (this.elementCount == 0) {
            return 32L;
        }
        long j = this.last.position;
        long j3 = this.first.position;
        return j >= j3 ? (j - j3) + 4 + r0.length + 32 : (((j + 4) + r0.length) + this.fileLength) - j3;
    }

    private void writeHeader(long j, int i7, long j3, long j7) {
        this.raf.seek(0L);
        writeInt(this.buffer, 0, VERSIONED_HEADER);
        writeLong(this.buffer, 4, j);
        writeInt(this.buffer, 12, i7);
        writeLong(this.buffer, 16, j3);
        writeLong(this.buffer, 24, j7);
        this.raf.write(this.buffer, 0, 32);
    }

    private static void writeInt(byte[] bArr, int i7, int i8) {
        bArr[i7] = (byte) (i8 >> 24);
        bArr[i7 + 1] = (byte) (i8 >> 16);
        bArr[i7 + 2] = (byte) (i8 >> 8);
        bArr[i7 + 3] = (byte) i8;
    }

    private static void writeLong(byte[] bArr, int i7, long j) {
        bArr[i7] = (byte) (j >> 56);
        bArr[i7 + 1] = (byte) (j >> 48);
        bArr[i7 + 2] = (byte) (j >> 40);
        bArr[i7 + 3] = (byte) (j >> 32);
        bArr[i7 + 4] = (byte) (j >> 24);
        bArr[i7 + 5] = (byte) (j >> 16);
        bArr[i7 + 6] = (byte) (j >> 8);
        bArr[i7 + 7] = (byte) j;
    }

    public void add(byte[] bArr) {
        add(bArr, 0, bArr.length);
    }

    public void clear() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        writeHeader(4096L, 0, 0L, 0L);
        if (this.zero) {
            this.raf.seek(32L);
            this.raf.write(ZEROES, 0, 4064);
        }
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096L);
        }
        this.fileLength = 4096L;
        this.modCount++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.raf.close();
    }

    public File file() {
        return this.file;
    }

    public boolean isAtFullCapacity() {
        return this.maxElements != -1 && size() == this.maxElements;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new ElementIterator();
    }

    public byte[] peek() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i7 = element.length;
        byte[] bArr = new byte[i7];
        if (ringRead(element.position + 4, bArr, 0, i7)) {
            return bArr;
        }
        return null;
    }

    public Element readElement(long j) {
        return j == 0 ? Element.NULL : !ringRead(j, this.buffer, 0, 4) ? Element.NULL : new Element(j, readInt(this.buffer, 0));
    }

    public void remove() {
        remove(1);
    }

    public boolean ringRead(long j, byte[] bArr, int i7, int i8) {
        try {
            long wrapPosition = wrapPosition(j);
            long j3 = i8 + wrapPosition;
            long j7 = this.fileLength;
            if (j3 <= j7) {
                this.raf.seek(wrapPosition);
                this.raf.readFully(bArr, i7, i8);
                return true;
            }
            int i9 = (int) (j7 - wrapPosition);
            this.raf.seek(wrapPosition);
            this.raf.readFully(bArr, i7, i9);
            this.raf.seek(32L);
            this.raf.readFully(bArr, i7 + i9, i8 - i9);
            return true;
        } catch (EOFException unused) {
            resetFile();
            return false;
        } catch (IOException e7) {
            throw e7;
        } catch (Throwable unused2) {
            resetFile();
            return false;
        }
    }

    public int size() {
        return this.elementCount;
    }

    public String toString() {
        return "QueueFile{file=" + this.file + ", zero=" + this.zero + ", length=" + this.fileLength + ", size=" + this.elementCount + ", first=" + this.first + ", last=" + this.last + '}';
    }

    public long wrapPosition(long j) {
        long j3 = this.fileLength;
        return j < j3 ? j : (j + 32) - j3;
    }

    public void add(byte[] bArr, int i7, int i8) {
        long wrapPosition;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
            throw new IndexOutOfBoundsException();
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        expandIfNecessary(i8);
        boolean isEmpty = isEmpty();
        if (isEmpty) {
            wrapPosition = 32;
        } else {
            wrapPosition = wrapPosition(this.last.position + 4 + r0.length);
        }
        Element element = new Element(wrapPosition, i8);
        writeInt(this.buffer, 0, i8);
        ringWrite(element.position, this.buffer, 0, 4);
        ringWrite(element.position + 4, bArr, i7, i8);
        writeHeader(this.fileLength, this.elementCount + 1, isEmpty ? element.position : this.first.position, element.position);
        this.last = element;
        this.elementCount++;
        this.modCount++;
        if (isEmpty) {
            this.first = element;
        }
    }

    public void remove(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Cannot remove negative (", ") number of elements."));
        }
        if (i7 == 0) {
            return;
        }
        if (i7 == this.elementCount) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i7 > this.elementCount) {
            throw new IllegalArgumentException(k.g(AbstractC0486a1.j(i7, "Cannot remove more elements (", ") than present in queue ("), this.elementCount, ")."));
        }
        Element element = this.first;
        long j = element.position;
        int i8 = element.length;
        long j3 = 0;
        int i9 = 0;
        long j7 = j;
        while (i9 < i7) {
            j3 += i8 + 4;
            long wrapPosition = wrapPosition(j7 + 4 + i8);
            if (!ringRead(wrapPosition, this.buffer, 0, 4)) {
                return;
            }
            i8 = readInt(this.buffer, 0);
            i9++;
            j7 = wrapPosition;
        }
        writeHeader(this.fileLength, this.elementCount - i7, j7, this.last.position);
        this.elementCount -= i7;
        this.modCount++;
        this.first = new Element(j7, i8);
        if (this.zero) {
            ringErase(j, j3);
        }
    }

    public static <T extends Throwable> T getSneakyThrowable(Throwable th) {
        throw th;
    }
}
