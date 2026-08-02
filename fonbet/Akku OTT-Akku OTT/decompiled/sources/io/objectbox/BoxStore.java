package io.objectbox;

import java.io.Closeable;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class BoxStore implements Closeable {
    static {
        new HashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
