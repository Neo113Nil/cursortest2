package org.tensorflow.lite;

/* loaded from: classes18.dex */
public interface Delegate extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }

    long getNativeHandle();
}
