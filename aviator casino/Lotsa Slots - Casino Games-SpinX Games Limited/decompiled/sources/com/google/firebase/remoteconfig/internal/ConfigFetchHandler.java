package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigFetchHandler {
    static final java.lang.String FIRST_OPEN_TIME_KEY = "_fot";
    static final int HTTP_TOO_MANY_REQUESTS = 429;
    private static final java.lang.String X_FIREBASE_RC_FETCH_TYPE = "X-Firebase-RC-Fetch-Type";
    private final com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnector;
    private final com.google.android.gms.common.util.Clock clock;
    private final java.util.Map<java.lang.String, java.lang.String> customHttpHeaders;
    private final java.util.concurrent.Executor executor;
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient fetchedConfigsCache;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient frcBackendApiClient;
    private final com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient frcSharedPrefs;
    private final java.util.Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = java.util.concurrent.TimeUnit.HOURS.toSeconds(12);
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    private boolean isThrottleableServerError(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    public ConfigFetchHandler(com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider, java.util.concurrent.Executor executor, com.google.android.gms.common.util.Clock clock, java.util.Random random, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient configFetchHttpClient, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient, java.util.Map<java.lang.String, java.lang.String> map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.customHttpHeaders = map;
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> fetch() {
        return fetch(this.frcSharedPrefs.getMinimumFetchIntervalInSeconds());
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> fetch(final long j) {
        final java.util.HashMap hashMap = new java.util.HashMap(this.customHttpHeaders);
        hashMap.put(X_FIREBASE_RC_FETCH_TYPE, com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchType.BASE.getValue() + "/1");
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.firebase.remoteconfig.internal.ConfigFetchHandler.this.m5583x7459e696(j, hashMap, task);
            }
        });
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> fetchNowWithTypeAndAttemptNumber(com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchType fetchType, int i) {
        final java.util.HashMap hashMap = new java.util.HashMap(this.customHttpHeaders);
        hashMap.put(X_FIREBASE_RC_FETCH_TYPE, fetchType.getValue() + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + i);
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.firebase.remoteconfig.internal.ConfigFetchHandler.this.m5586xdbe8963a(hashMap, task);
            }
        });
    }

    /* renamed from: lambda$fetchNowWithTypeAndAttemptNumber$1$com-google-firebase-remoteconfig-internal-ConfigFetchHandler, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5586xdbe8963a(java.util.Map map, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return m5583x7459e696(task, 0L, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchIfCacheExpiredAndNotThrottled, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> m5583x7459e696(com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task, long j, final java.util.Map<java.lang.String, java.lang.String> map) {
        com.google.android.gms.tasks.Task continueWithTask;
        final java.util.Date date = new java.util.Date(this.clock.currentTimeMillis());
        if (task.isSuccessful() && areCachedFetchConfigsValid(j, date)) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse.forLocalStorageUsed(date));
        }
        java.util.Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            continueWithTask = com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
        } else {
            final com.google.android.gms.tasks.Task<java.lang.String> id = this.firebaseInstallations.getId();
            final com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
            continueWithTask = com.google.android.gms.tasks.Tasks.whenAllComplete((com.google.android.gms.tasks.Task<?>[]) new com.google.android.gms.tasks.Task[]{id, token}).continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                    return com.google.firebase.remoteconfig.internal.ConfigFetchHandler.this.m5584x5d615250(id, token, date, map, task2);
                }
            });
        }
        return continueWithTask.continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return com.google.firebase.remoteconfig.internal.ConfigFetchHandler.this.m5585xf19fc1ef(date, task2);
            }
        });
    }

    /* renamed from: lambda$fetchIfCacheExpiredAndNotThrottled$2$com-google-firebase-remoteconfig-internal-ConfigFetchHandler, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5584x5d615250(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2, java.util.Date date, java.util.Map map, com.google.android.gms.tasks.Task task3) throws java.lang.Exception {
        if (!task.isSuccessful()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return fetchFromBackendAndCacheResponse((java.lang.String) task.getResult(), ((com.google.firebase.installations.InstallationTokenResult) task2.getResult()).getToken(), date, map);
    }

    /* renamed from: lambda$fetchIfCacheExpiredAndNotThrottled$3$com-google-firebase-remoteconfig-internal-ConfigFetchHandler, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5585xf19fc1ef(java.util.Date date, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        updateLastFetchStatusAndTime(task, date);
        return task;
    }

    private boolean areCachedFetchConfigsValid(long j, java.util.Date date) {
        java.util.Date lastSuccessfulFetchTime = this.frcSharedPrefs.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new java.util.Date(lastSuccessfulFetchTime.getTime() + java.util.concurrent.TimeUnit.SECONDS.toMillis(j)));
    }

    private java.util.Date getBackoffEndTimeInMillis(java.util.Date date) {
        java.util.Date backoffEndTime = this.frcSharedPrefs.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    private java.lang.String createThrottledMessage(long j) {
        return java.lang.String.format("Fetch is throttled. Please wait before calling fetch again: %s", android.text.format.DateUtils.formatElapsedTime(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    private com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> fetchFromBackendAndCacheResponse(java.lang.String str, java.lang.String str2, java.util.Date date, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            final com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetchFromBackend = fetchFromBackend(str, str2, date, map);
            if (fetchFromBackend.getStatus() != 0) {
                return com.google.android.gms.tasks.Tasks.forResult(fetchFromBackend);
            }
            return this.fetchedConfigsCache.put(fetchFromBackend.getFetchedConfigs()).onSuccessTask(this.executor, new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigFetchHandler$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                    com.google.android.gms.tasks.Task forResult;
                    forResult = com.google.android.gms.tasks.Tasks.forResult(com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse.this);
                    return forResult;
                }
            });
        } catch (com.google.firebase.remoteconfig.FirebaseRemoteConfigException e) {
            return com.google.android.gms.tasks.Tasks.forException(e);
        }
    }

    private com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetchFromBackend(java.lang.String str, java.lang.String str2, java.util.Date date, java.util.Map<java.lang.String, java.lang.String> map) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        try {
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcSharedPrefs.getLastFetchETag(), map, getFirstOpenTime(), date, this.frcSharedPrefs.getCustomSignals());
            if (fetch.getFetchedConfigs() != null) {
                this.frcSharedPrefs.setLastTemplateVersion(fetch.getFetchedConfigs().getTemplateVersionNumber());
            }
            if (fetch.getLastFetchETag() != null) {
                this.frcSharedPrefs.setLastFetchETag(fetch.getLastFetchETag());
            }
            this.frcSharedPrefs.resetBackoff();
            return fetch;
        } catch (com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException e) {
            com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.BackoffMetadata updateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(e.getHttpStatusCode(), date);
            if (shouldThrottle(updateAndReturnBackoffMetadata, e.getHttpStatusCode())) {
                throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException(updateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
            }
            throw createExceptionWithGenericMessage(e);
        }
    }

    private com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException createExceptionWithGenericMessage(com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException {
        java.lang.String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == 429) {
                throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (httpStatusCode == 500) {
                str = "There was an internal server error.";
            } else {
                switch (httpStatusCode) {
                    case com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /* 502 */:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            }
        }
        return new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: ".concat(str), firebaseRemoteConfigServerException);
    }

    private com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.BackoffMetadata updateAndReturnBackoffMetadata(int i, java.util.Date date) {
        if (isThrottleableServerError(i)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcSharedPrefs.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(java.util.Date date) {
        int numFailedFetches = this.frcSharedPrefs.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcSharedPrefs.setBackoffMetadata(numFailedFetches, new java.util.Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        return (timeUnit.toMillis(iArr[java.lang.Math.min(i, iArr.length) - 1]) / 2) + this.randomGenerator.nextInt((int) r0);
    }

    private boolean shouldThrottle(com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient.BackoffMetadata backoffMetadata, int i) {
        return backoffMetadata.getNumFailedFetches() > 1 || i == 429;
    }

    private void updateLastFetchStatusAndTime(com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> task, java.util.Date date) {
        if (task.isSuccessful()) {
            this.frcSharedPrefs.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        java.lang.Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException) {
            this.frcSharedPrefs.updateLastFetchAsThrottled();
        } else {
            this.frcSharedPrefs.updateLastFetchAsFailed();
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> getUserProperties() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return hashMap;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private java.lang.Long getFirstOpenTime() {
        com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (java.lang.Long) analyticsConnector.getUserProperties(true).get(FIRST_OPEN_TIME_KEY);
    }

    public long getTemplateVersionNumber() {
        return this.frcSharedPrefs.getLastTemplateVersion();
    }

    public com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> getAnalyticsConnector() {
        return this.analyticsConnector;
    }

    public static class FetchResponse {
        private final java.util.Date fetchTime;
        private final com.google.firebase.remoteconfig.internal.ConfigContainer fetchedConfigs;
        private final java.lang.String lastFetchETag;
        private final int status;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(java.util.Date date, int i, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer, java.lang.String str) {
            this.fetchTime = date;
            this.status = i;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }

        public static com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse forBackendUpdatesFetched(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer, java.lang.String str) {
            return new com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse forBackendHasNoUpdates(java.util.Date date, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
            return new com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse(date, 1, configContainer, null);
        }

        public static com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse forLocalStorageUsed(java.util.Date date) {
            return new com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse(date, 2, null, null);
        }

        java.util.Date getFetchTime() {
            return this.fetchTime;
        }

        java.lang.String getLastFetchETag() {
            return this.lastFetchETag;
        }

        int getStatus() {
            return this.status;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final java.lang.String value;

        FetchType(java.lang.String str) {
            this.value = str;
        }

        java.lang.String getValue() {
            return this.value;
        }
    }
}
