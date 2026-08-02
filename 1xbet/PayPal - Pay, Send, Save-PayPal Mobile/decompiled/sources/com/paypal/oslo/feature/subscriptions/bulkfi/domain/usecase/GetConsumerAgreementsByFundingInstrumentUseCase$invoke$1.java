package com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase", f = "GetConsumerAgreementsByFundingInstrumentUseCase.kt", i = {0}, l = {36}, m = "invoke", n = {"agreementType"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1(com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase getConsumerAgreementsByFundingInstrumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getConsumerAgreementsByFundingInstrumentUseCase;
    }
}
