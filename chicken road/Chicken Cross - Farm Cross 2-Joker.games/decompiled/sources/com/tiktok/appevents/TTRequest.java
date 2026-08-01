package com.tiktok.appevents;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.BuildConfig;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.JSON;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTConst;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import com.tiktok.util.TimeUtil;
import com.tiktok.util.UrlConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class TTRequest {
    private static final int MAX_EVENT_SIZE = 50;
    private static final Map<String, String> getHeadParamMap;
    private static final Map<String, String> headParamMap;
    private static final String TAG = "TTRequest";
    private static final TTLogger logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
    private static int toBeSentRequests = 0;
    private static int failedRequests = 0;
    private static int successfulRequests = 0;
    private static final TreeSet<Long> allRequestIds = new TreeSet<>();
    private static final List<TTAppEvent> successfullySentRequests = new CopyOnWriteArrayList();

    TTRequest() {
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        headParamMap = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        getHeadParamMap = concurrentHashMap2;
        concurrentHashMap.put("Content-Type", C4761z5.M);
        concurrentHashMap.put(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        String format = String.format("tiktok-business-android-sdk/%s/%s", BuildConfig.VERSION_NAME, TikTokBusinessSdk.getApiAvailableVersion());
        concurrentHashMap.put("User-Agent", format);
        concurrentHashMap2.put(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        concurrentHashMap2.put("User-Agent", format);
        concurrentHashMap2.put("Content-Type", C4761z5.M);
    }

    public static JSONObject getBusinessSDKConfig() {
        if (TextUtils.isEmpty(TikTokBusinessSdk.getTTAppId()) || TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
            JSONObject build = JSON.build();
            JSON.putBoolean(build, EDPConfig.ConfigConst.ENABLE_SDK, false);
            logger.debug("config request return by appid or ttAppId", new Object[0]);
            return build;
        }
        JSONObject buildConfigParams = buildConfigParams();
        String configUrl = UrlConst.getConfigUrl();
        try {
            String tTAppId = TikTokBusinessSdk.getTTAppId();
            Uri.Builder buildUpon = Uri.parse(configUrl).buildUpon();
            if (tTAppId == null) {
                tTAppId = "";
            }
            configUrl = buildUpon.appendQueryParameter("tiktok_app_id", tTAppId).appendQueryParameter("sdk_version", SystemInfoUtil.getSDKVersion()).appendQueryParameter(L6.H, U3.d).appendQueryParameter("model", Build.MODEL).appendQueryParameter("app_version", SystemInfoUtil.getAppVersionName()).appendQueryParameter("os_version", SystemInfoUtil.getAndroidVersion()).appendQueryParameter("locale", SystemInfoUtil.getBcp47Language()).appendQueryParameter("namespace", SystemInfoUtil.getPackageName()).build().toString();
        } catch (Throwable unused) {
        }
        HttpRequestUtil.HttpResponse doPost = HttpRequestUtil.doPost(configUrl, getHeadParamMap, buildConfigParams.toString(), false);
        if (doPost != null) {
            TTLogger tTLogger = logger;
            tTLogger.debug(doPost.url, new Object[0]);
            tTLogger.debug("code=" + String.valueOf(doPost.code), new Object[0]);
            tTLogger.debug("rsp=" + String.valueOf(doPost.body), new Object[0]);
        }
        if (doPost == null || !doPost.isOK()) {
            return null;
        }
        return JSON.getJsonObject(doPost.body, "data");
    }

    public static JSONObject getDebugModeConfig() {
        try {
            HttpRequestUtil.HttpResponse doPost = HttpRequestUtil.doPost(UrlConst.getDebugModeUrl(), getHeadParamMap, buildConfigParams().toString(), false);
            if (doPost == null || !doPost.isOK()) {
                return null;
            }
            return JSON.getJsonObject(doPost.body, "data");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject buildConfigParams() {
        JSONObject build = JSON.build();
        try {
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, "id", TikTokBusinessSdk.getAppId());
            JSON.putObject(build2, "tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            JSON.putObject(build2, "version", SystemInfoUtil.getAppVersionName());
            JSON.putObject(build, MBridgeConstans.DYNAMIC_VIEW_WX_APP, build2);
            JSONObject build3 = JSON.build();
            JSON.putObject(build3, L6.H, U3.d);
            JSON.putObject(build3, "version", SystemInfoUtil.getAndroidVersion());
            if (TikTokBusinessSdk.isGaidCollectionEnabled()) {
                try {
                    JSON.putObject(build3, L6.X0, TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()).getAdId());
                } catch (Throwable unused) {
                }
            }
            JSON.putObject(build, "device", build3);
            if (TikTokBusinessSdk.isInSdkDebugMode().booleanValue()) {
                JSON.putObject(build, "debug", "true");
            }
            JSONObject build4 = JSON.build();
            JSON.putObject(build4, "name", "tiktok/" + SystemInfoUtil.getLibraryName());
            JSON.putObject(build4, "version", SystemInfoUtil.getSDKVersion());
            JSON.putBoolean(build4, "smart_sdk_client_flag", TikTokBusinessSdk.isEdpEnable());
            JSON.putInt(build4, "auto_iap_track_config", TTInAppPurchaseWrapper.devAutoTrack);
            JSON.putObject(build, "library", build4);
        } catch (Throwable unused2) {
        }
        return build;
    }

    public static synchronized List<TTAppEvent> getSuccessfullySentRequests() {
        List<TTAppEvent> list;
        synchronized (TTRequest.class) {
            list = successfullySentRequests;
        }
        return list;
    }

    public static synchronized List<TTAppEvent> reportAppEvent(JSONObject basePayload, List<TTAppEvent> appEventList, boolean isEdp) {
        synchronized (TTRequest.class) {
            TTUtil.checkThread(TAG);
            if (appEventList != null && !appEventList.isEmpty()) {
                toBeSentRequests = appEventList.size();
                Iterator<TTAppEvent> it = appEventList.iterator();
                while (it.hasNext()) {
                    allRequestIds.add(it.next().getUniqueId());
                }
                failedRequests = 0;
                successfulRequests = 0;
                notifyChange();
                String batchUrl = UrlConst.getBatchUrl();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (List list : averageAssign(appEventList, 50)) {
                    JSONArray buildArr = JSON.buildArr();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        JSONObject transferJson = transferJson((TTAppEvent) it2.next());
                        if (transferJson != null) {
                            JSON.putArr(buildArr, transferJson);
                        }
                    }
                    if (buildArr.length() != 0) {
                        JSON.putObject(basePayload, "batch", null);
                        try {
                            JSON.putObject(basePayload, "batch", buildArr);
                            HttpRequestUtil.HttpResponse doPost = HttpRequestUtil.doPost(batchUrl, headParamMap, basePayload.toString());
                            if (isEdp) {
                                return null;
                            }
                            if (doPost == null || !doPost.isOK()) {
                                arrayList.addAll(list);
                                failedRequests += list.size();
                            } else {
                                try {
                                    TTLogger tTLogger = logger;
                                    tTLogger.debug("url=" + String.valueOf(batchUrl), new Object[0]);
                                    tTLogger.debug("rsp=" + String.valueOf(doPost.body), new Object[0]);
                                    int i2 = doPost.code;
                                    if (!TikTokBusinessSdk.isInSdkDebugMode().booleanValue() && i2 != TTConst.ApiErrorCodes.API_ERROR.code.intValue() && i2 != TTConst.ApiErrorCodes.PARTIAL_SUCCESS.code.intValue()) {
                                        if (i2 != 0) {
                                            arrayList.addAll(list);
                                            failedRequests += list.size();
                                        } else {
                                            successfulRequests += list.size();
                                            successfullySentRequests.addAll(list);
                                        }
                                    }
                                    i += list.size();
                                    failedRequests += list.size();
                                } catch (Throwable th) {
                                    failedRequests += list.size();
                                    arrayList.addAll(list);
                                    TTCrashHandler.handleCrash(TAG, th, 2);
                                }
                            }
                            notifyChange();
                        } catch (Throwable th2) {
                            if (!isEdp) {
                                arrayList.addAll(list);
                            }
                            TTCrashHandler.handleCrash(TAG, th2, 2);
                        }
                    }
                }
                TTLogger tTLogger2 = logger;
                tTLogger2.debug("Flushed %d events successfully", Integer.valueOf(successfulRequests));
                if (!arrayList.isEmpty()) {
                    tTLogger2.debug("Failed to flush %d events, will save them to disk", new Object[0]);
                }
                if (i != 0) {
                    tTLogger2.debug("Failed to flush " + i + " events, will discard them", new Object[0]);
                    TTAppEventLogger.totalDumped += i;
                    if (TikTokBusinessSdk.diskListener != null) {
                        TikTokBusinessSdk.diskListener.onDumped(TTAppEventLogger.totalDumped);
                    }
                }
                tTLogger2.debug("Failed to flush %d events in total", Integer.valueOf(failedRequests));
                toBeSentRequests = 0;
                failedRequests = 0;
                successfulRequests = 0;
                notifyChange();
                return arrayList;
            }
            return new ArrayList();
        }
    }

    private static void notifyChange() {
        if (TikTokBusinessSdk.networkListener != null) {
            TikTokBusinessSdk.networkListener.onNetworkChange(toBeSentRequests, successfulRequests, failedRequests, TTAppEventsQueue.size() + allRequestIds.size(), successfullySentRequests.size());
        }
    }

    private static JSONObject transferJson(TTAppEvent event) {
        if (event == null) {
            return null;
        }
        try {
            JSONObject build = JSON.build();
            JSON.putObject(build, "event_id", UUID.randomUUID());
            JSON.putObject(build, "tt_event_id", TextUtils.isEmpty(event.getEventId()) ? "" : event.getEventId());
            JSON.putObject(build, "type", event.getType());
            if (event.getEventName() != null) {
                JSON.putObject(build, NotificationCompat.CATEGORY_EVENT, event.getEventName());
            }
            JSON.putObject(build, "timestamp", TimeUtil.getISO8601Timestamp(event.getTimeStamp()));
            if (TikTokBusinessSdk.isInSdkLDUMode().booleanValue()) {
                JSON.putBoolean(build, "limited_data_use", true);
            }
            JSONObject build2 = JSON.build(event.getPropertiesJson());
            if (build2 != null && build2.length() > 0) {
                JSON.putObject(build, "properties", build2);
            }
            JSON.putObject(build, "context", TTRequestBuilder.getContextForApi(event));
            ReferrerInfo installReferrer = SystemInfoUtil.getInstallReferrer();
            if (installReferrer != null) {
                JSON.putLong(build, "gp_referrer_install_ts", installReferrer.getGpReferrerInstallTs());
                JSON.putLong(build, "gp_referrer_click_ts", installReferrer.getGpReferrerClickTs());
            }
            String screenShot = event.getScreenShot();
            if (!TextUtils.isEmpty(screenShot)) {
                JSON.putObject(build, "screenshot", screenShot);
            }
            return build;
        } catch (Throwable th) {
            TTCrashHandler.handleCrash(TAG, th, 2);
            return null;
        }
    }

    public static <T> List<List<T>> averageAssign(List<T> sourceList, int splitNum) {
        ArrayList arrayList = new ArrayList();
        if (sourceList != null && !sourceList.isEmpty()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int size = sourceList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        arrayList2.add(sourceList.get(i));
                        if (arrayList2.size() >= splitNum || i == size - 1) {
                            arrayList.add(arrayList2);
                            arrayList2 = new ArrayList();
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                arrayList.add(sourceList);
            }
        }
        return arrayList;
    }

    public static HttpRequestUtil.HttpResponse reportMonitorEvent(JSONObject stat) {
        return HttpRequestUtil.doPost(UrlConst.getMonitorUrl(), headParamMap, stat.toString());
    }

    public static HttpRequestUtil.HttpResponse fetchDeferredDeeplinkWithCompletion() {
        return HttpRequestUtil.doPost(UrlConst.getDDLUrl(), headParamMap, TTRequestBuilder.ddlJson().toString(), false);
    }
}
