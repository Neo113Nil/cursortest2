package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleLoadRecentSearches$1", f = "ContactsViewModel.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactsViewModel$handleLoadRecentSearches$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            contactsSearchStrategy = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = contactsSearchStrategy.getRecentContacts(this.Camera2StreamConfigurationMap.getNetworkType(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.contacts.api.RecentSearchError recentSearchError = (com.paypal.oslo.feature.contacts.api.RecentSearchError) ((arrow.core.Ior.Left) ior).getValue();
            mviStateStore3 = contactsViewModel.getInputSizeshNQ4ISI;
            mviStateStore3.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesError(recentSearchError.toString()));
        } else if (ior instanceof arrow.core.Ior.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
            mviStateStore2 = contactsViewModel.getInputSizeshNQ4ISI;
            mviStateStore2.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess(list));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            java.util.List list2 = (java.util.List) both.getRightValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.contacts.LoggerKt.log, com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events.RECENT_SEARCHES_PARTIAL_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.contacts.api.RecentSearchError) leftValue).toString())), null, 4, null);
            mviStateStore = contactsViewModel.getInputSizeshNQ4ISI;
            mviStateStore.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.RecentSearchesSuccess(list2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleLoadRecentSearches$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleLoadRecentSearches$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsViewModel$handleLoadRecentSearches$1(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches loadRecentSearches, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleLoadRecentSearches$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = contactsViewModel;
        this.Camera2StreamConfigurationMap = loadRecentSearches;
    }
}
