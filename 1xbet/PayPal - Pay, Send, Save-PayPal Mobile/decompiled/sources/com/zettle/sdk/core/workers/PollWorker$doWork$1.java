package com.zettle.sdk.core.workers;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.workers.PollWorker", f = "PollWorker.kt", i = {}, l = {19}, m = "doWork", n = {}, s = {})
/* loaded from: classes17.dex */
final class PollWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.workers.PollWorker getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollWorker$doWork$1(com.zettle.sdk.core.workers.PollWorker pollWorker, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.workers.PollWorker$doWork$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pollWorker;
    }
}
