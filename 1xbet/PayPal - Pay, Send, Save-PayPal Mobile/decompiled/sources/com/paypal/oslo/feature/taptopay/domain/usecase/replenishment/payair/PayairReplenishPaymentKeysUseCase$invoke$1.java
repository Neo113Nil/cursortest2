package com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase", f = "PayairReplenishPaymentKeysUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {45}, m = "invoke", n = {"networkTokenReference", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayairReplenishPaymentKeysUseCase$invoke$2"}, nl = {60}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PayairReplenishPaymentKeysUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairReplenishPaymentKeysUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase payairReplenishPaymentKeysUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = payairReplenishPaymentKeysUseCase;
    }
}
