package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigSharedPrefsClient {
    private static final java.lang.String BACKOFF_END_TIME_IN_MILLIS_KEY = "backoff_end_time_in_millis";
    private static final int CUSTOM_SIGNALS_MAX_COUNT = 100;
    private static final int CUSTOM_SIGNALS_MAX_KEY_LENGTH = 250;
    private static final int CUSTOM_SIGNALS_MAX_STRING_VALUE_LENGTH = 500;
    private static final java.lang.String FETCH_TIMEOUT_IN_SECONDS_KEY = "fetch_timeout_in_seconds";
    private static final java.lang.String LAST_FETCH_ETAG_KEY = "last_fetch_etag";
    private static final java.lang.String LAST_FETCH_STATUS_KEY = "last_fetch_status";
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;
    private static final java.lang.String LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY = "last_fetch_time_in_millis";
    private static final java.lang.String LAST_TEMPLATE_VERSION = "last_template_version";
    private static final java.lang.String MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY = "minimum_fetch_interval_in_seconds";
    private static final long NO_BACKOFF_TIME_IN_MILLIS = -1;
    static final int NO_FAILED_FETCHES = 0;
    static final int NO_FAILED_REALTIME_STREAMS = 0;
    private static final java.lang.String NUM_FAILED_FETCHES_KEY = "num_failed_fetches";
    private static final java.lang.String NUM_FAILED_REALTIME_STREAMS_KEY = "num_failed_realtime_streams";
    private static final java.lang.String REALTIME_BACKOFF_END_TIME_IN_MILLIS_KEY = "realtime_backoff_end_time_in_millis";
    private final android.content.SharedPreferences frcSharedPrefs;
    static final java.util.Date LAST_FETCH_TIME_NO_FETCH_YET = new java.util.Date(-1);
    static final java.util.Date NO_BACKOFF_TIME = new java.util.Date(-1);
    private final java.lang.Object frcInfoLock = new java.lang.Object();
    private final java.lang.Object backoffMetadataLock = new java.lang.Object();
    private final java.lang.Object realtimeBackoffMetadataLock = new java.lang.Object();
    private final java.lang.Object customSignalsLock = new java.lang.Object();

    public ConfigSharedPrefsClient(android.content.SharedPreferences sharedPreferences) {
        this.frcSharedPrefs = sharedPreferences;
    }

    public long getFetchTimeoutInSeconds() {
        return this.frcSharedPrefs.getLong(FETCH_TIMEOUT_IN_SECONDS_KEY, 60L);
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.frcSharedPrefs.getLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, com.google.firebase.remoteconfig.internal.ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    int getLastFetchStatus() {
        return this.frcSharedPrefs.getInt(LAST_FETCH_STATUS_KEY, 0);
    }

    java.util.Date getLastSuccessfulFetchTime() {
        return new java.util.Date(this.frcSharedPrefs.getLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, -1L));
    }

    java.lang.String getLastFetchETag() {
        return this.frcSharedPrefs.getString(LAST_FETCH_ETAG_KEY, null);
    }

    long getLastTemplateVersion() {
        return this.frcSharedPrefs.getLong(LAST_TEMPLATE_VERSION, 0L);
    }

    public com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo getInfo() {
        com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl build;
        synchronized (this.frcInfoLock) {
            long j = this.frcSharedPrefs.getLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, -1L);
            int i = this.frcSharedPrefs.getInt(LAST_FETCH_STATUS_KEY, 0);
            build = com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl.newBuilder().withLastFetchStatus(i).withLastSuccessfulFetchTimeInMillis(j).withConfigSettings(new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.frcSharedPrefs.getLong(FETCH_TIMEOUT_IN_SECONDS_KEY, 60L)).setMinimumFetchIntervalInSeconds(this.frcSharedPrefs.getLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, com.google.firebase.remoteconfig.internal.ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return build;
    }

    public void clear() {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().clear().commit();
        }
    }

    public void setConfigSettings(com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putLong(FETCH_TIMEOUT_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putLong(FETCH_TIMEOUT_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }

    void updateLastFetchAsSuccessfulAt(java.util.Date date) {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putInt(LAST_FETCH_STATUS_KEY, -1).putLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, date.getTime()).apply();
        }
    }

    void updateLastFetchAsFailed() {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putInt(LAST_FETCH_STATUS_KEY, 1).apply();
        }
    }

    void updateLastFetchAsThrottled() {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putInt(LAST_FETCH_STATUS_KEY, 2).apply();
        }
    }

    void setLastFetchETag(java.lang.String str) {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putString(LAST_FETCH_ETAG_KEY, str).apply();
        }
    }

    void setLastTemplateVersion(long j) {
        synchronized (this.frcInfoLock) {
            this.frcSharedPrefs.edit().putLong(LAST_TEMPLATE_VERSION, j).apply();
        }
    }

    com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.BackoffMetadata getBackoffMetadata() {
        com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.BackoffMetadata backoffMetadata;
        synchronized (this.backoffMetadataLock) {
            backoffMetadata = new com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.BackoffMetadata(this.frcSharedPrefs.getInt(NUM_FAILED_FETCHES_KEY, 0), new java.util.Date(this.frcSharedPrefs.getLong(BACKOFF_END_TIME_IN_MILLIS_KEY, -1L)));
        }
        return backoffMetadata;
    }

    void setBackoffMetadata(int i, java.util.Date date) {
        synchronized (this.backoffMetadataLock) {
            this.frcSharedPrefs.edit().putInt(NUM_FAILED_FETCHES_KEY, i).putLong(BACKOFF_END_TIME_IN_MILLIS_KEY, date.getTime()).apply();
        }
    }

    public void setCustomSignals(java.util.Map<java.lang.String, java.lang.String> map) {
        synchronized (this.customSignalsLock) {
            java.util.Map<java.lang.String, java.lang.String> customSignals = getCustomSignals();
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    if (z) {
                        if (customSignals.size() > 100) {
                            android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, java.lang.String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100));
                            return;
                        }
                        this.frcSharedPrefs.edit().putString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, new org.json.JSONObject(customSignals).toString()).commit();
                        android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Keys of updated custom signals: " + getCustomSignals().keySet());
                        return;
                    }
                    return;
                }
                java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                java.lang.String key = next.getKey();
                java.lang.String value = next.getValue();
                if (key.length() > 250 || (value != null && value.length() > 500)) {
                    break;
                }
                if (value != null) {
                    z |= !java.util.Objects.equals(customSignals.put(key, value), value);
                } else {
                    if (customSignals.remove(key) == null) {
                        z2 = false;
                    }
                    z |= z2;
                }
            }
            android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, java.lang.String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500));
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomSignals() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.frcSharedPrefs.getString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, "{}"));
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (org.json.JSONException unused) {
            return new java.util.HashMap();
        }
    }

    void resetBackoff() {
        setBackoffMetadata(0, NO_BACKOFF_TIME);
    }

    static class BackoffMetadata {
        private java.util.Date backoffEndTime;
        private int numFailedFetches;

        BackoffMetadata(int i, java.util.Date date) {
            this.numFailedFetches = i;
            this.backoffEndTime = date;
        }

        int getNumFailedFetches() {
            return this.numFailedFetches;
        }

        java.util.Date getBackoffEndTime() {
            return this.backoffEndTime;
        }
    }

    public com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.RealtimeBackoffMetadata getRealtimeBackoffMetadata() {
        com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.realtimeBackoffMetadataLock) {
            realtimeBackoffMetadata = new com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.RealtimeBackoffMetadata(this.frcSharedPrefs.getInt(NUM_FAILED_REALTIME_STREAMS_KEY, 0), new java.util.Date(this.frcSharedPrefs.getLong(REALTIME_BACKOFF_END_TIME_IN_MILLIS_KEY, -1L)));
        }
        return realtimeBackoffMetadata;
    }

    void setRealtimeBackoffMetadata(int i, java.util.Date date) {
        synchronized (this.realtimeBackoffMetadataLock) {
            this.frcSharedPrefs.edit().putInt(NUM_FAILED_REALTIME_STREAMS_KEY, i).putLong(REALTIME_BACKOFF_END_TIME_IN_MILLIS_KEY, date.getTime()).apply();
        }
    }

    void resetRealtimeBackoff() {
        setRealtimeBackoffMetadata(0, NO_BACKOFF_TIME);
    }

    public static class RealtimeBackoffMetadata {
        private java.util.Date backoffEndTime;
        private int numFailedStreams;

        public RealtimeBackoffMetadata(int i, java.util.Date date) {
            this.numFailedStreams = i;
            this.backoffEndTime = date;
        }

        int getNumFailedStreams() {
            return this.numFailedStreams;
        }

        java.util.Date getBackoffEndTime() {
            return this.backoffEndTime;
        }
    }
}
