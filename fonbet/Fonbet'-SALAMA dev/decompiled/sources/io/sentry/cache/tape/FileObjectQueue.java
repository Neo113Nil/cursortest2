package io.sentry.cache.tape;

import io.sentry.cache.tape.ObjectQueue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class FileObjectQueue<T> extends ObjectQueue<T> {
    private final DirectByteArrayOutputStream bytes = new DirectByteArrayOutputStream();
    final ObjectQueue.Converter<T> converter;
    private final QueueFile queueFile;

    public static final class DirectByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getArray() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public final class QueueFileIterator implements Iterator<T> {
        final Iterator<byte[]> iterator;

        public QueueFileIterator(Iterator<byte[]> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            try {
                return FileObjectQueue.this.converter.from(this.iterator.next());
            } catch (IOException e7) {
                throw ((Error) QueueFile.getSneakyThrowable(e7));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }

    public FileObjectQueue(QueueFile queueFile, ObjectQueue.Converter<T> converter) {
        this.queueFile = queueFile;
        this.converter = converter;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void add(T t7) {
        this.bytes.reset();
        this.converter.toStream(t7, this.bytes);
        this.queueFile.add(this.bytes.getArray(), 0, this.bytes.size());
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void clear() {
        this.queueFile.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.queueFile.close();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public QueueFile file() {
        return this.queueFile;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public boolean isEmpty() {
        return this.queueFile.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new QueueFileIterator(this.queueFile.iterator());
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public T peek() {
        byte[] peek = this.queueFile.peek();
        if (peek == null) {
            return null;
        }
        return this.converter.from(peek);
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove() {
        this.queueFile.remove();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public int size() {
        return this.queueFile.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.queueFile + '}';
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove(int i7) {
        this.queueFile.remove(i7);
    }
}
