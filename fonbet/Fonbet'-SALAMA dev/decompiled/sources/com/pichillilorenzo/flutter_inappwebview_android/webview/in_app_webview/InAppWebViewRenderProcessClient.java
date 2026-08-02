package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import R0.d;
import R0.x;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import t.e;
import w1.L;

/* loaded from: classes2.dex */
public class InAppWebViewRenderProcessClient extends d {
    protected static final String LOG_TAG = "IAWRenderProcessClient";

    public void dispose() {
    }

    public void onRenderProcessResponsive(WebView webView, final x xVar) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewChannelDelegate.RenderProcessResponsiveCallback renderProcessResponsiveCallback = new WebViewChannelDelegate.RenderProcessResponsiveCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.2
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Integer num) {
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder d7 = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(d7, str2, InAppWebViewRenderProcessClient.LOG_TAG);
                defaultBehaviour((Integer) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Integer num) {
                if (xVar == null) {
                    return true;
                }
                if (num.intValue() != 0 || !d.a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return false;
                }
                xVar.a();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onRenderProcessResponsive(inAppWebView.getUrl(), renderProcessResponsiveCallback);
        } else {
            renderProcessResponsiveCallback.defaultBehaviour(null);
        }
    }

    public void onRenderProcessUnresponsive(WebView webView, final x xVar) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewChannelDelegate.RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Integer num) {
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, A5.r
            public void error(String str, String str2, Object obj) {
                StringBuilder d7 = e.d(str, ", ");
                if (str2 == null) {
                    str2 = "";
                }
                L.m(d7, str2, InAppWebViewRenderProcessClient.LOG_TAG);
                defaultBehaviour((Integer) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Integer num) {
                if (xVar == null) {
                    return true;
                }
                if (num.intValue() != 0 || !d.a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return false;
                }
                xVar.a();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onRenderProcessUnresponsive(inAppWebView.getUrl(), renderProcessUnresponsiveCallback);
        } else {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
        }
    }
}
