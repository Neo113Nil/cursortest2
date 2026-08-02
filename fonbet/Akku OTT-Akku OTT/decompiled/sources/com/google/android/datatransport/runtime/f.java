package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.scheduling.persistence.w;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements Closeable {
    public javax.inject.a<Executor> a;
    public com.google.android.datatransport.runtime.dagger.internal.c b;
    public javax.inject.a c;
    public w d;
    public javax.inject.a<String> e;
    public javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.m> f;
    public javax.inject.a<q> i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.get().close();
    }
}
