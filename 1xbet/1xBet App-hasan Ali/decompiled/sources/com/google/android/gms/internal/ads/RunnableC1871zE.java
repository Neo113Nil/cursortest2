package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.zE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1871zE implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16573k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AE f16574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Pair f16575m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1199kG f16576n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1469qG f16577o;

    public /* synthetic */ RunnableC1871zE(AE ae, Pair pair, C1199kG c1199kG, C1469qG c1469qG, int i) {
        this.f16573k = i;
        this.f16574l = ae;
        this.f16575m = pair;
        this.f16576n = c1199kG;
        this.f16577o = c1469qG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16573k) {
            case 0:
                SE se = (SE) this.f16574l.f7554b.f14152s;
                Pair pair = this.f16575m;
                se.b(((Integer) pair.first).intValue(), (C1603tG) pair.second, this.f16576n, this.f16577o);
                break;
            case 1:
                SE se2 = (SE) this.f16574l.f7554b.f14152s;
                Pair pair2 = this.f16575m;
                se2.a(((Integer) pair2.first).intValue(), (C1603tG) pair2.second, this.f16576n, this.f16577o);
                break;
            default:
                SE se3 = (SE) this.f16574l.f7554b.f14152s;
                Pair pair3 = this.f16575m;
                se3.c(((Integer) pair3.first).intValue(), (C1603tG) pair3.second, this.f16576n, this.f16577o);
                break;
        }
    }
}
