package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ObjectQueue<T> implements Iterable<T>, Closeable {

    public interface Converter<T> {
        T from(byte[] bArr);

        void toStream(T t7, OutputStream outputStream);
    }

    public static <T> ObjectQueue<T> create(QueueFile queueFile, Converter<T> converter) {
        return new FileObjectQueue(queueFile, converter);
    }

    public static <T> ObjectQueue<T> createEmpty() {
        return new EmptyObjectQueue();
    }

    public abstract void add(T t7);

    public List<T> asList() {
        return peek(size());
    }

    public void clear() {
        remove(size());
    }

    public abstract QueueFile file();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract T peek();

    public List<T> peek(int i7) {
        int min = Math.min(i7, size());
        ArrayList arrayList = new ArrayList(min);
        Iterator<T> it = iterator();
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void remove() {
        remove(1);
    }

    public abstract void remove(int i7);

    public abstract int size();
}
