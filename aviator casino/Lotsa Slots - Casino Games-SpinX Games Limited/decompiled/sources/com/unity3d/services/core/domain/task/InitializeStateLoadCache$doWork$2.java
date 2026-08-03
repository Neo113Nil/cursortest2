package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateLoadCache.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateLoadCache$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$2(com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache, com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: webapp loaded from local cache");
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        byte[] webViewData;
        com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params = this.$params;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            webViewData = initializeStateLoadCache.getWebViewData();
            boolean z = true;
            if (webViewData == null) {
                loadCacheResult = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                java.lang.String Sha256 = com.unity3d.services.core.misc.Utilities.Sha256(webViewData);
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
                java.lang.String str = new java.lang.String(webViewData, forName);
                if (Sha256 != null && kotlin.jvm.internal.Intrinsics.areEqual(Sha256, params.getConfig().getWebViewHash())) {
                    z = false;
                }
                loadCacheResult = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult(z, str);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(loadCacheResult);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(m10798constructorimpl);
        } else {
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
            }
        }
        return kotlin.Result.m10797boximpl(m10798constructorimpl);
    }
}
