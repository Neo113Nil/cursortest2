package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053h3 implements InterfaceC1008g3 {

    /* renamed from: a, reason: collision with root package name */
    public final HG f13703a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0737a0 f13704b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.h f13705c;

    /* renamed from: d, reason: collision with root package name */
    public final C1407p f13706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13707e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public int f13708g;

    /* renamed from: h, reason: collision with root package name */
    public long f13709h;

    public C1053h3(HG hg, InterfaceC0737a0 interfaceC0737a0, P0.h hVar, String str, int i) {
        this.f13703a = hg;
        this.f13704b = interfaceC0737a0;
        this.f13705c = hVar;
        int i5 = hVar.f4654o;
        int i6 = hVar.f4651l;
        int i7 = (i5 * i6) / 8;
        int i8 = hVar.f4653n;
        if (i8 != i7) {
            throw B7.a(null, "Expected block size: " + i7 + "; got: " + i8);
        }
        int i9 = hVar.f4652m;
        int i10 = i9 * i7;
        int i11 = i10 * 8;
        int max = Math.max(i7, i10 / 10);
        this.f13707e = max;
        C1649uH c1649uH = new C1649uH();
        c1649uH.c(str);
        c1649uH.f15844g = i11;
        c1649uH.f15845h = i11;
        c1649uH.f15849m = max;
        c1649uH.f15831A = i6;
        c1649uH.f15832B = i9;
        c1649uH.f15833C = i;
        this.f13706d = new C1407p(c1649uH);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1008g3
    public final void a(long j5) {
        this.f = j5;
        this.f13708g = 0;
        this.f13709h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1008g3
    public final void b(int i, long j5) {
        this.f13703a.x(new C1186k3(this.f13705c, 1, i, j5));
        this.f13704b.e(this.f13706d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1008g3
    public final boolean c(B b3, long j5) {
        int i;
        int i5;
        long j6 = j5;
        while (j6 > 0 && (i = this.f13708g) < (i5 = this.f13707e)) {
            int b5 = this.f13704b.b(b3, (int) Math.min(i5 - i, j6), true);
            if (b5 == -1) {
                j6 = 0;
            } else {
                this.f13708g += b5;
                j6 -= b5;
            }
        }
        int i6 = this.f13708g;
        int i7 = this.f13705c.f4653n;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long u5 = this.f + AbstractC1260lo.u(this.f13709h, 1000000L, r2.f4652m, RoundingMode.DOWN);
            int i9 = i8 * i7;
            int i10 = this.f13708g - i9;
            this.f13704b.d(u5, 1, i9, i10, null);
            this.f13709h += i8;
            this.f13708g = i10;
        }
        return j6 <= 0;
    }
}
