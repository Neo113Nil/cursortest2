package com.paypal.oslo.feature.settings.domain.mapper.accountsettings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper", f = "AccountSettingsDataMapper.kt", i = {0, 0, 0, 0, 0, 0}, l = {53}, m = "map", n = {"localData", "strings", "settingsDynamicConfiguration", "formatAddressUseCase", "formattedName", "isAccountDiscoverable"}, nl = {56}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes14.dex */
final class AccountSettingsDataMapper$map$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.map(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSettingsDataMapper$map$1(com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper accountSettingsDataMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper$map$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = accountSettingsDataMapper;
    }
}
