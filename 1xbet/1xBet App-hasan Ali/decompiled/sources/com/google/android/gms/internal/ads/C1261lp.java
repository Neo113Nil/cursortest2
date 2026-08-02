package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261lp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final double f14430a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14431b;

    public C1261lp(double d5, boolean z3) {
        this.f14430a = d5;
        this.f14431b = z3;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        Bundle e3 = AbstractC1803xs.e("device", bundle);
        bundle.putBundle("device", e3);
        Bundle e5 = AbstractC1803xs.e("battery", e3);
        e3.putBundle("battery", e5);
        e5.putBoolean("is_charging", this.f14431b);
        e5.putDouble("battery_level", this.f14430a);
    }
}
