package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* compiled from: ForwardingSource.java */
/* loaded from: classes6.dex */
public abstract class h implements s {

    /* renamed from: a, reason: collision with root package name */
    private final s f9965a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f9965a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f9965a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9965a.close();
    }

    public final s d() {
        return this.f9965a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f9965a.toString() + ")";
    }
}
