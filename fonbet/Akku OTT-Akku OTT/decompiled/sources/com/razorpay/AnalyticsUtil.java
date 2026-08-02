package com.razorpay;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.razorpay.AnalyticsProperty;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes4.dex */
class AnalyticsUtil {
    private static int $I__I = 0;
    private static String $l$I1I11I1 = null;
    static String BUILD_TYPE = null;
    static String FRAMEWORK = null;
    static String KEY_TYPE = null;
    static int MERCHANT_APP_BUILD = 0;
    static CharSequence MERCHANT_APP_NAME = null;
    static CharSequence MERCHANT_APP_NAMESPACE = null;
    static int MERCHANT_APP_TARGET_SDK = 0;
    static CharSequence MERCHANT_APP_VERSION = null;
    private static String __l1_ = null;
    private static String _llI = null;
    private static boolean l$1_I$l$ = false;
    public static String libraryType;
    private static final Object _l_1l__ = new Object();
    private static final List<PendingEvent> I__1l = new ArrayList();
    private static String _1__ = "standealone";
    static int sessionErroredApiCalls = 0;

    public static class PendingEvent {
        final String eventName;
        final Long metric;
        final JSONObject properties;

        public PendingEvent(String str, JSONObject jSONObject, Long l) {
            this.eventName = str;
            this.properties = jSONObject;
            this.metric = l;
        }
    }

    public static void addFilteredPropertiesFromPayload(JSONObject jSONObject) {
        Lumberjack.addFilteredPropertiesFromPayload(jSONObject);
    }

    public static void addProperty(String str, AnalyticsProperty analyticsProperty) {
        AnalyticsProperty.Scope scope = analyticsProperty.scope;
        if (scope == AnalyticsProperty.Scope.PAYMENT) {
            Lumberjack.addPaymentProperty(str, analyticsProperty.value);
        } else if (scope == AnalyticsProperty.Scope.ORDER) {
            Lumberjack.addOrderProperty(str, analyticsProperty.value);
        }
    }

    public static JSONObject getAnalyticsDataForCheckout(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "mobile_sdk");
            jSONObject.put("platform_version", $l$I1I11I1);
            jSONObject.put("os", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            if (ResourceUtils.isTablet(context)) {
                jSONObject.put("device", "tablet");
                return jSONObject;
            }
            jSONObject.put("device", "mobile");
            return jSONObject;
        } catch (Exception e) {
            reportError(e.getLocalizedMessage(), "critical", e.getMessage());
            return jSONObject;
        }
    }

    public static String getAppDetail() {
        if (!l$1_I$l$) {
            return null;
        }
        return ((Object) MERCHANT_APP_NAME) + "-" + ((Object) MERCHANT_APP_VERSION) + "-" + MERCHANT_APP_BUILD;
    }

    public static String getBuildType() {
        return BUILD_TYPE;
    }

    public static Map<String, Object> getErrorProperties(String str, String str2) {
        HashMap a = com.google.android.gms.ads.identifier.a.a("severity", str);
        a.put("unhandled", Boolean.TRUE);
        a.put("source", "self");
        a.put("stack", "");
        a.put(Constants.MESSAGE, str2);
        return a;
    }

    public static JSONObject getExtraAnalyticsPayload() {
        return Lumberjack.getContextPayload();
    }

    public static String getFramework() {
        return isNullOrEmpty(FRAMEWORK) ? "native" : FRAMEWORK;
    }

    public static JSONObject getJSONErrorResponse(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("severity", map.get("severity"));
            jSONObject3.put("unhandled", map.get("unhandled"));
            jSONObject3.put("source", map.get("source"));
            JSONObject jSONObject4 = new JSONObject();
            if (str != null) {
                jSONObject4.put("stack", str);
            } else {
                jSONObject4.put("stack", "AbstractMethodError");
            }
            jSONObject4.put(Constants.MESSAGE, map.get(Constants.MESSAGE));
            jSONObject4.put("tags", jSONObject3);
            jSONObject2.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject4);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            reportError(e.getLocalizedMessage(), "S0", "Error adding analytics property " + map.get(Constants.MESSAGE) + " to JSONObject");
            return jSONObject;
        }
    }

    public static JSONObject getJSONResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("response", str);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static String getKeyType() {
        return KEY_TYPE;
    }

    public static String getLocalOrderId() {
        if (_llI == null) {
            _llI = getUniqueId();
        }
        return _llI;
    }

    public static String getLocalPaymentId() {
        if (__l1_ == null) {
            __l1_ = getUniqueId();
        }
        return __l1_;
    }

    public static Map<String, Object> getPageLoadEndProperties(String str, long j) {
        HashMap a = com.google.android.gms.ads.identifier.a.a("url", str);
        a.put("page_load_time", Double.valueOf(j / 1.0E9d));
        return a;
    }

    public static Map<String, Object> getPageLoadStartProperties(String str) {
        return com.google.android.gms.ads.identifier.a.a("url", str);
    }

    public static List<String> getPendingEventNames() {
        ArrayList arrayList;
        synchronized (_l_1l__) {
            try {
                arrayList = new ArrayList();
                Iterator<PendingEvent> it = I__1l.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().eventName);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static String getUniqueId() {
        String str = tobase62((System.currentTimeMillis() - 1388534400000L) * 1000000) + tobase62((long) Math.floor(Math.random() * 1.4776336E7d));
        return str.length() > 14 ? str.substring(0, 14) : str;
    }

    public static boolean isCheckoutUrl(String str) {
        return str.indexOf(CoreConfig.getInstance().getCheckoutEndpoint()) == 0;
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (length > i && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        return length - i == 0;
    }

    private static void l$1_I$l$(Context context, String str) {
        if (context == null) {
            throw new RuntimeException("Context not set");
        }
        if (str == null) {
            throw new RuntimeException("Merchant key not set");
        }
        Lumberjack.init(context, _1__, $l$I1I11I1);
        Lumberjack.addOrderProperty("merchant_key", str);
        Lumberjack.addOrderProperty("merchant_package", context.getPackageName());
        l$1_I$l$(context);
        RazorpayExceptionHandler.register(context);
        l$1_I$l$ = true;
        if (l$1_I$l$()) {
            Lumberjack.postData();
        }
        MonitoringUtil.capturePreviousProcessExit(context);
    }

    public static void logCheckoutFunctionEntry(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("class_name", str);
                hashMap.put("function_name", str2);
                trackEvent(AnalyticsEvent.CHECKOUT_FUNCTION_ENTRY, hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public static void logCheckoutFunctionExit(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("class_name", str);
                hashMap.put("function_name", str2);
                trackEvent(AnalyticsEvent.CHECKOUT_FUNCTION_EXIT, hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public static void logCustomUIFunctionEntry(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("class_name", str);
                hashMap.put("function_name", str2);
                trackEvent(AnalyticsEvent.CUSTOMUI_FUNCTION_ENTRY, hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public static void logCustomUIFunctionExit(String str, String str2, boolean z) {
        if (z) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("class_name", str);
                hashMap.put("function_name", str2);
                trackEvent(AnalyticsEvent.CUSTOMUI_FUNCTION_EXIT, hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public static void postData() {
        if (l$1_I$l$) {
            Lumberjack.postData();
        }
    }

    public static void refreshOrderSession() {
        _llI = getUniqueId();
        __l1_ = getUniqueId();
        Lumberjack.clearOrderProperties();
        Lumberjack.clearPaymentProperties();
    }

    public static void refreshPaymentSession() {
        __l1_ = getUniqueId();
        Lumberjack.clearPaymentProperties();
    }

    public static void reportBlockingCaughtException(Context context, Throwable th) {
        MonitoringUtil.trackBlockingCaughtException(context, th, Thread.currentThread(), sanitizeStackTrace(getStackTrace(th)));
    }

    public static void reportCaughtException(Throwable th) {
        String stackTrace = getStackTrace(th);
        Logger.d(stackTrace);
        HashMap hashMap = new HashMap(getErrorProperties("S1", th.getMessage()));
        Lumberjack.trackExceptionEvent(AnalyticsEvent.ERROR_LOGGED.getEventName(), getJSONResponse(hashMap), sanitizeStackTrace(stackTrace));
    }

    public static void reportError(String str, String str2, String str3) {
        Lumberjack.trackErrorEvent(AnalyticsEvent.ERROR_LOGGED.getEventName(), getJSONErrorResponse(str, getErrorProperties(str2, str3)), str2);
        if ((str2.equalsIgnoreCase("S0") || str2.equalsIgnoreCase("S1")) && sessionErroredApiCalls < 1) {
            Lumberjack.logVajraCritialError(str2);
            sessionErroredApiCalls++;
        }
    }

    public static void reportUncaughtException(Throwable th) {
        reportUncaughtException(th, null, null);
    }

    public static void reset() {
        l$1_I$l$ = false;
        __l1_ = null;
        _llI = null;
        synchronized (_l_1l__) {
            try {
                List<PendingEvent> list = I__1l;
                if (!list.isEmpty()) {
                    Logger.d("Analytics pending event clear on reset: count=" + list.size());
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        MonitoringUtil.reset();
        Lumberjack.destroy();
    }

    public static CharSequence returnUndefinedIfNull(CharSequence charSequence) {
        return isNullOrEmpty(charSequence) ? "undefined" : charSequence;
    }

    public static String sanitizeStackTrace(String str) {
        if (isNullOrEmpty(str)) {
            return "";
        }
        try {
            String[] split = str.split("\n");
            StringBuilder sb = new StringBuilder();
            int min = Math.min(split.length, 20);
            int i = 0;
            while (true) {
                if (i >= min) {
                    break;
                }
                String str2 = split[i];
                if (!str2.trim().isEmpty()) {
                    String replaceAll = str2.replaceAll("\\b[a-zA-Z0-9_-]{32,}\\b", "<token>").replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", "<email>").replaceAll("\\b\\d{13,19}\\b", "****").replaceAll("\\b\\d{10,12}\\b", "<phone>");
                    if (replaceAll.length() > 500) {
                        replaceAll = replaceAll.substring(0, 497) + "...";
                    }
                    sb.append(replaceAll);
                    sb.append("\n");
                    if (sb.length() > 5000) {
                        sb.append("... (truncated for size)");
                        break;
                    }
                }
                i++;
            }
            return sb.toString().trim();
        } catch (Exception e) {
            return "Stack trace sanitization failed: ".concat(e.getClass().getSimpleName());
        }
    }

    public static void saveEventsToPreferences(Context context) {
        Lumberjack.saveEventsToPreferences(context);
    }

    public static void setAppDetails(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            MERCHANT_APP_NAME = returnUndefinedIfNull(packageInfo.applicationInfo.loadLabel(packageManager));
            MERCHANT_APP_VERSION = returnUndefinedIfNull(packageInfo.versionName);
            MERCHANT_APP_NAMESPACE = returnUndefinedIfNull(packageInfo.packageName);
            MERCHANT_APP_TARGET_SDK = packageInfo.applicationInfo.targetSdkVersion;
            MERCHANT_APP_BUILD = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            reportError(e.getMessage(), "S0", e.getMessage());
        }
        BUILD_TYPE = BaseUtils.getAppBuildType(context);
        KEY_TYPE = getKeyType(str);
    }

    public static void setFramework(String str) {
        FRAMEWORK = str;
    }

    public static void setLocalOrderId(String str) {
        _llI = str;
    }

    public static void setup(Context context, String str, String str2, int i, String str3) {
        _1__ = str2;
        $I__I = i;
        $l$I1I11I1 = str3;
        MonitoringUtil.setSdkInfo(str2, str3);
        setAppDetails(context, str);
        l$1_I$l$(context, str);
    }

    public static String tobase62(long j) {
        String str = "";
        String[] split = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
        while (j > 0) {
            str = String.valueOf(split[(int) (j % 62)]) + str;
            j = (long) Math.floor(j / 62);
        }
        return str;
    }

    public static void trackEvent(AnalyticsEvent analyticsEvent) {
        Logger.d(analyticsEvent.getEventName());
        if (l$1_I$l$(analyticsEvent.getEventName(), null, null)) {
            return;
        }
        Lumberjack.trackEvent(analyticsEvent.getEventName());
    }

    public static void trackEventWithMetric(AnalyticsEvent analyticsEvent, JSONObject jSONObject, long j) {
        Logger.d(analyticsEvent.getEventName());
        if (l$1_I$l$(analyticsEvent.getEventName(), jSONObject, Long.valueOf(j))) {
            return;
        }
        Lumberjack.trackEventWithMetric(analyticsEvent.getEventName(), jSONObject, j);
    }

    public static void trackPage(String str, String str2) {
        Lumberjack.trackPage(str, str2);
    }

    public static void trackPageLoadEnd(String str, long j) {
        trackEvent(isCheckoutUrl(str) ? AnalyticsEvent.CHECKOUT_PAGE_LOAD_FINISH : AnalyticsEvent.PAGE_LOAD_FINISH, getJSONResponse(getPageLoadEndProperties(str, j)));
    }

    public static void trackPageLoadStart(String str) {
        trackEvent(isCheckoutUrl(str) ? AnalyticsEvent.CHECKOUT_PAGE_LOAD_START : AnalyticsEvent.PAGE_LOAD_START, getJSONResponse(getPageLoadStartProperties(str)));
    }

    public static String getKeyType(String str) {
        if (!isNullOrEmpty(str) && str.length() >= 8) {
            String substring = str.substring(0, 8);
            if (substring.equals("rzp_live")) {
                return "live";
            }
            if (substring.equals("rzp_test")) {
                return "test";
            }
        }
        return null;
    }

    public static void reportUncaughtException(Throwable th, Thread thread, Context context) {
        String stackTrace = getStackTrace(th);
        if (stackTrace.contains("com.razorpay")) {
            Logger.d(stackTrace);
            HashMap hashMap = new HashMap(getErrorProperties("S0", th.getMessage()));
            String sanitizeStackTrace = sanitizeStackTrace(stackTrace);
            MonitoringUtil.trackSdkCrash(context, th, thread, sanitizeStackTrace);
            Lumberjack.trackExceptionEvent(AnalyticsEvent.EXCEPTION_LOGGED.getEventName(), getJSONResponse(hashMap), sanitizeStackTrace);
        }
    }

    public static JSONObject getJSONResponse(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                reportError(e.getLocalizedMessage(), "S0", androidx.concurrent.futures.a.a(new StringBuilder("Error adding analytics property "), entry.getKey(), " to JSONObject"));
            }
        }
        return jSONObject;
    }

    public static void trackEvent(AnalyticsEvent analyticsEvent, Map<String, Object> map) {
        if (l$1_I$l$(analyticsEvent.getEventName(), map == null ? null : getJSONResponse(map), null)) {
            return;
        }
        Lumberjack.trackEvent(analyticsEvent.getEventName(), map);
    }

    public static void trackEvent(AnalyticsEvent analyticsEvent, JSONObject jSONObject) {
        Logger.d(analyticsEvent.getEventName());
        if (l$1_I$l$(analyticsEvent.getEventName(), jSONObject, null)) {
            return;
        }
        Lumberjack.trackEvent(analyticsEvent.getEventName(), jSONObject);
    }

    public static void reportError(AbstractMethodError abstractMethodError, String str, String str2) {
        Lumberjack.trackErrorEvent(AnalyticsEvent.ERROR_LOGGED.getEventName(), getJSONErrorResponse(null, getErrorProperties(str, str2)), str);
        if ((str.equalsIgnoreCase("S0") || str.equalsIgnoreCase("S1")) && sessionErroredApiCalls < 1) {
            Lumberjack.logVajraCritialError(str);
            sessionErroredApiCalls++;
        }
    }

    private static void l$1_I$l$(Context context) {
        try {
            String value = SharedPreferenceUtil.getValue(context, "country_code");
            if (value == null || value.isEmpty()) {
                return;
            }
            Lumberjack.addOrderProperty("country_code", value);
            Logger.d("Loaded cached country code: ".concat(value));
        } catch (Exception e) {
            Logger.e("Failed to load cached country code", e);
        }
    }

    private static boolean l$1_I$l$(String str, JSONObject jSONObject, Long l) {
        if (l$1_I$l$) {
            return false;
        }
        synchronized (_l_1l__) {
            try {
                if (l$1_I$l$) {
                    return false;
                }
                List<PendingEvent> list = I__1l;
                list.add(new PendingEvent(str, l$1_I$l$(jSONObject), l));
                Logger.d("Analytics pending event queued: event=" + str + ", pending_count=" + list.size() + ", properties=" + jSONObject + ", metric=" + l);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean l$1_I$l$() {
        synchronized (_l_1l__) {
            try {
                List<PendingEvent> list = I__1l;
                if (list.isEmpty()) {
                    return false;
                }
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                Logger.d("Analytics pending event flush: count=" + arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PendingEvent pendingEvent = (PendingEvent) it.next();
                    Logger.d("Analytics pending event flush: event=" + pendingEvent.eventName + ", properties=" + pendingEvent.properties + ", metric=" + pendingEvent.metric);
                    if (pendingEvent.metric == null) {
                        Lumberjack.trackEvent(pendingEvent.eventName, l$1_I$l$(pendingEvent.properties));
                    } else {
                        Lumberjack.trackEventWithMetric(pendingEvent.eventName, l$1_I$l$(pendingEvent.properties), pendingEvent.metric.longValue());
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static JSONObject l$1_I$l$(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
