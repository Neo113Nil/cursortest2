package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ZG extends AbstractC1022gH implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final int f12479o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12480p;

    public ZG(int i, C1292mb c1292mb, int i5, C0843cH c0843cH, int i6) {
        super(i, c1292mb, i5);
        int i7;
        this.f12479o = AbstractC1400ot.p(i6, c0843cH.f12993q) ? 1 : 0;
        C1407p c1407p = this.f13586n;
        int i8 = c1407p.f14911t;
        int i9 = -1;
        if (i8 != -1 && (i7 = c1407p.f14912u) != -1) {
            i9 = i8 * i7;
        }
        this.f12480p = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final int a() {
        return this.f12479o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1022gH abstractC1022gH) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12480p, ((ZG) obj).f12480p);
    }
}
