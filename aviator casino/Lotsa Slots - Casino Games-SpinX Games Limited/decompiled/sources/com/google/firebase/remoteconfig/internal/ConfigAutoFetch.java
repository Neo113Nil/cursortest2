package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigAutoFetch {
    private static final int MAXIMUM_FETCH_ATTEMPTS = 3;
    private static final java.lang.String REALTIME_DISABLED_KEY = "featureDisabled";
    private static final java.lang.String TEMPLATE_VERSION_KEY = "latestTemplateVersionNumber";
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedCache;
    private final com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler;
    private final java.util.Set<com.google.firebase.remoteconfig.ConfigUpdateListener> eventListeners;
    private final java.net.HttpURLConnection httpURLConnection;
    private final com.google.firebase.remoteconfig.ConfigUpdateListener retryCallback;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
    private final java.util.Random random = new java.util.Random();
    private boolean isInBackground = false;

    public ConfigAutoFetch(java.net.HttpURLConnection httpURLConnection, com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, java.util.Set<com.google.firebase.remoteconfig.ConfigUpdateListener> set, com.google.firebase.remoteconfig.ConfigUpdateListener configUpdateListener, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.httpURLConnection = httpURLConnection;
        this.configFetchHandler = configFetchHandler;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private synchronized void propagateErrors(com.google.firebase.remoteconfig.FirebaseRemoteConfigException firebaseRemoteConfigException) {
        java.util.Iterator<com.google.firebase.remoteconfig.ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void executeAllListenerCallbacks(com.google.firebase.remoteconfig.ConfigUpdate configUpdate) {
        java.util.Iterator<com.google.firebase.remoteconfig.ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(configUpdate);
        }
    }

    private synchronized boolean isEventListenersEmpty() {
        return this.eventListeners.isEmpty();
    }

    public void setIsInBackground(boolean z) {
        this.isInBackground = z;
    }

    private java.lang.String parseAndValidateConfigUpdateMessage(java.lang.String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0018 -> B:11:0x002d). Please report as a decompilation issue!!! */
    public void listenForNotifications() {
        java.net.HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection == null) {
            return;
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    handleNotifications(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (java.io.IOException e2) {
                if (!this.isInBackground) {
                    android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream == null) {
                } else {
                    inputStream.close();
                }
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e3) {
                    android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r4 = new org.json.JSONObject(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r4.has(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.REALTIME_DISABLED_KEY) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r4.getBoolean(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.REALTIME_DISABLED_KEY) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r8.retryCallback.onError(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (isEventListenersEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r4.has(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.TEMPLATE_VERSION_KEY) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r5 = r8.configFetchHandler.getTemplateVersionNumber();
        r3 = r4.getLong(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.TEMPLATE_VERSION_KEY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r3 <= r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        autoFetch(3, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleNotifications(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.ironsource.B5.O));
        loop0: while (true) {
            java.lang.String str = "";
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                str = str + readLine;
                if (readLine.contains("}")) {
                    str = parseAndValidateConfigUpdateMessage(str);
                    if (!str.isEmpty()) {
                        try {
                            break;
                        } catch (org.json.JSONException e) {
                            propagateErrors(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause(), com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
                            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Unable to parse latest config update message.", e);
                        }
                    }
                }
            }
        }
        bufferedReader.close();
    }

    private void autoFetch(final int i, final long j) {
        if (i == 0) {
            propagateErrors(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
                @Override // java.lang.Runnable
                public void run() {
                    com.google.firebase.remoteconfig.internal.ConfigAutoFetch.this.fetchLatestConfig(i, j);
                }
            }, this.random.nextInt(4), java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    public synchronized com.google.android.gms.tasks.Task<java.lang.Void> fetchLatestConfig(int i, final long j) {
        final int i2;
        final com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse> fetchNowWithTypeAndAttemptNumber;
        final com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task;
        i2 = i - 1;
        fetchNowWithTypeAndAttemptNumber = this.configFetchHandler.fetchNowWithTypeAndAttemptNumber(com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
        task = this.activatedCache.get();
        return com.google.android.gms.tasks.Tasks.whenAllComplete((com.google.android.gms.tasks.Task<?>[]) new com.google.android.gms.tasks.Task[]{fetchNowWithTypeAndAttemptNumber, task}).continueWithTask(this.scheduledExecutorService, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return com.google.firebase.remoteconfig.internal.ConfigAutoFetch.this.m5580xc4c7076e(fetchNowWithTypeAndAttemptNumber, task, j, i2, task2);
            }
        });
    }

    /* renamed from: lambda$fetchLatestConfig$0$com-google-firebase-remoteconfig-internal-ConfigAutoFetch, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5580xc4c7076e(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2, long j, int i, com.google.android.gms.tasks.Task task3) throws java.lang.Exception {
        if (!task.isSuccessful()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetchResponse = (com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse) task.getResult();
        com.google.firebase.remoteconfig.internal.ConfigContainer configContainer = (com.google.firebase.remoteconfig.internal.ConfigContainer) task2.getResult();
        if (!fetchResponseIsUpToDate(fetchResponse, j).booleanValue()) {
            android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Fetched template version is the same as SDK's current version. Retrying fetch.");
            autoFetch(i, j);
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        if (fetchResponse.getFetchedConfigs() == null) {
            android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "The fetch succeeded, but the backend had no updates.");
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        if (configContainer == null) {
            configContainer = com.google.firebase.remoteconfig.internal.ConfigContainer.newBuilder().build();
        }
        java.util.Set<java.lang.String> changedParams = configContainer.getChangedParams(fetchResponse.getFetchedConfigs());
        if (changedParams.isEmpty()) {
            android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Config was fetched, but no params changed.");
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        executeAllListenerCallbacks(com.google.firebase.remoteconfig.ConfigUpdate.create(changedParams));
        return com.google.android.gms.tasks.Tasks.forResult(null);
    }

    private static java.lang.Boolean fetchResponseIsUpToDate(com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetchResponse, long j) {
        if (fetchResponse.getFetchedConfigs() != null) {
            return java.lang.Boolean.valueOf(fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j);
        }
        return java.lang.Boolean.valueOf(fetchResponse.getStatus() == 1);
    }
}
