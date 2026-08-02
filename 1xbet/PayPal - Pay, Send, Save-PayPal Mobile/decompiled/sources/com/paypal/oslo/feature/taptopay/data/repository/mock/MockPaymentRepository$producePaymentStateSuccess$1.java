package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository", f = "MockPaymentRepository.kt", i = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, l = {66, 67, 68, 69, 70, 71, 72, 91, 95, 114}, m = "producePaymentStateSuccess", n = {"$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess", "$this$producePaymentStateSuccess"}, nl = {67, 68, 69, 70, 71, 72, 91, 95, 96, 116}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class MockPaymentRepository$producePaymentStateSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository.access$producePaymentStateSuccess(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPaymentRepository$producePaymentStateSuccess$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository mockPaymentRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository$producePaymentStateSuccess$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockPaymentRepository;
    }
}
