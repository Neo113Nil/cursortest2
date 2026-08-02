package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase", f = "GetDefaultCardUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {40, 43}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetDefaultCardUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "card", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetDefaultCardUseCase$invoke$2"}, nl = {42, 80}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class GetDefaultCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetDefaultCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase getDefaultCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = getDefaultCardUseCase;
    }
}
