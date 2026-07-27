package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.impl.w;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Model.EndpointConfig;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.net.URL;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class x implements w, g3.a, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f5064a;
    public final k8 b;
    public final ag c;
    public final e3 d;
    public final m0 e;
    public final ee f;
    public final ae g;
    public final i7 h;
    public final EndpointRepository i;
    public final q1 j;
    public cg k;
    public hb l;
    public Function1 m;

    public x(c0 adTraits, k8 fileCache, ag requestBodyBuilder, e3 networkService, m0 adUnitParser, ee openRTBAdUnitParser, ae openMeasurementManager, i7 eventTracker, EndpointRepository endpointRepository, q1 applicationComponent) {
        Intrinsics.checkNotNullParameter(adTraits, "adTraits");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(adUnitParser, "adUnitParser");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f5064a = adTraits;
        this.b = fileCache;
        this.c = requestBodyBuilder;
        this.d = networkService;
        this.e = adUnitParser;
        this.f = openRTBAdUnitParser;
        this.g = openMeasurementManager;
        this.h = eventTracker;
        this.i = endpointRepository;
        this.j = applicationComponent;
    }

    public String a(JSONObject jSONObject, String str, String str2) {
        return w.a.a(this, jSONObject, str, str2);
    }

    public final boolean b(c0 c0Var, boolean z, EndpointConfig endpointConfig) {
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return true;
        }
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return z && !b(endpointConfig.getInterstitial());
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return z && !b(endpointConfig.getRewarded());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.h.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.h.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.h.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.h.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.h.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.h.track(fVar);
    }

    public final boolean a(c0 c0Var, boolean z, EndpointConfig endpointConfig) {
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return z && !b(endpointConfig.getBanner());
        }
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return z && !b(endpointConfig.getInterstitial());
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return z && !b(endpointConfig.getRewarded());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.h.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.h.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.mo4759track(event);
    }

    @Override // com.chartboost.sdk.impl.w
    public void a(hb params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.l = params;
        this.m = callback;
        this.k = this.c.build();
        String d = params.a().d();
        Integer b = params.b();
        int intValue = b != null ? b.intValue() : 0;
        Integer c = params.c();
        int intValue2 = c != null ? c.intValue() : 0;
        boolean e = params.e();
        cg cgVar = this.k;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
            cgVar = null;
        }
        g3 a2 = a(d, intValue, intValue2, e, cgVar, this, this.g, this.j.h());
        if (a2 == null) {
            callback.invoke(new ib(params.a(), null, new CBError(CBError.Impression.END_POINT_DISABLED, this.f5064a.b() + " endpoint is explicitly disabled by server configuration"), 0L, 0L, 26, null));
        } else {
            a2.i = a3.b.c;
            this.d.a(a2);
        }
    }

    public final boolean b(String str) {
        return Intrinsics.areEqual(str, "");
    }

    public /* synthetic */ x(c0 c0Var, k8 k8Var, ag agVar, e3 e3Var, m0 m0Var, ee eeVar, ae aeVar, i7 i7Var, EndpointRepository endpointRepository, q1 q1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, k8Var, agVar, e3Var, m0Var, eeVar, aeVar, i7Var, endpointRepository, (i & 512) != 0 ? b4.b.b() : q1Var);
    }

    public final d0 a(cg cgVar, JSONObject jSONObject, String str) {
        try {
            f5 a2 = cgVar.a();
            if (b(this.f5064a, a2.b(), a2.c())) {
                return this.f.a(this.f5064a, jSONObject);
            }
            if (a2.d()) {
                return this.e.a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            g.a aVar = g.a.g;
            JSONObject jSONObject2 = new JSONObject();
            String message = e.getMessage();
            if (message == null) {
                message = "no message";
            }
            String jSONObject3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
            track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(aVar, a(jSONObject2, message, jSONObject3), this.f5064a.b(), str, null, null, 48, null));
            return null;
        }
    }

    public final g3 a(String str, int i, int i2, boolean z, cg cgVar, g3.a aVar, ae aeVar, sg sgVar) {
        int d;
        String rewarded;
        c0 c0Var = this.f5064a;
        c0.c cVar = c0.c.g;
        if (Intrinsics.areEqual(c0Var, cVar)) {
            d = cgVar.h().e();
        } else {
            d = Intrinsics.areEqual(c0Var, c0.b.g) ? cgVar.h().d() : cgVar.h().a();
        }
        int i3 = d;
        f5 a2 = cgVar.a();
        boolean b = b(this.f5064a, a2.b(), a2.c());
        if (a2.b()) {
            c0 c0Var2 = this.f5064a;
            c0.a aVar2 = c0.a.g;
            if (Intrinsics.areEqual(c0Var2, aVar2)) {
                rewarded = a2.c().getBanner();
            } else if (Intrinsics.areEqual(c0Var2, c0.b.g)) {
                rewarded = a2.c().getInterstitial();
            } else {
                if (!Intrinsics.areEqual(c0Var2, cVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                rewarded = a2.c().getRewarded();
            }
            if (b(rewarded)) {
                if (Intrinsics.areEqual(this.f5064a, aVar2) || !a2.d()) {
                    mb.a(this.f5064a.b() + " endpoint explicitly disabled, failing load", (Throwable) null, 2, (Object) null);
                    return null;
                }
                mb.a(this.f5064a.b() + " NRP endpoint explicitly disabled, falling back to WebView", (Throwable) null, 2, (Object) null);
                return a(aVar, str, i3, z, cgVar, aeVar, sgVar);
            }
        }
        if (b) {
            return a(aVar, i, i2, str, i3, cgVar, aeVar, sgVar);
        }
        return a(aVar, str, i3, z, cgVar, aeVar, sgVar);
    }

    public final o3 a(g3.a aVar, String str, int i, boolean z, cg cgVar, ae aeVar, sg sgVar) {
        Partner c;
        URL endPointUrl = this.i.getEndPointUrl(this.f5064a.a());
        a3.c cVar = a3.c.c;
        String a2 = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        o3 o3Var = new o3(cVar, a2, path, cgVar, ue.e, null, aVar, this.h, sgVar);
        JSONObject e = this.b.e();
        Intrinsics.checkNotNullExpressionValue(e, "getWebViewCacheAssets(...)");
        o3Var.b("cache_assets", e);
        o3Var.b(FirebaseAnalytics.Param.LOCATION, str);
        o3Var.b("imp_depth", Integer.valueOf(i));
        if (aeVar.g() && (c = aeVar.c()) != null) {
            o3Var.c("omidpn", c.getName());
            o3Var.c("omidpv", c.getVersion());
        }
        o3Var.b("cache", Boolean.valueOf(z));
        o3Var.s = true;
        return o3Var;
    }

    public final fe a(g3.a aVar, int i, int i2, String str, int i3, cg cgVar, ae aeVar, sg sgVar) {
        f5 a2 = cgVar.a();
        Intrinsics.checkNotNullExpressionValue(a2, "getConfigurationFields(...)");
        URL a3 = a(a2);
        od odVar = new od(com.chartboost.sdk.internal.Networking.b.a(a3), a3.getPath(), cgVar, ue.e, aVar);
        b0 b0Var = new b0(this.f5064a, Integer.valueOf(i), Integer.valueOf(i2), str, i3);
        f5 a4 = cgVar.a();
        return new fe(odVar, b0Var, aeVar, this.h, sgVar, a(this.f5064a, a4.b(), a4.c()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r8.length() > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r8.length() > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r8.length() > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final URL a(f5 f5Var) {
        String rewarded;
        c0 c0Var = this.f5064a;
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            if (f5Var.b()) {
                rewarded = f5Var.c().getBanner();
                if (rewarded != null) {
                }
            }
            rewarded = null;
        } else if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            if (f5Var.b()) {
                rewarded = f5Var.c().getInterstitial();
                if (rewarded != null) {
                }
            }
            rewarded = null;
        } else if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            if (f5Var.b()) {
                rewarded = f5Var.c().getRewarded();
                if (rewarded != null) {
                }
            }
            rewarded = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (rewarded != null) {
            try {
                URL url = new URL(rewarded);
                mb.a("Using NRP waterfall endpoint for " + this.f5064a.b() + ": " + rewarded, (Throwable) null, 2, (Object) null);
                return url;
            } catch (Exception e) {
                mb.b("Invalid NRP waterfall endpoint URL for " + this.f5064a.b() + ": " + rewarded, e);
                URL endPointUrl = this.i.getEndPointUrl(this.f5064a.a());
                mb.a("Falling back to default endpoint for " + this.f5064a.b() + ": " + endPointUrl, (Throwable) null, 2, (Object) null);
                return endPointUrl;
            }
        }
        URL endPointUrl2 = this.i.getEndPointUrl(this.f5064a.a());
        mb.a("Using default endpoint for " + this.f5064a.b() + ": " + endPointUrl2, (Throwable) null, 2, (Object) null);
        return endPointUrl2;
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, JSONObject jSONObject) {
        if (g3Var != null && jSONObject != null) {
            cg cgVar = this.k;
            hb hbVar = null;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
                cgVar = null;
            }
            hb hbVar2 = this.l;
            if (hbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
                hbVar2 = null;
            }
            JSONObject a2 = hbVar2.d().a(jSONObject);
            hb hbVar3 = this.l;
            if (hbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            } else {
                hbVar = hbVar3;
            }
            d0 a3 = a(cgVar, a2, hbVar.a().d());
            if (a3 != null) {
                a(a3, g3Var);
                return;
            } else {
                a("Error parsing response");
                return;
            }
        }
        a("Unexpected response");
    }

    public final void a(d0 d0Var, g3 g3Var) {
        Function1 function1 = this.m;
        hb hbVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        hb hbVar2 = this.l;
        if (hbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            hbVar = hbVar2;
        }
        function1.invoke(new ib(hbVar.a(), d0Var, null, g3Var.h, g3Var.g));
    }

    public final void a(String str) {
        Function1 function1 = this.m;
        hb hbVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        hb hbVar2 = this.l;
        if (hbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            hbVar = hbVar2;
        }
        function1.invoke(new ib(hbVar.a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, str), 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.g3.a
    public void a(g3 g3Var, CBError cBError) {
        Function1 function1 = this.m;
        hb hbVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        hb hbVar2 = this.l;
        if (hbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            hbVar = hbVar2;
        }
        p1 a2 = hbVar.a();
        if (cBError == null) {
            cBError = new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response");
        }
        function1.invoke(new ib(a2, null, cBError, 0L, 0L, 26, null));
    }
}
