package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository", f = "GraphQLDistributionRepository.kt", i = {0}, l = {75}, m = "loadConfiguration", n = {"query"}, nl = {82}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLDistributionRepository$loadConfiguration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.loadConfiguration(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLDistributionRepository$loadConfiguration$1(com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository graphQLDistributionRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = graphQLDistributionRepository;
    }
}
