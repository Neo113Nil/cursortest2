package com.unity3d.services;

/* compiled from: UnityAdsConstants.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants;", "", "()V", "AdOperations", "Cache", "ClientInfo", "DefaultUrls", "ErrorHandler", "Messages", "OpenMeasurement", "Preferences", "RequestPolicy", "SafeGuards", "SharedFlow", com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_TIMEOUT, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityAdsConstants {
    public static final com.unity3d.services.UnityAdsConstants INSTANCE = new com.unity3d.services.UnityAdsConstants();

    private UnityAdsConstants() {
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Messages;", "", "()V", "MSG_INTERNAL_ERROR", "", "MSG_UNITY_BASE", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Messages {
        public static final com.unity3d.services.UnityAdsConstants.Messages INSTANCE = new com.unity3d.services.UnityAdsConstants.Messages();
        public static final java.lang.String MSG_INTERNAL_ERROR = "Internal error";
        public static final java.lang.String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Timeout;", "", "()V", "INIT_TIMEOUT_MS", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Timeout {
        public static final long INIT_TIMEOUT_MS = 120000;
        public static final com.unity3d.services.UnityAdsConstants.Timeout INSTANCE = new com.unity3d.services.UnityAdsConstants.Timeout();

        private Timeout() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$RequestPolicy;", "", "()V", "CONNECT_TIMEOUT_MS", "", "OVERALL_TIMEOUT_MS", "READ_TIMEOUT_MS", "RETRY_JITTER_PCT", "", "RETRY_MAX_DURATION", "RETRY_MAX_INTERVAL", "RETRY_SCALING_FACTOR", "RETRY_WAIT_BASE", "SHOULD_STORE_LOCALLY", "", "WRITE_TIMEOUT_MS", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 30000;
        public static final com.unity3d.services.UnityAdsConstants.RequestPolicy INSTANCE = new com.unity3d.services.UnityAdsConstants.RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 30000;
        public static final int READ_TIMEOUT_MS = 30000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 120000;
        public static final int RETRY_MAX_INTERVAL = 2500;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 30000;

        private RequestPolicy() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SharedFlow;", "", "()V", "EXTRA_CAPACITY", "", "REPLAY", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;
        public static final com.unity3d.services.UnityAdsConstants.SharedFlow INSTANCE = new com.unity3d.services.UnityAdsConstants.SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$DefaultUrls;", "", "()V", "AD_ASSET_DOMAIN", "", "AD_CACHE_DOMAIN", "AD_PLAYER_QUERY_PARAMS", "CACHE_DIR_NAME", "CACHE_WEBVIEW_DIR_NAME", "GATEWAY_URL", "HTTP_CACHE_DIR_NAME", "HTTP_CACHE_OK_HTTP_DIR_NAME", "WEBVIEW_ASSET_PATH", "WEBVIEW_ASSET_PATH_LOCAL", "WEBVIEW_DOMAIN", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultUrls {
        public static final java.lang.String AD_ASSET_DOMAIN = "unity.ads.asset";
        public static final java.lang.String AD_CACHE_DOMAIN = "unity.ads.cache";
        public static final java.lang.String AD_PLAYER_QUERY_PARAMS = "?platform=android&mode=ad-viewer&";
        public static final java.lang.String CACHE_DIR_NAME = "UnityAdsCache";
        public static final java.lang.String CACHE_WEBVIEW_DIR_NAME = "webview_cache";
        public static final java.lang.String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";
        public static final java.lang.String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";
        public static final java.lang.String HTTP_CACHE_OK_HTTP_DIR_NAME = "UnityAdsOkHttpCache";
        public static final com.unity3d.services.UnityAdsConstants.DefaultUrls INSTANCE = new com.unity3d.services.UnityAdsConstants.DefaultUrls();
        public static final java.lang.String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";
        public static final java.lang.String WEBVIEW_ASSET_PATH_LOCAL = "ad-viewer/";
        public static final java.lang.String WEBVIEW_DOMAIN = "webview.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$ClientInfo;", "", "()V", "SDK_VERSION", "", "SDK_VERSION_NAME", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientInfo {
        public static final com.unity3d.services.UnityAdsConstants.ClientInfo INSTANCE = new com.unity3d.services.UnityAdsConstants.ClientInfo();
        public static final int SDK_VERSION = 41605;
        public static final java.lang.String SDK_VERSION_NAME = "4.16.5";

        private ClientInfo() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$OpenMeasurement;", "", "()V", "OM_JS_SERVICE_FILENAME", "", "OM_JS_SESSION_FILENAME", "OM_JS_URL_SERVICE", "OM_JS_URL_SESSION", "OM_PARTNER_NAME", "OM_PARTNER_VERSION", "OM_SESSION_FINISH_DELAY_MS", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenMeasurement {
        public static final com.unity3d.services.UnityAdsConstants.OpenMeasurement INSTANCE = new com.unity3d.services.UnityAdsConstants.OpenMeasurement();
        public static final java.lang.String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";
        public static final java.lang.String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";
        public static final java.lang.String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";
        public static final java.lang.String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";
        public static final java.lang.String OM_PARTNER_NAME = "Unity3d";
        public static final java.lang.String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Cache;", "", "()V", "CACHE_SCHEME", "", "DATASTORE_PATH", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cache {
        public static final java.lang.String CACHE_SCHEME = "unity-ads-cache";
        public static final java.lang.String DATASTORE_PATH = "unityAdsDatastore/";
        public static final com.unity3d.services.UnityAdsConstants.Cache INSTANCE = new com.unity3d.services.UnityAdsConstants.Cache();

        private Cache() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$AdOperations;", "", "()V", "GET_TOKEN_TIMEOUT_MS", "", "LOAD_TIMEOUT_MS", "SHOW_TIMEOUT_MS", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 750;
        public static final com.unity3d.services.UnityAdsConstants.AdOperations INSTANCE = new com.unity3d.services.UnityAdsConstants.AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$Preferences;", "", "()V", "PREF_KEY_AUID", "", "PREF_KEY_IDFI", "PREF_KEY_UNITY_INSTALLATION_ID", "PREF_KEY_UNITY_MEGA_SESSION_ID", "PREF_NAME_AUID", "PREF_NAME_IDFI", "UNITY_PLAYER_PREF_PREFIX", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Preferences {
        public static final com.unity3d.services.UnityAdsConstants.Preferences INSTANCE = new com.unity3d.services.UnityAdsConstants.Preferences();
        public static final java.lang.String PREF_KEY_AUID = "auid";
        public static final java.lang.String PREF_KEY_IDFI = "unityads-idfi";
        public static final java.lang.String PREF_KEY_UNITY_INSTALLATION_ID = "unity_connect.installation_id";
        public static final java.lang.String PREF_KEY_UNITY_MEGA_SESSION_ID = "unity_connect.mega_session_id";
        public static final java.lang.String PREF_NAME_AUID = "supersonic_shared_preferen";
        public static final java.lang.String PREF_NAME_IDFI = "unityads-installinfo";
        private static final java.lang.String UNITY_PLAYER_PREF_PREFIX = "unity_connect";

        private Preferences() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$ErrorHandler;", "", "()V", "ERROR_HANDLER_STACK_TRACE_LINES_MAX", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorHandler {
        public static final int ERROR_HANDLER_STACK_TRACE_LINES_MAX = 15;
        public static final com.unity3d.services.UnityAdsConstants.ErrorHandler INSTANCE = new com.unity3d.services.UnityAdsConstants.ErrorHandler();

        private ErrorHandler() {
        }
    }

    /* compiled from: UnityAdsConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SafeGuards;", "", "()V", "InitRequestRetryPolicy", "InitRequestTimeoutPolicy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SafeGuards {
        public static final com.unity3d.services.UnityAdsConstants.SafeGuards INSTANCE = new com.unity3d.services.UnityAdsConstants.SafeGuards();

        /* compiled from: UnityAdsConstants.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SafeGuards$InitRequestRetryPolicy;", "", "()V", "MAX_JITTER_PCT", "", "MIN_DURATION", "", "MIN_JITTER_PCT", "MIN_MAX_INTERVAL", "MIN_SCALING_FACTOR", "MIN_WAIT_BASE", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitRequestRetryPolicy {
            public static final com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy INSTANCE = new com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy();
            public static final float MAX_JITTER_PCT = 100.0f;
            public static final int MIN_DURATION = 5000;
            public static final float MIN_JITTER_PCT = 0.0f;
            public static final int MIN_MAX_INTERVAL = 0;
            public static final float MIN_SCALING_FACTOR = 0.1f;
            public static final int MIN_WAIT_BASE = 0;

            private InitRequestRetryPolicy() {
            }
        }

        private SafeGuards() {
        }

        /* compiled from: UnityAdsConstants.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityAdsConstants$SafeGuards$InitRequestTimeoutPolicy;", "", "()V", "MIN_TIMEOUT", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitRequestTimeoutPolicy {
            public static final com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy INSTANCE = new com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy();
            public static final int MIN_TIMEOUT = 1000;

            private InitRequestTimeoutPolicy() {
            }
        }
    }
}
