package com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase", f = "GetCryptoSettingsUseCase.kt", i = {}, l = {47}, m = "invoke", n = {}, nl = {49}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class GetCryptoSettingsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCryptoSettingsUseCase$invoke$1(com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getCryptoSettingsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getCryptoSettingsUseCase;
    }
}
