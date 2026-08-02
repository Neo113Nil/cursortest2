package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class JavaScriptInterface {
    private static final java.lang.String ERROR_CODE_KEY = "errorCode";
    private static final java.lang.String ERROR_MESSAGE_KEY = "errorMessage";
    private static final java.lang.String MERCHANT_KEY = "merchant";
    public static final java.lang.String TAG = "Knot:JavaScriptInterface";
    android.content.Context context;
    com.knotapi.knot.models.Environment environment;
    android.app.Activity hostActivity;
    com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate = com.knotapi.knot.Knot.getInstance().getKnotEventDelegateListener();
    com.knotapi.knot.interfaces.MerchantClickDelegate merchantClickDelegate;
    com.knotapi.knot.interfaces.WebAppLoadingListener webAppLoadingListener;
    com.knotapi.knot.interfaces.MerchantWebViewDelegate webViewDelegate;

    public JavaScriptInterface(com.knotapi.knot.models.Environment environment, android.content.Context context, com.knotapi.knot.interfaces.MerchantClickDelegate merchantClickDelegate, com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate, com.knotapi.knot.interfaces.WebAppLoadingListener webAppLoadingListener, android.app.Activity activity) {
        this.context = context;
        this.environment = environment;
        this.merchantClickDelegate = merchantClickDelegate;
        this.webViewDelegate = merchantWebViewDelegate;
        this.webAppLoadingListener = webAppLoadingListener;
        this.hostActivity = activity;
    }

    private void handleException(java.lang.Exception exc, java.lang.String str) {
        com.knotapi.knot.services.ErrorReporter.report(exc, str);
    }

    @android.webkit.JavascriptInterface
    public void nativeRequestResponse(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("filename");
            java.lang.String optString2 = jSONObject.optString("script");
            if (optString.isEmpty() || optString2.isEmpty()) {
                return;
            }
            android.app.Activity activity = this.hostActivity;
            if (activity instanceof com.knotapi.knot.ui.activities.KnotActivity) {
                ((com.knotapi.knot.ui.activities.KnotActivity) activity).cacheDynamicAsset(optString, optString2);
            }
        } catch (java.lang.Exception e) {
            handleException(e, "nativeRequestResponse");
        }
    }

    @android.webkit.JavascriptInterface
    public void onClose() {
        try {
            com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
            if (knotEventDelegate != null) {
                knotEventDelegate.onExit();
            }
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.models.JavaScriptInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    android.content.Context context = com.knotapi.knot.models.JavaScriptInterface.this.context;
                    if (context == null || !(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
                        return;
                    }
                    ((android.app.Activity) com.knotapi.knot.models.JavaScriptInterface.this.context).finish();
                }
            });
        } catch (java.lang.Exception e) {
            handleException(e, "onClose");
        }
    }

    @android.webkit.JavascriptInterface
    public void onError(java.lang.String str) {
        try {
            this.webViewDelegate.setNeedTimeOutCall(false);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (this.knotEventDelegate != null && jSONObject.has("errorCode")) {
                this.knotEventDelegate.onError(com.knotapi.knot.models.KnotErrorMapper.map(str));
            }
            final java.lang.String string = jSONObject.getString("errorMessage");
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.models.JavaScriptInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = com.knotapi.knot.models.JavaScriptInterface.this.webViewDelegate;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("onError: ");
                    sb.append(string);
                    merchantWebViewDelegate.sendNativeLogEvent(null, com.knotapi.knot.utilities.Constants.META_CONSOLE_ERROR, sb.toString(), "");
                }
            });
        } catch (java.lang.Exception e) {
            handleException(e, "onError");
        }
    }

    @android.webkit.JavascriptInterface
    public void onEvent(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jSONObject.put("environment", this.environment.name());
            if (jSONObject.has("metaData")) {
                java.lang.Object obj = jSONObject.get("metaData");
                if (obj instanceof java.lang.String) {
                    jSONObject.put("metaData", new org.json.JSONObject((java.lang.String) obj));
                }
            } else {
                jSONObject.put("metaData", new org.json.JSONObject());
            }
            com.knotapi.knot.models.KnotEvent fromJson = com.knotapi.knot.models.KnotEventMapper.fromJson(jSONObject);
            if (fromJson.getTaskId().isEmpty()) {
                com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
                if (knotEventDelegate != null) {
                    knotEventDelegate.onEvent(fromJson);
                    return;
                }
                return;
            }
            if (fromJson.getEvent().equals(com.knotapi.knot.utilities.Constants.lastEventKey) && fromJson.getTaskId().equals(com.knotapi.knot.utilities.Constants.lastTaskId)) {
                return;
            }
            com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate2 = this.knotEventDelegate;
            if (knotEventDelegate2 != null) {
                knotEventDelegate2.onEvent(fromJson);
            }
            com.knotapi.knot.utilities.Constants.lastEventKey = fromJson.getEvent();
            com.knotapi.knot.utilities.Constants.lastTaskId = fromJson.getTaskId();
        } catch (java.lang.Exception e) {
            handleException(e, "onEvent");
        }
    }

    @android.webkit.JavascriptInterface
    public void onExit() {
        try {
            com.knotapi.knot.interfaces.KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
            if (knotEventDelegate != null) {
                knotEventDelegate.onExit();
            }
            ((android.app.Activity) this.context).finish();
        } catch (java.lang.Exception e) {
            handleException(e, "onExit");
        }
    }

    @android.webkit.JavascriptInterface
    public void onInitWebView(java.lang.String str) {
        try {
            this.merchantClickDelegate.didMerchantClick(str);
        } catch (java.lang.Exception e) {
            handleException(e, "onInitWebView");
        }
    }

    @android.webkit.JavascriptInterface
    public void onLoadingFinished(java.lang.String str) {
        try {
            this.webAppLoadingListener.onLoadingFinished();
        } catch (java.lang.Exception e) {
            handleException(e, "onLogEvent");
        }
    }

    @android.webkit.JavascriptInterface
    public void onReOpenMerchantWebView(java.lang.String str) {
        try {
            this.merchantClickDelegate.attachMerchantWebView(str);
        } catch (java.lang.Exception e) {
            handleException(e, "onReOpenMerchantWebView");
        }
    }

    @android.webkit.JavascriptInterface
    public void onStartHaptics(java.lang.String str) {
        try {
            this.webAppLoadingListener.onStartHaptics();
        } catch (java.lang.Exception e) {
            handleException(e, "onStartHaptics");
        }
    }

    @android.webkit.JavascriptInterface
    public void onSuccess(java.lang.String str) {
        try {
            this.webViewDelegate.setNeedTimeOutCall(false);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.has("merchant") ? jSONObject.getString("merchant") : "";
            if (this.knotEventDelegate == null || string.equals(com.knotapi.knot.utilities.Constants.lastMerchant)) {
                return;
            }
            this.knotEventDelegate.onSuccess(jSONObject.getString("merchant"));
            com.knotapi.knot.utilities.Constants.lastMerchant = string;
        } catch (java.lang.Exception e) {
            handleException(e, "onSuccess");
        }
    }

    @android.webkit.JavascriptInterface
    public void sendLegalLinksToNative(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            handleException(new java.lang.IllegalArgumentException("URL is null or empty"), "sendInfoToNativeRequest");
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.setFlags(268435456);
            this.context.startActivity(intent);
        } catch (java.lang.Exception e) {
            handleException(e, "sendInfoToNativeRequest");
        }
    }
}
