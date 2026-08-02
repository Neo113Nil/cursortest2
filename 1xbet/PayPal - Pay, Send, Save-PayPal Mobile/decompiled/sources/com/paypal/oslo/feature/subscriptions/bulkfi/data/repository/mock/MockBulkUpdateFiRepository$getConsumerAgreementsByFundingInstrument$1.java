package com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository", f = "MockBulkUpdateFiRepository.kt", i = {0}, l = {35}, m = "getConsumerAgreementsByFundingInstrument", n = {"agreementType"}, nl = {38}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getConsumerAgreementsByFundingInstrument(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1(com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository mockBulkUpdateFiRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository$getConsumerAgreementsByFundingInstrument$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = mockBulkUpdateFiRepository;
    }
}
