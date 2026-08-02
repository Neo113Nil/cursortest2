package u2;

import java.io.InputStream;
import v2.AbstractC1664a;

/* renamed from: u2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1638o extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1636m f16795a;

    /* renamed from: b, reason: collision with root package name */
    public final C1640q f16796b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16798d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16799e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16797c = new byte[1];

    public C1638o(InterfaceC1636m interfaceC1636m, C1640q c1640q) {
        this.f16795a = interfaceC1636m;
        this.f16796b = c1640q;
    }

    public final void a() {
        if (this.f16798d) {
            return;
        }
        this.f16795a.o(this.f16796b);
        this.f16798d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16799e) {
            return;
        }
        this.f16795a.close();
        this.f16799e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f16797c;
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
        AbstractC1664a.h(!this.f16799e);
        a();
        int read = this.f16795a.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
