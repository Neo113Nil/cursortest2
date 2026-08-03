package com.facebook.internal;

/* compiled from: FetchedAppSettingsManager.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002OPB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-H\u0007J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0004H\u0002J\u0014\u0010<\u001a\u0004\u0018\u00010*2\b\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/\u0018\u00010>H\u0007J\b\u0010?\u001a\u000207H\u0007J\u001d\u0010@\u001a\u00020*2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010A\u001a\u00020:H\u0000¢\u0006\u0002\bBJ*\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020D0)0>2\b\u0010E\u001a\u0004\u0018\u00010:H\u0002J \u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010:H\u0002J\u001c\u0010G\u001a\u0004\u0018\u0001052\b\u0010H\u001a\u0004\u0018\u00010:2\u0006\u0010I\u001a\u00020\u0004H\u0002J\b\u0010J\u001a\u000207H\u0002J\u001a\u0010K\u001a\u0004\u0018\u00010*2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010L\u001a\u00020/H\u0007J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020/H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n &*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u0001020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "()V", "APPLICATION_FIELDS", "", "APP_SETTINGS_PREFS_KEY_FORMAT", "APP_SETTINGS_PREFS_STORE", "APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES", "APP_SETTING_APP_EVENTS_AAM_RULE", "APP_SETTING_APP_EVENTS_EVENT_BINDINGS", "APP_SETTING_APP_EVENTS_FEATURE_BITMASK", "APP_SETTING_APP_EVENTS_SESSION_TIMEOUT", "APP_SETTING_DIALOG_CONFIGS", "APP_SETTING_FIELDS", "", "APP_SETTING_NUX_CONTENT", "APP_SETTING_NUX_ENABLED", "APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD", "APP_SETTING_SMART_LOGIN_OPTIONS", "APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING", "AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "", "AUTO_LOG_APP_EVENTS_DEFAULT_FIELD", "AUTO_LOG_APP_EVENT_ENABLED_FIELD", "BLOCKLIST_EVENTS_KEY", "CODELESS_EVENTS_ENABLED_BITMASK_FIELD", "IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "MACA_RULES_KEY", "MONITOR_ENABLED_BITMASK_FIELD", "PROTECTED_MODE_RULES", "REDACTED_EVENTS_KEY", "SDK_UPDATE_MESSAGE", "SENSITIVE_PARAMS_KEY", "SMART_LOGIN_BOOKMARK_ICON_URL", "SMART_LOGIN_MENU_ICON_URL", "STANDARD_PARAMS_KEY", "SUGGESTED_EVENTS_SETTING", "TAG", "kotlin.jvm.PlatformType", "TRACK_UNINSTALL_ENABLED_BITMASK_FIELD", "fetchedAppSettings", "", "Lcom/facebook/internal/FetchedAppSettings;", "fetchedAppSettingsCallbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "isUnityInit", "", "loadingState", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "printedSDKUpdatedMessage", "unityEventBindings", "Lorg/json/JSONArray;", "getAppSettingsAsync", "", "callback", "getAppSettingsQueryResponse", "Lorg/json/JSONObject;", "applicationId", "getAppSettingsWithoutQuery", "getCachedMigratedAutoLogValuesInAppSettings", "", "loadAppSettingsAsync", "parseAppSettingsFromJSON", "settingsJSON", "parseAppSettingsFromJSON$facebook_core_release", "parseDialogConfigurations", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "dialogConfigResponse", "parseMigratedAutoLogValues", "parseProtectedModeRules", "protectedModeSettings", "ruleType", "pollCallbacks", "queryAppSettings", "forceRequery", "setIsUnityInit", "flag", "FetchAppSettingState", "FetchedAppSettingsCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FetchedAppSettingsManager {
    private static final java.lang.String APPLICATION_FIELDS = "fields";
    private static final java.lang.String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final java.lang.String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
    private static final java.lang.String BLOCKLIST_EVENTS_KEY = "blocklist_events";
    private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
    private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
    private static final java.lang.String MACA_RULES_KEY = "maca_rules";
    private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;
    private static final java.lang.String REDACTED_EVENTS_KEY = "redacted_events";
    private static final java.lang.String SDK_UPDATE_MESSAGE = "sdk_update_message";
    private static final java.lang.String SENSITIVE_PARAMS_KEY = "sensitive_params";
    private static final java.lang.String STANDARD_PARAMS_KEY = "standard_params";
    private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
    private static boolean isUnityInit;
    private static boolean printedSDKUpdatedMessage;
    private static org.json.JSONArray unityEventBindings;
    public static final com.facebook.internal.FetchedAppSettingsManager INSTANCE = new com.facebook.internal.FetchedAppSettingsManager();
    private static final java.lang.String TAG = "FetchedAppSettingsManager";
    private static final java.lang.String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    private static final java.lang.String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final java.lang.String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final java.lang.String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final java.lang.String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
    private static final java.lang.String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
    private static final java.lang.String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
    private static final java.lang.String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
    private static final java.lang.String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
    private static final java.lang.String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
    private static final java.lang.String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
    private static final java.lang.String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";
    private static final java.lang.String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";
    private static final java.lang.String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";
    private static final java.lang.String PROTECTED_MODE_RULES = "protected_mode_rules";
    public static final java.lang.String AUTO_LOG_APP_EVENTS_DEFAULT_FIELD = "auto_log_app_events_default";
    public static final java.lang.String AUTO_LOG_APP_EVENT_ENABLED_FIELD = "auto_log_app_events_enabled";
    private static final java.util.List<java.lang.String> APP_SETTING_FIELDS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, APP_SETTING_NUX_CONTENT, APP_SETTING_NUX_ENABLED, APP_SETTING_DIALOG_CONFIGS, APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES, APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, APP_SETTING_APP_EVENTS_FEATURE_BITMASK, APP_SETTING_APP_EVENTS_EVENT_BINDINGS, APP_SETTING_SMART_LOGIN_OPTIONS, SMART_LOGIN_BOOKMARK_ICON_URL, SMART_LOGIN_MENU_ICON_URL, APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD, APP_SETTING_APP_EVENTS_AAM_RULE, SUGGESTED_EVENTS_SETTING, PROTECTED_MODE_RULES, AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, AUTO_LOG_APP_EVENT_ENABLED_FIELD});
    private static final java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings> fetchedAppSettings = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState> loadingState = new java.util.concurrent.atomic.AtomicReference<>(com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED);
    private static final java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback> fetchedAppSettingsCallbacks = new java.util.concurrent.ConcurrentLinkedQueue<>();

    /* compiled from: FetchedAppSettingsManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "", "onError", "", "onSuccess", "fetchedAppSettings", "Lcom/facebook/internal/FetchedAppSettings;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface FetchedAppSettingsCallback {
        void onError();

        void onSuccess(com.facebook.internal.FetchedAppSettings fetchedAppSettings);
    }

    private FetchedAppSettingsManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void loadAppSettingsAsync() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        final android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        final java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(applicationId)) {
            loadingState.set(com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR);
            INSTANCE.pollCallbacks();
            return;
        }
        if (fetchedAppSettings.containsKey(applicationId)) {
            loadingState.set(com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS);
            INSTANCE.pollCallbacks();
            return;
        }
        java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState> atomicReference = loadingState;
        if (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED, com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING) && !androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR, com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING)) {
            INSTANCE.pollCallbacks();
            return;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        final java.lang.String format = java.lang.String.format(APP_SETTINGS_PREFS_KEY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{applicationId}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.internal.FetchedAppSettingsManager.m5180loadAppSettingsAsync$lambda0(applicationContext, format, applicationId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppSettingsAsync$lambda-0, reason: not valid java name */
    public static final void m5180loadAppSettingsAsync$lambda0(android.content.Context context, java.lang.String settingsKey, java.lang.String applicationId) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0);
        com.facebook.internal.FetchedAppSettings fetchedAppSettings2 = null;
        java.lang.String string = sharedPreferences.getString(settingsKey, null);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isNullOrEmpty(string)) {
            if (string == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new org.json.JSONObject(string);
            } catch (org.json.JSONException e) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                fetchedAppSettings2 = INSTANCE.parseAppSettingsFromJSON$facebook_core_release(applicationId, jSONObject);
            }
        }
        com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        org.json.JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId);
        if (appSettingsQueryResponse != null) {
            fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, appSettingsQueryResponse);
            sharedPreferences.edit().putString(settingsKey, appSettingsQueryResponse.toString()).apply();
        }
        if (fetchedAppSettings2 != null) {
            java.lang.String sdkUpdateMessage = fetchedAppSettings2.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                printedSDKUpdatedMessage = true;
                android.util.Log.w(TAG, sdkUpdateMessage);
            }
        }
        com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
        com.facebook.internal.FetchedAppGateKeepersManager.queryAppGateKeepers(applicationId, true);
        com.facebook.appevents.internal.AutomaticAnalyticsLogger automaticAnalyticsLogger = com.facebook.appevents.internal.AutomaticAnalyticsLogger.INSTANCE;
        com.facebook.appevents.internal.AutomaticAnalyticsLogger.logActivateAppEvent();
        loadingState.set(fetchedAppSettings.containsKey(applicationId) ? com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS : com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.pollCallbacks();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.FetchedAppSettings getAppSettingsWithoutQuery(java.lang.String applicationId) {
        if (applicationId != null) {
            return fetchedAppSettings.get(applicationId);
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final void getAppSettingsAsync(com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        fetchedAppSettingsCallbacks.add(callback);
        loadAppSettingsAsync();
    }

    private final synchronized void pollCallbacks() {
        com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED != fetchAppSettingState && com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING != fetchAppSettingState) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            final com.facebook.internal.FetchedAppSettings fetchedAppSettings2 = fetchedAppSettings.get(com.facebook.FacebookSdk.getApplicationId());
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            if (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback poll = concurrentLinkedQueue.poll();
                    handler.post(new java.lang.Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback.this.onError();
                        }
                    });
                }
            } else {
                while (true) {
                    java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback poll2 = concurrentLinkedQueue2.poll();
                    handler.post(new java.lang.Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback.this.onSuccess(fetchedAppSettings2);
                        }
                    });
                }
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.Boolean> getCachedMigratedAutoLogValuesInAppSettings() {
        org.json.JSONObject jSONObject;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(APP_SETTINGS_PREFS_KEY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{applicationId}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        java.lang.String string = applicationContext.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0).getString(format, null);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isNullOrEmpty(string)) {
            if (string == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new org.json.JSONObject(string);
            } catch (org.json.JSONException e) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return INSTANCE.parseMigratedAutoLogValues(jSONObject);
            }
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.FetchedAppSettings queryAppSettings(java.lang.String applicationId, boolean forceRequery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!forceRequery) {
            java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        org.json.JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(applicationId);
        if (appSettingsQueryResponse == null) {
            return null;
        }
        com.facebook.internal.FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release = fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(applicationId, appSettingsQueryResponse);
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(applicationId, com.facebook.FacebookSdk.getApplicationId())) {
            loadingState.set(com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.pollCallbacks();
        }
        return parseAppSettingsFromJSON$facebook_core_release;
    }

    public final com.facebook.internal.FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release(java.lang.String applicationId, org.json.JSONObject settingsJSON) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        com.facebook.internal.FacebookRequestErrorClassification createFromJSON = com.facebook.internal.FacebookRequestErrorClassification.INSTANCE.createFromJSON(settingsJSON.optJSONArray(APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES));
        if (createFromJSON == null) {
            createFromJSON = com.facebook.internal.FacebookRequestErrorClassification.INSTANCE.getDefaultErrorClassification();
        }
        com.facebook.internal.FacebookRequestErrorClassification facebookRequestErrorClassification = createFromJSON;
        int optInt = settingsJSON.optInt(APP_SETTING_APP_EVENTS_FEATURE_BITMASK, 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & 16384) != 0;
        org.json.JSONArray optJSONArray = settingsJSON.optJSONArray(APP_SETTING_APP_EVENTS_EVENT_BINDINGS);
        unityEventBindings = optJSONArray;
        if (optJSONArray != null) {
            com.facebook.internal.InternalSettings internalSettings = com.facebook.internal.InternalSettings.INSTANCE;
            if (com.facebook.internal.InternalSettings.isUnityApp()) {
                com.facebook.appevents.codeless.internal.UnityReflection unityReflection = com.facebook.appevents.codeless.internal.UnityReflection.INSTANCE;
                com.facebook.appevents.codeless.internal.UnityReflection.sendEventMapping(optJSONArray == null ? null : optJSONArray.toString());
            }
        }
        boolean optBoolean = settingsJSON.optBoolean(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, false);
        java.lang.String optString = settingsJSON.optString(APP_SETTING_NUX_CONTENT, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean(APP_SETTING_NUX_ENABLED, false);
        com.facebook.appevents.internal.Constants constants = com.facebook.appevents.internal.Constants.INSTANCE;
        int optInt2 = settingsJSON.optInt(APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, com.facebook.appevents.internal.Constants.getDefaultAppEventsSessionTimeoutInSeconds());
        java.util.EnumSet<com.facebook.internal.SmartLoginOption> parseOptions = com.facebook.internal.SmartLoginOption.INSTANCE.parseOptions(settingsJSON.optLong(APP_SETTING_SMART_LOGIN_OPTIONS));
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations = parseDialogConfigurations(settingsJSON.optJSONObject(APP_SETTING_DIALOG_CONFIGS));
        java.lang.String optString2 = settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        java.lang.String optString3 = settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        java.lang.String optString4 = settingsJSON.optString(SDK_UPDATE_MESSAGE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        com.facebook.internal.FetchedAppSettings fetchedAppSettings2 = new com.facebook.internal.FetchedAppSettings(optBoolean, optString, optBoolean2, optInt2, parseOptions, parseDialogConfigurations, z, facebookRequestErrorClassification, optString2, optString3, z2, z3, optJSONArray, optString4, z4, z5, settingsJSON.optString(APP_SETTING_APP_EVENTS_AAM_RULE), settingsJSON.optString(SUGGESTED_EVENTS_SETTING), settingsJSON.optString(APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), STANDARD_PARAMS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), MACA_RULES_KEY), parseMigratedAutoLogValues(settingsJSON), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), BLOCKLIST_EVENTS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), REDACTED_EVENTS_KEY), parseProtectedModeRules(settingsJSON.optJSONObject(PROTECTED_MODE_RULES), SENSITIVE_PARAMS_KEY));
        fetchedAppSettings.put(applicationId, fetchedAppSettings2);
        return fetchedAppSettings2;
    }

    @kotlin.jvm.JvmStatic
    public static final void setIsUnityInit(boolean flag) {
        isUnityInit = flag;
        if (unityEventBindings == null || !flag) {
            return;
        }
        com.facebook.appevents.codeless.internal.UnityReflection unityReflection = com.facebook.appevents.codeless.internal.UnityReflection.INSTANCE;
        com.facebook.appevents.codeless.internal.UnityReflection.sendEventMapping(java.lang.String.valueOf(unityEventBindings));
    }

    private final org.json.JSONObject getAppSettingsQueryResponse(java.lang.String applicationId) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", android.text.TextUtils.join(",", arrayList));
        com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
        newGraphPathRequest.setForceApplicationRequest(true);
        newGraphPathRequest.setParameters(bundle);
        org.json.JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new org.json.JSONObject() : jsonObject;
    }

    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(org.json.JSONObject dialogConfigResponse) {
        org.json.JSONArray optJSONArray;
        int length;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (dialogConfigResponse != null && (optJSONArray = dialogConfigResponse.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                com.facebook.internal.FetchedAppSettings.DialogFeatureConfig.Companion companion = com.facebook.internal.FetchedAppSettings.DialogFeatureConfig.INSTANCE;
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optJSONObject, "dialogConfigData.optJSONObject(i)");
                com.facebook.internal.FetchedAppSettings.DialogFeatureConfig parseDialogConfig = companion.parseDialogConfig(optJSONObject);
                if (parseDialogConfig != null) {
                    java.lang.String dialogName = parseDialogConfig.getDialogName();
                    java.util.HashMap hashMap2 = (java.util.Map) hashMap.get(dialogName);
                    if (hashMap2 == null) {
                        hashMap2 = new java.util.HashMap();
                        hashMap.put(dialogName, hashMap2);
                    }
                    hashMap2.put(parseDialogConfig.getFeatureName(), parseDialogConfig);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    private final org.json.JSONArray parseProtectedModeRules(org.json.JSONObject protectedModeSettings, java.lang.String ruleType) {
        if (protectedModeSettings != null) {
            return protectedModeSettings.optJSONArray(ruleType);
        }
        return null;
    }

    private final java.util.Map<java.lang.String, java.lang.Boolean> parseMigratedAutoLogValues(org.json.JSONObject settingsJSON) {
        if (settingsJSON == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!settingsJSON.isNull(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)) {
            try {
                hashMap.put(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, java.lang.Boolean.valueOf(settingsJSON.getBoolean(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)));
            } catch (org.json.JSONException e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e);
            }
        }
        if (!settingsJSON.isNull(AUTO_LOG_APP_EVENT_ENABLED_FIELD)) {
            try {
                hashMap.put(AUTO_LOG_APP_EVENT_ENABLED_FIELD, java.lang.Boolean.valueOf(settingsJSON.getBoolean(AUTO_LOG_APP_EVENT_ENABLED_FIELD)));
            } catch (org.json.JSONException e2) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e2);
            }
        }
        if (!hashMap.isEmpty()) {
            return hashMap;
        }
        return null;
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState[] valuesCustom() {
            com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState[] valuesCustom = values();
            return (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }
}
