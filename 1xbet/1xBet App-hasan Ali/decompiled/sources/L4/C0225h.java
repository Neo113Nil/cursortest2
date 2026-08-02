package L4;

import java.io.OutputStream;

/* renamed from: L4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225h extends OutputStream implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0226i f3089k;

    public C0225h(C0226i c0226i) {
        this.f3089k = c0226i;
    }

    public final String toString() {
        return this.f3089k + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3089k.P(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) {
        kotlin.jvm.internal.l.f("data", bArr);
        this.f3089k.N(bArr, i, i5);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
