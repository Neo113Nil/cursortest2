package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s0 implements g3.a, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f5003a;
    public final ag b;
    public final i7 c;
    public final sg d;
    public yg e;

    public s0(e3 networkService, ag requestBodyBuilder, i7 eventTracker, sg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f5003a = networkService;
        this.b = requestBodyBuilder;
        this.c = eventTracker;
        this.d = session;
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, JSONObject jSONObject) {
    }

    public final void a(URL url, yg showParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        this.e = showParams;
        String a2 = com.chartboost.sdk.internal.Networking.b.a(url);
        String path = url.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        g3 g3Var = new g3(a2, path, this.b.build(), ue.e, this, this.c, this.d);
        g3Var.i = a3.b.c;
        a(g3Var, showParams);
        this.f5003a.a(g3Var);
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.c.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.c.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.c.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.c.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.c.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.c.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.c.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.c.mo4759track(event);
    }

    public final void a(g3 g3Var, yg ygVar) {
        g3Var.a("cached", "0");
        g3Var.a(FirebaseAnalytics.Param.LOCATION, ygVar.c());
        int e = ygVar.e();
        if (e >= 0) {
            g3Var.a("video_cached", Integer.valueOf(e));
        }
        String a2 = ygVar.a();
        if (a2 == null || a2.length() == 0) {
            return;
        }
        g3Var.a("ad_id", a2);
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, CBError cBError) {
        String str;
        g.i iVar = g.i.m;
        if (cBError == null || (str = cBError.getMessage()) == null) {
            str = "Show failure";
        }
        String str2 = str;
        yg ygVar = this.e;
        yg ygVar2 = null;
        if (ygVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            ygVar = null;
        }
        String b = ygVar.b();
        yg ygVar3 = this.e;
        if (ygVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            ygVar3 = null;
        }
        String c = ygVar3.c();
        yg ygVar4 = this.e;
        if (ygVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
        } else {
            ygVar2 = ygVar4;
        }
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(iVar, str2, b, c, ygVar2.d()));
    }
}
