package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p9 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final k8 f4957a;
    public final v6 b;
    public final yi c;
    public final va d;
    public final c0 e;
    public final e3 f;
    public final ag g;
    public final Mediation h;
    public final ae i;
    public final ig j;
    public final zd k;
    public final Function2 l;
    public final i7 m;
    public final EndpointRepository n;
    public final sg o;

    public p9(k8 fileCache, v6 downloader, yi urlResolver, va intentResolver, c0 adType, e3 networkService, ag requestBodyBuilder, Mediation mediation, ae measurementManager, ig sdkBiddingTemplateParser, zd openMeasurementImpressionCallback, Function2 impressionFactory, i7 eventTracker, EndpointRepository endpointRepository, sg session) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(measurementManager, "measurementManager");
        Intrinsics.checkNotNullParameter(sdkBiddingTemplateParser, "sdkBiddingTemplateParser");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionFactory, "impressionFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f4957a = fileCache;
        this.b = downloader;
        this.c = urlResolver;
        this.d = intentResolver;
        this.e = adType;
        this.f = networkService;
        this.g = requestBodyBuilder;
        this.h = mediation;
        this.i = measurementManager;
        this.j = sdkBiddingTemplateParser;
        this.k = openMeasurementImpressionCallback;
        this.l = impressionFactory;
        this.m = eventTracker;
        this.n = endpointRepository;
        this.o = session;
    }

    public final ca a(p1 appRequest, r0 callback, ViewGroup viewGroup, ea impressionIntermediateCallback, r9 impressionClickCallback, ja viewProtocolBuilder, da impressionInterface, ml webViewTimeoutInterface, id nativeBridgeCommand, oh templateLoader) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        try {
            File a2 = this.f4957a.a().a();
            d0 a3 = appRequest.a();
            String d = appRequest.d();
            if (a3 == null) {
                return new ca(null, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            Intrinsics.checkNotNull(a2);
            CBError.Impression a4 = a(a3, a2, d);
            if (a4 != null) {
                return new ca(null, a4);
            }
            String a5 = a(templateLoader, a3, a2, d);
            return a5 == null ? new ca(null, CBError.Impression.ERROR_LOADING_WEB_VIEW) : new ca(a(appRequest, a3, d, this.i.a(a5), callback, viewGroup, impressionIntermediateCallback, impressionClickCallback, viewProtocolBuilder, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand), null);
        } catch (Exception e) {
            mb.b("showReady exception:", e);
            return new ca(null, CBError.Impression.INTERNAL);
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.m.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.m.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.m.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.m.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.m.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.m.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.m.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.m.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.m.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.m.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.m.mo4759track(event);
    }

    public final w2 a(p1 p1Var, d0 d0Var, String str, String str2, r0 r0Var, ViewGroup viewGroup, ea eaVar, r9 r9Var, ja jaVar, da daVar, ml mlVar, id idVar) {
        fa a2 = a(d0Var.p(), this.e);
        j4 j4Var = new j4(this.f, this.g, this.m, this.n, this.o);
        a5 a5Var = new a5(this.f, this.g, this.m, this.n, this.o);
        m3 a3 = jaVar.a(str, d0Var, this.e.b(), str2, r0Var, daVar, mlVar, idVar);
        return (w2) this.l.invoke(new y9(this.c, this.d, j4Var, yh.a(this.e.b(), str, this.h, this.m), a5Var, a2, this.k, p1Var, this.b, a3, new x9(0, 0, 0, 0, 15, null), d0Var, this.e, str, eaVar, r9Var, r0Var, this.m), viewGroup);
    }

    public final fa a(String str, c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return a(str);
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return fa.e;
        }
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return fa.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final fa a(String str) {
        if (Intrinsics.areEqual(str, "video")) {
            return fa.d;
        }
        return fa.c;
    }

    public final CBError.Impression a(d0 d0Var, File file, String str) {
        Map d = d0Var.d();
        if (d.isEmpty()) {
            return null;
        }
        for (t1 t1Var : d.values()) {
            File a2 = t1Var.a(file);
            if (a2 == null || !a2.exists()) {
                mb.b("Asset does not exist: " + t1Var.b, (Throwable) null, 2, (Object) null);
                String str2 = t1Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                a(str, str2);
                return CBError.Impression.ASSET_MISSING;
            }
        }
        return null;
    }

    public final String a(oh ohVar, d0 d0Var, File file, String str) {
        t1 f = d0Var.f();
        String a2 = f.a();
        if (a2 != null && a2.length() != 0) {
            File a3 = f.a(file);
            HashMap hashMap = new HashMap(d0Var.s());
            if (d0Var.z().length() > 0 && d0Var.c().length() > 0) {
                ig igVar = this.j;
                Intrinsics.checkNotNull(a3);
                String a4 = igVar.a(a3, d0Var.z(), d0Var.c());
                if (a4 != null) {
                    return a4;
                }
            }
            if (d0Var.C().length() == 0 || d0Var.B().length() == 0) {
                hashMap.put("{% native_video_player %}", "false");
            } else {
                hashMap.put("{% native_video_player %}", "true");
            }
            for (Map.Entry entry : d0Var.d().entrySet()) {
                hashMap.put(entry.getKey(), ((t1) entry.getValue()).b);
            }
            Intrinsics.checkNotNull(a3);
            return ohVar.a(a3, hashMap, this.e.b(), str);
        }
        mb.b("AdUnit does not have a template body", (Throwable) null, 2, (Object) null);
        return null;
    }

    public final void a(String str, String str2) {
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(g.i.f, str2, this.e.b(), str, this.h, null, 32, null));
    }
}
