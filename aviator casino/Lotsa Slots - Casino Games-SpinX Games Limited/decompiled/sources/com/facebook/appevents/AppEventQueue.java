package com.facebook.appevents;

/* compiled from: AppEventQueue.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J*\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001fH\u0007J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150(H\u0007J0\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010-\u001a\u00020\u0013H\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \t*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/appevents/AppEventQueue;", "", "()V", "FLUSH_PERIOD_IN_SECONDS", "", "NO_CONNECTIVITY_ERROR_CODE", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "TAG", "", "kotlin.jvm.PlatformType", "appEventCollection", "Lcom/facebook/appevents/AppEventCollection;", "flushRunnable", "Ljava/lang/Runnable;", "scheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "add", "", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "appEvent", "Lcom/facebook/appevents/AppEvent;", "buildRequestForSession", "Lcom/facebook/GraphRequest;", "appEvents", "Lcom/facebook/appevents/SessionEventsState;", "limitEventUsage", "", "flushState", "Lcom/facebook/appevents/FlushStatistics;", "buildRequests", "", "flushResults", "flush", "reason", "Lcom/facebook/appevents/FlushReason;", "flushAndWait", "getKeySet", "", "handleResponse", "request", com.ironsource.Ve.n, "Lcom/facebook/GraphResponse;", "persistToDisk", "sendEventsToServer", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventQueue {
    private static final int FLUSH_PERIOD_IN_SECONDS = 15;
    private static final int NO_CONNECTIVITY_ERROR_CODE = -1;
    private static java.util.concurrent.ScheduledFuture<?> scheduledFuture;
    public static final com.facebook.appevents.AppEventQueue INSTANCE = new com.facebook.appevents.AppEventQueue();
    private static final java.lang.String TAG = com.facebook.appevents.AppEventQueue.class.getName();
    private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
    private static volatile com.facebook.appevents.AppEventCollection appEventCollection = new com.facebook.appevents.AppEventCollection();
    private static final java.util.concurrent.ScheduledExecutorService singleThreadExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    private static final java.lang.Runnable flushRunnable = new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventQueue$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            com.facebook.appevents.AppEventQueue.m5084flushRunnable$lambda0();
        }
    };

    private AppEventQueue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: flushRunnable$lambda-0, reason: not valid java name */
    public static final void m5084flushRunnable$lambda0() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (com.facebook.appevents.AppEventsLogger.INSTANCE.getFlushBehavior() != com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                flushAndWait(com.facebook.appevents.FlushReason.TIMER);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void persistToDisk() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventQueue$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.AppEventQueue.m5086persistToDisk$lambda1();
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistToDisk$lambda-1, reason: not valid java name */
    public static final void m5086persistToDisk$lambda1() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            com.facebook.appevents.AppEventStore appEventStore = com.facebook.appevents.AppEventStore.INSTANCE;
            com.facebook.appevents.AppEventStore.persistEvents(appEventCollection);
            appEventCollection = new com.facebook.appevents.AppEventCollection();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void flush(final com.facebook.appevents.FlushReason reason) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventQueue$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.AppEventQueue.m5083flush$lambda2(com.facebook.appevents.FlushReason.this);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: flush$lambda-2, reason: not valid java name */
    public static final void m5083flush$lambda2(com.facebook.appevents.FlushReason reason) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "$reason");
            flushAndWait(reason);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void add(final com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId, final com.facebook.appevents.AppEvent appEvent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            singleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventQueue$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.AppEventQueue.m5081add$lambda3(com.facebook.appevents.AccessTokenAppIdPair.this, appEvent);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: add$lambda-3, reason: not valid java name */
    public static final void m5081add$lambda3(com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId, com.facebook.appevents.AppEvent appEvent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
            appEventCollection.addEvent(accessTokenAppId, appEvent);
            if (com.facebook.appevents.AppEventsLogger.INSTANCE.getFlushBehavior() != com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.getEventCount() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                flushAndWait(com.facebook.appevents.FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, java.util.concurrent.TimeUnit.SECONDS);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<com.facebook.appevents.AccessTokenAppIdPair> getKeySet() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return null;
        }
        try {
            return appEventCollection.keySet();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void flushAndWait(com.facebook.appevents.FlushReason reason) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            com.facebook.appevents.AppEventDiskStore appEventDiskStore = com.facebook.appevents.AppEventDiskStore.INSTANCE;
            appEventCollection.addPersistedEvents(com.facebook.appevents.AppEventDiskStore.readAndClearStore());
            try {
                com.facebook.appevents.FlushStatistics sendEventsToServer = sendEventsToServer(reason, appEventCollection);
                if (sendEventsToServer != null) {
                    android.content.Intent intent = new android.content.Intent(com.facebook.appevents.AppEventsLogger.ACTION_APP_EVENTS_FLUSHED);
                    intent.putExtra(com.facebook.appevents.AppEventsLogger.APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED, sendEventsToServer.getNumEvents());
                    intent.putExtra(com.facebook.appevents.AppEventsLogger.APP_EVENTS_EXTRA_FLUSH_RESULT, sendEventsToServer.getResult());
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.facebook.FacebookSdk.getApplicationContext()).sendBroadcast(intent);
                }
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.FlushStatistics sendEventsToServer(com.facebook.appevents.FlushReason reason, com.facebook.appevents.AppEventCollection appEventCollection2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEventCollection2, "appEventCollection");
            com.facebook.appevents.FlushStatistics flushStatistics = new com.facebook.appevents.FlushStatistics();
            java.util.List<com.facebook.GraphRequest> buildRequests = buildRequests(appEventCollection2, flushStatistics);
            if (!(!buildRequests.isEmpty())) {
                return null;
            }
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.log(loggingBehavior, TAG2, "Flushing %d events due to %s.", java.lang.Integer.valueOf(flushStatistics.getNumEvents()), reason.toString());
            java.util.Iterator<com.facebook.GraphRequest> it = buildRequests.iterator();
            while (it.hasNext()) {
                it.next().executeAndWait();
            }
            return flushStatistics;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphRequest> buildRequests(com.facebook.appevents.AppEventCollection appEventCollection2, com.facebook.appevents.FlushStatistics flushResults) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEventCollection2, "appEventCollection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            boolean limitEventAndDataUsage = com.facebook.FacebookSdk.getLimitEventAndDataUsage(applicationContext);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.facebook.appevents.AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.keySet()) {
                com.facebook.appevents.SessionEventsState sessionEventsState = appEventCollection2.get(accessTokenAppIdPair);
                if (sessionEventsState != null) {
                    com.facebook.GraphRequest buildRequestForSession = buildRequestForSession(accessTokenAppIdPair, sessionEventsState, limitEventAndDataUsage, flushResults);
                    if (buildRequestForSession != null) {
                        arrayList.add(buildRequestForSession);
                        if (com.facebook.appevents.cloudbridge.AppEventsCAPIManager.INSTANCE.isEnabled$facebook_core_release()) {
                            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.INSTANCE;
                            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint(buildRequestForSession);
                        }
                    }
                } else {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest buildRequestForSession(final com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId, final com.facebook.appevents.SessionEventsState appEvents, boolean limitEventUsage, final com.facebook.appevents.FlushStatistics flushState) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushState, "flushState");
            java.lang.String applicationId = accessTokenAppId.getApplicationId();
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(applicationId, false);
            com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%s/activities", java.util.Arrays.copyOf(new java.lang.Object[]{applicationId}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            final com.facebook.GraphRequest newPostRequest = companion.newPostRequest(null, format, null, null);
            newPostRequest.setForceApplicationRequest(true);
            android.os.Bundle parameters = newPostRequest.getParameters();
            if (parameters == null) {
                parameters = new android.os.Bundle();
            }
            parameters.putString("access_token", accessTokenAppId.getAccessTokenString());
            java.lang.String pushNotificationsRegistrationId = com.facebook.appevents.InternalAppEventsLogger.INSTANCE.getPushNotificationsRegistrationId();
            if (pushNotificationsRegistrationId != null) {
                parameters.putString("device_token", pushNotificationsRegistrationId);
            }
            java.lang.String installReferrer = com.facebook.appevents.AppEventsLoggerImpl.INSTANCE.getInstallReferrer();
            if (installReferrer != null) {
                parameters.putString(com.adjust.sdk.Constants.INSTALL_REFERRER, installReferrer);
            }
            newPostRequest.setParameters(parameters);
            boolean supportsImplicitLogging = queryAppSettings != null ? queryAppSettings.getSupportsImplicitLogging() : false;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            int populateRequest = appEvents.populateRequest(newPostRequest, com.facebook.FacebookSdk.getApplicationContext(), supportsImplicitLogging, limitEventUsage);
            if (populateRequest == 0) {
                return null;
            }
            flushState.setNumEvents(flushState.getNumEvents() + populateRequest);
            newPostRequest.setCallback(new com.facebook.GraphRequest.Callback() { // from class: com.facebook.appevents.AppEventQueue$$ExternalSyntheticLambda5
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.appevents.AppEventQueue.m5082buildRequestForSession$lambda4(com.facebook.appevents.AccessTokenAppIdPair.this, newPostRequest, appEvents, flushState, graphResponse);
                }
            });
            return newPostRequest;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: buildRequestForSession$lambda-4, reason: not valid java name */
    public static final void m5082buildRequestForSession$lambda4(com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId, com.facebook.GraphRequest postRequest, com.facebook.appevents.SessionEventsState appEvents, com.facebook.appevents.FlushStatistics flushState, com.facebook.GraphResponse response) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushState, "$flushState");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            handleResponse(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void handleResponse(final com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId, com.facebook.GraphRequest request, com.facebook.GraphResponse response, final com.facebook.appevents.SessionEventsState appEvents, com.facebook.appevents.FlushStatistics flushState) {
        java.lang.String str;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushState, "flushState");
            com.facebook.FacebookRequestError error = response.getError();
            java.lang.String str2 = com.inmobi.unification.sdk.InitializationStatus.SUCCESS;
            com.facebook.appevents.FlushResult flushResult = com.facebook.appevents.FlushResult.SUCCESS;
            boolean z = true;
            if (error != null) {
                if (error.getErrorCode() == -1) {
                    str2 = "Failed: No Connectivity";
                    flushResult = com.facebook.appevents.FlushResult.NO_CONNECTIVITY;
                } else {
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    str2 = java.lang.String.format("Failed:\n  Response: %s\n  Error %s", java.util.Arrays.copyOf(new java.lang.Object[]{response.toString(), error.toString()}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    flushResult = com.facebook.appevents.FlushResult.SERVER_ERROR;
                }
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.APP_EVENTS)) {
                try {
                    str = new org.json.JSONArray((java.lang.String) request.getTag()).toString(2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (org.json.JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", java.lang.String.valueOf(request.getGraphObject()), str2, str);
            }
            if (error == null) {
                z = false;
            }
            appEvents.clearInFlightAndStats(z);
            if (flushResult == com.facebook.appevents.FlushResult.NO_CONNECTIVITY) {
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.AppEventQueue$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.AppEventQueue.m5085handleResponse$lambda5(com.facebook.appevents.AccessTokenAppIdPair.this, appEvents);
                    }
                });
            }
            if (flushResult == com.facebook.appevents.FlushResult.SUCCESS || flushState.getResult() == com.facebook.appevents.FlushResult.NO_CONNECTIVITY) {
                return;
            }
            flushState.setResult(flushResult);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResponse$lambda-5, reason: not valid java name */
    public static final void m5085handleResponse$lambda5(com.facebook.appevents.AccessTokenAppIdPair accessTokenAppId, com.facebook.appevents.SessionEventsState appEvents) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            com.facebook.appevents.AppEventStore appEventStore = com.facebook.appevents.AppEventStore.INSTANCE;
            com.facebook.appevents.AppEventStore.persistEvents(accessTokenAppId, appEvents);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.AppEventQueue.class);
        }
    }
}
