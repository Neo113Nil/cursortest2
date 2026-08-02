package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase", f = "SaveCheckoutExperienceUseCase.kt", i = {0, 0}, l = {34}, m = "invoke", n = {"action", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, nl = {59}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class SaveCheckoutExperienceUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveCheckoutExperienceUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase saveCheckoutExperienceUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = saveCheckoutExperienceUseCase;
    }
}
