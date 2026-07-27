package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class r2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f4282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f4284c;

    public r2(w2 w2Var, v2 v2Var, boolean z3) {
        this.f4284c = w2Var;
        this.f4282a = v2Var;
        this.f4283b = z3;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        w2 w2Var = this.f4284c;
        w2Var.f4567o = null;
        w2Var.a(null, this.f4283b);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        a0.b(this.f4284c.f4554a, this.f4282a, ad, true);
    }
}
