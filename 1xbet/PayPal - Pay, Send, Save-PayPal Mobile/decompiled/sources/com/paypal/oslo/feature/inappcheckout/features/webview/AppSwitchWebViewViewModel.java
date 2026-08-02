package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001lBk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001c¢\u0006\u0004\b%\u0010\u001eJ!\u0010*\u001a\u00020\u001c2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u00020\u001c2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u001c¢\u0006\u0004\b6\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010=\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010:\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010JR\u0014\u0010L\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010KR\u0014\u0010O\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010G\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010VR \u0010X\u001a\b\u0012\u0004\u0012\u00020U0W8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010^R \u0010`\u001a\b\u0012\u0004\u0012\u00020]0_8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0011\u0010g\u001a\u00020d8G¢\u0006\u0006\u001a\u0004\be\u0010fR\u0018\u0010M\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010hR\u0016\u0010E\u001a\u00020i8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010jR\u0016\u0010k\u001a\u00020i8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010j"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/AppSwitchWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/navigation/route/WebViewCheckoutDestination;", "destination", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetActionFromLoadedUrlsUseCase;", "getActionForUrlLoadingUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/CheckoutDataInitializer;", "checkoutDataInitializer", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewAuthenticationHandler;", "webViewAuthenticationHandler", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/ReturnToMerchantHandler;", "returnToMerchantHandler", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/reducer/WebViewReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/javascript/InAppCheckoutMutationObserverJsProvider;", "mutationObserverProvider", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "trackMonitoringEventUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/lifecycleObserver/CheckoutAppLifecycleObserver;", "lifecycleObserver", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/route/WebViewCheckoutDestination;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetActionFromLoadedUrlsUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/webview/CheckoutDataInitializer;Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewAuthenticationHandler;Lcom/paypal/oslo/feature/inappcheckout/features/switchback/ReturnToMerchantHandler;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/reducer/WebViewReducer;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/javascript/InAppCheckoutMutationObserverJsProvider;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/lifecycleObserver/CheckoutAppLifecycleObserver;)V", "", "setup", "()V", "onRetryClick", "onErrorCancelClick", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CancellationSource;", "source", "onUserCancelRequested", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CancellationSource;)V", "onWebPageFailedToLoad", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/UserCanceled;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "checkoutAuthenticationResult", "handleCheckoutAuthenticationResult", "(Larrow/core/Either;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;)V", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "javaScriptBridge", "Landroid/net/Uri;", "uri", "handleWebViewUrlLoaded", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;Landroid/net/Uri;)V", "onRypPageRendered", "Lcom/paypal/oslo/feature/inappcheckout/navigation/route/WebViewCheckoutDestination;", "getDestination", "()Lcom/paypal/oslo/feature/inappcheckout/navigation/route/WebViewCheckoutDestination;", "getOutputFormats", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetActionFromLoadedUrlsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/CheckoutDataInitializer;", "unwrapAs", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewAuthenticationHandler;", "getHighSpeedVideoFpsRanges", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/ReturnToMerchantHandler;", "Camera2StreamConfigurationMap", "getOutputSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/reducer/WebViewReducer;", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getInputFormats", "getOutputStallDuration", "Lcom/paypal/oslo/feature/inappcheckout/features/javascript/InAppCheckoutMutationObserverJsProvider;", "getInputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/TrackMonitoringEventUseCase;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/inappcheckout/features/lifecycleObserver/CheckoutAppLifecycleObserver;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "getUniversalLinkData", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "universalLinkData", "Landroid/net/Uri;", "", "Z", "isOutputSupportedForhNQ4ISI", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSwitchWebViewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State> getOutputStallDurationlomOqCM;
    private final com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination destination;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private android.net.Uri getOutputStallDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer getHighSpeedVideoSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase getOutputMinFrameDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider getInputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State> state;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler getHighSpeedVideoFpsRanges;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/AppSwitchWebViewViewModel$Factory;", "", "Lcom/paypal/oslo/feature/inappcheckout/navigation/route/WebViewCheckoutDestination;", "destination", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/AppSwitchWebViewViewModel;", "create", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/route/WebViewCheckoutDestination;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/AppSwitchWebViewViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel create(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination destination);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    public AppSwitchWebViewViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase getActionFromLoadedUrlsUseCase, com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer checkoutDataInitializer, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler webViewAuthenticationHandler, com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler returnToMerchantHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer webViewReducer, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider inAppCheckoutMutationObserverJsProvider, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase, com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver checkoutAppLifecycleObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewCheckoutDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getActionFromLoadedUrlsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutDataInitializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewAuthenticationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnToMerchantHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutMutationObserverJsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackMonitoringEventUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAppLifecycleObserver, "");
        this.destination = webViewCheckoutDestination;
        this.getHighResolutionOutputSizeshNQ4ISI = getActionFromLoadedUrlsUseCase;
        this.getHighSpeedVideoFpsRangesFor = checkoutDataInitializer;
        this.getHighSpeedVideoFpsRanges = webViewAuthenticationHandler;
        this.Camera2StreamConfigurationMap = returnToMerchantHandler;
        this.getHighSpeedVideoSizes = webViewReducer;
        this.getHighSpeedVideoSizesFor = checkoutLogger;
        this.getOutputFormats = analyticsTracer;
        this.getInputFormats = appSwitchSession;
        this.getInputSizeshNQ4ISI = inAppCheckoutMutationObserverJsProvider;
        this.getOutputMinFrameDuration = trackMonitoringEventUseCase;
        this.getOutputMinFrameDurationlomOqCM = checkoutAppLifecycleObserver;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State(null, 1, 0 == true ? 1 : 0));
        this.getOutputStallDurationlomOqCM = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputSizeshNQ4ISI = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination getDestination() {
        return this.destination;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> getEffect() {
        return this.effect;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData getUniversalLinkData() {
        return this.destination.getUniversalLinkData();
    }

    public final void setup() {
        getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.Initialize.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor.handleUniversalLinkData(getUniversalLinkData(), androidx.view.ViewModelKt.getViewModelScope(this), new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$setup$1(this), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.$r8$lambda$kv85jTG_YJ73Nu5dDGjD9svnIGc(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.this, (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect) obj);
            }
        });
    }

    public final void onRetryClick() {
        setup();
    }

    public final void onErrorCancelClick() {
        this.getOutputMinFrameDurationlomOqCM.markTransactionComplete();
        getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.SafeCancel.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1(this, null), 3, null);
        this.getOutputMinFrameDurationlomOqCM.stopMonitoring();
    }

    public final void onUserCancelRequested(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getHighSpeedVideoSizesFor, "User-initiated cancellation", com.paypal.android.logger.categories.UI.Interaction.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", source.getLogMessage())), null, 8, null);
        if (source == com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CancellationSource.ReturnButton) {
            this.isOutputSupportedForhNQ4ISI = true;
        }
        this.getOutputMinFrameDurationlomOqCM.markTransactionComplete();
        getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.SafeCancel.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onUserCancelRequested$1(this, null), 3, null);
        this.getOutputMinFrameDurationlomOqCM.stopMonitoring();
    }

    public final void onWebPageFailedToLoad() {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(this.getHighSpeedVideoSizesFor, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "Web page failed to load: Showing non-recoverable error screen.", null, null, null, 28, null);
        getHighSpeedVideoFpsRangesFor(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError(true, this.getInputFormats.getGetHighSpeedVideoSizes()));
    }

    public final void handleCheckoutAuthenticationResult(arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> checkoutAuthenticationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationResult, "");
        this.getHighSpeedVideoFpsRanges.handleCheckoutAuthenticationResult(checkoutAuthenticationResult, androidx.view.ViewModelKt.getViewModelScope(this), new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$handleCheckoutAuthenticationResult$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event p0) {
        com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State reduce = this.getHighSpeedVideoSizes.reduce(this.getOutputStallDurationlomOqCM.getValue(), p0);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State> mutableStateFlow = this.getOutputStallDurationlomOqCM;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), reduce)) {
        }
    }

    public static /* synthetic */ void handleWebViewUrlLoaded$default(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge, android.net.Uri uri, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            secureWebViewJavaScriptBridge = null;
        }
        appSwitchWebViewViewModel.handleWebViewUrlLoaded(secureWebViewJavaScriptBridge, uri);
    }

    public final void handleWebViewUrlLoaded(com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge javaScriptBridge, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        this.getOutputStallDuration = uri;
        if (!this.getOutputSizes) {
            this.getOutputFormats.trackWebCheckout(this.getInputFormats.getSource());
            com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.getOutputMinFrameDuration, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_INITIAL_WEB_PRESENTATION, null, 2, null);
            this.getOutputSizes = true;
        }
        if (javaScriptBridge != null) {
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge.evaluateJavaScript$default(javaScriptBridge, this.getInputSizeshNQ4ISI.getJavaScriptCode(), null, 2, null);
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(uri);
        if (invoke instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.NoOp) {
            return;
        }
        if (!(invoke instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (this.isOutputSupportedForhNQ4ISI) {
            return;
        }
        this.getOutputFormats.trackReturnToMerchantAppInitiated();
        this.getOutputMinFrameDurationlomOqCM.markTransactionComplete();
        this.Camera2StreamConfigurationMap.handleReturnToMerchant((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent) invoke, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$handleWebViewUrlLoaded$1(this));
        this.getOutputMinFrameDurationlomOqCM.stopMonitoring();
    }

    public final void onRypPageRendered() {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase.invoke$default(this.getOutputMinFrameDuration, com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents.FINISHED_WEB_RYP_PAGE_RENDER, null, 2, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kv85jTG_YJ73Nu5dDGjD9svnIGc(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect effect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
        if (effect instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication) {
            appSwitchWebViewViewModel.getHighSpeedVideoFpsRanges.handleAuthenticationEffect((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication) effect, androidx.view.ViewModelKt.getViewModelScope(appSwitchWebViewViewModel), new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$setup$2$1(appSwitchWebViewViewModel));
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(appSwitchWebViewViewModel), null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$emitEffect$1(appSwitchWebViewViewModel, effect, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
