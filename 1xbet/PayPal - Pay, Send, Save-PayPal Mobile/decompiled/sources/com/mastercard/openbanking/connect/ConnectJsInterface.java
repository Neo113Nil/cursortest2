package com.mastercard.openbanking.connect;

/* loaded from: classes9.dex */
class ConnectJsInterface {
    private android.app.Activity activity;
    private com.mastercard.openbanking.connect.EventHandler eventHandler;
    private com.mastercard.openbanking.connect.Connect mConnect;
    private boolean mCustomTabStarted = false;

    public ConnectJsInterface(android.app.Activity activity, com.mastercard.openbanking.connect.EventHandler eventHandler) {
        this.activity = activity;
        this.mConnect = (com.mastercard.openbanking.connect.Connect) activity;
        this.eventHandler = eventHandler;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @android.webkit.JavascriptInterface
    public void postMessage(java.lang.String str) {
        char c;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("type");
            string.hashCode();
            switch (string.hashCode()) {
                case -2075550316:
                    if (string.equals("closePopup")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1367724422:
                    if (string.equals(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96393:
                    if (string.equals("ack")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 116079:
                    if (string.equals("url")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3089282:
                    if (string.equals(com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.TestTagDone)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3599307:
                    if (string.equals("user")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (string.equals("error")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 108704329:
                    if (string.equals("route")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    closeCustomTab();
                    break;
                case 1:
                    this.eventHandler.onCancel(getEventData(jSONObject));
                    finishActivity();
                    break;
                case 2:
                    this.mConnect.stopPingTimer();
                    break;
                case 3:
                    try {
                        openLinkInCustomTab(jSONObject.getString("url"));
                        break;
                    } catch (org.json.JSONException unused) {
                        return;
                    }
                case 4:
                    this.eventHandler.onDone(getEventData(jSONObject));
                    finishActivity();
                    break;
                case 5:
                    this.eventHandler.onUser(getEventData(jSONObject));
                    break;
                case 6:
                    this.eventHandler.onError(getEventData(jSONObject));
                    finishActivity();
                    break;
                case 7:
                    this.eventHandler.onRoute(getEventData(jSONObject));
                    break;
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    private void finishActivity() {
        this.activity.finish();
    }

    private org.json.JSONObject getEventData(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (jSONObject.has(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            return jSONObject.getJSONObject(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (jSONObject.has("query")) {
            return jSONObject.getJSONObject("query");
        }
        return jSONObject2;
    }

    public void openLinkInCustomTab(java.lang.String str) {
        android.content.Intent intent = new androidx.browser.customtabs.CustomTabsIntent.Builder().build().intent;
        intent.setData(android.net.Uri.parse(str));
        this.mCustomTabStarted = true;
        android.app.Activity activity = this.activity;
        activity.startActivity(com.mastercard.openbanking.connect.CustomTabsActivityManager.createStartIntent(activity, intent, activity));
    }

    public void closeCustomTab() {
        if (this.mCustomTabStarted) {
            this.mCustomTabStarted = false;
            android.app.Activity activity = this.activity;
            activity.startActivity(com.mastercard.openbanking.connect.CustomTabsActivityManager.createDismissIntent(activity));
        }
    }
}
