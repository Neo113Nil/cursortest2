package com.paypal.oslo.feature.bnplservicing.ui.webview;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001%B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUIModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUIModel;Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewReducer;Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUiEvent;", "event", "", "processEvent$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUiEvent;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUIModel;", "getUiModel$bnpl_servicing_prodRelease", "()Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUIModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "getSessionStorage$bnpl_servicing_prodRelease", "()Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingWebViewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiState, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEffect> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage sessionStorage;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEffect> uiEffect;
    private final com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel uiModel;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUIModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewViewModel;", "create", "(Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUIModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel create(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel uiModel);
    }

    @dagger.assisted.AssistedInject
    public BnplServicingWebViewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel bnplServicingWebViewUIModel, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer bnplServicingWebViewReducer, com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingWebViewUIModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingWebViewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingSessionStorage, "");
        this.uiModel = bnplServicingWebViewUIModel;
        this.sessionStorage = bnplServicingSessionStorage;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiState, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("BnplServicingWebViewViewModel.store", com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiState.Initial.INSTANCE, bnplServicingWebViewReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent.DataLoaded(bnplServicingWebViewUIModel));
    }

    /* renamed from: getUiModel$bnpl_servicing_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUIModel getUiModel() {
        return this.uiModel;
    }

    /* renamed from: getSessionStorage$bnpl_servicing_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiState> getUiState$bnpl_servicing_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEffect> getUiEffect$bnpl_servicing_prodRelease() {
        return this.uiEffect;
    }

    public final void processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }
}
