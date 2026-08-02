package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase", f = "DeviceBindingUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {59}, m = "invoke", n = {"deviceBindingInput", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "eligibleMethods", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-DeviceBindingUseCase$invoke$2"}, nl = {67}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class DeviceBindingUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase getOutputSizes;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceBindingUseCase$invoke$1(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase deviceBindingUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = deviceBindingUseCase;
    }
}
