package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;

/* loaded from: classes3.dex */
public class WebViewClientProxyApi extends PigeonApiWebViewClient {

    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientImpl(@NonNull WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$doUpdateVisitedHistory$10(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doUpdateVisitedHistory$11(WebView webView, String str, boolean z) {
            this.api.doUpdateVisitedHistory(this, webView, str, z, new Y0(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onFormResubmission$14(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFormResubmission$15(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new P0(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onLoadResource$16(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadResource$17(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new U0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageCommitVisible$18(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageCommitVisible$19(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new androidx.activity.O(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageFinished$2(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new com.bbflight.background_downloader.Q(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onPageStarted$0(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new T0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedClientCertRequest$20(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedClientCertRequest$21(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new f1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedError$6(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new X0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedHttpAuthRequest$12(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$13(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new Q0(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedHttpError$4(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new e1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedLoginRequest$22(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedLoginRequest$23(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new androidx.datastore.core.f(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onReceivedSslError$24(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedSslError$25(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new g1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onScaleChanged$26(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScaleChanged$27(WebView webView, float f, float f2) {
            this.api.onScaleChanged(this, webView, f, f2, new androidx.activity.P(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$8(Result result) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$9(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new R0(0));
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull final WebView webView, @NonNull final String str, final boolean z) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.S0
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$doUpdateVisitedHistory$11(webView, str, z);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(@NonNull final WebView webView, @NonNull final Message message, @NonNull final Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.a1
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onFormResubmission$15(webView, message, message2);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new androidx.media3.common.util.o(this, webView, str, 1));
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.tekartik.sqflite.q(this, webView, str, 1));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new androidx.webkit.c(this, webView, str, 2));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull final WebView webView, @NonNull final String str, @NonNull Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.W0
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onPageStarted$1(webView, str);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(@NonNull final WebView webView, @NonNull final ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.Z0
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onReceivedClientCertRequest$21(webView, clientCertRequest);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull final WebView webView, @NonNull final WebResourceRequest webResourceRequest, @NonNull final WebResourceError webResourceError) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.d1
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onReceivedError$7(webView, webResourceRequest, webResourceError);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull final WebView webView, @NonNull final HttpAuthHandler httpAuthHandler, @NonNull final String str, @NonNull final String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.h1
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onReceivedHttpAuthRequest$13(webView, httpAuthHandler, str, str2);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.google.android.datatransport.runtime.scheduling.a(1, this, webView, webResourceRequest, webResourceResponse));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(@NonNull final WebView webView, @NonNull final String str, @Nullable final String str2, @NonNull final String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.c1
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onReceivedLoginRequest$23(webView, str, str2, str3);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NonNull final WebView webView, @NonNull final SslErrorHandler sslErrorHandler, @NonNull final SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.b1
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onReceivedSslError$25(webView, sslErrorHandler, sslError);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(@NonNull final WebView webView, final float f, final float f2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.V0
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewClientProxyApi.WebViewClientImpl.this.lambda$onScaleChanged$27(webView, f, f2);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
            this.returnValueForShouldOverrideUrlLoading = z;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new com.tekartik.sqflite.p(this, webView, webResourceRequest, 1));
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }
    }

    public WebViewClientProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    @NonNull
    public WebViewClient pigeon_defaultConstructor() {
        return new WebViewClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(@NonNull WebViewClient webViewClient, boolean z) {
        if (!(webViewClient instanceof WebViewClientImpl)) {
            throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
        }
        ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
