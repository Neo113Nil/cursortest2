package com.chartboost.sdk.impl;

import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4818a;

    public j3(i7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4818a = eventTracker;
    }

    public final void a(n3 n3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(jd.Q.c(), n3Var, location, adTypeName);
    }

    public final void b(n3 n3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(jd.R.c(), n3Var, location, adTypeName);
    }

    public final void c(n3 n3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(jd.N.c(), n3Var, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4818a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4818a.clearFromStorage(fVar);
    }

    public final void d(n3 n3Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        b(jd.O.c(), n3Var, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4818a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4818a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4818a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4818a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4818a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4818a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4818a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4818a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4818a.mo4759track(event);
    }

    public final void a(n3 n3Var, float f, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f));
        String c = jd.P.c();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        a(c, jSONObject2, n3Var, location, adTypeName);
    }

    public final void b(n3 n3Var, float f, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f));
        String c = jd.M.c();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        a(c, jSONObject2, n3Var, location, adTypeName);
    }

    public final void a(String str, String str2, n3 n3Var, String str3, String str4) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", " + str2 + ")", n3Var, str3, str4);
    }

    public final void b(String str, n3 n3Var, String str2, String str3) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\")", n3Var, str2, str3);
    }

    public final void a(String str, n3 n3Var, String str2, String str3) {
        try {
            if (n3Var == null) {
                track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(g.i.j, "Webview is null", str3, str2, null, null, 48, null));
                mb.b("Calling native to javascript webview is null", (Throwable) null, 2, (Object) null);
            } else {
                mb.a("Calling native to javascript: " + str, (Throwable) null, 2, (Object) null);
                n3Var.loadUrl(str);
            }
        } catch (Exception e) {
            track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(g.i.k, "Cannot open url: " + e, str3, str2, null, null, 48, null));
            mb.b("Calling native to javascript. Cannot open url", e);
        }
    }
}
