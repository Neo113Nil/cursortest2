package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository", f = "GraphQLDistributionRepository.kt", i = {0, 0}, l = {110}, m = "updateCryptocurrencyPreferences", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLDistributionRepository$updateCryptocurrencyPreferences$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.updateCryptocurrencyPreferences(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLDistributionRepository$updateCryptocurrencyPreferences$1(com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository graphQLDistributionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = graphQLDistributionRepository;
    }
}
