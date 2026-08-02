package com.paypal.oslo.feature.mosaic.ui.components.address;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/MosaicAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "getAddressLayoutUseCase", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressReducer;)V", "", "loadLayout$mosaic_prodRelease", "()V", "", "fieldId", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onFieldValueChanged$mosaic_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$mosaic_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicAddressViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEffect> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState> uiState;

    @javax.inject.Inject
    public MosaicAddressViewModel(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressReducer mosaicAddressReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressLayoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicAddressReducer, "");
        this.getHighSpeedVideoFpsRangesFor = getAddressLayoutUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("MosaicAddressViewModel.store", com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial.INSTANCE, mosaicAddressReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        loadLayout$mosaic_prodRelease();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState> getUiState$mosaic_prodRelease() {
        return this.uiState;
    }

    public final void loadLayout$mosaic_prodRelease() {
        this.Camera2StreamConfigurationMap.onEvent(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LoadLayout.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel$loadLayout$1(this, null), 3, null);
    }

    public final void onFieldValueChanged$mosaic_prodRelease(java.lang.String fieldId, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged(fieldId, value));
    }
}
