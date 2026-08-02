package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase", f = "GetCardFormDataUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {29, 32}, m = "invoke", n = {"fiId", "fiId", "this_$iv", "$this$flatMap$iv$iv", "it$iv", "cardFormData", "$i$f$map", "$i$f$flatMap", "$i$a$-flatMap-Either$map$1$iv", "$i$a$-map-GetCardFormDataUseCase$invoke$2"}, nl = {32, 41}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class GetCardFormDataUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCardFormDataUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getCardFormDataUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = getCardFormDataUseCase;
    }
}
