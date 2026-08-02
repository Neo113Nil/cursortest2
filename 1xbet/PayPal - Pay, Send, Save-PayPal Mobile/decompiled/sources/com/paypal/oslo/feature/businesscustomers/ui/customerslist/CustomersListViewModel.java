package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00019B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R \u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010!R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0018\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUseCase;", "getCustomersUseCase", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/SearchCustomersUseCase;", "searchCustomersUseCase", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUpdatesUseCase;", "getEventsFlow", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;Landroidx/lifecycle/SavedStateHandle;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUseCase;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/SearchCustomersUseCase;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUpdatesUseCase;)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_customers_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;)Lkotlinx/coroutines/Job;", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)V", "getInputFormats", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/SearchCustomersUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListScreenUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "getHighSpeedVideoSizesFor", "", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "", "Z", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomersListViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighSpeedVideoFpsRanges;
    private int getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListViewModel;", "create", "(Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel create(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode);
    }

    @dagger.assisted.AssistedInject
    public CustomersListViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase getCustomersUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase searchCustomersUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase getCustomersUpdatesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCustomersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCustomersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCustomersUpdatesUseCase, "");
        this.getHighSpeedVideoFpsRanges = savedStateHandle;
        this.getHighSpeedVideoFpsRangesFor = getCustomersUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = searchCustomersUseCase;
        java.lang.String str = (java.lang.String) savedStateHandle.get("search_query");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(customersPresentationMode, null, false, false, null, null, str == null ? "" : str, 62, null));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.uiEffects = MutableSharedFlow$default;
        java.lang.String str2 = (java.lang.String) savedStateHandle.get("search_query");
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(str2 != null ? str2 : "");
        this.getOutputFormats = MutableStateFlow2;
        this.getInputSizeshNQ4ISI = 1;
        this.getInputFormats = true;
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(customersListViewModel), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass1(null), 3, null);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.debounce(kotlinx.coroutines.flow.FlowKt.drop(MutableStateFlow2, 1), 500L), new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass2(null)), androidx.view.ViewModelKt.getViewModelScope(customersListViewModel));
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(getCustomersUpdatesUseCase.invoke(), new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass3(null)), androidx.view.ViewModelKt.getViewModelScope(customersListViewModel));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$1", f = "CustomersListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this;
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$reloadCustomers(customersListViewModel, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$getInitialSearchQuery(customersListViewModel));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "query", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$2", f = "CustomersListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$reloadCustomers(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this, str);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass2) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass2 anonymousClass2 = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass2;
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$3", f = "CustomersListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object value;
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState;
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState listUiState;
            java.util.ArrayList arrayList;
            java.lang.Object value2;
            com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate customersUpdate = (com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (customersUpdate instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this.getHighSpeedVideoSizes;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value2, null, null, false, false, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification.CustomerCreatedNotification.INSTANCE, null, null, 111, null)));
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this;
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$reloadCustomers(customersListViewModel, (java.lang.String) customersListViewModel.getOutputFormats.getValue());
            } else if (customersUpdate instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited) {
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel2 = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this;
                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.access$reloadCustomers(customersListViewModel2, (java.lang.String) customersListViewModel2.getOutputFormats.getValue());
            } else if (customersUpdate instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this.getHighSpeedVideoSizes;
                do {
                    value = mutableStateFlow2.getValue();
                    customerListScreenUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) value;
                    listUiState = customerListScreenUiState.getListUiState();
                    java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> customers = customerListScreenUiState.getListUiState().getCustomers();
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : customers) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj2).getId(), ((com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved) customersUpdate).getCustomer().getId())) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default(customerListScreenUiState, null, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.copy$default(listUiState, arrayList, false, false, 6, null), false, false, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification.CustomerRemovedNotification.INSTANCE, null, null, 109, null)));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate customersUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass3) create(customersUpdate, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass3 anonymousClass3 = com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass3;
        }

        AnonymousClass3(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.AnonymousClass3> continuation) {
            super(2, continuation);
        }
    }

    public final kotlinx.coroutines.Job handleEvent$business_customers_prodRelease(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel$loadCustomersPage$1(p0, this, null), 3, null);
        this.getOutputMinFrameDuration = launch$default;
    }

    public static final /* synthetic */ java.lang.String access$computeEmailRecipient(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, boolean z) {
        java.lang.String value = customersListViewModel.getOutputFormats.getValue();
        if ((customersListViewModel.getHighSpeedVideoSizes.getValue().getPresentationMode() instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select) && com.paypal.oslo.feature.businesscustomers.ui.utils.EmailUtilsKt.isValidEmail(value) && z) {
            return value;
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String access$getInitialSearchQuery(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel) {
        java.lang.String str = (java.lang.String) customersListViewModel.getHighSpeedVideoFpsRanges.get("search_query");
        return str == null ? "" : str;
    }

    public static final /* synthetic */ void access$loadMore(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel) {
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState value;
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState;
        if (customersListViewModel.getHighSpeedVideoSizes.getValue().getListUiState().isLoading() || !customersListViewModel.getInputFormats) {
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState> mutableStateFlow = customersListViewModel.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            customerListScreenUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default(customerListScreenUiState, null, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.copy$default(customerListScreenUiState.getListUiState(), null, true, false, 5, null), false, false, null, null, null, 117, null)));
        customersListViewModel.getHighSpeedVideoFpsRangesFor(customersListViewModel.getOutputFormats.getValue());
    }

    public static final /* synthetic */ java.lang.Object access$onCustomerSelected(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode = customersListViewModel.uiState.getValue().getPresentationMode();
        if (presentationMode instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select) {
            java.lang.Object emit = customersListViewModel.Camera2StreamConfigurationMap.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult(customer), continuation);
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(presentationMode, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Object emit2 = customersListViewModel.Camera2StreamConfigurationMap.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile(customer), continuation);
        return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$reloadCustomers(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, java.lang.String str) {
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState value;
        customersListViewModel.getInputSizeshNQ4ISI = 1;
        customersListViewModel.getInputFormats = true;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState> mutableStateFlow = customersListViewModel.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.copy$default(value, null, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.INSTANCE.getLoading(), true, false, null, null, null, 81, null)));
        customersListViewModel.getHighSpeedVideoFpsRangesFor(str);
    }
}
