package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754aH implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12655k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12656l;

    public C0754aH(C1407p c1407p, int i) {
        this.f12655k = 1 == (c1407p.f14898e & 1);
        this.f12656l = AbstractC1400ot.p(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0754aH c0754aH = (C0754aH) obj;
        return Zu.f12539a.d(this.f12656l, c0754aH.f12656l).d(this.f12655k, c0754aH.f12655k).a();
    }
}
