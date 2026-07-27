package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.impl.g7;
import com.chartboost.sdk.privacy.model.COPPA;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ng implements e5, mg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4897a;
    public final SharedPreferences b;
    public final oi c;
    public final ve d;
    public final AtomicReference e;
    public final te f;
    public final v6 g;
    public final sg h;
    public final ak i;
    public final Lazy j;
    public final ra k;
    public final qa l;
    public final f3 m;
    public final ef n;
    public final u2 o;
    public final ae p;
    public final kh q;
    public final e3 r;
    public final ScheduledExecutorService s;
    public boolean t;
    public boolean u;
    public final ConcurrentLinkedQueue v;
    public boolean w;
    public final AtomicBoolean x;

    public ng(Context context, SharedPreferences sharedPreferences, oi uiPoster, ve privacyApi, AtomicReference sdkConfig, te prefetcher, v6 downloader, sg session, ak videoCachePolicy, Lazy videoRepository, ra initInstallRequest, qa initConfigRequest, f3 reachability, ef providerInstallerHelper, u2 identity, ae openMeasurementManager, kh telemetryManager, e3 networkService, ScheduledExecutorService backgroundExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(initInstallRequest, "initInstallRequest");
        Intrinsics.checkNotNullParameter(initConfigRequest, "initConfigRequest");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(providerInstallerHelper, "providerInstallerHelper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f4897a = context;
        this.b = sharedPreferences;
        this.c = uiPoster;
        this.d = privacyApi;
        this.e = sdkConfig;
        this.f = prefetcher;
        this.g = downloader;
        this.h = session;
        this.i = videoCachePolicy;
        this.j = videoRepository;
        this.k = initInstallRequest;
        this.l = initConfigRequest;
        this.m = reachability;
        this.n = providerInstallerHelper;
        this.o = identity;
        this.p = openMeasurementManager;
        this.q = telemetryManager;
        this.r = networkService;
        this.s = backgroundExecutor;
        this.u = true;
        this.v = new ConcurrentLinkedQueue();
        session.a(this);
        this.x = new AtomicBoolean(false);
    }

    @Override // com.chartboost.sdk.impl.mg
    public boolean a() {
        return this.t;
    }

    public final StartError b(ChartboostError chartboostError) {
        return new StartError(chartboostError instanceof ChartboostError.Initialization.InvalidCredentials ? StartError.Code.INVALID_CREDENTIALS : ((chartboostError instanceof ChartboostError.Connectivity.NoInternet) || (chartboostError instanceof ChartboostError.Connectivity.NetworkError)) ? StartError.Code.NETWORK_FAILURE : chartboostError instanceof ChartboostError.Connectivity.ServerError ? StartError.Code.SERVER_ERROR : chartboostError instanceof ChartboostError.Initialization.Disabled ? StartError.Code.DISABLED : chartboostError instanceof ChartboostError.Initialization.NoContext ? StartError.Code.NO_CONTEXT : chartboostError instanceof ChartboostError.Initialization.InvalidConfiguration ? StartError.Code.INVALID_CONFIGURATION : chartboostError instanceof ChartboostError.Initialization.OsVersionNotSupported ? StartError.Code.OS_VERSION_NOT_SUPPORTED : chartboostError instanceof ChartboostError.Initialization.PermissionsNotSet ? StartError.Code.PERMISSIONS_NOT_SET : StartError.Code.INTERNAL, chartboostError);
    }

    public final void c() {
        if (this.d.a(COPPA.COPPA_STANDARD) != null || this.t) {
            return;
        }
        mb.e("COPPA is not set. If this app is child directed, please use ´addDataUseConsent(android.content.Context, com.chartboost.sdk.Privacy.model.COPPA)´ to set the correct value.", null, 2, null);
    }

    public final void d() {
        this.b.edit().remove("config").apply();
        a(ChartboostError.Initialization.Disabled.INSTANCE);
    }

    public final void e() {
        this.p.e();
        dj.f4736a.a(this.r);
        r();
        s();
        m();
        p();
        this.u = false;
    }

    public final boolean f() {
        String k = k();
        return k != null && k.length() > 0;
    }

    public final boolean g() {
        String k = k();
        if (k != null && k.length() != 0) {
            try {
                boolean a2 = o2.a(this.e, new JSONObject(k));
                if (!a2) {
                    mb.b("Cached config is invalid or has invalid schema", (Throwable) null, 2, (Object) null);
                }
                return a2;
            } catch (Exception e) {
                mb.b("Failed to parse cached config", e);
            }
        }
        return false;
    }

    public final void h() {
        if (this.e.get() == null || ((com.chartboost.sdk.internal.Model.a) this.e.get()).h() == null) {
            return;
        }
        String h = ((com.chartboost.sdk.internal.Model.a) this.e.get()).h();
        Intrinsics.checkNotNullExpressionValue(h, "getPublisherWarning(...)");
        mb.e(h, null, 2, null);
    }

    public final void i() {
        this.h.f();
        a((StartError) null);
        this.t = true;
        l();
    }

    public final void j() {
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.e.get();
        if (aVar != null && aVar.c) {
            d();
            return;
        }
        a((StartError) null);
        this.t = true;
        q();
        l();
    }

    public final String k() {
        return this.b.getString("config", "");
    }

    public final void l() {
        this.l.a(this);
    }

    public final void m() {
        h();
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.e.get();
        if (aVar != null) {
            this.d.a(aVar.C);
        }
        this.k.a();
        o();
    }

    public final void n() {
        if (jg.f4829a.d()) {
            String k = k();
            String str = JsonUtils.EMPTY_JSON;
            if (k == null) {
                k = JsonUtils.EMPTY_JSON;
            }
            if (k.length() != 0) {
                str = k;
            }
            b(new JSONObject(str));
        }
    }

    public final void o() {
        this.f.b();
    }

    public final void p() {
        if (this.t) {
            return;
        }
        this.h.f();
        a((StartError) null);
        this.t = true;
        q();
    }

    public final void q() {
        if (this.x.getAndSet(true)) {
            mb.a("Initialization event already tracked this launch; skipping success event.", (Throwable) null, 2, (Object) null);
            return;
        }
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.e.get();
        if (aVar == null) {
            mb.e("SDK config is null; unable to track initialization success event.", null, 2, null);
            this.x.set(false);
        } else {
            if (aVar.c) {
                mb.a("SDK disabled via kill switch; skipping initialization success event.", (Throwable) null, 2, (Object) null);
                this.x.set(false);
                return;
            }
            try {
                kh.a(this.q, new sa(null, null, null, null, null, null, 63, null), (List) null, g7.b.q, (List) null, 10, (Object) null);
            } catch (Exception e) {
                mb.b("Failed to submit initialization success event", e);
            }
        }
    }

    public final void r() {
        fi i = ((com.chartboost.sdk.internal.Model.a) this.e.get()).i();
        if (i != null) {
            aj.b.refresh(i);
        }
        lb.f4860a.a(i != null ? i.d() : true);
    }

    public final void s() {
        fk e = ((com.chartboost.sdk.internal.Model.a) this.e.get()).e();
        if (e != null) {
            this.i.c(e.b());
            this.i.b(e.c());
            this.i.c(e.d());
            this.i.d(e.e());
            this.i.e(e.f());
            this.i.f(e.g());
            this.i.a(e.a());
        }
        ((lk) this.j.getValue()).a(this.f4897a);
    }

    public final synchronized void a(String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        ChartboostError.Initialization internal;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        try {
            m7.f4873a.a();
            this.v.add(new AtomicReference(onStarted));
            if (this.w) {
                mb.b("Initialization already in progress", (Throwable) null, 2, (Object) null);
                return;
            }
            if (chartboostError != null) {
                a(chartboostError);
                return;
            }
            mb.a("Current session count: " + this.h.b(), (Throwable) null, 2, (Object) null);
            if (this.h.b() > 1) {
                this.u = false;
            }
            this.w = true;
            if (this.t) {
                i();
            } else {
                a(appId, appSignature);
            }
            c();
        } catch (Exception e) {
            mb.b("Cannot initialize Chartboost sdk due to internal error", e);
            if (e instanceof ChartboostError.Initialization) {
                internal = (ChartboostError.Initialization) e;
            } else {
                internal = new ChartboostError.Initialization.Internal("Internal SDK error: " + e.getMessage(), e);
            }
            a(internal);
        }
    }

    public final void c(JSONObject jSONObject) {
        if (jSONObject == null || !o2.a(this.e, jSONObject)) {
            return;
        }
        this.b.edit().putString("config", jSONObject.toString()).apply();
    }

    public final void d(ChartboostError chartboostError) {
        kh.a(this.q, new dh(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), null, lb.a(lb.f4860a, 0, 1, null), 1, null), CollectionsKt.emptyList(), (g7.b) null, (List) null, 12, (Object) null);
    }

    public final void c(ChartboostError chartboostError) {
        if (this.x.getAndSet(true)) {
            mb.a("Initialization event already tracked this launch; skipping failure event.", (Throwable) null, 2, (Object) null);
            return;
        }
        boolean z = chartboostError instanceof ChartboostError.Initialization.Disabled;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.e.get();
        if (!z && aVar != null && aVar.c) {
            mb.a("SDK disabled via kill switch; skipping initialization failure event.", (Throwable) null, 2, (Object) null);
            this.x.set(false);
            return;
        }
        try {
            kh.a(this.q, new sa(null, chartboostError.getMessage(), chartboostError.getCode(), chartboostError.getConstant(), chartboostError.getCauseDescription(), lb.a(lb.f4860a, 0, 1, null), 1, null), (List) null, g7.b.q, (List) null, 10, (Object) null);
        } catch (Exception e) {
            mb.b("Failed to submit initialization failure event", e);
        }
    }

    public final void b() {
        if (jg.f4829a.d()) {
            i9 k = this.o.k();
            jg.a("SetId: " + k.d() + " scope:" + k.e() + " Tracking state: " + k.f() + " Identifiers: " + k.b());
        }
    }

    public final void b(JSONObject jSONObject) {
        if (jg.f4829a.d()) {
            jg.a("Video player: " + new com.chartboost.sdk.internal.Model.a(jSONObject).e().h());
        }
    }

    public final void a(String str, String str2) {
        Regex regex;
        Regex regex2;
        if (!o2.a(this.f4897a)) {
            a(new ChartboostError.Initialization.PermissionsNotSet("INTERNET and/or ACCESS_NETWORK_STATE permissions are not set.", null));
            return;
        }
        if (str.length() != 0 && str2.length() != 0 && str.length() == 24 && str2.length() == 40) {
            regex = og.f4944a;
            if (regex.matches(str)) {
                regex2 = og.f4944a;
                if (regex2.matches(str2)) {
                    this.n.a();
                    this.s.execute(new Runnable() { // from class: com.chartboost.sdk.impl.ng$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ng.a(ng.this);
                        }
                    });
                    if (f() && g()) {
                        j();
                        return;
                    } else {
                        l();
                        return;
                    }
                }
            }
        }
        a(ChartboostError.Initialization.InvalidCredentials.INSTANCE);
    }

    public static final void a(ng ngVar) {
        ngVar.g.b();
    }

    public final void a(ChartboostError chartboostError) {
        d(chartboostError);
        c(chartboostError);
        a(b(chartboostError));
    }

    public final void a(final StartError startError) {
        final StartCallback startCallback;
        b();
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.v.poll();
            if (atomicReference == null || (startCallback = (StartCallback) atomicReference.get()) == null) {
                break;
            } else {
                this.c.a(new Function0() { // from class: com.chartboost.sdk.impl.ng$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ng.a(StartCallback.this, startError);
                    }
                });
            }
        }
        this.w = false;
    }

    public static final Unit a(StartCallback startCallback, StartError startError) {
        startCallback.onStartCompleted(startError);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.c == true) goto L8;
     */
    @Override // com.chartboost.sdk.impl.e5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONObject configJson) {
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        c(configJson);
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.e.get();
        boolean z = aVar != null;
        if (!this.t && z) {
            d();
        } else if (!z) {
            e();
        }
        b(configJson);
    }

    @Override // com.chartboost.sdk.impl.e5
    public void a(String errorMsg) {
        ChartboostError chartboostError;
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (this.m.e()) {
            chartboostError = new ChartboostError.Connectivity.ServerError(errorMsg, null);
        } else {
            chartboostError = ChartboostError.Connectivity.NoInternet.INSTANCE;
        }
        if (this.u) {
            a(chartboostError);
        } else if (f() && g()) {
            e();
        } else if (f()) {
            a(new ChartboostError.Initialization.InvalidConfiguration("Cached configuration is corrupt or invalid", null));
        } else {
            a(chartboostError);
        }
        n();
    }
}
