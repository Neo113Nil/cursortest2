package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.Mediation;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bg implements ag {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4695a;
    public final u2 b;
    public final f3 c;
    public final AtomicReference d;
    public final SharedPreferences e;
    public final ph f;
    public final v3 g;
    public final sg h;
    public final ve i;
    public final Mediation j;
    public final h6 k;

    public bg(Context context, u2 identity, f3 reachability, AtomicReference sdkConfig, SharedPreferences sharedPreferences, ph timeSource, v3 carrierBuilder, sg session, ve privacyApi, Mediation mediation, h6 deviceBodyFieldsFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(carrierBuilder, "carrierBuilder");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(deviceBodyFieldsFactory, "deviceBodyFieldsFactory");
        this.f4695a = context;
        this.b = identity;
        this.c = reachability;
        this.d = sdkConfig;
        this.e = sharedPreferences;
        this.f = timeSource;
        this.g = carrierBuilder;
        this.h = session;
        this.i = privacyApi;
        this.j = mediation;
        this.k = deviceBodyFieldsFactory;
    }

    @Override // com.chartboost.sdk.impl.ag
    public cg build() {
        d4 d4Var = d4.b;
        String b = d4Var.b();
        String c = d4Var.c();
        i9 k = this.b.k();
        kf reachabilityBodyFields = g8.toReachabilityBodyFields(this.c);
        u3 a2 = this.g.a(this.f4695a);
        tg i = this.h.i();
        qh bodyFields = g8.toBodyFields(this.f);
        we g = this.i.g();
        f5 n = ((com.chartboost.sdk.internal.Model.a) this.d.get()).n();
        g6 b2 = this.k.b();
        Mediation mediation = this.j;
        return new cg(b, c, k, reachabilityBodyFields, a2, i, bodyFields, g, n, b2, mediation != null ? mediation.toMediationBodyFields() : null);
    }
}
