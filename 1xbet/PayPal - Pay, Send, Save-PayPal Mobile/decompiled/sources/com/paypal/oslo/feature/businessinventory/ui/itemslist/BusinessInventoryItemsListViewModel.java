package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;", "getBusinessInventoryItemsListUseCase", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetBusinessInventoryUpdatesUseCase;", "businessInventoryUpdatesUseCase", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;", "refreshBusinessInventoryItemsUseCase", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetBusinessInventoryUpdatesUseCase;Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;)V", "", "refresh$business_inventory_prodRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_inventory_prodRelease", "(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryItemsListViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState> uiState;

    @javax.inject.Inject
    public BusinessInventoryItemsListViewModel(com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase getBusinessInventoryItemsListUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase getBusinessInventoryUpdatesUseCase, com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase refreshBusinessInventoryItemsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessInventoryItemsListUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessInventoryUpdatesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshBusinessInventoryItemsUseCase, "");
        this.getHighSpeedVideoSizes = getBusinessInventoryItemsListUseCase;
        this.getHighSpeedVideoFpsRangesFor = refreshBusinessInventoryItemsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.INSTANCE.getDefault());
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel = this;
        this.uiState = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.onStart(MutableStateFlow, new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$uiState$1(this, null)), androidx.view.ViewModelKt.getViewModelScope(businessInventoryItemsListViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.INSTANCE.getDefault());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(businessInventoryItemsListViewModel), null, null, new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass1(null), 3, null);
        final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.api.domain.model.InventoryUpdate> invoke = getBusinessInventoryUpdatesUseCase.invoke();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                if (obj instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                    anonymousClass1.getOutputFormats = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1$2", f = "BusinessInventoryItemsListViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getOutputFormats;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getOutputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
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
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$special$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2(null)), androidx.view.ViewModelKt.getViewModelScope(businessInventoryItemsListViewModel));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState> getUiState() {
        return this.uiState;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$1", f = "BusinessInventoryItemsListViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {75}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> invoke = com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this.getHighSpeedVideoSizes.invoke();
                final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel = com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object value;
                        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState;
                        com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState;
                        java.util.ArrayList arrayList;
                        java.util.List list = (java.util.List) obj2;
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this.getHighSpeedVideoFpsRanges;
                        do {
                            value = mutableStateFlow.getValue();
                            businessInventoryItemsListState = (com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) value;
                            java.util.List list2 = list;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (T t : list2) {
                                if (((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) t).getType() == com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT) {
                                    arrayList2.add(t);
                                }
                            }
                            itemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(arrayList2, businessInventoryItemsListState.getProducts().getLoading());
                            arrayList = new java.util.ArrayList();
                            for (T t2 : list2) {
                                if (((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) t2).getType() == com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE) {
                                    arrayList.add(t2);
                                }
                            }
                        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default(businessInventoryItemsListState, null, null, itemsListState, new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(arrayList, businessInventoryItemsListState.getServices().getLoading()), null, null, 35, null)));
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
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$2", f = "BusinessInventoryItemsListViewModel.kt", i = {0, 1}, l = {80, 93}, m = "invokeSuspend", n = {"event", "event"}, nl = {81, 78}, s = {"L$0", "L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        
            if (r11.getHighSpeedVideoFpsRanges.refresh$business_inventory_prodRelease(r11) != r1) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        
            if (r11.getHighSpeedVideoFpsRanges.refresh$business_inventory_prodRelease(r11) == r1) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object value;
            com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate itemInventoryUpdate = (com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (itemInventoryUpdate instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted) {
                    this.getHighSpeedVideoFpsRangesFor = itemInventoryUpdate;
                    this.Camera2StreamConfigurationMap = 1;
                } else {
                    if (!(itemInventoryUpdate instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(itemInventoryUpdate);
                    this.Camera2StreamConfigurationMap = 2;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this.getHighSpeedVideoFpsRanges;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) value, null, null, null, null, null, ((com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted) itemInventoryUpdate).getItem(), 31, null)));
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this), null, null, new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2.C01172(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this, null), 3, null);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$2$2", f = "BusinessInventoryItemsListViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, nl = {86}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01172 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighSpeedVideoFpsRanges;
            final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object value;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) value, null, null, null, null, null, null, 31, null)));
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2.C01172) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2.C01172(this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01172(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2.C01172> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = businessInventoryItemsListViewModel;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate itemInventoryUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2) create(itemInventoryUpdate, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2 anonymousClass2 = com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass2;
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refresh$business_inventory_prodRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$refresh$1 businessInventoryItemsListViewModel$refresh$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState value;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState value2;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$refresh$1) {
            businessInventoryItemsListViewModel$refresh$1 = (com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$refresh$1) continuation;
            if ((businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase refreshBusinessInventoryItemsUseCase = this.getHighSpeedVideoFpsRangesFor;
                    businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoFpsRanges = 1;
                    obj = refreshBusinessInventoryItemsUseCase.invoke(businessInventoryItemsListViewModel$refresh$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isLeft()) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
                    do {
                        value2 = mutableStateFlow.getValue();
                        businessInventoryItemsListState2 = value2;
                    } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default(businessInventoryItemsListState2, null, null, com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.copy$default(businessInventoryItemsListState2.getProducts(), null, false, 1, null), com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.copy$default(businessInventoryItemsListState2.getServices(), null, false, 1, null), com.paypal.oslo.feature.businessinventory.ui.itemslist.Error.LOAD_ITEMS_FAILED, null, 35, null)));
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("BusinessInventoryItemsListViewModel failed to refresh", exc);
                }
                if (either.isRight()) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState> mutableStateFlow2 = this.getHighSpeedVideoFpsRanges;
                    do {
                        value = mutableStateFlow2.getValue();
                        businessInventoryItemsListState = value;
                    } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default(businessInventoryItemsListState, null, null, com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.copy$default(businessInventoryItemsListState.getProducts(), null, false, 1, null), com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.copy$default(businessInventoryItemsListState.getServices(), null, false, 1, null), null, null, 51, null)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        businessInventoryItemsListViewModel$refresh$1 = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$refresh$1(this, continuation);
        java.lang.Object obj2 = businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryItemsListViewModel$refresh$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        if (either.isRight()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.Job handleEvent$business_inventory_prodRelease(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }
}
