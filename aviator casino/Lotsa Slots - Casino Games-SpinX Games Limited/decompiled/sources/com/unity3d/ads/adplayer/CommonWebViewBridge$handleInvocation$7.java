package com.unity3d.ads.adplayer;

/* compiled from: CommonWebViewBridge.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", i = {0, 0, 1, 1, 2, 3, 4}, l = {134, 136, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 148}, m = "invokeSuspend", n = {"$this$launch", "invocation", "$this$launch", "invocation", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class CommonWebViewBridge$handleInvocation$7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $callback;
    final /* synthetic */ java.lang.String $location;
    final /* synthetic */ java.lang.String $message;
    final /* synthetic */ org.json.JSONArray $parameters;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocation$7(java.lang.String str, org.json.JSONArray jSONArray, com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7> continuation) {
        super(2, continuation);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
        this.$message = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7 commonWebViewBridge$handleInvocation$7 = new com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, this.$message, continuation);
        commonWebViewBridge$handleInvocation$7.L$0 = obj;
        return commonWebViewBridge$handleInvocation$7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:18:0x0023, B:21:0x0031, B:23:0x00a8, B:25:0x00ac, B:28:0x00bf, B:32:0x0040, B:33:0x0097, B:37:0x007e), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:18:0x0023, B:21:0x0031, B:23:0x00a8, B:25:0x00ac, B:28:0x00bf, B:32:0x0040, B:33:0x0097, B:37:0x007e), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        java.lang.String reason;
        java.lang.Object respond;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.unity3d.ads.adplayer.Invocation invocation;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object result;
        java.lang.Object respond2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
            } catch (java.lang.Throwable th) {
                if (th instanceof kotlinx.coroutines.TimeoutCancellationException) {
                    reason = "Invocation(" + this.$location + ") is not handled";
                } else {
                    java.lang.String message = th.getMessage();
                    reason = message == null ? th.getClass().getSimpleName() : message;
                }
                com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge = this.this$0;
                java.lang.String str = this.$callback;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reason, "reason");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                respond = commonWebViewBridge.respond(str, "ERROR", new java.lang.Object[]{reason}, this);
                if (respond == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                invocation = new com.unity3d.ads.adplayer.Invocation(this.$location, com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(this.$parameters));
                mutableSharedFlow = this.this$0._onInvocation;
                this.L$0 = coroutineScope;
                this.L$1 = invocation;
                this.label = 1;
                if (mutableSharedFlow.emit(invocation, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = coroutineScope;
                this.L$1 = invocation;
                this.label = 2;
                if (kotlinx.coroutines.TimeoutKt.withTimeout(5000L, new com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.AnonymousClass1(invocation, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 3;
                result = invocation.getResult(this);
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (result instanceof com.unity3d.ads.adplayer.model.WebViewEvent) {
                    this.L$0 = coroutineScope;
                    this.label = 5;
                    respond2 = this.this$0.respond(this.$callback, "OK", new java.lang.Object[]{result}, this);
                    if (respond2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.L$0 = coroutineScope;
                    this.label = 4;
                    if (this.this$0.sendEvent((com.unity3d.ads.adplayer.model.WebViewEvent) result, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                invocation = (com.unity3d.ads.adplayer.Invocation) this.L$1;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.L$1 = invocation;
                this.label = 2;
                if (kotlinx.coroutines.TimeoutKt.withTimeout(5000L, new com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.AnonymousClass1(invocation, null), this) == coroutine_suspended) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 3;
                result = invocation.getResult(this);
                if (result == coroutine_suspended) {
                }
                if (result instanceof com.unity3d.ads.adplayer.model.WebViewEvent) {
                }
                return kotlin.Unit.INSTANCE;
            case 2:
                invocation = (com.unity3d.ads.adplayer.Invocation) this.L$1;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 3;
                result = invocation.getResult(this);
                if (result == coroutine_suspended) {
                }
                if (result instanceof com.unity3d.ads.adplayer.model.WebViewEvent) {
                }
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                result = obj;
                if (result instanceof com.unity3d.ads.adplayer.model.WebViewEvent) {
                }
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge2 = this.this$0;
                java.lang.String str2 = this.$message;
                java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                if (m10801exceptionOrNullimpl != null) {
                    sendDiagnosticEvent = commonWebViewBridge2.sendDiagnosticEvent;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String message2 = m10801exceptionOrNullimpl.getMessage();
                    if (message2 == null) {
                        message2 = m10801exceptionOrNullimpl.getClass().getSimpleName();
                    }
                    pairArr[0] = kotlin.TuplesKt.to("reason_debug", message2);
                    pairArr[1] = kotlin.TuplesKt.to("webview_invocation", str2);
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, kotlin.collections.MapsKt.mapOf(pairArr), null, null, null, 58, null);
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CommonWebViewBridge.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.adplayer.Invocation $invocation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$invocation = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.AnonymousClass1(this.$invocation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$invocation.isHandled().await(this) == coroutine_suspended) {
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
}
