package com.zettle.sdk.core.workers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.workers.AnalyticsWorker$doWork$result$1", f = "AnalyticsWorker.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class AnalyticsWorker$doWork$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.analytics.AnalyticsManager Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.core.workers.AnalyticsWorker getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap.getState().addObserver(this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRanges = 1;
                obj = this.getHighResolutionOutputSizeshNQ4ISI.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            z = ((java.lang.Boolean) obj).booleanValue();
        } catch (java.lang.Throwable th) {
            com.zettle.sdk.core.log.LogKt.warn(this.getHighSpeedVideoSizes, "Analytics failed due to error", th);
            z = false;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.zettle.sdk.core.workers.AnalyticsWorker$doWork$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.workers.AnalyticsWorker$doWork$result$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsWorker$doWork$result$1(com.zettle.sdk.analytics.AnalyticsManager analyticsManager, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State> stateObserver, kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> completableDeferred, com.zettle.sdk.core.workers.AnalyticsWorker analyticsWorker, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.workers.AnalyticsWorker$doWork$result$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = analyticsManager;
        this.getHighSpeedVideoFpsRangesFor = stateObserver;
        this.getHighResolutionOutputSizeshNQ4ISI = completableDeferred;
        this.getHighSpeedVideoSizes = analyticsWorker;
    }
}
