package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase", f = "GetCloseAccountEligibilityUseCase.kt", i = {0, 0, 0, 0, 0, 0}, l = {29}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetCloseAccountEligibilityUseCase$invoke$2"}, nl = {31}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes14.dex */
final class GetCloseAccountEligibilityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCloseAccountEligibilityUseCase$invoke$1(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase getCloseAccountEligibilityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = getCloseAccountEligibilityUseCase;
    }
}
