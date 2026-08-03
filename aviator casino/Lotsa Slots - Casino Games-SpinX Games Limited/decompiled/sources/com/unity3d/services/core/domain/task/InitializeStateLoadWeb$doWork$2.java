package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateLoadWeb.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", i = {0, 0, 1}, l = {46, 64, 71}, m = "invokeSuspend", n = {"$this$withContext", "request", "request"}, s = {"L$0", "L$3", "L$2"})
/* loaded from: classes6.dex */
final class InitializeStateLoadWeb$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params $params;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params, com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, continuation);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01de, code lost:
    
        com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01be A[Catch: all -> 0x01f8, CancellationException -> 0x0225, TryCatch #6 {CancellationException -> 0x0225, all -> 0x01f8, blocks: (B:8:0x001a, B:10:0x0191, B:11:0x01b4, B:13:0x01be, B:16:0x01c9, B:17:0x01db, B:20:0x01de, B:21:0x01ea, B:35:0x0168, B:37:0x016e, B:40:0x0194, B:41:0x01a6, B:74:0x015e, B:48:0x012c, B:53:0x01a7, B:56:0x0122, B:58:0x0071, B:33:0x0039, B:34:0x0155, B:50:0x0132), top: B:2:0x000e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e A[Catch: all -> 0x01f8, CancellationException -> 0x0225, TryCatch #6 {CancellationException -> 0x0225, all -> 0x01f8, blocks: (B:8:0x001a, B:10:0x0191, B:11:0x01b4, B:13:0x01be, B:16:0x01c9, B:17:0x01db, B:20:0x01de, B:21:0x01ea, B:35:0x0168, B:37:0x016e, B:40:0x0194, B:41:0x01a6, B:74:0x015e, B:48:0x012c, B:53:0x01a7, B:56:0x0122, B:58:0x0071, B:33:0x0039, B:34:0x0155, B:50:0x0132), top: B:2:0x000e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0194 A[Catch: all -> 0x01f8, CancellationException -> 0x0225, TryCatch #6 {CancellationException -> 0x0225, all -> 0x01f8, blocks: (B:8:0x001a, B:10:0x0191, B:11:0x01b4, B:13:0x01be, B:16:0x01c9, B:17:0x01db, B:20:0x01de, B:21:0x01ea, B:35:0x0168, B:37:0x016e, B:40:0x0194, B:41:0x01a6, B:74:0x015e, B:48:0x012c, B:53:0x01a7, B:56:0x0122, B:58:0x0071, B:33:0x0039, B:34:0x0155, B:50:0x0132), top: B:2:0x000e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {all -> 0x0046, blocks: (B:33:0x0039, B:34:0x0155, B:50:0x0132), top: B:2:0x000e, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a7 A[Catch: all -> 0x01f8, CancellationException -> 0x0225, TryCatch #6 {CancellationException -> 0x0225, all -> 0x01f8, blocks: (B:8:0x001a, B:10:0x0191, B:11:0x01b4, B:13:0x01be, B:16:0x01c9, B:17:0x01db, B:20:0x01de, B:21:0x01ea, B:35:0x0168, B:37:0x016e, B:40:0x0194, B:41:0x01a6, B:74:0x015e, B:48:0x012c, B:53:0x01a7, B:56:0x0122, B:58:0x0071, B:33:0x0039, B:34:0x0155, B:50:0x0132), top: B:2:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        java.lang.Object m10798constructorimpl2;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb;
        ?? r1;
        com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers;
        java.lang.Object withContext;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params;
        java.lang.String str;
        java.lang.String webViewHash;
        com.unity3d.services.core.network.model.HttpRequest httpRequest;
        com.unity3d.services.core.network.model.HttpRequest httpRequest2;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb2;
        java.lang.Object withRetry;
        java.lang.Object m10798constructorimpl3;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb3;
        ?? r12;
        com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ?? r2 = 1;
        try {
            try {
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                r1 = i;
                initializeStateLoadWeb = r2;
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params2 = this.$params;
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb4 = this.this$0;
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: loading webapp from " + params2.getConfig().getWebViewUrl());
            java.lang.String webViewUrl = params2.getConfig().getWebViewUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webViewUrl, "params.config.webViewUrl");
            com.unity3d.services.core.network.model.HttpRequest httpRequest3 = new com.unity3d.services.core.network.model.HttpRequest(webViewUrl, null, com.unity3d.services.core.network.model.RequestType.GET, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131066, null);
            try {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                int maxRetries = params2.getConfig().getMaxRetries();
                double retryScalingFactor = params2.getConfig().getRetryScalingFactor();
                long retryDelay = params2.getConfig().getRetryDelay();
                com.unity3d.services.core.domain.task.InitializationException initializationException = new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest, new java.lang.Exception(), params2.getConfig());
                com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(initializeStateLoadWeb4, httpRequest3, null);
                this.L$0 = coroutineScope;
                this.L$1 = params2;
                this.L$2 = initializeStateLoadWeb4;
                this.L$3 = httpRequest3;
                this.label = 1;
                httpRequest = httpRequest3;
                try {
                    withRetry = com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1, this);
                    if (withRetry == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpRequest2 = httpRequest;
                    params = params2;
                    initializeStateLoadWeb2 = initializeStateLoadWeb4;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    httpRequest2 = httpRequest;
                    params = params2;
                    initializeStateLoadWeb2 = initializeStateLoadWeb4;
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                    r12 = httpRequest2;
                    initializeStateLoadWeb3 = initializeStateLoadWeb2;
                    if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl3)) {
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                httpRequest = httpRequest3;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params3 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    params = params3;
                    withContext = obj;
                    str = (java.lang.String) withContext;
                    webViewHash = params.getConfig().getWebViewHash();
                    if (webViewHash != null && !kotlin.jvm.internal.Intrinsics.areEqual(com.unity3d.services.core.misc.Utilities.Sha256(str), webViewHash)) {
                        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.InvalidHash, new java.lang.Exception("Invalid webViewHash"), params.getConfig());
                    }
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult(params.getConfig(), str));
                    if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                        kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(m10798constructorimpl);
                    } else {
                        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                        if (m10801exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m10797boximpl(m10798constructorimpl);
                }
                ?? r13 = (com.unity3d.services.core.network.model.HttpRequest) this.L$2;
                com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb5 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) this.L$1;
                params = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = ((kotlin.Result) obj).getValue();
                i = r13;
                r2 = initializeStateLoadWeb5;
                m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.Result.m10797boximpl(obj2));
                r1 = i;
                initializeStateLoadWeb = r2;
                if (!kotlin.Result.m10805isSuccessimpl(m10798constructorimpl2)) {
                    iSDKDispatchers = initializeStateLoadWeb.dispatchers;
                    kotlinx.coroutines.CoroutineDispatcher io2 = iSDKDispatchers.getIo();
                    com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1(initializeStateLoadWeb, r1, null);
                    this.L$0 = params;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    withContext = kotlinx.coroutines.BuildersKt.withContext(io2, initializeStateLoadWeb$doWork$2$1$webViewData$1, this);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = (java.lang.String) withContext;
                    webViewHash = params.getConfig().getWebViewHash();
                    if (webViewHash != null) {
                        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.InvalidHash, new java.lang.Exception("Invalid webViewHash"), params.getConfig());
                    }
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult(params.getConfig(), str));
                    if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                    }
                    return kotlin.Result.m10797boximpl(m10798constructorimpl);
                }
                throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest, new java.lang.Exception("No connected events within the timeout!"), params.getConfig());
            }
            httpRequest2 = (com.unity3d.services.core.network.model.HttpRequest) this.L$3;
            initializeStateLoadWeb2 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) this.L$2;
            params = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) this.L$1;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                withRetry = obj;
                httpRequest2 = httpRequest2;
                initializeStateLoadWeb2 = initializeStateLoadWeb2;
            } catch (java.lang.Throwable th5) {
                th = th5;
                kotlin.Result.Companion companion52 = kotlin.Result.INSTANCE;
                m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                r12 = httpRequest2;
                initializeStateLoadWeb3 = initializeStateLoadWeb2;
                if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl3)) {
                }
            }
        }
        m10798constructorimpl3 = kotlin.Result.m10798constructorimpl((com.unity3d.services.core.network.model.HttpResponse) withRetry);
        r12 = httpRequest2;
        initializeStateLoadWeb3 = initializeStateLoadWeb2;
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl3)) {
            kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
            initializeStateNetworkError = initializeStateLoadWeb3.initializeStateNetworkError;
            com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params4 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(params.getConfig());
            this.L$0 = params;
            this.L$1 = initializeStateLoadWeb3;
            this.L$2 = r12;
            this.L$3 = null;
            this.label = 2;
            obj2 = initializeStateNetworkError.mo10359invokegIAlus(params4, this);
            i = r12;
            r2 = initializeStateLoadWeb3;
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.Result.m10797boximpl(obj2));
            r1 = i;
            initializeStateLoadWeb = r2;
            if (!kotlin.Result.m10805isSuccessimpl(m10798constructorimpl2)) {
            }
        } else {
            kotlin.ResultKt.throwOnFailure(m10798constructorimpl3);
            str = ((com.unity3d.services.core.network.model.HttpResponse) m10798constructorimpl3).getBody().toString();
            webViewHash = params.getConfig().getWebViewHash();
            if (webViewHash != null) {
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult(params.getConfig(), str));
            if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
            }
            return kotlin.Result.m10797boximpl(m10798constructorimpl);
        }
    }
}
