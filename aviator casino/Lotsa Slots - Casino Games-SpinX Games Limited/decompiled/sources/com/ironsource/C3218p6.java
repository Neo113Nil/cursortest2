package com.ironsource;

/* renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3218p6 implements com.ironsource.InterfaceC3093i6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Jb f6548a;
    private final com.ironsource.V0 b;
    private final com.ironsource.AbstractC3355x0 c;
    private com.ironsource.InterfaceC3271s6 d;
    private final kotlin.jvm.functions.Function2<com.ironsource.C, com.ironsource.I, com.ironsource.C3075h6> e;
    private final com.ironsource.Ef f;
    private final com.ironsource.InterfaceC3216p4 g;
    private com.ironsource.C3110j6 h;
    private com.ironsource.C3218p6.b i;
    private com.ironsource.C3218p6.a j;
    private final com.ironsource.Eg k;
    private com.ironsource.Ef.a l;
    private java.lang.Long m;

    /* renamed from: com.ironsource.p6$a */
    public interface a {
        void a(com.ironsource.C3218p6 c3218p6, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

        void a(com.ironsource.C3218p6 c3218p6, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.p6$b */
    public interface b {
        void a(com.ironsource.C3218p6 c3218p6);

        void b(com.ironsource.C3218p6 c3218p6, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

        void b(com.ironsource.C3218p6 c3218p6, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);

        void c(com.ironsource.C3218p6 c3218p6, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.p6$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6549a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6549a = iArr;
        }
    }

    /* renamed from: com.ironsource.p6$e */
    /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.ironsource.C, com.ironsource.I, com.ironsource.C3075h6> {
        e(java.lang.Object obj) {
            super(2, obj, com.ironsource.C3218p6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C3075h6 invoke(com.ironsource.C p0, com.ironsource.I p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
            return ((com.ironsource.C3218p6) this.receiver).a(p0, p1);
        }
    }

    /* renamed from: com.ironsource.p6$f */
    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.ironsource.C3218p6, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3218p6.f f6551a = new com.ironsource.C3218p6.f();

        f() {
            super(1);
        }

        public final void a(com.ironsource.C3218p6 weak) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weak, "$this$weak");
            com.ironsource.C3218p6.b bVar = weak.i;
            if (bVar != null) {
                bVar.a(weak);
            }
            weak.k.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.ironsource.C3218p6 c3218p6) {
            a(c3218p6);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3218p6(com.ironsource.Jb mediationServices, com.ironsource.V0 adUnitTools, com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.InterfaceC3271s6 fullscreenListener, com.ironsource.Gg gg, kotlin.jvm.functions.Function2<? super com.ironsource.C, ? super com.ironsource.I, com.ironsource.C3075h6> function2, com.ironsource.Ef taskScheduler, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f6548a = mediationServices;
        this.b = adUnitTools;
        this.c = adUnitData;
        this.d = fullscreenListener;
        this.e = function2;
        this.f = taskScheduler;
        this.g = currentTimeProvider;
        this.k = a(gg);
    }

    private final void i() {
        java.lang.String c2 = c();
        if (c2.length() > 0) {
            this.f6548a.b().b(c2, b());
            com.ironsource.G3 a2 = this.f6548a.p().a(c2, b());
            if (a2.d()) {
                this.b.e().a().b(c2, a2.e());
            }
        }
    }

    protected final void finalize() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.b, "finalizing ad unit", (java.lang.String) null, 2, (java.lang.Object) null));
        com.ironsource.Ef.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ironsource.B b(com.ironsource.C3218p6 this$0, com.ironsource.C instanceData, com.ironsource.I adInstancePayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.functions.Function2 function2 = this$0.e;
        if (function2 == null) {
            function2 = new com.ironsource.C3218p6.e(this$0);
        }
        com.ironsource.C3075h6 c3075h6 = (com.ironsource.C3075h6) function2.invoke(instanceData, adInstancePayload);
        c3075h6.a(this$0);
        return c3075h6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String c() {
        return this.c.l();
    }

    private final com.ironsource.InterfaceC3350wd f() {
        int i = com.ironsource.C3218p6.c.f6549a[b().ordinal()];
        if (i == 1) {
            return this.f6548a.B();
        }
        if (i != 2) {
            return null;
        }
        return this.f6548a.F();
    }

    private final com.ironsource.InterfaceC3187nb<kotlin.Unit> g() {
        if (!this.k.h()) {
            return new com.ironsource.InterfaceC3187nb.a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.f6548a.p().a(c(), b()).d()) {
            return new com.ironsource.InterfaceC3187nb.a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.f6548a.g().a(this.c.b().c()).d()) {
            return new com.ironsource.InterfaceC3187nb.b(kotlin.Unit.INSTANCE);
        }
        return new com.ironsource.InterfaceC3187nb.a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        com.ironsource.Ef.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        long b2 = this.b.b(b());
        com.ironsource.Ef ef = this.f;
        com.ironsource.Ef.b a2 = com.ironsource.T6.a(this, com.ironsource.C3218p6.f.f6551a);
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        this.l = ef.a(a2, kotlin.time.DurationKt.toDuration(b2, kotlin.time.DurationUnit.MILLISECONDS));
    }

    public final com.ironsource.InterfaceC3271s6 d() {
        return this.d;
    }

    public final com.unity3d.mediation.LevelPlayAdInfo e() {
        com.ironsource.B e2 = this.k.e();
        if (e2 != null) {
            return e2.e();
        }
        return null;
    }

    public final void a(com.ironsource.InterfaceC3271s6 interfaceC3271s6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC3271s6, "<set-?>");
        this.d = interfaceC3271s6;
    }

    public final void a(com.ironsource.C3218p6.b loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.b, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.i = loadListener;
        this.m = java.lang.Long.valueOf(this.g.a());
        this.b.a(new com.ironsource.C3265s0(this.c.b()));
        com.ironsource.E e2 = new com.ironsource.E() { // from class: com.ironsource.p6$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final com.ironsource.B a(com.ironsource.C c2, com.ironsource.I i) {
                com.ironsource.B b2;
                b2 = com.ironsource.C3218p6.b(com.ironsource.C3218p6.this, c2, i);
                return b2;
            }
        };
        this.b.e().e().a(this.c.u());
        this.k.a(e2);
    }

    @Override // com.ironsource.F
    public void b(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.k.d(instance);
        this.b.e().a().g(c());
        this.f6548a.i().b(com.unity3d.mediation.a.a(b()));
    }

    /* renamed from: com.ironsource.p6$d */
    public static final class d implements com.ironsource.Mg {
        d() {
        }

        @Override // com.ironsource.Mg
        public void a(int i, java.lang.String errorReason) {
            java.lang.Long l;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            java.lang.Long l2 = com.ironsource.C3218p6.this.m;
            if (l2 != null) {
                l = java.lang.Long.valueOf(com.ironsource.C3218p6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            com.ironsource.C3218p6.this.b.e().e().a(l != null ? l.longValue() : 0L, i, errorReason, com.ironsource.C3218p6.this.c.u());
            com.ironsource.C3218p6.b bVar = com.ironsource.C3218p6.this.i;
            if (bVar != null) {
                bVar.b(com.ironsource.C3218p6.this, new com.ironsource.mediationsdk.logger.IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.Mg
        public void b(com.ironsource.B instance) {
            java.lang.Long l;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            java.lang.Long l2 = com.ironsource.C3218p6.this.m;
            if (l2 != null) {
                l = java.lang.Long.valueOf(com.ironsource.C3218p6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            com.ironsource.C3218p6.this.b.e().e().a(l != null ? l.longValue() : 0L, com.ironsource.C3218p6.this.c.u());
            com.ironsource.C3218p6.this.h();
            com.ironsource.C3218p6.b bVar = com.ironsource.C3218p6.this.i;
            if (bVar != null) {
                bVar.b(com.ironsource.C3218p6.this, instance.e());
            }
        }

        @Override // com.ironsource.Mg
        public void a(com.ironsource.B instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.C3218p6.this.b.e().a().e(com.ironsource.C3218p6.this.c());
            com.ironsource.C3218p6.this.h();
            com.ironsource.C3218p6.b bVar = com.ironsource.C3218p6.this.i;
            if (bVar != null) {
                bVar.c(com.ironsource.C3218p6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC3093i6
    public void b(com.ironsource.C3075h6 fullscreenInstance) {
        com.ironsource.InterfaceC3350wd f2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        if (fullscreenInstance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        this.b.e().a().b(c());
        this.k.c();
        this.h = null;
        this.d.onClosed();
    }

    public /* synthetic */ C3218p6(com.ironsource.Jb jb, com.ironsource.V0 v0, com.ironsource.AbstractC3355x0 abstractC3355x0, com.ironsource.InterfaceC3271s6 interfaceC3271s6, com.ironsource.Gg gg, kotlin.jvm.functions.Function2 function2, com.ironsource.Ef ef, com.ironsource.InterfaceC3216p4 interfaceC3216p4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jb, v0, abstractC3355x0, interfaceC3271s6, (i & 16) != 0 ? null : gg, (i & 32) != 0 ? null : function2, (i & 64) != 0 ? new com.ironsource.S6(com.ironsource.T6.a(v0.a())) : ef, (i & 128) != 0 ? new com.ironsource.InterfaceC3216p4.a() : interfaceC3216p4);
    }

    private final com.unity3d.mediation.LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public final void a(android.app.Activity activity, com.ironsource.C3218p6.a displayListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(com.ironsource.C3212p0.a(this.b, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.j = displayListener;
        this.b.e().a().a(activity, c());
        com.ironsource.InterfaceC3187nb<kotlin.Unit> g = g();
        if (g instanceof com.ironsource.InterfaceC3187nb.a) {
            com.ironsource.mediationsdk.logger.IronSourceError b2 = ((com.ironsource.InterfaceC3187nb.a) g).b();
            ironLog.verbose(com.ironsource.C3212p0.a(this.b, b2.getErrorMessage(), (java.lang.String) null, 2, (java.lang.Object) null));
            this.b.e().a().a(c(), b2.getErrorCode(), b2.getErrorMessage(), this.k.g());
            displayListener.a(this, b2);
            return;
        }
        com.ironsource.Ef.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        com.ironsource.C3110j6 c3110j6 = new com.ironsource.C3110j6(activity);
        this.h = c3110j6;
        this.k.a((com.ironsource.K) c3110j6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ironsource.C3075h6 a(com.ironsource.C c2, com.ironsource.I i) {
        return new com.ironsource.C3075h6(new com.ironsource.V0(this.b, com.ironsource.F0.b.PROVIDER), c2, i);
    }

    private final com.ironsource.Eg a(com.ironsource.Gg gg) {
        com.ironsource.Mg a2 = a();
        if (gg != null) {
            return gg.a(a2, this);
        }
        return new com.ironsource.Eg(this.b, this.c, com.ironsource.Jb.u.c().h().u(), a2, f(), this);
    }

    private final com.ironsource.Mg a() {
        return new com.ironsource.C3218p6.d();
    }

    @Override // com.ironsource.InterfaceC3093i6
    public void a(com.ironsource.C3075h6 fullscreenInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.k.c();
        this.h = null;
        com.ironsource.C3218p6.a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        i();
        this.f6548a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(com.ironsource.B instance, com.ironsource.mediationsdk.logger.IronSourceError error) {
        com.ironsource.InterfaceC3350wd f2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.b, error.toString(), (java.lang.String) null, 2, (java.lang.Object) null));
        if (instance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        com.ironsource.C3110j6 c3110j6 = this.h;
        com.ironsource.Nd g = this.k.g();
        a(g);
        if (g == com.ironsource.Nd.CAN_RECOVER && c3110j6 != null) {
            this.k.a((com.ironsource.K) c3110j6, true);
            return;
        }
        this.k.c();
        this.h = null;
        this.b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), g);
        com.ironsource.C3218p6.a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    private final void a(com.ironsource.Nd nd) {
        if (nd == com.ironsource.Nd.CAN_RECOVER || nd == com.ironsource.Nd.NO_LOADED_ADS) {
            this.b.e().h().a(nd);
        }
    }

    @Override // com.ironsource.InterfaceC3093i6
    public void a(com.ironsource.C3075h6 fullscreenInstance, com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.b, fullscreenInstance.q(), (java.lang.String) null, 2, (java.lang.Object) null));
        this.d.a(reward);
    }

    @Override // com.ironsource.F
    public void a(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.b.e().a().a(c());
        this.d.e();
    }
}
