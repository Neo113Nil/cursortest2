package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class O implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.a l = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.a(null);
    public static final int m = 8;
    public static final java.lang.String n = "VastFullscreenAdImpl";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7405a;
    public final com.moloco.sdk.internal.ortb.model.C3415e b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y c;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e;
    public final kotlinx.coroutines.CoroutineScope f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L g;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> h;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> i;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> j;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastFullscreenAdImpl$show$1", f = "VastFullscreenAd.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7406a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x d;

        public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            public a(java.lang.Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O) this.receiver).n();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.b> continuation) {
            super(2, continuation);
            this.c = wVar;
            this.d = xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.new b(this.c, this.d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v19, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v21, types: [T, com.moloco.sdk.acm.CountEvent] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, com.moloco.sdk.acm.CountEvent] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Integer e;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7406a;
            boolean z = false;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.g.d();
                    if (d instanceof com.moloco.sdk.internal.v.a) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) d).a();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar = this.c;
                        if (wVar != null) {
                            wVar.a(cVar);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!(d instanceof com.moloco.sdk.internal.v.b)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) d).a();
                    if (!aVar.j().j().exists()) {
                        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.n, "VAST ad media file does not exist", null, false, 12, null);
                        java.io.File j = aVar.j().j();
                        com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.f7337a;
                        java.io.File cacheDir = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.f7405a.getCacheDir();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                        com.moloco.sdk.internal.utils.e a2 = fVar.a(cacheDir);
                        java.lang.String b = (a2 == null || (e = a2.e()) == null) ? null : fVar.b(e.intValue());
                        java.lang.String a3 = fVar.a(j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.f7405a);
                        java.io.File parentFile = j.getParentFile();
                        java.lang.Integer a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.g.a();
                        java.lang.String a5 = a4 != null ? fVar.a(a4.intValue()) : null;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: ");
                        sb.append(b);
                        sb.append("\n                    - storage_bucket_at_load: ");
                        sb.append(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.g.b());
                        sb.append("\n                    - download_bucket_at_show: ");
                        sb.append(a5);
                        sb.append("\n                    - cache_location_type: ");
                        sb.append(a3);
                        sb.append("\n                    - cache_dir_exists: ");
                        sb.append(parentFile != null && parentFile.exists());
                        sb.append("\n                ");
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.n, kotlin.text.StringsKt.trimIndent(sb.toString()), null, false, 12, null);
                        com.moloco.sdk.acm.TimerEvent c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.g.c();
                        if (c != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.d.recordTimerEvent(c);
                        }
                        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.a0.c());
                        if (parentFile != null && parentFile.exists()) {
                            z = true;
                        }
                        ?? withTag = countEvent.withTag("cache_dir_exists", java.lang.String.valueOf(z));
                        objectRef.element = withTag;
                        if (b != null) {
                            objectRef.element = withTag.withTag("storage_bucket_at_show", b);
                        }
                        java.lang.String b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.g.b();
                        if (b2 != null) {
                            objectRef.element = ((com.moloco.sdk.acm.CountEvent) objectRef.element).withTag("storage_bucket_at_load", b2);
                        }
                        if (a5 != null) {
                            objectRef.element = ((com.moloco.sdk.acm.CountEvent) objectRef.element).withTag("download_bucket_at_show", a5);
                        }
                        if (a3 != null) {
                            objectRef.element = ((com.moloco.sdk.acm.CountEvent) objectRef.element).withTag("cache_location_type", a3);
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.d.recordCountEvent((com.moloco.sdk.acm.CountEvent) objectRef.element);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar2 = this.c;
                        if (wVar2 != null) {
                            wVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.d);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion companion = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.INSTANCE;
                    android.content.Context context = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.f7405a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar = this.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.b.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.c;
                    java.lang.String bundle = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.b.getBundle();
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.d;
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O o = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this;
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar3 = this.c;
                    kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O$b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this, wVar3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) obj2);
                        }
                    };
                    this.f7406a = 1;
                    if (companion.a(aVar, context, xVar, aVar2, yVar, bundle, metricsRecorder, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.this.h.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                throw th;
            }
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            o.a(bVar, wVar);
            return kotlin.Unit.INSTANCE;
        }
    }

    public O(android.content.Context context, com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m decLoader, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7405a = context;
        this.b = bid;
        this.c = watermark;
        this.d = metricsRecorder;
        this.e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f7361a;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.f = CoroutineScope;
        this.g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L(bid, CoroutineScope, loadVast, decLoader, z, metricsRecorder);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow;
        this.i = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.j = MutableStateFlow2;
        this.k = MutableStateFlow2;
    }

    public static java.lang.Object h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O o) {
        return kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(o.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.j.setValue(java.lang.Boolean.TRUE);
        this.h.setValue(java.lang.Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.f, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return this.i;
    }

    public final void p() {
        this.h.setValue(java.lang.Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        this.g.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.b(wVar, options, null), 3, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.g.b)) {
            p();
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.C0287b.b)) {
            p();
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.d.b)) {
            p();
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.i.b)) {
            if (wVar != null) {
                wVar.a(true);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.j.b)) {
            if (wVar != null) {
                wVar.a();
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.c.b)) {
            if (wVar != null) {
                wVar.a(false);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.a.b)) {
            if (wVar != null) {
                wVar.b();
            }
        } else if (event instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) {
            if (wVar != null) {
                wVar.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) event).a());
            }
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.h.b) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.e.b)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
