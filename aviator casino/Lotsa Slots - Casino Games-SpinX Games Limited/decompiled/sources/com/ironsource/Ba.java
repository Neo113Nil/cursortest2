package com.ironsource;

/* loaded from: classes5.dex */
public final class Ba implements com.ironsource.InterfaceC3365xa {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f5625a;
    private final com.ironsource.W2 b;
    private final long c;
    private final long d;
    private final com.ironsource.J2 e;
    private com.ironsource.InterfaceC3383ya f;
    private final com.ironsource.N2 g;
    private final com.ironsource.Ef h;
    private final com.ironsource.InterfaceC3216p4 i;
    private final boolean j;
    private com.ironsource.M0 k;
    private com.ironsource.InterfaceC3391z0 l;
    private com.ironsource.O2 m;
    private com.ironsource.La n;

    public static final class a implements com.ironsource.O2 {
        a() {
        }

        public void a() {
            com.ironsource.Ba.this.n().onAdLeftApplication();
        }

        public void b() {
            com.ironsource.Ba.this.n().k();
        }

        public void c() {
            com.ironsource.Ba.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            com.ironsource.Ba.this.n().onAdClicked();
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ kotlin.Unit g() {
            a();
            return kotlin.Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ kotlin.Unit h() {
            c();
            return kotlin.Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ kotlin.Unit j() {
            b();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class b implements com.ironsource.M0 {
        b() {
        }

        @Override // com.ironsource.M0
        public /* synthetic */ void a() {
            com.ironsource.M0.CC.$default$a(this);
        }

        @Override // com.ironsource.M0
        public void a(com.ironsource.C3301u0 adUnitCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            com.ironsource.Ba.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
        }

        @Override // com.ironsource.M0
        public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.Ba.this.m().a(ironSourceError);
        }
    }

    public static final class c implements com.ironsource.InterfaceC3391z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC3391z0
        public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.Ba.this.n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC3391z0
        public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.Ba.this.n().d(ironSourceError);
        }
    }

    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.ironsource.L2 b;
        final /* synthetic */ com.ironsource.AbstractC3036f3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.ironsource.L2 l2, com.ironsource.AbstractC3036f3 abstractC3036f3) {
            super(0);
            this.b = l2;
            this.c = abstractC3036f3;
        }

        public final void a() {
            com.ironsource.Ba.a(com.ironsource.Ba.this, this.b, this.c, false, 4, (java.lang.Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.ironsource.L2 b;
        final /* synthetic */ java.lang.Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.ironsource.L2 l2, java.lang.Long l) {
            super(0);
            this.b = l2;
            this.c = l;
        }

        public final void a() {
            com.ironsource.Ba ba = com.ironsource.Ba.this;
            ba.a((com.ironsource.La) new com.ironsource.Fa(ba, this.b, this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ com.ironsource.L2 b;
        final /* synthetic */ com.ironsource.AbstractC3036f3 c;
        final /* synthetic */ java.lang.Long d;

        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.Ba f5632a;
            final /* synthetic */ com.ironsource.L2 b;
            final /* synthetic */ com.ironsource.AbstractC3036f3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.ironsource.Ba ba, com.ironsource.L2 l2, com.ironsource.AbstractC3036f3 abstractC3036f3) {
                super(0);
                this.f5632a = ba;
                this.b = l2;
                this.c = abstractC3036f3;
            }

            public final void a() {
                com.ironsource.Ba.a(this.f5632a, this.b, this.c, false, 4, (java.lang.Object) null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.Ba f5633a;
            final /* synthetic */ com.ironsource.L2 b;
            final /* synthetic */ java.lang.Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(com.ironsource.Ba ba, com.ironsource.L2 l2, java.lang.Long l) {
                super(0);
                this.f5633a = ba;
                this.b = l2;
                this.c = l;
            }

            public final void a() {
                com.ironsource.Ba ba = this.f5633a;
                ba.a((com.ironsource.La) new com.ironsource.Fa(ba, this.b, this.c));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        f(com.ironsource.L2 l2, com.ironsource.AbstractC3036f3 abstractC3036f3, java.lang.Long l) {
            this.b = l2;
            this.c = abstractC3036f3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (com.ironsource.Ba.this.k().getViewTreeObserver().isAlive()) {
                com.ironsource.Ba.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (com.ironsource.Cg.a(com.ironsource.Ba.this.k(), new android.graphics.Rect())) {
                com.ironsource.C3312ub.a((com.ironsource.C3312ub) com.ironsource.Ba.this.a(), com.ironsource.AbstractRunnableC3136ke.f6349a.a(new com.ironsource.Ba.f.a(com.ironsource.Ba.this, this.b, this.c)), 0L, 2, (java.lang.Object) null);
            } else {
                com.ironsource.C3312ub.a((com.ironsource.C3312ub) com.ironsource.Ba.this.a(), com.ironsource.AbstractRunnableC3136ke.f6349a.a(new com.ironsource.Ba.f.b(com.ironsource.Ba.this, this.b, this.d)), 0L, 2, (java.lang.Object) null);
            }
        }
    }

    public Ba(com.ironsource.C3212p0 adTools, com.ironsource.W2 bannerContainer, long j, long j2, com.ironsource.J2 bannerAdProperties, com.ironsource.InterfaceC3383ya strategyListener, com.ironsource.N2 bannerAdUnitFactory, com.ironsource.Ef taskScheduler, com.ironsource.InterfaceC3216p4 timeProvider, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f5625a = adTools;
        this.b = bannerContainer;
        this.c = j;
        this.d = j2;
        this.e = bannerAdProperties;
        this.f = strategyListener;
        this.g = bannerAdUnitFactory;
        this.h = taskScheduler;
        this.i = timeProvider;
        this.j = z;
        this.k = new com.ironsource.Ba.b();
        this.l = new com.ironsource.Ba.c();
        this.m = new com.ironsource.Ba.a();
        this.n = new com.ironsource.Da(this, false, 2, null);
    }

    public final com.ironsource.C3212p0 a() {
        return this.f5625a;
    }

    public final void b(com.ironsource.InterfaceC3383ya interfaceC3383ya) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC3383ya, "<set-?>");
        this.f = interfaceC3383ya;
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void c() {
        this.n.c();
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void d() {
        this.n.d();
    }

    public final com.ironsource.O2 e() {
        return this.m;
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void f() {
        this.n.f();
    }

    public final com.ironsource.M0 g() {
        return this.k;
    }

    public final com.ironsource.InterfaceC3391z0 h() {
        return this.l;
    }

    public final com.ironsource.J2 i() {
        return this.e;
    }

    public final com.ironsource.N2 j() {
        return this.g;
    }

    public final com.ironsource.W2 k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    public final com.ironsource.La m() {
        return this.n;
    }

    public final com.ironsource.InterfaceC3383ya n() {
        return this.f;
    }

    public final com.ironsource.Ef o() {
        return this.h;
    }

    public final com.ironsource.InterfaceC3216p4 p() {
        return this.i;
    }

    public final long q() {
        return this.d;
    }

    public final void r() {
        this.f5625a.e().h().h("Banner view is not visible");
    }

    public final void a(com.ironsource.M0 m0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m0, "<set-?>");
        this.k = m0;
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void b() {
        this.n.b();
    }

    public final void a(com.ironsource.InterfaceC3391z0 interfaceC3391z0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC3391z0, "<set-?>");
        this.l = interfaceC3391z0;
    }

    public final void a(com.ironsource.O2 o2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o2, "<set-?>");
        this.m = o2;
    }

    public final void a(com.ironsource.La la) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(la, "<set-?>");
        this.n = la;
    }

    public final void a(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.f5625a.e().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(com.ironsource.C3301u0 adUnitCallback, com.ironsource.L2 currentAdUnit, com.ironsource.L2 l2, com.ironsource.AbstractC3036f3 reloadReason, boolean z, java.lang.Long l) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.b.getViewBinder(), this.l);
        com.unity3d.mediation.LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 != null) {
            this.f.onAdLoaded(c2);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(com.ironsource.C3212p0.a(this.f5625a, "adInfo is null in handleLoadSuccess", (java.lang.String) null, 2, (java.lang.Object) null));
        }
        if (l2 != null) {
            l2.a(false);
        }
        if (z) {
            this.n = new com.ironsource.Ha(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, com.ironsource.L2 currentAdUnit, com.ironsource.AbstractC3036f3 reloadReason, boolean z, boolean z2, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f.b(ironSourceError);
        if (z2) {
            this.n = new com.ironsource.Ha(this, currentAdUnit);
        } else if (z) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason, this.j);
        }
    }

    public final void a(final com.ironsource.L2 currentAdUnit, final com.ironsource.AbstractC3036f3 reloadReason, final java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        com.ironsource.C3312ub.a(this.f5625a, new java.lang.Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Ba.a(com.ironsource.Ba.this, currentAdUnit, reloadReason, l);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Ba this$0, com.ironsource.L2 currentAdUnit, com.ironsource.AbstractC3036f3 reloadReason, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (com.ironsource.Cg.a(this$0.b, new android.graphics.Rect())) {
            com.ironsource.C3312ub.a((com.ironsource.C3312ub) this$0.f5625a, com.ironsource.AbstractRunnableC3136ke.f6349a.a(this$0.new d(currentAdUnit, reloadReason)), 0L, 2, (java.lang.Object) null);
        } else if (!this$0.b.getViewTreeObserver().isAlive()) {
            com.ironsource.C3312ub.a((com.ironsource.C3312ub) this$0.f5625a, com.ironsource.AbstractRunnableC3136ke.f6349a.a(this$0.new e(currentAdUnit, l)), 0L, 2, (java.lang.Object) null);
        } else {
            this$0.b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    public /* synthetic */ Ba(com.ironsource.C3212p0 c3212p0, com.ironsource.W2 w2, long j, long j2, com.ironsource.J2 j22, com.ironsource.InterfaceC3383ya interfaceC3383ya, com.ironsource.N2 n2, com.ironsource.Ef ef, com.ironsource.InterfaceC3216p4 interfaceC3216p4, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3212p0, w2, j, j2, j22, interfaceC3383ya, n2, (i & 128) != 0 ? new com.ironsource.S6(com.ironsource.T6.a(c3212p0.a())) : ef, interfaceC3216p4, z);
    }

    public static /* synthetic */ void a(com.ironsource.Ba ba, com.ironsource.L2 l2, com.ironsource.AbstractC3036f3 abstractC3036f3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ba.a(l2, abstractC3036f3, z);
    }

    public final void a(com.ironsource.L2 currentAdUnit, com.ironsource.AbstractC3036f3 reloadReason, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        com.ironsource.L2 a2 = this.g.a(false);
        com.ironsource.Ia ia = new com.ironsource.Ia(this, currentAdUnit, a2, this.i.a(), z);
        a(reloadReason);
        this.n = ia;
        a2.a(this.k);
    }

    private final void a(com.ironsource.AbstractC3036f3 abstractC3036f3) {
        this.f5625a.e().h().a(abstractC3036f3.c(), abstractC3036f3.b(), abstractC3036f3.a());
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void a(com.ironsource.InterfaceC3383ya listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = listener;
    }
}
