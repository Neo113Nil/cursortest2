package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase", f = "CreateAccountActivityLogUseCase.kt", i = {0, 0, 1, 1, 1, 1}, l = {44, 55}, m = "invoke", n = {"reason", "userInput", "reason", "userInput", "userProfile", "activityLog"}, nl = {45, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class CreateAccountActivityLogUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAccountActivityLogUseCase$invoke$1(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase createAccountActivityLogUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = createAccountActivityLogUseCase;
    }
}
