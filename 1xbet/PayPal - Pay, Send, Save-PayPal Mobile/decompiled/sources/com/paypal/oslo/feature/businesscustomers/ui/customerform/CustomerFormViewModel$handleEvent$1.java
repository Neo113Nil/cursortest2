package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1", f = "CustomerFormViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 188, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 215, 231}, m = "invokeSuspend", n = {}, nl = {171, 187, 192, 200, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CustomerFormViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x027c, code lost:
    
        if (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$updateCountriesListState(r21.getHighSpeedVideoFpsRangesFor, r21) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        if (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$submitForm(r21.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted) r2).getFormData(), r21) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ed, code lost:
    
        if (r2.emit(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBack.INSTANCE, r21) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0110, code lost:
    
        if (r2 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0157, code lost:
    
        if (r2 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fb, code lost:
    
        if (r2 != r1) goto L68;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object value;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState customerFormUiState;
        java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields;
        java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields2;
        java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields3;
        java.lang.Object value2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object value3;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy2;
        java.lang.Object value4;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy3;
        java.lang.Object value5;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy4;
        java.lang.Object obj2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = 4;
        switch (this.getHighSpeedVideoFpsRanges) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (!(customerFormEvent2 instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.FormSubmitted)) {
                    if (!(customerFormEvent2 instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(customerFormEvent2, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ExitForm.INSTANCE)) {
                            if (!(customerFormEvent2 instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected)) {
                                if (!(customerFormEvent2 instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected)) {
                                    if (!(customerFormEvent2 instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout)) {
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(customerFormEvent2, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryLoadCountryList.INSTANCE)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        this.getHighSpeedVideoFpsRanges = 6;
                                        break;
                                    } else {
                                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        do {
                                            value = mutableStateFlow.getValue();
                                            customerFormUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value;
                                            int i2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout) customerFormEvent3).getAddressType().ordinal()];
                                            if (i2 == 1) {
                                                customerFormUiState = customerFormUiState.copy((r18 & 1) != 0 ? customerFormUiState.flowType : null, (r18 & 2) != 0 ? customerFormUiState.presentationMode : null, (r18 & 4) != 0 ? customerFormUiState.isSubmitting : false, (r18 & 8) != 0 ? customerFormUiState.countryListState : null, (r18 & 16) != 0 ? customerFormUiState.userCountryCode : null, (r18 & 32) != 0 ? customerFormUiState.errors : null, (r18 & 64) != 0 ? customerFormUiState.shippingAddressLayoutState : null, (r18 & 128) != 0 ? customerFormUiState.billingAddressLayoutState : com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Loading.INSTANCE);
                                            } else if (i2 == 2) {
                                                customerFormUiState = customerFormUiState.copy((r18 & 1) != 0 ? customerFormUiState.flowType : null, (r18 & 2) != 0 ? customerFormUiState.presentationMode : null, (r18 & 4) != 0 ? customerFormUiState.isSubmitting : false, (r18 & 8) != 0 ? customerFormUiState.countryListState : null, (r18 & 16) != 0 ? customerFormUiState.userCountryCode : null, (r18 & 32) != 0 ? customerFormUiState.errors : null, (r18 & 64) != 0 ? customerFormUiState.shippingAddressLayoutState : com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Loading.INSTANCE, (r18 & 128) != 0 ? customerFormUiState.billingAddressLayoutState : null);
                                            } else if (i2 != 3 && i2 != 4) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                        } while (!mutableStateFlow.compareAndSet(value, customerFormUiState));
                                        this.getHighSpeedVideoFpsRanges = 5;
                                        access$getAddressLayoutStatePopulatedWithAddressFields = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout) this.getHighResolutionOutputSizeshNQ4ISI).getCountryCode(), ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout) this.getHighResolutionOutputSizeshNQ4ISI).getAddressFields(), this);
                                        break;
                                    }
                                } else {
                                    this.getHighSpeedVideoFpsRanges = 4;
                                    access$getAddressLayoutStatePopulatedWithAddressFields2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected) this.getHighResolutionOutputSizeshNQ4ISI).getCountryCode(), ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ShippingCountrySelected) this.getHighResolutionOutputSizeshNQ4ISI).getAddressFields(), this);
                                    break;
                                }
                            } else {
                                this.getHighSpeedVideoFpsRanges = 3;
                                access$getAddressLayoutStatePopulatedWithAddressFields3 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected) this.getHighResolutionOutputSizeshNQ4ISI).getCountryCode(), ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.BillingCountrySelected) this.getHighResolutionOutputSizeshNQ4ISI).getAddressFields(), this);
                                break;
                            }
                            return coroutine_suspended;
                        }
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                        do {
                            value2 = mutableStateFlow2.getValue();
                            copy = r8.copy((r18 & 1) != 0 ? r8.flowType : null, (r18 & 2) != 0 ? r8.presentationMode : null, (r18 & 4) != 0 ? r8.isSubmitting : false, (r18 & 8) != 0 ? r8.countryListState : null, (r18 & 16) != 0 ? r8.userCountryCode : null, (r18 & 32) != 0 ? r8.errors : kotlin.collections.CollectionsKt.emptyList(), (r18 & 64) != 0 ? r8.shippingAddressLayoutState : null, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value2).billingAddressLayoutState : null);
                        } while (!mutableStateFlow2.compareAndSet(value2, copy));
                        mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                        this.getHighSpeedVideoFpsRanges = 2;
                        break;
                    } else {
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent4 = this.getHighResolutionOutputSizeshNQ4ISI;
                        do {
                            value3 = mutableStateFlow3.getValue();
                            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState customerFormUiState2 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value3;
                            java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> errors = customerFormUiState2.getErrors();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj3 : errors) {
                                if (!((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.ClearErrors) customerFormEvent4).getErrors().contains((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError) obj3)) {
                                    arrayList.add(obj3);
                                }
                            }
                            copy2 = customerFormUiState2.copy((r18 & 1) != 0 ? customerFormUiState2.flowType : null, (r18 & 2) != 0 ? customerFormUiState2.presentationMode : null, (r18 & 4) != 0 ? customerFormUiState2.isSubmitting : false, (r18 & 8) != 0 ? customerFormUiState2.countryListState : null, (r18 & 16) != 0 ? customerFormUiState2.userCountryCode : null, (r18 & 32) != 0 ? customerFormUiState2.errors : arrayList, (r18 & 64) != 0 ? customerFormUiState2.shippingAddressLayoutState : null, (r18 & 128) != 0 ? customerFormUiState2.billingAddressLayoutState : null);
                        } while (!mutableStateFlow3.compareAndSet(value3, copy2));
                    }
                    return kotlin.Unit.INSTANCE;
                }
                this.getHighSpeedVideoFpsRanges = 1;
                break;
            case 1:
            case 2:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                access$getAddressLayoutStatePopulatedWithAddressFields3 = obj;
                com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields3;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                do {
                    value4 = mutableStateFlow4.getValue();
                    copy3 = r3.copy((r18 & 1) != 0 ? r3.flowType : null, (r18 & 2) != 0 ? r3.presentationMode : null, (r18 & 4) != 0 ? r3.isSubmitting : false, (r18 & 8) != 0 ? r3.countryListState : null, (r18 & 16) != 0 ? r3.userCountryCode : null, (r18 & 32) != 0 ? r3.errors : null, (r18 & 64) != 0 ? r3.shippingAddressLayoutState : null, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value4).billingAddressLayoutState : addressLayoutState);
                } while (!mutableStateFlow4.compareAndSet(value4, copy3));
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                access$getAddressLayoutStatePopulatedWithAddressFields2 = obj;
                com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState2 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields2;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                do {
                    value5 = mutableStateFlow5.getValue();
                    copy4 = r3.copy((r18 & 1) != 0 ? r3.flowType : null, (r18 & 2) != 0 ? r3.presentationMode : null, (r18 & 4) != 0 ? r3.isSubmitting : false, (r18 & 8) != 0 ? r3.countryListState : null, (r18 & 16) != 0 ? r3.userCountryCode : null, (r18 & 32) != 0 ? r3.errors : null, (r18 & 64) != 0 ? r3.shippingAddressLayoutState : addressLayoutState2, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value5).billingAddressLayoutState : null);
                } while (!mutableStateFlow5.compareAndSet(value5, copy4));
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                access$getAddressLayoutStatePopulatedWithAddressFields = obj;
                com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState3 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
                com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent5 = this.getHighResolutionOutputSizeshNQ4ISI;
                while (true) {
                    java.lang.Object value6 = mutableStateFlow6.getValue();
                    com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState customerFormUiState3 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value6;
                    int i3 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent.RetryAddressLayout) customerFormEvent5).getAddressType().ordinal()];
                    if (i3 == 1) {
                        obj2 = value6;
                        customerFormEvent = customerFormEvent5;
                        customerFormUiState3 = customerFormUiState3.copy((r18 & 1) != 0 ? customerFormUiState3.flowType : null, (r18 & 2) != 0 ? customerFormUiState3.presentationMode : null, (r18 & 4) != 0 ? customerFormUiState3.isSubmitting : false, (r18 & 8) != 0 ? customerFormUiState3.countryListState : null, (r18 & 16) != 0 ? customerFormUiState3.userCountryCode : null, (r18 & 32) != 0 ? customerFormUiState3.errors : null, (r18 & 64) != 0 ? customerFormUiState3.shippingAddressLayoutState : null, (r18 & 128) != 0 ? customerFormUiState3.billingAddressLayoutState : addressLayoutState3);
                    } else if (i3 == 2) {
                        obj2 = value6;
                        customerFormEvent = customerFormEvent5;
                        customerFormUiState3 = customerFormUiState3.copy((r18 & 1) != 0 ? customerFormUiState3.flowType : null, (r18 & 2) != 0 ? customerFormUiState3.presentationMode : null, (r18 & 4) != 0 ? customerFormUiState3.isSubmitting : false, (r18 & 8) != 0 ? customerFormUiState3.countryListState : null, (r18 & 16) != 0 ? customerFormUiState3.userCountryCode : null, (r18 & 32) != 0 ? customerFormUiState3.errors : null, (r18 & 64) != 0 ? customerFormUiState3.shippingAddressLayoutState : addressLayoutState3, (r18 & 128) != 0 ? customerFormUiState3.billingAddressLayoutState : null);
                    } else {
                        if (i3 != 3 && i3 != i) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        obj2 = value6;
                        customerFormEvent = customerFormEvent5;
                    }
                    if (mutableStateFlow6.compareAndSet(obj2, customerFormUiState3)) {
                        break;
                    } else {
                        customerFormEvent5 = customerFormEvent;
                        i = 4;
                    }
                }
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.PRIMARY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerFormViewModel$handleEvent$1(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = customerFormEvent;
        this.getHighSpeedVideoFpsRangesFor = customerFormViewModel;
    }
}
