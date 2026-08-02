package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel", f = "ReviewViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {259}, m = "fetchBalanceIdInternal", n = {"currencyCode", "raise$iv$iv$iv", "$this$fetchBalanceIdInternal_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ReviewViewModel$fetchBalanceIdInternal$2"}, nl = {673}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class ReviewViewModel$fetchBalanceIdInternal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$fetchBalanceIdInternal$1(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchBalanceIdInternal$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = reviewViewModel;
    }
}
