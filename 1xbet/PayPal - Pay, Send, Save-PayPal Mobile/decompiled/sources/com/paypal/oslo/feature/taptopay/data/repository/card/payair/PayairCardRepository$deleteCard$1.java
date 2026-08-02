package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository", f = "PayairCardRepository.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.visa.cbp.getCertUsage.isReperso}, m = "deleteCard", n = {"digitizedCardId", "raise$iv$iv$iv", "$this$deleteCard_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayairCardRepository$deleteCard$2"}, nl = {354}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PayairCardRepository$deleteCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.deleteCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairCardRepository$deleteCard$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository payairCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.PayairCardRepository$deleteCard$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = payairCardRepository;
    }
}
