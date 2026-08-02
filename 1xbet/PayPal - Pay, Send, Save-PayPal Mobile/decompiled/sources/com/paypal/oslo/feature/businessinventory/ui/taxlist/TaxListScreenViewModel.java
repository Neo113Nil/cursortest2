package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00014B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010.R \u00101\u001a\b\u0012\u0004\u0012\u0002000&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u00103"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/TaxListScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetBusinessInventoryUpdatesUseCase;", "getEventsFlow", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryTaxesUseCase;", "getTaxes", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SyncTaxOptionsUseCase;", "syncTaxOptions", "Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryAnalytics;", "analytics", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetBusinessInventoryUpdatesUseCase;Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryTaxesUseCase;Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SyncTaxOptionsUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryAnalytics;)V", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "()V", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/TaxEffect;", "taxEffect", "Lkotlinx/coroutines/Job;", "publishEvent", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/TaxEffect;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SyncTaxOptionsUseCase;", "Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryAnalytics;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/StateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputFormats", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiState;", "state", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxListScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState> state;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/TaxListScreenViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/TaxListScreenViewModel;", "create", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;)Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/TaxListScreenViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel create(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode);
    }

    @dagger.assisted.AssistedInject
    public TaxListScreenViewModel(com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase getBusinessInventoryUpdatesUseCase, com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase getBusinessInventoryTaxesUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase syncTaxOptionsUseCase, com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics itemLibraryAnalytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessInventoryUpdatesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessInventoryTaxesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxesPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncTaxOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemLibraryAnalytics, "");
        this.getHighSpeedVideoFpsRangesFor = taxesPresentationMode;
        this.getHighSpeedVideoFpsRanges = syncTaxOptionsUseCase;
        this.Camera2StreamConfigurationMap = itemLibraryAnalytics;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel = this;
        kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> stateIn = kotlinx.coroutines.flow.FlowKt.stateIn(getBusinessInventoryTaxesUseCase.invoke(), androidx.view.ViewModelKt.getViewModelScope(taxListScreenViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), kotlin.collections.CollectionsKt.emptyList());
        this.getHighResolutionOutputSizeshNQ4ISI = stateIn;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputFormats = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoSizesFor = MutableStateFlow2;
        this.state = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.combine(stateIn, MutableStateFlow2, MutableStateFlow, new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$state$1(this, null)), new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$state$2(this, null)), androidx.view.ViewModelKt.getViewModelScope(taxListScreenViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState(taxesPresentationMode, kotlin.collections.CollectionsKt.emptyList(), false, true));
        final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.api.domain.model.InventoryUpdate> invoke = getBusinessInventoryUpdatesUseCase.invoke();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                if (obj instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate) {
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                    anonymousClass1.getInputSizeshNQ4ISI = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1$2", f = "TaxListScreenViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.AnonymousClass1(null)), androidx.view.ViewModelKt.getViewModelScope(taxListScreenViewModel));
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect> getEffects() {
        return this.effects;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState> getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$1", f = "TaxListScreenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.this.refresh();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate taxInventoryUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.AnonymousClass1) create(taxInventoryUpdate, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void refresh() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$refresh$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.Job publishEvent(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect taxEffect) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxEffect, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$publishEvent$1(taxEffect, this, null), 3, null);
        return launch$default;
    }
}
