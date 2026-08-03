package com.facebook.appevents.internal;

/* compiled from: ActivityLifecycleTracker.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020$H\u0007J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0007J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "()V", "INCORRECT_IMPL_WARNING", "", "INTERRUPTION_THRESHOLD_MILLISECONDS", "", "TAG", "activityReferences", "", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "currActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivityAppearTime", "currentFuture", "Ljava/util/concurrent/ScheduledFuture;", "currentFutureLock", "currentSession", "Lcom/facebook/appevents/internal/SessionInfo;", "foregroundActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "sessionTimeoutInSeconds", "getSessionTimeoutInSeconds", "()I", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "tracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelCurrentTask", "", "getCurrentActivity", "getCurrentSessionGuid", "Ljava/util/UUID;", "isInBackground", "", "isTracking", "onActivityCreated", "activity", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "startTracking", "application", "Landroid/app/Application;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityLifecycleTracker {
    private static final java.lang.String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final com.facebook.appevents.internal.ActivityLifecycleTracker INSTANCE = new com.facebook.appevents.internal.ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    private static final java.lang.String TAG;
    private static int activityReferences;
    private static java.lang.String appId;
    private static java.lang.ref.WeakReference<android.app.Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile java.util.concurrent.ScheduledFuture<?> currentFuture;
    private static final java.lang.Object currentFutureLock;
    private static volatile com.facebook.appevents.internal.SessionInfo currentSession;
    private static final java.util.concurrent.atomic.AtomicInteger foregroundActivityCount;
    private static final java.util.concurrent.ScheduledExecutorService singleThreadExecutor;
    private static final java.util.concurrent.atomic.AtomicBoolean tracking;

    private ActivityLifecycleTracker() {
    }

    static {
        java.lang.String canonicalName = com.facebook.appevents.internal.ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new java.lang.Object();
        foregroundActivityCount = new java.util.concurrent.atomic.AtomicInteger(0);
        tracking = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @kotlin.jvm.JvmStatic
    public static final void startTracking(android.app.Application application, java.lang.String appId2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
        if (tracking.compareAndSet(false, true)) {
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.CodelessEvents, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$$ExternalSyntheticLambda4
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.appevents.internal.ActivityLifecycleTracker.m5141startTracking$lambda0(z);
                }
            });
            appId = appId2;
            application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$startTracking$2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivityCreated");
                    com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                    com.facebook.appevents.internal.AppEventUtility.assertIsMainThread();
                    com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                    com.facebook.appevents.internal.ActivityLifecycleTracker.onActivityCreated(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(android.app.Activity activity) {
                    int i;
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                    i = com.facebook.appevents.internal.ActivityLifecycleTracker.activityReferences;
                    com.facebook.appevents.internal.ActivityLifecycleTracker.activityReferences = i + 1;
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivityStarted");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(android.app.Activity activity) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivityResumed");
                    com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                    com.facebook.appevents.internal.AppEventUtility.assertIsMainThread();
                    com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                    com.facebook.appevents.internal.ActivityLifecycleTracker.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(android.app.Activity activity) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivityPaused");
                    com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                    com.facebook.appevents.internal.AppEventUtility.assertIsMainThread();
                    com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(android.app.Activity activity) {
                    java.lang.String str;
                    int i;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivityStopped");
                    com.facebook.appevents.AppEventsLogger.INSTANCE.onContextStop();
                    com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                    i = com.facebook.appevents.internal.ActivityLifecycleTracker.activityReferences;
                    com.facebook.appevents.internal.ActivityLifecycleTracker.activityReferences = i - 1;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivitySaveInstanceState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(android.app.Activity activity) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                    str = com.facebook.appevents.internal.ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str, "onActivityDestroyed");
                    com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE.onActivityDestroyed(activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startTracking$lambda-0, reason: not valid java name */
    public static final void m5141startTracking$lambda0(boolean z) {
        if (z) {
            com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
            com.facebook.appevents.codeless.CodelessManager.enable();
        } else {
            com.facebook.appevents.codeless.CodelessManager codelessManager2 = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
            com.facebook.appevents.codeless.CodelessManager.disable();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isTracking() {
        return tracking.get();
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.UUID getCurrentSessionGuid() {
        com.facebook.appevents.internal.SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    @kotlin.jvm.JvmStatic
    public static final void onActivityCreated(android.app.Activity activity) {
        singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.internal.ActivityLifecycleTracker.m5137onActivityCreated$lambda1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-1, reason: not valid java name */
    public static final void m5137onActivityCreated$lambda1() {
        if (currentSession == null) {
            currentSession = com.facebook.appevents.internal.SessionInfo.INSTANCE.getStoredSessionInfo();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = INSTANCE;
        currActivity = new java.lang.ref.WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        activityLifecycleTracker.cancelCurrentTask();
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        currentActivityAppearTime = currentTimeMillis;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        final java.lang.String activityName = com.facebook.internal.Utility.getActivityName(activity);
        com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
        com.facebook.appevents.codeless.CodelessManager.onActivityResumed(activity);
        com.facebook.appevents.aam.MetadataIndexer metadataIndexer = com.facebook.appevents.aam.MetadataIndexer.INSTANCE;
        com.facebook.appevents.aam.MetadataIndexer.onActivityResumed(activity);
        com.facebook.appevents.suggestedevents.SuggestedEventsManager suggestedEventsManager = com.facebook.appevents.suggestedevents.SuggestedEventsManager.INSTANCE;
        com.facebook.appevents.suggestedevents.SuggestedEventsManager.trackActivity(activity);
        com.facebook.appevents.iap.InAppPurchaseManager inAppPurchaseManager = com.facebook.appevents.iap.InAppPurchaseManager.INSTANCE;
        com.facebook.appevents.iap.InAppPurchaseManager.startTracking();
        final android.content.Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.internal.ActivityLifecycleTracker.m5140onActivityResumed$lambda2(currentTimeMillis, activityName, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-2, reason: not valid java name */
    public static final void m5140onActivityResumed$lambda2(long j, java.lang.String activityName, android.content.Context appContext) {
        com.facebook.appevents.internal.SessionInfo sessionInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "$activityName");
        com.facebook.appevents.internal.SessionInfo sessionInfo2 = currentSession;
        java.lang.Long sessionLastEventTime = sessionInfo2 == null ? null : sessionInfo2.getSessionLastEventTime();
        if (currentSession == null) {
            currentSession = new com.facebook.appevents.internal.SessionInfo(java.lang.Long.valueOf(j), null, null, 4, null);
            com.facebook.appevents.internal.SessionLogger sessionLogger = com.facebook.appevents.internal.SessionLogger.INSTANCE;
            java.lang.String str = appId;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            com.facebook.appevents.internal.SessionLogger.logActivateApp(activityName, null, str, appContext);
        } else if (sessionLastEventTime != null) {
            long longValue = j - sessionLastEventTime.longValue();
            if (longValue > INSTANCE.getSessionTimeoutInSeconds() * 1000) {
                com.facebook.appevents.internal.SessionLogger sessionLogger2 = com.facebook.appevents.internal.SessionLogger.INSTANCE;
                com.facebook.appevents.internal.SessionLogger.logDeactivateApp(activityName, currentSession, appId);
                com.facebook.appevents.internal.SessionLogger sessionLogger3 = com.facebook.appevents.internal.SessionLogger.INSTANCE;
                java.lang.String str2 = appId;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                com.facebook.appevents.internal.SessionLogger.logActivateApp(activityName, null, str2, appContext);
                currentSession = new com.facebook.appevents.internal.SessionInfo(java.lang.Long.valueOf(j), null, null, 4, null);
            } else if (longValue > 1000 && (sessionInfo = currentSession) != null) {
                sessionInfo.incrementInterruptionCount();
            }
        }
        com.facebook.appevents.internal.SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.setSessionLastEventTime(java.lang.Long.valueOf(j));
        }
        com.facebook.appevents.internal.SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 == null) {
            return;
        }
        sessionInfo4.writeSessionToDisk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityPaused(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            android.util.Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        final java.lang.String activityName = com.facebook.internal.Utility.getActivityName(activity);
        com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
        com.facebook.appevents.codeless.CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.internal.ActivityLifecycleTracker.m5138onActivityPaused$lambda6(currentTimeMillis, activityName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityPaused$lambda-6, reason: not valid java name */
    public static final void m5138onActivityPaused$lambda6(final long j, final java.lang.String activityName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new com.facebook.appevents.internal.SessionInfo(java.lang.Long.valueOf(j), null, null, 4, null);
        }
        com.facebook.appevents.internal.SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.setSessionLastEventTime(java.lang.Long.valueOf(j));
        }
        if (foregroundActivityCount.get() <= 0) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.internal.ActivityLifecycleTracker.m5139onActivityPaused$lambda6$lambda4(j, activityName);
                }
            };
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(runnable, INSTANCE.getSessionTimeoutInSeconds(), java.util.concurrent.TimeUnit.SECONDS);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        long j2 = currentActivityAppearTime;
        long j3 = j2 > 0 ? (j - j2) / 1000 : 0L;
        com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = com.facebook.appevents.internal.AutomaticAnalyticsLogger.INSTANCE;
        com.facebook.appevents.internal.AutomaticAnalyticsLogger.logActivityTimeSpentEvent(activityName, j3);
        com.facebook.appevents.internal.SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 == null) {
            return;
        }
        sessionInfo2.writeSessionToDisk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityPaused$lambda-6$lambda-4, reason: not valid java name */
    public static final void m5139onActivityPaused$lambda6$lambda4(long j, java.lang.String activityName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (currentSession == null) {
            currentSession = new com.facebook.appevents.internal.SessionInfo(java.lang.Long.valueOf(j), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            com.facebook.appevents.internal.SessionLogger sessionLogger = com.facebook.appevents.internal.SessionLogger.INSTANCE;
            com.facebook.appevents.internal.SessionLogger.logDeactivateApp(activityName, currentSession, appId);
            com.facebook.appevents.internal.SessionInfo.INSTANCE.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityDestroyed(android.app.Activity activity) {
        com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
        com.facebook.appevents.codeless.CodelessManager.onActivityDestroyed(activity);
    }

    private final int getSessionTimeoutInSeconds() {
        com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(com.facebook.FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery == null) {
            com.facebook.appevents.internal.Constants constants = com.facebook.appevents.internal.Constants.INSTANCE;
            return com.facebook.appevents.internal.Constants.getDefaultAppEventsSessionTimeoutInSeconds();
        }
        return appSettingsWithoutQuery.getSessionTimeoutInSeconds();
    }

    private final void cancelCurrentTask() {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.app.Activity getCurrentActivity() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
