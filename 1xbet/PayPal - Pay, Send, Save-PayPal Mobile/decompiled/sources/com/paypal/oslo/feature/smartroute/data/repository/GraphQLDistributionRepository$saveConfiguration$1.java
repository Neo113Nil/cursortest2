package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository", f = "GraphQLDistributionRepository.kt", i = {0, 0}, l = {89}, m = "saveConfiguration", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "mutation"}, nl = {103}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLDistributionRepository$saveConfiguration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.saveConfiguration(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLDistributionRepository$saveConfiguration$1(com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository graphQLDistributionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = graphQLDistributionRepository;
    }
}
