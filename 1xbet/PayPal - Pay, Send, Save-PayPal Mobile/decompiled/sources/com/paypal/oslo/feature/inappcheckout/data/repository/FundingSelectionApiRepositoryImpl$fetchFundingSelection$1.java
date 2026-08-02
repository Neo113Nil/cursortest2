package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl", f = "FundingSelectionApiRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {121}, m = "fetchFundingSelection", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "raise$iv$iv$iv", "$this$fetchFundingSelection_u24lambda_u240", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FundingSelectionApiRepositoryImpl$fetchFundingSelection$2"}, nl = {127}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class FundingSelectionApiRepositoryImpl$fetchFundingSelection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputSizes = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputStallDuration.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingSelectionApiRepositoryImpl$fetchFundingSelection$1(com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = fundingSelectionApiRepositoryImpl;
    }
}
