package com.helpshift.chat;

/* loaded from: classes.dex */
public class HSChatToNativeBridge {
    private static final java.lang.String TAG = "ChatNativeBridge";
    private final com.helpshift.chat.HSEventProxy delegate;
    private final com.helpshift.chat.HSChatEventsHandler eventsHandler;
    private boolean isWebSdkConfigLoaded;

    public HSChatToNativeBridge(com.helpshift.chat.HSEventProxy hSEventProxy, com.helpshift.chat.HSChatEventsHandler hSChatEventsHandler) {
        this.delegate = hSEventProxy;
        this.eventsHandler = hSChatEventsHandler;
    }

    @android.webkit.JavascriptInterface
    public void sendEvent(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event from webview.");
        if (this.delegate == null || com.helpshift.util.Utils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                this.delegate.sendEvent(next, com.helpshift.util.JsonUtils.jsonStringToMap(jSONObject.optString(next, "")));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in sending public event", e);
        }
    }

    @android.webkit.JavascriptInterface
    public void widgetToggle(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "webchat widget toggle: " + str);
        if (com.helpshift.util.Utils.isEmpty(str) || !this.isWebSdkConfigLoaded) {
            return;
        }
        try {
            if (new org.json.JSONObject(str).optBoolean(com.helpshift.HelpshiftEvent.DATA_SDK_VISIBLE, false)) {
                this.eventsHandler.onWebchatLoaded();
            } else {
                this.eventsHandler.onWebchatClosed();
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in closing the webchat", e);
        }
    }

    @android.webkit.JavascriptInterface
    public void onWebSdkConfigLoad() {
        com.helpshift.log.HSLogger.d(TAG, "Received event when web sdk config loaded");
        if (this.isWebSdkConfigLoaded) {
            return;
        }
        this.isWebSdkConfigLoaded = true;
        this.eventsHandler.onWebchatLoaded();
    }

    @android.webkit.JavascriptInterface
    public void setIssueExistsFlag(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event to set the issue exist as -" + str);
        this.eventsHandler.setIssueExistsForUser(str);
    }

    @android.webkit.JavascriptInterface
    public void setLocalStorage(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event to set data in local store from webview.");
        this.eventsHandler.onSetLocalStorage(str);
    }

    @android.webkit.JavascriptInterface
    public void removeLocalStorage(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event to remove data from local store from webview.");
        this.eventsHandler.onRemoveLocalStorage(str);
    }

    @android.webkit.JavascriptInterface
    public void getHelpcenterData() {
        com.helpshift.log.HSLogger.d(TAG, "Received event to get Aditional info of HC  from WC from webview.");
        this.eventsHandler.getHelpcenterData();
    }

    @android.webkit.JavascriptInterface
    public void onWebchatError(java.lang.String str) {
        com.helpshift.log.HSLogger.e(TAG, "Received error from webchat, error data: " + str);
        try {
            this.eventsHandler.onWebchatError(new org.json.JSONObject(str).optString("errorMessage", ""));
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to parse error data", e);
            this.eventsHandler.onWebchatError("");
        }
    }

    @android.webkit.JavascriptInterface
    public void sendPushTokenSyncRequestData(java.lang.String str) {
        this.eventsHandler.onReceivePushTokenSyncRequestData(str);
    }

    @android.webkit.JavascriptInterface
    public void onUIConfigChange(java.lang.String str) {
        this.eventsHandler.onUiConfigChange(str);
    }

    @android.webkit.JavascriptInterface
    public void sendUserAuthFailureEvent(java.lang.String str) {
        if (this.delegate == null || com.helpshift.util.Utils.isEmpty(str)) {
            return;
        }
        java.lang.String str2 = "Authentication Failure";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("message")) {
                java.lang.String string = jSONObject.getString("message");
                if (!com.helpshift.util.Utils.isEmpty(string.trim())) {
                    str2 = string;
                }
            }
        } catch (java.lang.Exception unused) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading auth failure event ");
        }
        this.eventsHandler.onUserAuthenticationFailure();
        this.delegate.sendAuthFailureEvent(str2);
    }

    @android.webkit.JavascriptInterface
    public void onRemoveAnonymousUser() {
        this.eventsHandler.onRemoveAnonymousUser();
    }

    @android.webkit.JavascriptInterface
    public void setPollingStatus(java.lang.String str) {
        this.eventsHandler.setPollingStatus(str);
    }

    @android.webkit.JavascriptInterface
    public void setGenericSdkData(java.lang.String str) {
        this.eventsHandler.setGenericSdkData(str);
    }

    @android.webkit.JavascriptInterface
    public void sdkxMigrationLogSynced(boolean z) {
        this.eventsHandler.sdkxMigrationLogSynced(z);
    }

    @android.webkit.JavascriptInterface
    public void requestConversationMetadata(java.lang.String str) {
        this.eventsHandler.requestConversationMetadata(str);
    }

    @android.webkit.JavascriptInterface
    public void webchatJsFileLoaded() {
        this.eventsHandler.webchatJsFileLoaded();
    }

    @android.webkit.JavascriptInterface
    public void wcActionSync(java.lang.String str) {
        this.eventsHandler.wcActionSync(str);
    }
}
