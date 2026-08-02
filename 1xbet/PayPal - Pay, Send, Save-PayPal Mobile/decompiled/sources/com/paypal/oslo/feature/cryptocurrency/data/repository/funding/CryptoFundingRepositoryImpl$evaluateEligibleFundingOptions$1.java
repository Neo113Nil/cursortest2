package com.paypal.oslo.feature.cryptocurrency.data.repository.funding;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl", f = "CryptoFundingRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {68}, m = "evaluateEligibleFundingOptions", n = {"action", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "currencyCode", "quoteQuantity", "raise$iv$iv$iv", "$this$evaluateEligibleFundingOptions_u24lambda_u240", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$2"}, nl = {69}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.evaluateEligibleFundingOptions(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1(com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl cryptoFundingRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl$evaluateEligibleFundingOptions$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = cryptoFundingRepositoryImpl;
    }
}
