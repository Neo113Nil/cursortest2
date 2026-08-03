package com.facebook.appevents;

/* compiled from: InternalAppEventsLogger.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0000\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J.\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J)\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001fJ$\u0010 \u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "accessToken", "Lcom/facebook/AccessToken;", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "loggerImpl", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "(Lcom/facebook/appevents/AppEventsLoggerImpl;)V", "flush", "", "logChangedSettingsEvent", "parameters", "Landroid/os/Bundle;", "logEvent", com.ironsource.X3.i.j0, "valueToSum", "", "logEventFromSE", "buttonText", "logEventImplicitly", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logPurchaseImplicitly", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InternalAppEventsLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.InternalAppEventsLogger.Companion INSTANCE = new com.facebook.appevents.InternalAppEventsLogger.Companion(null);
    private final com.facebook.appevents.AppEventsLoggerImpl loggerImpl;

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.InternalAppEventsLogger createInstance(android.content.Context context) {
        return INSTANCE.createInstance(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.InternalAppEventsLogger createInstance(android.content.Context context, java.lang.String str) {
        return INSTANCE.createInstance(context, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.InternalAppEventsLogger createInstance(java.lang.String str, java.lang.String str2, com.facebook.AccessToken accessToken) {
        return INSTANCE.createInstance(str, str2, accessToken);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.concurrent.Executor getAnalyticsExecutor() {
        return INSTANCE.getAnalyticsExecutor();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.AppEventsLogger.FlushBehavior getFlushBehavior() {
        return INSTANCE.getFlushBehavior();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getPushNotificationsRegistrationId() {
        return INSTANCE.getPushNotificationsRegistrationId();
    }

    @kotlin.jvm.JvmStatic
    public static final void setInternalUserData(java.util.Map<java.lang.String, java.lang.String> map) {
        INSTANCE.setInternalUserData(map);
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserData(android.os.Bundle bundle) {
        INSTANCE.setUserData(bundle);
    }

    public InternalAppEventsLogger(com.facebook.appevents.AppEventsLoggerImpl loggerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.loggerImpl = loggerImpl;
    }

    public InternalAppEventsLogger(android.content.Context context) {
        this(new com.facebook.appevents.AppEventsLoggerImpl(context, (java.lang.String) null, (com.facebook.AccessToken) null));
    }

    public InternalAppEventsLogger(android.content.Context context, java.lang.String str) {
        this(new com.facebook.appevents.AppEventsLoggerImpl(context, str, (com.facebook.AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(java.lang.String activityName, java.lang.String str, com.facebook.AccessToken accessToken) {
        this(new com.facebook.appevents.AppEventsLoggerImpl(activityName, str, accessToken));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
    }

    public final void logEvent(java.lang.String eventName, android.os.Bundle parameters) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(eventName, parameters);
        }
    }

    public final void logEvent(java.lang.String eventName, double valueToSum, android.os.Bundle parameters) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(eventName, valueToSum, parameters);
        }
    }

    public final void logPurchaseImplicitly(java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logPurchaseImplicitly(purchaseAmount, currency, parameters);
        }
    }

    public final void logEventFromSE(java.lang.String eventName, java.lang.String buttonText) {
        this.loggerImpl.logEventFromSE(eventName, buttonText);
    }

    public final void logEventImplicitly(java.lang.String eventName, java.math.BigDecimal purchaseAmount, java.util.Currency currency, android.os.Bundle parameters) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, purchaseAmount, currency, parameters);
        }
    }

    public final void logEventImplicitly(java.lang.String eventName) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, null, null);
        }
    }

    public final void logEventImplicitly(java.lang.String eventName, java.lang.Double valueToSum, android.os.Bundle parameters) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, valueToSum, parameters);
        }
    }

    public final void logEventImplicitly(java.lang.String eventName, android.os.Bundle parameters) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, null, parameters);
        }
    }

    public final void logChangedSettingsEvent(android.os.Bundle parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (!((parameters.getInt("previous") & 2) != 0)) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (!com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
                return;
            }
        }
        this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, parameters);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    /* compiled from: InternalAppEventsLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger$Companion;", "", "()V", "createInstance", "Lcom/facebook/appevents/InternalAppEventsLogger;", "context", "Landroid/content/Context;", "applicationId", "", "activityName", "accessToken", "Lcom/facebook/AccessToken;", "getAnalyticsExecutor", "Ljava/util/concurrent/Executor;", "getFlushBehavior", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getPushNotificationsRegistrationId", "setInternalUserData", "", "ud", "", "setUserData", "userData", "Landroid/os/Bundle;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.InternalAppEventsLogger createInstance(android.content.Context context) {
            return createInstance$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.AppEventsLogger.FlushBehavior getFlushBehavior() {
            return com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.Executor getAnalyticsExecutor() {
            return com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getAnalyticsExecutor();
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getPushNotificationsRegistrationId() {
            return com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getPushNotificationsRegistrationId();
        }

        @kotlin.jvm.JvmStatic
        public final void setUserData(android.os.Bundle userData) {
            com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
            com.facebook.appevents.UserDataStore.setUserDataAndHash(userData);
        }

        @kotlin.jvm.JvmStatic
        public final void setInternalUserData(java.util.Map<java.lang.String, java.lang.String> ud) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ud, "ud");
            com.facebook.appevents.UserDataStore userDataStore = com.facebook.appevents.UserDataStore.INSTANCE;
            com.facebook.appevents.UserDataStore.setInternalUd(ud);
        }

        public static /* synthetic */ com.facebook.appevents.InternalAppEventsLogger createInstance$default(com.facebook.appevents.InternalAppEventsLogger.Companion companion, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.InternalAppEventsLogger createInstance(android.content.Context context, java.lang.String applicationId) {
            return new com.facebook.appevents.InternalAppEventsLogger(context, applicationId);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.InternalAppEventsLogger createInstance(java.lang.String activityName, java.lang.String applicationId, com.facebook.AccessToken accessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new com.facebook.appevents.InternalAppEventsLogger(activityName, applicationId, accessToken);
        }
    }
}
