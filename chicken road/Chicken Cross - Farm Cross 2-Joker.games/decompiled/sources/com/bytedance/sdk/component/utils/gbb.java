package com.bytedance.sdk.component.utils;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public class gbb {
    private static final pcc pcc = new sf();

    private static class pcc {
        private pcc() {
        }

        public void pcc(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    private static class sf extends pcc {
        private sf() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.gbb.pcc
        public void pcc(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void pcc(WebView webView, String str) {
        pcc.pcc(webView, str);
    }
}
