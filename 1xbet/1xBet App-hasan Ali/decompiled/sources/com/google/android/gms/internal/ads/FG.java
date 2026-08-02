package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class FG implements NG {

    /* renamed from: a, reason: collision with root package name */
    public final int f8949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HG f8950b;

    public FG(HG hg, int i) {
        this.f8950b = hg;
        this.f8949a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r8 == (-1)) goto L28;
     */
    @Override // com.google.android.gms.internal.ads.NG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j5) {
        int i;
        HG hg = this.f8950b;
        int i5 = this.f8949a;
        if (hg.B()) {
            return 0;
        }
        hg.u(i5);
        MG mg = hg.f9358A[i5];
        boolean z3 = hg.f9376U;
        synchronized (mg) {
            int i6 = mg.f10626q;
            int i7 = mg.i(i6);
            int i8 = mg.f10626q;
            int i9 = mg.f10623n;
            if ((i8 != i9) && j5 >= mg.f10621l[i7]) {
                i = (j5 <= mg.f10629t || !z3) ? mg.h(i7, i9 - i6, j5, true) : i9 - i6;
            }
            i = 0;
        }
        mg.q(i);
        if (i != 0) {
            return i;
        }
        hg.y(i5);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final boolean b() {
        HG hg = this.f8950b;
        return !hg.B() && hg.f9358A[this.f8949a].r(hg.f9376U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r0 != 0) goto L74;
     */
    @Override // com.google.android.gms.internal.ads.NG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(C1667ur c1667ur, OD od, int i) {
        int i5;
        boolean z3;
        int i6;
        HG hg = this.f8950b;
        int i7 = this.f8949a;
        if (hg.B()) {
            return -3;
        }
        hg.u(i7);
        MG mg = hg.f9358A[i7];
        boolean z5 = hg.f9376U;
        mg.getClass();
        boolean z6 = (i & 2) != 0;
        Q1 q12 = mg.f10613b;
        synchronized (mg) {
            try {
                od.f = false;
                int i8 = mg.f10626q;
                i5 = -4;
                if (i8 != mg.f10623n) {
                    C1407p c1407p = ((LG) mg.f10614c.b(mg.f10624o + i8)).f10333a;
                    if (!z6 && c1407p == mg.f) {
                        int i9 = mg.i(mg.f10626q);
                        if (mg.f10611A != null) {
                            int i10 = mg.f10620k[i9];
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            int i11 = mg.f10620k[i9];
                            od.f15911b = i11;
                            if (mg.f10626q == mg.f10623n - 1 && (z5 || mg.f10630u)) {
                                od.f15911b = 536870912 | i11;
                            }
                            od.f10939g = mg.f10621l[i9];
                            q12.f11146l = mg.f10619j[i9];
                            q12.f11147m = mg.i[i9];
                            q12.f11148n = mg.f10622m[i9];
                            i6 = -4;
                        } else {
                            od.f = true;
                            i6 = -3;
                        }
                    }
                    mg.k(c1407p, c1667ur);
                    i6 = -5;
                } else {
                    if (!z5 && !mg.f10630u) {
                        C1407p c1407p2 = mg.f10633x;
                        if (c1407p2 == null || (!z6 && c1407p2 == mg.f)) {
                            i6 = -3;
                        }
                        mg.k(c1407p2, c1667ur);
                        i6 = -5;
                    }
                    od.f15911b = 4;
                    od.f10939g = Long.MIN_VALUE;
                    i6 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i6 != -4) {
            i5 = i6;
        } else if (!od.a(4)) {
            int i12 = i & 1;
            if ((i & 4) == 0) {
                if (i12 != 0) {
                    KG kg = mg.f10612a;
                    KG.e(kg.f10148c, od, mg.f10613b, kg.f10146a);
                } else {
                    KG kg2 = mg.f10612a;
                    kg2.f10148c = KG.e(kg2.f10148c, od, mg.f10613b, kg2.f10146a);
                    mg.f10626q++;
                }
            }
        }
        if (i5 == -3) {
            hg.y(i7);
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void j() {
        IOException iOException;
        HG hg = this.f8950b;
        Dp dp = hg.f9358A[this.f8949a].f10611A;
        if (dp != null) {
            throw ((C1782xF) dp.f8377l);
        }
        int i = hg.K == 7 ? 6 : 3;
        C0905dr c0905dr = hg.f9387s;
        IOException iOException2 = (IOException) c0905dr.f13188n;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1559sH handlerC1559sH = (HandlerC1559sH) c0905dr.f13187m;
        if (handlerC1559sH != null && (iOException = handlerC1559sH.f15481m) != null && handlerC1559sH.f15482n > i) {
            throw iOException;
        }
    }
}
