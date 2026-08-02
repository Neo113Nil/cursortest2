package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase", f = "FormatSavedAddressesUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {49}, m = "invoke", n = {"addresses", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "savedAddress", "$i$f$map", "$i$f$mapTo", "$i$a$-map-FormatSavedAddressesUseCase$invoke$2"}, nl = {88}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class FormatSavedAddressesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.toString.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatSavedAddressesUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase formatSavedAddressesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$invoke$1> continuation) {
        super(continuation);
        this.toString = formatSavedAddressesUseCase;
    }
}
