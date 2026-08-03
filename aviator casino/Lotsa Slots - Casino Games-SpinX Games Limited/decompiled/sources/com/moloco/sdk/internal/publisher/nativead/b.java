package com.moloco.sdk.internal.publisher.nativead;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.publisher.NativeAd, com.moloco.sdk.internal.publisher.s {
    public static final com.moloco.sdk.internal.publisher.nativead.b.a p = new com.moloco.sdk.internal.publisher.nativead.b.a(null);
    public static final int q = 8;
    public static final java.lang.String r = "NativeAdImpl";

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7119a;
    public final com.moloco.sdk.internal.publisher.nativead.c b;
    public final com.moloco.sdk.internal.publisher.nativead.a c;
    public final com.moloco.sdk.internal.services.InterfaceC3435f d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i g;
    public final com.moloco.sdk.internal.publisher.C3417a h;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder i;
    public com.moloco.sdk.publisher.NativeAd.InteractionListener j;
    public final com.moloco.sdk.publisher.AdFormatType k;
    public final kotlinx.coroutines.CoroutineScope l;
    public final com.moloco.sdk.acm.TimerEvent m;
    public com.moloco.sdk.internal.publisher.nativead.d n;
    public kotlinx.coroutines.Job o;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdImpl$load$1", f = "NativeAdImpl.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"adLoadListenerWithTracker"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.b$b, reason: collision with other inner class name */
    public static final class C0192b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7120a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.publisher.AdLoad.Listener d;
        public final /* synthetic */ java.lang.String e;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.b$b$a */
        public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            public a(java.lang.Object obj) {
                super(0, obj, com.moloco.sdk.internal.publisher.nativead.b.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.internal.publisher.nativead.b) this.receiver).handleGeneralAdClick();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0192b(com.moloco.sdk.publisher.AdLoad.Listener listener, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.nativead.b.C0192b> continuation) {
            super(2, continuation);
            this.d = listener;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.nativead.b.C0192b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.nativead.b.this.new C0192b(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.internal.publisher.y yVar;
            java.lang.Object obj2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.publisher.nativead.b bVar = com.moloco.sdk.internal.publisher.nativead.b.this;
                com.moloco.sdk.internal.publisher.y a2 = bVar.a(bVar.m, this.d);
                com.moloco.sdk.internal.publisher.nativead.c cVar = com.moloco.sdk.internal.publisher.nativead.b.this.b;
                java.lang.String str = this.e;
                com.moloco.sdk.acm.TimerEvent timerEvent = com.moloco.sdk.internal.publisher.nativead.b.this.m;
                this.f7120a = a2;
                this.b = 1;
                java.lang.Object b = cVar.b(str, timerEvent, a2, this);
                if (b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                yVar = a2;
                obj2 = b;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (com.moloco.sdk.internal.publisher.y) this.f7120a;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = ((kotlin.Result) obj).getValue();
            }
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj2);
            if (m10801exceptionOrNullimpl != null) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.nativead.b.r, "Failed to load native ad.", m10801exceptionOrNullimpl, false, 8, null);
                return kotlin.Unit.INSTANCE;
            }
            com.moloco.sdk.internal.publisher.nativead.c.b bVar2 = (com.moloco.sdk.internal.publisher.nativead.c.b) obj2;
            com.moloco.sdk.internal.publisher.nativead.b bVar3 = com.moloco.sdk.internal.publisher.nativead.b.this;
            bVar3.a(new com.moloco.sdk.internal.publisher.nativead.d(bVar3.f7119a, bVar2.d(), bVar2.e(), bVar3.d, bVar3.e, bVar3.k, bVar3.g, bVar3.f, bVar3.i));
            bVar3.getAssets().a(bVar2.f());
            bVar3.getAssets().a(new com.moloco.sdk.internal.publisher.nativead.b.C0192b.a(bVar3));
            yVar.a(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(bVar3.f7119a, kotlin.coroutines.jvm.internal.Boxing.boxFloat(bVar2.d().getPrice()), null, 4, null), bVar2.d().getExt().getSdkEvents());
            return kotlin.Unit.INSTANCE;
        }
    }

    public b(java.lang.String adUnitId, com.moloco.sdk.internal.publisher.nativead.c nativeAdLoader, com.moloco.sdk.internal.publisher.nativead.a assets, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.internal.publisher.C3417a createLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assets, "assets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7119a = adUnitId;
        this.b = nativeAdLoader;
        this.c = assets;
        this.d = appLifecycleTrackerService;
        this.e = customUserEventBuilderService;
        this.f = externalLinkHandler;
        this.g = persistentHttpRequest;
        this.h = createLoadTimeoutManager;
        this.i = metricsRecorder;
        this.k = com.moloco.sdk.publisher.AdFormatType.NATIVE;
        this.l = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.j.c());
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.l, null, 1, null);
        getAssets().a();
        setInteractionListener(null);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.h.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public com.moloco.sdk.publisher.NativeAd.InteractionListener getInteractionListener() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleGeneralAdClick() {
        com.moloco.sdk.publisher.NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        com.moloco.sdk.internal.publisher.nativead.d dVar = this.n;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleImpression() {
        com.moloco.sdk.publisher.NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        com.moloco.sdk.internal.publisher.nativead.d dVar = this.n;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return getAssets().c() != null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public synchronized void load(java.lang.String bidResponseJson, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        kotlinx.coroutines.Job job = this.o;
        if (job != null && job.isActive()) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, r, "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, r, "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new com.moloco.sdk.internal.publisher.nativead.b.C0192b(listener, bidResponseJson, null), 3, null);
            this.o = launch$default;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.h.setCreateAdObjectStartTime(j);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void setInteractionListener(com.moloco.sdk.publisher.NativeAd.InteractionListener interactionListener) {
        this.j = interactionListener;
    }

    public final kotlinx.coroutines.Job c() {
        return this.o;
    }

    public final kotlinx.coroutines.CoroutineScope e() {
        return this.l;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public com.moloco.sdk.internal.publisher.nativead.a getAssets() {
        return this.c;
    }

    public final com.moloco.sdk.internal.publisher.nativead.d a() {
        return this.n;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.d dVar) {
        this.n = dVar;
    }

    public final void a(kotlinx.coroutines.Job job) {
        this.o = job;
    }

    public final com.moloco.sdk.internal.publisher.y a(com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        return com.moloco.sdk.internal.publisher.C3423g.a(listener, timerEvent, this.k, this.i, null, 16, null);
    }
}
