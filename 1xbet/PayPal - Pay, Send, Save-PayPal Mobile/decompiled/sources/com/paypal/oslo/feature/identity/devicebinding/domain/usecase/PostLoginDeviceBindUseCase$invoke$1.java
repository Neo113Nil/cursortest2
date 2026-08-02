package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase", f = "PostLoginDeviceBindUseCase.kt", i = {0, 1, 1}, l = {69, 71}, m = "invoke", n = {"postAuthOperations", "postAuthOperations", "methodsToEnable"}, nl = {70, 72}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PostLoginDeviceBindUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostLoginDeviceBindUseCase$invoke$1(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = postLoginDeviceBindUseCase;
    }
}
