package com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl", f = "CryptoSubscriptionCapabilitiesRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {38}, m = "getCryptoSubscriptionCapabilities", n = {"raise$iv$iv$iv", "$this$getCryptoSubscriptionCapabilities_u24lambda_u240", "query", "apolloCall", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$2"}, nl = {39}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizes.getCryptoSubscriptionCapabilities(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1(com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl cryptoSubscriptionCapabilitiesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl$getCryptoSubscriptionCapabilities$1> continuation) {
        super(continuation);
        this.getOutputSizes = cryptoSubscriptionCapabilitiesRepositoryImpl;
    }
}
