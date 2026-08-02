package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository", f = "PayairCardRepository.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {108}, m = "isDefaultCard", n = {"digitizedCardId", "raise$iv$iv$iv", "$this$isDefaultCard_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayairCardRepository$isDefaultCard$2"}, nl = {109}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PayairCardRepository$isDefaultCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.isDefaultCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairCardRepository$isDefaultCard$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$isDefaultCard$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = payairCardRepository;
    }
}
