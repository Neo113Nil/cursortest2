package com.facebook;

/* compiled from: UserSettingsManager.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001<B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001eH\u0007J\b\u0010\"\u001a\u00020\u001eH\u0007J\b\u0010#\u001a\u00020\u001eH\u0007J\b\u0010$\u001a\u00020\u001eH\u0007J\b\u0010%\u001a\u00020\u001eH\u0007J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J!\u0010)\u001a\u00020'2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130+\"\u00020\u0013H\u0002¢\u0006\u0002\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010 J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0013H\u0002J\b\u00100\u001a\u00020'H\u0007J\b\u00101\u001a\u00020'H\u0002J\b\u00102\u001a\u00020'H\u0002J\u000f\u00103\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0002\u0010 J\u0010\u00104\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0013H\u0002J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\u0010\u00107\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\u0010\u00108\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\u0010\u00109\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\b\u0010:\u001a\u00020'H\u0002J\u0010\u0010;\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/facebook/UserSettingsManager;", "", "()V", "ADVERTISERID_COLLECTION_FALSE_WARNING", "", "ADVERTISERID_COLLECTION_NOT_SET_WARNING", "ADVERTISER_ID_KEY", "APPLICATION_FIELDS", "AUTO_APP_LINK_WARNING", "EVENTS_CODELESS_SETUP_ENABLED", "LAST_TIMESTAMP", "TAG", "kotlin.jvm.PlatformType", "TIMEOUT_7D", "", "USER_SETTINGS", "USER_SETTINGS_BITMASK", "VALUE", "advertiserIDCollectionEnabled", "Lcom/facebook/UserSettingsManager$UserSetting;", "autoInitEnabled", "autoLogAppEventsEnabledLocally", "codelessSetupEnabled", "isFetchingCodelessStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "monitorEnabled", "userSettingPref", "Landroid/content/SharedPreferences;", "checkAutoLogAppEventsEnabled", "", "checkClientSideConfiguration", "()Ljava/lang/Boolean;", "getAdvertiserIDCollectionEnabled", "getAutoInitEnabled", "getAutoLogAppEventsEnabled", "getCodelessSetupEnabled", "getMonitorEnabled", "initializeCodelessSetupEnabledAsync", "", "initializeIfNotInitialized", "initializeUserSetting", "userSettings", "", "([Lcom/facebook/UserSettingsManager$UserSetting;)V", "loadAutoLogAppEventsSettingFromManifest", "loadSettingFromManifest", "userSetting", "logIfAutoAppLinkEnabled", "logIfSDKSettingsChanged", "logWarnings", "readAutoLogAppEventsSettingFromCache", "readSettingFromCache", "setAdvertiserIDCollectionEnabled", "flag", "setAutoInitEnabled", "setAutoLogAppEventsEnabled", "setMonitorEnabled", "validateInitialized", "writeSettingToCache", "UserSetting", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UserSettingsManager {
    private static final java.lang.String ADVERTISERID_COLLECTION_FALSE_WARNING = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";
    private static final java.lang.String ADVERTISERID_COLLECTION_NOT_SET_WARNING = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
    private static final java.lang.String ADVERTISER_ID_KEY = "advertiser_id";
    private static final java.lang.String APPLICATION_FIELDS = "fields";
    private static final java.lang.String AUTO_APP_LINK_WARNING = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
    private static final java.lang.String LAST_TIMESTAMP = "last_timestamp";
    private static final long TIMEOUT_7D = 604800000;
    private static final java.lang.String USER_SETTINGS = "com.facebook.sdk.USER_SETTINGS";
    private static final java.lang.String USER_SETTINGS_BITMASK = "com.facebook.sdk.USER_SETTINGS_BITMASK";
    private static final java.lang.String VALUE = "value";
    private static android.content.SharedPreferences userSettingPref;
    public static final com.facebook.UserSettingsManager INSTANCE = new com.facebook.UserSettingsManager();
    private static final java.lang.String TAG = com.facebook.UserSettingsManager.class.getName();
    private static final java.util.concurrent.atomic.AtomicBoolean isInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.concurrent.atomic.AtomicBoolean isFetchingCodelessStatus = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final com.facebook.UserSettingsManager.UserSetting autoInitEnabled = new com.facebook.UserSettingsManager.UserSetting(true, com.facebook.FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);
    private static final com.facebook.UserSettingsManager.UserSetting autoLogAppEventsEnabledLocally = new com.facebook.UserSettingsManager.UserSetting(true, com.facebook.FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);
    private static final com.facebook.UserSettingsManager.UserSetting advertiserIDCollectionEnabled = new com.facebook.UserSettingsManager.UserSetting(true, com.facebook.FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);
    private static final java.lang.String EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
    private static final com.facebook.UserSettingsManager.UserSetting codelessSetupEnabled = new com.facebook.UserSettingsManager.UserSetting(false, EVENTS_CODELESS_SETUP_ENABLED);
    private static final com.facebook.UserSettingsManager.UserSetting monitorEnabled = new com.facebook.UserSettingsManager.UserSetting(true, com.facebook.FacebookSdk.MONITOR_ENABLED_PROPERTY);

    private UserSettingsManager() {
    }

    private final void initializeIfNotInitialized() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.isInitialized() && isInitialized.compareAndSet(false, true)) {
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(USER_SETTINGS, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                userSettingPref = sharedPreferences;
                initializeUserSetting(autoLogAppEventsEnabledLocally, advertiserIDCollectionEnabled, autoInitEnabled);
                initializeCodelessSetupEnabledAsync();
                logWarnings();
                logIfSDKSettingsChanged();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void initializeUserSetting(com.facebook.UserSettingsManager.UserSetting... userSettings) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int length = userSettings.length;
            int i = 0;
            while (i < length) {
                com.facebook.UserSettingsManager.UserSetting userSetting = userSettings[i];
                i++;
                if (userSetting == codelessSetupEnabled) {
                    initializeCodelessSetupEnabledAsync();
                } else if (userSetting.getValue() == null) {
                    readSettingFromCache(userSetting);
                    if (userSetting.getValue() == null) {
                        loadSettingFromManifest(userSetting);
                    }
                } else {
                    writeSettingToCache(userSetting);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void initializeCodelessSetupEnabledAsync() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.UserSettingsManager.UserSetting userSetting = codelessSetupEnabled;
            readSettingFromCache(userSetting);
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (userSetting.getValue() == null || currentTimeMillis - userSetting.getLastTS() >= 604800000) {
                userSetting.setValue(null);
                userSetting.setLastTS(0L);
                if (isFetchingCodelessStatus.compareAndSet(false, true)) {
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.UserSettingsManager$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facebook.UserSettingsManager.m5074initializeCodelessSetupEnabledAsync$lambda0(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeCodelessSetupEnabledAsync$lambda-0, reason: not valid java name */
    public static final void m5074initializeCodelessSetupEnabledAsync$lambda0(long j) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return;
        }
        try {
            if (advertiserIDCollectionEnabled.m5075getValue()) {
                com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null && queryAppSettings.getCodelessEventsEnabled()) {
                    com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                    com.facebook.internal.AttributionIdentifiers attributionIdentifiers = com.facebook.internal.AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(com.facebook.FacebookSdk.getApplicationContext());
                    java.lang.String androidAdvertiserId = (attributionIdentifiers == null || attributionIdentifiers.getAndroidAdvertiserId() == null) ? null : attributionIdentifiers.getAndroidAdvertiserId();
                    if (androidAdvertiserId != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString(ADVERTISER_ID_KEY, androidAdvertiserId);
                        bundle.putString("fields", EVENTS_CODELESS_SETUP_ENABLED);
                        com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
                        newGraphPathRequest.setParameters(bundle);
                        org.json.JSONObject graphObject = newGraphPathRequest.executeAndWait().getGraphObject();
                        if (graphObject != null) {
                            com.facebook.UserSettingsManager.UserSetting userSetting = codelessSetupEnabled;
                            userSetting.setValue(java.lang.Boolean.valueOf(graphObject.optBoolean(EVENTS_CODELESS_SETUP_ENABLED, false)));
                            userSetting.setLastTS(j);
                            INSTANCE.writeSettingToCache(userSetting);
                        }
                    }
                }
            }
            isFetchingCodelessStatus.set(false);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
        }
    }

    private final void writeSettingToCache(com.facebook.UserSettingsManager.UserSetting userSetting) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            validateInitialized();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("value", userSetting.getValue());
                jSONObject.put(LAST_TIMESTAMP, userSetting.getLastTS());
                android.content.SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                logIfSDKSettingsChanged();
            } catch (java.lang.Exception e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void readSettingFromCache(com.facebook.UserSettingsManager.UserSetting userSetting) {
        java.lang.String str = "";
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            validateInitialized();
            try {
                android.content.SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
                java.lang.String string = sharedPreferences.getString(userSetting.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    userSetting.setValue(java.lang.Boolean.valueOf(jSONObject.getBoolean("value")));
                    userSetting.setLastTS(jSONObject.getLong(LAST_TIMESTAMP));
                }
            } catch (org.json.JSONException e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void loadSettingFromManifest(com.facebook.UserSettingsManager.UserSetting userSetting) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            validateInitialized();
            try {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
                android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                if (applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(userSetting.getKey())) {
                    return;
                }
                userSetting.setValue(java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void logWarnings() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            if (applicationInfo.metaData != null) {
                if (!applicationInfo.metaData.containsKey(com.facebook.FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY)) {
                    android.util.Log.w(TAG, ADVERTISERID_COLLECTION_NOT_SET_WARNING);
                }
                if (getAdvertiserIDCollectionEnabled()) {
                    return;
                }
                android.util.Log.w(TAG, ADVERTISERID_COLLECTION_FALSE_WARNING);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void logIfSDKSettingsChanged() {
        int i;
        int i2;
        android.content.pm.ApplicationInfo applicationInfo;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInitialized.get()) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                if (com.facebook.FacebookSdk.isInitialized()) {
                    com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                    android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
                    int i3 = 0;
                    int i4 = (autoInitEnabled.m5075getValue() ? 1 : 0) | ((autoLogAppEventsEnabledLocally.m5075getValue() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.m5075getValue() ? 1 : 0) << 2) | ((monitorEnabled.m5075getValue() ? 1 : 0) << 3);
                    android.content.SharedPreferences sharedPreferences = userSettingPref;
                    if (sharedPreferences == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        throw null;
                    }
                    int i5 = sharedPreferences.getInt(USER_SETTINGS_BITMASK, 0);
                    if (i5 != i4) {
                        android.content.SharedPreferences sharedPreferences2 = userSettingPref;
                        if (sharedPreferences2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                            throw null;
                        }
                        sharedPreferences2.edit().putInt(USER_SETTINGS_BITMASK, i4).apply();
                        try {
                            applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                            i = 0;
                        }
                        if (applicationInfo.metaData != null) {
                            java.lang.String[] strArr = {com.facebook.FacebookSdk.AUTO_INIT_ENABLED_PROPERTY, com.facebook.FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY, com.facebook.FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY, com.facebook.FacebookSdk.MONITOR_ENABLED_PROPERTY};
                            boolean[] zArr = {true, true, true, true};
                            i = 0;
                            i2 = 0;
                            while (true) {
                                int i6 = i3 + 1;
                                try {
                                    i |= (applicationInfo.metaData.containsKey(strArr[i3]) ? 1 : 0) << i3;
                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i3], zArr[i3]) ? 1 : 0) << i3;
                                    if (i6 > 3) {
                                        break;
                                    } else {
                                        i3 = i6;
                                    }
                                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                                    i3 = i2;
                                    i2 = i3;
                                    i3 = i;
                                    com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(applicationContext);
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    bundle.putInt("usage", i3);
                                    bundle.putInt("initial", i2);
                                    bundle.putInt("previous", i5);
                                    bundle.putInt("current", i4);
                                    internalAppEventsLogger.logChangedSettingsEvent(bundle);
                                }
                            }
                            i3 = i;
                            com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger2 = new com.facebook.appevents.InternalAppEventsLogger(applicationContext);
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putInt("usage", i3);
                            bundle2.putInt("initial", i2);
                            bundle2.putInt("previous", i5);
                            bundle2.putInt("current", i4);
                            internalAppEventsLogger2.logChangedSettingsEvent(bundle2);
                        }
                        i2 = 0;
                        com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger22 = new com.facebook.appevents.InternalAppEventsLogger(applicationContext);
                        android.os.Bundle bundle22 = new android.os.Bundle();
                        bundle22.putInt("usage", i3);
                        bundle22.putInt("initial", i2);
                        bundle22.putInt("previous", i5);
                        bundle22.putInt("current", i4);
                        internalAppEventsLogger22.logChangedSettingsEvent(bundle22);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void logIfAutoAppLinkEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            if (applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(applicationContext);
            android.os.Bundle bundle = new android.os.Bundle();
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isAutoAppLinkSetup()) {
                bundle.putString("SchemeWarning", AUTO_APP_LINK_WARNING);
                android.util.Log.w(TAG, AUTO_APP_LINK_WARNING);
            }
            internalAppEventsLogger.logEvent("fb_auto_applink", bundle);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
        }
    }

    private final void validateInitialized() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInitialized.get()) {
            } else {
                throw new com.facebook.FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setAutoInitEnabled(boolean flag) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return;
        }
        try {
            com.facebook.UserSettingsManager.UserSetting userSetting = autoInitEnabled;
            userSetting.setValue(java.lang.Boolean.valueOf(flag));
            userSetting.setLastTS(java.lang.System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getAutoInitEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return autoInitEnabled.m5075getValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setAutoLogAppEventsEnabled(boolean flag) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return;
        }
        try {
            com.facebook.UserSettingsManager.UserSetting userSetting = autoLogAppEventsEnabledLocally;
            userSetting.setValue(java.lang.Boolean.valueOf(flag));
            userSetting.setLastTS(java.lang.System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getAutoLogAppEventsEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return false;
        }
        try {
            com.facebook.UserSettingsManager userSettingsManager = INSTANCE;
            userSettingsManager.initializeIfNotInitialized();
            return userSettingsManager.checkAutoLogAppEventsEnabled();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
            return false;
        }
    }

    private final boolean checkAutoLogAppEventsEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            java.util.Map<java.lang.String, java.lang.Boolean> cachedMigratedAutoLogValuesInAppSettings = com.facebook.internal.FetchedAppSettingsManager.getCachedMigratedAutoLogValuesInAppSettings();
            if (cachedMigratedAutoLogValuesInAppSettings != null && !cachedMigratedAutoLogValuesInAppSettings.isEmpty()) {
                java.lang.Boolean bool = cachedMigratedAutoLogValuesInAppSettings.get(com.facebook.internal.FetchedAppSettingsManager.AUTO_LOG_APP_EVENT_ENABLED_FIELD);
                java.lang.Boolean bool2 = cachedMigratedAutoLogValuesInAppSettings.get(com.facebook.internal.FetchedAppSettingsManager.AUTO_LOG_APP_EVENTS_DEFAULT_FIELD);
                if (bool != null) {
                    return bool.booleanValue();
                }
                java.lang.Boolean checkClientSideConfiguration = checkClientSideConfiguration();
                if (checkClientSideConfiguration != null) {
                    return checkClientSideConfiguration.booleanValue();
                }
                if (bool2 == null) {
                    return true;
                }
                return bool2.booleanValue();
            }
            return autoLogAppEventsEnabledLocally.m5075getValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final java.lang.Boolean checkClientSideConfiguration() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.lang.Boolean readAutoLogAppEventsSettingFromCache = readAutoLogAppEventsSettingFromCache();
            if (readAutoLogAppEventsSettingFromCache != null) {
                readAutoLogAppEventsSettingFromCache.booleanValue();
                return readAutoLogAppEventsSettingFromCache;
            }
            java.lang.Boolean loadAutoLogAppEventsSettingFromManifest = loadAutoLogAppEventsSettingFromManifest();
            if (loadAutoLogAppEventsSettingFromManifest == null) {
                return null;
            }
            loadAutoLogAppEventsSettingFromManifest.booleanValue();
            return loadAutoLogAppEventsSettingFromManifest;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    private static final java.lang.Boolean readAutoLogAppEventsSettingFromCache() {
        android.content.SharedPreferences sharedPreferences;
        java.lang.String str = "";
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return null;
        }
        try {
            INSTANCE.validateInitialized();
            try {
                sharedPreferences = userSettingPref;
            } catch (org.json.JSONException e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, e);
            }
            if (sharedPreferences == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                throw null;
            }
            java.lang.String string = sharedPreferences.getString(autoLogAppEventsEnabledLocally.getKey(), "");
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return java.lang.Boolean.valueOf(new org.json.JSONObject(str).getBoolean("value"));
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
            return null;
        }
    }

    private final java.lang.Boolean loadAutoLogAppEventsSettingFromManifest() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            validateInitialized();
            try {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
                android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                if (applicationInfo.metaData != null) {
                    android.os.Bundle bundle = applicationInfo.metaData;
                    com.facebook.UserSettingsManager.UserSetting userSetting = autoLogAppEventsEnabledLocally;
                    if (bundle.containsKey(userSetting.getKey())) {
                        return java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey()));
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(TAG, e);
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setAdvertiserIDCollectionEnabled(boolean flag) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return;
        }
        try {
            com.facebook.UserSettingsManager.UserSetting userSetting = advertiserIDCollectionEnabled;
            userSetting.setValue(java.lang.Boolean.valueOf(flag));
            userSetting.setLastTS(java.lang.System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getAdvertiserIDCollectionEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return advertiserIDCollectionEnabled.m5075getValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getCodelessSetupEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return codelessSetupEnabled.m5075getValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setMonitorEnabled(boolean flag) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return;
        }
        try {
            com.facebook.UserSettingsManager.UserSetting userSetting = monitorEnabled;
            userSetting.setValue(java.lang.Boolean.valueOf(flag));
            userSetting.setLastTS(java.lang.System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.writeSettingToCache(userSetting);
            } else {
                INSTANCE.initializeIfNotInitialized();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getMonitorEnabled() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.UserSettingsManager.class)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return monitorEnabled.m5075getValue();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.UserSettingsManager.class);
            return false;
        }
    }

    /* compiled from: UserSettingsManager.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/UserSettingsManager$UserSetting;", "", "defaultVal", "", com.ironsource.X3.i.W, "", "(ZLjava/lang/String;)V", "getDefaultVal", "()Z", "setDefaultVal", "(Z)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "lastTS", "", "getLastTS", "()J", "setLastTS", "(J)V", "value", "getValue", "()Ljava/lang/Boolean;", "setValue", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class UserSetting {
        private boolean defaultVal;
        private java.lang.String key;
        private long lastTS;
        private java.lang.Boolean value;

        public UserSetting(boolean z, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.defaultVal = z;
            this.key = key;
        }

        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final void setDefaultVal(boolean z) {
            this.defaultVal = z;
        }

        public final void setKey(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.key = str;
        }

        public final java.lang.Boolean getValue() {
            return this.value;
        }

        public final void setValue(java.lang.Boolean bool) {
            this.value = bool;
        }

        public final long getLastTS() {
            return this.lastTS;
        }

        public final void setLastTS(long j) {
            this.lastTS = j;
        }

        /* renamed from: getValue, reason: collision with other method in class */
        public final boolean m5075getValue() {
            java.lang.Boolean bool = this.value;
            return bool == null ? this.defaultVal : bool.booleanValue();
        }
    }
}
