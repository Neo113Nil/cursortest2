package com.paypal.oslo.feature.mosaic.ui.legacy;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/MosaicLegacyFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "destination", "Lcom/paypal/oslo/feature/mosaic/domain/usecase/GetMosaicEligibilityUseCase;", "getMosaicEligibilityUseCase", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;Lcom/paypal/oslo/feature/mosaic/domain/usecase/GetMosaicEligibilityUseCase;Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowReducer;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/mosaic/domain/usecase/GetMosaicEligibilityUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$mosaic_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicLegacyFlowViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEffect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/MosaicLegacyFlowViewModel$Factory;", "", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "destination", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/MosaicLegacyFlowViewModel;", "create", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;)Lcom/paypal/oslo/feature/mosaic/ui/legacy/MosaicLegacyFlowViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel create(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination destination);
    }

    @dagger.assisted.AssistedInject
    public MosaicLegacyFlowViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase getMosaicEligibilityUseCase, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowReducer mosaicLegacyFlowReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMosaicEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyFlowReducer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mosaicLegacyDestination;
        this.Camera2StreamConfigurationMap = getMosaicEligibilityUseCase;
        com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel mosaicLegacyFlowViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("MosaicLegacyFlowViewModel.store", com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.Loading.INSTANCE, mosaicLegacyFlowReducer, null, androidx.view.ViewModelKt.getViewModelScope(mosaicLegacyFlowViewModel), 8, null);
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(mosaicLegacyFlowViewModel), null, null, new com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel$fetchEligibility$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState> getUiState$mosaic_prodRelease() {
        return this.uiState;
    }
}
