package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase", f = "PostLoginDeviceBindUseCase.kt", i = {0, 0}, l = {95}, m = "resolveBindableMethods", n = {"postAuthOperations", "allowedMethods"}, nl = {96}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PostLoginDeviceBindUseCase$resolveBindableMethods$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostLoginDeviceBindUseCase$resolveBindableMethods$1(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$resolveBindableMethods$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = postLoginDeviceBindUseCase;
    }
}
