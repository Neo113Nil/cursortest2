package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetCustomStatementOptionsUseCase;", "getCustomStatementOptionsUseCase", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementReducer;", "reducer", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;", "getUserInfoUseCase", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestStatementUseCase;", "requestStatementUseCase", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetCustomStatementOptionsUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementReducer;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestStatementUseCase;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestStatementUseCase;", "getHighSpeedVideoSizes", "Lkotlin/Function1;", "", "", "isSelectableDatePredicate", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "userEmail", "getUserEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> isSelectableDatePredicate;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState> uiState;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> userEmail;

    @javax.inject.Inject
    public CustomStatementViewModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase getCustomStatementOptionsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementReducer customStatementReducer, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfoUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase requestStatementUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCustomStatementOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserInfoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestStatementUseCase, "");
        this.getHighSpeedVideoSizes = requestStatementUseCase;
        this.isSelectableDatePredicate = com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.createSelectableDatePredicate();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain invoke = getCustomStatementOptionsUseCase.invoke();
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> transactionTypes = invoke.getTransactionTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(transactionTypes, 10));
        java.util.Iterator<T> it = transactionTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption) it.next()).getLabel().getId()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> dateFilters = invoke.getDateFilters();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(dateFilters, 10));
        java.util.Iterator<T> it2 = dateFilters.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption) it2.next()).getLabel().getId()));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> formats = invoke.getFormats();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(formats, 10));
        java.util.Iterator<T> it3 = formats.iterator();
        while (it3.hasNext()) {
            arrayList5.add(java.lang.Integer.valueOf(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption) it3.next()).getLabel().getId()));
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("CustomStatementViewModel.store", new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content(arrayList2, arrayList4, arrayList5, 0, 0, null, null, 0, null, 504, null), customStatementReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(customStatementViewModel));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo> invoke2 = getUserInfoUseCase.invoke();
        this.userEmail = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                java.lang.String email = ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo) obj).getEmail();
                                if (email == null) {
                                    email = "";
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(email, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1$2", f = "CustomStatementViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, androidx.view.ViewModelKt.getViewModelScope(customStatementViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), "");
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> isSelectableDatePredicate() {
        return this.isSelectableDatePredicate;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getUserEmail() {
        return this.userEmail;
    }

    public final void processEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent event) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick)) {
            this.getHighSpeedVideoFpsRanges.onEvent(event);
            return;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState value = this.uiState.getValue();
        if (value instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content) {
            formData = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content) value;
        } else if (!(value instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError)) {
            return;
        } else {
            formData = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError) value).getFormData();
        }
        this.getHighSpeedVideoFpsRanges.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$handleRequestStatement$1(this, formData, null), 3, null);
    }
}
