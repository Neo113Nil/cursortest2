package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "navigationArgs", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/remoteconfig/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/remoteconfig/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingReducer;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AcquisitionLandingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "navigationArgs", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel create(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs navigationArgs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    public AcquisitionLandingViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingReducer acquisitionLandingReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingNavigationArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingReducer, "");
        this.getHighSpeedVideoFpsRanges = acquisitionLandingNavigationArgs;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AcquisitionLandingViewModel.store", new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial(acquisitionLandingNavigationArgs.getCreditProductIdentifier(), acquisitionLandingNavigationArgs.getWebViewUrl()), acquisitionLandingReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.ObservabilityMiddleware("AcquisitionLandingViewModel")), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        int i = 2;
        java.util.Map map = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (acquisitionLandingNavigationArgs.getCreditProductIdentifier() == com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.UNKNOWN) {
            processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState("unknown_cpi", map, i, objArr3 == true ? 1 : 0));
        } else if (acquisitionLandingNavigationArgs.getWebViewUrl() == null) {
            processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissInvalidState("null_web_url", objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
        } else if (featureGateManager.isAcquisitionFlowDisabledFor(acquisitionLandingNavigationArgs.getCreditProductIdentifier())) {
            processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnFlowDisabled.INSTANCE);
        } else if (featureGateManager.isNativeFlowEnabled()) {
            processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToNativeFlow.INSTANCE);
        } else {
            processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnNavigateToWebViewFlow.INSTANCE);
        }
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }
}
