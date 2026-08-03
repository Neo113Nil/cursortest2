package com.facebook.appevents;

/* compiled from: FacebookSDKJSInterface.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J&\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00068GX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "protocol", "", "getProtocol", "()Ljava/lang/String;", "sendEvent", "", "pixelId", com.ironsource.X3.i.j0, "jsonString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookSDKJSInterface {
    private static final java.lang.String PARAMETER_FBSDK_PIXEL_REFERRAL = "_fb_pixel_referral_id";
    private final android.content.Context context;
    private final java.lang.String protocol = "fbmq-0.1";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.FacebookSDKJSInterface.Companion INSTANCE = new com.facebook.appevents.FacebookSDKJSInterface.Companion(null);
    private static final java.lang.String TAG = "FacebookSDKJSInterface";

    public FacebookSDKJSInterface(android.content.Context context) {
        this.context = context;
    }

    public static final /* synthetic */ java.lang.String access$getTAG$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.FacebookSDKJSInterface.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.FacebookSDKJSInterface.class);
            return null;
        }
    }

    @android.webkit.JavascriptInterface
    public final void sendEvent(java.lang.String pixelId, java.lang.String eventName, java.lang.String jsonString) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (pixelId == null) {
                com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.DEVELOPER_ERRORS;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
                return;
            }
            com.facebook.appevents.InternalAppEventsLogger createInstance$default = com.facebook.appevents.InternalAppEventsLogger.Companion.createInstance$default(com.facebook.appevents.InternalAppEventsLogger.INSTANCE, this.context, null, 2, null);
            android.os.Bundle jsonStringToBundle = INSTANCE.jsonStringToBundle(jsonString);
            jsonStringToBundle.putString(PARAMETER_FBSDK_PIXEL_REFERRAL, pixelId);
            createInstance$default.logEvent(eventName, jsonStringToBundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getProtocol() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.protocol;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: FacebookSDKJSInterface.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface$Companion;", "", "()V", "PARAMETER_FBSDK_PIXEL_REFERRAL", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "jsonStringToBundle", "Landroid/os/Bundle;", "jsonString", "jsonToBundle", "jsonObject", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getTAG() {
            return com.facebook.appevents.FacebookSDKJSInterface.access$getTAG$cp();
        }

        private final android.os.Bundle jsonToBundle(org.json.JSONObject jsonObject) throws org.json.JSONException {
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Iterator<java.lang.String> keys = jsonObject.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (next == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                java.lang.String str = next;
                bundle.putString(str, jsonObject.getString(str));
            }
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Bundle jsonStringToBundle(java.lang.String jsonString) {
            try {
                return jsonToBundle(new org.json.JSONObject(jsonString));
            } catch (org.json.JSONException unused) {
                return new android.os.Bundle();
            }
        }
    }
}
