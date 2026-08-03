package com.unity3d.ads.adplayer;

/* compiled from: AndroidWebViewContainer.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001fH\u0002J\u0011\u0010&\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J!\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u00100J\u0011\u00101\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "_lastInputEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/view/InputEvent;", "get_lastInputEvent", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "lastInputEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getLastInputEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getWebView", "()Landroid/webkit/WebView;", "addJavascriptInterface", "", "webViewBridgeInterface", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "name", "", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applySafeAreaInsets", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateJavascript", "handlerType", "Lcom/unity3d/ads/adplayer/HandlerType;", "arguments", "Lorg/json/JSONArray;", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRenderProcessGone", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidWebViewContainer implements com.unity3d.ads.adplayer.WebViewContainer {
    private static final java.lang.String JS_CLOSING_PARENTHESES = ")";
    private static final java.lang.String JS_INSTRUCTION = "javascript:window.nativebridge.";
    private static final java.lang.String JS_OPENING_PARENTHESES = "(";
    private static final java.lang.String JS_SEMICOLON = ";";
    private final kotlinx.coroutines.flow.MutableStateFlow<android.view.InputEvent> _lastInputEvent;
    private final android.content.Context context;
    private final kotlinx.coroutines.flow.StateFlow<android.view.InputEvent> lastInputEvent;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final android.webkit.WebView webView;
    private final com.unity3d.ads.adplayer.AndroidWebViewClient webViewClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.adplayer.AndroidWebViewContainer.Companion INSTANCE = new com.unity3d.ads.adplayer.AndroidWebViewContainer.Companion(null);
    private static final java.lang.StringBuilder SHARED_STRING_BUILDER = new java.lang.StringBuilder(4096);

    private static final int applySafeAreaInsets$lambda$3$toPx(int i, float f) {
        return (int) (i / f);
    }

    public AndroidWebViewContainer(android.webkit.WebView webView, com.unity3d.ads.adplayer.AndroidWebViewClient webViewClient, com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, kotlinx.coroutines.CoroutineDispatcher mainDispatcher, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, kotlinx.coroutines.CoroutineScope adPlayerScope, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        kotlinx.coroutines.CoroutineScope plus = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(adPlayerScope, mainDispatcher), new kotlinx.coroutines.CoroutineName("AndroidWebViewContainer"));
        this.scope = plus;
        kotlinx.coroutines.flow.MutableStateFlow<android.view.InputEvent> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this._lastInputEvent = MutableStateFlow;
        this.lastInputEvent = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRenderProcessGone = webViewClient.isRenderProcessGone();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass2(null)), kotlinx.coroutines.CoroutineScopeKt.plus(plus, defaultDispatcher));
        webView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = com.unity3d.ads.adplayer.AndroidWebViewContainer._init_$lambda$1(com.unity3d.ads.adplayer.AndroidWebViewContainer.this, view, motionEvent);
                return _init_$lambda$1;
            }
        });
        applySafeAreaInsets();
    }

    public final android.webkit.WebView getWebView() {
        return this.webView;
    }

    /* compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\b\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$Companion;", "", "()V", "JS_CLOSING_PARENTHESES", "", "JS_INSTRUCTION", "JS_OPENING_PARENTHESES", "JS_SEMICOLON", "SHARED_STRING_BUILDER", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getSHARED_STRING_BUILDER$annotations", "getSHARED_STRING_BUILDER", "()Ljava/lang/StringBuilder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }

        private Companion() {
        }

        public final java.lang.StringBuilder getSHARED_STRING_BUILDER() {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<android.view.InputEvent> get_lastInputEvent() {
        return this._lastInputEvent;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public kotlinx.coroutines.flow.StateFlow<android.view.InputEvent> getLastInputEvent() {
        return this.lastInputEvent;
    }

    /* compiled from: AndroidWebViewContainer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidWebViewContainer.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass2) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.adplayer.AndroidWebViewContainer.this.onRenderProcessGone(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(com.unity3d.ads.adplayer.AndroidWebViewContainer this$0, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        this$0._lastInputEvent.setValue(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onRenderProcessGone(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 androidWebViewContainer$onRenderProcessGone$1;
        int i;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1) {
            androidWebViewContainer$onRenderProcessGone$1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1) continuation;
            if ((androidWebViewContainer$onRenderProcessGone$1.label & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$onRenderProcessGone$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidWebViewContainer$onRenderProcessGone$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$onRenderProcessGone$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidWebViewContainer$onRenderProcessGone$1.L$0 = this;
                    androidWebViewContainer$onRenderProcessGone$1.label = 1;
                    if (destroy(androidWebViewContainer$onRenderProcessGone$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidWebViewContainer = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) androidWebViewContainer$onRenderProcessGone$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidWebViewContainer.sendWebViewClientErrorDiagnostics.invoke(kotlin.collections.CollectionsKt.listOf(new com.unity3d.ads.adplayer.model.WebViewClientError("Render process gone", com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)));
                return kotlin.Unit.INSTANCE;
            }
        }
        androidWebViewContainer$onRenderProcessGone$1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1(this, continuation);
        java.lang.Object obj2 = androidWebViewContainer$onRenderProcessGone$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$onRenderProcessGone$1.label;
        if (i != 0) {
        }
        androidWebViewContainer.sendWebViewClientErrorDiagnostics.invoke(kotlin.collections.CollectionsKt.listOf(new com.unity3d.ads.adplayer.model.WebViewClientError("Render process gone", com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object loadUrl(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 androidWebViewContainer$loadUrl$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer;
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> list;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer2;
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> list2;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1) {
            androidWebViewContainer$loadUrl$1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1) continuation;
            if ((androidWebViewContainer$loadUrl$1.label & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$loadUrl$1.label -= Integer.MIN_VALUE;
                obj = androidWebViewContainer$loadUrl$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$loadUrl$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 androidWebViewContainer$loadUrl$2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2(this, str, null);
                    androidWebViewContainer$loadUrl$1.L$0 = this;
                    androidWebViewContainer$loadUrl$1.label = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, androidWebViewContainer$loadUrl$2, androidWebViewContainer$loadUrl$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidWebViewContainer = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list2 = (java.util.List) androidWebViewContainer$loadUrl$1.L$1;
                            androidWebViewContainer2 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) androidWebViewContainer$loadUrl$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
                            throw new com.unity3d.ads.adplayer.LoadWebViewError(list2);
                        }
                        androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) androidWebViewContainer$loadUrl$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list = (java.util.List) obj;
                        if (!list.isEmpty()) {
                            androidWebViewContainer$loadUrl$1.L$0 = androidWebViewContainer;
                            androidWebViewContainer$loadUrl$1.L$1 = list;
                            androidWebViewContainer$loadUrl$1.label = 3;
                            if (androidWebViewContainer.destroy(androidWebViewContainer$loadUrl$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            androidWebViewContainer2 = androidWebViewContainer;
                            list2 = list;
                            androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
                            throw new com.unity3d.ads.adplayer.LoadWebViewError(list2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) androidWebViewContainer$loadUrl$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> onLoadFinished = androidWebViewContainer.webViewClient.getOnLoadFinished();
                androidWebViewContainer$loadUrl$1.L$0 = androidWebViewContainer;
                androidWebViewContainer$loadUrl$1.label = 2;
                obj = onLoadFinished.await(androidWebViewContainer$loadUrl$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (java.util.List) obj;
                if (!list.isEmpty()) {
                }
            }
        }
        androidWebViewContainer$loadUrl$1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1(this, continuation);
        obj = androidWebViewContainer$loadUrl$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$loadUrl$1.label;
        if (i != 0) {
        }
        kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> onLoadFinished2 = androidWebViewContainer.webViewClient.getOnLoadFinished();
        androidWebViewContainer$loadUrl$1.L$0 = androidWebViewContainer;
        androidWebViewContainer$loadUrl$1.label = 2;
        obj = onLoadFinished2.await(androidWebViewContainer$loadUrl$1);
        if (obj == coroutine_suspended) {
        }
        list = (java.util.List) obj;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object evaluateJavascript(com.unity3d.ads.adplayer.HandlerType handlerType, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 androidWebViewContainer$evaluateJavascript$1;
        int i;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1) {
            androidWebViewContainer$evaluateJavascript$1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1) continuation;
            if ((androidWebViewContainer$evaluateJavascript$1.label & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$evaluateJavascript$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidWebViewContainer$evaluateJavascript$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$evaluateJavascript$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 androidWebViewContainer$evaluateJavascript$2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2(jSONArray, handlerType, this, null);
                    androidWebViewContainer$evaluateJavascript$1.label = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, androidWebViewContainer$evaluateJavascript$2, androidWebViewContainer$evaluateJavascript$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidWebViewContainer$evaluateJavascript$1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1(this, continuation);
        java.lang.Object obj2 = androidWebViewContainer$evaluateJavascript$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$evaluateJavascript$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge webViewBridge, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 androidWebViewContainer$addJavascriptInterface$1;
        int i;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1) {
            androidWebViewContainer$addJavascriptInterface$1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1) continuation;
            if ((androidWebViewContainer$addJavascriptInterface$1.label & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$addJavascriptInterface$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidWebViewContainer$addJavascriptInterface$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$addJavascriptInterface$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 androidWebViewContainer$addJavascriptInterface$2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2(this, str, webViewBridge, null);
                    androidWebViewContainer$addJavascriptInterface$1.label = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineContext, androidWebViewContainer$addJavascriptInterface$2, androidWebViewContainer$addJavascriptInterface$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidWebViewContainer$addJavascriptInterface$1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1(this, continuation);
        java.lang.Object obj2 = androidWebViewContainer$addJavascriptInterface$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$addJavascriptInterface$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 androidWebViewContainer$destroy$1;
        int i;
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1) {
            androidWebViewContainer$destroy$1 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1) continuation;
            if ((androidWebViewContainer$destroy$1.label & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$destroy$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidWebViewContainer$destroy$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewContainer$destroy$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext plus = this.scope.getCoroutineContext().plus(kotlinx.coroutines.NonCancellable.INSTANCE);
                    com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 androidWebViewContainer$destroy$2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2(this, null);
                    androidWebViewContainer$destroy$1.L$0 = this;
                    androidWebViewContainer$destroy$1.label = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(plus, androidWebViewContainer$destroy$2, androidWebViewContainer$destroy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidWebViewContainer = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) androidWebViewContainer$destroy$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(androidWebViewContainer.scope, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        androidWebViewContainer$destroy$1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1(this, continuation);
        java.lang.Object obj2 = androidWebViewContainer$destroy$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewContainer$destroy$1.label;
        if (i != 0) {
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(androidWebViewContainer.scope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    private final void applySafeAreaInsets() {
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this.webView, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                androidx.core.view.WindowInsetsCompat applySafeAreaInsets$lambda$3;
                applySafeAreaInsets$lambda$3 = com.unity3d.ads.adplayer.AndroidWebViewContainer.applySafeAreaInsets$lambda$3(com.unity3d.ads.adplayer.AndroidWebViewContainer.this, view, windowInsetsCompat);
                return applySafeAreaInsets$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.core.view.WindowInsetsCompat applySafeAreaInsets$lambda$3(com.unity3d.ads.adplayer.AndroidWebViewContainer this$0, android.view.View v, androidx.core.view.WindowInsetsCompat insets) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insets, "insets");
        androidx.core.graphics.Insets insets2 = insets.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        androidx.core.graphics.Insets insets3 = insets.getInsets(androidx.core.view.WindowInsetsCompat.Type.displayCutout());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets3, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Float.valueOf(this$0.context.getResources().getDisplayMetrics().density));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = valueOf;
        }
        float floatValue = ((java.lang.Number) m10798constructorimpl).floatValue();
        int applySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(java.lang.Math.max(insets2.left, insets3.left), floatValue);
        int applySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(java.lang.Math.max(insets2.top, insets3.top), floatValue);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, kotlin.text.StringsKt.trimIndent("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + applySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(java.lang.Math.max(insets2.right, insets3.right), floatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + applySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(java.lang.Math.max(insets2.bottom, insets3.bottom), floatValue) + "px');\n                })();\n            "), null), 3, null);
        return insets;
    }
}
