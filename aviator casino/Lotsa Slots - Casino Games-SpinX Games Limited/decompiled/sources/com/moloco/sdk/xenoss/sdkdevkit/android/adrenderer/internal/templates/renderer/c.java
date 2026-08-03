package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

/* loaded from: classes5.dex */
public final class c extends androidx.webkit.WebViewClientCompat {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.a s = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.a(null);
    public static final int t = 8;
    public static final java.lang.String u = "TemplateWebViewClientImpl";
    public static final int v = 5;
    public static final long w = 1000;
    public static final long x = 1000;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i f7577a;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder b;
    public final boolean c;
    public final kotlinx.coroutines.CoroutineScope d;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> e;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> f;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> g;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> h;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> i;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> j;
    public int k;
    public kotlinx.coroutines.Job l;
    public kotlinx.coroutines.Job m;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> n;
    public kotlinx.coroutines.Job o;
    public com.moloco.sdk.acm.TimerEvent p;
    public com.moloco.sdk.acm.TimerEvent q;
    public java.lang.String r;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$handleRetry$1", f = "TemplateWebviewClientImpl.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7578a;
        public final /* synthetic */ android.webkit.WebView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(android.webkit.WebView webView, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.b> continuation) {
            super(2, continuation);
            this.c = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7578a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.k * 1000) + 1000;
                this.f7578a = 1;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.e.getValue()).booleanValue()) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.u, "Skip reload; content already loaded after backoff", null, false, 12, null);
                return kotlin.Unit.INSTANCE;
            }
            kotlinx.coroutines.Job job = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.o;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            kotlinx.coroutines.Job job2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.m;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.c.reload();
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.u, "Reload attempt: " + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.k, null, false, 12, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$onPageFinished$1", f = "TemplateWebviewClientImpl.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c, reason: collision with other inner class name */
    public static final class C0260c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7579a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$c$a */
        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c f7580a;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar) {
                this.f7580a = cVar;
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.u, "Webview page pending error resolution: " + z, null, false, 12, null);
                if (!z) {
                    this.f7580a.d();
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return a(((java.lang.Boolean) obj).booleanValue(), continuation);
            }
        }

        public C0260c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.C0260c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.C0260c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.new C0260c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7579a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.n;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.C0260c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.C0260c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this);
                this.f7579a = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.TemplateWebViewClientImpl$pageFinished$3", f = "TemplateWebviewClientImpl.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7581a;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c f7582a;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar) {
                this.f7582a = cVar;
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.u, "Content loaded event received, isSuccess: " + z, null, false, 12, null);
                this.f7582a.e.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                kotlinx.coroutines.Job job = this.f7582a.o;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.f7582a.b;
                com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.P.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder.recordCountEvent(countEvent.withTag(dVar.c(), z ? "success" : com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE));
                com.moloco.sdk.acm.TimerEvent timerEvent = this.f7582a.q;
                if (timerEvent != null) {
                    this.f7582a.b.recordTimerEvent(timerEvent.withTag(dVar.c(), z ? "success" : com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE));
                }
                if (z) {
                    kotlinx.coroutines.Job job2 = this.f7582a.l;
                    if (job2 != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    this.f7582a.l = null;
                    this.f7582a.k = 0;
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return a(((java.lang.Boolean) obj).booleanValue(), continuation);
            }
        }

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7581a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this.f7577a.c();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.d.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.d.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this);
                this.f7581a = 1;
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
        }
    }

    public /* synthetic */ c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i iVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, metricsRecorder, (i & 4) != 0 ? true : z);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        kotlinx.coroutines.Job launch$default;
        super.onPageFinished(webView, str);
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Webview page finished loading has pending error: " + this.n.getValue().booleanValue(), null, false, 12, null);
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.O.c()).withTag("pending_error", java.lang.String.valueOf(this.n.getValue().booleanValue())));
        if (!this.n.getValue().booleanValue()) {
            d();
        } else {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.C0260c(null), 3, null);
            this.m = launch$default;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "HTML Page started loading", null, false, 12, null);
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.M.c()));
        this.p = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.u.c());
        this.q = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.v.c());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(final android.webkit.WebView view, android.webkit.WebResourceRequest request, final androidx.webkit.WebResourceErrorCompat error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.n.setValue(java.lang.Boolean.TRUE);
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Received error: " + error.getErrorCode() + ", with description: " + ((java.lang.Object) error.getDescription()) + " for url: " + request.getUrl() + " ad isLoaded: " + this.f.getValue().booleanValue() + ", isPageFinished: " + this.h.getValue().booleanValue(), null, false, 12, null);
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentChecker.isRequiredContent('");
        sb.append(uri);
        sb.append("');");
        view.evaluateJavascript(sb.toString(), new android.webkit.ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this, error, view, (java.lang.String) obj);
            }
        });
        super.onReceivedError(view, request, error);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(final android.webkit.WebView view, android.webkit.WebResourceRequest request, final android.webkit.WebResourceResponse errorResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.n.setValue(java.lang.Boolean.TRUE);
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, com.ironsource.X3.j.d + java.lang.Thread.currentThread().getName() + "] Received HTTP error: " + java.lang.Integer.valueOf(errorResponse.getStatusCode()) + ", with description: " + errorResponse.getReasonPhrase() + " for url: " + request.getUrl(), null, false, 12, null);
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentChecker.isRequiredContent('");
        sb.append(uri);
        sb.append("');");
        view.evaluateJavascript(sb.toString(), new android.webkit.ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.this, errorResponse, view, (java.lang.String) obj);
            }
        });
        super.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "render_process_gone_error").withTag("is_loaded", java.lang.String.valueOf(this.f.getValue().booleanValue())));
        this.i.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.e);
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "onRenderProcessGone", null, false, 12, null);
        this.n.setValue(java.lang.Boolean.FALSE);
        return true;
    }

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i contentLoadedEventHandler, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7577a = contentLoadedEventHandler;
        this.b = metricsRecorder;
        this.c = z;
        this.d = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.g = MutableStateFlow2;
        this.h = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.i = MutableStateFlow3;
        this.j = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        this.n = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> b() {
        return this.f;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> c() {
        return this.h;
    }

    public final void d() {
        kotlinx.coroutines.Job launch$default;
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HTML Page finished loading is success: ");
        sb.append(this.j.getValue() == null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, sb.toString(), null, false, 12, null);
        this.g.setValue(java.lang.Boolean.TRUE);
        if (this.j.getValue() == null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Waiting for content HTML assets to load or error out", null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.b;
            com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.N.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
            metricsRecorder.recordCountEvent(countEvent.withTag(dVar.c(), "success"));
            com.moloco.sdk.acm.TimerEvent timerEvent = this.p;
            if (timerEvent != null) {
                this.b.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.d(null), 3, null);
            this.o = launch$default;
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        this.e.setValue(java.lang.Boolean.FALSE);
        kotlinx.coroutines.Job job = this.o;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        kotlinx.coroutines.Job job2 = this.l;
        if (job2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.l = null;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.b;
        com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.N.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
        com.moloco.sdk.acm.CountEvent withTag = countEvent2.withTag(dVar2.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
        java.lang.String c = dVar3.c();
        java.lang.String str = this.r;
        if (str == null) {
            str = "unknown";
        }
        metricsRecorder2.recordCountEvent(withTag.withTag(c, str));
        com.moloco.sdk.acm.TimerEvent timerEvent2 = this.p;
        if (timerEvent2 != null) {
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = this.b;
            com.moloco.sdk.acm.TimerEvent withTag2 = timerEvent2.withTag(dVar2.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
            java.lang.String c2 = dVar3.c();
            java.lang.String str2 = this.r;
            metricsRecorder3.recordTimerEvent(withTag2.withTag(c2, str2 != null ? str2 : "unknown"));
        }
    }

    public final boolean e() {
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("retryCount: ");
        sb.append(this.k);
        sb.append(", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: ");
        sb.append(this.k < 5);
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, u, sb.toString(), false, 4, null);
        return this.k < 5;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l> a() {
        return this.j;
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar, androidx.webkit.WebResourceErrorCompat webResourceErrorCompat, android.webkit.WebView webView, java.lang.String str) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, com.ironsource.X3.j.d + java.lang.Thread.currentThread().getName() + "] Content type with webview error is required: " + parseBoolean, null, false, 12, null);
        if (parseBoolean) {
            if (!cVar.f.getValue().booleanValue()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h.a(webResourceErrorCompat.getDescription().toString());
                if (kotlin.jvm.internal.Intrinsics.areEqual(a2.c(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.k.c.j.c()) && cVar.c) {
                    cVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", java.lang.String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", java.lang.String.valueOf(cVar.f.getValue().booleanValue())));
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Ignoring error: " + ((java.lang.Object) webResourceErrorCompat.getDescription()) + " with code: " + webResourceErrorCompat.getErrorCode() + " since it's marked to be ignored pre load", null, false, 12, null);
                } else if (a2.e() && cVar.e()) {
                    cVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), webView);
                } else {
                    cVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.c);
                }
            } else {
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Webview is already showing and received error: " + ((java.lang.Object) webResourceErrorCompat.getDescription()), null, false, 12, null);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h.a(webResourceErrorCompat.getDescription().toString()).f()) {
                    cVar.a(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.c);
                } else {
                    cVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", java.lang.String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", java.lang.String.valueOf(cVar.f.getValue().booleanValue())));
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Webview is already showing but received " + ((java.lang.Object) webResourceErrorCompat.getDescription()) + ", not setting unrecoverable error", null, false, 12, null);
                }
            }
        } else {
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Content is not required, not setting unrecoverable error", null, false, 12, null);
            cVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(webResourceErrorCompat.getDescription())).withTag("status_code", java.lang.String.valueOf(webResourceErrorCompat.getErrorCode())).withTag("is_loaded", java.lang.String.valueOf(cVar.f.getValue().booleanValue())));
        }
        cVar.n.setValue(java.lang.Boolean.FALSE);
    }

    public final void a(java.lang.String str, int i, android.webkit.WebView webView) {
        kotlinx.coroutines.Job launch$default;
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Retrying error... Attempt: " + (this.k + 1), null, false, 12, null);
        this.k = this.k + 1;
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.I.c()).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), java.lang.String.valueOf(this.k)).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(str)).withTag("status_code", java.lang.String.valueOf(i)));
        kotlinx.coroutines.Job job = this.l;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.b(webView, null), 3, null);
        this.l = launch$default;
    }

    public final void a(java.lang.String str, int i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l lVar) {
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, u, "Setting unrecoverable error with description: " + str + ", code: " + i + ", errorType: " + lVar, null, false, 12, null);
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(str)).withTag("status_code", java.lang.String.valueOf(i)).withTag("is_loaded", java.lang.String.valueOf(this.f.getValue().booleanValue())));
        this.r = str;
        this.i.setValue(lVar);
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar, android.webkit.WebResourceResponse webResourceResponse, android.webkit.WebView webView, java.lang.String str) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, com.ironsource.X3.j.d + java.lang.Thread.currentThread().getName() + "] Content isRequired with http error: " + parseBoolean, null, false, 12, null);
        if (parseBoolean) {
            if (cVar.f.getValue().booleanValue()) {
                cVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.J.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", java.lang.String.valueOf(cVar.f.getValue().booleanValue())));
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
            } else if (cVar.a(webResourceResponse.getStatusCode()) && cVar.e()) {
                cVar.a(java.lang.String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), webView);
            } else {
                cVar.a(java.lang.String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.d);
                com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger, u, "Setting unrecoverable error: " + cVar.j.getValue(), null, false, 12, null);
            }
        } else {
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, u, "Content is not required, not setting unrecoverable error", null, false, 12, null);
            cVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.H.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", java.lang.String.valueOf(cVar.f.getValue().booleanValue())));
        }
        cVar.n.setValue(java.lang.Boolean.FALSE);
    }

    public final boolean a(int i) {
        io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
        return i == companion.getTooManyRequests().getValue() || i == companion.getRequestTimeout().getValue() || i < 400 || i >= 500;
    }
}
