package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00019BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00102R \u00105\u001a\b\u0012\u0004\u0012\u000201048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/CreateCustomerUseCase;", "createCustomerUseCase", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;", "updateCustomerUseCase", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetUserCountryCodeUseCase;", "getUserCountryCode", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "addressLayoutUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "countriesListUseCase", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/CreateCustomerUseCase;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetUserCountryCodeUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/FlowType;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_customers_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;)Lkotlinx/coroutines/Job;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/CreateCustomerUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetUserCountryCodeUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerFormViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormViewModel;", "create", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/FlowType;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel create(com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode);
    }

    @dagger.assisted.AssistedInject
    public CustomerFormViewModel(com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase createCustomerUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase getUserCountryCodeUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType, @dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCustomerUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCustomerUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserCountryCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressLayoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCountriesListUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        this.getHighSpeedVideoFpsRangesFor = createCustomerUseCase;
        this.Camera2StreamConfigurationMap = updateCustomerUseCase;
        this.getHighSpeedVideoFpsRanges = getUserCountryCodeUseCase;
        this.getHighSpeedVideoSizes = getAddressLayoutUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getCountriesListUseCase;
        boolean z = false;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState countryListState = null;
        java.lang.String str = null;
        java.util.List list = null;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState(flowType, customersPresentationMode, z, countryListState, str, list, com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Loading.INSTANCE, com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Loading.INSTANCE, 44, null));
        this.getInputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.uiEffects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1(flowType, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1 customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields2;
        com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1) {
            customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1) continuation;
            if ((customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1 customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12 = customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1;
                java.lang.Object obj = customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase = customerFormViewModel.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, str, null, null, null, 119, null);
                    customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addressFields2 = addressFields;
                    customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12.getHighSpeedVideoFpsRanges = addressFields2;
                    customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.invoke$default(getAddressLayoutUseCase, null, addressConfiguration, customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    addressFields2 = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields) customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either) obj).getOrNull();
                if (addressLayout == null) {
                    return new com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Loaded(com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutExtKt.copyWithAddressFields(addressLayout, addressFields2));
                }
                return com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error.INSTANCE;
            }
        }
        customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1(customerFormViewModel, continuation);
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1 customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$122 = customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$1;
        java.lang.Object obj2 = customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerFormViewModel$getAddressLayoutStatePopulatedWithAddressFields$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either) obj2).getOrNull();
        if (addressLayout == null) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$1", f = "CustomerFormViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {105, 110, 132, 136}, m = "invokeSuspend", n = {"$this$launch", "userCountryCode", "addressFields", "$this$launch", "userCountryCode", "addressFields", "billingAddressLayoutState", "$this$launch", "userCountryCode", "billingAddressFields", "shippingAddressFields", "it", "$i$a$-let-CustomerFormViewModel$1$billingAddressLayoutState$1", "$this$launch", "userCountryCode", "billingAddressFields", "shippingAddressFields", "billingAddressLayoutState", "it", "$i$a$-let-CustomerFormViewModel$1$shippingAddressLayoutState$1"}, nl = {104, 109, 131, 135}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        int getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0261, code lost:
        
            if (r1 == r8) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
        
            if (r3 != r8) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0266, code lost:
        
            if (r1 == null) goto L77;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0237  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object value;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy;
            java.lang.String str;
            java.lang.Object obj2;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields;
            java.lang.Object obj3;
            java.lang.Object obj4;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields2;
            java.lang.String str2;
            java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields3;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields4;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState inputState;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState inputState2;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields5;
            java.lang.String str3;
            java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields2;
            java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields3;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            java.lang.Object value2;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy2;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error error;
            java.lang.String countryCode;
            java.lang.Object access$getAddressLayoutStatePopulatedWithAddressFields4;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error error2;
            java.lang.Object value3;
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy3;
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String invoke = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this.getHighSpeedVideoFpsRanges.invoke();
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this.getInputFormats;
                do {
                    value = mutableStateFlow2.getValue();
                    copy = r14.copy((r18 & 1) != 0 ? r14.flowType : null, (r18 & 2) != 0 ? r14.presentationMode : null, (r18 & 4) != 0 ? r14.isSubmitting : false, (r18 & 8) != 0 ? r14.countryListState : null, (r18 & 16) != 0 ? r14.userCountryCode : invoke, (r18 & 32) != 0 ? r14.errors : null, (r18 & 64) != 0 ? r14.shippingAddressLayoutState : null, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value).billingAddressLayoutState : null);
                } while (!mutableStateFlow2.compareAndSet(value, copy));
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1.AnonymousClass2(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this, null), 3, null);
                com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType = this.getHighResolutionOutputSizeshNQ4ISI;
                if (flowType instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Create) {
                    addressFields5 = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields(invoke, null, null, null, null, null, 62, null);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                    str3 = invoke;
                    this.Camera2StreamConfigurationMap = str3;
                    this.getHighSpeedVideoFpsRanges = addressFields5;
                    this.getInputSizeshNQ4ISI = 1;
                    access$getAddressLayoutStatePopulatedWithAddressFields2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this, str3, addressFields5, this);
                } else {
                    str = invoke;
                    if (!(flowType instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.util.Iterator<T> it = ((com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit) flowType).getCustomer().getAddresses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj2).getAddressType() == com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.BILLING) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj2;
                    if (customerAddress == null || (inputState2 = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.toInputState(customerAddress)) == null || (addressFields = inputState2.getAddress()) == null) {
                        obj3 = null;
                        addressFields = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields(str, null, null, null, null, null, 62, null);
                    } else {
                        obj3 = null;
                    }
                    java.util.Iterator<T> it2 = ((com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit) this.getHighResolutionOutputSizeshNQ4ISI).getCustomer().getAddresses().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj4 = obj3;
                            break;
                        }
                        obj4 = it2.next();
                        if (((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj4).getAddressType() == com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType.SHIPPING) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress customerAddress2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress) obj4;
                    if (customerAddress2 == null || (inputState = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerAddressExtensionsKt.toInputState(customerAddress2)) == null || (addressFields2 = inputState.getAddress()) == null) {
                        addressFields2 = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields(str, null, null, null, null, null, 62, null);
                    }
                    java.lang.String countryCode2 = addressFields.getCountryCode();
                    if (countryCode2 != null) {
                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this;
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressFields);
                        this.getHighSpeedVideoFpsRangesFor = addressFields2;
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(countryCode2);
                        this.getHighSpeedVideoSizes = 0;
                        this.getInputSizeshNQ4ISI = 3;
                        access$getAddressLayoutStatePopulatedWithAddressFields = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(customerFormViewModel, countryCode2, addressFields, this);
                        if (access$getAddressLayoutStatePopulatedWithAddressFields != coroutine_suspended) {
                            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields6 = addressFields2;
                            addressFields3 = addressFields;
                            addressFields4 = addressFields6;
                            error = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields;
                            if (error == null) {
                            }
                            countryCode = addressFields4.getCountryCode();
                            if (countryCode != null) {
                            }
                            error2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error.INSTANCE;
                        }
                    } else {
                        str2 = str;
                        error = com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error.INSTANCE;
                        str = str2;
                        com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields7 = addressFields2;
                        addressFields3 = addressFields;
                        addressFields4 = addressFields7;
                        countryCode = addressFields4.getCountryCode();
                        if (countryCode != null) {
                        }
                        error2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                addressFields5 = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields) this.getHighSpeedVideoFpsRanges;
                java.lang.String str4 = (java.lang.String) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                str3 = str4;
                access$getAddressLayoutStatePopulatedWithAddressFields2 = obj;
                com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState3 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields2;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressFields5);
                this.getHighSpeedVideoFpsRangesFor = addressLayoutState3;
                this.getInputSizeshNQ4ISI = 2;
                access$getAddressLayoutStatePopulatedWithAddressFields3 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this, str3, addressFields5, this);
                if (access$getAddressLayoutStatePopulatedWithAddressFields3 != coroutine_suspended) {
                    addressLayoutState = addressLayoutState3;
                    addressLayoutState2 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields3;
                    mutableStateFlow = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this.getInputFormats;
                    do {
                        value2 = mutableStateFlow.getValue();
                        copy2 = r2.copy((r18 & 1) != 0 ? r2.flowType : null, (r18 & 2) != 0 ? r2.presentationMode : null, (r18 & 4) != 0 ? r2.isSubmitting : false, (r18 & 8) != 0 ? r2.countryListState : null, (r18 & 16) != 0 ? r2.userCountryCode : null, (r18 & 32) != 0 ? r2.errors : null, (r18 & 64) != 0 ? r2.shippingAddressLayoutState : addressLayoutState2, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value2).billingAddressLayoutState : addressLayoutState);
                    } while (!mutableStateFlow.compareAndSet(value2, copy2));
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (i == 2) {
                com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState4 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                addressLayoutState = addressLayoutState4;
                access$getAddressLayoutStatePopulatedWithAddressFields3 = obj;
                addressLayoutState2 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields3;
                mutableStateFlow = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this.getInputFormats;
                do {
                    value2 = mutableStateFlow.getValue();
                    copy2 = r2.copy((r18 & 1) != 0 ? r2.flowType : null, (r18 & 2) != 0 ? r2.presentationMode : null, (r18 & 4) != 0 ? r2.isSubmitting : false, (r18 & 8) != 0 ? r2.countryListState : null, (r18 & 16) != 0 ? r2.userCountryCode : null, (r18 & 32) != 0 ? r2.errors : null, (r18 & 64) != 0 ? r2.shippingAddressLayoutState : addressLayoutState2, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value2).billingAddressLayoutState : addressLayoutState);
                } while (!mutableStateFlow.compareAndSet(value2, copy2));
                return kotlin.Unit.INSTANCE;
            }
            if (i == 3) {
                addressFields4 = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields) this.getHighSpeedVideoFpsRangesFor;
                addressFields3 = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields) this.getHighSpeedVideoFpsRanges;
                java.lang.String str5 = (java.lang.String) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                str = str5;
                access$getAddressLayoutStatePopulatedWithAddressFields = obj;
                error = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields;
                if (error == null) {
                    str2 = str;
                    com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields8 = addressFields3;
                    addressFields2 = addressFields4;
                    addressFields = addressFields8;
                    error = com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error.INSTANCE;
                    str = str2;
                    com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields72 = addressFields2;
                    addressFields3 = addressFields;
                    addressFields4 = addressFields72;
                }
                countryCode = addressFields4.getCountryCode();
                if (countryCode != null) {
                    com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this;
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressFields3);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressFields4);
                    this.getHighSpeedVideoSizesFor = error;
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(countryCode);
                    this.getHighSpeedVideoSizes = 0;
                    this.getInputSizeshNQ4ISI = 4;
                    access$getAddressLayoutStatePopulatedWithAddressFields4 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$getAddressLayoutStatePopulatedWithAddressFields(customerFormViewModel2, countryCode, addressFields4, this);
                }
                error2 = com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState.Error.INSTANCE;
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState addressLayoutState5 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                error = addressLayoutState5;
                access$getAddressLayoutStatePopulatedWithAddressFields4 = obj;
                error2 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.AddressLayoutState) access$getAddressLayoutStatePopulatedWithAddressFields4;
            }
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this.getInputFormats;
            do {
                value3 = mutableStateFlow3.getValue();
                copy3 = r5.copy((r18 & 1) != 0 ? r5.flowType : null, (r18 & 2) != 0 ? r5.presentationMode : null, (r18 & 4) != 0 ? r5.isSubmitting : false, (r18 & 8) != 0 ? r5.countryListState : null, (r18 & 16) != 0 ? r5.userCountryCode : null, (r18 & 32) != 0 ? r5.errors : null, (r18 & 64) != 0 ? r5.shippingAddressLayoutState : error2, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState) value3).billingAddressLayoutState : error);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$1$2", f = "CustomerFormViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.access$updateCountriesListState(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
                return ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = customerFormViewModel;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1 anonymousClass1 = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.this.new AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getOutputMinFrameDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = flowType;
        }
    }

    public final kotlinx.coroutines.Job handleEvent$business_customers_prodRelease(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r5.emit(r8, r2) != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0165, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        if (r6.emit(r8, r2) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        if (r1 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$createCustomer$1 customerFormViewModel$createCustomer$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy2;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$createCustomer$1) {
            customerFormViewModel$createCustomer$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$createCustomer$1) continuation;
            if ((customerFormViewModel$createCustomer$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                customerFormViewModel$createCustomer$1.getInputFormats -= 2147483648;
                java.lang.Object obj = customerFormViewModel$createCustomer$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerFormViewModel$createCustomer$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase createCustomerUseCase = this.getHighSpeedVideoFpsRangesFor;
                    customerFormViewModel$createCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    customerFormViewModel$createCustomer$1.getInputFormats = 1;
                    customer2 = customer;
                    obj = createCustomerUseCase.invoke(customer2, customerFormViewModel$createCustomer$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = customerFormViewModel$createCustomer$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = customerFormViewModel$createCustomer$1.getHighSpeedVideoFpsRanges;
                        int i4 = customerFormViewModel$createCustomer$1.getHighSpeedVideoSizes;
                        arrow.core.Either either2 = (arrow.core.Either) customerFormViewModel$createCustomer$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.ServerFailure);
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow = this.getInputFormats;
                            do {
                                value2 = mutableStateFlow.getValue();
                                copy2 = r3.copy((r18 & 1) != 0 ? r3.flowType : null, (r18 & 2) != 0 ? r3.presentationMode : null, (r18 & 4) != 0 ? r3.isSubmitting : false, (r18 & 8) != 0 ? r3.countryListState : null, (r18 & 16) != 0 ? r3.userCountryCode : null, (r18 & 32) != 0 ? r3.errors : listOf, (r18 & 64) != 0 ? r3.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value2.billingAddressLayoutState : null);
                            } while (!mutableStateFlow.compareAndSet(value2, copy2));
                            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("CustomerFormViewModel failed to create customer", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    customer2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) customerFormViewModel$createCustomer$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer3 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow2 = this.getInputFormats;
                    do {
                        value = mutableStateFlow2.getValue();
                        copy = r10.copy((r18 & 1) != 0 ? r10.flowType : null, (r18 & 2) != 0 ? r10.presentationMode : null, (r18 & 4) != 0 ? r10.isSubmitting : false, (r18 & 8) != 0 ? r10.countryListState : null, (r18 & 16) != 0 ? r10.userCountryCode : null, (r18 & 32) != 0 ? r10.errors : null, (r18 & 64) != 0 ? r10.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value.billingAddressLayoutState : null);
                    } while (!mutableStateFlow2.compareAndSet(value, copy));
                    com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode = this.getInputFormats.getValue().getPresentationMode();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(presentationMode, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE)) {
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> mutableSharedFlow = this.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBack.INSTANCE;
                        customerFormViewModel$createCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer2);
                        customerFormViewModel$createCustomer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$createCustomer$1.getOutputMinFrameDuration = either;
                        customerFormViewModel$createCustomer$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer3);
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoSizes = 0;
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoFpsRanges = 0;
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoFpsRangesFor = 0;
                        customerFormViewModel$createCustomer$1.getInputFormats = 2;
                    } else {
                        if (!(presentationMode instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> mutableSharedFlow2 = this.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBackWithResult navigateBackWithResult = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBackWithResult(customer3);
                        customerFormViewModel$createCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer2);
                        customerFormViewModel$createCustomer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$createCustomer$1.getOutputMinFrameDuration = either;
                        customerFormViewModel$createCustomer$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer3);
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoSizes = 0;
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoFpsRanges = 0;
                        customerFormViewModel$createCustomer$1.getHighSpeedVideoFpsRangesFor = 0;
                        customerFormViewModel$createCustomer$1.getInputFormats = 3;
                    }
                    either = either2;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        customerFormViewModel$createCustomer$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$createCustomer$1(this, continuation);
        java.lang.Object obj2 = customerFormViewModel$createCustomer$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerFormViewModel$createCustomer$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r5.emit(r8, r2) != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0165, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        if (r6.emit(r8, r2) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        if (r1 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$updateCustomer$1 customerFormViewModel$updateCustomer$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy2;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$updateCustomer$1) {
            customerFormViewModel$updateCustomer$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$updateCustomer$1) continuation;
            if ((customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = customerFormViewModel$updateCustomer$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase = this.Camera2StreamConfigurationMap;
                    customerFormViewModel$updateCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration = 1;
                    customer2 = customer;
                    obj = updateCustomerUseCase.invoke(customer2, customerFormViewModel$updateCustomer$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = customerFormViewModel$updateCustomer$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = customerFormViewModel$updateCustomer$1.getHighSpeedVideoFpsRanges;
                        int i4 = customerFormViewModel$updateCustomer$1.getHighSpeedVideoFpsRangesFor;
                        arrow.core.Either either2 = (arrow.core.Either) customerFormViewModel$updateCustomer$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.ServerFailure);
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow = this.getInputFormats;
                            do {
                                value2 = mutableStateFlow.getValue();
                                copy2 = r3.copy((r18 & 1) != 0 ? r3.flowType : null, (r18 & 2) != 0 ? r3.presentationMode : null, (r18 & 4) != 0 ? r3.isSubmitting : false, (r18 & 8) != 0 ? r3.countryListState : null, (r18 & 16) != 0 ? r3.userCountryCode : null, (r18 & 32) != 0 ? r3.errors : listOf, (r18 & 64) != 0 ? r3.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value2.billingAddressLayoutState : null);
                            } while (!mutableStateFlow.compareAndSet(value2, copy2));
                            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("CustomerFormViewModel failed to update customer", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    customer2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) customerFormViewModel$updateCustomer$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer3 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow2 = this.getInputFormats;
                    do {
                        value = mutableStateFlow2.getValue();
                        copy = r10.copy((r18 & 1) != 0 ? r10.flowType : null, (r18 & 2) != 0 ? r10.presentationMode : null, (r18 & 4) != 0 ? r10.isSubmitting : false, (r18 & 8) != 0 ? r10.countryListState : null, (r18 & 16) != 0 ? r10.userCountryCode : null, (r18 & 32) != 0 ? r10.errors : null, (r18 & 64) != 0 ? r10.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value.billingAddressLayoutState : null);
                    } while (!mutableStateFlow2.compareAndSet(value, copy));
                    com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode = this.getInputFormats.getValue().getPresentationMode();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(presentationMode, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE)) {
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> mutableSharedFlow = this.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBack.INSTANCE;
                        customerFormViewModel$updateCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer2);
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$updateCustomer$1.getInputFormats = either;
                        customerFormViewModel$updateCustomer$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer3);
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoFpsRangesFor = 0;
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoFpsRanges = 0;
                        customerFormViewModel$updateCustomer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration = 2;
                    } else {
                        if (!(presentationMode instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect> mutableSharedFlow2 = this.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBackWithResult navigateBackWithResult = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiEffect.NavigateBackWithResult(customer3);
                        customerFormViewModel$updateCustomer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer2);
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$updateCustomer$1.getInputFormats = either;
                        customerFormViewModel$updateCustomer$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer3);
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoFpsRangesFor = 0;
                        customerFormViewModel$updateCustomer$1.getHighSpeedVideoFpsRanges = 0;
                        customerFormViewModel$updateCustomer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration = 3;
                    }
                    either = either2;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        customerFormViewModel$updateCustomer$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$updateCustomer$1(this, continuation);
        java.lang.Object obj2 = customerFormViewModel$updateCustomer$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerFormViewModel$updateCustomer$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$submitForm(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, com.paypal.oslo.feature.businesscustomers.ui.model.CustomerFormInputState customerFormInputState, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow = customerFormViewModel.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r5.copy((r18 & 1) != 0 ? r5.flowType : null, (r18 & 2) != 0 ? r5.presentationMode : null, (r18 & 4) != 0 ? r5.isSubmitting : true, (r18 & 8) != 0 ? r5.countryListState : null, (r18 & 16) != 0 ? r5.userCountryCode : null, (r18 & 32) != 0 ? r5.errors : kotlin.collections.CollectionsKt.emptyList(), (r18 & 64) != 0 ? r5.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value.billingAddressLayoutState : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        java.lang.String invoke = customerFormViewModel.getHighSpeedVideoFpsRanges.invoke();
        java.util.List<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> collectErrors = com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.collectErrors(customerFormInputState, invoke);
        if (!collectErrors.isEmpty()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow2 = customerFormViewModel.getInputFormats;
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r4.copy((r18 & 1) != 0 ? r4.flowType : null, (r18 & 2) != 0 ? r4.presentationMode : null, (r18 & 4) != 0 ? r4.isSubmitting : false, (r18 & 8) != 0 ? r4.countryListState : null, (r18 & 16) != 0 ? r4.userCountryCode : null, (r18 & 32) != 0 ? r4.errors : collectErrors, (r18 & 64) != 0 ? r4.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value2.billingAddressLayoutState : null);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType = customerFormViewModel.uiState.getValue().getFlowType();
        if (flowType instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Create) {
            java.lang.Object highSpeedVideoFpsRanges = customerFormViewModel.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerFormStateExtensionsKt.toCustomer(customerFormInputState, invoke), continuation);
            return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
        }
        if (!(flowType instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Object Camera2StreamConfigurationMap = customerFormViewModel.Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.applyFormData(((com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit) flowType).getCustomer(), customerFormInputState, invoke), continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$updateCountriesListState(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState customerFormUiState;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState value3;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow = customerFormViewModel.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            customerFormUiState = value;
            if (!(customerFormUiState.getCountryListState() instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded)) {
                customerFormUiState = customerFormUiState.copy((r18 & 1) != 0 ? customerFormUiState.flowType : null, (r18 & 2) != 0 ? customerFormUiState.presentationMode : null, (r18 & 4) != 0 ? customerFormUiState.isSubmitting : false, (r18 & 8) != 0 ? customerFormUiState.countryListState : com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loading.INSTANCE, (r18 & 16) != 0 ? customerFormUiState.userCountryCode : null, (r18 & 32) != 0 ? customerFormUiState.errors : null, (r18 & 64) != 0 ? customerFormUiState.shippingAddressLayoutState : null, (r18 & 128) != 0 ? customerFormUiState.billingAddressLayoutState : null);
            }
        } while (!mutableStateFlow.compareAndSet(value, customerFormUiState));
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> invoke = customerFormViewModel.getHighResolutionOutputSizeshNQ4ISI.invoke();
        if (invoke instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) invoke).getValue();
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow2 = customerFormViewModel.getInputFormats;
            do {
                value3 = mutableStateFlow2.getValue();
                copy2 = r2.copy((r18 & 1) != 0 ? r2.flowType : null, (r18 & 2) != 0 ? r2.presentationMode : null, (r18 & 4) != 0 ? r2.isSubmitting : false, (r18 & 8) != 0 ? r2.countryListState : new com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded(list), (r18 & 16) != 0 ? r2.userCountryCode : null, (r18 & 32) != 0 ? r2.errors : null, (r18 & 64) != 0 ? r2.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value3.billingAddressLayoutState : null);
            } while (!mutableStateFlow2.compareAndSet(value3, copy2));
        } else if (invoke instanceof arrow.core.Either.Left) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormUiState> mutableStateFlow3 = customerFormViewModel.getInputFormats;
            do {
                value2 = mutableStateFlow3.getValue();
                copy = r0.copy((r18 & 1) != 0 ? r0.flowType : null, (r18 & 2) != 0 ? r0.presentationMode : null, (r18 & 4) != 0 ? r0.isSubmitting : false, (r18 & 8) != 0 ? r0.countryListState : com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Error.INSTANCE, (r18 & 16) != 0 ? r0.userCountryCode : null, (r18 & 32) != 0 ? r0.errors : null, (r18 & 64) != 0 ? r0.shippingAddressLayoutState : null, (r18 & 128) != 0 ? value2.billingAddressLayoutState : null);
            } while (!mutableStateFlow3.compareAndSet(value2, copy));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }
}
