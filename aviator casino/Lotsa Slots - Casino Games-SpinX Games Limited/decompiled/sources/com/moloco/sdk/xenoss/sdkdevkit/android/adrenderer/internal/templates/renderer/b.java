package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

/* loaded from: classes5.dex */
public final class b extends android.webkit.WebView {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.a i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.a(null);
    public static final int j = 8;
    public static final java.lang.String k = "TemplateWebView";
    public static final java.lang.String l = "webview_version";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i f7567a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h b;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c d;
    public final kotlinx.coroutines.CoroutineScope e;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> f;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> g;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2", f = "TemplateWebView.kt", i = {0, 0}, l = {148}, m = "invokeSuspend", n = {"timerEvent", "webViewVersion"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b, reason: collision with other inner class name */
    public static final class C0254b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<kotlin.Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7568a;
        public java.lang.Object b;
        public int c;
        public final /* synthetic */ java.lang.String e;
        public final /* synthetic */ long f;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "TemplateWebView.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7569a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b b;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$a, reason: collision with other inner class name */
            public static final class C0255a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7570a;
                public /* synthetic */ boolean b;
                public /* synthetic */ java.lang.Object c;

                public C0255a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0255a> continuation) {
                    super(3, continuation);
                }

                public final java.lang.Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0255a c0255a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0255a(continuation);
                    c0255a.b = z;
                    c0255a.c = lVar;
                    return c0255a.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> continuation) {
                    return a(bool.booleanValue(), lVar, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7570a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l) this.c);
                }
            }

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$b, reason: collision with other inner class name */
            public static final class C0256b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7571a;
                public /* synthetic */ java.lang.Object b;

                public C0256b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0256b> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlin.Pair<java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> pair, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0256b) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0256b c0256b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0256b(continuation);
                    c0256b.b = obj;
                    return c0256b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7571a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Pair pair = (kotlin.Pair) this.b;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a> continuation) {
                super(2, continuation);
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7569a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow flowCombine = kotlinx.coroutines.flow.FlowKt.flowCombine(this.b.d.b(), this.b.d.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0255a(null));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0256b c0256b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a.C0256b(null);
                    this.f7569a = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(flowCombine, c0256b, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0254b(java.lang.String str, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b> continuation) {
            super(2, continuation);
            this.e = str;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<kotlin.Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.new C0254b(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.acm.TimerEvent startTimerEvent;
            java.lang.Object m12302withTimeoutOrNullKLykuaI;
            java.lang.String str;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                startTimerEvent = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.r.c());
                java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.b();
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Loading ad in webView, with webview version: " + b, null, false, 12, null);
                try {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.loadDataWithBaseURL(null, this.e, "text/html", "UTF-8", null);
                    long j = this.f;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this, null);
                    this.f7568a = startTimerEvent;
                    this.b = b;
                    this.c = 1;
                    m12302withTimeoutOrNullKLykuaI = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j, aVar, this);
                    if (m12302withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = b;
                } catch (java.lang.Exception e) {
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "loadHtml failed to load the provided html", e, false, 8, null);
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c;
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    com.moloco.sdk.acm.CountEvent withTag = countEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "invalid_url").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, b));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "invalid_url").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, b));
                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.b);
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) this.b;
                startTimerEvent = (com.moloco.sdk.acm.TimerEvent) this.f7568a;
                kotlin.ResultKt.throwOnFailure(obj);
                m12302withTimeoutOrNullKLykuaI = obj;
            }
            if (m12302withTimeoutOrNullKLykuaI == null) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Ad failed to load due to timeout", null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c;
                com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                com.moloco.sdk.acm.CountEvent withTag2 = countEvent2.withTag(dVar3.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
                metricsRecorder2.recordCountEvent(withTag2.withTag(dVar4.c(), "timeout_error").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar3.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar4.c(), "timeout_error").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
                return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f);
            }
            boolean booleanValue = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.d.b().getValue().booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l value = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.d.a().getValue();
            if (value != null) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Ad failed to load due to unrecoverable error: " + value.name(), null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c;
                com.moloco.sdk.acm.CountEvent countEvent3 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.d;
                com.moloco.sdk.acm.CountEvent withTag3 = countEvent3.withTag(dVar5.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar6 = com.moloco.sdk.internal.client_metrics_data.d.b;
                metricsRecorder3.recordCountEvent(withTag3.withTag(dVar6.c(), value.name()).withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar5.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar6.c(), value.name()).withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
                return new com.moloco.sdk.internal.v.a(value);
            }
            if (booleanValue) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Ad loaded successfully in webView", null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c;
                com.moloco.sdk.acm.CountEvent countEvent4 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar7 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder4.recordCountEvent(countEvent4.withTag(dVar7.c(), "success").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar7.c(), "success").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
                return new com.moloco.sdk.internal.v.b(kotlin.Unit.INSTANCE);
            }
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Ad failed to load due to unknown error", null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c;
            com.moloco.sdk.acm.CountEvent countEvent5 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.G.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar8 = com.moloco.sdk.internal.client_metrics_data.d.d;
            com.moloco.sdk.acm.CountEvent withTag4 = countEvent5.withTag(dVar8.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar9 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder5.recordCountEvent(withTag4.withTag(dVar9.c(), "unknown_error").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.c.recordTimerEvent(startTimerEvent.withTag(dVar8.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar9.c(), "unknown_error").withTag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.l, str));
            return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f7584a);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1", f = "TemplateWebView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7572a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a c;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f7573a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a b;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1$1", f = "TemplateWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a, reason: collision with other inner class name */
            public static final class C0257a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7574a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a c;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0258a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f7575a;

                    static {
                        int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.values().length];
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.d.ordinal()] = 1;
                        } catch (java.lang.NoSuchFieldError unused) {
                        }
                        try {
                            iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.c.ordinal()] = 2;
                        } catch (java.lang.NoSuchFieldError unused2) {
                        }
                        f7575a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0257a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0257a> continuation) {
                    super(2, continuation);
                    this.b = bVar;
                    this.c = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0257a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0257a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7574a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    android.webkit.WebSettings settings = this.b.getSettings();
                    int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0257a.C0258a.f7575a[this.c.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i != 1 ? i != 2 ? this.b.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return kotlin.Unit.INSTANCE;
                }
            }

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebView$startCollectingPlaylistItemDisplaying$1$1", f = "TemplateWebView.kt", i = {0, 0}, l = {87}, m = "emit", n = {"this", "creativeType"}, s = {"L$0", "L$1"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$b, reason: collision with other inner class name */
            public static final class C0259b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public java.lang.Object f7576a;
                public java.lang.Object b;
                public /* synthetic */ java.lang.Object c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a<T> d;
                public int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0259b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a<? super T> aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0259b> continuation) {
                    super(continuation);
                    this.d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.c = obj;
                    this.e |= Integer.MIN_VALUE;
                    return this.d.emit(null, this);
                }
            }

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
                this.f7573a = bVar;
                this.b = aVar;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24)(1:25))|12|(1:14)(1:18)|15|16))|28|6|7|(0)(0)|12|(0)(0)|15|16) */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0107, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
            
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Failed to access WebView settings", r0, false, 8, null);
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00a3 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x003a, B:12:0x007b, B:14:0x00a3, B:18:0x00e6, B:22:0x0049), top: B:7:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00e6 A[Catch: Exception -> 0x0107, TRY_LEAVE, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x003a, B:12:0x007b, B:14:0x00a3, B:18:0x00e6, B:22:0x0049), top: B:7:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0259b c0259b;
                int i;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a<T> aVar2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a aVar3 = aVar;
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0259b) {
                    c0259b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0259b) continuation;
                    int i2 = c0259b.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0259b.e = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj = c0259b.c;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0259b.e;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Playlist item displaying event received: " + aVar3, null, false, 12, null);
                            kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0257a c0257a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0257a(this.f7573a, aVar3, null);
                            c0259b.f7576a = this;
                            c0259b.b = aVar3;
                            c0259b.e = 1;
                            if (kotlinx.coroutines.BuildersKt.withContext(main, c0257a, c0259b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar2 = this;
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a) c0259b.b;
                            aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a) c0259b.f7576a;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Set playback: " + aVar2.f7573a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                        if (aVar3 != com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.d) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Playlist item displaying event is MRAID, setting orientation to: " + aVar2.b.e().getValue(), null, false, 12, null);
                            aVar2.f7573a.f.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.a.i.a(aVar2.b.e().getValue()));
                            aVar2.b.d();
                        } else {
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Playlist item displaying event is not MRAID, setting orientation to none", null, false, 12, null);
                            aVar2.f7573a.f.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                c0259b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.C0259b(this, continuation);
                java.lang.Object obj2 = c0259b.c;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0259b.e;
                if (i != 0) {
                }
                com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Set playback: " + aVar2.f7573a.getSettings().getMediaPlaybackRequiresUserGesture(), null, false, 12, null);
                if (aVar3 != com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a.d) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7572a;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a> c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this.b.c();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.this, this.c);
                    this.f7572a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            } catch (java.lang.Exception e) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.k, "Error collecting playlist item displaying events", e, false, 8, null);
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, hVar, metricsRecorder, r5, (i2 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c(iVar, metricsRecorder, r5) : cVar);
        boolean z2 = (i2 & 16) != 0 ? true : z;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> getOrientation$moloco_sdk_release() {
        return this.f;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> getUnrecoverableError() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, k, "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.e, null, 1, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> a() {
        return this.h;
    }

    public final java.lang.String b() {
        java.lang.String str;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.content.pm.PackageInfo currentWebViewPackage = android.webkit.WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null && (str = currentWebViewPackage.versionName) != null) {
                    return str;
                }
                return "unknown";
            }
            android.content.pm.PackageManager packageManager = getContext().getPackageManager();
            for (java.lang.String str2 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"com.google.android.webview", "com.android.webview", "com.android.chrome"})) {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, k, "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                java.lang.String versionName = packageInfo.versionName;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
                if (versionName.length() > 0) {
                    java.lang.String versionName2 = packageInfo.versionName;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionName2, "versionName");
                    return versionName2;
                }
            }
            return "unknown";
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, k, "WebView version retrieval exception", e, false, 8, null);
            return "unknown";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i contentLoadedEventHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h playListItemDisplayingEventHandler, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c webViewClientImpl) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.f7567a = contentLoadedEventHandler;
        this.b = playListItemDisplayingEventHandler;
        this.c = metricsRecorder;
        this.d = webViewClientImpl;
        this.e = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.common_adapter_internal.AdapterAccess.INSTANCE.DispatcherProvider().getMain());
        this.f = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d, false, 2, null));
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.g = webViewClientImpl.a();
        this.h = webViewClientImpl.c();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c(mraidCommunicationHub, null), 3, null);
    }

    public final java.lang.Object a(java.lang.String str, long j2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<kotlin.Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.C0254b(str, j2, null), continuation);
    }
}
