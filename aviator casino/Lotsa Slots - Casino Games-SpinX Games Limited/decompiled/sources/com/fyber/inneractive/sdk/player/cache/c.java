package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class c extends java.io.FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.cache.d f3867a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.fyber.inneractive.sdk.player.cache.d dVar, java.io.FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f3867a = dVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((java.io.FilterOutputStream) this).out.close();
        } catch (java.io.IOException unused) {
            this.f3867a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((java.io.FilterOutputStream) this).out.flush();
        } catch (java.io.IOException unused) {
            this.f3867a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            ((java.io.FilterOutputStream) this).out.write(i);
        } catch (java.io.IOException unused) {
            this.f3867a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            ((java.io.FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (java.io.IOException unused) {
            this.f3867a.c = true;
        }
    }
}
