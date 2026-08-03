package com.helpshift.analytics;

/* loaded from: classes4.dex */
public class HSAnalyticsEventDM {
    private static final int MAX_EVENT_COUNT = 1000;
    private static final int SYNC_INTERVAL_IN_MILLISECONDS = 86400000;
    private static final java.lang.String TAG = "analyticsMngr";
    private final com.helpshift.analytics.HSWebchatAnalyticsManager analyticsManager;
    private final com.helpshift.platform.Device device;
    private final com.helpshift.concurrency.HSThreadingService hsServices;
    private final com.helpshift.network.HTTPTransport httpTransport;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final com.helpshift.user.UserManager userManager;

    public HSAnalyticsEventDM(com.helpshift.platform.Device device, com.helpshift.user.UserManager userManager, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.analytics.HSWebchatAnalyticsManager hSWebchatAnalyticsManager, com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.network.HTTPTransport hTTPTransport) {
        this.device = device;
        this.userManager = userManager;
        this.persistentStorage = hSPersistentStorage;
        this.analyticsManager = hSWebchatAnalyticsManager;
        this.hsServices = hSThreadingService;
        this.httpTransport = hTTPTransport;
    }

    public synchronized void sendAppLaunchEvent(long j) {
        long lastSuccessfulAppLaunchEventSyncTime = this.persistentStorage.getLastSuccessfulAppLaunchEventSyncTime();
        addEventToStorage(j, "a", null);
        if (j > 86400000 + lastSuccessfulAppLaunchEventSyncTime && !com.helpshift.util.Utils.isToday(lastSuccessfulAppLaunchEventSyncTime)) {
            sendStoredEventsToServer(j);
        }
    }

    public synchronized void sendAllEvents() {
        sendStoredEventsToServer(java.lang.System.currentTimeMillis());
    }

    private void sendStoredEventsToServer(final long j) {
        final org.json.JSONArray consumeStoredEventsJson = consumeStoredEventsJson();
        if (com.helpshift.util.JsonUtils.isEmpty(consumeStoredEventsJson)) {
            return;
        }
        this.hsServices.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.analytics.HSAnalyticsEventDM$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.analytics.HSAnalyticsEventDM.this.m5629xb3d83880(consumeStoredEventsJson, j);
            }
        });
    }

    /* renamed from: lambda$sendStoredEventsToServer$0$com-helpshift-analytics-HSAnalyticsEventDM, reason: not valid java name */
    /* synthetic */ void m5629xb3d83880(org.json.JSONArray jSONArray, long j) {
        try {
            int sendEventsToServer = sendEventsToServer(jSONArray, false);
            if (sendEventsToServer < 200 || sendEventsToServer >= 300) {
                return;
            }
            this.persistentStorage.setLastAppLaunchEventSyncTime(j);
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to send the app launch events", e);
        }
    }

    private int sendEventsToServer(org.json.JSONArray jSONArray, boolean z) throws com.helpshift.network.exception.HSRootApiException {
        if (com.helpshift.util.JsonUtils.isEmpty(jSONArray)) {
            return 200;
        }
        try {
            com.helpshift.log.HSLogger.d(TAG, z ? "Syncing failed analytics events" : "Syncing analytics events");
            java.util.Map<java.lang.String, java.lang.String> buildEventRequestMap = buildEventRequestMap();
            buildEventRequestMap.put("e", jSONArray.toString());
            com.helpshift.network.HSRequestData hSRequestData = new com.helpshift.network.HSRequestData(com.helpshift.network.NetworkUtils.buildHeaderMap(this.device, this.persistentStorage.getPlatformId()), buildEventRequestMap);
            com.helpshift.network.POSTNetwork pOSTNetwork = new com.helpshift.network.POSTNetwork(this.httpTransport, com.helpshift.network.NetworkUtils.getAnalyticsAPIRoute(this.persistentStorage));
            boolean z2 = this.userManager.getCurrentUser() instanceof com.helpshift.user.UserWithIdentity;
            com.helpshift.user.UserManager userManager = this.userManager;
            int status = new com.helpshift.network.RetryNetworkWithNewToken(pOSTNetwork, userManager, this.httpTransport, z2, userManager.getTokenDataForRotation()).makeRequest(hSRequestData).getStatus();
            if ((status < 200 || status >= 300) && !z) {
                updateFailedEventsStore(jSONArray);
            }
            return status;
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to send the events", e);
            if (e.exceptionType == com.helpshift.network.exception.NetworkException.SESSION_EXPIRED || e.exceptionType == com.helpshift.network.exception.NetworkException.IDENTITY_FEATURE_NOT_ENABLED) {
                this.userManager.logoutUserForNetworkException(e.exceptionType);
            }
            if (!z) {
                updateFailedEventsStore(jSONArray);
            }
            throw e;
        }
    }

    public void sendQuitEvent() {
        final org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ts", java.lang.System.currentTimeMillis());
        jSONObject.put("t", "q");
        jSONArray.put(jSONObject);
        this.hsServices.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.analytics.HSAnalyticsEventDM$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.analytics.HSAnalyticsEventDM.this.m5628x4d484ab8(jSONArray);
            }
        });
    }

    /* renamed from: lambda$sendQuitEvent$1$com-helpshift-analytics-HSAnalyticsEventDM, reason: not valid java name */
    /* synthetic */ void m5628x4d484ab8(org.json.JSONArray jSONArray) {
        try {
            sendEventsToServer(jSONArray, false);
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to send quit event", e);
        }
    }

    public void sendInAppEventToServer(org.json.JSONObject jSONObject) {
        final org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(jSONObject);
        this.hsServices.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.analytics.HSAnalyticsEventDM$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.analytics.HSAnalyticsEventDM.this.m5627xe652f89c(jSONArray);
            }
        });
    }

    /* renamed from: lambda$sendInAppEventToServer$2$com-helpshift-analytics-HSAnalyticsEventDM, reason: not valid java name */
    /* synthetic */ void m5627xe652f89c(org.json.JSONArray jSONArray) {
        try {
            sendEventsToServer(jSONArray, false);
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to send in-app event", e);
        }
    }

    public void sendFailedEvents() {
        final org.json.JSONArray failedAnalyticsEvents = this.persistentStorage.getFailedAnalyticsEvents();
        if (com.helpshift.util.JsonUtils.isEmpty(failedAnalyticsEvents)) {
            return;
        }
        this.hsServices.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.analytics.HSAnalyticsEventDM$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.analytics.HSAnalyticsEventDM.this.m5626x2fc6b9c1(failedAnalyticsEvents);
            }
        });
    }

    /* renamed from: lambda$sendFailedEvents$3$com-helpshift-analytics-HSAnalyticsEventDM, reason: not valid java name */
    /* synthetic */ void m5626x2fc6b9c1(org.json.JSONArray jSONArray) {
        try {
            int sendEventsToServer = sendEventsToServer(jSONArray, true);
            if (sendEventsToServer < 200 || sendEventsToServer >= 300) {
                return;
            }
            this.persistentStorage.setFailedAnalyticsEvents(new org.json.JSONArray());
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error trying to sync failed events", e);
        }
    }

    private void updateFailedEventsStore(org.json.JSONArray jSONArray) {
        if (com.helpshift.util.JsonUtils.isEmpty(jSONArray)) {
            return;
        }
        org.json.JSONArray failedAnalyticsEvents = this.persistentStorage.getFailedAnalyticsEvents();
        if (failedAnalyticsEvents.length() > 1000) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int length = jSONArray.length(); length < 1000; length++) {
                jSONArray2.put(failedAnalyticsEvents.get(length));
            }
            failedAnalyticsEvents = jSONArray2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            failedAnalyticsEvents.put(jSONArray.get(i));
        }
        this.persistentStorage.setFailedAnalyticsEvents(failedAnalyticsEvents);
    }

    public void addEventToStorage(long j, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        org.json.JSONArray consumeStoredEventsJson = consumeStoredEventsJson();
        if (consumeStoredEventsJson.length() >= 1000) {
            this.persistentStorage.storeEvents(consumeStoredEventsJson.toString());
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ts", j);
        jSONObject.put("t", str);
        if (com.helpshift.util.Utils.isNotEmpty(map)) {
            jSONObject.put("d", new org.json.JSONObject(com.helpshift.util.JsonUtils.mapToJsonString(map)));
        }
        consumeStoredEventsJson.put(jSONObject);
        this.persistentStorage.storeEvents(consumeStoredEventsJson.toString());
    }

    private synchronized org.json.JSONArray consumeStoredEventsJson() {
        org.json.JSONArray jSONArray;
        jSONArray = new org.json.JSONArray();
        java.lang.String storedEvents = this.persistentStorage.getStoredEvents();
        if (com.helpshift.util.JsonUtils.isValidJsonString(storedEvents)) {
            jSONArray = new org.json.JSONArray(storedEvents);
            this.persistentStorage.clearStoredEvents();
        }
        return jSONArray;
    }

    private java.util.Map<java.lang.String, java.lang.String> buildEventRequestMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String deviceId = this.device.getDeviceId();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("userId", "uid");
        hashMap2.put("userEmail", "email");
        java.util.Map<java.lang.String, java.lang.String> activeUserDataForNetworkCall = this.userManager.getActiveUserDataForNetworkCall(hashMap2);
        com.helpshift.util.Utils.removeEmptyKeyValues(activeUserDataForNetworkCall);
        hashMap.putAll(activeUserDataForNetworkCall);
        java.lang.String legacyAnalyticsEventId = getLegacyAnalyticsEventId(activeUserDataForNetworkCall.get("uid"));
        hashMap.put("did", deviceId);
        if (!com.helpshift.util.Utils.isEmpty(legacyAnalyticsEventId)) {
            deviceId = legacyAnalyticsEventId;
        }
        hashMap.put("id", deviceId);
        hashMap.put(com.ironsource.C4.a.d, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        hashMap.putAll(this.analyticsManager.getCommonAnalyticsMap());
        hashMap.put("platform-id", this.persistentStorage.getPlatformId());
        return hashMap;
    }

    private java.lang.String getLegacyAnalyticsEventId(java.lang.String str) {
        java.lang.String string = this.persistentStorage.getString(com.helpshift.storage.HSPersistentStorage.LEGACY_ANALYTICS_EVENTS_IDS);
        if (!com.helpshift.util.Utils.isEmpty(string) && com.helpshift.util.JsonUtils.isValidJsonString(string)) {
            return new org.json.JSONObject(string).getString(str);
        }
        return "";
    }
}
