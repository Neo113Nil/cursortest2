package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$1", f = "ContactsViewModel.kt", i = {1}, l = {121, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "invokeSuspend", n = {"searchQuery"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ContactsViewModel$searchMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$executeSearch(r6.getHighSpeedVideoFpsRangesFor, r7, r6.getHighSpeedVideoSizes.getEventDispatcher(), r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(200, r6) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        mviStateStore = contactsViewModel.getInputSizeshNQ4ISI;
        java.lang.String access$buildSearchQuery = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$buildSearchQuery(contactsViewModel, str, (com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState) mviStateStore.getUiState().getValue());
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildSearchQuery);
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsViewModel$searchMiddleware$1$invoke$1(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.lang.String str, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = contactsViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = input;
    }
}
