package com.vungle.ads.internal.signals;

/* compiled from: SignalManager.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u0000 L2\u00020\u0001:\u0001LB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u0004\u0018\u00010\"J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\"J\u0006\u0010>\u001a\u000209J\u000e\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u000209H\u0002J\u0018\u0010C\u001a\u0002092\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010D\u001a\u00020<J\u000e\u0010E\u001a\u0002092\u0006\u0010@\u001a\u00020AJ\u0010\u0010F\u001a\u00020(2\b\u0010G\u001a\u0004\u0018\u00010\u0003J\b\u0010H\u001a\u000209H\u0002J\b\u0010I\u001a\u000209H\u0002J\u0010\u0010J\u001a\u0002092\b\u0010K\u001a\u0004\u0018\u00010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006M²\u0006\n\u0010N\u001a\u00020OX\u008a\u0084\u0002²\u0006\n\u0010P\u001a\u00020QX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/signals/SignalManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "currentSession", "Lcom/vungle/ads/internal/signals/SessionData;", "getCurrentSession$vungle_ads_release$annotations", "()V", "getCurrentSession$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SessionData;", "setCurrentSession$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SessionData;)V", "enterBackgroundTime", "", "getEnterBackgroundTime", "()J", "setEnterBackgroundTime", "(J)V", "enterForegroundTime", "getEnterForegroundTime", "setEnterForegroundTime", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "getFilePreferences", "()Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences$delegate", "Lkotlin/Lazy;", "json", "Lkotlinx/serialization/json/Json;", "mapOfLastLoadTimes", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getMapOfLastLoadTimes", "()Ljava/util/concurrent/ConcurrentHashMap;", "setMapOfLastLoadTimes", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "sessionCount", "", "getSessionCount", "()I", "setSessionCount", "(I)V", "sessionDuration", "getSessionDuration", "setSessionDuration", "sessionSeriesCreatedTime", "getSessionSeriesCreatedTime", "setSessionSeriesCreatedTime", "unclosedAdDetector", "Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "uuid", "getUuid", "()Ljava/lang/String;", "createNewSessionData", "", "generateSignals", "getSignaledAd", "Lcom/vungle/ads/internal/signals/SignaledAd;", "placementId", "increaseSessionDepthCounter", "recordUnclosedAd", "unclosedAd", "Lcom/vungle/ads/internal/model/UnclosedAd;", "registerNotifications", "registerSignaledAd", "signaledAd", "removeUnclosedAd", com.helpshift.util.ConfigValues.SCREEN_ORIENTATION, "ctx", "updateSessionCount", "updateSessionDuration", "updateTemplateSignals", "signals", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class SignalManager {
    public static final java.lang.String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    public static final java.lang.String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 2;
    private static final java.lang.String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;
    private final android.content.Context context;
    private com.vungle.ads.internal.signals.SessionData currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;

    /* renamed from: filePreferences$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy filePreferences;
    private final kotlinx.serialization.json.Json json;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private com.vungle.ads.internal.session.UnclosedAdDetector unclosedAdDetector;

    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }

    public SignalManager(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.signals.SignalManager$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        this.enterForegroundTime = java.lang.System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new java.util.concurrent.ConcurrentHashMap<>();
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.filePreferences = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.persistence.FilePreferences invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.persistence.FilePreferences.class);
            }
        });
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.SessionData(this.sessionCount);
        com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.executor.Executors invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
            }
        });
        com.vungle.ads.ServiceLocator.Companion companion3 = com.vungle.ads.ServiceLocator.INSTANCE;
        com.vungle.ads.internal.session.UnclosedAdDetector unclosedAdDetector = new com.vungle.ads.internal.session.UnclosedAdDetector(context, this.currentSession.getSessionId(), m10467_init_$lambda0(lazy), m10468_init_$lambda1(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.PathProvider>() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.PathProvider invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.util.PathProvider.class);
            }
        })));
        this.unclosedAdDetector = unclosedAdDetector;
        this.currentSession.setUnclosedAd(unclosedAdDetector.retrieveUnclosedAd());
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.vungle.ads.internal.signals.SignalManager.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unclosedad: ");
                kotlinx.serialization.json.Json json = com.vungle.ads.internal.signals.SignalManager.this.json;
                java.util.List<com.vungle.ads.internal.model.UnclosedAd> unclosedAd = com.vungle.ads.internal.signals.SignalManager.this.getCurrentSession().getUnclosedAd();
                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.UnclosedAd.class))));
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                sb.append(json.encodeToString(serializer, unclosedAd));
                return sb.toString();
            }
        });
        try {
            this.currentSession.setDevice(!com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.isEmulator() ? 1 : 0);
            this.currentSession.setVPNConnected(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.isVpnConnected(context) ? 1 : 0);
            this.currentSession.setOverlayGranted(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.hasSystemAlertWindowPermission(context) ? 1 : 0);
            this.currentSession.setSensorCount(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.getSensorCount(context));
            this.currentSession.setHttpProxyEnabled(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.isProxyEnabled(context) ? 1 : 0);
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to collect device signals: " + e.getLocalizedMessage());
        }
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final void setEnterBackgroundTime(long j) {
        this.enterBackgroundTime = j;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    public final void setEnterForegroundTime(long j) {
        this.enterForegroundTime = j;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final void setSessionDuration(long j) {
        this.sessionDuration = j;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final void setSessionCount(int i) {
        this.sessionCount = i;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    public final void setSessionSeriesCreatedTime(long j) {
        this.sessionSeriesCreatedTime = j;
    }

    /* renamed from: getCurrentSession$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.signals.SessionData getCurrentSession() {
        return this.currentSession;
    }

    public final void setCurrentSession$vungle_ads_release(com.vungle.ads.internal.signals.SessionData sessionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionData, "<set-?>");
        this.currentSession = sessionData;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final void setMapOfLastLoadTimes(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> concurrentHashMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final com.vungle.ads.internal.persistence.FilePreferences getFilePreferences() {
        return (com.vungle.ads.internal.persistence.FilePreferences) this.filePreferences.getValue();
    }

    public final java.lang.String getUuid() {
        return this.currentSession.getSessionId();
    }

    /* renamed from: _init_$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.Executors m10467_init_$lambda0(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.util.PathProvider m10468_init_$lambda1(kotlin.Lazy<com.vungle.ads.internal.util.PathProvider> lazy) {
        return lazy.getValue();
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.sessionSeriesCreatedTime;
        long j2 = currentTimeMillis - j;
        if (j < 0 || j2 >= 86400000) {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, currentTimeMillis);
            this.sessionSeriesCreatedTime = currentTimeMillis;
        } else {
            this.sessionCount++;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void registerNotifications() {
        com.vungle.ads.internal.util.ActivityManager.INSTANCE.addLifecycleListener(new com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.signals.SignalManager$registerNotifications$1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("SignalManager", "SignalManager#onForeground()");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - com.vungle.ads.internal.signals.SignalManager.this.getEnterBackgroundTime() > com.vungle.ads.internal.ConfigManager.INSTANCE.getSignalsSessionTimeout()) {
                    com.vungle.ads.internal.signals.SignalManager.this.createNewSessionData();
                }
                com.vungle.ads.internal.signals.SignalManager.this.setEnterForegroundTime(currentTimeMillis);
                com.vungle.ads.internal.signals.SignalManager.this.setEnterBackgroundTime(0L);
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("SignalManager", "SignalManager#onBackground()");
                com.vungle.ads.internal.signals.SignalManager.this.setEnterBackgroundTime(java.lang.System.currentTimeMillis());
                com.vungle.ads.internal.signals.SignalManager signalManager = com.vungle.ads.internal.signals.SignalManager.this;
                signalManager.setSessionDuration(signalManager.getSessionDuration() + (com.vungle.ads.internal.signals.SignalManager.this.getEnterBackgroundTime() - com.vungle.ads.internal.signals.SignalManager.this.getEnterForegroundTime()));
            }
        });
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.SessionData(this.sessionCount);
    }

    public final synchronized com.vungle.ads.internal.signals.SignaledAd getSignaledAd(java.lang.String placementId) {
        long currentTimeMillis;
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        currentTimeMillis = java.lang.System.currentTimeMillis();
        l = this.mapOfLastLoadTimes.containsKey(placementId) ? this.mapOfLastLoadTimes.get(placementId) : null;
        this.mapOfLastLoadTimes.put(placementId, java.lang.Long.valueOf(currentTimeMillis));
        return new com.vungle.ads.internal.signals.SignaledAd(l, currentTimeMillis);
    }

    public final synchronized void increaseSessionDepthCounter() {
        com.vungle.ads.internal.signals.SessionData sessionData = this.currentSession;
        sessionData.setSessionDepthCounter(sessionData.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(com.vungle.ads.internal.model.UnclosedAd unclosedAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unclosedAd, "unclosedAd");
        if (com.vungle.ads.internal.ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void removeUnclosedAd(com.vungle.ads.internal.model.UnclosedAd unclosedAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unclosedAd, "unclosedAd");
        if (com.vungle.ads.internal.ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(android.content.Context context, com.vungle.ads.internal.signals.SignaledAd signaledAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void updateTemplateSignals(java.lang.String signals) {
        java.lang.String str = signals;
        if (str == null || str.length() == 0 || !(!this.currentSession.getSignaledAd().isEmpty())) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(signals);
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((this.sessionDuration + java.lang.System.currentTimeMillis()) - this.enterForegroundTime);
    }

    public final java.lang.String generateSignals() {
        updateSessionDuration();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("2:");
            kotlinx.serialization.json.Json json = this.json;
            com.vungle.ads.internal.signals.SessionData sessionData = this.currentSession;
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.signals.SessionData.class));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb.append(json.encodeToString(serializer, sessionData));
            return sb.toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final int screenOrientation(android.content.Context ctx) {
        android.content.res.Configuration configuration;
        if (ctx == null) {
            ctx = this.context;
        }
        android.content.res.Resources resources = ctx.getResources();
        java.lang.Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        if (valueOf != null && valueOf.intValue() == 2) {
            return 2;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return 1;
        }
        return (valueOf != null && valueOf.intValue() == 0) ? 0 : -1;
    }
}
