package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.Te;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j4 implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f4819a;
    public final ag b;
    public final h7 c;
    public final EndpointRepository d;
    public final sg e;
    public k4 f;

    public j4(e3 networkService, ag requestBodyBuilder, h7 eventTracker, EndpointRepository endpointRepository, sg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f4819a = networkService;
        this.b = requestBodyBuilder;
        this.c = eventTracker;
        this.d = endpointRepository;
        this.e = session;
    }

    public final void a(k4 k4Var, h4 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f = k4Var;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.CLICK);
        String a2 = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        g3 g3Var = new g3(a2, path, this.b.build(), ue.e, this, this.c, this.e);
        g3Var.s = true;
        a(g3Var, params);
        this.f4819a.a(g3Var);
    }

    public final void a(g3 g3Var, h4 h4Var) {
        g3Var.a("ad_id", h4Var.a());
        g3Var.a("to", h4Var.g());
        g3Var.a("cgn", h4Var.b());
        g3Var.a("creative", h4Var.c());
        g3Var.a(FirebaseAnalytics.Param.LOCATION, h4Var.e());
        if (h4Var.d() == fa.f) {
            g3Var.a("creative", "");
        } else if (h4Var.i() != null && h4Var.h() != null) {
            float f = 1000;
            g3Var.a("total_time", Float.valueOf(h4Var.h().floatValue() / f));
            g3Var.a("playback_time", Float.valueOf(h4Var.i().floatValue() / f));
            mb.a("TotalDuration: " + h4Var.h() + " PlaybackTime: " + h4Var.i(), (Throwable) null, 2, (Object) null);
        }
        Boolean f2 = h4Var.f();
        if (f2 != null) {
            g3Var.a("retarget_reinstall", f2);
        }
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, JSONObject jSONObject) {
        JSONObject a2 = x2.a(jSONObject, Te.n);
        k4 k4Var = this.f;
        if (k4Var != null) {
            k4Var.a(a2);
        }
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, CBError cBError) {
        String str;
        if (cBError == null || (str = cBError.getMessage()) == null) {
            str = "Click failure";
        }
        k4 k4Var = this.f;
        if (k4Var != null) {
            k4Var.a(str);
        }
    }
}
