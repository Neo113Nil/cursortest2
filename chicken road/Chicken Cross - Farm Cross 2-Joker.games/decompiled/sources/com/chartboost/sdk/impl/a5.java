package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4665u;
import com.ironsource.Te;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a5 implements g3.a {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f4673a;
    public final ag b;
    public final h7 c;
    public final EndpointRepository d;
    public final sg e;
    public b5 f;

    public a5(e3 networkService, ag requestBodyBuilder, h7 eventTracker, EndpointRepository endpointRepository, sg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f4673a = networkService;
        this.b = requestBodyBuilder;
        this.c = eventTracker;
        this.d = endpointRepository;
        this.e = session;
    }

    public final void a(b5 b5Var, z4 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f = b5Var;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.VIDEO_COMPLETE);
        String a2 = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        g3 g3Var = new g3(a2, path, this.b.build(), ue.e, this, this.c, this.e);
        a(g3Var, params);
        this.f4673a.a(g3Var);
    }

    public final void a(g3 g3Var, z4 z4Var) {
        g3Var.a(FirebaseAnalytics.Param.LOCATION, z4Var.c());
        g3Var.a(C4665u.j, Integer.valueOf(z4Var.d()));
        g3Var.a("currency-name", z4Var.e());
        g3Var.a("ad_id", z4Var.a());
        g3Var.a("force_close", Boolean.FALSE);
        g3Var.a("cgn", z4Var.b());
        if (z4Var.g() == null || z4Var.f() == null) {
            return;
        }
        float f = 1000;
        g3Var.a("total_time", Float.valueOf(z4Var.f().floatValue() / f));
        g3Var.a("playback_time", Float.valueOf(z4Var.g().floatValue() / f));
        mb.a("TotalDuration: " + z4Var.f() + " PlaybackTime: " + z4Var.g(), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, JSONObject jSONObject) {
        JSONObject a2 = x2.a(jSONObject, Te.n);
        b5 b5Var = this.f;
        if (b5Var != null) {
            b5Var.a(a2);
        }
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, CBError cBError) {
        String str;
        if (cBError == null || (str = cBError.getMessage()) == null) {
            str = "Click failure";
        }
        b5 b5Var = this.f;
        if (b5Var != null) {
            b5Var.a(str);
        }
    }
}
