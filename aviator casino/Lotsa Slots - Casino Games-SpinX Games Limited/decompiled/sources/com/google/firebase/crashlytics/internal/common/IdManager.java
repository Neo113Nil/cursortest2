package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public class IdManager implements com.google.firebase.crashlytics.internal.common.InstallIdProvider {
    public static final java.lang.String DEFAULT_VERSION_NAME = "0.0";
    static final java.lang.String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final java.lang.String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final java.lang.String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final java.lang.String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final java.lang.String SYNTHETIC_FID_PREFIX = "SYN_";
    private static final int TIMEOUT_MILLIS = 10000;
    private final android.content.Context appContext;
    private final java.lang.String appIdentifier;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds installIds;
    private final com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider installerPackageNameProvider;
    private static final java.util.regex.Pattern ID_PATTERN = java.util.regex.Pattern.compile("[^\\p{Alnum}]");
    private static final java.lang.String FORWARD_SLASH_REGEX = java.util.regex.Pattern.quote(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);

    public IdManager(android.content.Context context, java.lang.String str, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("appIdentifier must not be null");
        }
        this.appContext = context;
        this.appIdentifier = str;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.installerPackageNameProvider = new com.google.firebase.crashlytics.internal.common.InstallerPackageNameProvider();
    }

    private static java.lang.String formatId(java.lang.String str) {
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(java.util.Locale.US);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    public synchronized com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds getInstallIds() {
        if (!shouldRefresh()) {
            return this.installIds;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Determining Crashlytics installation ID...");
        android.content.SharedPreferences sharedPrefs = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(this.appContext);
        java.lang.String string = sharedPrefs.getString(PREFKEY_FIREBASE_IID, null);
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Cached Firebase Installation ID: " + string);
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId fetchTrueFid = fetchTrueFid(false);
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Fetched Firebase Installation ID: " + fetchTrueFid.getFid());
            if (fetchTrueFid.getFid() == null) {
                fetchTrueFid = new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId(string == null ? createSyntheticFid() : string, null);
            }
            if (java.util.Objects.equals(fetchTrueFid.getFid(), string)) {
                this.installIds = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.create(readCachedCrashlyticsInstallId(sharedPrefs), fetchTrueFid);
            } else {
                this.installIds = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.create(createAndCacheCrashlyticsInstallId(fetchTrueFid.getFid(), sharedPrefs), fetchTrueFid);
            }
        } else if (isSyntheticFid(string)) {
            this.installIds = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.createWithoutFid(readCachedCrashlyticsInstallId(sharedPrefs));
        } else {
            this.installIds = com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds.createWithoutFid(createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs));
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Install IDs: " + this.installIds);
        return this.installIds;
    }

    private boolean shouldRefresh() {
        com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds installIds = this.installIds;
        return installIds == null || (installIds.getFirebaseInstallationId() == null && this.dataCollectionArbiter.isAutomaticDataCollectionEnabled());
    }

    static java.lang.String createSyntheticFid() {
        return SYNTHETIC_FID_PREFIX + java.util.UUID.randomUUID().toString();
    }

    static boolean isSyntheticFid(java.lang.String str) {
        return str != null && str.startsWith(SYNTHETIC_FID_PREFIX);
    }

    private java.lang.String readCachedCrashlyticsInstallId(android.content.SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.firebase.crashlytics.internal.common.FirebaseInstallationId fetchTrueFid(boolean z) {
        java.lang.String token;
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkNotMainThread();
        java.lang.String str = null;
        if (z) {
            try {
                token = ((com.google.firebase.installations.InstallationTokenResult) com.google.android.gms.tasks.Tasks.await(this.firebaseInstallations.getToken(false), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS)).getToken();
            } catch (java.lang.Exception e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error getting Firebase authentication token.", e);
            }
            str = (java.lang.String) com.google.android.gms.tasks.Tasks.await(this.firebaseInstallations.getId(), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            return new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId(str, token);
        }
        token = null;
        str = (java.lang.String) com.google.android.gms.tasks.Tasks.await(this.firebaseInstallations.getId(), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        return new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId(str, token);
    }

    private synchronized java.lang.String createAndCacheCrashlyticsInstallId(java.lang.String str, android.content.SharedPreferences sharedPreferences) {
        java.lang.String formatId;
        formatId = formatId(java.util.UUID.randomUUID().toString());
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Created new Crashlytics installation ID: " + formatId + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", formatId).putString(PREFKEY_FIREBASE_IID, str).apply();
        return formatId;
    }

    public java.lang.String getAppIdentifier() {
        return this.appIdentifier;
    }

    public java.lang.String getOsDisplayVersionString() {
        return removeForwardSlashesIn(android.os.Build.VERSION.RELEASE);
    }

    public java.lang.String getOsBuildVersionString() {
        return removeForwardSlashesIn(android.os.Build.VERSION.INCREMENTAL);
    }

    public java.lang.String getModelName() {
        return java.lang.String.format(java.util.Locale.US, "%s/%s", removeForwardSlashesIn(android.os.Build.MANUFACTURER), removeForwardSlashesIn(android.os.Build.MODEL));
    }

    private java.lang.String removeForwardSlashesIn(java.lang.String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public java.lang.String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }
}
