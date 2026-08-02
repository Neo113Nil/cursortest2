package com.paypal.oslo.feature.subscriptions.bulkfi.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl", f = "BulkUpdateFiRepositoryImpl.kt", i = {0, 0}, l = {49}, m = "getConsumerAgreementsByFundingInstrument", n = {"agreementType", "input"}, nl = {53}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getConsumerAgreementsByFundingInstrument(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1(com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl bulkUpdateFiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = bulkUpdateFiRepositoryImpl;
    }
}
