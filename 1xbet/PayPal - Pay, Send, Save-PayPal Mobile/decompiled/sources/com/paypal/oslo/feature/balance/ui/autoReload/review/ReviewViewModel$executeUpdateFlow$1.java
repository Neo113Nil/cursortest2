package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel", f = "ReviewViewModel.kt", i = {0, 0, 0, 0}, l = {310}, m = "executeUpdateFlow", n = {"state", "strategy", "request", "updateRequest"}, nl = {668}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class ReviewViewModel$executeUpdateFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.access$executeUpdateFlow(this.getOutputMinFrameDuration, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$executeUpdateFlow$1(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeUpdateFlow$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = reviewViewModel;
    }
}
