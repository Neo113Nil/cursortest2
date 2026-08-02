package Q;

import I.C0160m;
import P.C0280a;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;
import a.AbstractC0444a;

/* loaded from: classes.dex */
public final class K extends AbstractC0444a {

    /* renamed from: g, reason: collision with root package name */
    public int f4810g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public int f4813k;
    public I[] f = new I[16];

    /* renamed from: h, reason: collision with root package name */
    public int[] f4811h = new int[16];

    /* renamed from: j, reason: collision with root package name */
    public Object[] f4812j = new Object[16];

    public final void s0() {
        this.f4810g = 0;
        this.i = 0;
        X3.l.B0(this.f4812j, 0, this.f4813k);
        this.f4813k = 0;
    }

    public final void t0(InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        if (v0()) {
            C0160m c0160m = new C0160m(this);
            while (true) {
                K k5 = (K) c0160m.f2501e;
                I i = k5.f[c0160m.f2498b];
                C0280a b3 = i.b(c0160m);
                InterfaceC0284c interfaceC0284c2 = interfaceC0284c;
                P0 p03 = p02;
                C0 c03 = c02;
                J j6 = j5;
                try {
                    i.a(c0160m, interfaceC0284c2, p03, c03, j6);
                    int i5 = c0160m.f2498b;
                    int i6 = k5.f4810g;
                    if (i5 < i6) {
                        I i7 = k5.f[i5];
                        c0160m.f2499c += i7.f4808a;
                        c0160m.f2500d += i7.f4809b;
                        int i8 = i5 + 1;
                        c0160m.f2498b = i8;
                        if (i8 >= i6) {
                            break;
                        }
                        interfaceC0284c = interfaceC0284c2;
                        p02 = p03;
                        c02 = c03;
                        j5 = j6;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        s0();
    }

    public final boolean u0() {
        return this.f4810g == 0;
    }

    public final boolean v0() {
        return this.f4810g != 0;
    }

    public final void w0(I i) {
        int i5 = this.f4810g;
        I[] iArr = this.f;
        if (i5 == iArr.length) {
            I[] iArr2 = new I[(i5 > 1024 ? 1024 : i5) + i5];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f = iArr2;
        }
        int i6 = this.i + i.f4808a;
        int[] iArr3 = this.f4811h;
        int length = iArr3.length;
        if (i6 > length) {
            int i7 = (length > 1024 ? 1024 : length) + length;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr4 = new int[i6];
            X3.l.s0(0, 0, length, iArr3, iArr4);
            this.f4811h = iArr4;
        }
        int i8 = this.f4813k;
        int i9 = i.f4809b;
        int i10 = i8 + i9;
        Object[] objArr = this.f4812j;
        int length2 = objArr.length;
        if (i10 > length2) {
            int i11 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i11 >= i10) {
                i10 = i11;
            }
            Object[] objArr2 = new Object[i10];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f4812j = objArr2;
        }
        I[] iArr5 = this.f;
        int i12 = this.f4810g;
        this.f4810g = i12 + 1;
        iArr5[i12] = i;
        this.i += i.f4808a;
        this.f4813k += i9;
    }
}
