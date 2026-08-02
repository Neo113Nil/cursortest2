package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase", f = "PostLoginDeviceBindUseCase.kt", i = {0, 0}, l = {138}, m = "performBinding", n = {"enabledMethods", "deviceBindingInput"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PostLoginDeviceBindUseCase$performBinding$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostLoginDeviceBindUseCase$performBinding$1(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$performBinding$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = postLoginDeviceBindUseCase;
    }
}
