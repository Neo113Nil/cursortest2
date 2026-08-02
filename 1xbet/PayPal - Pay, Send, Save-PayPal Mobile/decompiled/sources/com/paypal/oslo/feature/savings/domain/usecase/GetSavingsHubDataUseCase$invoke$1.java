package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase", f = "GetSavingsHubDataUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {56, 63}, m = "invoke", n = {"countryCode", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetSavingsHubDataUseCase$invoke$2", "countryCode", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "savingsHubData", "registry", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetSavingsHubDataUseCase$invoke$2"}, nl = {59, 66}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes14.dex */
final class GetSavingsHubDataUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetSavingsHubDataUseCase$invoke$1(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = getSavingsHubDataUseCase;
    }
}
