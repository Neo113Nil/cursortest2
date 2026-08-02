package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001%B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "uiModel", "Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;", "mosaicWebViewBuildUrl", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewReducer;)V", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "event", "", "processEvent$mosaic_prodRelease", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;)V", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "getUiModel$mosaic_prodRelease", "()Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;", "getMosaicWebViewBuildUrl", "()Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$mosaic_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect$mosaic_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComplianceWebViewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect> uiEffect;
    private final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel uiModel;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "uiModel", "Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;", "create", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;)Lcom/paypal/oslo/feature/mosaic/ui/webview/ComplianceWebViewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel create(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel uiModel);
    }

    @dagger.assisted.AssistedInject
    public ComplianceWebViewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel, com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewReducer complianceWebViewReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewUIModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicWebViewBuildUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewReducer, "");
        this.uiModel = complianceWebViewUIModel;
        this.mosaicWebViewBuildUrl = mosaicWebViewBuildUrl;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent, com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ComplianceWebViewViewModel.store", com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Initial.INSTANCE, complianceWebViewReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent$mosaic_prodRelease(new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.DataLoaded(complianceWebViewUIModel));
    }

    /* renamed from: getUiModel$mosaic_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel getUiModel() {
        return this.uiModel;
    }

    public final com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl getMosaicWebViewBuildUrl() {
        return this.mosaicWebViewBuildUrl;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState> getUiState$mosaic_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEffect> getUiEffect$mosaic_prodRelease() {
        return this.uiEffect;
    }

    public final void processEvent$mosaic_prodRelease(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
