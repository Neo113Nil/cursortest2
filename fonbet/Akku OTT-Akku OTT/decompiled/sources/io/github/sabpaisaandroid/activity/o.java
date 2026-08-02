package io.github.sabpaisaandroid.activity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.github.sabpaisaandroid.activity.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends WebChromeClient {
    public final /* synthetic */ WebViewActivityLite a;

    public static final class a extends WebViewClient {
        public final /* synthetic */ WebViewActivityLite a;

        public a(WebViewActivityLite webViewActivityLite) {
            this.a = webViewActivityLite;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            WebView webView = this.a.j;
            if (webView == null) {
                return true;
            }
            webView.loadUrl(url);
            return true;
        }
    }

    public o(WebViewActivityLite webViewActivityLite) {
        this.a = webViewActivityLite;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(final WebView webView, boolean z, boolean z2, final Message message) {
        Handler handler = new Handler(Looper.getMainLooper());
        final WebViewActivityLite webViewActivityLite = this.a;
        handler.postDelayed(new Runnable() { // from class: io.github.sabpaisaandroid.activity.n
            @Override // java.lang.Runnable
            public final void run() {
                WebViewActivityLite this$0 = WebViewActivityLite.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WebView webView2 = new WebView(this$0);
                WebView webView3 = webView;
                if (webView3 != null) {
                    webView3.addView(webView2);
                }
                Message message2 = message;
                Intrinsics.checkNotNull(message2);
                Object obj = message2.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                ((WebView.WebViewTransport) obj).setWebView(webView2);
                message2.sendToTarget();
                webView2.setWebViewClient(new o.a(this$0));
            }
        }, 0L);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        String string = "ON Page onJsAlert: " + str;
        Intrinsics.checkNotNullParameter(string, "string");
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String string = "ON Page onJsPrompt: " + str;
        Intrinsics.checkNotNullParameter(string, "string");
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
