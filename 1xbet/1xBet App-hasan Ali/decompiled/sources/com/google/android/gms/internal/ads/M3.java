package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class M3 extends ByteArrayOutputStream implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final G3 f10580k;

    public M3(G3 g32, int i) {
        this.f10580k = g32;
        ((ByteArrayOutputStream) this).buf = g32.j(Math.max(i, 256));
    }

    public final void b(int i) {
        int i5 = ((ByteArrayOutputStream) this).count;
        if (i5 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i6 = i5 + i;
        G3 g32 = this.f10580k;
        byte[] j5 = g32.j(i6 + i6);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, j5, 0, ((ByteArrayOutputStream) this).count);
        g32.g(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = j5;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10580k.g(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f10580k.g(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        b(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i5) {
        b(i5);
        super.write(bArr, i, i5);
    }
}
