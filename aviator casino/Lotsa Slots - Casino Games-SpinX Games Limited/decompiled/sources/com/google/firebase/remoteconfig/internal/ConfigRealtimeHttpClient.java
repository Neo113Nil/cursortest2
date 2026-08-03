package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigRealtimeHttpClient {
    private static final java.lang.String API_KEY_HEADER = "X-Goog-Api-Key";
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final java.util.regex.Pattern GMP_APP_ID_PATTERN = java.util.regex.Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final java.lang.String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final java.lang.String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final java.lang.String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final java.lang.String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final java.lang.String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedCache;
    private com.google.firebase.remoteconfig.internal.ConfigAutoFetch configAutoFetch;
    private final com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler;
    private final android.content.Context context;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private java.net.HttpURLConnection httpURLConnection;
    private final java.util.Set<com.google.firebase.remoteconfig.ConfigUpdateListener> listeners;
    private final java.lang.String namespace;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
    private final com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient sharedPrefsClient;
    private final int ORIGINAL_RETRIES = 8;
    private boolean isHttpConnectionRunning = false;
    private final java.util.Random random = new java.util.Random();
    private final com.google.android.gms.common.util.Clock clock = com.google.android.gms.common.util.DefaultClock.getInstance();
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;
    private final java.lang.Object backgroundLock = new java.lang.Object();

    private boolean isStatusCodeRetryable(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public ConfigRealtimeHttpClient(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, android.content.Context context, java.lang.String str, java.util.Set<com.google.firebase.remoteconfig.ConfigUpdateListener> set, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = java.lang.Math.max(8 - configSharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.sharedPrefsClient = configSharedPrefsClient;
    }

    private static java.lang.String extractProjectNumberFromAppId(java.lang.String str) {
        java.util.regex.Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private java.lang.String getFingerprintHashForPackage() {
        try {
            android.content.Context context = this.context;
            byte[] packageCertificateHashBytes = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return com.google.android.gms.common.util.Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.i(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "No such package: " + this.context.getPackageName());
            return null;
        }
    }

    private void setCommonRequestHeaders(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, "true");
        httpURLConnection.setRequestProperty("Content-Type", com.ironsource.B5.M);
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT, com.ironsource.B5.M);
    }

    private org.json.JSONObject createRequestBody(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        hashMap.put("namespace", this.namespace);
        hashMap.put("lastKnownVersionNumber", java.lang.Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, this.firebaseApp.getOptions().getApplicationId());
        hashMap.put("sdkVersion", com.google.firebase.remoteconfig.BuildConfig.VERSION_NAME);
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new org.json.JSONObject(hashMap);
    }

    public void setRequestParams(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        httpURLConnection.setRequestMethod("POST");
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes(com.ironsource.B5.O);
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void propagateErrors(com.google.firebase.remoteconfig.FirebaseRemoteConfigException firebaseRemoteConfigException) {
        java.util.Iterator<com.google.firebase.remoteconfig.ConfigUpdateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    public int getNumberOfFailedStreams() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams();
    }

    public java.util.Date getBackoffEndTime() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime();
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(java.util.Date date) {
        int numFailedStreams = this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.sharedPrefsClient.setRealtimeBackoffMetadata(numFailedStreams, new java.util.Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int length = BACKOFF_TIME_DURATIONS_IN_MINUTES.length;
        if (i >= length) {
            i = length;
        }
        return (java.util.concurrent.TimeUnit.MINUTES.toMillis(r0[i - 1]) / 2) + this.random.nextInt((int) r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableBackoff() {
        this.isRealtimeDisabled = true;
    }

    private synchronized boolean canMakeHttpStreamConnection() {
        boolean z;
        if (!this.listeners.isEmpty() && !this.isHttpConnectionRunning && !this.isRealtimeDisabled) {
            z = this.isInBackground ? false : true;
        }
        return z;
    }

    private java.lang.String getRealtimeURL(java.lang.String str) {
        return java.lang.String.format(com.google.firebase.remoteconfig.RemoteConfigConstants.REALTIME_REGEX_URL, extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), str);
    }

    private java.net.URL getUrl() {
        try {
            return new java.net.URL(getRealtimeURL(this.namespace));
        } catch (java.net.MalformedURLException unused) {
            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "URL is malformed");
            return null;
        }
    }

    public com.google.android.gms.tasks.Task<java.net.HttpURLConnection> createRealtimeConnection() {
        final com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        final com.google.android.gms.tasks.Task<java.lang.String> id = this.firebaseInstallations.getId();
        return com.google.android.gms.tasks.Tasks.whenAllComplete((com.google.android.gms.tasks.Task<?>[]) new com.google.android.gms.tasks.Task[]{token, id}).continueWithTask(this.scheduledExecutorService, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.this.m5588xad28ecdf(token, id, task);
            }
        });
    }

    /* renamed from: lambda$createRealtimeConnection$0$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5588xad28ecdf(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2, com.google.android.gms.tasks.Task task3) throws java.lang.Exception {
        if (!task.isSuccessful()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) getUrl().openConnection();
            setRequestParams(httpURLConnection, (java.lang.String) task2.getResult(), ((com.google.firebase.installations.InstallationTokenResult) task.getResult()).getToken());
            return com.google.android.gms.tasks.Tasks.forResult(httpURLConnection);
        } catch (java.io.IOException e) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0L);
    }

    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        makeRealtimeHttpConnection(java.lang.Math.max(0L, this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new java.util.Date(this.clock.currentTimeMillis()).getTime()));
    }

    private synchronized void makeRealtimeHttpConnection(long j) {
        if (canMakeHttpStreamConnection()) {
            int i = this.httpRetriesRemaining;
            if (i > 0) {
                this.httpRetriesRemaining = i - 1;
                this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                    }
                }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } else if (!this.isInBackground) {
                propagateErrors(new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
            }
        }
    }

    public void setIsInBackground(boolean z) {
        java.net.HttpURLConnection httpURLConnection;
        synchronized (this.backgroundLock) {
            this.isInBackground = z;
            com.google.firebase.remoteconfig.internal.ConfigAutoFetch configAutoFetch = this.configAutoFetch;
            if (configAutoFetch != null) {
                configAutoFetch.setIsInBackground(z);
            }
            if (android.os.Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = this.httpURLConnection) != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private synchronized void resetRetryCount() {
        this.httpRetriesRemaining = 8;
    }

    private synchronized boolean checkAndSetHttpConnectionFlagIfNotRunning() {
        boolean canMakeHttpStreamConnection;
        canMakeHttpStreamConnection = canMakeHttpStreamConnection();
        if (canMakeHttpStreamConnection) {
            setIsHttpConnectionRunning(true);
        }
        return canMakeHttpStreamConnection;
    }

    private synchronized void setIsHttpConnectionRunning(boolean z) {
        this.isHttpConnectionRunning = z;
    }

    public synchronized com.google.firebase.remoteconfig.internal.ConfigAutoFetch startAutoFetch(java.net.HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new com.google.firebase.remoteconfig.ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(com.google.firebase.remoteconfig.ConfigUpdate configUpdate) {
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(com.google.firebase.remoteconfig.FirebaseRemoteConfigException firebaseRemoteConfigException) {
                com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.this.enableBackoff();
                com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
            }
        }, this.scheduledExecutorService);
    }

    private java.lang.String parseForbiddenErrorResponseMessage(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (java.io.IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public void beginRealtimeHttpStream() {
        if (checkAndSetHttpConnectionFlagIfNotRunning()) {
            if (new java.util.Date(this.clock.currentTimeMillis()).before(this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                final com.google.android.gms.tasks.Task<java.net.HttpURLConnection> createRealtimeConnection = createRealtimeConnection();
                com.google.android.gms.tasks.Tasks.whenAllComplete((com.google.android.gms.tasks.Task<?>[]) new com.google.android.gms.tasks.Task[]{createRealtimeConnection}).continueWith(this.scheduledExecutorService, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.Continuation
                    public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                        return com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.this.m5587x5fb1dc1(createRealtimeConnection, task);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (isStatusCodeRetryable(r6) != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[Catch: all -> 0x0135, TryCatch #2 {all -> 0x0135, blocks: (B:11:0x002b, B:13:0x0030, B:37:0x00c6, B:39:0x00ca, B:56:0x00ce), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #2 {all -> 0x0135, blocks: (B:11:0x002b, B:13:0x0030, B:37:0x00c6, B:39:0x00ca, B:56:0x00ce), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Integer, java.lang.Object] */
    /* renamed from: lambda$beginRealtimeHttpStream$1$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ com.google.android.gms.tasks.Task m5587x5fb1dc1(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2) throws java.lang.Exception {
        java.io.InputStream inputStream;
        java.lang.Integer num;
        java.lang.Throwable th;
        ?? r7;
        boolean z;
        com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int responseCode;
        boolean z2;
        try {
            try {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.IOException e) {
            e = e;
            task = 0;
            inputStream = null;
        } catch (java.lang.Throwable th3) {
            inputStream = null;
            num = null;
            th = th3;
            task = 0;
        }
        if (!task.isSuccessful()) {
            throw new java.io.IOException(task.getException());
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) task.getResult();
        this.httpURLConnection = httpURLConnection;
        task = httpURLConnection.getInputStream();
        try {
            inputStream = this.httpURLConnection.getErrorStream();
            try {
                responseCode = this.httpURLConnection.getResponseCode();
                r7 = java.lang.Integer.valueOf(responseCode);
                try {
                    r7.getClass();
                    if (responseCode == 200) {
                        resetRetryCount();
                        this.sharedPrefsClient.resetRealtimeBackoff();
                        com.google.firebase.remoteconfig.internal.ConfigAutoFetch startAutoFetch = startAutoFetch(this.httpURLConnection);
                        this.configAutoFetch = startAutoFetch;
                        startAutoFetch.listenForNotifications();
                    }
                    closeRealtimeHttpConnection(task, inputStream);
                    setIsHttpConnectionRunning(false);
                } catch (java.io.IOException e2) {
                    e = e2;
                    if (this.isInBackground) {
                        android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Exception connecting to real-time RC backend. Retrying the connection...", e);
                    } else {
                        resetRetryCount();
                    }
                    closeRealtimeHttpConnection(task, inputStream);
                    setIsHttpConnectionRunning(false);
                    z = this.isInBackground && (r7 == 0 || isStatusCodeRetryable(r7.intValue()));
                    if (z) {
                        updateBackoffMetadataWithLastFailedStreamConnectionTime(new java.util.Date(this.clock.currentTimeMillis()));
                    }
                    if (!z && r7.intValue() != 200) {
                        java.lang.String format = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new java.lang.Object[]{r7});
                        if (r7.intValue() == 403) {
                            format = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                        }
                        firebaseRemoteConfigServerException = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(r7.intValue(), format, com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                        propagateErrors(firebaseRemoteConfigServerException);
                        this.httpURLConnection = null;
                        this.configAutoFetch = null;
                        return com.google.android.gms.tasks.Tasks.forResult(null);
                    }
                    retryHttpConnectionWhenBackoffEnds();
                    this.httpURLConnection = null;
                    this.configAutoFetch = null;
                    return com.google.android.gms.tasks.Tasks.forResult(null);
                }
            } catch (java.io.IOException e3) {
                e = e3;
                r7 = 0;
            } catch (java.lang.Throwable th4) {
                num = null;
                th = th4;
                closeRealtimeHttpConnection(task, inputStream);
                setIsHttpConnectionRunning(false);
                boolean z3 = !this.isInBackground && (num == null || isStatusCodeRetryable(num.intValue()));
                if (z3) {
                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new java.util.Date(this.clock.currentTimeMillis()));
                }
                if (z3 || num.intValue() == 200) {
                    retryHttpConnectionWhenBackoffEnds();
                } else {
                    java.lang.String format2 = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format2 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                    }
                    propagateErrors(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(num.intValue(), format2, com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
        } catch (java.io.IOException e4) {
            e = e4;
            inputStream = null;
            task = task;
            r7 = inputStream;
            if (this.isInBackground) {
            }
            closeRealtimeHttpConnection(task, inputStream);
            setIsHttpConnectionRunning(false);
            if (this.isInBackground) {
            }
            if (z) {
            }
            if (!z) {
                java.lang.String format3 = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new java.lang.Object[]{r7});
                if (r7.intValue() == 403) {
                }
                firebaseRemoteConfigServerException = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(r7.intValue(), format3, com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                propagateErrors(firebaseRemoteConfigServerException);
                this.httpURLConnection = null;
                this.configAutoFetch = null;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
            retryHttpConnectionWhenBackoffEnds();
            this.httpURLConnection = null;
            this.configAutoFetch = null;
            return com.google.android.gms.tasks.Tasks.forResult(null);
        } catch (java.lang.Throwable th5) {
            num = null;
            th = th5;
            inputStream = null;
        }
        if (!this.isInBackground) {
            if (r7 != 0) {
                r7.getClass();
            }
            z2 = true;
            if (z2) {
                updateBackoffMetadataWithLastFailedStreamConnectionTime(new java.util.Date(this.clock.currentTimeMillis()));
            }
            if (!z2) {
                r7.getClass();
                if (responseCode != 200) {
                    java.lang.String format4 = java.lang.String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new java.lang.Object[]{r7});
                    r7.getClass();
                    if (responseCode == 403) {
                        format4 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                    }
                    r7.getClass();
                    firebaseRemoteConfigServerException = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(responseCode, format4, com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                    propagateErrors(firebaseRemoteConfigServerException);
                    this.httpURLConnection = null;
                    this.configAutoFetch = null;
                    return com.google.android.gms.tasks.Tasks.forResult(null);
                }
            }
            retryHttpConnectionWhenBackoffEnds();
            this.httpURLConnection = null;
            this.configAutoFetch = null;
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        z2 = false;
        if (z2) {
        }
        if (!z2) {
        }
        retryHttpConnectionWhenBackoffEnds();
        this.httpURLConnection = null;
        this.configAutoFetch = null;
        return com.google.android.gms.tasks.Tasks.forResult(null);
    }

    private void closeHttpConnectionInputStream(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Error closing connection stream.", e);
            }
        }
    }

    public void closeRealtimeHttpConnection(java.io.InputStream inputStream, java.io.InputStream inputStream2) {
        java.net.HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection != null && !this.isInBackground) {
            httpURLConnection.disconnect();
        }
        closeHttpConnectionInputStream(inputStream);
        closeHttpConnectionInputStream(inputStream2);
    }
}
