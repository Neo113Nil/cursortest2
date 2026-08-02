package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository", f = "MockAutopayRepository.kt", i = {0}, l = {44}, m = "getAutopaySetupOverview", n = {"input"}, nl = {45}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockAutopayRepository$getAutopaySetupOverview$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getAutopaySetupOverview(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAutopayRepository$getAutopaySetupOverview$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$getAutopaySetupOverview$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockAutopayRepository;
    }
}
