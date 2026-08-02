package com.paypal.oslo.feature.settings.domain.mapper.accountsettings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper", f = "AccountSettingsDataMapper.kt", i = {0, 0, 0}, l = {83}, m = "formatAddress", n = {"formatAddressUseCase", "address", "config"}, nl = {83}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class AccountSettingsDataMapper$formatAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSettingsDataMapper$formatAddress$1(com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper accountSettingsDataMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$formatAddress$1> continuation) {
        super(continuation);
        this.getOutputFormats = accountSettingsDataMapper;
    }
}
