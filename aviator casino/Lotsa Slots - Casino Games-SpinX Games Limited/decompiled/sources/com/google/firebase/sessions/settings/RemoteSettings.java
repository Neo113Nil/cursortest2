package com.google.firebase.sessions.settings;

/* compiled from: RemoteSettings.kt */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B7\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\r\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J\u0011\u0010&\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "configsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "lazySettingsCache", "Ldagger/Lazy;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Ldagger/Lazy;)V", "fetchInProgress", "Lkotlinx/coroutines/sync/Mutex;", "samplingRate", "", "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "settingsCache", "getSettingsCache", "()Lcom/google/firebase/sessions/settings/SettingsCache;", "clearCachedSettings", "", "clearCachedSettings$com_google_firebase_firebase_sessions", "isSettingsStale", "removeForwardSlashesIn", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteSettings implements com.google.firebase.sessions.settings.SettingsProvider {
    private static final com.google.firebase.sessions.settings.RemoteSettings.Companion Companion = new com.google.firebase.sessions.settings.RemoteSettings.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String FORWARD_SLASH_STRING = "/";

    @java.lang.Deprecated
    public static final java.lang.String TAG = "SessionConfigFetcher";
    private final com.google.firebase.sessions.ApplicationInfo appInfo;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher configsFetcher;
    private final kotlinx.coroutines.sync.Mutex fetchInProgress;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi;
    private final com.google.firebase.sessions.dagger.Lazy<com.google.firebase.sessions.settings.SettingsCache> lazySettingsCache;

    @javax.inject.Inject
    public RemoteSettings(@com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.sessions.ApplicationInfo appInfo, com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher configsFetcher, com.google.firebase.sessions.dagger.Lazy<com.google.firebase.sessions.settings.SettingsCache> lazySettingsCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazySettingsCache, "lazySettingsCache");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.lazySettingsCache = lazySettingsCache;
        this.fetchInProgress = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.firebase.sessions.settings.SettingsCache getSettingsCache() {
        com.google.firebase.sessions.settings.SettingsCache settingsCache = this.lazySettingsCache.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(settingsCache, "lazySettingsCache.get()");
        return settingsCache;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Boolean getSessionEnabled() {
        return getSettingsCache().sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: getSessionRestartTimeout-FghU774 */
    public kotlin.time.Duration mo5592getSessionRestartTimeoutFghU774() {
        java.lang.Integer sessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (sessionRestartTimeout == null) {
            return null;
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m12144boximpl(kotlin.time.DurationKt.toDuration(sessionRestartTimeout.intValue(), kotlin.time.DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Double getSamplingRate() {
        return getSettingsCache().sessionSamplingRate();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b2, B:29:0x00c0, B:33:0x00cc, B:38:0x008c, B:40:0x0096, B:43:0x00a1), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b2, B:29:0x00c0, B:33:0x00cc, B:38:0x008c, B:40:0x0096, B:43:0x00a1), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b2, B:29:0x00c0, B:33:0x00cc, B:38:0x008c, B:40:0x0096, B:43:0x00a1), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        ?? r4;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.google.firebase.sessions.settings.RemoteSettings remoteSettings;
        java.lang.String fid;
        try {
            if (continuation instanceof com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1) {
                remoteSettings$updateSettings$1 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1) continuation;
                if ((remoteSettings$updateSettings$1.label & Integer.MIN_VALUE) != 0) {
                    remoteSettings$updateSettings$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = remoteSettings$updateSettings$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = remoteSettings$updateSettings$1.label;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!this.fetchInProgress.isLocked() && !getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = this.fetchInProgress;
                        remoteSettings$updateSettings$1.L$0 = this;
                        remoteSettings$updateSettings$1.L$1 = mutex3;
                        remoteSettings$updateSettings$1.label = 1;
                        if (mutex3.lock(null, remoteSettings$updateSettings$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex3;
                        remoteSettings = this;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                if (r4 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex = (kotlinx.coroutines.sync.Mutex) remoteSettings$updateSettings$1.L$0;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    mutex.unlock(null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    mutex.unlock(null);
                                    throw th;
                                }
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) remoteSettings$updateSettings$1.L$1;
                            remoteSettings = (com.google.firebase.sessions.settings.RemoteSettings) remoteSettings$updateSettings$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            fid = ((com.google.firebase.sessions.InstallationId) obj).getFid();
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(fid, "")) {
                                android.util.Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit2;
                            }
                            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                            java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{android.os.Build.MANUFACTURER, android.os.Build.MODEL}, 2));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            java.lang.String INCREMENTAL = android.os.Build.VERSION.INCREMENTAL;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                            java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                            java.util.Map<java.lang.String, java.lang.String> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-Crashlytics-Installation-ID", fid), kotlin.TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(format)), kotlin.TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL)), kotlin.TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE)), kotlin.TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                            android.util.Log.d(TAG, "Fetching settings from server.");
                            com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1(remoteSettings, null);
                            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2(null);
                            remoteSettings$updateSettings$1.L$0 = mutex2;
                            remoteSettings$updateSettings$1.L$1 = null;
                            remoteSettings$updateSettings$1.label = 3;
                            if (crashlyticsSettingsFetcher.doConfigFetch(mapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex = mutex2;
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            mutex.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        }
                        mutex2 = (kotlinx.coroutines.sync.Mutex) remoteSettings$updateSettings$1.L$1;
                        remoteSettings = (com.google.firebase.sessions.settings.RemoteSettings) remoteSettings$updateSettings$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (remoteSettings.getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                        android.util.Log.d(TAG, "Remote settings cache not expired. Using cached values.");
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit4;
                    }
                    com.google.firebase.sessions.InstallationId.Companion companion = com.google.firebase.sessions.InstallationId.INSTANCE;
                    com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.firebaseInstallationsApi;
                    remoteSettings$updateSettings$1.L$0 = remoteSettings;
                    remoteSettings$updateSettings$1.L$1 = mutex2;
                    remoteSettings$updateSettings$1.label = 2;
                    obj = companion.create(firebaseInstallationsApi, remoteSettings$updateSettings$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fid = ((com.google.firebase.sessions.InstallationId) obj).getFid();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(fid, "")) {
                    }
                }
            }
            if (r4 != 0) {
            }
            if (remoteSettings.getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex = r4;
        }
        remoteSettings$updateSettings$1 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1(this, continuation);
        java.lang.Object obj2 = remoteSettings$updateSettings$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = remoteSettings$updateSettings$1.label;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    private final java.lang.String removeForwardSlashesIn(java.lang.String s) {
        return new kotlin.text.Regex(FORWARD_SLASH_STRING).replace(s, "");
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
