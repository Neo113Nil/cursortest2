package com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl", f = "LinkAgreementsRepositoryImpl.kt", i = {0, 0, 0}, l = {49}, m = "getAvailableMerchants", n = {"agreementType", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "searchText"}, nl = {54}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsRepositoryImpl$getAvailableMerchants$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.getAvailableMerchants(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsRepositoryImpl$getAvailableMerchants$1(com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl linkAgreementsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1> continuation) {
        super(continuation);
        this.getInputFormats = linkAgreementsRepositoryImpl;
    }
}
