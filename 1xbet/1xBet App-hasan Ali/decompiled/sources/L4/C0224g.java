package L4;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: L4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224g extends InputStream implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3087k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0228k f3088l;

    public /* synthetic */ C0224g(InterfaceC0228k interfaceC0228k, int i) {
        this.f3087k = i;
        this.f3088l = interfaceC0228k;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f3087k) {
            case 0:
                return (int) Math.min(((C0226i) this.f3088l).f3091l, Integer.MAX_VALUE);
            default:
                C c5 = (C) this.f3088l;
                if (c5.f3052m) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c5.f3051l.f3091l, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3087k) {
            case 0:
                break;
            default:
                ((C) this.f3088l).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f3087k) {
            case 0:
                C0226i c0226i = (C0226i) this.f3088l;
                if (c0226i.f3091l > 0) {
                    return c0226i.s() & 255;
                }
                return -1;
            default:
                C c5 = (C) this.f3088l;
                if (c5.f3052m) {
                    throw new IOException("closed");
                }
                C0226i c0226i2 = c5.f3051l;
                if (c0226i2.f3091l == 0 && c5.f3050k.e(c0226i2, 8192L) == -1) {
                    return -1;
                }
                return c0226i2.s() & 255;
        }
    }

    public final String toString() {
        switch (this.f3087k) {
            case 0:
                return ((C0226i) this.f3088l) + ".inputStream()";
            default:
                return ((C) this.f3088l) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        switch (this.f3087k) {
            case 0:
                kotlin.jvm.internal.l.f("sink", bArr);
                return ((C0226i) this.f3088l).r(bArr, i, i5);
            default:
                kotlin.jvm.internal.l.f("data", bArr);
                C c5 = (C) this.f3088l;
                if (!c5.f3052m) {
                    G4.l.o(bArr.length, i, i5);
                    C0226i c0226i = c5.f3051l;
                    if (c0226i.f3091l == 0 && c5.f3050k.e(c0226i, 8192L) == -1) {
                        return -1;
                    }
                    return c0226i.r(bArr, i, i5);
                }
                throw new IOException("closed");
        }
    }

    private final void b() {
    }
}
