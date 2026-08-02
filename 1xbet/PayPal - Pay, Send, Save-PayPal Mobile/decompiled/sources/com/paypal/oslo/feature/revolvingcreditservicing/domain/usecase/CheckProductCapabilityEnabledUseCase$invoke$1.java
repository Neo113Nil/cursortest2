package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase", f = "CheckProductCapabilityEnabledUseCase.kt", i = {0}, l = {32}, m = "invoke", n = {"input"}, nl = {33}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class CheckProductCapabilityEnabledUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability) null, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.lang.Throwable, java.lang.Boolean>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckProductCapabilityEnabledUseCase$invoke$1(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase checkProductCapabilityEnabledUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = checkProductCapabilityEnabledUseCase;
    }
}
