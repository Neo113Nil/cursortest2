package com.ironsource;

/* loaded from: classes5.dex */
public abstract class B implements com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] x = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.ironsource.B.class, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/AdInstanceListener;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f5620a;
    private final com.ironsource.C b;
    private final com.ironsource.I c;
    private final kotlin.properties.ReadWriteProperty d;
    private com.ironsource.G e;
    private final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> f;
    private com.ironsource.C3056g5 g;
    private com.ironsource.AbstractRunnableC3136ke h;
    private final java.util.Map<java.lang.String, java.lang.Object> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final com.ironsource.mediationsdk.adunit.adapter.utility.AdData n;
    private final com.ironsource.C3232q2 o;
    private final boolean p;
    private final java.lang.String q;
    private final int r;
    private final java.lang.String s;
    private final com.ironsource.mediationsdk.IronSource.a t;
    private final int u;
    private final com.ironsource.J v;
    private final boolean w;

    public static final class a extends com.ironsource.AbstractRunnableC3136ke {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            long a2 = com.ironsource.C3056g5.a(com.ironsource.B.this.g);
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
            com.ironsource.B b = com.ironsource.B.this;
            ironLog.verbose(b.a("Load duration = " + a2 + ", isBidder = " + b.v()));
            com.ironsource.B.this.m = true;
            com.ironsource.B.this.f().e().e().a(a2, 1025, false, com.ironsource.B.this.A());
            com.ironsource.B.this.f().e().e().a(a2, 1025, "time out", false, com.ironsource.B.this.A());
            com.ironsource.B b2 = com.ironsource.B.this;
            com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildLoadFailedError, "buildLoadFailedError(errorMessage)");
            b2.a(buildLoadFailedError);
        }
    }

    public B(com.ironsource.V0 adTools, com.ironsource.C instanceData, com.ironsource.I adInstancePayload, com.ironsource.F f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        this.f5620a = adTools;
        this.b = instanceData;
        this.c = adInstancePayload;
        this.d = com.ironsource.C2986c7.a(f);
        this.i = new java.util.LinkedHashMap();
        this.n = instanceData.h();
        this.o = instanceData.q();
        this.p = instanceData.k().j();
        this.q = instanceData.s();
        this.r = instanceData.t();
        this.s = instanceData.x();
        this.t = instanceData.i();
        this.u = instanceData.w();
        this.v = instanceData.u();
        this.w = instanceData.y();
        com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a2 = a(instanceData);
        this.f = a2;
        adTools.e().a(new com.ironsource.D(adTools, instanceData, a2));
        adTools.e().a(new com.ironsource.W1(instanceData.l()));
    }

    private final void D() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        try {
            I();
            C();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            this.f5620a.e().h().g(str);
            a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void E() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        this.f5620a.e().a().a(k());
        com.ironsource.F s = s();
        if (s != null) {
            s.a(this);
        }
    }

    private final void F() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        com.ironsource.G g = null;
        ironLog.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        J();
        this.j = false;
        if (this.m) {
            c();
            this.f5620a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.k) {
            this.f5620a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.k = true;
        long a2 = com.ironsource.C3056g5.a(this.g);
        ironLog.verbose(a("Load duration = " + a2));
        this.f5620a.e().e().a(a2, false, this.w);
        a(com.ironsource.C3247r0.a.LoadedSuccessfully);
        com.ironsource.G g2 = this.e;
        if (g2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            g = g2;
        }
        g.b(this);
    }

    private final void G() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        if (this.l) {
            this.f5620a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.l = true;
        this.f5620a.e().a().g(k());
        a(com.ironsource.C3247r0.a.ShowedSuccessfully);
        com.ironsource.F s = s();
        if (s != null) {
            s.b(this);
        }
    }

    private final void H() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        J();
        if (this.m) {
            return;
        }
        D();
    }

    private final void I() {
        J();
        com.ironsource.B.a a2 = a();
        this.h = a2;
        if (a2 != null) {
            this.f5620a.a((com.ironsource.AbstractRunnableC3136ke) a2, java.util.concurrent.TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void J() {
        com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke = this.h;
        if (abstractRunnableC3136ke != null) {
            this.f5620a.b(abstractRunnableC3136ke);
            this.h = null;
        }
    }

    private final int o() {
        java.lang.Integer f = h().f();
        return (f == null || f.intValue() <= 0) ? this.b.j().h() : f.intValue();
    }

    public final boolean A() {
        return this.w;
    }

    public boolean B() {
        return this.k;
    }

    protected abstract void C();

    public abstract void a(com.ironsource.K k);

    public void b() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        J();
        this.f5620a.e().e().a(this.u);
    }

    public void c() {
    }

    public final com.ironsource.mediationsdk.IronSource.a d() {
        return this.t;
    }

    public com.unity3d.mediation.LevelPlayAdInfo e() {
        java.lang.String uuid = this.b.j().b().b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        java.lang.String c = this.b.j().b().c();
        java.lang.String aVar = this.b.i().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        return new com.unity3d.mediation.LevelPlayAdInfo(uuid, c, aVar, h(), null, this.b.j().l(), kotlin.collections.MapsKt.toMap(this.i));
    }

    public final com.ironsource.V0 f() {
        return this.f5620a;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> g() {
        return this.f;
    }

    public final com.ironsource.C3232q2 h() {
        return this.b.o();
    }

    protected final com.ironsource.mediationsdk.adunit.adapter.utility.AdData i() {
        return this.n;
    }

    protected final com.ironsource.C3064gd j() {
        return this.b.j().b().f();
    }

    protected final java.lang.String k() {
        return this.b.j().l();
    }

    protected final java.util.Map<java.lang.String, java.lang.Object> l() {
        return this.i;
    }

    public final com.ironsource.C3232q2 m() {
        return this.o;
    }

    protected final com.ironsource.C n() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.b(com.ironsource.B.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdClicked(java.util.Map map) {
        onAdClicked();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, final int i, final java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.a(com.ironsource.B.this, adapterErrorType, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str, java.util.Map map) {
        onAdLoadFailed(adapterErrorType, i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new java.util.LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new java.util.LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i, final java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.a(com.ironsource.B.this, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdShowFailed(int i, java.lang.String str, java.util.Map map) {
        onAdShowFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, final java.lang.String str) {
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.b(com.ironsource.B.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitFailed(int i, java.lang.String str, java.util.Map map) {
        onInitFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.c(com.ironsource.B.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitSuccess(java.util.Map map) {
        onInitSuccess();
    }

    public final java.lang.String p() {
        return this.q;
    }

    public final java.lang.String q() {
        return this.s;
    }

    public final int r() {
        return this.r;
    }

    public final com.ironsource.F s() {
        return (com.ironsource.F) this.d.getValue(this, x[0]);
    }

    public final com.ironsource.J t() {
        return this.v;
    }

    public final int u() {
        return this.u;
    }

    public final boolean v() {
        return this.p;
    }

    public final boolean w() {
        return this.m;
    }

    public final boolean x() {
        return this.k;
    }

    public final boolean y() {
        return this.j;
    }

    public final boolean z() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.B this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(final java.util.Map<java.lang.String, java.lang.Object> extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.a(com.ironsource.B.this, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final java.util.Map<java.lang.String, java.lang.Object> extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new java.lang.Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.B.b(com.ironsource.B.this, extraData);
            }
        });
    }

    private final void b(int i, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a("error = " + i + ", " + str));
        J();
        this.m = true;
        a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, com.ironsource.C3056g5.a(this.g));
        a(new com.ironsource.mediationsdk.logger.IronSourceError(i, str));
    }

    public final void a(com.ironsource.F f) {
        this.d.setValue(this, x[0], f);
    }

    public final void a(com.ironsource.C3232q2 value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.b.a(value);
    }

    protected final void a(com.ironsource.C3247r0.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        this.b.a(performance);
    }

    protected final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5620a.a(callback);
    }

    public final void a(boolean z) {
        this.f5620a.e().a().a(z);
    }

    private final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.ironsource.C c) {
        if (c.j().e().q()) {
            return this.c.b();
        }
        return this.f5620a.a(c);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(com.ironsource.G listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        this.e = listener;
        this.j = true;
        try {
            this.f5620a.e().e().a(false, this.w);
            this.g = new com.ironsource.C3056g5();
            I();
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter = this.f;
            kotlin.jvm.internal.Intrinsics.checkNotNull(baseAdAdapter);
            ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.b.h(), com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), this);
            } else {
                java.lang.String str = "loadAd - network adapter not available " + this.s;
                ironLog.error(a(str));
                b(com.ironsource.B0.c(this.b.i()), str);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str2));
            this.f5620a.e().h().g(str2);
            b(com.ironsource.B0.c(this.b.i()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.B this$0, java.util.Map extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.i.putAll(extraData);
        this$0.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.B this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.B this$0, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i, str);
    }

    public static /* synthetic */ java.lang.String a(com.ironsource.B b, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return b.a(str);
    }

    protected final java.lang.String a(java.lang.String str) {
        return this.f5620a.a(str, this.s);
    }

    private final com.ironsource.B.a a() {
        return new com.ironsource.B.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        a(com.ironsource.C3247r0.a.FailedToLoad);
        com.ironsource.G g = this.e;
        if (g == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            g = null;
        }
        g.a(ironSourceError, this);
    }

    private final void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
        long a2 = com.ironsource.C3056g5.a(this.g);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a("Load duration = " + a2 + ", error = " + i + ", " + str));
        J();
        this.j = false;
        if (this.m) {
            c();
            a(adapterErrorType, i, str, a2);
        } else {
            if (this.k) {
                a(adapterErrorType);
                return;
            }
            this.m = true;
            c();
            a(adapterErrorType, i, str, a2);
            a(new com.ironsource.mediationsdk.logger.IronSourceError(i, str));
        }
    }

    public /* synthetic */ B(com.ironsource.V0 v0, com.ironsource.C c, com.ironsource.I i, com.ironsource.F f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, c, i, (i2 & 8) != 0 ? null : f);
    }

    protected final void a(int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a("Show error = " + i + ", " + errorMessage));
        this.m = true;
        this.f5620a.e().a().a(k(), i, errorMessage, null);
        a(com.ironsource.C3247r0.a.FailedToShow);
        com.ironsource.F s = s();
        if (s != null) {
            s.a(this, new com.ironsource.mediationsdk.logger.IronSourceError(i, errorMessage));
        }
        c();
    }

    private final void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType) {
        if (adapterErrorType == com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f5620a.e().h().a("");
        } else {
            this.f5620a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str, long j) {
        if (adapterErrorType == com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f5620a.e().e().b(j, i, this.w);
        } else if (str != null && str.length() != 0) {
            this.f5620a.e().e().a(j, i, str, false, this.w);
        } else {
            this.f5620a.e().e().a(j, i, false, this.w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.B this$0, java.util.Map extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.i.putAll(extraData);
        this$0.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.B this$0, com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.B this$0, int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(i, errorMessage);
    }
}
