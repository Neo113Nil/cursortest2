package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningViewModel;", "Landroidx/lifecycle/ViewModel;", "", "intent", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningUrls;", "provisioningUrls", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningUrls;)V", "", "onBackPressed", "()V", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningUrls;", "provisioningUrl", "getProvisioningUrl", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "webViewConfig", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "getWebViewConfig", "()Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoEopProvisioningViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect> effect;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String provisioningUrl;
    private final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration webViewConfig;
    private static final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningViewModel$Factory;", "", "", "intent", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel create(java.lang.String intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    public CryptoEopProvisioningViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls cryptoEopProvisioningUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoEopProvisioningUrls, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = cryptoEopProvisioningUrls;
        java.lang.String buildProvisioningUrl = cryptoEopProvisioningUrls.buildProvisioningUrl(str);
        this.provisioningUrl = buildProvisioningUrl;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent = null;
        this.webViewConfig = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(secureWebViewContent, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(buildProvisioningUrl, "crypto-provisioning", true, false, null, 24, null), new com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel$createWebViewConfiguration$2
            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle) {
                super.onActionsReady(webViewActionBundle);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onDownloadRequest(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j) {
                super.onDownloadRequest(str2, str3, str4, str5, j);
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
            public final void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                mutableSharedFlow = com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Error.INSTANCE);
            }
        }, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, false, true, false, 23, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel$createWebViewConfiguration$1
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
                java.lang.String obj;
                com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls cryptoEopProvisioningUrls2;
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                if (request == null || (url = request.getUrl()) == null || (obj = url.toString()) == null) {
                    return false;
                }
                cryptoEopProvisioningUrls2 = com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.this.getHighSpeedVideoFpsRangesFor;
                if (!cryptoEopProvisioningUrls2.isCompletionUrl(obj)) {
                    return false;
                }
                mutableSharedFlow = com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                mutableSharedFlow.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Completed.INSTANCE);
                return true;
            }
        }, null, 2, 0 == true ? 1 : 0), 33, null);
    }

    public final java.lang.String getProvisioningUrl() {
        return this.provisioningUrl;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect> getEffect() {
        return this.effect;
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration getWebViewConfig() {
        return this.webViewConfig;
    }

    public final void onBackPressed() {
        this.getHighResolutionOutputSizeshNQ4ISI.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Cancelled.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoEopProvisioningViewModel$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
