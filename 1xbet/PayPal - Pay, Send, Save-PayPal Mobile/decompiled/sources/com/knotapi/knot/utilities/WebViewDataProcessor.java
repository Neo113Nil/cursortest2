package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class WebViewDataProcessor {
    private static final java.lang.String TAG = "WebViewDataProcessor";

    public interface DataProcessingCallback {
        void onDataProcessed(com.knotapi.knot.models.MerchantWebViewData merchantWebViewData);
    }

    public static java.util.Map<java.lang.String, java.lang.String> processInteractionMetadata(java.lang.String str) {
        if (str == null || str.isEmpty() || "{}".equals(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, java.lang.String.valueOf(jSONObject.get(next)));
            }
            return hashMap;
        } catch (org.json.JSONException unused) {
            return java.util.Collections.singletonMap("raw", str);
        }
    }

    private static void processStorageDataAsync(android.webkit.WebView webView, final com.knotapi.knot.models.MerchantWebViewData.Builder builder, final com.knotapi.knot.utilities.WebViewDataProcessor.DataProcessingCallback dataProcessingCallback) {
        webView.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.GET_LOCAL_SESSION_STORAGE, new android.webkit.ValueCallback() { // from class: com.knotapi.knot.utilities.WebViewDataProcessor$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.knotapi.knot.utilities.WebViewDataProcessor.lambda$processStorageDataAsync$0(com.knotapi.knot.models.MerchantWebViewData.Builder.this, dataProcessingCallback, (java.lang.String) obj);
            }
        });
    }

    public static void processWebViewData(android.webkit.WebView webView, com.knotapi.knot.webview.KnotView knotView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.knotapi.knot.utilities.WebViewDataProcessor.DataProcessingCallback dataProcessingCallback) {
        com.knotapi.knot.models.Bot bot = knotView.bot;
        java.lang.String url = (webView == null || webView.getUrl() == null) ? "" : webView.getUrl();
        com.knotapi.knot.models.MerchantWebViewData.Builder eventType = new com.knotapi.knot.models.MerchantWebViewData.Builder().setMessage(str).setScreenName(url).setCookies(com.knotapi.knot.utilities.Helper.formatCookiesForPuppeteer(knotView.getCookies())).setInteractionMap(processInteractionMetadata(str2)).setBotId(bot.getBotId()).setEventType(str3);
        if (webView != null) {
            processStorageDataAsync(webView, eventType, dataProcessingCallback);
        } else {
            dataProcessingCallback.onDataProcessed(eventType.build());
        }
    }

    static /* synthetic */ void lambda$processStorageDataAsync$0(com.knotapi.knot.models.MerchantWebViewData.Builder builder, com.knotapi.knot.utilities.WebViewDataProcessor.DataProcessingCallback dataProcessingCallback, java.lang.String str) {
        java.lang.Exception e;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "{}";
        if (str != null) {
            try {
            } catch (java.lang.Exception e2) {
                e = e2;
                str2 = "{}";
            }
            if (!str.equals("null") && !str.equals("undefined")) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                str2 = jSONObject.optString("l", "{}");
                try {
                    str4 = jSONObject.optString(lib.android.paypal.com.magnessdk.g.n2, "{}");
                } catch (java.lang.Exception e3) {
                    e = e3;
                    com.knotapi.knot.services.ErrorReporter.report(e, "WebViewDataProcessor processStorageDataAsync error occurred");
                    java.lang.String str5 = str4;
                    str4 = str2;
                    str3 = str5;
                    builder.setLocalStorage(str4).setSessionStorage(str3);
                    dataProcessingCallback.onDataProcessed(builder.build());
                }
                java.lang.String str52 = str4;
                str4 = str2;
                str3 = str52;
                builder.setLocalStorage(str4).setSessionStorage(str3);
                dataProcessingCallback.onDataProcessed(builder.build());
            }
        }
        str3 = "{}";
        builder.setLocalStorage(str4).setSessionStorage(str3);
        dataProcessingCallback.onDataProcessed(builder.build());
    }
}
