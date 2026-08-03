package com.google.firebase.installations;

/* loaded from: classes3.dex */
public class FirebaseInstallations implements com.google.firebase.installations.FirebaseInstallationsApi {
    private static final java.lang.String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final java.lang.String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final java.lang.String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final java.lang.String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
    private static final java.lang.String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final java.lang.String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private final java.util.concurrent.ExecutorService backgroundExecutor;
    private java.lang.String cachedFid;
    private final com.google.firebase.installations.RandomFidGenerator fidGenerator;
    private java.util.Set<com.google.firebase.installations.internal.FidListener> fidListeners;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.components.Lazy<com.google.firebase.installations.local.IidStore> iidStore;
    private final java.util.List<com.google.firebase.installations.StateListener> listeners;
    private final java.lang.Object lock;
    private final java.util.concurrent.Executor networkExecutor;
    private final com.google.firebase.installations.local.PersistedInstallation persistedInstallation;
    private final com.google.firebase.installations.remote.FirebaseInstallationServiceClient serviceClient;
    private final com.google.firebase.installations.Utils utils;
    private static final java.lang.Object lockGenerateFid = new java.lang.Object();
    private static final java.util.concurrent.ThreadFactory THREAD_FACTORY = new java.util.concurrent.ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
        private final java.util.concurrent.atomic.AtomicInteger mCount = new java.util.concurrent.atomic.AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new java.lang.Thread(runnable, java.lang.String.format("firebase-installations-executor-%d", java.lang.Integer.valueOf(this.mCount.getAndIncrement())));
        }
    };

    FirebaseInstallations(final com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> provider, java.util.concurrent.ExecutorService executorService, java.util.concurrent.Executor executor) {
        this(executorService, executor, firebaseApp, new com.google.firebase.installations.remote.FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider), new com.google.firebase.installations.local.PersistedInstallation(firebaseApp), com.google.firebase.installations.Utils.getInstance(), new com.google.firebase.components.Lazy(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return com.google.firebase.installations.FirebaseInstallations.lambda$new$0(com.google.firebase.FirebaseApp.this);
            }
        }), new com.google.firebase.installations.RandomFidGenerator());
    }

    static /* synthetic */ com.google.firebase.installations.local.IidStore lambda$new$0(com.google.firebase.FirebaseApp firebaseApp) {
        return new com.google.firebase.installations.local.IidStore(firebaseApp);
    }

    FirebaseInstallations(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Executor executor, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.remote.FirebaseInstallationServiceClient firebaseInstallationServiceClient, com.google.firebase.installations.local.PersistedInstallation persistedInstallation, com.google.firebase.installations.Utils utils, com.google.firebase.components.Lazy<com.google.firebase.installations.local.IidStore> lazy, com.google.firebase.installations.RandomFidGenerator randomFidGenerator) {
        this.lock = new java.lang.Object();
        this.fidListeners = new java.util.HashSet();
        this.listeners = new java.util.ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = lazy;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = executor;
    }

    private void preConditionChecks() {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(getApplicationId(), APP_ID_VALIDATION_MSG);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(getProjectIdentifier(), PROJECT_ID_VALIDATION_MSG);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(getApiKey(), API_KEY_VALIDATION_MSG);
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.firebase.installations.Utils.isValidAppIdFormat(getApplicationId()), APP_ID_VALIDATION_MSG);
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.firebase.installations.Utils.isValidApiKeyFormat(getApiKey()), API_KEY_VALIDATION_MSG);
    }

    java.lang.String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    public static com.google.firebase.installations.FirebaseInstallations getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    public static com.google.firebase.installations.FirebaseInstallations getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (com.google.firebase.installations.FirebaseInstallations) firebaseApp.get(com.google.firebase.installations.FirebaseInstallationsApi.class);
    }

    java.lang.String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    java.lang.String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    java.lang.String getName() {
        return this.firebaseApp.getName();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<java.lang.String> getId() {
        preConditionChecks();
        java.lang.String cacheFid = getCacheFid();
        if (cacheFid != null) {
            return com.google.android.gms.tasks.Tasks.forResult(cacheFid);
        }
        com.google.android.gms.tasks.Task<java.lang.String> addGetIdListener = addGetIdListener();
        this.backgroundExecutor.execute(new java.lang.Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.FirebaseInstallations.this.m5553xc18eb11d();
            }
        });
        return addGetIdListener;
    }

    /* renamed from: lambda$getId$1$com-google-firebase-installations-FirebaseInstallations, reason: not valid java name */
    /* synthetic */ void m5553xc18eb11d() {
        m5554x7147f7aa(false);
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> getToken(final boolean z) {
        preConditionChecks();
        com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> addGetAuthTokenListener = addGetAuthTokenListener();
        this.backgroundExecutor.execute(new java.lang.Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.FirebaseInstallations.this.m5554x7147f7aa(z);
            }
        });
        return addGetAuthTokenListener;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<java.lang.Void> delete() {
        return com.google.android.gms.tasks.Tasks.call(this.backgroundExecutor, new java.util.concurrent.Callable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Void deleteFirebaseInstallationId;
                deleteFirebaseInstallationId = com.google.firebase.installations.FirebaseInstallations.this.deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
            }
        });
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public synchronized com.google.firebase.installations.internal.FidListenerHandle registerFidListener(final com.google.firebase.installations.internal.FidListener fidListener) {
        this.fidListeners.add(fidListener);
        return new com.google.firebase.installations.internal.FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.2
            @Override // com.google.firebase.installations.internal.FidListenerHandle
            public void unregister() {
                synchronized (com.google.firebase.installations.FirebaseInstallations.this) {
                    com.google.firebase.installations.FirebaseInstallations.this.fidListeners.remove(fidListener);
                }
            }
        };
    }

    private com.google.android.gms.tasks.Task<java.lang.String> addGetIdListener() {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        addStateListeners(new com.google.firebase.installations.GetIdListener(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> addGetAuthTokenListener() {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        addStateListeners(new com.google.firebase.installations.GetAuthTokenListener(this.utils, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void addStateListeners(com.google.firebase.installations.StateListener stateListener) {
        synchronized (this.lock) {
            this.listeners.add(stateListener);
        }
    }

    private void triggerOnStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.lock) {
            java.util.Iterator<com.google.firebase.installations.StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onStateReached(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    private void triggerOnException(java.lang.Exception exc) {
        synchronized (this.lock) {
            java.util.Iterator<com.google.firebase.installations.StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onException(exc)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void updateCacheFid(java.lang.String str) {
        this.cachedFid = str;
    }

    private synchronized java.lang.String getCacheFid() {
        return this.cachedFid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRegistrationOrRefresh, reason: merged with bridge method [inline-methods] */
    public final void m5554x7147f7aa(final boolean z) {
        com.google.firebase.installations.local.PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        if (z) {
            prefsWithGeneratedIdMultiProcessSafe = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(prefsWithGeneratedIdMultiProcessSafe);
        this.networkExecutor.execute(new java.lang.Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.FirebaseInstallations.this.m5552x5a306a82(z);
            }
        });
    }

    private com.google.firebase.installations.local.IidStore getIidStore() {
        return this.iidStore.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: doNetworkCallIfNecessary, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5552x5a306a82(boolean z) {
        com.google.firebase.installations.local.PersistedInstallationEntry registerFidWithServer;
        com.google.firebase.installations.local.PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        try {
            if (!multiProcessSafePrefs.isErrored() && !multiProcessSafePrefs.isUnregistered()) {
                if (!z && !this.utils.isAuthTokenExpired(multiProcessSafePrefs)) {
                    return;
                }
                registerFidWithServer = fetchAuthTokenFromServer(multiProcessSafePrefs);
                insertOrUpdatePrefs(registerFidWithServer);
                updateFidListener(multiProcessSafePrefs, registerFidWithServer);
                if (registerFidWithServer.isRegistered()) {
                    updateCacheFid(registerFidWithServer.getFirebaseInstallationId());
                }
                if (!registerFidWithServer.isErrored()) {
                    triggerOnException(new com.google.firebase.installations.FirebaseInstallationsException(com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG));
                    return;
                } else if (registerFidWithServer.isNotGenerated()) {
                    triggerOnException(new java.io.IOException(AUTH_ERROR_MSG));
                    return;
                } else {
                    triggerOnStateReached(registerFidWithServer);
                    return;
                }
            }
            registerFidWithServer = registerFidWithServer(multiProcessSafePrefs);
            insertOrUpdatePrefs(registerFidWithServer);
            updateFidListener(multiProcessSafePrefs, registerFidWithServer);
            if (registerFidWithServer.isRegistered()) {
            }
            if (!registerFidWithServer.isErrored()) {
            }
        } catch (com.google.firebase.installations.FirebaseInstallationsException e) {
            triggerOnException(e);
        }
    }

    private synchronized void updateFidListener(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry, com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.fidListeners.size() != 0 && !android.text.TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
            java.util.Iterator<com.google.firebase.installations.internal.FidListener> it = this.fidListeners.iterator();
            while (it.hasNext()) {
                it.next().onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
            }
        }
    }

    private void insertOrUpdatePrefs(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            com.google.firebase.installations.CrossProcessLock acquire = com.google.firebase.installations.CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            try {
                this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
            } finally {
                if (acquire != null) {
                    acquire.releaseAndClose();
                }
            }
        }
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        com.google.firebase.installations.local.PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            com.google.firebase.installations.CrossProcessLock acquire = com.google.firebase.installations.CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            try {
                readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
                if (readPersistedInstallationEntryValue.isNotGenerated()) {
                    readPersistedInstallationEntryValue = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(readPersistedInstallationEntryValue)));
                }
            } finally {
                if (acquire != null) {
                    acquire.releaseAndClose();
                }
            }
        }
        return readPersistedInstallationEntryValue;
    }

    private java.lang.String readExistingIidOrCreateFid(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.firebaseApp.getName().equals(CHIME_FIREBASE_APP_NAME) && !this.firebaseApp.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.fidGenerator.createRandomFid();
        }
        java.lang.String readIid = getIidStore().readIid();
        return android.text.TextUtils.isEmpty(readIid) ? this.fidGenerator.createRandomFid() : readIid;
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry registerFidWithServer(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) throws com.google.firebase.installations.FirebaseInstallationsException {
        com.google.firebase.installations.remote.InstallationResponse createFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : getIidStore().readToken());
        int i = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[createFirebaseInstallation.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withRegisteredFid(createFirebaseInstallation.getFid(), createFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), createFirebaseInstallation.getAuthToken().getToken(), createFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry fetchAuthTokenFromServer(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) throws com.google.firebase.installations.FirebaseInstallationsException {
        com.google.firebase.installations.remote.TokenResult generateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
        int i = com.google.firebase.installations.FirebaseInstallations.AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[generateAuthToken.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withAuthToken(generateAuthToken.getToken(), generateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i == 3) {
            updateCacheFid(null);
            return persistedInstallationEntry.withNoGeneratedFid();
        }
        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

        static {
            int[] iArr = new int[com.google.firebase.installations.remote.TokenResult.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = iArr;
            try {
                iArr[com.google.firebase.installations.remote.TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = iArr2;
            try {
                iArr2[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Void deleteFirebaseInstallationId() throws com.google.firebase.installations.FirebaseInstallationsException {
        updateCacheFid(null);
        com.google.firebase.installations.local.PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        if (multiProcessSafePrefs.isRegistered()) {
            this.serviceClient.deleteFirebaseInstallation(getApiKey(), multiProcessSafePrefs.getFirebaseInstallationId(), getProjectIdentifier(), multiProcessSafePrefs.getRefreshToken());
        }
        insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
        return null;
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry getMultiProcessSafePrefs() {
        com.google.firebase.installations.local.PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            com.google.firebase.installations.CrossProcessLock acquire = com.google.firebase.installations.CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            try {
                readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            } finally {
                if (acquire != null) {
                    acquire.releaseAndClose();
                }
            }
        }
        return readPersistedInstallationEntryValue;
    }
}
