package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class EmptyObjectQueue<T> extends ObjectQueue<T> {

    public static final class EmptyIterator<T> implements Iterator<T> {
        private EmptyIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void add(T t7) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public QueueFile file() {
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new EmptyIterator();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public T peek() {
        return null;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove(int i7) {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public int size() {
        return 0;
    }
}
