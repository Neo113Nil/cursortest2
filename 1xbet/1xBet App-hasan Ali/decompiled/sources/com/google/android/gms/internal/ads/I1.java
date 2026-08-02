package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class I1 extends J1 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f9513o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f9514p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f9515n;

    public static boolean e(C1617tm c1617tm, byte[] bArr) {
        if (c1617tm.o() < 8) {
            return false;
        }
        int i = c1617tm.f15725b;
        byte[] bArr2 = new byte[8];
        c1617tm.f(bArr2, 0, 8);
        c1617tm.j(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final long a(C1617tm c1617tm) {
        byte[] bArr = c1617tm.f15724a;
        return (this.i * AbstractC1803xs.b0(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void b(boolean z3) {
        super.b(z3);
        if (z3) {
            this.f9515n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final boolean c(C1617tm c1617tm, long j5, C0709Wb c0709Wb) {
        if (e(c1617tm, f9513o)) {
            byte[] copyOf = Arrays.copyOf(c1617tm.f15724a, c1617tm.f15726c);
            int i = copyOf[9] & 255;
            ArrayList T4 = AbstractC1803xs.T(copyOf);
            if (((C1407p) c0709Wb.f12040l) == null) {
                C1649uH c1649uH = new C1649uH();
                c1649uH.c("audio/opus");
                c1649uH.f15831A = i;
                c1649uH.f15832B = 48000;
                c1649uH.f15851o = T4;
                c0709Wb.f12040l = new C1407p(c1649uH);
                return true;
            }
        } else {
            if (!e(c1617tm, f9514p)) {
                AbstractC1668us.F((C1407p) c0709Wb.f12040l);
                return false;
            }
            AbstractC1668us.F((C1407p) c0709Wb.f12040l);
            if (!this.f9515n) {
                this.f9515n = true;
                c1617tm.k(8);
                C5 A3 = AbstractC1668us.A(AbstractC1044gv.m((String[]) AbstractC1668us.K(c1617tm, false, false).f15382l));
                if (A3 != null) {
                    C1407p c1407p = (C1407p) c0709Wb.f12040l;
                    c1407p.getClass();
                    C1649uH c1649uH2 = new C1649uH(c1407p);
                    c1649uH2.f15846j = A3.b(((C1407p) c0709Wb.f12040l).f14902k);
                    c0709Wb.f12040l = new C1407p(c1649uH2);
                }
            }
        }
        return true;
    }
}
