package com.paypal.oslo.feature.cryptocurrency.data.repository.preferences;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl", f = "CryptoPreferencesRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {90}, m = "updateCryptoCurrencyPreference", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "intent", "status", "raise$iv$iv$iv", "$this$updateCryptoCurrencyPreference_u24lambda_u240", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$2"}, nl = {91}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
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
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.updateCryptoCurrencyPreference(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1(com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl cryptoPreferencesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$updateCryptoCurrencyPreference$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = cryptoPreferencesRepositoryImpl;
    }
}
