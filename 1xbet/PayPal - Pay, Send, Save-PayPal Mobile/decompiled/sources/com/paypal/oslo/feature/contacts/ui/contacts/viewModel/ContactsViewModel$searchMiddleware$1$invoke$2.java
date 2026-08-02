package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$2", f = "ContactsViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, nl = {131}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactsViewModel$searchMiddleware$1$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$executeSearch(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered) this.Camera2StreamConfigurationMap).getQuery(), this.getHighSpeedVideoFpsRanges.getEventDispatcher(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsViewModel$searchMiddleware$1$invoke$2(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent contactsEvent, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = contactsViewModel;
        this.Camera2StreamConfigurationMap = contactsEvent;
        this.getHighSpeedVideoFpsRanges = input;
    }
}
