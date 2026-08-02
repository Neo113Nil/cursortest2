package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$initialize$3", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigClient$initialize$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Exception exc = (java.lang.Exception) this.L$0;
            this.this$0.logEndDiagnosticsWhenException(com.statsig.androidsdk.ContextType.INITIALIZE, exc);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            j = this.this$0.initTime;
            return new com.statsig.androidsdk.InitializationDetails(elapsedRealtime - j, false, new com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse(com.statsig.androidsdk.InitializeFailReason.InternalError, exc, null, 4, null));
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Exception exc, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$initialize$3) create(exc, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.statsig.androidsdk.StatsigClient$initialize$3 statsigClient$initialize$3 = new com.statsig.androidsdk.StatsigClient$initialize$3(this.this$0, continuation);
        statsigClient$initialize$3.L$0 = obj;
        return statsigClient$initialize$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$initialize$3(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$initialize$3> continuation) {
        super(2, continuation);
        this.this$0 = statsigClient;
    }
}
