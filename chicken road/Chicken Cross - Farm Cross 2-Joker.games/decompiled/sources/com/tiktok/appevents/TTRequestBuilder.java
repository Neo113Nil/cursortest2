package com.tiktok.appevents;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTIdentifierFactory;
import com.tiktok.util.JSON;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTUtil;
import com.tiktok.util.TimeUtil;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class TTRequestBuilder {
    private static final String TAG = "TTRequestBuilder";
    private static JSONObject basePayloadCache = null;
    private static boolean containTestCode = false;
    private static JSONObject contextForApiCache;
    private static JSONObject healthBasePayloadCache;

    TTRequestBuilder() {
    }

    public static JSONObject getBasePayloadWithTs() {
        JSONObject basePayload = getBasePayload();
        JSON.putObject(basePayload, "timestamp", TimeUtil.getISO8601Timestamp(new Date()));
        return basePayload;
    }

    public static JSONObject getBasePayload() {
        JSONObject jSONObject;
        TTUtil.checkThread(TAG);
        boolean z = TikTokBusinessSdk.isInSdkDebugMode().booleanValue() || TikTokBusinessSdk.isEnableDebugMode().booleanValue();
        try {
            jSONObject = basePayloadCache;
        } catch (Throwable unused) {
        }
        if (jSONObject != null) {
            if (z != containTestCode) {
                if (z) {
                    JSON.putObject(jSONObject, "test_event_code", String.valueOf(TikTokBusinessSdk.getTTAppId()));
                    containTestCode = true;
                } else {
                    jSONObject.remove("test_event_code");
                    containTestCode = false;
                }
            }
            return basePayloadCache;
        }
        JSONObject build = JSON.build();
        if (TikTokBusinessSdk.onlyAppIdProvided()) {
            JSON.putObject(build, "app_id", TikTokBusinessSdk.getAppId());
        } else {
            JSON.putObject(build, "tiktok_app_id", TikTokBusinessSdk.getFirstTTAppIds());
        }
        if (z) {
            JSON.putObject(build, "test_event_code", String.valueOf(TikTokBusinessSdk.getTTAppId()));
            containTestCode = true;
        }
        JSON.putObject(build, "event_source", "APP_EVENTS_SDK");
        basePayloadCache = build;
        if (basePayloadCache == null) {
            basePayloadCache = JSON.build();
        }
        return basePayloadCache;
    }

    private static JSONObject getImmutableContextForApi(TTAppEvent event) {
        TTIdentifierFactory.AdIdInfo adIdInfo;
        JSONObject jSONObject = contextForApiCache;
        if (jSONObject != null) {
            freshOsVersion(jSONObject, event);
            return contextForApiCache;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TTIdentifierFactory.AdIdInfo adIdInfo2 = null;
        try {
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("did_start", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)), null);
            adIdInfo = TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null;
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject metaWithTS = TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis2));
                JSON.putLong(metaWithTS, "latency", currentTimeMillis2 - currentTimeMillis);
                JSON.putBoolean(metaWithTS, "success", (adIdInfo == null || TextUtils.isEmpty(adIdInfo.getAdId())) ? false : true);
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("did_end", metaWithTS, null);
            } catch (Throwable unused) {
                adIdInfo2 = adIdInfo;
                adIdInfo = adIdInfo2;
                JSONObject contextBuilderWithLocalAndLibrary = contextBuilderWithLocalAndLibrary(adIdInfo);
                contextForApiCache = contextBuilderWithLocalAndLibrary;
                freshOsVersion(contextBuilderWithLocalAndLibrary, event);
                return contextForApiCache;
            }
        } catch (Throwable unused2) {
        }
        JSONObject contextBuilderWithLocalAndLibrary2 = contextBuilderWithLocalAndLibrary(adIdInfo);
        contextForApiCache = contextBuilderWithLocalAndLibrary2;
        freshOsVersion(contextBuilderWithLocalAndLibrary2, event);
        return contextForApiCache;
    }

    public static JSONObject ddlJson() {
        try {
            JSONObject build = JSON.build();
            JSONObject contextBuilder = contextBuilder(TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null, true);
            JSON.putObject(contextBuilder, "user", TTUserInfo.sharedInstance.toJsonObject());
            JSON.putObject(build, "tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            JSON.putObject(build, "context", contextBuilder);
            JSON.putObject(build, "timestamp", TimeUtil.getISO8601Timestamp(new Date(System.currentTimeMillis())));
            JSON.putObject(build, "ip", SystemInfoUtil.getLocalIpAddress());
            String userAgent = SystemInfoUtil.getUserAgent();
            if (userAgent != null) {
                JSON.putObject(build, "user_agent", userAgent);
            }
            return build;
        } catch (Throwable unused) {
            return JSON.build();
        }
    }

    private static void freshOsVersion(JSONObject contextForApiCache2, TTAppEvent event) {
        try {
            JSONObject jsonObject = JSON.getJsonObject(contextForApiCache2, "device");
            if (event != null && jsonObject != null) {
                JSON.putObject(jsonObject, "os_version", SystemInfoUtil.getAndroidVersion());
                JSON.putObject(jsonObject, "version", null);
            } else {
                JSON.putObject(jsonObject, "version", SystemInfoUtil.getAndroidVersion());
                JSON.putObject(jsonObject, "os_version", null);
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject getContextForApi(TTAppEvent event) {
        try {
            JSONObject build = JSON.build(getImmutableContextForApi(event).toString());
            JSON.putObject(build, "user", event.getUserInfo().toJsonObject());
            return build;
        } catch (Throwable unused) {
            return JSON.build();
        }
    }

    private static JSONObject contextBuilderWithLocalAndLibrary(TTIdentifierFactory.AdIdInfo adIdInfo) {
        JSONObject contextBuilder = contextBuilder(adIdInfo, false);
        JSON.putObject(contextBuilder, "locale", SystemInfoUtil.getLocale());
        JSONObject build = JSON.build();
        JSON.putObject(build, "name", "tiktok/" + SystemInfoUtil.getLibraryName());
        JSON.putObject(build, "version", SystemInfoUtil.getSDKVersion());
        JSON.putObject(contextBuilder, "library", build);
        return contextBuilder;
    }

    private static JSONObject contextBuilder(TTIdentifierFactory.AdIdInfo adIdInfo, boolean isDDL) {
        JSONObject build = JSON.build();
        try {
            if (TikTokBusinessSdk.bothIdsProvided()) {
                JSON.putObject(build, "id", TikTokBusinessSdk.getAppId());
            }
            JSON.putObject(build, "name", SystemInfoUtil.getAppName());
            JSON.putObject(build, "namespace", SystemInfoUtil.getPackageName());
            JSON.putObject(build, "version", SystemInfoUtil.getAppVersionName());
            JSON.putObject(build, InAppPurchaseConstants.METHOD_BUILD, SystemInfoUtil.getAppVersionCode() + "");
            JSON.putObject(build, "tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            JSON.putObject(build, "app_session_id", SystemInfoUtil.getAppSessionId());
            JSON.putObject(build, "anonymous_id", TTUserInfo.sharedInstance.anonymousId);
        } catch (Throwable unused) {
        }
        JSONObject build2 = JSON.build();
        try {
            JSON.putObject(build2, L6.H, U3.d);
            JSON.putObject(build2, "os_version", SystemInfoUtil.getAndroidVersion());
            if (adIdInfo != null) {
                JSON.putObject(build2, L6.X0, adIdInfo.getAdId());
            }
            addDeviceInfo(build2);
        } catch (Throwable unused2) {
        }
        JSONObject build3 = JSON.build();
        JSON.putObject(build3, MBridgeConstans.DYNAMIC_VIEW_WX_APP, build);
        JSON.putObject(build3, "device", build2);
        try {
            if (SystemInfoUtil.getInstallReferrer() != null) {
                JSONObject build4 = JSON.build();
                JSON.putObject(build4, "gp_referrer", SystemInfoUtil.getInstallReferrer().getGoogleInstallReferrer());
                JSON.putObject(build3, "ad", build4);
            }
        } catch (Throwable unused3) {
        }
        if (isDDL) {
            return build3;
        }
        try {
            JSON.putObject(build3, "ip", SystemInfoUtil.getLocalIpAddress());
            String userAgent = SystemInfoUtil.getUserAgent();
            if (userAgent != null) {
                JSON.putObject(build3, "user_agent", userAgent);
            }
        } catch (Throwable unused4) {
        }
        return build3;
    }

    private static JSONObject enrichDeviceBase(JSONObject d) {
        if (d == null) {
            d = JSON.build();
        }
        try {
            JSON.putObject(d, "id", TTUtil.getOrGenAnoId(TikTokBusinessSdk.getApplicationContext(), false));
            JSON.putObject(d, "user_agent", SystemInfoUtil.getUserAgent());
            JSON.putObject(d, "ip", SystemInfoUtil.getLocalIpAddress());
            JSON.putObject(d, "network", SystemInfoUtil.getNetworkClass(TikTokBusinessSdk.getApplicationContext()));
            JSON.putObject(d, "session", TikTokBusinessSdk.getSessionID());
            JSON.putObject(d, "locale", SystemInfoUtil.getBcp47Language());
            JSON.putLong(d, "ts", System.currentTimeMillis() - SystemClock.elapsedRealtime());
            addDeviceInfo(d);
        } catch (Throwable unused) {
        }
        return d;
    }

    private static void addDeviceInfo(JSONObject device) {
        try {
            JSON.putObject(device, "locale", SystemInfoUtil.getBcp47Language());
            JSON.putInt(device, "screen_width", SystemInfoUtil.getsScreenWidth());
            JSON.putInt(device, "screen_height", SystemInfoUtil.getsScreenHeight());
            JSON.putDouble(device, "scale", SystemInfoUtil.getsDensity());
            JSON.putObject(device, "model", Build.MODEL);
            JSON.putObject(device, "version", Build.VERSION.RELEASE);
            JSON.putObject(device, "installer_package", SystemInfoUtil.getInstallSource());
        } catch (Throwable unused) {
        }
    }

    public static JSONObject getHealthMonitorBase() {
        JSONObject jSONObject = healthBasePayloadCache;
        if (jSONObject != null) {
            JSON.putObject(jSONObject, "device", enrichDeviceBase(JSON.getJsonObject(jSONObject, "device")));
            JSON.putObject(healthBasePayloadCache, "timestamp", TimeUtil.getISO8601Timestamp(new Date()));
            return healthBasePayloadCache;
        }
        JSONObject build = JSON.build();
        try {
            JSONObject build2 = JSON.build(getImmutableContextForApi(null).toString());
            JSONObject jsonObject = JSON.getJsonObject(build2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            if (jsonObject == null) {
                jsonObject = JSON.build();
            }
            JSON.putObject(jsonObject, "app_namespace", SystemInfoUtil.getPackageName());
            JSON.putObject(build, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jsonObject);
            JSON.putObject(build, "library", JSON.getJsonObject(build2, "library"));
            JSON.putObject(build, "device", enrichDeviceBase(JSON.getJsonObject(build2, "device")));
            JSON.putObject(build, "log_extra", null);
            healthBasePayloadCache = build;
            JSON.putObject(build, "timestamp", TimeUtil.getISO8601Timestamp(new Date()));
        } catch (Throwable unused) {
        }
        return healthBasePayloadCache;
    }
}
