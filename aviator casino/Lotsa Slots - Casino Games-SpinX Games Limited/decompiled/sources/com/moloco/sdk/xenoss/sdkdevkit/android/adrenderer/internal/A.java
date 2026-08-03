package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class A implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7362a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.Companion f;
    public final java.lang.String g;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i i;
    public final kotlinx.coroutines.CoroutineScope j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e l;
    public boolean m;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> n;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> o;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> p;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> q;

    public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.Unit> {
        public a(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
            a(dVar);
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public b(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.class, "destroy", "destroy()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A) this.receiver).destroy();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public c(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.class, "onForciblyClosed", "onForciblyClosed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public A(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y mraidAdLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e mraidBaseAd, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenController, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.Companion mraidActivity, java.lang.String str, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidActivity, "mraidActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7362a = context;
        this.b = watermark;
        this.c = mraidAdLoader;
        this.d = mraidBaseAd;
        this.e = mraidFullscreenController;
        this.f = mraidActivity;
        this.g = str;
        this.h = metricsRecorder;
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b;
        this.j = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
    }

    public static java.lang.Object b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A a2) {
        return kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(a2.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static final kotlin.Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        if (eVar != null) {
            eVar.a();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.j, null, 1, null);
        this.d.destroy();
        this.n.setValue(java.lang.Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.c.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return this.o;
    }

    public final void n() {
        this.p.setValue(java.lang.Boolean.TRUE);
    }

    public static final kotlin.Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        if (eVar != null) {
            eVar.b();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        this.k = aVar;
        this.d.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.a(this));
        this.c.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        this.d.a(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
            }
        });
        this.d.a(new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.this, (java.lang.String) obj);
            }
        });
        this.l = eVar;
        this.m = true;
        com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a2 = this.c.a();
        if (a2 instanceof com.moloco.sdk.internal.v.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) ((com.moloco.sdk.internal.v.a) a2).a();
            if (eVar != null) {
                eVar.a(dVar);
                return;
            }
            return;
        }
        if (a2 instanceof com.moloco.sdk.internal.v.b) {
            if (this.f.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((com.moloco.sdk.internal.v.b) a2).a(), this.e, this.f7362a, options, this.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.b(this), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.c(this), this.d.T(), new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
                }
            }, this.g, this.h)) {
                this.n.setValue(java.lang.Boolean.TRUE);
                return;
            } else {
                if (eVar != null) {
                    eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.j);
                    return;
                }
                return;
            }
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A a2, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        a2.e.a(url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
        return kotlin.Unit.INSTANCE;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        if (this.m) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.l;
            if (eVar != null) {
                eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                return;
            }
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar = this.k;
        if (aVar != null) {
            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
        }
    }
}
