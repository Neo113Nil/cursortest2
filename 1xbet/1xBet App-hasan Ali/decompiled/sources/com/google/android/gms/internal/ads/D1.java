package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D1 extends J1 {

    /* renamed from: n, reason: collision with root package name */
    public K f8140n;

    /* renamed from: o, reason: collision with root package name */
    public B.N f8141o;

    @Override // com.google.android.gms.internal.ads.J1
    public final long a(C1617tm c1617tm) {
        byte[] bArr = c1617tm.f15724a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int b3 = AbstractC1803xs.b(i, c1617tm);
            c1617tm.j(0);
            return b3;
        }
        c1617tm.k(4);
        c1617tm.F();
        int b32 = AbstractC1803xs.b(i, c1617tm);
        c1617tm.j(0);
        return b32;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void b(boolean z3) {
        super.b(z3);
        if (z3) {
            this.f8140n = null;
            this.f8141o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final boolean c(C1617tm c1617tm, long j5, C0709Wb c0709Wb) {
        byte[] bArr = c1617tm.f15724a;
        K k5 = this.f8140n;
        if (k5 == null) {
            K k6 = new K(17, bArr);
            this.f8140n = k6;
            c0709Wb.f12040l = k6.b(Arrays.copyOfRange(bArr, 9, c1617tm.f15726c), null);
            return true;
        }
        byte b3 = bArr[0];
        if ((b3 & Byte.MAX_VALUE) != 3) {
            if (b3 != -1) {
                return true;
            }
            B.N n5 = this.f8141o;
            if (n5 != null) {
                n5.f653k = j5;
                c0709Wb.f12041m = n5;
            }
            ((C1407p) c0709Wb.f12040l).getClass();
            return false;
        }
        C0709Wb B5 = AbstractC1668us.B(c1617tm);
        K k7 = new K(k5.f10089a, k5.f10090b, k5.f10091c, k5.f10092d, k5.f10093e, k5.f10094g, k5.f10095h, k5.f10096j, B5, k5.f10098l);
        this.f8140n = k7;
        B.N n6 = new B.N();
        n6.f655m = k7;
        n6.f656n = B5;
        n6.f653k = -1L;
        n6.f654l = -1L;
        this.f8141o = n6;
        return true;
    }
}
