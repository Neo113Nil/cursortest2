package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository", f = "MockAutopayRepository.kt", i = {0}, l = {51}, m = "updateAutopay", n = {"input"}, nl = {52}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockAutopayRepository$updateAutopay$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updateAutopay(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAutopayRepository$updateAutopay$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockAutopayRepository;
    }
}
