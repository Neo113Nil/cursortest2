package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001!B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RevolvingCreditWebViewArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/DownloadFileMiddleware;", "downloadFileMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RevolvingCreditWebViewArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/DownloadFileMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewObservabilityMiddleware$Factory;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditWebViewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEffect> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RevolvingCreditWebViewArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RevolvingCreditWebViewArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public RevolvingCreditWebViewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewReducer revolvingCreditWebViewReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware downloadFileMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditWebViewArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditWebViewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadFileMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState.Initial initial = com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState.Initial.INSTANCE;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewReducer revolvingCreditWebViewReducer2 = revolvingCreditWebViewReducer;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware[] middlewareArr = new com.paypal.oslo.core.mvi.MviStateStore.Middleware[2];
        middlewareArr[0] = downloadFileMiddleware;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = revolvingCreditWebViewArgs.getCreditProductIdentifier();
        middlewareArr[1] = factory.create(creditProductIdentifier == null ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN : creditProductIdentifier);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("RevolvingCreditWebViewViewModel.store", initial, revolvingCreditWebViewReducer2, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) middlewareArr), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnViewCreated.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }
}
