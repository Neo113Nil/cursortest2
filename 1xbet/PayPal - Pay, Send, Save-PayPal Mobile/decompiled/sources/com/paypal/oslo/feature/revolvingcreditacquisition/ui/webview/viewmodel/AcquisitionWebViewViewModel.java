package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001&B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewReducer;", "reducer", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewDownloadFileMiddleware;", "acquisitionWebViewDownloadFileMiddleware", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewReducer;Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewDownloadFileMiddleware;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AcquisitionWebViewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs navArgs;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel create(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public AcquisitionWebViewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs acquisitionWebViewNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewReducer acquisitionWebViewReducer, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware acquisitionWebViewDownloadFileMiddleware) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionWebViewNavigationArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionWebViewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionWebViewDownloadFileMiddleware, "");
        this.navArgs = acquisitionWebViewNavigationArgs;
        this.getHighSpeedVideoFpsRanges = webEnvironmentProvider;
        java.lang.String resolveWebUrl = com.paypal.oslo.core.webview.config.WebEnvironmentProviderKt.resolveWebUrl(webEnvironmentProvider, acquisitionWebViewNavigationArgs.getUrl());
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AcquisitionWebViewViewModel.store", new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState.Ready(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(resolveWebUrl == null ? "" : resolveWebUrl, acquisitionWebViewNavigationArgs.getSource(), acquisitionWebViewNavigationArgs.getUseSSO(), false, kotlin.collections.MapsKt.emptyMap()), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null))), acquisitionWebViewReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{acquisitionWebViewDownloadFileMiddleware, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.base.ObservabilityMiddleware("AcquisitionWebViewViewModel")}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs getNavArgs() {
        return this.navArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }
}
