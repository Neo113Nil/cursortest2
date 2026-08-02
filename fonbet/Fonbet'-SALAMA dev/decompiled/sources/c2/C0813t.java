package c2;

import C1.C0095a;
import android.net.Uri;
import java.util.Map;
import u2.C1640q;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;

/* renamed from: c2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813t implements InterfaceC1636m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1636m f10400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10401b;

    /* renamed from: c, reason: collision with root package name */
    public final L f10402c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10403d;

    /* renamed from: e, reason: collision with root package name */
    public int f10404e;

    public C0813t(InterfaceC1636m interfaceC1636m, int i7, L l7) {
        AbstractC1664a.f(i7 > 0);
        this.f10400a = interfaceC1636m;
        this.f10401b = i7;
        this.f10402c = l7;
        this.f10403d = new byte[1];
        this.f10404e = i7;
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // u2.InterfaceC1636m
    public final Map k() {
        return this.f10400a.k();
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        throw new UnsupportedOperationException();
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = this.f10404e;
        InterfaceC1636m interfaceC1636m = this.f10400a;
        if (i9 == 0) {
            byte[] bArr2 = this.f10403d;
            int i10 = 0;
            if (interfaceC1636m.read(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int read = interfaceC1636m.read(bArr3, i10, i12);
                        if (read != -1) {
                            i10 += read;
                            i12 -= read;
                        }
                    }
                    while (i11 > 0 && bArr3[i11 - 1] == 0) {
                        i11--;
                    }
                    if (i11 > 0) {
                        C0095a c0095a = new C0095a(bArr3, i11);
                        L l7 = this.f10402c;
                        long max = !l7.f10188D ? l7.f10198z : Math.max(l7.f10189E.e(), l7.f10198z);
                        int d7 = c0095a.d();
                        V v6 = l7.f10187C;
                        v6.getClass();
                        v6.c(d7, c0095a);
                        v6.e(max, 1, d7, 0, null);
                        l7.f10188D = true;
                    }
                }
                this.f10404e = this.f10401b;
            }
            return -1;
        }
        int read2 = interfaceC1636m.read(bArr, i7, Math.min(this.f10404e, i8));
        if (read2 != -1) {
            this.f10404e -= read2;
        }
        return read2;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        return this.f10400a.t();
    }

    @Override // u2.InterfaceC1636m
    public final void x(u2.U u4) {
        u4.getClass();
        this.f10400a.x(u4);
    }
}
