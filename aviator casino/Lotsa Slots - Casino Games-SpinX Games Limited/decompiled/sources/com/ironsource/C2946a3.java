package com.ironsource;

/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2946a3 implements com.ironsource.Ab, com.ironsource.E2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.ironsourceads.banner.BannerAdRequest f6131a;
    private final com.unity3d.ironsourceads.AdSize b;
    private final com.ironsource.InterfaceC3214p2 c;
    private final com.ironsource.Bb d;
    private final com.ironsource.InterfaceC3295tc e;
    private final com.ironsource.InterfaceC3266s1 f;
    private final com.ironsource.V<com.unity3d.ironsourceads.banner.BannerAdView> g;
    private final com.ironsource.H2 h;
    private final com.ironsource.InterfaceC3013dg.c i;
    private final java.util.concurrent.Executor j;
    private com.ironsource.C3056g5 k;
    private com.ironsource.InterfaceC3013dg l;
    private com.ironsource.Y1 m;
    private boolean n;

    /* renamed from: com.ironsource.a3$a */
    public static final class a implements com.ironsource.InterfaceC3013dg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC3013dg.a
        public void a() {
            com.ironsource.C2946a3.this.a(com.ironsource.C3306u5.f6757a.s());
        }
    }

    public C2946a3(com.unity3d.ironsourceads.banner.BannerAdRequest adRequest, com.unity3d.ironsourceads.AdSize size, com.ironsource.InterfaceC3214p2 auctionResponseFetcher, com.ironsource.Bb loadTaskConfig, com.ironsource.InterfaceC3295tc networkLoadApi, com.ironsource.InterfaceC3266s1 analytics, com.ironsource.V<com.unity3d.ironsourceads.banner.BannerAdView> adLoadTaskListener, com.ironsource.H2 adLayoutFactory, com.ironsource.InterfaceC3013dg.c timerFactory, java.util.concurrent.Executor taskFinishedExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f6131a = adRequest;
        this.b = size;
        this.c = auctionResponseFetcher;
        this.d = loadTaskConfig;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adLoadTaskListener;
        this.h = adLayoutFactory;
        this.i = timerFactory;
        this.j = taskFinishedExecutor;
    }

    private final void a(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> a2 = com.ironsource.P5.f5920a.a(bundle);
        for (java.lang.String str : a2.keySet()) {
            java.lang.String valueOf = java.lang.String.valueOf(a2.get(str));
            com.ironsource.InterfaceC3141l1.c.f6356a.a(new com.ironsource.C3195o1.l(str + com.ironsource.X3.j.b + valueOf)).a(this.f);
        }
    }

    @Override // com.ironsource.E2
    public void onBannerLoadFail(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        a(com.ironsource.C3306u5.f6757a.c(description));
    }

    @Override // com.ironsource.E2
    public void onBannerLoadSuccess(final com.ironsource.J9 adInstance, final com.ironsource.C3041f8 adContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        try {
            this.j.execute(new java.lang.Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C2946a3.a(com.ironsource.C2946a3.this, adInstance, adContainer);
                }
            });
        } catch (java.lang.Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.Ab
    public void start() {
        this.k = new com.ironsource.C3056g5();
        this.f.a(new com.ironsource.C3195o1.s(this.d.f()), new com.ironsource.C3195o1.n(this.d.g().b()), new com.ironsource.C3195o1.c(this.b), new com.ironsource.C3195o1.b(this.f6131a.getAdId$mediationsdk_release()));
        com.ironsource.InterfaceC3141l1.c.f6356a.a().a(this.f);
        a(this.f6131a.getExtraParams());
        long h = this.d.h();
        com.ironsource.InterfaceC3013dg.c cVar = this.i;
        com.ironsource.InterfaceC3013dg.b bVar = new com.ironsource.InterfaceC3013dg.b();
        bVar.b(h);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.ironsource.InterfaceC3013dg a2 = cVar.a(bVar);
        this.l = a2;
        if (a2 != null) {
            a2.a(new com.ironsource.C2946a3.a());
        }
        java.lang.Object a3 = this.c.a();
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a3);
        if (m10801exceptionOrNullimpl != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(m10801exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((com.ironsource.C2951a8) m10801exceptionOrNullimpl).a());
            a3 = null;
        }
        com.ironsource.C3160m2 c3160m2 = (com.ironsource.C3160m2) a3;
        if (c3160m2 == null) {
            return;
        }
        com.ironsource.InterfaceC3266s1 interfaceC3266s1 = this.f;
        java.lang.String b = c3160m2.b();
        if (b != null) {
            interfaceC3266s1.a(new com.ironsource.C3195o1.d(b));
        }
        org.json.JSONObject f = c3160m2.f();
        if (f != null) {
            interfaceC3266s1.a(new com.ironsource.C3195o1.m(f));
        }
        java.lang.String a4 = c3160m2.a();
        if (a4 != null) {
            interfaceC3266s1.a(new com.ironsource.C3195o1.g(a4));
        }
        com.ironsource.EnumC3203o9 g = this.d.g();
        android.content.Context applicationContext = com.ironsource.environment.ContextProvider.getInstance().getApplicationContext();
        com.ironsource.C3005d8 c3005d8 = new com.ironsource.C3005d8(com.ironsource.mediationsdk.AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), com.ironsource.mediationsdk.AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        com.ironsource.Ic ic = new com.ironsource.Ic();
        ic.a(this);
        com.ironsource.J9 adInstance = new com.ironsource.K9(this.f6131a.getProviderName$mediationsdk_release().value(), ic).a(g.b(com.ironsource.EnumC3203o9.Bidder)).a(c3005d8).b(this.d.i()).a(this.f6131a.getAdId$mediationsdk_release()).a(kotlin.collections.MapsKt.plus(new com.ironsource.C3170mc().a(), com.ironsource.P5.f5920a.a(this.f6131a.getExtraParams()))).a();
        com.ironsource.C3331vc c3331vc = new com.ironsource.C3331vc(c3160m2, this.d.j());
        this.m = new com.ironsource.Y1(new com.ironsource.C3167m9(this.f6131a.getInstanceId(), g.b(), c3160m2.a()), new com.ironsource.mediationsdk.d(), c3160m2.c());
        com.ironsource.InterfaceC3141l1.d.f6358a.c().a(this.f);
        com.ironsource.InterfaceC3295tc interfaceC3295tc = this.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC3295tc.a(adInstance, c3331vc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C2946a3 this$0, com.ironsource.J9 adInstance, com.ironsource.C3041f8 adContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        com.ironsource.InterfaceC3013dg interfaceC3013dg = this$0.l;
        if (interfaceC3013dg != null) {
            interfaceC3013dg.cancel();
        }
        com.ironsource.C3056g5 c3056g5 = this$0.k;
        if (c3056g5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c3056g5 = null;
        }
        com.ironsource.InterfaceC3141l1.c.f6356a.a(new com.ironsource.C3195o1.f(com.ironsource.C3056g5.a(c3056g5))).a(this$0.f);
        com.ironsource.Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.c("onBannerLoadSuccess");
        }
        com.ironsource.H2 h2 = this$0.h;
        com.ironsource.Y1 y12 = this$0.m;
        kotlin.jvm.internal.Intrinsics.checkNotNull(y12);
        this$0.g.a(h2.a(adInstance, adContainer, y12));
    }

    public /* synthetic */ C2946a3(com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequest, com.unity3d.ironsourceads.AdSize adSize, com.ironsource.InterfaceC3214p2 interfaceC3214p2, com.ironsource.Bb bb, com.ironsource.InterfaceC3295tc interfaceC3295tc, com.ironsource.InterfaceC3266s1 interfaceC3266s1, com.ironsource.V v, com.ironsource.H2 h2, com.ironsource.InterfaceC3013dg.c cVar, java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC3214p2, bb, interfaceC3295tc, interfaceC3266s1, v, h2, (i & 256) != 0 ? new com.ironsource.InterfaceC3013dg.d() : cVar, (i & 512) != 0 ? com.ironsource.Q7.f5934a.d() : executor);
    }

    public final void a(final com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.j.execute(new java.lang.Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C2946a3.a(com.ironsource.C2946a3.this, error);
                }
            });
        } catch (java.lang.Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C2946a3 this$0, com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        com.ironsource.InterfaceC3013dg interfaceC3013dg = this$0.l;
        if (interfaceC3013dg != null) {
            interfaceC3013dg.cancel();
        }
        com.ironsource.InterfaceC3141l1.c.a aVar = com.ironsource.InterfaceC3141l1.c.f6356a;
        com.ironsource.C3195o1.j jVar = new com.ironsource.C3195o1.j(error.getErrorCode());
        com.ironsource.C3195o1.k kVar = new com.ironsource.C3195o1.k(error.getErrorMessage());
        com.ironsource.C3056g5 c3056g5 = this$0.k;
        if (c3056g5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c3056g5 = null;
        }
        aVar.a(jVar, kVar, new com.ironsource.C3195o1.f(com.ironsource.C3056g5.a(c3056g5))).a(this$0.f);
        com.ironsource.Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.a("onBannerLoadFail");
        }
        this$0.g.b(error);
    }

    private final void a(java.lang.Exception exc) {
        com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(exc.getMessage());
        com.ironsource.InterfaceC3141l1.d.f6358a.a(new com.ironsource.C3195o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
