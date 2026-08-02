package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository", f = "MockCLIRepository.kt", i = {0, 0}, l = {41}, m = "fetchCreditLineIncreaseOffer", n = {"creditProductIdentifier", "creditAccountId"}, nl = {43}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class MockCLIRepository$fetchCreditLineIncreaseOffer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchCreditLineIncreaseOffer(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCLIRepository$fetchCreditLineIncreaseOffer$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository mockCLIRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository$fetchCreditLineIncreaseOffer$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockCLIRepository;
    }
}
