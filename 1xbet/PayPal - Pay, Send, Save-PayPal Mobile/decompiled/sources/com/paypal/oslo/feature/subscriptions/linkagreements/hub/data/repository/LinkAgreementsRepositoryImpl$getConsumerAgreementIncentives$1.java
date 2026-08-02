package com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl", f = "LinkAgreementsRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {80}, m = "getConsumerAgreementIncentives", n = {"agreementType", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "searchText", "cursor", "suggestedMerchantsInput", "input", "query"}, nl = {83}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(null, null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1(com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl linkAgreementsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = linkAgreementsRepositoryImpl;
    }
}
