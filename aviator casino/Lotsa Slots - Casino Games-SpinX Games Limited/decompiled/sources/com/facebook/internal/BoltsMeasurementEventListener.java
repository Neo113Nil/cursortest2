package com.facebook.internal;

/* compiled from: BoltsMeasurementEventListener.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\t\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "close", "", "finalize", "onReceive", "intent", "Landroid/content/Intent;", "open", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BoltsMeasurementEventListener extends android.content.BroadcastReceiver {
    private static final java.lang.String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
    private static final java.lang.String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    private static final java.lang.String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    private static com.facebook.internal.BoltsMeasurementEventListener singleton;
    private final android.content.Context applicationContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.BoltsMeasurementEventListener.Companion INSTANCE = new com.facebook.internal.BoltsMeasurementEventListener.Companion(null);
    private static final java.lang.String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";

    public /* synthetic */ BoltsMeasurementEventListener(android.content.Context context, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.BoltsMeasurementEventListener getInstance(android.content.Context context) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return INSTANCE.getInstance(context);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return MEASUREMENT_EVENT_NOTIFICATION_NAME;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ com.facebook.internal.BoltsMeasurementEventListener access$getSingleton$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return singleton;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$open(com.facebook.internal.BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.open();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.BoltsMeasurementEventListener.class);
        }
    }

    public static final /* synthetic */ void access$setSingleton$cp(com.facebook.internal.BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            singleton = boltsMeasurementEventListener;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.BoltsMeasurementEventListener.class);
        }
    }

    private BoltsMeasurementEventListener(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    /* compiled from: BoltsMeasurementEventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\u00048\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$Companion;", "", "()V", "BOLTS_MEASUREMENT_EVENT_PREFIX", "", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "MEASUREMENT_EVENT_NOTIFICATION_NAME", "getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations", "getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release", "()Ljava/lang/String;", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "context", "Landroid/content/Context;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations() {
        }

        private Companion() {
        }

        public final java.lang.String getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release() {
            return com.facebook.internal.BoltsMeasurementEventListener.access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp();
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.internal.BoltsMeasurementEventListener getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (com.facebook.internal.BoltsMeasurementEventListener.access$getSingleton$cp() != null) {
                return com.facebook.internal.BoltsMeasurementEventListener.access$getSingleton$cp();
            }
            com.facebook.internal.BoltsMeasurementEventListener boltsMeasurementEventListener = new com.facebook.internal.BoltsMeasurementEventListener(context, null);
            com.facebook.internal.BoltsMeasurementEventListener.access$open(boltsMeasurementEventListener);
            com.facebook.internal.BoltsMeasurementEventListener.access$setSingleton$cp(boltsMeasurementEventListener);
            return com.facebook.internal.BoltsMeasurementEventListener.access$getSingleton$cp();
        }
    }

    private final void open() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.applicationContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.registerReceiver(this, new android.content.IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void close() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.applicationContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void finalize() throws java.lang.Throwable {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            close();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(context);
            java.util.Set<java.lang.String> set = null;
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(BOLTS_MEASUREMENT_EVENT_PREFIX, intent == null ? null : intent.getStringExtra(MEASUREMENT_EVENT_NAME_KEY));
            android.os.Bundle bundleExtra = intent == null ? null : intent.getBundleExtra(MEASUREMENT_EVENT_ARGS_KEY);
            android.os.Bundle bundle = new android.os.Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (java.lang.String key : set) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new kotlin.text.Regex("[ -]*$").replace(new kotlin.text.Regex("^[ -]*").replace(new kotlin.text.Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (java.lang.String) bundleExtra.get(key));
                }
            }
            internalAppEventsLogger.logEvent(stringPlus, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
