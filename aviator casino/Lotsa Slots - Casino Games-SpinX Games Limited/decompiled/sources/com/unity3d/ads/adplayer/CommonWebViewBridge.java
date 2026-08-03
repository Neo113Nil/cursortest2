package com.unity3d.ads.adplayer;

/* compiled from: CommonWebViewBridge.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J \u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0014H\u0016J;\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u00100J5\u00101\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u00142\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u00100J\u0019\u00103\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0096@ø\u0001\u0000¢\u0006\u0002\u00106R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0010\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "_onInvocation", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/Invocation;", "callbacks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CompletableDeferred;", "", "", "onInvocation", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnInvocation", "()Lkotlinx/coroutines/flow/SharedFlow;", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "execute", "", "handlerType", "Lcom/unity3d/ads/adplayer/HandlerType;", "arguments", "Lorg/json/JSONArray;", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCallback", "callbackId", "callbackStatus", "rawParameters", "handleInvocation", "message", "request", "className", "method", "params", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "respond", "status", "sendEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonWebViewBridge implements com.unity3d.ads.adplayer.WebViewBridge {
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.Invocation> _onInvocation;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>>> callbacks;
    private final com.unity3d.ads.core.log.Logger logger;
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.adplayer.WebViewContainer webViewContainer;

    public CommonWebViewBridge(kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.adplayer.WebViewContainer webViewContainer, kotlinx.coroutines.CoroutineScope adPlayerScope, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        kotlinx.coroutines.CoroutineScope plus = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(adPlayerScope, dispatcher), new kotlinx.coroutines.CoroutineName("CommonWebViewBridge"));
        this.scope = plus;
        this.callbacks = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.SetsKt.emptySet());
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.Invocation> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 64, null, 5, null);
        this._onInvocation = MutableSharedFlow$default;
        this.onInvocation = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(plus, null, null, new com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass1(null), 3, null);
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    /* compiled from: CommonWebViewBridge.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.CommonWebViewBridge.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.adplayer.CommonWebViewBridge.this.webViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.CommonWebViewBridge.this, "webviewbridge", this) == coroutine_suspended) {
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
    public final java.lang.Object execute(com.unity3d.ads.adplayer.HandlerType handlerType, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object evaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, continuation);
        return evaluateJavascript == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? evaluateJavascript : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public java.lang.Object sendEvent(com.unity3d.ads.adplayer.model.WebViewEvent webViewEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (java.lang.Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        java.lang.Object execute = execute(com.unity3d.ads.adplayer.HandlerType.EVENT, jSONArray, continuation);
        return execute == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? execute : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097 A[PHI: r14
      0x0097: PHI (r14v4 java.lang.Object) = (r14v3 java.lang.Object), (r14v1 java.lang.Object) binds: [B:17:0x0094, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object request(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object[]> continuation) {
        com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 commonWebViewBridge$request$1;
        int i;
        java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>> value;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        if (continuation instanceof com.unity3d.ads.adplayer.CommonWebViewBridge$request$1) {
            commonWebViewBridge$request$1 = (com.unity3d.ads.adplayer.CommonWebViewBridge$request$1) continuation;
            if ((commonWebViewBridge$request$1.label & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$request$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonWebViewBridge$request$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonWebViewBridge$request$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    java.lang.Object valueOf = java.lang.String.valueOf(CompletableDeferred$default.hashCode());
                    kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>>> mutableStateFlow = this.callbacks;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.SetsKt.plus(value, kotlin.TuplesKt.to(valueOf, CompletableDeferred$default))));
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(str);
                    jSONArray.put(str2);
                    jSONArray.put(valueOf);
                    for (java.lang.Object obj2 : objArr) {
                        jSONArray.put(obj2);
                    }
                    com.unity3d.ads.adplayer.HandlerType handlerType = com.unity3d.ads.adplayer.HandlerType.INVOCATION;
                    commonWebViewBridge$request$1.L$0 = CompletableDeferred$default;
                    commonWebViewBridge$request$1.label = 1;
                    if (execute(handlerType, jSONArray, commonWebViewBridge$request$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableDeferred = CompletableDeferred$default;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) commonWebViewBridge$request$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                commonWebViewBridge$request$1.L$0 = null;
                commonWebViewBridge$request$1.label = 2;
                obj = completableDeferred.await(commonWebViewBridge$request$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        commonWebViewBridge$request$1 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1(this, continuation);
        java.lang.Object obj3 = commonWebViewBridge$request$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonWebViewBridge$request$1.label;
        if (i != 0) {
        }
        commonWebViewBridge$request$1.L$0 = null;
        commonWebViewBridge$request$1.label = 2;
        obj3 = completableDeferred.await(commonWebViewBridge$request$1);
        if (obj3 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r5.equals("OK") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r4.complete(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r5.equals("success") == false) goto L35;
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.String rawParameters) {
        java.lang.Object obj;
        java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
        java.lang.Object[] typedArray = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(new org.json.JSONArray(rawParameters));
        java.util.Iterator<T> it = this.callbacks.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) ((kotlin.Pair) obj).component1(), callbackId)) {
                    break;
                }
            }
        }
        kotlin.Pair pair = (kotlin.Pair) obj;
        if (pair == null) {
            return;
        }
        kotlinx.coroutines.CompletableDeferred completableDeferred = (kotlinx.coroutines.CompletableDeferred) pair.component2();
        int hashCode = callbackStatus.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 2524) {
                if (hashCode == 66247144 ? callbackStatus.equals("ERROR") : hashCode == 96784904 && callbackStatus.equals("error")) {
                    java.lang.Object obj2 = typedArray[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    completableDeferred.completeExceptionally(new java.lang.Exception((java.lang.String) obj2));
                }
            }
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<kotlin.Pair<java.lang.String, kotlinx.coroutines.CompletableDeferred<java.lang.Object[]>>>> mutableStateFlow = this.callbacks;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.SetsKt.minus(value, pair)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        try {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(message);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    java.lang.Object obj = jSONArray.get(i);
                    org.json.JSONArray jSONArray2 = obj instanceof org.json.JSONArray ? (org.json.JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new java.lang.IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new java.lang.IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    java.lang.Object obj2 = jSONArray2.get(0);
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    if (str == null) {
                        throw new java.lang.IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    java.lang.Object obj3 = jSONArray2.get(1);
                    java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                    if (str2 == null) {
                        throw new java.lang.IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    java.lang.Object obj4 = jSONArray2.get(2);
                    org.json.JSONArray jSONArray3 = obj4 instanceof org.json.JSONArray ? (org.json.JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new java.lang.IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    java.lang.Object obj5 = jSONArray2.get(3);
                    java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                    if (str3 == null) {
                        throw new java.lang.IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    java.lang.String str4 = str + '.' + str2;
                    this.logger.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7(str4, jSONArray3, this, str3, message, null), 3, null);
                }
            } catch (org.json.JSONException e) {
                throw new java.lang.IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + message, e);
            }
        } catch (java.lang.Throwable th) {
            this.logger.error("Error handling invocation from webview (" + message + ')', th);
            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getSimpleName();
            }
            pairArr[0] = kotlin.TuplesKt.to("reason_debug", message2);
            pairArr[1] = kotlin.TuplesKt.to("webview_invocation", message);
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, kotlin.collections.MapsKt.mapOf(pairArr), null, null, null, 58, null);
            throw new java.lang.IllegalArgumentException("Invalid message passed to CommonWebViewBridge: " + message, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object respond(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new org.json.JSONArray(objArr));
        java.lang.Object execute = execute(com.unity3d.ads.adplayer.HandlerType.CALLBACK, new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf(jSONArray)), continuation);
        return execute == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? execute : kotlin.Unit.INSTANCE;
    }
}
