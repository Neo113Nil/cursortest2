package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1", f = "CustomersListScreen.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CustomersListScreenKt$CustomersListScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect> uiEffects = this.getHighResolutionOutputSizeshNQ4ISI.getUiEffects();
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            if (uiEffects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect customersListUiEffect = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(customersListUiEffect, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenAddCustomer.INSTANCE)) {
                        function0.invoke();
                    } else if (customersListUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile) {
                        function1.invoke(((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile) customersListUiEffect).getCustomer());
                    } else if (customersListUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult) {
                        function12.invoke(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient(((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult) customersListUiEffect).getCustomer()));
                    } else {
                        if (!(customersListUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function12.invoke(new com.paypal.oslo.feature.businesscustomers.api.domain.model.EmailRecipient(((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult) customersListUiEffect).getEmail()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomersListScreenKt$CustomersListScreen$5$1(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = customersListViewModel;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
    }
}
