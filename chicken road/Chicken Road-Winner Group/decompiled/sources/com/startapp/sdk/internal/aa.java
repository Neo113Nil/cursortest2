package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class aa extends com.startapp.sdk.adsbase.c {

    /* renamed from: k, reason: collision with root package name */
    public final z9 f3452k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Context context, AdPreferences preferences, AdPreferences.Placement placement, ib httpClient, ib networkApiExecutor, ib eventTracer, ib motionProcessor, z9 builder) {
        super(context, null, preferences, null, placement, httpClient, networkApiExecutor, eventTracer, motionProcessor);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(preferences, "preferences");
        kotlin.jvm.internal.j.e(placement, "placement");
        kotlin.jvm.internal.j.e(httpClient, "httpClient");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(motionProcessor, "motionProcessor");
        kotlin.jvm.internal.j.e(builder, "builder");
        this.f3452k = builder;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        return true;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        c9 c9Var = new c9();
        z9 z9Var = this.f3452k;
        c9Var.W0 = z9Var.f4786b;
        c9Var.f3532X0 = z9Var.f4787c;
        AdUnitConfig adUnitConfig = z9Var.f4788d;
        c9Var.f3533Y0 = adUnitConfig != null ? adUnitConfig.getBp() : null;
        z9 z9Var2 = this.f3452k;
        c9Var.f3534Z0 = z9Var2.f4789e;
        c9Var.f3531V0 = z9Var2.f4785a;
        c9Var.f3536b1 = z9Var2.f4790g;
        c9Var.f3535a1 = z9Var2.f4791h.intValue();
        c9Var.f3537c1 = this.f3452k.f4792i;
        com.startapp.sdk.adsbase.model.a a3 = a((com.startapp.sdk.adsbase.model.a) c9Var);
        if (a3 != null) {
            a3.g(this.f3185a);
            Point point = this.f3452k.f;
            a3.L = point != null ? point.x : a3.L;
            a3.f4663M = point != null ? point.y : a3.f4663M;
        }
        return a3;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a c3 = c();
        if (c3 == null) {
            return null;
        }
        n8 n8Var = new n8((o8) this.f3190g.a(), c3.a(h0.a(AdsConstants$AdApiType.HTML, this.f3189e)));
        n8Var.f4098e = new F1.b(18, this);
        return n8Var.a();
    }

    public static final Void a(aa this$0, Throwable th) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        this$0.f = th != null ? th.getMessage() : null;
        return null;
    }
}
