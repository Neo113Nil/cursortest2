package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository", f = "PayairCardRepository.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "fetchAndValidateTokenDetails", n = {"digitizedCardId", "raise$iv$iv$iv", "$this$fetchAndValidateTokenDetails_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayairCardRepository$fetchAndValidateTokenDetails$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PayairCardRepository$fetchAndValidateTokenDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairCardRepository$fetchAndValidateTokenDetails$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$fetchAndValidateTokenDetails$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = payairCardRepository;
    }
}
