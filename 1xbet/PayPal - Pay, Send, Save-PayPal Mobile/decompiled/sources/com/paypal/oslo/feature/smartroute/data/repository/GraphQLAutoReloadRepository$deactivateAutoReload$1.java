package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository", f = "GraphQLAutoReloadRepository.kt", i = {0, 0}, l = {90}, m = "deactivateAutoReload", n = {"balanceId", "mutation"}, nl = {104}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLAutoReloadRepository$deactivateAutoReload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.deactivateAutoReload(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLAutoReloadRepository$deactivateAutoReload$1(com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository graphQLAutoReloadRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = graphQLAutoReloadRepository;
    }
}
