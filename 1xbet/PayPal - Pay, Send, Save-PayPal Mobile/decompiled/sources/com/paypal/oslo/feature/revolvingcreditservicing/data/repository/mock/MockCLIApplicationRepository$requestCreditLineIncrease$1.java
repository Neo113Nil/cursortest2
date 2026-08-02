package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository", f = "MockCLIApplicationRepository.kt", i = {0}, l = {35}, m = "requestCreditLineIncrease", n = {"request"}, nl = {37}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockCLIApplicationRepository$requestCreditLineIncrease$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.requestCreditLineIncrease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCLIApplicationRepository$requestCreditLineIncrease$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository mockCLIApplicationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository$requestCreditLineIncrease$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockCLIApplicationRepository;
    }
}
