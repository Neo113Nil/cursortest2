package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001*B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0014\u001a\u00020\u00168CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;", "getLegacyWebViewServicingUrlUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/LegacyServicingLandingArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingObservabilityMiddleware$Factory;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/LegacyServicingLandingArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/LegacyServicingLandingArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingSideEffectMiddleware;", "Lkotlin/Lazy;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingObservabilityMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingObservabilityMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegacyServicingLandingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/LegacyServicingLandingArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/LegacyServicingLandingArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public LegacyServicingLandingViewModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase getLegacyWebViewServicingUrlUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingReducer legacyServicingLandingReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware.Factory factory, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs legacyServicingLandingArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLegacyWebViewServicingUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyServicingLandingReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyServicingLandingArgs, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getLegacyWebViewServicingUrlUseCase;
        this.Camera2StreamConfigurationMap = legacyServicingLandingArgs;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.$r8$lambda$QxES1hrzMVC71jJadwT4SD1hU6g(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.this);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = lazy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingObservabilityMiddleware create = factory.create(legacyServicingLandingArgs.getCreditProductIdentifier());
        this.getHighSpeedVideoSizes = create;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("LegacyServicingLandingViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Initial.INSTANCE, legacyServicingLandingReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware) lazy.getValue(), create}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnViewCreated.INSTANCE);
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware $r8$lambda$QxES1hrzMVC71jJadwT4SD1hU6g(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel legacyServicingLandingViewModel) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware(legacyServicingLandingViewModel.Camera2StreamConfigurationMap.getCreditProductIdentifier(), legacyServicingLandingViewModel.Camera2StreamConfigurationMap.getRedirectUrlKey(), legacyServicingLandingViewModel.getHighResolutionOutputSizeshNQ4ISI);
    }
}
