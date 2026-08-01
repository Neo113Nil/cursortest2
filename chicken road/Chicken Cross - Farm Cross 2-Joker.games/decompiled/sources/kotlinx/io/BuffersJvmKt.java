package kotlinx.io;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.unsafe.BufferIterationContext;
import kotlinx.io.unsafe.UnsafeBufferOperations;
import kotlinx.io.unsafe.UnsafeBufferOperationsKt;

/* compiled from: BuffersJvm.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\u0004\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\r\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0001¨\u0006\u0017"}, d2 = {"transferFrom", "Lkotlinx/io/Buffer;", "input", "Ljava/io/InputStream;", "write", "byteCount", "", "", "forever", "", "readTo", "out", "Ljava/io/OutputStream;", "copyTo", "startIndex", "endIndex", "readAtMostTo", "", "sink", "Ljava/nio/ByteBuffer;", "source", "asByteChannel", "Ljava/nio/channels/ByteChannel;", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuffersJvmKt {
    public static final Buffer transferFrom(Buffer buffer, InputStream input) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        write(buffer, input, Long.MAX_VALUE, true);
        return buffer;
    }

    public static final Buffer write(Buffer buffer, InputStream input, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (j >= 0) {
            write(buffer, input, j, false);
            return buffer;
        }
        throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
    }

    private static final void write(Buffer buffer, InputStream inputStream, long j, boolean z) {
        long j2 = j;
        boolean z2 = false;
        while (!z2) {
            if (j2 <= 0 && !z) {
                return;
            }
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Segment writableSegment = buffer.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            int read = inputStream.read(dataAsByteArray, writableSegment.getLimit(), (int) Math.min(j2, dataAsByteArray.length - r7));
            if (read != -1) {
                j2 -= read;
            } else {
                if (!z) {
                    throw new EOFException("Stream exhausted before " + j + " bytes were read.");
                }
                read = 0;
                z2 = true;
            }
            if (read == 1) {
                writableSegment.writeBackData(dataAsByteArray, read);
                writableSegment.setLimit(writableSegment.getLimit() + read);
                buffer.setSizeMut(buffer.getSizeMut() + read);
            } else {
                if (read < 0 || read > writableSegment.getRemainingCapacity()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + read + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (read != 0) {
                    writableSegment.writeBackData(dataAsByteArray, read);
                    writableSegment.setLimit(writableSegment.getLimit() + read);
                    buffer.setSizeMut(buffer.getSizeMut() + read);
                } else if (SegmentKt.isEmpty(writableSegment)) {
                    buffer.recycleTail();
                }
            }
        }
    }

    public static /* synthetic */ void readTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = buffer.getSizeMut();
        }
        readTo(buffer, outputStream, j);
    }

    public static final void readTo(Buffer buffer, OutputStream out, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        _UtilKt.checkOffsetAndCount(buffer.getSizeMut(), 0L, j);
        while (j > 0) {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            if (buffer.exhausted()) {
                throw new IllegalArgumentException("Buffer is empty".toString());
            }
            Segment head = buffer.getHead();
            Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            int min = (int) Math.min(j, head.getLimit() - pos);
            out.write(dataAsByteArray, pos, min);
            long j2 = min;
            j -= j2;
            if (min != 0) {
                if (min < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (min > head.getSize()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                buffer.skip(j2);
            }
        }
    }

    public static /* synthetic */ void copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.getSizeMut();
        }
        copyTo(buffer, outputStream, j3, j2);
    }

    public static final void copyTo(Buffer buffer, OutputStream out, long j, long j2) {
        BufferIterationContext bufferIterationContext;
        BufferIterationContext bufferIterationContext2;
        BufferIterationContext bufferIterationContext3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        _UtilKt.checkBounds(buffer.getSizeMut(), j, j2);
        if (j == j2) {
            return;
        }
        long j3 = j2 - j;
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        if (j < 0) {
            throw new IllegalArgumentException(("Offset must be non-negative: " + j).toString());
        }
        if (j >= buffer.getSizeMut()) {
            throw new IndexOutOfBoundsException("Offset should be less than buffer's size (" + buffer.getSizeMut() + "): " + j);
        }
        if (buffer.getHead() == null) {
            bufferIterationContext3 = UnsafeBufferOperationsKt.BufferIterationContextImpl;
            Segment segment = null;
            Intrinsics.checkNotNull(null);
            int i = (int) (j - (-1));
            while (j3 > 0) {
                byte[] dataAsByteArray = segment.dataAsByteArray(true);
                int pos = segment.getPos();
                int min = (int) Math.min((segment.getLimit() - pos) - i, j3);
                out.write(dataAsByteArray, pos + i, min);
                j3 -= min;
                segment = bufferIterationContext3.next(segment);
                if (segment == null) {
                    return;
                } else {
                    i = 0;
                }
            }
            return;
        }
        if (buffer.getSizeMut() - j < j) {
            Segment tail = buffer.getTail();
            long sizeMut = buffer.getSizeMut();
            while (tail != null && sizeMut > j) {
                sizeMut -= tail.getLimit() - tail.getPos();
                if (sizeMut <= j) {
                    break;
                } else {
                    tail = tail.getPrev();
                }
            }
            bufferIterationContext2 = UnsafeBufferOperationsKt.BufferIterationContextImpl;
            Intrinsics.checkNotNull(tail);
            int i2 = (int) (j - sizeMut);
            while (j3 > 0) {
                byte[] dataAsByteArray2 = tail.dataAsByteArray(true);
                int pos2 = tail.getPos();
                int min2 = (int) Math.min((tail.getLimit() - pos2) - i2, j3);
                out.write(dataAsByteArray2, pos2 + i2, min2);
                j3 -= min2;
                tail = bufferIterationContext2.next(tail);
                if (tail == null) {
                    return;
                } else {
                    i2 = 0;
                }
            }
            return;
        }
        Segment head = buffer.getHead();
        long j4 = 0;
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j4;
            if (limit > j) {
                break;
            }
            head = head.getNext();
            j4 = limit;
        }
        bufferIterationContext = UnsafeBufferOperationsKt.BufferIterationContextImpl;
        Intrinsics.checkNotNull(head);
        int i3 = (int) (j - j4);
        while (j3 > 0) {
            byte[] dataAsByteArray3 = head.dataAsByteArray(true);
            int pos3 = head.getPos();
            int min3 = (int) Math.min((head.getLimit() - pos3) - i3, j3);
            out.write(dataAsByteArray3, pos3 + i3, min3);
            j3 -= min3;
            head = bufferIterationContext.next(head);
            if (head == null) {
                return;
            } else {
                i3 = 0;
            }
        }
    }

    public static final int readAtMostTo(Buffer buffer, ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.exhausted()) {
            return -1;
        }
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        if (buffer.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        Segment head = buffer.getHead();
        Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        int min = Math.min(sink.remaining(), head.getLimit() - pos);
        sink.put(dataAsByteArray, pos, min);
        if (min != 0) {
            if (min < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (min > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(min);
        }
        return min;
    }

    public static final Buffer transferFrom(Buffer buffer, ByteBuffer source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        while (remaining > 0) {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Segment writableSegment = buffer.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            int limit = writableSegment.getLimit();
            int min = Math.min(remaining, dataAsByteArray.length - limit);
            source.get(dataAsByteArray, limit, min);
            remaining -= min;
            if (min == 1) {
                writableSegment.writeBackData(dataAsByteArray, min);
                writableSegment.setLimit(writableSegment.getLimit() + min);
                buffer.setSizeMut(buffer.getSizeMut() + min);
            } else {
                if (min < 0 || min > writableSegment.getRemainingCapacity()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + min + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (min != 0) {
                    writableSegment.writeBackData(dataAsByteArray, min);
                    writableSegment.setLimit(writableSegment.getLimit() + min);
                    buffer.setSizeMut(buffer.getSizeMut() + min);
                } else if (SegmentKt.isEmpty(writableSegment)) {
                    buffer.recycleTail();
                }
            }
        }
        return buffer;
    }

    public static final ByteChannel asByteChannel(final Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return new ByteChannel() { // from class: kotlinx.io.BuffersJvmKt$asByteChannel$1
            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.nio.channels.Channel
            public boolean isOpen() {
                return true;
            }

            @Override // java.nio.channels.ReadableByteChannel
            public int read(ByteBuffer sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                return BuffersJvmKt.readAtMostTo(Buffer.this, sink);
            }

            @Override // java.nio.channels.WritableByteChannel
            public int write(ByteBuffer source) {
                Intrinsics.checkNotNullParameter(source, "source");
                long sizeMut = Buffer.this.getSizeMut();
                BuffersJvmKt.transferFrom(Buffer.this, source);
                return (int) (Buffer.this.getSizeMut() - sizeMut);
            }
        };
    }
}
