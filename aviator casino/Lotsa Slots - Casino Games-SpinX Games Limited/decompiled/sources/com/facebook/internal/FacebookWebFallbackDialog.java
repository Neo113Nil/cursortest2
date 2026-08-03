package com.facebook.internal;

/* compiled from: FacebookWebFallbackDialog.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/FacebookWebFallbackDialog;", "Lcom/facebook/internal/WebDialog;", "context", "Landroid/content/Context;", "url", "", "expectedRedirectUrl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "waitingForDialogToClose", "", "cancel", "", "parseResponseUri", "Landroid/os/Bundle;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookWebFallbackDialog extends com.facebook.internal.WebDialog {
    private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
    private boolean waitingForDialogToClose;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.FacebookWebFallbackDialog.Companion INSTANCE = new com.facebook.internal.FacebookWebFallbackDialog.Companion(null);
    private static final java.lang.String TAG = com.facebook.internal.FacebookWebFallbackDialog.class.getName();

    public /* synthetic */ FacebookWebFallbackDialog(android.content.Context context, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.FacebookWebFallbackDialog newInstance(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return INSTANCE.newInstance(context, str, str2);
    }

    private FacebookWebFallbackDialog(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context, str);
        setExpectedRedirectUrl(str2);
    }

    @Override // com.facebook.internal.WebDialog
    public android.os.Bundle parseResponseUri(java.lang.String url) {
        android.net.Uri parse = android.net.Uri.parse(url);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        android.os.Bundle parseUrlQueryString = com.facebook.internal.Utility.parseUrlQueryString(parse.getQuery());
        java.lang.String string = parseUrlQueryString.getString(com.facebook.internal.ServerProtocol.FALLBACK_DIALOG_PARAM_BRIDGE_ARGS);
        parseUrlQueryString.remove(com.facebook.internal.ServerProtocol.FALLBACK_DIALOG_PARAM_BRIDGE_ARGS);
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isNullOrEmpty(string)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                com.facebook.internal.BundleJSONConverter bundleJSONConverter = com.facebook.internal.BundleJSONConverter.INSTANCE;
                parseUrlQueryString.putBundle(com.facebook.internal.NativeProtocol.EXTRA_PROTOCOL_BRIDGE_ARGS, com.facebook.internal.BundleJSONConverter.convertToBundle(jSONObject));
            } catch (org.json.JSONException e) {
                com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, "Unable to parse bridge_args JSON", e);
            }
        }
        java.lang.String string2 = parseUrlQueryString.getString(com.facebook.internal.ServerProtocol.FALLBACK_DIALOG_PARAM_METHOD_RESULTS);
        parseUrlQueryString.remove(com.facebook.internal.ServerProtocol.FALLBACK_DIALOG_PARAM_METHOD_RESULTS);
        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isNullOrEmpty(string2)) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(string2);
                com.facebook.internal.BundleJSONConverter bundleJSONConverter2 = com.facebook.internal.BundleJSONConverter.INSTANCE;
                parseUrlQueryString.putBundle(com.facebook.internal.NativeProtocol.EXTRA_PROTOCOL_METHOD_RESULTS, com.facebook.internal.BundleJSONConverter.convertToBundle(jSONObject2));
            } catch (org.json.JSONException e2) {
                com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, "Unable to parse bridge_args JSON", e2);
            }
        }
        parseUrlQueryString.remove("version");
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        parseUrlQueryString.putInt(com.facebook.internal.NativeProtocol.EXTRA_PROTOCOL_VERSION, com.facebook.internal.NativeProtocol.getLatestKnownVersion());
        return parseUrlQueryString;
    }

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        android.webkit.WebView webView = getWebView();
        if (!getIsPageFinished() || getIsListenerCalled() || webView == null || !webView.isShown()) {
            super.cancel();
        } else {
            if (this.waitingForDialogToClose) {
                return;
            }
            this.waitingForDialogToClose = true;
            webView.loadUrl(kotlin.jvm.internal.Intrinsics.stringPlus("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.internal.FacebookWebFallbackDialog$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.internal.FacebookWebFallbackDialog.m5175cancel$lambda0(com.facebook.internal.FacebookWebFallbackDialog.this);
                }
            }, androidx.compose.foundation.BasicTooltipDefaults.TooltipDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancel$lambda-0, reason: not valid java name */
    public static final void m5175cancel$lambda0(com.facebook.internal.FacebookWebFallbackDialog this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    /* compiled from: FacebookWebFallbackDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/FacebookWebFallbackDialog$Companion;", "", "()V", "OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS", "", "TAG", "", "kotlin.jvm.PlatformType", "newInstance", "Lcom/facebook/internal/FacebookWebFallbackDialog;", "context", "Landroid/content/Context;", "url", "expectedRedirectUrl", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.internal.FacebookWebFallbackDialog newInstance(android.content.Context context, java.lang.String url, java.lang.String expectedRedirectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
            com.facebook.internal.WebDialog.Companion companion = com.facebook.internal.WebDialog.INSTANCE;
            com.facebook.internal.WebDialog.initDefaultTheme(context);
            return new com.facebook.internal.FacebookWebFallbackDialog(context, url, expectedRedirectUrl, null);
        }
    }
}
