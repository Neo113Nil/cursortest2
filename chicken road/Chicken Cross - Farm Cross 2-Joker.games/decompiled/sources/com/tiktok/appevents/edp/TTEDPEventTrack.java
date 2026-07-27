package com.tiktok.appevents.edp;

import com.adjust.sdk.Constants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.JSON;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TTEDPEventTrack {
    public static long LAST_CLICK_TS = 0;
    private static boolean hasSendLaunch = false;
    public static volatile boolean isSending = false;
    public static volatile boolean pageShowIsSending = false;
    private static final Random sRandom = new Random();
    private static TTAppLaunchEvent ttAppLaunchEvent;

    public static void trackAppLaunch(String refer, String sourceUrl) {
        try {
            JSONObject build = JSON.build();
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_REFER, refer);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_SOURCE_URL, sourceUrl);
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, Constants.REFERRER_API_META, build);
            if (TikTokBusinessSdk.isInitialized()) {
                TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_APP_LAUNCH, build2, null);
            } else if (ttAppLaunchEvent == null && !hasSendLaunch) {
                ttAppLaunchEvent = new TTAppLaunchEvent(build, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public static void trackFirstAppLaunch() {
        try {
            if (ttAppLaunchEvent != null) {
                hasSendLaunch = true;
                JSONObject build = JSON.build();
                JSON.putObject(build, Constants.REFERRER_API_META, ttAppLaunchEvent.getProp());
                TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_APP_LAUNCH, build, null);
                ttAppLaunchEvent = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void trackWebviewRequest(String url) {
        try {
            JSONObject build = JSON.build();
            JSON.putObject(build, "url", url);
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, Constants.REFERRER_API_META, build);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_WEBVIEW_REQUEST, build2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackPageShow(String pageName, int index, boolean isFromBackground, JSONObject components, int pageCount) {
        try {
            JSONObject build = JSON.build();
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CURRENT_PAGE_NAME, pageName);
            JSON.putInt(build, "index", index);
            JSON.putBoolean(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_FROM_BACKGROUND, isFromBackground);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_COMPONENTS, components);
            JSON.putInt(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_DEEP_COUNT, pageCount);
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, Constants.REFERRER_API_META, build);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_PAGE_SHOW, build2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackClick(String className, float x, float y, int width, int height, String text, String pageName, JSONObject components, int pageCount, long duration) {
        try {
            LAST_CLICK_TS = System.currentTimeMillis();
            JSONObject build = JSON.build();
            JSON.putDouble(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_POSITON_X, x);
            JSON.putDouble(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_POSITON_Y, y);
            JSON.putInt(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_SIZE_W, width);
            JSON.putInt(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_SIZE_H, height);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_BUTTON_TEXT, text);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CURRENT_PAGE_NAME, pageName);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_COMPONENTS, components);
            JSON.putInt(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_DEEP_COUNT, pageCount);
            JSON.putLong(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_DURATION, duration);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME, className);
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, Constants.REFERRER_API_META, build);
            TikTokBusinessSdk.getAppEventLogger().trackEdp("click", build2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackPayShow(int code, JSONArray skuInfo) {
        try {
            JSONObject build = JSON.build();
            JSON.putInt(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, code);
            JSON.putObject(build, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_SKU_INFO, skuInfo);
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, Constants.REFERRER_API_META, build);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_PAY_SHOW, build2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackUnityEvent(String name, JSONObject meta) {
        try {
            JSONObject build = JSON.build();
            JSON.putObject(build, Constants.REFERRER_API_META, meta);
            JSON.putObject(build, "api_platform", meta.remove("api_platform"));
            TikTokBusinessSdk.getAppEventLogger().trackEdp(name, build, null);
        } catch (Throwable unused) {
        }
    }

    public static boolean checkUpload() {
        return sRandom.nextDouble() <= EDPConfig.report_frequency_control;
    }
}
