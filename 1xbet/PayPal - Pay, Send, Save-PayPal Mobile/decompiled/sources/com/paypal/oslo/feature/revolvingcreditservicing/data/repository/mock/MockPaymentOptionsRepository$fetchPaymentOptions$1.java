package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository", f = "MockPaymentOptionsRepository.kt", i = {0}, l = {51}, m = "fetchPaymentOptions", n = {"request"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockPaymentOptionsRepository$fetchPaymentOptions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchPaymentOptions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPaymentOptionsRepository$fetchPaymentOptions$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository mockPaymentOptionsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository$fetchPaymentOptions$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockPaymentOptionsRepository;
    }
}
