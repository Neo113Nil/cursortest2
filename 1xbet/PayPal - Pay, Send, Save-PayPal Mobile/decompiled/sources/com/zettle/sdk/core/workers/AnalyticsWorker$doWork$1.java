package com.zettle.sdk.core.workers;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.workers.AnalyticsWorker", f = "AnalyticsWorker.kt", i = {0, 0}, l = {46}, m = "doWork", n = {"manager", "dispatcherObserver"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class AnalyticsWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.core.workers.AnalyticsWorker Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsWorker$doWork$1(com.zettle.sdk.core.workers.AnalyticsWorker analyticsWorker, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.workers.AnalyticsWorker$doWork$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = analyticsWorker;
    }
}
