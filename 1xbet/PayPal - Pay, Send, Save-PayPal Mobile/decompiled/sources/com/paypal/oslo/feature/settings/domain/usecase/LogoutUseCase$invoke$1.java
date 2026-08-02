package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase", f = "LogoutUseCase.kt", i = {}, l = {49}, m = "invoke", n = {}, nl = {50}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class LogoutUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutUseCase$invoke$1(com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logoutUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = logoutUseCase;
    }
}
