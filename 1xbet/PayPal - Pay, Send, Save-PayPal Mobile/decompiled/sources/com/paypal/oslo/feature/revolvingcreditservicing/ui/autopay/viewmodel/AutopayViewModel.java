package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00014B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0015\u0010\u0015\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010$R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020'0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020'0/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAutopayOverviewUseCase;", "getAutopayOverviewUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/UpdateAutopayUseCase;", "updateAutopayUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;", "mapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AutopayNavigationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAutopayOverviewUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/UpdateAutopayUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewObservabilityMiddleware$Factory;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AutopayNavigationArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAutopayOverviewUseCase;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/UpdateAutopayUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AutopayNavigationArgs;", "getArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AutopayNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewObservabilityMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopaySideEffectMiddleware;", "Lkotlin/Lazy;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs args;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect> getInputFormats;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AutopayNavigationArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AutopayNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs args);
    }

    @dagger.assisted.AssistedInject
    public AutopayViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer autopayReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase getAutopayOverviewUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase updateAutopayUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper autopayOverviewToAutopayMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware.Factory factory, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs autopayNavigationArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutopayOverviewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutopayUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayOverviewToAutopayMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayNavigationArgs, "");
        this.getHighSpeedVideoFpsRanges = getAutopayOverviewUseCase;
        this.getHighSpeedVideoFpsRangesFor = updateAutopayUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = autopayOverviewToAutopayMapper;
        this.args = autopayNavigationArgs;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewObservabilityMiddleware create = factory.create(autopayNavigationArgs.getCreditProductIdentifier());
        this.getHighSpeedVideoSizes = create;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel.$r8$lambda$V5DJ1krzzNOvIgAKV9dDlo0R9ms(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel.this);
            }
        });
        this.Camera2StreamConfigurationMap = lazy;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AutopayViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Initial.INSTANCE, autopayReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware) lazy.getValue(), create}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputFormats = mviStateStore;
        mviStateStore.onEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated(autopayNavigationArgs.getCreditAccountId()));
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs getArgs() {
        return this.args;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputFormats.onEvent(event);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware $r8$lambda$V5DJ1krzzNOvIgAKV9dDlo0R9ms(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayViewModel autopayViewModel) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware(autopayViewModel.getHighSpeedVideoFpsRanges, autopayViewModel.getHighSpeedVideoFpsRangesFor, autopayViewModel.getHighResolutionOutputSizeshNQ4ISI, autopayViewModel.args.getCreditProductIdentifier());
    }
}
