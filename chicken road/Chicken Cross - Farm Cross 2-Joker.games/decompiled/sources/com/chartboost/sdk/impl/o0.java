package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.da;
import com.chartboost.sdk.impl.dl;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class o0 implements r0, ea, r9, da, p0, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f4920a;
    public final f3 b;
    public final k8 c;
    public final lk d;
    public final p9 e;
    public final s0 f;
    public final yd g;
    public final ja h;
    public final uf i;
    public final id j;
    public final oh k;
    public final Mediation l;
    public final CoroutineScope m;
    public final i7 n;
    public final EndpointRepository o;
    public final yi p;
    public q0 q;
    public w2 r;
    public final Map s;
    public final c t;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ViewGroup c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.c = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.removeAllViews();
            this.c.invalidate();
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ w2 c;
        public final /* synthetic */ o0 d;
        public final /* synthetic */ p1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w2 w2Var, o0 o0Var, p1 p1Var, Continuation continuation) {
            super(2, continuation);
            this.c = w2Var;
            this.d = o0Var;
            this.e = p1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            w2 w2Var = this.c;
            if (w2Var != null) {
                w2Var.J();
            } else {
                this.d.d(this.e, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements ml {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.ml
        public void a() {
            w2 w2Var = o0.this.r;
            if (w2Var != null) {
                w2Var.b(CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT);
            }
        }
    }

    public o0(c0 adType, f3 reachability, k8 fileCache, lk videoRepository, p9 impressionBuilder, s0 adUnitRendererShowRequest, yd openMeasurementController, ja viewProtocolBuilder, uf rendererActivityBridge, id nativeBridgeCommand, oh templateLoader, Mediation mediation, CoroutineScope uiScope, i7 eventTracker, EndpointRepository endpointRepository, yi urlResolver) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(impressionBuilder, "impressionBuilder");
        Intrinsics.checkNotNullParameter(adUnitRendererShowRequest, "adUnitRendererShowRequest");
        Intrinsics.checkNotNullParameter(openMeasurementController, "openMeasurementController");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        this.f4920a = adType;
        this.b = reachability;
        this.c = fileCache;
        this.d = videoRepository;
        this.e = impressionBuilder;
        this.f = adUnitRendererShowRequest;
        this.g = openMeasurementController;
        this.h = viewProtocolBuilder;
        this.i = rendererActivityBridge;
        this.j = nativeBridgeCommand;
        this.k = templateLoader;
        this.l = mediation;
        this.m = uiScope;
        this.n = eventTracker;
        this.o = endpointRepository;
        this.p = urlResolver;
        this.s = new LinkedHashMap();
        this.t = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(p1 p1Var, CBError.Impression impression) {
        c(p1Var, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String b2 = this.f4920a.b();
        d0 a2 = p1Var.a();
        mb.b("reportError: adTypeTraits: " + b2 + " reason: cache  format: web error: " + impression + " adId: " + (a2 != null ? a2.a() : null) + " appRequest.location: " + p1Var.d(), (Throwable) null, 2, (Object) null);
    }

    private final void e(p1 p1Var) {
        p1Var.b(false);
        p1Var.a((d0) null);
    }

    @Override // com.chartboost.sdk.impl.da
    public void A() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.I();
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void B() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.h();
        }
        this.j.a((t8) null);
        this.j.a();
    }

    @Override // com.chartboost.sdk.impl.da
    public void C() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.n();
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void D() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.z();
        }
    }

    public final void E() {
        try {
            this.p.a();
            w2 w2Var = this.r;
            if (w2Var != null) {
                this.g.f();
                ViewGroup f = w2Var.f();
                if (f != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new a(f, null), 3, null);
                }
                w2Var.P();
                this.r = null;
                this.q = null;
            }
        } catch (Exception e) {
            mb.b("detachBannerImpression error", e);
        }
    }

    public final Mediation F() {
        return this.l;
    }

    public final int G() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            return w2Var.x();
        }
        return -1;
    }

    public boolean H() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            return w2Var.i();
        }
        return false;
    }

    public final void b(p1 p1Var, CBError.Impression impression) {
        d(p1Var, impression);
        if (impression != CBError.Impression.IMPRESSION_ALREADY_VISIBLE) {
            e(p1Var);
        }
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.da
    public CBError.Impression c(String str) {
        return da.a.a(this, str);
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.n.clearFromStorage(fVar);
    }

    public final void f(p1 p1Var) {
        if (this.r != null && p1Var.b() == null) {
            mb.b("Fullscreen impression is currently loading.", (Throwable) null, 2, (Object) null);
            return;
        }
        if (!this.b.e()) {
            c(p1Var, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.d(c(p1Var));
        }
        p9 p9Var = this.e;
        e0 b2 = p1Var.b();
        ca a2 = p9Var.a(p1Var, this, b2 != null ? b2.b() : null, this, this, this.h, this, this.t, this.j, this.k);
        this.r = a2.b();
        a(p1Var, a2.b(), a2.a());
    }

    public final void g(final p1 p1Var) {
        String str;
        String B;
        d0 a2 = p1Var.a();
        if (a2 == null || !a2.D()) {
            f(p1Var);
            return;
        }
        lk lkVar = this.d;
        d0 a3 = p1Var.a();
        String str2 = "";
        if (a3 == null || (str = a3.C()) == null) {
            str = "";
        }
        d0 a4 = p1Var.a();
        if (a4 != null && (B = a4.B()) != null) {
            str2 = B;
        }
        lkVar.a(str, str2, true, new t0() { // from class: com.chartboost.sdk.impl.o0$$ExternalSyntheticLambda1
            @Override // com.chartboost.sdk.impl.t0
            public final void a(String str3) {
                o0.a(o0.this, p1Var, str3);
            }
        });
    }

    public final void h(p1 p1Var) {
        if (p1Var.e()) {
            return;
        }
        p1Var.b(true);
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.e(g.i.c, "", this.f4920a.b(), p1Var.d(), null, null, 48, null));
    }

    @Override // com.chartboost.sdk.impl.da
    public void i() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.M();
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void j() {
        this.i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.r0
    public void k() {
        w2 w2Var = this.r;
        if (w2Var == null) {
            mb.b("Cannot display missing impression onImpressionReadyToBeDisplayed", (Throwable) null, 2, (Object) null);
            return;
        }
        w2Var.b(ga.d);
        if (w2Var.L()) {
            w2Var.a(w2Var.f());
        } else {
            this.i.a(this);
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void l() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.onStart();
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void m() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.F();
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void n() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.onResume();
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public String o() {
        String t;
        w2 w2Var = this.r;
        return (w2Var == null || (t = w2Var.t()) == null) ? "" : t;
    }

    @Override // com.chartboost.sdk.impl.p0
    public void p() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.c();
        }
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.n.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.da
    public String q() {
        String w;
        w2 w2Var = this.r;
        return (w2Var == null || (w = w2Var.w()) == null) ? "" : w;
    }

    @Override // com.chartboost.sdk.impl.da
    public String r() {
        String v;
        w2 w2Var = this.r;
        return (w2Var == null || (v = w2Var.v()) == null) ? "" : v;
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.n.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.r9
    public void s() {
        w2 w2Var = this.r;
        if ((w2Var != null ? w2Var.q() : null) != ga.e || Intrinsics.areEqual(this.f4920a, c0.a.g)) {
            return;
        }
        this.i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.n.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.da
    public void t() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.A();
        }
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.n.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.da
    public String u() {
        String p;
        w2 w2Var = this.r;
        return (w2Var == null || (p = w2Var.p()) == null) ? "" : p;
    }

    @Override // com.chartboost.sdk.impl.da
    public void v() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.H();
        }
    }

    @Override // com.chartboost.sdk.impl.ea
    public void w() {
        this.p.a();
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.P();
        }
        this.r = null;
        this.q = null;
    }

    @Override // com.chartboost.sdk.impl.da
    public String x() {
        String s;
        w2 w2Var = this.r;
        return (w2Var == null || (s = w2Var.s()) == null) ? "" : s;
    }

    @Override // com.chartboost.sdk.impl.da
    public void y() {
        this.i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.da
    public void z() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.G();
        }
    }

    private final void c(p1 p1Var, CBError.Impression impression) {
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.a(c(p1Var), impression);
        } else {
            mb.a("Missing AdUnitRendererAdCallback while sending onShowFailure with error: " + impression, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.n.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.n.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo4759track(event);
    }

    public final void a(p1 appRequest, q0 callback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.q = callback;
        if (!this.b.e()) {
            c(appRequest, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        d0 a2 = appRequest.a();
        if (a2 == null) {
            d(appRequest, CBError.Impression.NO_AD_FOUND);
        } else if (!this.c.a(a2).booleanValue()) {
            d(appRequest, CBError.Impression.ASSET_MISSING);
        } else {
            h(appRequest);
            g(appRequest);
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void e() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.O();
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void e(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        mb.b("WebView warning occurred closing the webview " + msg, (Throwable) null, 2, (Object) null);
    }

    private final String c(p1 p1Var) {
        d0 a2;
        if (p1Var == null || (a2 = p1Var.a()) == null) {
            return null;
        }
        return a2.m();
    }

    @Override // com.chartboost.sdk.impl.r0
    public void b(String impressionId) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        a(g.b.c, "");
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.b(impressionId);
        }
    }

    public void c(boolean z) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.f(z);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void c(k3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.c(url);
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void b(p1 appRequest) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        c(true);
        String c2 = c(appRequest);
        if (c2 != null) {
            this.s.put(c2, appRequest);
        } else {
            mb.b("Unable to store app request because impression ID is missing. Impression tracking will not work.", (Throwable) null, 2, (Object) null);
        }
        f(appRequest.d());
        if (H()) {
            g(c2);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void c() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.N();
        }
    }

    public final void d(p1 p1Var) {
        s0 s0Var = this.f;
        URL endPointUrl = this.o.getEndPointUrl(this.f4920a.d());
        d0 a2 = p1Var.a();
        s0Var.a(endPointUrl, new yg(a2 != null ? a2.a() : null, p1Var.d(), G(), this.f4920a.b(), this.l));
    }

    public final void g(String str) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.e(true);
        }
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.c(str);
        }
        this.g.i();
        p1 p1Var = (p1) TypeIntrinsics.asMutableMap(this.s).remove(str);
        if (p1Var != null) {
            q0 q0Var2 = this.q;
            if (q0Var2 != null) {
                q0Var2.e(str);
            }
            d(p1Var);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public String h() {
        String u;
        w2 w2Var = this.r;
        return (w2Var == null || (u = w2Var.u()) == null) ? "" : u;
    }

    @Override // com.chartboost.sdk.impl.r9
    public void b(boolean z) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.d(z);
        }
    }

    @Override // com.chartboost.sdk.impl.ea
    public void b() {
        mb.a("DISMISS_MISSING event was successfully removed upon dismiss callback", (Throwable) null, 2, (Object) null);
        clearFromStorage((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(g.i.o, "", "", "", null, 16, null));
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.b();
        }
    }

    @Override // com.chartboost.sdk.impl.r9
    public void d() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.E();
        } else {
            mb.a("Missing impression on impression click success callback ", (Throwable) null, 2, (Object) null);
        }
    }

    public static final void a(o0 o0Var, p1 p1Var, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        o0Var.f(p1Var);
    }

    public final void a(p1 p1Var, w2 w2Var, CBError.Impression impression) {
        if (impression == null) {
            BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new b(w2Var, this, p1Var, null), 3, null);
        } else {
            d(p1Var, impression);
            e(p1Var);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void d(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(event);
        }
    }

    @Override // com.chartboost.sdk.impl.ea
    public void g() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.m();
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void d(k3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.b(url);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void b(float f) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(f);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void b(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.d(cbUrl);
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void a(CBImpressionActivity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(w2Var.q(), activity);
            qk y = w2Var.y();
            if (y != null) {
                this.i.a(y);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        mb.b("Cannot display missing impression onActivityIsReadyToDisplay", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.p0
    public void a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(p1 appRequest) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        e(appRequest);
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(String impressionId, String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(error, "error");
        a(g.b.d, error.name());
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.a(impressionId, str, error);
        }
    }

    public final void a(com.chartboost.sdk.tracking.g gVar, String str) {
        String str2;
        String b2 = this.f4920a.b();
        w2 w2Var = this.r;
        if (w2Var == null || (str2 = w2Var.r()) == null) {
            str2 = "No location";
        }
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.e(gVar, str, b2, str2, this.l, null, 32, null));
    }

    public final void f(String str) {
        if (Intrinsics.areEqual(this.f4920a, c0.a.g)) {
            return;
        }
        persist((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.e(g.i.o, "dismiss_missing due to ad not finished", this.f4920a.b(), str, this.l, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(String str, int i) {
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.a(str, i);
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(String str) {
        q0 q0Var = this.q;
        if (q0Var != null) {
            q0Var.a(str);
        }
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.da
    public void f() {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.D();
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(Context context) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        final w2 w2Var = this.r;
        if (w2Var != null) {
            if (!this.g.h()) {
                w2Var.a(true);
                mb.a("Cannot create visibility tracker due to the OM SDK being disabled!", (Throwable) null, 2, (Object) null);
                return;
            }
            if (w2Var.C()) {
                mb.b("Cannot create VisibilityTracker due to missing view!", (Throwable) null, 2, (Object) null);
                return;
            }
            qk y = w2Var.y();
            if (y != null) {
                yd ydVar = this.g;
                View rootView = y.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
                ydVar.a(context, y, rootView, new dl.b() { // from class: com.chartboost.sdk.impl.o0$$ExternalSyntheticLambda0
                    @Override // com.chartboost.sdk.impl.dl.b
                    public final void a() {
                        o0.a(o0.this, w2Var);
                    }
                });
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        mb.b("Missing impression onImpressionViewCreated", (Throwable) null, 2, (Object) null);
    }

    public static final void a(o0 o0Var, w2 w2Var) {
        o0Var.a(w2Var);
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(int i, boolean z) {
        this.i.a(i, z);
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a() {
        this.i.a();
    }

    public final void a(w2 w2Var) {
        mb.b("Visibility check success!", (Throwable) null, 2, (Object) null);
        w2Var.a(true);
        if (!w2Var.k() || w2Var.j()) {
            return;
        }
        g(w2Var.o());
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(p1 appRequest, CBError.Impression error) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(error, "error");
        b(appRequest, error);
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(g.i.l, "", this.f4920a.b(), appRequest.d(), this.l, null, 32, null));
        this.i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.r9
    public void a(boolean z) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.c(z);
        }
    }

    @Override // com.chartboost.sdk.impl.r9
    public void a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(str, error);
        } else {
            mb.a("Missing impression on impression click failure callback ", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ea
    public void a(ga state) {
        Intrinsics.checkNotNullParameter(state, "state");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.b(state);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(uj vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(vastVideoEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(re playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(playerState);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(float f) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.b(f);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(float f, float f2) {
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(f, f2);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(k3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(url);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(z, forceOrientation);
        }
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        w2 w2Var = this.r;
        if (w2Var != null) {
            w2Var.a(verificationScriptResourceList, num);
        }
    }

    public /* synthetic */ o0(c0 c0Var, f3 f3Var, k8 k8Var, lk lkVar, p9 p9Var, s0 s0Var, yd ydVar, ja jaVar, uf ufVar, id idVar, oh ohVar, Mediation mediation, CoroutineScope coroutineScope, i7 i7Var, EndpointRepository endpointRepository, yi yiVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, f3Var, k8Var, lkVar, p9Var, s0Var, ydVar, jaVar, ufVar, idVar, ohVar, mediation, (i & 4096) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope, i7Var, endpointRepository, yiVar);
    }
}
