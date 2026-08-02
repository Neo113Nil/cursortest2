package com.adobe.marketing.mobile.services.internal.context;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005,-./0B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010 \u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App;", "Lcom/adobe/marketing/mobile/services/AppContextService;", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/AppState;", "getAppState", "()Lcom/adobe/marketing/mobile/services/AppState;", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", com.sun.jna.Callback.METHOD_NAME, "", "registerActivityLifecycleCallbacks", "(Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;)V", "reset", "application", "setApplication", "(Landroid/app/Application;)V", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityTracker;", "getHighSpeedVideoFpsRanges", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityTracker;", "Lcom/adobe/marketing/mobile/services/internal/context/App$AppStateTracker;", "Camera2StreamConfigurationMap", "Lcom/adobe/marketing/mobile/services/internal/context/App$AppStateTracker;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "Landroid/net/ConnectivityManager;", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleCallbacks;", "getOutputMinFrameDuration", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleCallbacks;", "getHighSpeedVideoSizesFor", "ActivityLifecycleCallbacks", "ActivityTracker", "AppStateTracker", "InternalActivityLifecycleCallbacks", "InternalActivityLifecycleListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class App implements com.adobe.marketing.mobile.services.AppContextService {
    private static volatile java.lang.ref.WeakReference<android.app.Application> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static volatile android.net.ConnectivityManager Camera2StreamConfigurationMap;
    private static volatile java.lang.ref.WeakReference<android.content.Context> getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleCallbacks getHighSpeedVideoSizesFor;
    public static final com.adobe.marketing.mobile.services.internal.context.App INSTANCE = new com.adobe.marketing.mobile.services.internal.context.App();
    private static com.adobe.marketing.mobile.services.internal.context.App.ActivityTracker getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.services.internal.context.App.ActivityTracker();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static com.adobe.marketing.mobile.services.internal.context.App.AppStateTracker getHighSpeedVideoFpsRangesFor = new com.adobe.marketing.mobile.services.internal.context.App.AppStateTracker();

    private App() {
    }

    @Override // com.adobe.marketing.mobile.services.AppContextService
    public final void setApplication(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        java.lang.ref.WeakReference<android.app.Application> weakReference = getHighResolutionOutputSizeshNQ4ISI;
        if ((weakReference != null ? weakReference.get() : null) != null) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(application);
        android.content.Context applicationContext = application.getApplicationContext();
        if (applicationContext != null) {
            getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(applicationContext);
        }
        java.lang.Object systemService = application.getSystemService("connectivity");
        Camera2StreamConfigurationMap = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleCallbacks internalActivityLifecycleCallbacks = new com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleCallbacks(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener[]{getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor}));
        getHighSpeedVideoSizesFor = internalActivityLifecycleCallbacks;
        application.registerActivityLifecycleCallbacks(internalActivityLifecycleCallbacks);
        application.registerComponentCallbacks(getHighSpeedVideoSizesFor);
    }

    @Override // com.adobe.marketing.mobile.services.AppContextService
    public final android.app.Application getApplication() {
        java.lang.ref.WeakReference<android.app.Application> weakReference = getHighResolutionOutputSizeshNQ4ISI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.AppContextService
    public final android.content.Context getApplicationContext() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = getHighSpeedVideoSizes;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.AppContextService
    public final android.app.Activity getCurrentActivity() {
        java.lang.ref.WeakReference<android.app.Activity> currentActivity = getHighSpeedVideoFpsRanges.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity.get();
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.AppContextService
    public final com.adobe.marketing.mobile.services.AppState getAppState() {
        return getHighSpeedVideoFpsRangesFor.getAppState();
    }

    @Override // com.adobe.marketing.mobile.services.AppContextService
    public final android.net.ConnectivityManager getConnectivityManager() {
        return Camera2StreamConfigurationMap;
    }

    public final void registerActivityLifecycleCallbacks(com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        getHighSpeedVideoFpsRanges.getActivityCallbacks().add(callback);
    }

    public final void reset() {
        android.app.Application application;
        java.lang.ref.WeakReference<android.app.Application> weakReference = getHighResolutionOutputSizeshNQ4ISI;
        if (weakReference != null && (application = weakReference.get()) != null) {
            application.unregisterActivityLifecycleCallbacks(getHighSpeedVideoSizesFor);
            application.unregisterComponentCallbacks(getHighSpeedVideoSizesFor);
        }
        getHighResolutionOutputSizeshNQ4ISI = null;
        getHighSpeedVideoSizes = null;
        getHighSpeedVideoSizesFor = null;
        Camera2StreamConfigurationMap = null;
        getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.services.internal.context.App.ActivityTracker();
        getHighSpeedVideoFpsRangesFor = new com.adobe.marketing.mobile.services.internal.context.App.AppStateTracker();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "", "level", "", "onTrimMemory", "(I)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    interface InternalActivityLifecycleListener extends com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks {
        void onTrimMemory(int level);

        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class DefaultImpls {
            public static void onTrimMemory(com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener internalActivityLifecycleListener, int i) {
            }

            public static void onActivityPaused(com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener internalActivityLifecycleListener, android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks.DefaultImpls.onActivityPaused(internalActivityLifecycleListener, activity);
            }

            public static void onActivityResumed(com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener internalActivityLifecycleListener, android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks.DefaultImpls.onActivityResumed(internalActivityLifecycleListener, activity);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$AppStateTracker;", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "", "level", "onTrimMemory", "(I)V", "Lcom/adobe/marketing/mobile/services/AppState;", "appState", "Lcom/adobe/marketing/mobile/services/AppState;", "getAppState", "()Lcom/adobe/marketing/mobile/services/AppState;", "setAppState", "(Lcom/adobe/marketing/mobile/services/AppState;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AppStateTracker implements com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener {
        public static final int $stable = 8;
        private volatile com.adobe.marketing.mobile.services.AppState appState = com.adobe.marketing.mobile.services.AppState.UNKNOWN;

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
        }

        public final com.adobe.marketing.mobile.services.AppState getAppState() {
            return this.appState;
        }

        public final void setAppState(com.adobe.marketing.mobile.services.AppState appState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appState, "");
            this.appState = appState;
        }

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            this.appState = com.adobe.marketing.mobile.services.AppState.FOREGROUND;
        }

        @Override // com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener
        public final void onTrimMemory(int level) {
            if (level >= 20) {
                this.appState = com.adobe.marketing.mobile.services.AppState.BACKGROUND;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityTracker;", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityResumed", "", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "activityCallbacks", "Ljava/util/List;", "getActivityCallbacks", "()Ljava/util/List;", "setActivityCallbacks", "(Ljava/util/List;)V", "Ljava/lang/ref/WeakReference;", "currentActivity", "Ljava/lang/ref/WeakReference;", "getCurrentActivity", "()Ljava/lang/ref/WeakReference;", "setCurrentActivity", "(Ljava/lang/ref/WeakReference;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActivityTracker implements com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener {
        public static final int $stable = 8;
        private volatile java.util.List<com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks> activityCallbacks = new java.util.ArrayList();
        private volatile java.lang.ref.WeakReference<android.app.Activity> currentActivity;

        @Override // com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener
        public final void onTrimMemory(int i) {
            com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener.DefaultImpls.onTrimMemory(this, i);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> getCurrentActivity() {
            return this.currentActivity;
        }

        public final void setCurrentActivity(java.lang.ref.WeakReference<android.app.Activity> weakReference) {
            this.currentActivity = weakReference;
        }

        public final java.util.List<com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks> getActivityCallbacks() {
            return this.activityCallbacks;
        }

        public final void setActivityCallbacks(java.util.List<com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.activityCallbacks = list;
        }

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            this.currentActivity = new java.lang.ref.WeakReference<>(activity);
            java.util.Iterator<T> it = this.activityCallbacks.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks) it.next()).onActivityResumed(activity);
            }
        }

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            java.util.Iterator<T> it = this.activityCallbacks.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/content/ComponentCallbacks2;", "", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "p0", "<init>", "(Ljava/util/List;)V", "Landroid/app/Activity;", "Landroid/os/Bundle;", "p1", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "onTrimMemory", "(I)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class InternalActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.List<com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener> getHighSpeedVideoFpsRanges;

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InternalActivityLifecycleCallbacks(java.util.List<? extends com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoFpsRanges = list;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener) it.next()).onActivityResumed(p0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener) it.next()).onActivityPaused(p0);
            }
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int p0) {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                ((com.adobe.marketing.mobile.services.internal.context.App.InternalActivityLifecycleListener) it.next()).onTrimMemory(p0);
            }
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(android.content.res.Configuration p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity p0, android.os.Bundle p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "", "Landroid/app/Activity;", "activity", "", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityResumed"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface ActivityLifecycleCallbacks {
        void onActivityPaused(android.app.Activity activity);

        void onActivityResumed(android.app.Activity activity);

        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class DefaultImpls {
            public static void onActivityResumed(com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks activityLifecycleCallbacks, android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            }

            public static void onActivityPaused(com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks activityLifecycleCallbacks, android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            }
        }
    }
}
