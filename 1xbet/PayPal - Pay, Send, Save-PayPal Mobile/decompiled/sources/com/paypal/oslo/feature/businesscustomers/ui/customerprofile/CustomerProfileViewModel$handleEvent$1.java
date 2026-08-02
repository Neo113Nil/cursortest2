package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1", f = "CustomerProfileViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, l = {101, 103, 107, 112, 117, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 130}, m = "invokeSuspend", n = {"clearErrors", "openEditCustomer", "clearErrors", "openEditCustomer", "clearErrors", "openEditCustomer", "clearErrors", "openEditCustomer", "clearErrors", "openEditCustomer", "clearErrors", "openEditCustomer", "clearErrors", "openEditCustomer"}, nl = {103, 105, 110, 115, 120, 125, 88}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class CustomerProfileViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r1.invoke(r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.access$removeCustomer(r12.Camera2StreamConfigurationMap, r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r1.invoke(r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (r1.invoke(r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        if (r2.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.SubmitCustomerResult(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) r12.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.getValue()).getCustomer()), r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        if (r2.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.NavigateToInvoice(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) r12.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.getValue()).getCustomer()), r12) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cc, code lost:
    
        if (r2.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.OpenEditNotes(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) r12.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.getValue()).getCustomer()), r12) == r0) goto L56;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoSizes) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel = this.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this);
                    }
                };
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$openEditCustomer$1 customerProfileViewModel$handleEvent$1$openEditCustomer$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$openEditCustomer$1(function0, this.Camera2StreamConfigurationMap, null);
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent customerProfileEvent = this.getHighSpeedVideoFpsRanges;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.CallCustomer.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.MessageCustomer.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EmailCustomer.INSTANCE)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditCustomer.INSTANCE)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                        this.getHighSpeedVideoSizes = 1;
                        break;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.RemoveCustomer.INSTANCE)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                        this.getHighSpeedVideoSizes = 2;
                        break;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddEmail.INSTANCE)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                        this.getHighSpeedVideoSizes = 3;
                        break;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddPhone.INSTANCE)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                        this.getHighSpeedVideoSizes = 4;
                        break;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ChooseCustomer.INSTANCE)) {
                        mutableSharedFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                        this.getHighSpeedVideoSizes = 5;
                        break;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ClearError.INSTANCE)) {
                        function0.invoke();
                        break;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.SendInvoice.INSTANCE)) {
                        if (kotlin.collections.CollectionsKt.any(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.getValue()).getCustomer().getEmails())) {
                            mutableSharedFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                            this.getHighSpeedVideoSizes = 6;
                            break;
                        } else {
                            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) value, null, null, null, false, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.SendInvoiceWithoutEmail.INSTANCE, 15, null)));
                        }
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditNotes.INSTANCE)) {
                        mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileViewModel$handleEvent$1$openEditCustomer$1);
                        this.getHighSpeedVideoSizes = 7;
                        break;
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                kotlin.ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel) {
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = customerProfileViewModel.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) value, null, null, null, false, null, 15, null)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerProfileViewModel$handleEvent$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent customerProfileEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = customerProfileEvent;
        this.Camera2StreamConfigurationMap = customerProfileViewModel;
    }
}
