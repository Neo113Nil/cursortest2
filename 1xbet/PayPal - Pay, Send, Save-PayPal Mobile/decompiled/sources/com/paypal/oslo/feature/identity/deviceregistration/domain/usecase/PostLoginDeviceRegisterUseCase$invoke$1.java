package com.paypal.oslo.feature.identity.deviceregistration.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase", f = "PostLoginDeviceRegisterUseCase.kt", i = {}, l = {50, 51, 53, 68}, m = "invoke", n = {}, nl = {51, 53, 54, -1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PostLoginDeviceRegisterUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostLoginDeviceRegisterUseCase$invoke$1(com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase postLoginDeviceRegisterUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = postLoginDeviceRegisterUseCase;
    }
}
