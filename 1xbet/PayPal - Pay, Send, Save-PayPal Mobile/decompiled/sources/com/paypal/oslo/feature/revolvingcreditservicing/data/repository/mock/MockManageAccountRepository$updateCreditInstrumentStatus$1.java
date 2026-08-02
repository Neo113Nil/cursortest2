package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository", f = "MockManageAccountRepository.kt", i = {0, 0, 0, 0}, l = {37}, m = "updateCreditInstrumentStatus", n = {"creditProductIdentifier", "creditAccountId", "creditInstrumentId", "status"}, nl = {40}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class MockManageAccountRepository$updateCreditInstrumentStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.updateCreditInstrumentStatus(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockManageAccountRepository$updateCreditInstrumentStatus$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository mockManageAccountRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateCreditInstrumentStatus$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = mockManageAccountRepository;
    }
}
