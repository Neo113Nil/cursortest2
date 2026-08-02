package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$loadCustomersPage$1", f = "CustomersListViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 200}, m = "invokeSuspend", n = {}, nl = {200, 197}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CustomersListViewModel$loadCustomersPage$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r2 != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0062, code lost:
    
        if (r2 == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase searchCustomersUseCase;
        int i;
        java.lang.Object invoke;
        com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase getCustomersUseCase;
        int i2;
        java.lang.Object invoke2;
        arrow.core.Either either;
        java.lang.Object value;
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState;
        java.lang.Object value2;
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState2;
        java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> plus;
        int i3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRanges.length() == 0) {
                getCustomersUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                i2 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = 1;
                invoke2 = getCustomersUseCase.invoke(i2, this);
            } else {
                searchCustomersUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                i = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = 2;
                invoke = searchCustomersUseCase.invoke(str, i, this);
            }
            return coroutine_suspended;
        }
        if (i4 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            invoke2 = obj;
            either = (arrow.core.Either) invoke2;
        } else {
            if (i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
            either = (arrow.core.Either) invoke;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        if (either.isRight()) {
            com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage customersPage = (com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage) ((arrow.core.Either.Right) either).getValue();
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = customersListViewModel.getHighSpeedVideoSizes;
            do {
                value2 = mutableStateFlow.getValue();
                customerListScreenUiState2 = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value2;
                plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) customerListScreenUiState2.getListUiState().getCustomers(), (java.lang.Iterable) customersPage.getCustomers());
            } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default(customerListScreenUiState2, null, customerListScreenUiState2.getListUiState().copy(plus, false, str2.length() > 0), false, false, null, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$computeEmailRecipient(customersListViewModel, plus.isEmpty()), null, 81, null)));
            i3 = customersListViewModel.getInputSizeshNQ4ISI;
            customersListViewModel.getInputSizeshNQ4ISI = i3 + 1;
            customersListViewModel.getInputFormats = customersPage.getHasNextPage();
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel2 = this.Camera2StreamConfigurationMap;
        java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
        if (either.isLeft()) {
            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = customersListViewModel2.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow2.getValue();
                customerListScreenUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value;
            } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default(customerListScreenUiState, null, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.copy$default(customerListScreenUiState.getListUiState(), null, false, str3.length() > 0, 1, null), false, true, null, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$computeEmailRecipient(customersListViewModel2, customerListScreenUiState.getListUiState().getCustomers().isEmpty()), null, 85, null)));
            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("CustomersListViewModel failed to load customers", exc);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$loadCustomersPage$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$loadCustomersPage$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomersListViewModel$loadCustomersPage$1(java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$loadCustomersPage$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = customersListViewModel;
    }
}
