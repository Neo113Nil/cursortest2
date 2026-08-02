package com.paypal.oslo.feature.pools.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository", f = "MockPoolDetailsRepository.kt", i = {0}, l = {24}, m = "getPool", n = {"id"}, nl = {25}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class MockPoolDetailsRepository$getPool$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getPool(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPoolDetailsRepository$getPool$1(com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository mockPoolDetailsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository$getPool$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockPoolDetailsRepository;
    }
}
