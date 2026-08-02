package com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase", f = "GetCryptoSettingsUseCase.kt", i = {}, l = {59}, m = "getPyusdRewardsSettings", n = {}, nl = {60}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class GetCryptoSettingsUseCase$getPyusdRewardsSettings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCryptoSettingsUseCase$getPyusdRewardsSettings$1(com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getCryptoSettingsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$getPyusdRewardsSettings$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getCryptoSettingsUseCase;
    }
}
