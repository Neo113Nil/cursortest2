package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase", f = "PostLoginDeviceBindUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {116}, m = "filterEnabledMethods", n = {"allowedMethods", "$this$filter$iv", "$this$filterTo$iv$iv", "destination$iv$iv", "element$iv$iv", "method", "$i$f$filter", "$i$f$filterTo", "$i$a$-filter-PostLoginDeviceBindUseCase$filterEnabledMethods$2"}, nl = {117}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes5.dex */
final class PostLoginDeviceBindUseCase$filterEnabledMethods$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostLoginDeviceBindUseCase$filterEnabledMethods$1(com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase$filterEnabledMethods$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = postLoginDeviceBindUseCase;
    }
}
