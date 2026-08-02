package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt$CustomerProfileScreen$6$1", f = "CustomerProfileScreen.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CustomerProfileScreenKt$CustomerProfileScreen$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect> uiEffects = this.getOutputMinFrameDuration.getUiEffects();
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function13 = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function14 = this.getHighSpeedVideoFpsRanges;
            this.getInputSizeshNQ4ISI = 1;
            if (uiEffects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt$CustomerProfileScreen$6$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect customerProfileUiEffect = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect) obj2;
                    if (customerProfileUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.NavigateBack) {
                        function0.invoke();
                    } else if (customerProfileUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.SubmitCustomerResult) {
                        function1.invoke(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.SubmitCustomerResult) customerProfileUiEffect).getCustomer()));
                    } else if (customerProfileUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.OpenEditCustomer) {
                        function12.invoke(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.OpenEditCustomer) customerProfileUiEffect).getCustomer());
                    } else if (customerProfileUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.NavigateToInvoice) {
                        function13.invoke(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.NavigateToInvoice) customerProfileUiEffect).getCustomer());
                    } else {
                        if (!(customerProfileUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.OpenEditNotes)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function14.invoke(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.OpenEditNotes) customerProfileUiEffect).getCustomer());
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
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt$CustomerProfileScreen$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt$CustomerProfileScreen$6$1(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomerProfileScreenKt$CustomerProfileScreen$6$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function14, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt$CustomerProfileScreen$6$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = customerProfileViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.Camera2StreamConfigurationMap = function13;
        this.getHighSpeedVideoFpsRanges = function14;
    }
}
