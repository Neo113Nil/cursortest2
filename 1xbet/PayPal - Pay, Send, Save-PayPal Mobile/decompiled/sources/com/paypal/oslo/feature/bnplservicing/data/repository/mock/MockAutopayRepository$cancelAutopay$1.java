package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository", f = "MockAutopayRepository.kt", i = {0}, l = {62}, m = "cancelAutopay", n = {"input"}, nl = {63}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockAutopayRepository$cancelAutopay$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.cancelAutopay(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAutopayRepository$cancelAutopay$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$cancelAutopay$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockAutopayRepository;
    }
}
