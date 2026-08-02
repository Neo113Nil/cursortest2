package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"J$\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u00020$*\u00020'2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u0010.\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00108R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000205098\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b>\u0010=R \u0010?\u001a\b\u0012\u0004\u0012\u00020\b098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b?\u0010=R \u0010@\u001a\b\u0012\u0004\u0012\u00020\b098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\b@\u0010=R \u0010A\u001a\b\u0012\u0004\u0012\u00020\b098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bA\u0010=R \u0010B\u001a\b\u0012\u0004\u0012\u00020\b098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bB\u0010=R\u0018\u00101\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010CR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010ER\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010="}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getPaymentTransferAttemptUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdatePaymentTransferTypeUseCase;", "updatePaymentTransferTypeUseCase", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdatePaymentTransferTypeUseCase;)V", "", "isAwaiting", "", "setAwaitingConfirmation", "(Z)V", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "paymentLink", "updateResolvedPaymentLink", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;)V", "setLoading", "()V", "", "selectedTypeId", "updateSelectedType", "(Ljava/lang/String;)V", "onExpanded", "onCollapsed", "", "supportedTransferTypesCount", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "transferSelectionRequirement", "onSupportedTransferTypesLoaded", "(ILcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, "shouldCollapse", "onTypeSelected", "(Ljava/lang/String;Z)V", "shippingAddressId", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "selectPaymentTypeAndUpdateBackend", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;)Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "getSelectedPaymentType", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdatePaymentTransferTypeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentTypeAccordionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getSelectedTypeId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "isEnabled", "isAwaitingTransferTypeConfirmation", "isLoading", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "resolvedPaymentLink", "getResolvedPaymentLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeAccordionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.PaymentLink> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isAwaitingTransferTypeConfirmation;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isEnabled;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isExpanded;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.domain.model.PaymentLink> resolvedPaymentLink;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedTypeId;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState> uiState;

    @javax.inject.Inject
    public PaymentTypeAccordionViewModel(com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase updatePaymentTransferTypeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferTypeUseCase, "");
        this.getHighSpeedVideoFpsRanges = getPaymentTransferAttemptUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = updatePaymentTransferTypeUseCase;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore("PaymentTypeAccordionViewModel.store", new com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState(null, null, false, false, false, false, null, 127, null), com.paypal.oslo.feature.p2p.ui.review.reducers.PaymentTypeAccordionReducer.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel));
        this.getHighSpeedVideoSizes = mviStateStore;
        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState> uiState = mviStateStore.getUiState();
        this.uiState = uiState;
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState> stateFlow = uiState;
        this.selectedTypeId = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                java.lang.String selectedTypeId = ((com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState) obj).getSelectedTypeId();
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(selectedTypeId, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1$2", f = "PaymentTypeAccordionViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), uiState.getValue().getSelectedTypeId());
        this.isExpanded = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState) obj).isExpanded());
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2$2", f = "PaymentTypeAccordionViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoSizes = flowCollector;
                }
            }
        }, androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.valueOf(uiState.getValue().isExpanded()));
        this.isEnabled = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState) obj).isEnabled());
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3$2", f = "PaymentTypeAccordionViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$3.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                }
            }
        }, androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.valueOf(uiState.getValue().isEnabled()));
        this.isAwaitingTransferTypeConfirmation = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState) obj).isAwaitingTransferTypeConfirmation());
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4$2", f = "PaymentTypeAccordionViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getOutputFormats;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$4.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }
        }, androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.valueOf(uiState.getValue().isAwaitingTransferTypeConfirmation()));
        this.isLoading = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState) obj).isLoading());
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5$2", f = "PaymentTypeAccordionViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getOutputFormats;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$special$$inlined$map$5.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }
        }, androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.valueOf(uiState.getValue().isLoading()));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.PaymentLink> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.resolvedPaymentLink = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(paymentTypeAccordionViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.AnonymousClass1(null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedTypeId() {
        return this.selectedTypeId;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isExpanded() {
        return this.isExpanded;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isAwaitingTransferTypeConfirmation() {
        return this.isAwaitingTransferTypeConfirmation;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return this.isLoading;
    }

    public final void setAwaitingConfirmation(boolean isAwaiting) {
        this.getHighSpeedVideoSizes.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged(isAwaiting));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.domain.model.PaymentLink> getResolvedPaymentLink() {
        return this.resolvedPaymentLink;
    }

    public final void updateResolvedPaymentLink(com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink) {
        this.Camera2StreamConfigurationMap.setValue(paymentLink);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$1", f = "PaymentTypeAccordionViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m = "invokeSuspend", n = {}, nl = {203}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> invoke = com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.this.getHighSpeedVideoFpsRanges.invoke();
                final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.this;
                this.getHighSpeedVideoFpsRanges = 1;
                if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) obj2;
                        if (paymentTransferAttempt != null) {
                            com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.this.getHighSpeedVideoFpsRangesFor = paymentTransferAttempt.getId();
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
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void setLoading() {
        this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SetLoading.INSTANCE);
    }

    public final void updateSelectedType(java.lang.String selectedTypeId) {
        this.getHighSpeedVideoSizes.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer(selectedTypeId));
    }

    public final void onExpanded() {
        this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Expanded.INSTANCE);
    }

    public final void onCollapsed() {
        this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Collapsed.INSTANCE);
    }

    public final void onSupportedTransferTypesLoaded(int supportedTransferTypesCount, com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement) {
        this.getHighSpeedVideoSizes.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded(supportedTransferTypesCount, transferSelectionRequirement));
    }

    public static /* synthetic */ void onTypeSelected$default(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        paymentTypeAccordionViewModel.onTypeSelected(str, z);
    }

    public final void onTypeSelected(java.lang.String paymentTypeId, boolean shouldCollapse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeId, "");
        this.getHighSpeedVideoSizes.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected(paymentTypeId, shouldCollapse));
    }

    public static /* synthetic */ java.lang.Object selectPaymentTypeAndUpdateBackend$default(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return paymentTypeAccordionViewModel.selectPaymentTypeAndUpdateBackend(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce A[Catch: all -> 0x0208, CancellationException -> 0x025f, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:12:0x0049, B:15:0x00ca, B:17:0x00ce, B:19:0x00d6, B:21:0x00dc, B:22:0x00e1, B:24:0x00e5, B:27:0x0118, B:29:0x0132, B:34:0x01f1, B:37:0x01fe, B:39:0x0138, B:41:0x013e, B:43:0x0142, B:46:0x017c, B:47:0x0181, B:49:0x0185, B:52:0x01bf, B:55:0x01dc, B:57:0x01e3, B:58:0x01e8, B:59:0x01e9, B:81:0x00ac), top: B:7:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f1 A[Catch: all -> 0x0208, CancellationException -> 0x025f, TRY_ENTER, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:12:0x0049, B:15:0x00ca, B:17:0x00ce, B:19:0x00d6, B:21:0x00dc, B:22:0x00e1, B:24:0x00e5, B:27:0x0118, B:29:0x0132, B:34:0x01f1, B:37:0x01fe, B:39:0x0138, B:41:0x013e, B:43:0x0142, B:46:0x017c, B:47:0x0181, B:49:0x0185, B:52:0x01bf, B:55:0x01dc, B:57:0x01e3, B:58:0x01e8, B:59:0x01e9, B:81:0x00ac), top: B:7:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fe A[Catch: all -> 0x0208, CancellationException -> 0x025f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:12:0x0049, B:15:0x00ca, B:17:0x00ce, B:19:0x00d6, B:21:0x00dc, B:22:0x00e1, B:24:0x00e5, B:27:0x0118, B:29:0x0132, B:34:0x01f1, B:37:0x01fe, B:39:0x0138, B:41:0x013e, B:43:0x0142, B:46:0x017c, B:47:0x0181, B:49:0x0185, B:52:0x01bf, B:55:0x01dc, B:57:0x01e3, B:58:0x01e8, B:59:0x01e9, B:81:0x00ac), top: B:7:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object selectPaymentTypeAndUpdateBackend(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult> continuation) {
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1 paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1;
        int i;
        com.paypal.oslo.feature.p2p.domain.model.PaymentType p2pType;
        java.lang.Throwable th;
        java.lang.String str3;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed failed;
        com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink;
        java.lang.String str4 = str;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1) {
                    paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1) continuation;
                    if ((paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                        paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoFpsRanges -= 2147483648;
                        java.lang.Object obj = paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoSizesFor;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoFpsRanges;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            java.lang.String str5 = this.getHighSpeedVideoFpsRangesFor;
                            if (str5 == null) {
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_FAILED_NO_ATTEMPT_ID, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4)), null, null, 12, null);
                                return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                            }
                            p2pType = com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.INSTANCE.toP2pType(str4);
                            if (p2pType == null) {
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_FAILED_INVALID_TYPE_ID, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str5), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4)), null, null, 12, null);
                                return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                            }
                            try {
                                kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult>> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(str5, p2pType, str2);
                                paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.Camera2StreamConfigurationMap = str4;
                                paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighResolutionOutputSizeshNQ4ISI = str5;
                                paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoSizes = p2pType;
                                paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoFpsRanges = 1;
                                obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(invoke, paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str3 = str5;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                str3 = str5;
                                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                                pairArr[0] = kotlin.TuplesKt.to("attemptId", str3);
                                pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4);
                                pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, p2pType.name());
                                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                                pairArr[3] = kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "Unknown");
                                com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(pairArr), null, th, 4, null);
                                this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted.INSTANCE);
                                return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType = (com.paypal.oslo.feature.p2p.domain.model.PaymentType) paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoSizes;
                            str3 = (java.lang.String) paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String str6 = (java.lang.String) paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.Camera2StreamConfigurationMap;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                p2pType = paymentType;
                                str4 = str6;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                p2pType = paymentType;
                                str4 = str6;
                                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                                kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
                                pairArr2[0] = kotlin.TuplesKt.to("attemptId", str3);
                                pairArr2[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4);
                                pairArr2[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, p2pType.name());
                                java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                                pairArr2[3] = kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "Unknown");
                                com.paypal.android.logger.Logger.e$default(logger2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(pairArr2), null, th, 4, null);
                                this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted.INSTANCE);
                                return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                            }
                        }
                        ior = (arrow.core.Ior) obj;
                        if (ior != null) {
                            com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult = (com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult) ior.getOrNull();
                            if (updateTransferTypeResult != null && (paymentLink = updateTransferTypeResult.getPaymentLink()) != null) {
                                this.Camera2StreamConfigurationMap.setValue(paymentLink);
                            }
                            if (ior instanceof arrow.core.Ior.Left) {
                                com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue();
                                com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                                kotlin.Pair[] pairArr3 = new kotlin.Pair[4];
                                pairArr3[0] = kotlin.TuplesKt.to("attemptId", str3);
                                pairArr3[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4);
                                pairArr3[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, p2pType.name());
                                java.lang.String simpleName3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName();
                                if (simpleName3 == null) {
                                    simpleName3 = "Unknown";
                                }
                                pairArr3[3] = kotlin.TuplesKt.to("errorType", simpleName3);
                                com.paypal.android.logger.Logger.w$default(logger3, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                                failed = transferError instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.HighRiskScamDecline ? com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.HighRiskScamDeclined.INSTANCE : com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                            } else if (ior instanceof arrow.core.Ior.Right) {
                                com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult2 = (com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult) ((arrow.core.Ior.Right) ior).getValue();
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, p2pType.name())), null, 4, null);
                                com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType2 = updateTransferTypeResult2.getPaymentType();
                                if (paymentType2 == null) {
                                    paymentType2 = p2pType;
                                }
                                failed = Camera2StreamConfigurationMap(updateTransferTypeResult2, paymentType2);
                            } else if (ior instanceof arrow.core.Ior.Both) {
                                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                                java.lang.Object leftValue = both.getLeftValue();
                                com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult3 = (com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult) both.getRightValue();
                                com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                                kotlin.Pair[] pairArr4 = new kotlin.Pair[4];
                                pairArr4[0] = kotlin.TuplesKt.to("attemptId", str3);
                                pairArr4[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4);
                                pairArr4[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, p2pType.name());
                                java.lang.String simpleName4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.p2p.domain.error.TransferError) leftValue).getClass()).getSimpleName();
                                if (simpleName4 == null) {
                                    simpleName4 = "Unknown";
                                }
                                pairArr4[3] = kotlin.TuplesKt.to("errorType", simpleName4);
                                com.paypal.android.logger.Logger.w$default(logger4, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_PARTIAL_SUCCESS, kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
                                com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType3 = updateTransferTypeResult3.getPaymentType();
                                if (paymentType3 == null) {
                                    paymentType3 = p2pType;
                                }
                                failed = Camera2StreamConfigurationMap(updateTransferTypeResult3, paymentType3);
                            } else {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (failed == null) {
                            }
                            if (!(failed instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed)) {
                                this.getHighSpeedVideoSizes.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer(str4));
                                return failed;
                            }
                            this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted.INSTANCE);
                            return failed;
                        }
                        failed = com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                        if (!(failed instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed)) {
                        }
                    }
                }
                ior = (arrow.core.Ior) obj;
                if (ior != null) {
                }
                failed = com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
                if (!(failed instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed)) {
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.p2p.LoggerKt.log;
                kotlin.Pair[] pairArr22 = new kotlin.Pair[4];
                pairArr22[0] = kotlin.TuplesKt.to("attemptId", str3);
                pairArr22[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE_ID, str4);
                pairArr22[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, p2pType.name());
                java.lang.String simpleName22 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                pairArr22[3] = kotlin.TuplesKt.to("errorType", simpleName22 != null ? simpleName22 : "Unknown");
                com.paypal.android.logger.Logger.e$default(logger22, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_TYPE_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(pairArr22), null, th, 4, null);
                this.getHighSpeedVideoSizes.onEvent(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted.INSTANCE);
                return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
            }
            if (i != 0) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        }
        paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1(this, continuation);
        java.lang.Object obj2 = paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentTypeAccordionViewModel$selectPaymentTypeAndUpdateBackend$1.getHighSpeedVideoFpsRanges;
    }

    private static com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult Camera2StreamConfigurationMap(com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult, com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType) {
        com.paypal.oslo.feature.p2p.domain.model.Contingency contingency;
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> contingencies;
        java.lang.Object obj;
        if (updateTransferTypeResult.getFundingOptions() == null && !com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResultKt.isInstrumentAdditionMandatory(updateTransferTypeResult)) {
            return com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed.INSTANCE;
        }
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = updateTransferTypeResult.getFundingOptions();
        if (fundingOptions == null || (contingencies = fundingOptions.getContingencies()) == null) {
            contingency = null;
        } else {
            java.util.Iterator<T> it = contingencies.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.paypal.oslo.feature.p2p.domain.model.Contingency contingency2 = (com.paypal.oslo.feature.p2p.domain.model.Contingency) obj;
                if (contingency2.getAction() == com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.DISPLAY_SCAM_WARNING && contingency2.getStatus() == com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED) {
                    break;
                }
            }
            contingency = (com.paypal.oslo.feature.p2p.domain.model.Contingency) obj;
        }
        if (contingency != null) {
            com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails details = contingency.getDetails();
            com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning scamWarning = details instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning ? (com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning) details : null;
            if (scamWarning == null || (scamRiskLevel = scamWarning.getRiskLevel()) == null) {
                scamRiskLevel = com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.UNKNOWN;
            }
            return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.INSTANCE.resolve(paymentType, scamRiskLevel), updateTransferTypeResult);
        }
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success(updateTransferTypeResult);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentType getSelectedPaymentType() {
        java.lang.String value = this.selectedTypeId.getValue();
        if (value != null) {
            return com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.INSTANCE.toP2pType(value);
        }
        return null;
    }
}
