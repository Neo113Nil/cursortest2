package p146u2;

import java.io.InputStream;
import p151v2.a;

/* JADX INFO: renamed from: u2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0956o extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0954m f16801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0958q f16802b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16804d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16805e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16803c = new byte[1];

    public C0956o(InterfaceC0954m interfaceC0954m, C0958q c0958q) {
        this.f16801a = interfaceC0954m;
        this.f16802b = c0958q;
    }

    public final void a() {
        if (this.f16804d) {
            return;
        }
        this.f16801a.o(this.f16802b);
        this.f16804d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16805e) {
            return;
        }
        this.f16801a.close();
        this.f16805e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f16803c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        a.h(!this.f16805e);
        a();
        int i9 = this.f16801a.read(bArr, i7, i8);
        if (i9 == -1) {
            return -1;
        }
        return i9;
    }
}
