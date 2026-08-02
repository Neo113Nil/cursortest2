package com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u0001:\u000223B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\b\u0012\u0004\u0012\u00020#0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020$0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;", "destination", "", "invoiceUrl", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceReducer;", "reducer", "Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper$Factory;", "analyticsHelperFactory", "<init>", "(Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;Ljava/lang/String;Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceReducer;Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper$Factory;)V", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceEvent;)V", "Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;", "getDestination", "()Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;", "Ljava/lang/String;", "getInvoiceUrl", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper;", "analyticsHelper", "Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper;", "getAnalyticsHelper$invoicing_prodRelease", "()Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewClientConfiguration;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewClientConfiguration;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel$webViewCallback$1;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel$webViewCallback$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewInvoiceViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String CUSTOM_USER_AGENT_SUFFIX = "PayPalMobile";

    @java.lang.Deprecated
    public static final java.lang.String JS_INTERFACE_PAYPAL_MOBILE = "paypalMobile";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper analyticsHelper;
    private final com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination destination;
    private final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel$webViewCallback$1 getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration getHighSpeedVideoSizes;
    private final java.lang.String invoiceUrl;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState> uiState;
    private static final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Companion Companion = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"mailto", "tel"});

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel$Factory;", "", "Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;", "destination", "", "invoiceUrl", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;", "create", "(Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;Ljava/lang/String;)Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel create(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination destination, java.lang.String invoiceUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel$webViewCallback$1] */
    @dagger.assisted.AssistedInject
    public ViewInvoiceViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination, @dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceReducer viewInvoiceReducer, com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInvoiceDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInvoiceReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.destination = viewInvoiceDestination;
        this.invoiceUrl = str;
        com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper create = factory.create(viewInvoiceDestination.getEntryPoint());
        this.analyticsHelper = create;
        int i = 2;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration secureWebViewClientConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel$webViewClientConfiguration$1
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ void onPageFinished(java.lang.String str2) {
                super.onPageFinished(str2);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ void onPageStarted(java.lang.String str2, android.graphics.Bitmap bitmap) {
                super.onPageStarted(str2, bitmap);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ boolean onPdfDetected(java.lang.String str2) {
                return super.onPdfDetected(str2);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ void onReceivedError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                super.onReceivedError(webResourceRequest, webResourceError);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ void onReceivedHttpError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webResourceRequest, webResourceResponse);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest request) {
                android.net.Uri url;
                java.lang.String scheme;
                com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Companion unused;
                if (request == null || (url = request.getUrl()) == null || (scheme = url.getScheme()) == null) {
                    return false;
                }
                java.lang.String lowerCase = scheme.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase == null) {
                    return false;
                }
                unused = com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Companion;
                if (!com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Companion.getHighSpeedVideoSizes().contains(lowerCase)) {
                    return false;
                }
                com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel = com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.this;
                java.lang.String obj = request.getUrl().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                viewInvoiceViewModel.processEvent(new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalSchemeUri(obj));
                return true;
            }
        }, null, i, 0 == true ? 1 : 0);
        this.getHighSpeedVideoSizes = secureWebViewClientConfiguration;
        ?? r13 = new com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel$webViewCallback$1
            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle) {
                super.onActionsReady(webViewActionBundle);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
                super.onLoadFailed(secureWebViewError);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onLoadingFinished(java.lang.String str2) {
                super.onLoadingFinished(str2);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onLoadingStarted(java.lang.String str2) {
                super.onLoadingStarted(str2);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final void onDownloadRequest(java.lang.String url, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimeType, long contentLength) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(mimeType, "application/pdf")) {
                    com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.this.processEvent(new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenPdfViewer(url));
                }
            }
        };
        this.getHighSpeedVideoFpsRangesFor = r13;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest = new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, viewInvoiceDestination.getEntryPoint(), false, false, null, 28, null);
        com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig secureWebViewUiConfig = new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig("", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.$r8$lambda$1XhS9AS7ZwbFm2LA1CiCu1kmAik((java.lang.String) obj);
            }
        }, false, false, false, 28, null);
        com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings = new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings("PayPalMobile", true);
        com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration secureWebViewJavaScriptConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalMobile", new com.paypal.oslo.feature.invoicing.ui.viewinvoice.jsinterface.InvoiceJavaScriptInterface(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.m15584$r8$lambda$szka6Iq_QdQHFCpz9HXYQwTig(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.this, (java.lang.String) obj);
            }
        }))), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent, com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ViewInvoiceViewModel.store", new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready(new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, secureWebViewURLRequest, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) r13, secureWebViewUiConfig, secureWebViewSettings, secureWebViewJavaScriptConfiguration, secureWebViewClientConfiguration, 1, null), false, 0, 6, null), viewInvoiceReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceAnalyticsMiddleware(create)), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination getDestination() {
        return this.destination;
    }

    public final java.lang.String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    /* renamed from: getAnalyticsHelper$invoicing_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper getAnalyticsHelper() {
        return this.analyticsHelper;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel$Companion;", "", "<init>", "()V", "", "JS_INTERFACE_PAYPAL_MOBILE", "Ljava/lang/String;", "CUSTOM_USER_AGENT_SUFFIX", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoSizes", "()Ljava/util/Set;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static java.util.Set<java.lang.String> getHighSpeedVideoSizes() {
            return com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    /* renamed from: $r8$lambda$-szka6I-q_QdQHFCpz9HXYQwTig, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15584$r8$lambda$szka6Iq_QdQHFCpz9HXYQwTig(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        viewInvoiceViewModel.processEvent(new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnOpenExternalLink(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$1XhS9AS7ZwbFm2LA1CiCu1kmAik(java.lang.String str) {
        return "";
    }
}
