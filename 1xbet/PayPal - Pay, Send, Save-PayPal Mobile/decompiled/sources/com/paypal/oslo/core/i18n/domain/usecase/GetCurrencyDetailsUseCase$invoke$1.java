package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase", f = "GetCurrencyDetailsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {53}, m = "invoke", n = {"currencyConfiguration", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "locale", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetCurrencyDetailsUseCase$invoke$2"}, nl = {55}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes10.dex */
final class GetCurrencyDetailsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCurrencyDetailsUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase getCurrencyDetailsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = getCurrencyDetailsUseCase;
    }
}
