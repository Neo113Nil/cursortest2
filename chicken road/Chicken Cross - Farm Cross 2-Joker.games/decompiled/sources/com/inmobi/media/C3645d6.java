package com.inmobi.media;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3645d6 extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3672e6 f7064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3645d6(C3672e6 c3672e6, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f7064a = c3672e6;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f7064a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f7064a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException unused) {
            this.f7064a.c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.f7064a.c = true;
        }
    }
}
