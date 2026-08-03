package com.facebook.appevents;

/* compiled from: AppEventsLoggerImpl.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001:B%\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J;\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J.\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J)\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010%J\u0088\u0001\u0010&\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00100\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u00101\u001a\u0004\u0018\u00010\u00052\b\u00102\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u00104\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J&\u00104\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J,\u00104\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0013J$\u00105\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u00010\u0005J'\u00109\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010%R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl;", "", "context", "Landroid/content/Context;", "applicationId", "", "accessToken", "Lcom/facebook/AccessToken;", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "activityName", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "getApplicationId", "()Ljava/lang/String;", "contextName", "flush", "", "isValidForAccessToken", "", "logEvent", com.ironsource.X3.i.j0, "parameters", "Landroid/os/Bundle;", "valueToSum", "", "isImplicitlyLogged", "currentSessionId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;)V", "logEventFromSE", "buttonText", "logEventImplicitly", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logProductItem", "itemID", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "condition", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "description", "imageLink", "link", "title", "priceAmount", "gtin", "mpn", "brand", "logPurchase", "logPurchaseImplicitly", "logPushNotificationOpen", "payload", "action", "logSdkEvent", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsLoggerImpl {
    private static final java.lang.String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
    public static final java.lang.String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
    private static final java.lang.String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
    private static final java.lang.String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final java.lang.String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
    private static final java.lang.String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
    private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.AppEventsLoggerImpl.Companion INSTANCE = new com.facebook.appevents.AppEventsLoggerImpl.Companion(null);
    private static final java.lang.String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
    private static final java.lang.String PUSH_PAYLOAD_KEY = "fb_push_payload";
    private static final java.lang.String TAG;
    private static java.lang.String anonymousAppDeviceGUID;
    private static java.util.concurrent.ScheduledThreadPoolExecutor backgroundExecutor;
    private static com.facebook.appevents.AppEventsLogger.FlushBehavior flushBehaviorField;
    private static boolean isActivateAppEventRequested;
    private static java.lang.String pushNotificationsRegistrationIdField;
    private static final java.lang.Object staticLock;
    private com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId;
    private final java.lang.String contextName;

    @kotlin.jvm.JvmStatic
    public static final void activateApp(android.app.Application application, java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.activateApp(application, str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void augmentWebView(android.webkit.WebView webView, android.content.Context context) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.augmentWebView(webView, context);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void functionDEPRECATED(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.functionDEPRECATED(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.concurrent.Executor getAnalyticsExecutor() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getAnalyticsExecutor();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAnonymousAppDeviceGUID(android.content.Context context) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getAnonymousAppDeviceGUID(context);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger.FlushBehavior getFlushBehavior() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getFlushBehavior();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getInstallReferrer() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getInstallReferrer();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getPushNotificationsRegistrationId() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getPushNotificationsRegistrationId();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void initializeLib(android.content.Context context, java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.initializeLib(context, str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void onContextStop() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.onContextStop();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setFlushBehavior(com.facebook.appevents.AppEventsLogger.FlushBehavior flushBehavior) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setFlushBehavior(flushBehavior);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setInstallReferrer(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setInstallReferrer(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setPushNotificationsRegistrationId(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setPushNotificationsRegistrationId(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public AppEventsLoggerImpl(java.lang.String activityName, java.lang.String str, com.facebook.AccessToken accessToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        this.contextName = activityName;
        accessToken = accessToken == null ? com.facebook.AccessToken.INSTANCE.getCurrentAccessToken() : accessToken;
        if (accessToken == null || accessToken.isExpired() || !(str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, accessToken.getApplicationId()))) {
            if (str == null) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                str = com.facebook.internal.Utility.getMetadataApplicationId(com.facebook.FacebookSdk.getApplicationContext());
            }
            if (str != null) {
                this.accessTokenAppId = new com.facebook.appevents.AccessTokenAppIdPair(null, str);
            } else {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
        } else {
            this.accessTokenAppId = new com.facebook.appevents.AccessTokenAppIdPair(accessToken);
        }
        INSTANCE.initializeTimersIfNeeded();
    }

    public static final /* synthetic */ java.lang.String access$getAnonymousAppDeviceGUID$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return anonymousAppDeviceGUID;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ java.util.concurrent.ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return backgroundExecutor;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ com.facebook.appevents.AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return flushBehaviorField;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$getPushNotificationsRegistrationIdField$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return pushNotificationsRegistrationIdField;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.Object access$getStaticLock$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return staticLock;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$getTAG$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isActivateAppEventRequested$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return false;
        }
        try {
            return isActivateAppEventRequested;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
            return false;
        }
    }

    public static final /* synthetic */ void access$setActivateAppEventRequested$cp(boolean z) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            isActivateAppEventRequested = z;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setAnonymousAppDeviceGUID$cp(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            anonymousAppDeviceGUID = str;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setBackgroundExecutor$cp(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            backgroundExecutor = scheduledThreadPoolExecutor;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setFlushBehaviorField$cp(com.facebook.appevents.AppEventsLogger.FlushBehavior flushBehavior) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            flushBehaviorField = flushBehavior;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setPushNotificationsRegistrationIdField$cp(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            pushNotificationsRegistrationIdField = str;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppEventsLoggerImpl(android.content.Context context, java.lang.String str, com.facebook.AccessToken accessToken) {
        this(com.facebook.internal.Utility.getActivityName(context), str, accessToken);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
    }

    public final void logEvent(java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent(eventName, (android.os.Bundle) null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logEvent$default(com.facebook.appevents.AppEventsLoggerImpl appEventsLoggerImpl, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public final void logEvent(java.lang.String eventName, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
            logEvent(eventName, null, parameters, false, com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentSessionGuid());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(java.lang.String eventName, double valueToSum) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent(eventName, valueToSum, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(java.lang.String eventName, double valueToSum, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.Double valueOf = java.lang.Double.valueOf(valueToSum);
            com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
            logEvent(eventName, valueOf, parameters, false, com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentSessionGuid());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventFromSE(java.lang.String eventName, java.lang.String buttonText) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", buttonText);
            logEvent(eventName, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(java.math.BigDecimal purchaseAmount, java.util.Currency currency) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase(purchaseAmount, currency, null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static /* synthetic */ void logPurchase$default(com.facebook.appevents.AppEventsLoggerImpl appEventsLoggerImpl, java.math.BigDecimal bigDecimal, java.util.Currency currency, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventsLoggerImpl.class);
        }
    }

    public final void logPurchase(java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = com.facebook.appevents.internal.AutomaticAnalyticsLogger.INSTANCE;
            if (com.facebook.appevents.internal.AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                android.util.Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
            }
            logPurchase(purchaseAmount, currency, parameters, false);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchaseImplicitly(java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase(purchaseAmount, currency, parameters, true);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters, boolean isImplicitlyLogged) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (purchaseAmount == null) {
                INSTANCE.notifyDeveloperError("purchaseAmount cannot be null");
                return;
            }
            if (currency != null) {
                if (parameters == null) {
                    parameters = new android.os.Bundle();
                }
                android.os.Bundle bundle = parameters;
                bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                java.lang.Double valueOf = java.lang.Double.valueOf(purchaseAmount.doubleValue());
                com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                logEvent(com.facebook.appevents.AppEventsConstants.EVENT_NAME_PURCHASED, valueOf, bundle, isImplicitlyLogged, com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentSessionGuid());
                INSTANCE.eagerFlush();
                return;
            }
            INSTANCE.notifyDeveloperError("currency cannot be null");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPushNotificationOpen(android.os.Bundle payload, java.lang.String action) {
        java.lang.String str;
        java.lang.String string;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                string = payload.getString(PUSH_PAYLOAD_KEY);
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            } catch (org.json.JSONException unused) {
                str = null;
            }
            if (com.facebook.internal.Utility.isNullOrEmpty(string)) {
                return;
            }
            str = new org.json.JSONObject(string).getString("campaign");
            if (str == null) {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(APP_EVENT_PUSH_PARAMETER_CAMPAIGN, str);
            if (action != null) {
                bundle.putString(APP_EVENT_PUSH_PARAMETER_ACTION, action);
            }
            logEvent(APP_EVENT_NAME_PUSH_OPENED, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logProductItem(java.lang.String itemID, com.facebook.appevents.AppEventsLogger.ProductAvailability availability, com.facebook.appevents.AppEventsLogger.ProductCondition condition, java.lang.String description, java.lang.String imageLink, java.lang.String link, java.lang.String title, java.math.BigDecimal priceAmount, java.util.Currency currency, java.lang.String gtin, java.lang.String mpn, java.lang.String brand, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (itemID == null) {
                INSTANCE.notifyDeveloperError("itemID cannot be null");
                return;
            }
            if (availability == null) {
                INSTANCE.notifyDeveloperError("availability cannot be null");
                return;
            }
            if (condition == null) {
                INSTANCE.notifyDeveloperError("condition cannot be null");
                return;
            }
            if (description == null) {
                INSTANCE.notifyDeveloperError("description cannot be null");
                return;
            }
            if (imageLink == null) {
                INSTANCE.notifyDeveloperError("imageLink cannot be null");
                return;
            }
            if (link == null) {
                INSTANCE.notifyDeveloperError("link cannot be null");
                return;
            }
            if (title == null) {
                INSTANCE.notifyDeveloperError("title cannot be null");
                return;
            }
            if (priceAmount == null) {
                INSTANCE.notifyDeveloperError("priceAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (gtin != null || mpn != null || brand != null) {
                if (parameters == null) {
                    parameters = new android.os.Bundle();
                }
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_ITEM_ID, itemID);
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_AVAILABILITY, availability.name());
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_CONDITION, condition.name());
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_DESCRIPTION, description);
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_IMAGE_LINK, imageLink);
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_LINK, link);
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_TITLE, title);
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_PRICE_AMOUNT, priceAmount.setScale(3, 4).toString());
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_PRICE_CURRENCY, currency.getCurrencyCode());
                if (gtin != null) {
                    parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_GTIN, gtin);
                }
                if (mpn != null) {
                    parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_MPN, mpn);
                }
                if (brand != null) {
                    parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_BRAND, brand);
                }
                logEvent(com.facebook.appevents.AppEventsConstants.EVENT_NAME_PRODUCT_CATALOG_UPDATE, parameters);
                INSTANCE.eagerFlush();
                return;
            }
            INSTANCE.notifyDeveloperError("Either gtin, mpn or brand is required");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void flush() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.AppEventQueue appEventQueue = com.facebook.appevents.AppEventQueue.INSTANCE;
            com.facebook.appevents.AppEventQueue.flush(com.facebook.appevents.FlushReason.EXPLICIT);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final boolean isValidForAccessToken(com.facebook.AccessToken accessToken) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accessTokenAppId, new com.facebook.appevents.AccessTokenAppIdPair(accessToken));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final void logSdkEvent(java.lang.String eventName, java.lang.Double valueToSum, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (!kotlin.text.StringsKt.startsWith$default(eventName, ACCOUNT_KIT_EVENT_NAME_PREFIX, false, 2, (java.lang.Object) null)) {
                android.util.Log.e(TAG, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
                return;
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
                com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                logEvent(eventName, valueToSum, parameters, true, com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentSessionGuid());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final java.lang.String getApplicationId() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.accessTokenAppId.getApplicationId();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void logEventImplicitly(java.lang.String eventName, java.lang.Double valueToSum, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
            logEvent(eventName, valueToSum, parameters, true, com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentSessionGuid());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventImplicitly(java.lang.String eventName, java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (purchaseAmount == null || currency == null) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, "purchaseAmount and currency cannot be null");
                return;
            }
            if (parameters == null) {
                parameters = new android.os.Bundle();
            }
            android.os.Bundle bundle = parameters;
            bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
            java.lang.Double valueOf = java.lang.Double.valueOf(purchaseAmount.doubleValue());
            com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
            logEvent(eventName, valueOf, bundle, true, com.facebook.appevents.internal.ActivityLifecycleTracker.getCurrentSessionGuid());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(java.lang.String eventName, java.lang.Double valueToSum, android.os.Bundle parameters, boolean isImplicitlyLogged, java.util.UUID currentSessionId) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_KILLSWITCH, com.facebook.FacebookSdk.getApplicationId(), false)) {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                return;
            }
            com.facebook.appevents.integrity.BlocklistEventsManager blocklistEventsManager = com.facebook.appevents.integrity.BlocklistEventsManager.INSTANCE;
            if (com.facebook.appevents.integrity.BlocklistEventsManager.isInBlocklist(eventName)) {
                return;
            }
            try {
                com.facebook.appevents.integrity.MACARuleMatchingManager mACARuleMatchingManager = com.facebook.appevents.integrity.MACARuleMatchingManager.INSTANCE;
                com.facebook.appevents.integrity.MACARuleMatchingManager.processParameters(parameters, eventName);
                com.facebook.appevents.integrity.ProtectedModeManager protectedModeManager = com.facebook.appevents.integrity.ProtectedModeManager.INSTANCE;
                com.facebook.appevents.integrity.ProtectedModeManager.processParametersForProtectedMode(parameters);
                java.lang.String str = this.contextName;
                com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                INSTANCE.logEvent(new com.facebook.appevents.AppEvent(str, eventName, valueToSum, parameters, isImplicitlyLogged, com.facebook.appevents.internal.ActivityLifecycleTracker.isInBackground(), currentSessionId), this.accessTokenAppId);
            } catch (com.facebook.FacebookException e) {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            } catch (org.json.JSONException e2) {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: AppEventsLoggerImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0006\u0010\"\u001a\u00020\u0019J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0004H\u0007J\b\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010(\u001a\u00020\u0013H\u0007J\n\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010*\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010+\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010,\u001a\u00020\u0019H\u0002J\u0018\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0004H\u0002J\b\u00104\u001a\u00020\u0019H\u0007J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0013H\u0007J\u0012\u00107\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u00109\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl$Companion;", "", "()V", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "isActivateAppEventRequested", "", "pushNotificationsRegistrationIdField", "staticLock", "activateApp", "", "application", "Landroid/app/Application;", "applicationId", "augmentWebView", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "eagerFlush", "functionDEPRECATED", "extraMsg", "getAnalyticsExecutor", "Ljava/util/concurrent/Executor;", "getAnonymousAppDeviceGUID", "getFlushBehavior", "getInstallReferrer", "getPushNotificationsRegistrationId", "initializeLib", "initializeTimersIfNeeded", "logEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AppEvent;", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "notifyDeveloperError", "message", "onContextStop", "setFlushBehavior", "flushBehavior", "setInstallReferrer", com.adjust.sdk.Constants.REFERRER, "setPushNotificationsRegistrationId", "registrationId", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger.FlushBehavior getFlushBehavior() {
            com.facebook.appevents.AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp;
            synchronized (com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getFlushBehaviorField$cp = com.facebook.appevents.AppEventsLoggerImpl.access$getFlushBehaviorField$cp();
            }
            return access$getFlushBehaviorField$cp;
        }

        @kotlin.jvm.JvmStatic
        public final void setFlushBehavior(com.facebook.appevents.AppEventsLogger.FlushBehavior flushBehavior) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            synchronized (com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()) {
                com.facebook.appevents.AppEventsLoggerImpl.Companion companion = com.facebook.appevents.AppEventsLoggerImpl.INSTANCE;
                com.facebook.appevents.AppEventsLoggerImpl.access$setFlushBehaviorField$cp(flushBehavior);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getPushNotificationsRegistrationId() {
            java.lang.String access$getPushNotificationsRegistrationIdField$cp;
            synchronized (com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getPushNotificationsRegistrationIdField$cp = com.facebook.appevents.AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
            }
            return access$getPushNotificationsRegistrationIdField$cp;
        }

        @kotlin.jvm.JvmStatic
        public final void setPushNotificationsRegistrationId(java.lang.String registrationId) {
            synchronized (com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.stringsEqualOrEmpty(com.facebook.appevents.AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp(), registrationId)) {
                    com.facebook.appevents.AppEventsLoggerImpl.Companion companion = com.facebook.appevents.AppEventsLoggerImpl.INSTANCE;
                    com.facebook.appevents.AppEventsLoggerImpl.access$setPushNotificationsRegistrationIdField$cp(registrationId);
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    com.facebook.appevents.AppEventsLoggerImpl appEventsLoggerImpl = new com.facebook.appevents.AppEventsLoggerImpl(com.facebook.FacebookSdk.getApplicationContext(), (java.lang.String) null, (com.facebook.AccessToken) null);
                    appEventsLoggerImpl.logEvent(com.facebook.appevents.AppEventsConstants.EVENT_NAME_PUSH_TOKEN_OBTAINED);
                    if (com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getFlushBehavior() != com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                        appEventsLoggerImpl.flush();
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.jvm.JvmStatic
        public final void activateApp(android.app.Application application, java.lang.String applicationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (!com.facebook.FacebookSdk.isInitialized()) {
                throw new com.facebook.FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            com.facebook.appevents.AnalyticsUserIDStore analyticsUserIDStore = com.facebook.appevents.AnalyticsUserIDStore.INSTANCE;
            com.facebook.appevents.AnalyticsUserIDStore.initStore();
            com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
            com.facebook.appevents.UserDataStore.initStore();
            if (applicationId == null) {
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                applicationId = com.facebook.FacebookSdk.getApplicationId();
            }
            com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.publishInstallAsync(application, applicationId);
            com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
            com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking(application, applicationId);
        }

        @kotlin.jvm.JvmStatic
        public final void functionDEPRECATED(java.lang.String extraMsg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraMsg, "extraMsg");
            android.util.Log.w(com.facebook.appevents.AppEventsLoggerImpl.access$getTAG$cp(), kotlin.jvm.internal.Intrinsics.stringPlus("This function is deprecated. ", extraMsg));
        }

        @kotlin.jvm.JvmStatic
        public final void initializeLib(final android.content.Context context, java.lang.String applicationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
                final com.facebook.appevents.AppEventsLoggerImpl appEventsLoggerImpl = new com.facebook.appevents.AppEventsLoggerImpl(context, applicationId, (com.facebook.AccessToken) null);
                java.util.concurrent.ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (access$getBackgroundExecutor$cp == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                access$getBackgroundExecutor$cp.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventsLoggerImpl$Companion$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.AppEventsLoggerImpl.Companion.m5087initializeLib$lambda4(context, appEventsLoggerImpl);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: initializeLib$lambda-4, reason: not valid java name */
        public static final void m5087initializeLib$lambda4(android.content.Context context, com.facebook.appevents.AppEventsLoggerImpl logger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "$logger");
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            java.lang.String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                java.lang.String str = strArr[i];
                java.lang.String str2 = strArr2[i];
                try {
                    java.lang.Class.forName(str);
                    bundle.putInt(str2, 1);
                    i2 |= 1 << i;
                } catch (java.lang.ClassNotFoundException unused) {
                }
                if (i3 > 10) {
                    break;
                } else {
                    i = i3;
                }
            }
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                logger.logEventImplicitly(com.facebook.internal.AnalyticsEvents.EVENT_SDK_INITIALIZE, null, bundle);
            }
        }

        @kotlin.jvm.JvmStatic
        public final void onContextStop() {
            com.facebook.appevents.AppEventQueue appEventQueue = com.facebook.appevents.AppEventQueue.INSTANCE;
            com.facebook.appevents.AppEventQueue.persistToDisk();
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getInstallReferrer() {
            com.facebook.internal.InstallReferrerUtil installReferrerUtil = com.facebook.internal.InstallReferrerUtil.INSTANCE;
            com.facebook.internal.InstallReferrerUtil.tryUpdateReferrerInfo(new com.facebook.internal.InstallReferrerUtil.Callback() { // from class: com.facebook.appevents.AppEventsLoggerImpl$Companion$getInstallReferrer$1
                @Override // com.facebook.internal.InstallReferrerUtil.Callback
                public void onReceiveReferrerUrl(java.lang.String s) {
                    com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.setInstallReferrer(s);
                }
            });
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            return com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(com.adjust.sdk.Constants.INSTALL_REFERRER, null);
        }

        @kotlin.jvm.JvmStatic
        public final void setInstallReferrer(java.lang.String referrer) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (referrer != null) {
                sharedPreferences.edit().putString(com.adjust.sdk.Constants.INSTALL_REFERRER, referrer).apply();
            }
        }

        @kotlin.jvm.JvmStatic
        public final void augmentWebView(android.webkit.WebView webView, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            java.lang.Object[] array = kotlin.text.StringsKt.split$default((java.lang.CharSequence) RELEASE, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            if (array != null) {
                java.lang.String[] strArr = (java.lang.String[]) array;
                int parseInt = (strArr.length == 0) ^ true ? java.lang.Integer.parseInt(strArr[0]) : 0;
                int parseInt2 = strArr.length > 1 ? java.lang.Integer.parseInt(strArr[1]) : 0;
                if (parseInt < 4 || (parseInt == 4 && parseInt2 <= 1)) {
                    com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.DEVELOPER_ERRORS, com.facebook.appevents.AppEventsLoggerImpl.access$getTAG$cp(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
                    return;
                }
                com.facebook.appevents.FacebookSDKJSInterface facebookSDKJSInterface = new com.facebook.appevents.FacebookSDKJSInterface(context);
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                webView.addJavascriptInterface(facebookSDKJSInterface, kotlin.jvm.internal.Intrinsics.stringPlus("fbmq_", com.facebook.FacebookSdk.getApplicationId()));
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initializeTimersIfNeeded() {
            synchronized (com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()) {
                if (com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp() != null) {
                    return;
                }
                com.facebook.appevents.AppEventsLoggerImpl.Companion companion = com.facebook.appevents.AppEventsLoggerImpl.INSTANCE;
                com.facebook.appevents.AppEventsLoggerImpl.access$setBackgroundExecutor$cp(new java.util.concurrent.ScheduledThreadPoolExecutor(1));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventsLoggerImpl$Companion$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.AppEventsLoggerImpl.Companion.m5088initializeTimersIfNeeded$lambda6();
                    }
                };
                java.util.concurrent.ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (access$getBackgroundExecutor$cp == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                access$getBackgroundExecutor$cp.scheduleAtFixedRate(runnable, 0L, 86400L, java.util.concurrent.TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: initializeTimersIfNeeded$lambda-6, reason: not valid java name */
        public static final void m5088initializeTimersIfNeeded$lambda6() {
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
            com.facebook.appevents.AppEventQueue appEventQueue = com.facebook.appevents.AppEventQueue.INSTANCE;
            java.util.Iterator<com.facebook.appevents.AccessTokenAppIdPair> it = com.facebook.appevents.AppEventQueue.getKeySet().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            for (java.lang.String str : hashSet) {
                com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
                com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(str, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(com.facebook.appevents.AppEvent event, com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId) {
            com.facebook.appevents.AppEventQueue appEventQueue = com.facebook.appevents.AppEventQueue.INSTANCE;
            com.facebook.appevents.AppEventQueue.add(accessTokenAppId, event);
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing)) {
                com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager onDeviceProcessingManager = com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.INSTANCE;
                if (com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                    com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager onDeviceProcessingManager2 = com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.INSTANCE;
                    com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.sendCustomEventAsync(accessTokenAppId.getApplicationId(), event);
                }
            }
            if (event.getIsImplicit() || com.facebook.appevents.AppEventsLoggerImpl.access$isActivateAppEventRequested$cp()) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event.getName(), com.facebook.appevents.AppEventsConstants.EVENT_NAME_ACTIVATED_APP)) {
                com.facebook.appevents.AppEventsLoggerImpl.access$setActivateAppEventRequested$cp(true);
            } else {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                com.facebook.appevents.AppEventQueue appEventQueue = com.facebook.appevents.AppEventQueue.INSTANCE;
                com.facebook.appevents.AppEventQueue.flush(com.facebook.appevents.FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notifyDeveloperError(java.lang.String message) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", message);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.Executor getAnalyticsExecutor() {
            if (com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp() == null) {
                initializeTimersIfNeeded();
            }
            java.util.concurrent.ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
            if (access$getBackgroundExecutor$cp != null) {
                return access$getBackgroundExecutor$cp;
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getAnonymousAppDeviceGUID(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (com.facebook.appevents.AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                synchronized (com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()) {
                    if (com.facebook.appevents.AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        com.facebook.appevents.AppEventsLoggerImpl.Companion companion = com.facebook.appevents.AppEventsLoggerImpl.INSTANCE;
                        com.facebook.appevents.AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(sharedPreferences.getString("anonymousAppDeviceGUID", null));
                        if (com.facebook.appevents.AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                            com.facebook.appevents.AppEventsLoggerImpl.Companion companion2 = com.facebook.appevents.AppEventsLoggerImpl.INSTANCE;
                            java.util.UUID randomUUID = java.util.UUID.randomUUID();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                            com.facebook.appevents.AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(kotlin.jvm.internal.Intrinsics.stringPlus("XZ", randomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", com.facebook.appevents.AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp()).apply();
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            java.lang.String access$getAnonymousAppDeviceGUID$cp = com.facebook.appevents.AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp();
            if (access$getAnonymousAppDeviceGUID$cp != null) {
                return access$getAnonymousAppDeviceGUID$cp;
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
    }

    static {
        java.lang.String canonicalName = com.facebook.appevents.AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        TAG = canonicalName;
        flushBehaviorField = com.facebook.appevents.AppEventsLogger.FlushBehavior.AUTO;
        staticLock = new java.lang.Object();
    }
}
