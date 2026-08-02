package com.google.android.gms.common.data;

/* loaded from: classes8.dex */
public interface DataBuffer<T> extends java.lang.Iterable<T>, com.google.android.gms.common.api.Releasable, java.io.Closeable {
    void close();

    T get(int i);

    int getCount();

    android.os.Bundle getMetadata();

    @java.lang.Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    java.util.Iterator<T> iterator();

    void release();

    java.util.Iterator<T> singleRefIterator();
}
