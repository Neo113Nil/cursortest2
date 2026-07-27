package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class x7 extends s1 {

    /* renamed from: q, reason: collision with root package name */
    public final int f4624q;

    public x7(Context context, q1 q1Var, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, int i3) {
        super(context, q1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, false);
        this.f4624q = i3;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        q1 q1Var = (q1) this.f3186b;
        e1 e1Var = new e1();
        a((com.startapp.sdk.adsbase.model.a) e1Var);
        e1Var.L = q1Var.f4032c;
        e1Var.f4663M = q1Var.f4033d;
        e1Var.E0 = this.f4624q;
        e1Var.f3276t0 = BannerMetaData.c().a().f();
        e1Var.f3608V0 = q1Var.f4239s;
        e1Var.W0 = q1Var.f4240t;
        e1Var.g(this.f3185a);
        return e1Var;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z3) {
        super.b(z3);
        e(z3);
    }
}
