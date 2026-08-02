package com.paypal.oslo.feature.subscriptions.cancel.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl", f = "DisableAgreementRepositoryImpl.kt", i = {0, 0}, l = {35}, m = "disableConsumerAgreement", n = {"agreementId", "agreementType"}, nl = {39}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class DisableAgreementRepositoryImpl$disableConsumerAgreement$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.disableConsumerAgreement(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisableAgreementRepositoryImpl$disableConsumerAgreement$1(com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl disableAgreementRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl$disableConsumerAgreement$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = disableAgreementRepositoryImpl;
    }
}
