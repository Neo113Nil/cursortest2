package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository", f = "MockAutopayRepository.kt", i = {0}, l = {37}, m = "fetchAutopayOverview", n = {"request"}, nl = {39}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockAutopayRepository$fetchAutopayOverview$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchAutopayOverview(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAutopayRepository$fetchAutopayOverview$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$fetchAutopayOverview$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockAutopayRepository;
    }
}
