package p018c2;

import C1.C0095a;
import android.net.Uri;
import java.util.Map;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;
import p146u2.U;
import p151v2.a;

/* JADX INFO: renamed from: c2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0773t implements InterfaceC0954m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0954m f10400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f10402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10404e;

    public C0773t(InterfaceC0954m interfaceC0954m, int i7, L l7) {
        a.f(i7 > 0);
        this.f10400a = interfaceC0954m;
        this.f10401b = i7;
        this.f10402c = l7;
        this.f10403d = new byte[1];
        this.f10404e = i7;
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p146u2.InterfaceC0954m
    public final Map k() {
        return this.f10400a.k();
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) {
        throw new UnsupportedOperationException();
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = this.f10404e;
        InterfaceC0954m interfaceC0954m = this.f10400a;
        if (i9 == 0) {
            byte[] bArr2 = this.f10403d;
            int i10 = 0;
            if (interfaceC0954m.read(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int i13 = interfaceC0954m.read(bArr3, i10, i12);
                        if (i13 != -1) {
                            i10 += i13;
                            i12 -= i13;
                        }
                    }
                    while (i11 > 0 && bArr3[i11 - 1] == 0) {
                        i11--;
                    }
                    if (i11 > 0) {
                        C0095a c0095a = new C0095a(bArr3, i11);
                        L l7 = this.f10402c;
                        long jMax = !l7.f10188D ? l7.f10198z : Math.max(l7.f10189E.e(), l7.f10198z);
                        int iD = c0095a.d();
                        V v6 = l7.f10187C;
                        v6.getClass();
                        v6.c(iD, c0095a);
                        v6.e(jMax, 1, iD, 0, null);
                        l7.f10188D = true;
                    }
                }
                this.f10404e = this.f10401b;
            }
            return -1;
        }
        int i14 = interfaceC0954m.read(bArr, i7, Math.min(this.f10404e, i8));
        if (i14 != -1) {
            this.f10404e -= i14;
        }
        return i14;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        return this.f10400a.t();
    }

    @Override // p146u2.InterfaceC0954m
    public final void x(U u4) {
        u4.getClass();
        this.f10400a.x(u4);
    }
}
