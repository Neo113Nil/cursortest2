package com.knotapi.knot.webview;

/* loaded from: classes9.dex */
public class JSInterfaceObject {
    public static final java.lang.String TAG = "Knot:JSInterfaceObject";
    com.knotapi.knot.webview.KnotView knotView;
    java.lang.String onElementMessage = "";

    public JSInterfaceObject(com.knotapi.knot.webview.KnotView knotView) {
        this.knotView = knotView;
    }

    static /* synthetic */ void lambda$addBreadcrumb$12(java.lang.String str, java.lang.String str2) {
        try {
            com.knotapi.knot.services.ErrorReporter.addBreadcrumb(str, str2);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Failed to add breadcrumb from JS");
        }
    }

    static /* synthetic */ void lambda$storeBreadcrumb$13(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.knotapi.knot.services.ErrorReporter.storeBreadcrumb(str, str2, str3);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Failed to store breadcrumb from JS");
        }
    }

    @android.webkit.JavascriptInterface
    public void addBreadcrumb(final java.lang.String str, final java.lang.String str2) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.lambda$addBreadcrumb$12(str, str2);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void domChanged(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            str = "{}";
        }
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        com.knotapi.knot.utilities.ScreenshotHelper.startScreenshotFlow(knotView, knotView, str);
    }

    /* renamed from: lambda$onCardSwitchError$1$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10849x5ea74cc(java.lang.String str) {
        this.knotView.getWebViewDelegate().setNeedTimeOutCall(false);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("errorMessage");
            java.lang.String optString2 = jSONObject.optString("screenshot");
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onCardSwitchError event: ");
            sb.append(optString);
            printStream.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(function() {    window.dispatchEvent(       new CustomEvent(           \"mobileBotError\",            {                bubbles: true,                detail: {                    merchantId: ");
            sb2.append(this.knotView.getBot().getMerchantId());
            sb2.append(",                    botId: ");
            sb2.append(this.knotView.getBot().getBotId());
            sb2.append(",                    errorMessage: \"");
            sb2.append(optString);
            sb2.append("\",                    screenshot: \"");
            sb2.append(optString2);
            sb2.append("\"                }            }       )   );})();");
            java.lang.String obj = sb2.toString();
            java.io.PrintStream printStream2 = java.lang.System.out;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("errorScript: ");
            sb3.append(obj);
            printStream2.println(sb3.toString());
            this.knotView.getWebViewDelegate().evaluateJS(obj);
            this.knotView.clear();
            this.knotView.getWebViewDelegate().removeFragment(this.knotView.bot.getBotId(), false);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "onCardSwitchError");
        }
    }

    /* renamed from: lambda$onCardSwitchLoggedIn$3$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10850xde210eab(java.lang.String str) {
        try {
            if (com.knotapi.knot.utilities.Helper.isValidJson(str)) {
                if (new org.json.JSONObject(str).optBoolean("shouldStartTaskImmediately", false)) {
                    this.knotView.finalStep();
                }
            } else {
                com.knotapi.knot.webview.KnotView knotView = this.knotView;
                if (!knotView.isLoggedIn && knotView.bot.getMerchantId() != 454) {
                    this.knotView.loginDone();
                    return;
                }
                this.knotView.finalStep();
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "onCardSwitchLoggedIn");
        }
    }

    /* renamed from: lambda$onCardSwitchNativeError$2$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10851x789c76a2(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.knotapi.knot.webview.KnotViewClient viewClient = this.knotView.getViewClient();
            viewClient.showErrorPage(viewClient.getErrorViewWithMessage(jSONObject));
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "onCardSwitchNativeError");
        }
    }

    /* renamed from: lambda$onCardSwitchSuccess$0$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10852xf13eb952() {
        this.knotView.getWebViewDelegate().setNeedTimeOutCall(false);
        java.lang.System.out.println("onSuccess event");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() {    window.dispatchEvent(       new CustomEvent(           \"mobileBotSuccess\",            {                bubbles: true,                detail: {                    merchantId: ");
        sb.append(this.knotView.getBot().getMerchantId());
        sb.append(",                    botId: ");
        sb.append(this.knotView.getBot().getBotId());
        sb.append("                }            }       )   );})();");
        java.lang.String obj = sb.toString();
        java.lang.System.out.println("successScript: ".concat(java.lang.String.valueOf(obj)));
        this.knotView.getWebViewDelegate().evaluateJS(obj);
        this.knotView.clearCookies();
    }

    /* renamed from: lambda$onElementMessage$9$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10853x3ee8045(java.lang.String str) {
        if (str.equalsIgnoreCase("error") || str.equals("\"error\"")) {
            this.knotView.openLinkDialog(true);
        }
        if (!this.onElementMessage.equalsIgnoreCase(str) && str.equals("\"link\"")) {
            this.knotView.openLinkDialog(false);
        }
        this.onElementMessage = str;
    }

    /* renamed from: lambda$onMerchantTracking$7$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10854xaf3821d3(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int merchantId = this.knotView.getBot().getMerchantId();
            int botId = this.knotView.getBot().getBotId();
            jSONObject.put("merchantId", merchantId);
            jSONObject.put("botId", botId);
            java.lang.String optString = jSONObject.optString("eventType");
            com.knotapi.knot.webview.KnotView knotView = this.knotView;
            this.knotView.getWebViewDelegate().sendNativeLogEvent(java.lang.Integer.valueOf(this.knotView.bot.getBotId()), optString, jSONObject.toString(), knotView != null ? knotView.getUrl() : "");
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "onMerchantTracking");
        }
    }

    /* renamed from: lambda$onSendWebappError$5$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10855xdc241599() {
        java.lang.Exception exc = new java.lang.Exception("webpage not available screen");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.knotView.bot.getMerchantName());
        sb.append(" => ");
        sb.append(this.knotView.getUrl());
        com.knotapi.knot.services.ErrorReporter.report(exc, sb.toString());
    }

    /* renamed from: lambda$onStartLoading$4$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10856xb4ca31bb() {
        this.knotView.showLoader();
    }

    /* renamed from: lambda$onStopLoading$6$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10857xca852891() {
        this.knotView.hideLoader();
    }

    /* renamed from: lambda$onUpdateBackButtonBehavior$10$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10858xc7f150ee(java.lang.String str) {
        boolean z;
        try {
            z = new org.json.JSONObject(str).optBoolean("disableBack");
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "onUpdateBackButtonBehavior");
            z = false;
        }
        this.knotView.merchantViewListener.toggleBackButton(z);
    }

    /* renamed from: lambda$onUserActionRequired$11$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10859xb43931d9() {
        this.knotView.getWebViewDelegate().sendUserActionEvent(this.knotView.getBot().getBotId());
    }

    /* renamed from: lambda$sendDataToWebApp$14$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10860x1709f651(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String interceptedValues = this.knotView.mExtraInfo.getInterceptedValues();
            if (interceptedValues == null || interceptedValues.isEmpty()) {
                interceptedValues = "{}";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(interceptedValues);
            jSONObject.put(str2, new org.json.JSONObject(str));
            this.knotView.mExtraInfo.setInterceptedValues(jSONObject.toString());
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Failed to handle named JSON payload in sendDataToWebApp");
        }
    }

    /* renamed from: lambda$userIsLoggedIn$8$com-knotapi-knot-webview-JSInterfaceObject, reason: not valid java name */
    /* synthetic */ void m10861x78d3b254() {
        this.knotView.finalStep();
    }

    @android.webkit.JavascriptInterface
    public void onCardSwitchError(final java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10849x5ea74cc(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onCardSwitchLoggedIn(final java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10850xde210eab(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onCardSwitchNativeError(final java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10851x789c76a2(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onCardSwitchSuccess() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10852xf13eb952();
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onElementMessage(final java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10853x3ee8045(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onMerchantTracking(final java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10854xaf3821d3(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onSendWebappError() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10855xdc241599();
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onStartLoading() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10856xb4ca31bb();
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onStopLoading(java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10857xca852891();
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onUpdateBackButtonBehavior(final java.lang.String str) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10858xc7f150ee(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void onUserActionRequired() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10859xb43931d9();
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void sendDataToWebApp(final java.lang.String str, final java.lang.String str2) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10860x1709f651(str, str2);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void storeBreadcrumb(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.lambda$storeBreadcrumb$13(str, str2, str3);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void userIsLoggedIn() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.JSInterfaceObject$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.JSInterfaceObject.this.m10861x78d3b254();
            }
        });
    }
}
