package com.paypal.oslo.feature.identity.logout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase", f = "LogoutUseCase.kt", i = {0, 1}, l = {32, 34}, m = "invoke", n = {"unbindDevice", "unbindDevice"}, nl = {33, 36}, s = {"Z$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class LogoutUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutUseCase$invoke$1(com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase logoutUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = logoutUseCase;
    }
}
