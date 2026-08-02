package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase", f = "PayPalGetCardUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {53, 57, 63, 71, 72}, m = "invoke", n = {"id", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "getCardArt", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayPalGetCardUseCase$invoke$2", "id", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$this$invoke_u24lambda_u240_u240", "getCardArt", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayPalGetCardUseCase$invoke$2", "$i$a$-run-PayPalGetCardUseCase$invoke$2$cardIdGroup$1", "id", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "digitizedCardId", "cardIdGroup", "getCardArt", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayPalGetCardUseCase$invoke$2", "id", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "digitizedCardId", "card", "cardIdGroup", "getCardArt", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayPalGetCardUseCase$invoke$2", "id", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "digitizedCardId", "card", "cardIdGroup", "getCardArt", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PayPalGetCardUseCase$invoke$2"}, nl = {54, 59, 64, 72, 67}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalGetCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase isOutputSupportedFor;
    int toString;
    boolean unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.toString |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.invoke(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalGetCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = payPalGetCardUseCase;
    }
}
