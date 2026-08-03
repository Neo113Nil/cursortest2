package com.facebook;

/* compiled from: FacebookSdk.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0091\u0001\u0092\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020?H\u0007J\b\u0010H\u001a\u00020FH\u0007J\b\u0010I\u001a\u00020FH\u0007J\b\u0010J\u001a\u00020*H\u0007J\b\u0010K\u001a\u00020&H\u0007J\b\u0010L\u001a\u00020\u0004H\u0007J\n\u0010M\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010N\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010&H\u0007J\b\u0010P\u001a\u00020*H\u0007J\b\u0010Q\u001a\u00020*H\u0007J\n\u0010R\u001a\u0004\u0018\u00010-H\u0007J\b\u0010S\u001a\u00020\u0016H\u0007J\b\u0010T\u001a\u00020\u0004H\u0007J\b\u0010U\u001a\u00020*H\u0007J\b\u0010V\u001a\u00020*H\u0007J\b\u0010W\u001a\u000202H\u0007J\b\u0010X\u001a\u00020\u0004H\u0007J\b\u0010Y\u001a\u00020\u0004H\u0007J\b\u0010Z\u001a\u00020\u0004H\u0007J\b\u0010[\u001a\u00020\u0004H\u0007J\b\u0010\\\u001a\u00020\u0004H\u0007J\u0010\u0010]\u001a\u00020*2\u0006\u0010O\u001a\u00020&H\u0007J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020?0_H\u0007J\b\u0010`\u001a\u00020*H\u0007J\b\u0010a\u001a\u00020bH\u0007J\b\u0010c\u001a\u00020\u0004H\u0007J\b\u0010d\u001a\u00020*H\u0007J\u0010\u0010e\u001a\u00020*2\u0006\u0010f\u001a\u00020\u0016H\u0007J\b\u0010;\u001a\u00020*H\u0007J\b\u0010g\u001a\u00020*H\u0007J\b\u0010<\u001a\u00020*H\u0007J\u0010\u0010h\u001a\u00020*2\u0006\u0010G\u001a\u00020?H\u0007J\u0017\u0010i\u001a\u00020F2\b\u0010O\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0002\bjJ\u0018\u0010k\u001a\u00020F2\u0006\u0010O\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004H\u0003J\u0018\u0010l\u001a\u00020F2\u0006\u0010O\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004H\u0007J\u0010\u0010m\u001a\u00020F2\u0006\u0010G\u001a\u00020?H\u0007J\u0010\u0010n\u001a\u00020F2\u0006\u0010%\u001a\u00020&H\u0007J\u001a\u0010n\u001a\u00020F2\u0006\u0010%\u001a\u00020&2\b\u0010o\u001a\u0004\u0018\u00010pH\u0007J\u0018\u0010n\u001a\u00020F2\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0016H\u0007J\"\u0010n\u001a\u00020F2\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u00162\b\u0010o\u001a\u0004\u0018\u00010pH\u0007J\u0010\u0010q\u001a\u00020F2\u0006\u0010r\u001a\u00020*H\u0007J\u0010\u0010s\u001a\u00020F2\u0006\u0010'\u001a\u00020\u0004H\u0007J\u0012\u0010t\u001a\u00020F2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010u\u001a\u00020F2\u0006\u0010r\u001a\u00020*H\u0007J\u0010\u0010v\u001a\u00020F2\u0006\u0010r\u001a\u00020*H\u0007J\u0010\u0010w\u001a\u00020F2\u0006\u0010+\u001a\u00020-H\u0007J\u0012\u0010x\u001a\u00020F2\b\u0010y\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010z\u001a\u00020F2\u0006\u0010r\u001a\u00020*H\u0007J\u001d\u0010{\u001a\u00020F2\u000e\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010}H\u0007¢\u0006\u0002\u0010~J/\u0010{\u001a\u00020F2\u000e\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010}2\u0006\u0010\u007f\u001a\u00020\u00162\u0007\u0010\u0080\u0001\u001a\u00020\u0016H\u0007¢\u0006\u0003\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020F2\u0006\u00101\u001a\u000202H\u0007J\u0011\u0010\u0083\u0001\u001a\u00020F2\u0006\u00103\u001a\u00020\u0004H\u0007J\u0011\u0010\u0084\u0001\u001a\u00020F2\u0006\u00104\u001a\u00020\u0004H\u0007J\u0017\u0010\u0085\u0001\u001a\u00020F2\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0003\b\u0086\u0001J\u0012\u0010\u0087\u0001\u001a\u00020F2\u0007\u0010\u0088\u0001\u001a\u00020*H\u0007J\u0012\u0010\u0089\u0001\u001a\u00020F2\u0007\u0010\u008a\u0001\u001a\u00020*H\u0007J\u001a\u0010\u008b\u0001\u001a\u00020F2\u0006\u0010O\u001a\u00020&2\u0007\u0010\u008c\u0001\u001a\u00020*H\u0007J\u0011\u0010\u008d\u0001\u001a\u00020F2\u0006\u0010r\u001a\u00020*H\u0007J\u0012\u0010\u008e\u0001\u001a\u00020F2\u0007\u0010\u008f\u0001\u001a\u00020bH\u0007J\t\u0010\u0090\u0001\u001a\u00020FH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \"*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0004\n\u0002\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00108\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010=\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0093\u0001"}, d2 = {"Lcom/facebook/FacebookSdk;", "", "()V", "ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY", "", "APPLICATION_ID_PROPERTY", "APPLICATION_NAME_PROPERTY", "APP_EVENT_PREFERENCES", "ATTRIBUTION_PREFERENCES", "AUTO_INIT_ENABLED_PROPERTY", "AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY", "CALLBACK_OFFSET_CHANGED_AFTER_INIT", "CALLBACK_OFFSET_NEGATIVE", "CALLBACK_OFFSET_PROPERTY", "CLIENT_TOKEN_PROPERTY", "CLOUDBRIDGE_SAVED_CREDENTIALS", "CODELESS_DEBUG_LOG_ENABLED_PROPERTY", "DATA_PROCESSING_OPTIONS_PREFERENCES", "DATA_PROCESSION_OPTIONS", "DATA_PROCESSION_OPTIONS_COUNTRY", "DATA_PROCESSION_OPTIONS_STATE", "DEFAULT_CALLBACK_REQUEST_CODE_OFFSET", "", "FACEBOOK_COM", "FB_GG", "GAMING", "INSTAGRAM", "INSTAGRAM_COM", "LOCK", "Ljava/util/concurrent/locks/ReentrantLock;", "MAX_REQUEST_CODE_RANGE", "MONITOR_ENABLED_PROPERTY", "PUBLISH_ACTIVITY_PATH", "TAG", "kotlin.jvm.PlatformType", "WEB_DIALOG_THEME", "appClientToken", "applicationContext", "Landroid/content/Context;", "applicationId", "applicationName", "bypassAppSwitch", "", "cacheDir", "Lcom/facebook/internal/LockOnGetVariable;", "Ljava/io/File;", "callbackRequestCodeOffset", "codelessDebugLogEnabled", "Ljava/lang/Boolean;", "executor", "Ljava/util/concurrent/Executor;", "facebookDomain", "graphApiVersion", "graphRequestCreator", "Lcom/facebook/FacebookSdk$GraphRequestCreator;", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "instagramDomain", "isDebugEnabledField", "isFullyInitialized", "isLegacyTokenUpgradeSupported", "loggingBehaviors", "Ljava/util/HashSet;", "Lcom/facebook/LoggingBehavior;", "Lkotlin/collections/HashSet;", "onProgressThreshold", "Ljava/util/concurrent/atomic/AtomicLong;", "sdkInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "addLoggingBehavior", "", "behavior", "clearLoggingBehaviors", "fullyInitialize", "getAdvertiserIDCollectionEnabled", "getApplicationContext", "getApplicationId", "getApplicationName", "getApplicationSignature", "context", "getAutoInitEnabled", "getAutoLogAppEventsEnabled", "getCacheDir", "getCallbackRequestCodeOffset", "getClientToken", "getCodelessDebugLogEnabled", "getCodelessSetupEnabled", "getExecutor", "getFacebookDomain", "getFacebookGamingDomain", "getGraphApiVersion", "getGraphDomain", "getInstagramDomain", "getLimitEventAndDataUsage", "getLoggingBehaviors", "", "getMonitorEnabled", "getOnProgressThreshold", "", "getSdkVersion", "isDebugEnabled", "isFacebookRequestCode", "requestCode", "isInitialized", "isLoggingBehaviorEnabled", "loadDefaultsFromMetadata", "loadDefaultsFromMetadata$facebook_core_release", "publishInstallAndWaitForResponse", "publishInstallAsync", "removeLoggingBehavior", "sdkInitialize", "callback", "Lcom/facebook/FacebookSdk$InitializeCallback;", "setAdvertiserIDCollectionEnabled", "flag", "setApplicationId", "setApplicationName", "setAutoInitEnabled", "setAutoLogAppEventsEnabled", "setCacheDir", "setClientToken", "clientToken", "setCodelessDebugLogEnabled", "setDataProcessingOptions", "options", "", "([Ljava/lang/String;)V", "country", "state", "([Ljava/lang/String;II)V", "setExecutor", "setFacebookDomain", "setGraphApiVersion", "setGraphRequestCreator", "setGraphRequestCreator$facebook_core_release", "setIsDebugEnabled", "enabled", "setLegacyTokenUpgradeSupported", "supported", "setLimitEventAndDataUsage", "limitEventUsage", "setMonitorEnabled", "setOnProgressThreshold", "threshold", "updateGraphDebugBehavior", "GraphRequestCreator", "InitializeCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookSdk {
    public static final java.lang.String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
    public static final java.lang.String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final java.lang.String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    public static final java.lang.String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final java.lang.String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    public static final java.lang.String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";
    public static final java.lang.String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
    public static final java.lang.String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
    public static final java.lang.String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final java.lang.String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
    public static final java.lang.String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    public static final java.lang.String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";
    public static final java.lang.String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
    public static final java.lang.String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";
    public static final java.lang.String DATA_PROCESSION_OPTIONS = "data_processing_options";
    public static final java.lang.String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";
    public static final java.lang.String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";
    public static final java.lang.String FACEBOOK_COM = "facebook.com";
    public static final java.lang.String FB_GG = "fb.gg";
    public static final java.lang.String GAMING = "gaming";
    public static final java.lang.String INSTAGRAM = "instagram";
    public static final java.lang.String INSTAGRAM_COM = "instagram.com";
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    public static final java.lang.String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";
    private static final java.lang.String PUBLISH_ACTIVITY_PATH = "%s/activities";
    public static final java.lang.String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile java.lang.String appClientToken;
    private static android.content.Context applicationContext;
    private static volatile java.lang.String applicationId;
    private static volatile java.lang.String applicationName;
    public static boolean bypassAppSwitch;
    private static com.facebook.internal.LockOnGetVariable<java.io.File> cacheDir;
    private static volatile java.lang.Boolean codelessDebugLogEnabled;
    private static java.util.concurrent.Executor executor;
    private static volatile java.lang.String facebookDomain;
    private static java.lang.String graphApiVersion;
    private static com.facebook.FacebookSdk.GraphRequestCreator graphRequestCreator;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static volatile java.lang.String instagramDomain;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;
    private static final java.util.concurrent.atomic.AtomicBoolean sdkInitialized;
    public static final com.facebook.FacebookSdk INSTANCE = new com.facebook.FacebookSdk();
    private static final java.lang.String TAG = com.facebook.FacebookSdk.class.getCanonicalName();
    private static final java.util.HashSet<com.facebook.LoggingBehavior> loggingBehaviors = kotlin.collections.SetsKt.hashSetOf(com.facebook.LoggingBehavior.DEVELOPER_ERRORS);
    private static java.util.concurrent.atomic.AtomicLong onProgressThreshold = new java.util.concurrent.atomic.AtomicLong(android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;
    private static final java.util.concurrent.locks.ReentrantLock LOCK = new java.util.concurrent.locks.ReentrantLock();

    /* compiled from: FacebookSdk.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bá\u0080\u0001\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/facebook/FacebookSdk$GraphRequestCreator;", "", "createPostRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "publishUrl", "", "publishParams", "Lorg/json/JSONObject;", "callback", "Lcom/facebook/GraphRequest$Callback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface GraphRequestCreator {
        com.facebook.GraphRequest createPostRequest(com.facebook.AccessToken accessToken, java.lang.String publishUrl, org.json.JSONObject publishParams, com.facebook.GraphRequest.Callback callback);
    }

    /* compiled from: FacebookSdk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookSdk$InitializeCallback;", "", "onInitialized", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface InitializeCallback {
        void onInitialized();
    }

    private FacebookSdk() {
    }

    static {
        com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
        graphApiVersion = com.facebook.internal.ServerProtocol.getDefaultAPIVersion();
        sdkInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        instagramDomain = INSTAGRAM_COM;
        facebookDomain = FACEBOOK_COM;
        graphRequestCreator = new com.facebook.FacebookSdk.GraphRequestCreator() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda0
            @Override // com.facebook.FacebookSdk.GraphRequestCreator
            public final com.facebook.GraphRequest createPostRequest(com.facebook.AccessToken accessToken, java.lang.String str, org.json.JSONObject jSONObject, com.facebook.GraphRequest.Callback callback) {
                com.facebook.GraphRequest m5056graphRequestCreator$lambda0;
                m5056graphRequestCreator$lambda0 = com.facebook.FacebookSdk.m5056graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
                return m5056graphRequestCreator$lambda0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: graphRequestCreator$lambda-0, reason: not valid java name */
    public static final com.facebook.GraphRequest m5056graphRequestCreator$lambda0(com.facebook.AccessToken accessToken, java.lang.String str, org.json.JSONObject jSONObject, com.facebook.GraphRequest.Callback callback) {
        return com.facebook.GraphRequest.INSTANCE.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.concurrent.Executor getExecutor() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            java.util.concurrent.Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setExecutor(java.util.concurrent.Executor executor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "executor");
        java.util.concurrent.locks.ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final long getOnProgressThreshold() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    @kotlin.jvm.JvmStatic
    public static final void setOnProgressThreshold(long threshold) {
        onProgressThreshold.set(threshold);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    @kotlin.jvm.JvmStatic
    public static final void setIsDebugEnabled(boolean enabled) {
        isDebugEnabledField = enabled;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    @kotlin.jvm.JvmStatic
    public static final void setLegacyTokenUpgradeSupported(boolean supported) {
        isLegacyTokenUpgradeSupported = supported;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGraphApiVersion() {
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        java.lang.String str = TAG;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("getGraphApiVersion: %s", java.util.Arrays.copyOf(new java.lang.Object[]{graphApiVersion}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        com.facebook.internal.Utility.logd(str, format);
        return graphApiVersion;
    }

    @kotlin.jvm.JvmStatic
    public static final void setGraphApiVersion(java.lang.String graphApiVersion2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphApiVersion2, "graphApiVersion");
        android.util.Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(graphApiVersion2) || kotlin.jvm.internal.Intrinsics.areEqual(graphApiVersion, graphApiVersion2)) {
            return;
        }
        graphApiVersion = graphApiVersion2;
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized boolean isFullyInitialized() {
        boolean z;
        synchronized (com.facebook.FacebookSdk.class) {
            z = isFullyInitialized;
        }
        return z;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFacebookDomain() {
        return facebookDomain;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFacebookGamingDomain() {
        return FB_GG;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getInstagramDomain() {
        return instagramDomain;
    }

    @kotlin.jvm.JvmStatic
    public static final void setFacebookDomain(java.lang.String facebookDomain2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(facebookDomain2, "facebookDomain");
        android.util.Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = facebookDomain2;
    }

    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    public static final synchronized void sdkInitialize(android.content.Context applicationContext2, int callbackRequestCodeOffset2) {
        synchronized (com.facebook.FacebookSdk.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
            sdkInitialize(applicationContext2, callbackRequestCodeOffset2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        com.facebook.FacebookSdk.callbackRequestCodeOffset = r3;
        sdkInitialize(r2, r4);
     */
    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void sdkInitialize(android.content.Context applicationContext2, int callbackRequestCodeOffset2, com.facebook.FacebookSdk.InitializeCallback callback) {
        synchronized (com.facebook.FacebookSdk.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
            if (sdkInitialized.get() && callbackRequestCodeOffset2 != callbackRequestCodeOffset) {
                throw new com.facebook.FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
            }
            throw new com.facebook.FacebookException(CALLBACK_OFFSET_NEGATIVE);
        }
    }

    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    public static final synchronized void sdkInitialize(android.content.Context applicationContext2) {
        synchronized (com.facebook.FacebookSdk.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
            sdkInitialize(applicationContext2, (com.facebook.FacebookSdk.InitializeCallback) null);
        }
    }

    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    public static final synchronized void sdkInitialize(android.content.Context applicationContext2, final com.facebook.FacebookSdk.InitializeCallback callback) {
        synchronized (com.facebook.FacebookSdk.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sdkInitialized;
            if (atomicBoolean.get()) {
                if (callback != null) {
                    callback.onInitialized();
                }
                return;
            }
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.hasFacebookActivity(applicationContext2, false);
            com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.hasInternetPermissions(applicationContext2, false);
            android.content.Context applicationContext3 = applicationContext2.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext.applicationContext");
            applicationContext = applicationContext3;
            com.facebook.appevents.AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(applicationContext2);
            android.content.Context context = applicationContext;
            if (context == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            loadDefaultsFromMetadata$facebook_core_release(context);
            java.lang.String str = applicationId;
            if (str == null || str.length() == 0) {
                throw new com.facebook.FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            java.lang.String str2 = appClientToken;
            if (str2 == null || str2.length() == 0) {
                throw new com.facebook.FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            atomicBoolean.set(true);
            if (getAutoInitEnabled()) {
                fullyInitialize();
            }
            android.content.Context context2 = applicationContext;
            if (context2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            if (context2 instanceof android.app.Application) {
                com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
                if (com.facebook.UserSettingsManager.getAutoLogAppEventsEnabled()) {
                    com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
                    android.content.Context context3 = applicationContext;
                    if (context3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        throw null;
                    }
                    com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking((android.app.Application) context3, applicationId);
                }
            }
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.internal.FetchedAppSettingsManager.loadAppSettingsAsync();
            com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
            com.facebook.internal.NativeProtocol.updateAllAvailableProtocolVersionsAsync();
            com.facebook.internal.BoltsMeasurementEventListener.Companion companion = com.facebook.internal.BoltsMeasurementEventListener.INSTANCE;
            android.content.Context context4 = applicationContext;
            if (context4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            companion.getInstance(context4);
            cacheDir = new com.facebook.internal.LockOnGetVariable<>(new java.util.concurrent.Callable() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.io.File m5058sdkInitialize$lambda3;
                    m5058sdkInitialize$lambda3 = com.facebook.FacebookSdk.m5058sdkInitialize$lambda3();
                    return m5058sdkInitialize$lambda3;
                }
            });
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.Instrument, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda2
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.FacebookSdk.m5059sdkInitialize$lambda4(z);
                }
            });
            com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.AppEvents, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda3
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.FacebookSdk.m5060sdkInitialize$lambda5(z);
                }
            });
            com.facebook.internal.FeatureManager featureManager3 = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda4
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.FacebookSdk.m5061sdkInitialize$lambda6(z);
                }
            });
            com.facebook.internal.FeatureManager featureManager4 = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda5
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.FacebookSdk.m5062sdkInitialize$lambda7(z);
                }
            });
            com.facebook.internal.FeatureManager featureManager5 = com.facebook.internal.FeatureManager.INSTANCE;
            com.facebook.internal.FeatureManager.checkFeature(com.facebook.internal.FeatureManager.Feature.BypassAppSwitch, new com.facebook.internal.FeatureManager.Callback() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda6
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    com.facebook.FacebookSdk.m5063sdkInitialize$lambda8(z);
                }
            });
            getExecutor().execute(new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda7
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Void m5064sdkInitialize$lambda9;
                    m5064sdkInitialize$lambda9 = com.facebook.FacebookSdk.m5064sdkInitialize$lambda9(com.facebook.FacebookSdk.InitializeCallback.this);
                    return m5064sdkInitialize$lambda9;
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-3, reason: not valid java name */
    public static final java.io.File m5058sdkInitialize$lambda3() {
        android.content.Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-4, reason: not valid java name */
    public static final void m5059sdkInitialize$lambda4(boolean z) {
        if (z) {
            com.facebook.internal.instrument.InstrumentManager instrumentManager = com.facebook.internal.instrument.InstrumentManager.INSTANCE;
            com.facebook.internal.instrument.InstrumentManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-5, reason: not valid java name */
    public static final void m5060sdkInitialize$lambda5(boolean z) {
        if (z) {
            com.facebook.appevents.AppEventsManager appEventsManager = com.facebook.appevents.AppEventsManager.INSTANCE;
            com.facebook.appevents.AppEventsManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-6, reason: not valid java name */
    public static final void m5061sdkInitialize$lambda6(boolean z) {
        if (z) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-7, reason: not valid java name */
    public static final void m5062sdkInitialize$lambda7(boolean z) {
        if (z) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-8, reason: not valid java name */
    public static final void m5063sdkInitialize$lambda8(boolean z) {
        if (z) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-9, reason: not valid java name */
    public static final java.lang.Void m5064sdkInitialize$lambda9(com.facebook.FacebookSdk.InitializeCallback initializeCallback) {
        com.facebook.AccessTokenManager.INSTANCE.getInstance().loadCurrentAccessToken();
        com.facebook.ProfileManager.INSTANCE.getInstance().loadCurrentProfile();
        if (com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive() && com.facebook.Profile.INSTANCE.getCurrentProfile() == null) {
            com.facebook.Profile.INSTANCE.fetchProfileForCurrentAccessToken();
        }
        if (initializeCallback != null) {
            initializeCallback.onInitialized();
        }
        com.facebook.appevents.AppEventsLogger.INSTANCE.initializeLib(getApplicationContext(), applicationId);
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        com.facebook.UserSettingsManager.logIfAutoAppLinkEnabled();
        com.facebook.appevents.AppEventsLogger.Companion companion = com.facebook.appevents.AppEventsLogger.INSTANCE;
        android.content.Context applicationContext2 = getApplicationContext().getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext().applicationContext");
        companion.newLogger(applicationContext2).flush();
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    @kotlin.jvm.JvmStatic
    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<com.facebook.LoggingBehavior> getLoggingBehaviors() {
        java.util.Set<com.facebook.LoggingBehavior> unmodifiableSet;
        java.util.HashSet<com.facebook.LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            unmodifiableSet = java.util.Collections.unmodifiableSet(new java.util.HashSet(hashSet));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return unmodifiableSet;
    }

    @kotlin.jvm.JvmStatic
    public static final void addLoggingBehavior(com.facebook.LoggingBehavior behavior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
        java.util.HashSet<com.facebook.LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(behavior);
            INSTANCE.updateGraphDebugBehavior();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void removeLoggingBehavior(com.facebook.LoggingBehavior behavior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
        java.util.HashSet<com.facebook.LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(behavior);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void clearLoggingBehaviors() {
        java.util.HashSet<com.facebook.LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isLoggingBehaviorEnabled(com.facebook.LoggingBehavior behavior) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
        java.util.HashSet<com.facebook.LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            if (isDebugEnabled()) {
                z = hashSet.contains(behavior);
            }
        }
        return z;
    }

    private final void updateGraphDebugBehavior() {
        java.util.HashSet<com.facebook.LoggingBehavior> hashSet = loggingBehaviors;
        if (!hashSet.contains(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO) || hashSet.contains(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            return;
        }
        hashSet.add(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGraphDomain() {
        com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
        java.lang.String graphDomain = currentAccessToken != null ? currentAccessToken.getGraphDomain() : null;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        return com.facebook.internal.Utility.getGraphDomainFromTokenDomain(graphDomain);
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Context getApplicationContext() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        android.content.Context context = applicationContext;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    @kotlin.jvm.JvmStatic
    public static final void publishInstallAsync(android.content.Context context, final java.lang.String applicationId2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.FacebookSdk.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
            final android.content.Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
            if (!com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(com.facebook.appevents.AppEventsLoggerImpl.APP_EVENTS_KILLSWITCH, getApplicationId(), false)) {
                getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.FacebookSdk$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.FacebookSdk.m5057publishInstallAsync$lambda15(applicationContext2, applicationId2);
                    }
                });
            }
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing)) {
                com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager onDeviceProcessingManager = com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.INSTANCE;
                if (com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                    com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager onDeviceProcessingManager2 = com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.INSTANCE;
                    com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.sendInstallEventAsync(applicationId2, ATTRIBUTION_PREFERENCES);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.FacebookSdk.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: publishInstallAsync$lambda-15, reason: not valid java name */
    public static final void m5057publishInstallAsync$lambda15(android.content.Context applicationContext2, java.lang.String applicationId2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "$applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
        INSTANCE.publishInstallAndWaitForResponse(applicationContext2, applicationId2);
    }

    private final void publishInstallAndWaitForResponse(android.content.Context context, java.lang.String applicationId2) {
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                com.facebook.internal.AttributionIdentifiers attributionIdentifiers = com.facebook.internal.AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(applicationId2, "ping");
                long j = sharedPreferences.getLong(stringPlus, 0L);
                try {
                    com.facebook.appevents.internal.AppEventsLoggerUtility appEventsLoggerUtility = com.facebook.appevents.internal.AppEventsLoggerUtility.INSTANCE;
                    org.json.JSONObject jSONObjectForGraphAPICall = com.facebook.appevents.internal.AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, com.facebook.appevents.AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format = java.lang.String.format(PUBLISH_ACTIVITY_PATH, java.util.Arrays.copyOf(new java.lang.Object[]{applicationId2}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    com.facebook.GraphRequest createPostRequest = graphRequestCreator.createPostRequest(null, format, jSONObjectForGraphAPICall, null);
                    if (j == 0 && createPostRequest.executeAndWait().getError() == null) {
                        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(stringPlus, java.lang.System.currentTimeMillis());
                        edit.apply();
                        com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                        com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
                        java.lang.String TAG2 = TAG;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        companion.log(loggingBehavior, TAG2, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (org.json.JSONException e) {
                    throw new com.facebook.FacebookException("An error occurred while publishing install.", e);
                }
            } catch (java.lang.Exception e2) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd("Facebook-publish", e2);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getSdkVersion() {
        return com.facebook.FacebookSdkVersion.BUILD;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getLimitEventAndDataUsage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    @kotlin.jvm.JvmStatic
    public static final void setLimitEventAndDataUsage(android.content.Context context, boolean limitEventUsage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", limitEventUsage).apply();
    }

    @kotlin.jvm.JvmStatic
    public static final void loadDefaultsFromMetadata$facebook_core_release(android.content.Context context) {
        if (context == null) {
            return;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                java.lang.Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof java.lang.String) {
                    java.lang.String str = (java.lang.String) obj;
                    java.util.Locale ROOT = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    java.lang.String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (kotlin.text.StringsKt.startsWith$default(lowerCase, "fb", false, 2, (java.lang.Object) null)) {
                        java.lang.String substring = str.substring(2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        applicationId = substring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof java.lang.Number) {
                    throw new com.facebook.FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getApplicationSignature(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.FacebookSdk.class)) {
            return null;
        }
        try {
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.sdkInitialized();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                android.content.pm.Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return android.util.Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.FacebookSdk.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getApplicationId() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        java.lang.String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new com.facebook.FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @kotlin.jvm.JvmStatic
    public static final void setApplicationId(java.lang.String applicationId2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getApplicationName() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        return applicationName;
    }

    @kotlin.jvm.JvmStatic
    public static final void setApplicationName(java.lang.String applicationName2) {
        applicationName = applicationName2;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getClientToken() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        java.lang.String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new com.facebook.FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @kotlin.jvm.JvmStatic
    public static final void setClientToken(java.lang.String clientToken) {
        appClientToken = clientToken;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getAutoInitEnabled() {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        return com.facebook.UserSettingsManager.getAutoInitEnabled();
    }

    @kotlin.jvm.JvmStatic
    public static final void setAutoInitEnabled(boolean flag) {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        com.facebook.UserSettingsManager.setAutoInitEnabled(flag);
        if (flag) {
            fullyInitialize();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getAutoLogAppEventsEnabled() {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        return com.facebook.UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    @kotlin.jvm.JvmStatic
    public static final void setAutoLogAppEventsEnabled(boolean flag) {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        com.facebook.UserSettingsManager.setAutoLogAppEventsEnabled(flag);
        if (flag) {
            android.app.Application application = (android.app.Application) getApplicationContext();
            com.facebook.appevents.internal.ActivityLifecycleTracker activityLifecycleTracker = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE;
            com.facebook.appevents.internal.ActivityLifecycleTracker.startTracking(application, getApplicationId());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getCodelessDebugLogEnabled() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        java.lang.Boolean bool = codelessDebugLogEnabled;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getCodelessSetupEnabled() {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        return com.facebook.UserSettingsManager.getCodelessSetupEnabled();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getAdvertiserIDCollectionEnabled() {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        return com.facebook.UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    @kotlin.jvm.JvmStatic
    public static final void setAdvertiserIDCollectionEnabled(boolean flag) {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        com.facebook.UserSettingsManager.setAdvertiserIDCollectionEnabled(flag);
    }

    @kotlin.jvm.JvmStatic
    public static final void setCodelessDebugLogEnabled(boolean flag) {
        codelessDebugLogEnabled = java.lang.Boolean.valueOf(flag);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getMonitorEnabled() {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        return com.facebook.UserSettingsManager.getMonitorEnabled();
    }

    @kotlin.jvm.JvmStatic
    public static final void setMonitorEnabled(boolean flag) {
        com.facebook.UserSettingsManager userSettingsManager = com.facebook.UserSettingsManager.INSTANCE;
        com.facebook.UserSettingsManager.setMonitorEnabled(flag);
    }

    @kotlin.jvm.JvmStatic
    public static final void setDataProcessingOptions(java.lang.String[] options) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(options, 0, 0);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.FacebookSdk.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setDataProcessingOptions(java.lang.String[] options, int country, int state) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.FacebookSdk.class)) {
            return;
        }
        if (options == null) {
            try {
                options = new java.lang.String[0];
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.FacebookSdk.class);
                return;
            }
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(DATA_PROCESSION_OPTIONS, new org.json.JSONArray((java.util.Collection) kotlin.collections.ArraysKt.toList(options)));
            jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, country);
            jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, state);
            android.content.Context context = applicationContext;
            if (context == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
        } catch (org.json.JSONException unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File getCacheDir() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        com.facebook.internal.LockOnGetVariable<java.io.File> lockOnGetVariable = cacheDir;
        if (lockOnGetVariable != null) {
            return lockOnGetVariable.getValue();
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
        throw null;
    }

    @kotlin.jvm.JvmStatic
    public static final void setCacheDir(java.io.File cacheDir2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDir2, "cacheDir");
        cacheDir = new com.facebook.internal.LockOnGetVariable<>(cacheDir2);
    }

    @kotlin.jvm.JvmStatic
    public static final int getCallbackRequestCodeOffset() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isFacebookRequestCode(int requestCode) {
        int i = callbackRequestCodeOffset;
        return requestCode >= i && requestCode < i + 100;
    }

    @kotlin.jvm.JvmStatic
    public static final void setGraphRequestCreator$facebook_core_release(com.facebook.FacebookSdk.GraphRequestCreator graphRequestCreator2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphRequestCreator2, "graphRequestCreator");
        graphRequestCreator = graphRequestCreator2;
    }
}
