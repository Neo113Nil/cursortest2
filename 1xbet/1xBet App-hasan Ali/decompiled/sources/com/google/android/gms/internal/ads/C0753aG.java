package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753aG implements NG {

    /* renamed from: a, reason: collision with root package name */
    public final NG f12652a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0798bG f12654c;

    public C0753aG(C0798bG c0798bG, NG ng) {
        this.f12654c = c0798bG;
        this.f12652a = ng;
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final int a(long j5) {
        if (this.f12654c.o()) {
            return -3;
        }
        return this.f12652a.a(j5);
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final boolean b() {
        return !this.f12654c.o() && this.f12652a.b();
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final int c(C1667ur c1667ur, OD od, int i) {
        C0798bG c0798bG = this.f12654c;
        if (c0798bG.o()) {
            return -3;
        }
        if (this.f12653b) {
            od.f15911b = 4;
            return -4;
        }
        long d5 = c0798bG.d();
        int c5 = this.f12652a.c(c1667ur, od, i);
        if (c5 != -5) {
            long j5 = c0798bG.f12800o;
            if (j5 == Long.MIN_VALUE || ((c5 != -4 || od.f10939g < j5) && !(c5 == -3 && d5 == Long.MIN_VALUE && !od.f))) {
                return c5;
            }
            od.d();
            od.f15911b = 4;
            this.f12653b = true;
            return -4;
        }
        C1407p c1407p = (C1407p) c1667ur.f15914l;
        c1407p.getClass();
        int i5 = c1407p.f14890F;
        int i6 = c1407p.f14889E;
        if (i6 == 0) {
            if (i5 == 0) {
                return -5;
            }
            i6 = 0;
        }
        int i7 = c0798bG.f12800o == Long.MIN_VALUE ? i5 : 0;
        C1649uH c1649uH = new C1649uH(c1407p);
        c1649uH.f15834D = i6;
        c1649uH.f15835E = i7;
        c1667ur.f15914l = new C1407p(c1649uH);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void j() {
        this.f12652a.j();
    }
}
