package com.paypal.oslo.feature.contacts.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl", f = "SearchContactsUseCaseImpl.kt", i = {0, 0, 0, 0}, l = {45}, m = "invoke", n = {com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "query", "contactSearchNetworkType", "limit"}, nl = {44}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class SearchContactsUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(null, null, 0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchContactsUseCaseImpl$invoke$1(com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl searchContactsUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = searchContactsUseCaseImpl;
    }
}
