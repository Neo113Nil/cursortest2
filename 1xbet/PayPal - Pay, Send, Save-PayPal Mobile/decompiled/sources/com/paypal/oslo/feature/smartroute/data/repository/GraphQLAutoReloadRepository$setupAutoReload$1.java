package com.paypal.oslo.feature.smartroute.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository", f = "GraphQLAutoReloadRepository.kt", i = {0, 0}, l = {71}, m = "setupAutoReload", n = {"request", "mutation"}, nl = {85}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class GraphQLAutoReloadRepository$setupAutoReload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.setupAutoReload(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLAutoReloadRepository$setupAutoReload$1(com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository graphQLAutoReloadRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = graphQLAutoReloadRepository;
    }
}
