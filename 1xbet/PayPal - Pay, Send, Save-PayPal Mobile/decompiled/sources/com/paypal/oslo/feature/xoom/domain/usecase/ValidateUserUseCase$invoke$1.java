package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase", f = "ValidateUserUseCase.kt", i = {1, 1, 1, 1}, l = {29, 47}, m = "invoke", n = {"this_$iv", "userInfo", "$i$f$fold", "$i$a$-fold-ValidateUserUseCase$invoke$3"}, nl = {59, 61}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes16.dex */
final class ValidateUserUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateUserUseCase$invoke$1(com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = validateUserUseCase;
    }
}
