package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 F2\u00020\u0001:\u0002GFBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u001d\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0015\u0010+\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\b\u0012\u0004\u0012\u00020-028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020.078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010B\u001a\u0004\u0018\u00010A8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentSummaryUseCase;", "getPaymentSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "cancelRepaymentUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;", "paymentSummaryUiModelMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "dataInvalidationEventBus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentSummaryNavigationArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryObservabilityMiddleware$Factory;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentSummaryNavigationArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "getPaymentSummaryOverviewFromNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentSummaryUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentSummaryNavigationArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentSummaryNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummarySideEffectMiddleware;", "getInputSizeshNQ4ISI", "Lkotlin/Lazy;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryUiEffect;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "customerServiceContact", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "getCustomerServiceContact", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String MVI_STATE_STORE_NAME = "PaymentSummaryViewModel.store";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect> getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getInputFormats;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs navArgs;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState> uiState;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentSummaryNavigationArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentSummaryNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public PaymentSummaryViewModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase getPaymentSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper paymentSummaryUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryReducer paymentSummaryReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory factory, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs paymentSummaryNavigationArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelRepaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryUiModelMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInvalidationEventBus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryNavigationArgs, "");
        this.Camera2StreamConfigurationMap = getPaymentSummaryUseCase;
        this.getHighSpeedVideoSizes = cancelRepaymentUseCase;
        this.getHighSpeedVideoFpsRangesFor = paymentSummaryUiModelMapper;
        this.getHighSpeedVideoFpsRanges = dataInvalidationEventBus;
        this.navArgs = paymentSummaryNavigationArgs;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware create = factory.create(paymentSummaryNavigationArgs.getCreditProductIdentifier());
        this.getHighResolutionOutputSizeshNQ4ISI = create;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.$r8$lambda$C19NNVPpZJJ_AK9ZESoAvcECLpY(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.this);
            }
        });
        this.getInputFormats = lazy;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(MVI_STATE_STORE_NAME, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Initial.INSTANCE, paymentSummaryReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware) lazy.getValue(), create}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.creditProductIdentifier = paymentSummaryNavigationArgs.getCreditProductIdentifier();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview = paymentSummaryNavigationArgs.getPaymentSummaryOverview();
        this.customerServiceContact = paymentSummaryOverview != null ? paymentSummaryOverview.getCustomerServiceContact() : null;
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated(getPaymentSummaryOverviewFromNavArgs(), paymentSummaryNavigationArgs.getCreditAccountId()));
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs getNavArgs() {
        return this.navArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact getCustomerServiceContact() {
        return this.customerServiceContact;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview getPaymentSummaryOverviewFromNavArgs() {
        if (this.navArgs.hasCompletePaymentSummaryData()) {
            return this.navArgs.getPaymentSummaryOverview();
        }
        return null;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration.onEvent(event);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryViewModel$Companion;", "", "<init>", "()V", "", "MVI_STATE_STORE_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware $r8$lambda$C19NNVPpZJJ_AK9ZESoAvcECLpY(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel paymentSummaryViewModel) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware(paymentSummaryViewModel.navArgs.getCreditProductIdentifier(), paymentSummaryViewModel.Camera2StreamConfigurationMap, paymentSummaryViewModel.getHighSpeedVideoSizes, paymentSummaryViewModel.getHighSpeedVideoFpsRangesFor, paymentSummaryViewModel.getHighSpeedVideoFpsRanges);
    }
}
