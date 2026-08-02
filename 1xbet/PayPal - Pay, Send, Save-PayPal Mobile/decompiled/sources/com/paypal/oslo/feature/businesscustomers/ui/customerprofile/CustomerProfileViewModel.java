package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020#0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/RemoveCustomerUseCase;", "removeCustomer", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddress", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUpdatesUseCase;", "getEventsFlow", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/RemoveCustomerUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUpdatesUseCase;)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_customers_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/RemoveCustomerUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerProfileViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileViewModel;", "create", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel create(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode);
    }

    @dagger.assisted.AssistedInject
    public CustomerProfileViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, @dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase removeCustomerUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase getCustomersUpdatesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeCustomerUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCustomersUpdatesUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = removeCustomerUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = formatAddressUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState(customer, new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo(null, null, null, null, 15, null), customersPresentationMode, false, null, 24, null));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.uiEffects = MutableSharedFlow$default;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel = this;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(getCustomersUpdatesUseCase.invoke(), new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass1(null)), androidx.view.ViewModelKt.getViewModelScope(customerProfileViewModel));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(customerProfileViewModel), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass2(customer, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r1 != r9) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$personalInfo(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$personalInfo$1 customerProfileViewModel$personalInfo$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2;
        java.lang.String str;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress shippingAddress;
        java.lang.String str2;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer3;
        java.lang.String str3;
        arrow.core.Either either;
        arrow.core.Either either2;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$personalInfo$1) {
            customerProfileViewModel$personalInfo$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$personalInfo$1) continuation;
            if ((customerProfileViewModel$personalInfo$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                customerProfileViewModel$personalInfo$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = customerProfileViewModel$personalInfo$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerProfileViewModel$personalInfo$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress billingAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.getBillingAddress(customer);
                    if (billingAddress != null) {
                        com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = customerProfileViewModel.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.core.i18n.domain.model.Address i18NAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.toI18NAddress(billingAddress);
                        customer2 = customer;
                        customerProfileViewModel$personalInfo$1.getHighSpeedVideoFpsRanges = customer2;
                        customerProfileViewModel$personalInfo$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(billingAddress);
                        customerProfileViewModel$personalInfo$1.Camera2StreamConfigurationMap = 0;
                        customerProfileViewModel$personalInfo$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase.invoke$default(formatAddressUseCase, i18NAddress, null, customerProfileViewModel$personalInfo$1, 2, null);
                    } else {
                        customer2 = customer;
                        str = null;
                        shippingAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.getShippingAddress(customer2);
                        if (shippingAddress != null) {
                            com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase2 = customerProfileViewModel.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.core.i18n.domain.model.Address i18NAddress2 = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.toI18NAddress(shippingAddress);
                            customerProfileViewModel$personalInfo$1.getHighSpeedVideoFpsRanges = customer2;
                            customerProfileViewModel$personalInfo$1.getHighSpeedVideoSizes = str;
                            customerProfileViewModel$personalInfo$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(shippingAddress);
                            customerProfileViewModel$personalInfo$1.Camera2StreamConfigurationMap = 0;
                            customerProfileViewModel$personalInfo$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            java.lang.Object invoke$default = com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase.invoke$default(formatAddressUseCase2, i18NAddress2, null, customerProfileViewModel$personalInfo$1, 2, null);
                            if (invoke$default != coroutine_suspended) {
                                customer3 = customer2;
                                java.lang.String str4 = str;
                                obj = invoke$default;
                                str3 = str4;
                                either2 = (arrow.core.Either) obj;
                                if (either2.isLeft()) {
                                }
                                java.lang.String str5 = (java.lang.String) either2.getOrNull();
                                customer2 = customer3;
                                str = str3;
                                str2 = str5;
                                java.lang.String str6 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer2.getEmails());
                                com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer2.getPhoneNumbers());
                                return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo(str6, customerPhoneNumber != null ? com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.format(customerPhoneNumber) : null, str, str2);
                            }
                            return coroutine_suspended;
                        }
                        str2 = null;
                        java.lang.String str62 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer2.getEmails());
                        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer2.getPhoneNumbers());
                        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo(str62, customerPhoneNumber2 != null ? com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.format(customerPhoneNumber2) : null, str, str2);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = customerProfileViewModel$personalInfo$1.Camera2StreamConfigurationMap;
                        str3 = (java.lang.String) customerProfileViewModel$personalInfo$1.getHighSpeedVideoSizes;
                        customer3 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) customerProfileViewModel$personalInfo$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either2 = (arrow.core.Either) obj;
                        if (either2.isLeft()) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.businesscustomers.LoggerKt.log, "CustomerProfileViewModel failed to format address ".concat(java.lang.String.valueOf((com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) ((arrow.core.Either.Left) either2).getValue())), null, null, null, 14, null);
                        }
                        java.lang.String str52 = (java.lang.String) either2.getOrNull();
                        customer2 = customer3;
                        str = str3;
                        str2 = str52;
                        java.lang.String str622 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer2.getEmails());
                        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber customerPhoneNumber22 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer2.getPhoneNumbers());
                        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo(str622, customerPhoneNumber22 != null ? com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.format(customerPhoneNumber22) : null, str, str2);
                    }
                    int i3 = customerProfileViewModel$personalInfo$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer4 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) customerProfileViewModel$personalInfo$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    customer2 = customer4;
                }
                either = (arrow.core.Either) obj;
                if (either.isLeft()) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.businesscustomers.LoggerKt.log, "CustomerProfileViewModel failed to format address ".concat(java.lang.String.valueOf((com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) ((arrow.core.Either.Left) either).getValue())), null, null, null, 14, null);
                }
                str = (java.lang.String) either.getOrNull();
                shippingAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.getShippingAddress(customer2);
                if (shippingAddress != null) {
                }
            }
        }
        customerProfileViewModel$personalInfo$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$personalInfo$1(customerProfileViewModel, continuation);
        java.lang.Object obj2 = customerProfileViewModel$personalInfo$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerProfileViewModel$personalInfo$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        str = (java.lang.String) either.getOrNull();
        shippingAddress = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.getShippingAddress(customer2);
        if (shippingAddress != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r15 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$removeCustomer(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$removeCustomer$1 customerProfileViewModel$removeCustomer$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState value;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState value2;
        arrow.core.Either either2;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState value3;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$removeCustomer$1) {
            customerProfileViewModel$removeCustomer$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$removeCustomer$1) continuation;
            if ((customerProfileViewModel$removeCustomer$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                customerProfileViewModel$removeCustomer$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = customerProfileViewModel$removeCustomer$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerProfileViewModel$removeCustomer$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    customer = customerProfileViewModel.getHighSpeedVideoSizes.getValue().getCustomer();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> mutableStateFlow = customerProfileViewModel.getHighSpeedVideoSizes;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default(value, null, null, null, true, null, 7, null)));
                    com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase removeCustomerUseCase = customerProfileViewModel.getHighSpeedVideoFpsRangesFor;
                    customerProfileViewModel$removeCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    customerProfileViewModel$removeCustomer$1.getOutputMinFrameDuration = 1;
                    obj = removeCustomerUseCase.invoke(customer, customerProfileViewModel$removeCustomer$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = customerProfileViewModel$removeCustomer$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = customerProfileViewModel$removeCustomer$1.getHighSpeedVideoFpsRanges;
                        int i4 = customerProfileViewModel$removeCustomer$1.getHighSpeedVideoSizes;
                        either2 = (arrow.core.Either) customerProfileViewModel$removeCustomer$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> mutableStateFlow2 = customerProfileViewModel.getHighSpeedVideoSizes;
                            do {
                                value3 = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.compareAndSet(value3, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default(value3, null, null, null, false, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.RemoveCustomerFailed.INSTANCE, 7, null)));
                            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("CustomerProfileViewModel failed to remove customer", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) customerProfileViewModel$removeCustomer$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> mutableStateFlow3 = customerProfileViewModel.getHighSpeedVideoSizes;
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default(value2, null, null, null, false, null, 23, null)));
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect> mutableSharedFlow = customerProfileViewModel.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.NavigateBack.INSTANCE;
                    customerProfileViewModel$removeCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    customerProfileViewModel$removeCustomer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    customerProfileViewModel$removeCustomer$1.getHighSpeedVideoSizesFor = either;
                    customerProfileViewModel$removeCustomer$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    customerProfileViewModel$removeCustomer$1.getHighSpeedVideoSizes = 0;
                    customerProfileViewModel$removeCustomer$1.getHighSpeedVideoFpsRanges = 0;
                    customerProfileViewModel$removeCustomer$1.getHighSpeedVideoFpsRangesFor = 0;
                    customerProfileViewModel$removeCustomer$1.getOutputMinFrameDuration = 2;
                    if (mutableSharedFlow.emit(navigateBack, customerProfileViewModel$removeCustomer$1) != coroutine_suspended) {
                        either2 = either;
                        either = either2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        customerProfileViewModel$removeCustomer$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$removeCustomer$1(customerProfileViewModel, continuation);
        java.lang.Object obj2 = customerProfileViewModel$removeCustomer$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerProfileViewModel$removeCustomer$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$1", f = "CustomerProfileViewModel.kt", i = {0, 0, 0, 0, 0, 0}, l = {73}, m = "invokeSuspend", n = {"event", "$this$update$iv", "prevValue$iv", "old", "$i$f$update", "$i$a$-update-CustomerProfileViewModel$1$1"}, nl = {71}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        int getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        java.lang.Object getOutputMinFrameDuration;

        /* JADX WARN: Code restructure failed: missing block: B:7:0x00a8, code lost:
        
            if (r10.compareAndSet(r8, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default(r6, r7, (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo) r11, null, false, null, 28, null)) == false) goto L12;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0091 -> B:5:0x002f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            int i;
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel;
            java.lang.Object value;
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState customerProfileUiState;
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;
            java.lang.Object access$personalInfo;
            com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate customersUpdate = (com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.getInputFormats;
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (customersUpdate instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited) {
                    mutableStateFlow = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this.getHighSpeedVideoSizes;
                    i = 0;
                    customerProfileViewModel = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this;
                    value = mutableStateFlow.getValue();
                    customerProfileUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) value;
                    com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited customerEdited = (com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited) customersUpdate;
                    customer = kotlin.jvm.internal.Intrinsics.areEqual(customerProfileUiState.getCustomer().getId(), customerEdited.getPreviousId()) ? customerEdited.getCustomer() : customerProfileUiState.getCustomer();
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2 = customerEdited.getCustomer();
                    this.getHighResolutionOutputSizeshNQ4ISI = customersUpdate;
                    this.getHighSpeedVideoFpsRangesFor = mutableStateFlow;
                    this.getHighSpeedVideoSizes = customerProfileViewModel;
                    this.getOutputFormats = value;
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customerProfileUiState);
                    this.getHighSpeedVideoSizesFor = customer;
                    this.getInputSizeshNQ4ISI = customerProfileUiState;
                    this.Camera2StreamConfigurationMap = i;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getInputFormats = 1;
                    access$personalInfo = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.access$personalInfo(customerProfileViewModel, customer2, this);
                    if (access$personalInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.Camera2StreamConfigurationMap;
            customerProfileUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) this.getInputSizeshNQ4ISI;
            customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) this.getHighSpeedVideoSizesFor;
            value = this.getOutputFormats;
            customerProfileViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel) this.getHighSpeedVideoSizes;
            mutableStateFlow = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            access$personalInfo = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate customersUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass1) create(customersUpdate, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass1 anonymousClass1 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$2", f = "CustomerProfileViewModel.kt", i = {0, 0, 0, 0, 0}, l = {79}, m = "invokeSuspend", n = {"$this$update$iv", "prevValue$iv", "it", "$i$f$update", "$i$a$-update-CustomerProfileViewModel$2$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        int getOutputFormats;
        java.lang.Object getOutputMinFrameDuration;

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0068 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0066 -> B:5:0x0069). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.getOutputFormats
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                int r2 = r0.getHighResolutionOutputSizeshNQ4ISI
                java.lang.Object r5 = r0.getInputSizeshNQ4ISI
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState r5 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) r5
                java.lang.Object r6 = r0.getInputFormats
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState r6 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) r6
                java.lang.Object r6 = r0.getHighSpeedVideoSizesFor
                java.lang.Object r7 = r0.getOutputMinFrameDuration
                com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer r7 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) r7
                java.lang.Object r8 = r0.Camera2StreamConfigurationMap
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel r8 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel) r8
                java.lang.Object r9 = r0.getHighSpeedVideoSizes
                kotlinx.coroutines.flow.MutableStateFlow r9 = (kotlinx.coroutines.flow.MutableStateFlow) r9
                kotlin.ResultKt.throwOnFailure(r20)
                r10 = r20
                goto L69
            L2c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L34:
                kotlin.ResultKt.throwOnFailure(r20)
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel r2 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r2 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.access$get_uiState$p(r2)
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel r5 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this
                com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer r6 = r0.getHighSpeedVideoFpsRanges
                r9 = r2
                r2 = r4
                r8 = r5
                r7 = r6
            L45:
                java.lang.Object r6 = r9.getValue()
                r5 = r6
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState r5 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) r5
                r0.getHighSpeedVideoSizes = r9
                r0.Camera2StreamConfigurationMap = r8
                r0.getOutputMinFrameDuration = r7
                r0.getHighSpeedVideoSizesFor = r6
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                r0.getInputFormats = r10
                r0.getInputSizeshNQ4ISI = r5
                r0.getHighResolutionOutputSizeshNQ4ISI = r2
                r0.getHighSpeedVideoFpsRangesFor = r4
                r0.getOutputFormats = r3
                java.lang.Object r10 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.access$personalInfo(r8, r7, r0)
                if (r10 != r1) goto L69
                return r1
            L69:
                r11 = r5
                r12 = 0
                r13 = r10
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo r13 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.PersonalInfo) r13
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 29
                r18 = 0
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState r5 = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState.copy$default(r11, r12, r13, r14, r15, r16, r17, r18)
                boolean r5 = r9.compareAndSet(r6, r5)
                if (r5 == 0) goto L45
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.this.new AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = customer;
        }
    }

    public final kotlinx.coroutines.Job handleEvent$business_customers_prodRelease(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }
}
