package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository", f = "MockAutopayRepository.kt", i = {0}, l = {48}, m = "updateAutopay", n = {"request"}, nl = {50}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockAutopayRepository$updateAutopay$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updateAutopay(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAutopayRepository$updateAutopay$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = mockAutopayRepository;
    }
}
