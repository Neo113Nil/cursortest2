package com.paypal.oslo.feature.contacts.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl", f = "ContactSearchRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {56}, m = "searchContacts", n = {com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "query", "contactSearchNetworkType", "graphQLSearchType", "graphQLNetworkType", "limit"}, nl = {68}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class ContactSearchRepositoryImpl$searchContacts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.searchContacts(null, null, 0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactSearchRepositoryImpl$searchContacts$1(com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl contactSearchRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = contactSearchRepositoryImpl;
    }
}
