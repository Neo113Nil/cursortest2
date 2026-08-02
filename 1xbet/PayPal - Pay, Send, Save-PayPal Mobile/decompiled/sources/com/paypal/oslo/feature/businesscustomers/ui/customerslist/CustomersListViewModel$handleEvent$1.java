package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$handleEvent$1", f = "CustomersListViewModel.kt", i = {4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 137, 147, 156, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {"email", "$i$a$-let-CustomersListViewModel$handleEvent$1$4"}, nl = {136, 140, 150, 159, 163}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CustomersListViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r2.emit(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenAddCustomer.INSTANCE, r18) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$onCustomerSelected(r18.getHighResolutionOutputSizeshNQ4ISI, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected) r18.Camera2StreamConfigurationMap).getCustomer(), r18) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0114, code lost:
    
        if (r18.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats.emit(((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged) r18.Camera2StreamConfigurationMap).getQuery(), r18) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0162, code lost:
    
        if (r2.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile(((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked) r18.Camera2StreamConfigurationMap).getCustomer()), r18) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0199, code lost:
    
        if (r4.emit(r5, r18) == r1) goto L60;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object value;
        androidx.view.SavedStateHandle savedStateHandle;
        java.lang.Object value2;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent customersListEvent = this.Camera2StreamConfigurationMap;
            if (kotlin.jvm.internal.Intrinsics.areEqual(customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.Refresh.INSTANCE)) {
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$reloadCustomers(customersListViewModel, (java.lang.String) customersListViewModel.getOutputFormats.getValue());
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EndOfListReached.INSTANCE)) {
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$loadMore(this.getHighResolutionOutputSizeshNQ4ISI);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.AddCustomerClick.INSTANCE)) {
                mutableSharedFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 1;
            } else if (customersListEvent instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected) {
                this.getHighSpeedVideoFpsRangesFor = 2;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissError.INSTANCE)) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value3, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value3, null, null, false, false, null, null, null, 119, null)));
            } else if (customersListEvent instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged) {
                savedStateHandle = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                savedStateHandle.set("search_query", ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged) this.Camera2StreamConfigurationMap).getQuery());
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent customersListEvent2 = this.Camera2StreamConfigurationMap;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value2, null, null, false, false, null, null, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged) customersListEvent2).getQuery(), 63, null)));
                this.getHighSpeedVideoFpsRangesFor = 3;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissToast.INSTANCE)) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value, null, null, false, false, null, null, null, 111, null)));
            } else if (customersListEvent instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked) {
                mutableSharedFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 4;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EmailRecipientSelected.INSTANCE)) {
                java.lang.String emailRecipient = ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.getValue()).getEmailRecipient();
                if (emailRecipient != null) {
                    mutableSharedFlow = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult submitEmailResult = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult(emailRecipient);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailRecipient);
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getHighSpeedVideoFpsRangesFor = 5;
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$handleEvent$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomersListViewModel$handleEvent$1(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent customersListEvent, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = customersListEvent;
        this.getHighResolutionOutputSizeshNQ4ISI = customersListViewModel;
    }
}
