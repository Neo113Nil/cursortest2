package com.google.android.gms.internal.ads;

import Q2.InterfaceC0392x;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435pj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15019a;

    /* renamed from: b, reason: collision with root package name */
    public final C1390oj f15020b;

    public /* synthetic */ C1435pj(C1390oj c1390oj, int i) {
        this.f15019a = i;
        this.f15020b = c1390oj;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15019a) {
            case 0:
                return (InterfaceC0392x) this.f15020b.f14828m;
            case 1:
                return this.f15020b;
            default:
                Kj kj = (Kj) this.f15020b.f14827l;
                AbstractC1400ot.D(kj);
                return kj;
        }
    }
}
