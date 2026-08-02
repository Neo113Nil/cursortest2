package com.paypal.oslo.feature.cryptocurrency.data.repository.preferences;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl", f = "CryptoPreferencesRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {60}, m = "getCryptoPreferences", n = {com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "intent", "raise$iv$iv$iv", "$this$getCryptoPreferences_u24lambda_u240", "query", "apolloCall", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoPreferencesRepositoryImpl$getCryptoPreferences$2"}, nl = {61}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoPreferencesRepositoryImpl$getCryptoPreferences$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputSizes.getCryptoPreferences(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPreferencesRepositoryImpl$getCryptoPreferences$1(com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl cryptoPreferencesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl$getCryptoPreferences$1> continuation) {
        super(continuation);
        this.getOutputSizes = cryptoPreferencesRepositoryImpl;
    }
}
