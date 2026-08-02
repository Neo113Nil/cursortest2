package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase", f = "FormatSavedAddressesUseCase.kt", i = {0, 0, 0}, l = {65}, m = "formatAddress", n = {"savedAddress", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "address"}, nl = {66}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class FormatSavedAddressesUseCase$formatAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatSavedAddressesUseCase$formatAddress$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase formatSavedAddressesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$formatAddress$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = formatSavedAddressesUseCase;
    }
}
