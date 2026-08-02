package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$executeSearch$2", f = "ContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactsViewModel$executeSearch$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.contacts.LoggerKt.log.e(com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events.CONTACT_SEARCH_EXCEPTION, th);
        this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError.Failed.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$executeSearch$2 contactsViewModel$executeSearch$2 = new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$executeSearch$2(this.getHighSpeedVideoSizes, continuation);
        contactsViewModel$executeSearch$2.getHighSpeedVideoFpsRanges = th;
        return contactsViewModel$executeSearch$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactsViewModel$executeSearch$2(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$executeSearch$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = function1;
    }
}
