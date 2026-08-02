package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel", f = "ReviewViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "fetchFundingInstrumentInternal", n = {"currencyCode", "raise$iv$iv$iv", "$this$fetchFundingInstrumentInternal_u24lambda_u240", "reloadAmountStr", "requestAmount", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ReviewViewModel$fetchFundingInstrumentInternal$2", "isLowBalance"}, nl = {269}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes11.dex */
final class ReviewViewModel$fetchFundingInstrumentInternal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel getOutputSizes;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizes.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$fetchFundingInstrumentInternal$1(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchFundingInstrumentInternal$1> continuation) {
        super(continuation);
        this.getOutputSizes = reviewViewModel;
    }
}
