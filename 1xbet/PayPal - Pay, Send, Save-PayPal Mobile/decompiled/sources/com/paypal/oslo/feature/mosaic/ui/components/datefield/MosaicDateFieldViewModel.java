package com.paypal.oslo.feature.mosaic.ui.components.datefield;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/MosaicDateFieldViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldReducer;)V", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;", "event", "", "processEvent$mosaic_prodRelease", "(Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEvent;)V", "onFieldFocused$mosaic_prodRelease", "()V", "onFieldUnfocused$mosaic_prodRelease", "onDateValidated$mosaic_prodRelease", "", "error", "onValidationFailed$mosaic_prodRelease", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$mosaic_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicDateFieldViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEffect> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState> uiState;

    @javax.inject.Inject
    public MosaicDateFieldViewModel(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldReducer mosaicDateFieldReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicDateFieldReducer, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent, com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("MosaicDateFieldViewModel.store", com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial.INSTANCE, mosaicDateFieldReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        processEvent$mosaic_prodRelease(new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.Initialize(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldConstants.DEFAULT_DATE_FORMAT, "00/00/0000"));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState> getUiState$mosaic_prodRelease() {
        return this.uiState;
    }

    public final void processEvent$mosaic_prodRelease(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }

    public final void onFieldFocused$mosaic_prodRelease() {
        processEvent$mosaic_prodRelease(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldFocused.INSTANCE);
    }

    public final void onFieldUnfocused$mosaic_prodRelease() {
        processEvent$mosaic_prodRelease(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.FieldUnfocused.INSTANCE);
    }

    public final void onDateValidated$mosaic_prodRelease() {
        processEvent$mosaic_prodRelease(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.DateValidated.INSTANCE);
    }

    public final void onValidationFailed$mosaic_prodRelease(java.lang.String error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        processEvent$mosaic_prodRelease(new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiEvent.ValidationFailed(error));
    }
}
