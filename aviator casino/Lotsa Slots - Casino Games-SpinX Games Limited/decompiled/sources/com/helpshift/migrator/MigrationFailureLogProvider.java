package com.helpshift.migrator;

/* loaded from: classes2.dex */
public class MigrationFailureLogProvider {
    private static final java.lang.String TAG = "MgrFailLog";
    private final com.helpshift.platform.Device device;
    private final com.helpshift.concurrency.HSThreadingService hsThreadingService;
    private final com.helpshift.network.HTTPTransport httpTransport;
    private java.util.concurrent.atomic.AtomicBoolean inProgress = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final com.helpshift.storage.ISharedPreferencesStore preferences;

    public MigrationFailureLogProvider(com.helpshift.storage.ISharedPreferencesStore iSharedPreferencesStore, com.helpshift.network.HTTPTransport hTTPTransport, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.platform.Device device, com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.preferences = iSharedPreferencesStore;
        this.httpTransport = hTTPTransport;
        this.persistentStorage = hSPersistentStorage;
        this.device = device;
        this.hsThreadingService = hSThreadingService;
    }

    public void sendMigrationFailureLogs() {
        if (shouldSkipMigrationFailureLogSync()) {
            return;
        }
        this.inProgress = this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.migrator.MigrationFailureLogProvider$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.migrator.MigrationFailureLogProvider.this.m5668x6f8f1d09();
            }
        });
    }

    /* renamed from: lambda$sendMigrationFailureLogs$0$com-helpshift-migrator-MigrationFailureLogProvider, reason: not valid java name */
    /* synthetic */ void m5668x6f8f1d09() {
        try {
            if (this.inProgress.get()) {
                com.helpshift.log.HSLogger.d(TAG, "Migration failure log sync already in progress. Skipping.");
                return;
            }
            java.lang.String string = this.preferences.getString(com.helpshift.migrator.MigratorSharedPrefConstants.FAILURE_LOG_KEY);
            if (com.helpshift.util.Utils.isEmpty(string)) {
                com.helpshift.log.HSLogger.d(TAG, "Migration failure logs are empty. Skipping.");
            } else {
                sendFailureLogsRequest(prepareRequestBody(new org.json.JSONArray().put(new org.json.JSONObject(string)), collectMetaData()));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Migration failure logs sync failed", e);
        }
    }

    private boolean shouldSkipMigrationFailureLogSync() {
        int i = this.preferences.getInt(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_STATE_KEY, 0);
        if (i == 1 || i == 0) {
            return true;
        }
        return this.preferences.getBoolean(com.helpshift.migrator.MigratorSharedPrefConstants.FAILURE_LOG_SYNCED);
    }

    private org.json.JSONArray collectMetaData() throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(jsonify(com.ironsource.X3.j.D, this.persistentStorage.getDomain() + "." + this.persistentStorage.getHost()));
        arrayList.add(jsonify("dm", this.device.getDeviceModel()));
        arrayList.add(jsonify("did", this.device.getDeviceId()));
        arrayList.add(jsonify(com.ironsource.M6.F, this.device.getOSVersion()));
        java.lang.String appName = this.device.getAppName();
        if (!com.helpshift.util.Utils.isEmpty(appName)) {
            arrayList.add(jsonify("an", appName));
        }
        java.lang.String appVersion = this.device.getAppVersion();
        if (!com.helpshift.util.Utils.isEmpty(appVersion)) {
            arrayList.add(jsonify(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, appVersion));
        }
        return com.helpshift.util.JsonUtils.jsonArrayFromList(arrayList);
    }

    private java.util.HashMap<java.lang.String, java.lang.String> prepareRequestBody(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("id", java.util.UUID.randomUUID().toString());
        hashMap.put("v", "1");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", java.util.Locale.ENGLISH);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        hashMap.put("ctime", simpleDateFormat.format(new java.util.Date()));
        hashMap.put("src", "sdkx.android." + this.device.getSDKVersion());
        hashMap.put("logs", jSONArray.toString());
        hashMap.put(com.ironsource.M6.u, jSONArray2.toString());
        hashMap.put("platform-id", this.persistentStorage.getPlatformId());
        return hashMap;
    }

    private void sendFailureLogsRequest(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.helpshift.network.HSResponse makeRequest = new com.helpshift.network.POSTNetwork(this.httpTransport, com.helpshift.network.NetworkUtils.getCrashLogsRoute(this.persistentStorage)).makeRequest(new com.helpshift.network.HSRequestData(com.helpshift.network.NetworkUtils.buildHeaderMap(this.device, this.persistentStorage.getPlatformId()), hashMap));
        if (makeRequest.getStatus() < 200 || makeRequest.getStatus() >= 300) {
            return;
        }
        this.preferences.putBoolean(com.helpshift.migrator.MigratorSharedPrefConstants.FAILURE_LOG_SYNCED, true);
        this.preferences.putString(com.helpshift.migrator.MigratorSharedPrefConstants.FAILURE_LOG_KEY, "");
    }

    private org.json.JSONObject jsonify(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        return new org.json.JSONObject().put(str, str2);
    }
}
