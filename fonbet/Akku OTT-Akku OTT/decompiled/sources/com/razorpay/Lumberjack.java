package com.razorpay;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.razorpay.AnalyticsProperty;
import io.flutter.plugins.firebase.auth.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Lumberjack {
    private static int $$_$I1l1_ = 0;
    private static final Set<String> $lIII_$$;
    private static float $l_I$1 = 0.0f;
    private static boolean $lll$_lIl = false;
    private static int I1lII = 0;
    private static String IIII$1$_I = null;
    private static ScheduledFuture<?> I__1l = null;
    private static final Set<String> Il__I1Il;
    private static String _$_l_$1l$ = null;
    private static boolean __II$$ = false;
    private static boolean __Il11I1l = false;
    private static JSONObject ___Il$ = null;
    private static final int __l1_ = 10;
    private static ScheduledExecutorService _l_1l__ = null;
    private static String _l_l_1IlI = null;
    private static final int _llI = 10;
    private static JSONObject l$$$11Il1 = null;
    private static final String l$1_I$l$ = "SavedEventsData";
    private static Map<String, Integer> l$Illl = null;
    private static final String lI$$I1$l = "default";
    private static final Map<String, Set<String>> l_lIl;
    private static String ll_$$111;
    private static final Object _1__ = new Object();
    private static String $I__I = Build.MANUFACTURER;
    private static String $l$I1I11I1 = Build.MODEL;
    private static String lI_l1Il_ = Build.DEVICE;
    private static boolean llIl = false;
    private static String I1I_l1 = "standalone";
    private static ArrayList<JSONObject> ___I1$lI = new ArrayList<>();
    private static Map<String, Object> $$II__1$l_ = new ConcurrentHashMap();
    private static Map<String, Object> II1$II$_1 = new ConcurrentHashMap();

    /* renamed from: com.razorpay.Lumberjack$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$razorpay$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$com$razorpay$NetworkType = iArr;
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$razorpay$NetworkType[NetworkType.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$razorpay$NetworkType[NetworkType.BLUETOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void $$_$I1l1_() {
        int length;
        if (!llIl) {
            $l_I$1();
            return;
        }
        try {
            synchronized (l$$$11Il1) {
                try {
                    JSONArray optJSONArray = l$$$11Il1.optJSONArray("events");
                    length = optJSONArray != null ? optJSONArray.length() : 0;
                } finally {
                }
            }
            if (length > 0) {
                Logger.d("Lumberjack: Time-based flush triggered (" + length + " events)");
                postData();
            }
            synchronized (l$$$11Il1) {
                try {
                    JSONArray optJSONArray2 = l$$$11Il1.optJSONArray("events");
                    if (optJSONArray2 != null) {
                        if (optJSONArray2.length() == 0) {
                        }
                    }
                    $l_I$1();
                } finally {
                }
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", "Error in timed flush");
        }
    }

    private static String $I__I() {
        Object obj = II1$II$_1.get("merchant_key");
        return obj != null ? obj.toString() : "";
    }

    private static JSONObject $l$I1I11I1() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", ll_$$111);
        jSONObject.put("platform", "android");
        jSONObject.put("type", I1I_l1);
        jSONObject.put("framework", AnalyticsUtil.getFramework());
        jSONObject.put("name", I1I_l1 + "_android_" + AnalyticsUtil.getFramework());
        return jSONObject;
    }

    private static void $l_I$1() {
        synchronized (_1__) {
            try {
                ScheduledFuture<?> scheduledFuture = I__1l;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    I__1l = null;
                    Logger.d("Lumberjack: Stopped time-based flush timer");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void $lll$_lIl() {
        ___I1$lI = new ArrayList<>();
    }

    static {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_START;
        String eventName = analyticsEvent.getEventName();
        AnalyticsEvent analyticsEvent2 = AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_SUCCESS;
        String eventName2 = analyticsEvent2.getEventName();
        AnalyticsEvent analyticsEvent3 = AnalyticsEvent.CUSTOM_UI_GET_APPS_SUPPORTING_UPI;
        String eventName3 = analyticsEvent3.getEventName();
        AnalyticsEvent analyticsEvent4 = AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_START;
        String eventName4 = analyticsEvent4.getEventName();
        AnalyticsEvent analyticsEvent5 = AnalyticsEvent.CUSTOM_UI_UPI_APPS_DISCOVERY_SUCCESS;
        String eventName5 = analyticsEvent5.getEventName();
        AnalyticsEvent analyticsEvent6 = AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS;
        String eventName6 = analyticsEvent6.getEventName();
        AnalyticsEvent analyticsEvent7 = AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_SHOWED_ONE_TIME_CONSENT;
        String eventName7 = analyticsEvent7.getEventName();
        AnalyticsEvent analyticsEvent8 = AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_TIMEOUT;
        String eventName8 = analyticsEvent8.getEventName();
        AnalyticsEvent analyticsEvent9 = AnalyticsEvent.PHONE_NUMBER_HINT_INTENT_LAUNCH_FAILED;
        String eventName9 = analyticsEvent9.getEventName();
        AnalyticsEvent analyticsEvent10 = AnalyticsEvent.WEB_VIEW_PRIMARY_TO_SECONDARY_SWITCH;
        String eventName10 = analyticsEvent10.getEventName();
        AnalyticsEvent analyticsEvent11 = AnalyticsEvent.WEB_VIEW_SECONDARY_TO_PRIMARY_SWITCH;
        String eventName11 = analyticsEvent11.getEventName();
        AnalyticsEvent analyticsEvent12 = AnalyticsEvent.CHECKOUT_HARD_BACK_PRESSED;
        Il__I1Il = new HashSet(Arrays.asList(eventName, eventName2, eventName3, eventName4, eventName5, eventName6, eventName7, eventName8, eventName9, eventName10, eventName11, analyticsEvent12.getEventName()));
        l$Illl = new ConcurrentHashMap();
        HashMap hashMap = new HashMap();
        l_lIl = hashMap;
        hashMap.put(analyticsEvent2.getEventName(), new HashSet(Arrays.asList("deviceApps")));
        hashMap.put(analyticsEvent5.getEventName(), new HashSet(Arrays.asList("allUpiDeviceApps")));
        hashMap.put(analyticsEvent.getEventName(), new HashSet());
        hashMap.put(analyticsEvent4.getEventName(), new HashSet());
        hashMap.put(analyticsEvent3.getEventName(), new HashSet());
        hashMap.put(analyticsEvent12.getEventName(), new HashSet());
        hashMap.put(analyticsEvent6.getEventName(), new HashSet());
        hashMap.put(analyticsEvent7.getEventName(), new HashSet());
        hashMap.put(analyticsEvent8.getEventName(), new HashSet());
        hashMap.put(analyticsEvent9.getEventName(), new HashSet());
        hashMap.put(analyticsEvent10.getEventName(), new HashSet());
        hashMap.put(analyticsEvent11.getEventName(), new HashSet());
        HashSet hashSet = new HashSet();
        $lIII_$$ = hashSet;
        hashSet.add(AnalyticsEvent.CUSTOM_UI_INIT_END.getEventName());
        hashSet.add(AnalyticsEvent.FETCH_PREFERENCES_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.FETCH_PREFERENCES_CALL_SUCCESS.getEventName());
        hashSet.add(AnalyticsEvent.FETCH_PREFERENCES_METHODS_CALL_FAIL.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_SUBMIT_START.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_PAYLOAD_PASSED.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_TLS_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_NATIVE_INTENT_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_UPI_APP_LAUNCHED.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_NATIVE_INTENT_ONACTIVITY_RESULT.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_PAYMENT_COMPLETE.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_BACK_PRESSED_HARD.getEventName());
        hashSet.add(AnalyticsEvent.CUSTOM_UI_BACK_PRESSED_SOFT.getEventName());
        hashSet.add(analyticsEvent4.getEventName());
        hashSet.add(analyticsEvent5.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_INIT.getEventName());
        hashSet.add(AnalyticsEvent.ACTIVITY_ONCREATE_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_LOADED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_RENDERED_COMPLETE.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_SUBMIT.getEventName());
        hashSet.add(AnalyticsEvent.NATIVE_INTENT_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.NATIVE_INTENT_SYSTEM_CHOOSER_SELECTED.getEventName());
        hashSet.add(AnalyticsEvent.NATIVE_INTENT_ONACTIVITY_RESULT.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_PAYMENT_COMPLETE.getEventName());
        hashSet.add(AnalyticsEvent.CALLING_ON_SUCCESS.getEventName());
        hashSet.add(AnalyticsEvent.CALLING_ON_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.HANDOVER_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_SOFT_BACK_PRESSED.getEventName());
        hashSet.add(analyticsEvent12.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_JS_DISMISSED.getEventName());
        hashSet.add(AnalyticsEvent.ACTIVITY_ONDESTROY_CALLED.getEventName());
        hashSet.add(AnalyticsEvent.CHECKOUT_TLS_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.WEBVIEW_CREATION_FAILED.getEventName());
        hashSet.add(AnalyticsEvent.WEBVIEW_RENDERER_CRASHED.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_NETWORK_ERROR_RETRY.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_NETWORK_RETRY_EXHAUSTED.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_NETWORK_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.WEB_VIEW_SECONDARY_NETWORK_ERROR.getEventName());
        hashSet.add(AnalyticsEvent.SDK_CRASH_LOGGED.getEventName());
        hashSet.add(AnalyticsEvent.SDK_PROCESS_EXIT_LOGGED.getEventName());
        hashSet.add(AnalyticsEvent.CRITICAL_DEPENDENCY_FAILED.getEventName());
    }

    private static void I1lII() {
        synchronized (_1__) {
            ScheduledExecutorService scheduledExecutorService = _l_1l__;
            if (scheduledExecutorService != null) {
                try {
                    scheduledExecutorService.shutdownNow();
                } catch (Exception e) {
                    Logger.e("Error shutting down flush scheduler", e);
                }
                _l_1l__ = null;
            }
        }
    }

    private static void IIII$1$_I() {
        Iterator<JSONObject> it = ___I1$lI.iterator();
        while (it.hasNext()) {
            l$1_I$l$(it.next());
        }
        $lll$_lIl();
    }

    private static String I__1l() {
        return "custom".equalsIgnoreCase(I1I_l1) ? "customui_android" : "checkout_android";
    }

    private static void _$_l_$1l$() {
        try {
            JSONObject jSONObject = l$$$11Il1;
            if (jSONObject == null) {
                return;
            }
            synchronized (jSONObject) {
                l$$$11Il1.put("events", new JSONArray());
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    private static String _1__() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
    }

    private static void __II$$() {
        _$_l_$1l$();
        $lll$_lIl();
    }

    private static void __Il11I1l() {
        if (llIl) {
            synchronized (_1__) {
                try {
                    ScheduledFuture<?> scheduledFuture = I__1l;
                    if (scheduledFuture == null || scheduledFuture.isCancelled() || I__1l.isDone()) {
                        ScheduledExecutorService scheduledExecutorService = _l_1l__;
                        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                            _l_1l__ = Executors.newSingleThreadScheduledExecutor(new k());
                        }
                        I__1l = _l_1l__.scheduleWithFixedDelay(new l(), 10L, 10L, TimeUnit.SECONDS);
                        Logger.d("Lumberjack: Started time-based flush timer (10s interval)");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static CharSequence __l1_() {
        return AnalyticsUtil.returnUndefinedIfNull(TimeZone.getDefault().getID());
    }

    private static String _l_1l__() {
        return "custom".equalsIgnoreCase(I1I_l1) ? "checkout-custom" : "checkout";
    }

    private static String _llI() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public static void addAmountToProperties(JSONObject jSONObject) {
        try {
            addOrderProperty("amount", Long.valueOf(Long.parseLong(getStringFromJsonObject(jSONObject, "amount"))));
        } catch (Exception unused) {
        }
    }

    public static void addFilteredPropertiesFromPayload(JSONObject jSONObject) {
        try {
            addAmountToProperties(jSONObject);
            addFrameworkToProperties(jSONObject);
            AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.ORDER;
            l$1_I$l$(jSONObject, "contact", scope);
            l$1_I$l$(jSONObject, "email", scope);
            l$1_I$l$(jSONObject, "order_id", scope);
            String stringFromJsonObject = getStringFromJsonObject(jSONObject, "method");
            if (stringFromJsonObject == null) {
                return;
            }
            if (jSONObject.has(Constants.TOKEN)) {
                stringFromJsonObject = "saved card";
            }
            addPaymentProperty("method", stringFromJsonObject);
            if (stringFromJsonObject.equals("card")) {
                String stringFromJsonObject2 = getStringFromJsonObject(jSONObject, "card[number]");
                if (AnalyticsUtil.isNullOrEmpty(stringFromJsonObject2) || stringFromJsonObject2.length() < 6) {
                    return;
                }
                addPaymentProperty("card_number", stringFromJsonObject2.substring(0, 6));
                return;
            }
            if (stringFromJsonObject.equals("saved card")) {
                boolean booleanFromJsonObject = getBooleanFromJsonObject(jSONObject, "razorpay_otp");
                StringBuilder sb = new StringBuilder();
                sb.append(!booleanFromJsonObject);
                sb.append("");
                addOrderProperty("Checkout Login", sb.toString());
                return;
            }
            if (stringFromJsonObject.equals("netbanking")) {
                l$1_I$l$(jSONObject, "bank", AnalyticsProperty.Scope.PAYMENT);
            } else if (stringFromJsonObject.equals("wallet")) {
                l$1_I$l$(jSONObject, "wallet", AnalyticsProperty.Scope.PAYMENT);
            } else if (stringFromJsonObject.equals("upi")) {
                addPaymentProperty("flow", getStringFromJsonObject(jSONObject, "_[flow]"));
            }
        } catch (Exception e) {
            Logger.d("Failed to add props to lumberjack: " + e.getMessage());
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    public static void addFrameworkToProperties(JSONObject jSONObject) {
        try {
            addOrderProperty("framework", jSONObject.has("framework") ? getStringFromJsonObject(jSONObject, "framework") : "native");
        } catch (Exception unused) {
        }
    }

    public static JSONObject addGlobalProperties(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.has("properties") ? jSONObject.getJSONObject("properties") : null;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("merchant_app_name", AnalyticsUtil.MERCHANT_APP_NAME);
            jSONObject2.put("merchant_app_version", AnalyticsUtil.MERCHANT_APP_VERSION);
            jSONObject2.put("merchant_app_package", AnalyticsUtil.MERCHANT_APP_NAMESPACE);
            jSONObject2.put("merchant_app_target_sdk", AnalyticsUtil.MERCHANT_APP_TARGET_SDK);
            jSONObject2.put("merchant_app_build", AnalyticsUtil.MERCHANT_APP_BUILD);
            jSONObject2.put("platform", "mobile_sdk");
            jSONObject2.put("platform_version", ll_$$111);
            jSONObject2.put("os", "android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("library", AnalyticsUtil.libraryType);
            for (Map.Entry<String, Object> entry : $$II__1$l_.entrySet()) {
                try {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    AnalyticsUtil.reportError(e.getMessage(), "S0", "Error adding analytics property " + entry.getKey() + " to JSONObject");
                }
            }
            for (Map.Entry<String, Object> entry2 : II1$II$_1.entrySet()) {
                try {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                } catch (Exception e2) {
                    AnalyticsUtil.reportError(e2.getMessage(), "S0", "Error adding analytics property " + entry2.getKey() + " to JSONObject");
                }
            }
            jSONObject.put("properties", jSONObject2);
            if (CoreConfig.getInstance().isLumberjackV2Enabled().booleanValue()) {
                jSONObject.put("event_type", _l_1l__());
                jSONObject.put("event_version", "v2");
                jSONObject.put("origin", I__1l());
                jSONObject.put("uuid", _l_l_1IlI);
                jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
                jSONObject.put("build_id", ll_$$111);
                jSONObject.put("platform", 2L);
                jSONObject.put("env", 1L);
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                Object obj = II1$II$_1.get("merchant_key");
                if (obj != null) {
                    jSONObject.put("merchant_key", obj.toString());
                }
                jSONObject.put("merchant_id", "");
                Object obj2 = II1$II$_1.get("order_id");
                if (obj2 != null) {
                    jSONObject.put("order_id", obj2.toString());
                }
                Object obj3 = $$II__1$l_.get("method");
                if (obj3 != null) {
                    jSONObject.put("method", obj3.toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void addOrderProperty(String str, Object obj) {
        II1$II$_1.put(str, obj);
    }

    public static void addPaymentProperty(String str, Object obj) {
        $$II__1$l_.put(str, obj);
    }

    public static void clearOrderProperties() {
        II1$II$_1 = new ConcurrentHashMap();
    }

    public static void clearPaymentProperties() {
        $$II__1$l_ = new ConcurrentHashMap();
    }

    public static JSONObject createBaseTrackEvent(String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, currentTimeMillis);
            return jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in creating base for trackEvent");
            return null;
        }
    }

    public static void destroy() {
        $l_I$1();
        I1lII();
        clearOrderProperties();
        clearPaymentProperties();
        __II$$();
        l$Illl.clear();
        llIl = false;
    }

    public static JSONObject filterEvent(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("properties")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
            if (jSONObject2.has("url")) {
                jSONObject2.put("url", filterUrl(jSONObject2.getString("url")));
            }
            jSONObject.put("properties", jSONObject2);
        }
        return jSONObject;
    }

    public static JSONObject filterPayload(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            String lumberjackAllowedEventsRegex = CoreConfig.getInstance().getLumberjackAllowedEventsRegex();
            Logger.d("Lumberjack event verification: allowed_events_regex=" + lumberjackAllowedEventsRegex);
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            if (lumberjackAllowedEventsRegex != null && !lumberjackAllowedEventsRegex.trim().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (String str : lumberjackAllowedEventsRegex.split(",")) {
                    String trim = str.trim();
                    if (lI$$I1$l.equals(trim)) {
                        arrayList.addAll($lIII_$$);
                    } else if (!trim.isEmpty()) {
                        arrayList.add(trim);
                    }
                }
                while (i < jSONArray.length()) {
                    JSONObject filterEvent = filterEvent(jSONArray.getJSONObject(i));
                    if (l$1_I$l$(filterEvent.optString(NotificationCompat.CATEGORY_EVENT, ""), arrayList)) {
                        jSONArray2.put(filterEvent);
                    } else {
                        Logger.d("Lumberjack event verification: dropped event=" + filterEvent.optString(NotificationCompat.CATEGORY_EVENT, "") + ", allowed_events_regex=" + lumberjackAllowedEventsRegex + ", properties=" + filterEvent.optJSONObject("properties"));
                    }
                    i++;
                }
                jSONObject.put("events", jSONArray2);
                return jSONObject;
            }
            while (i < jSONArray.length()) {
                jSONArray2.put(filterEvent(jSONArray.getJSONObject(i)));
                i++;
            }
            jSONObject.put("events", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            Logger.e("Error in filtering payload", e);
            return jSONObject;
        }
    }

    public static String filterUrl(String str) {
        return str.startsWith("data:") ? "Data present in url" : str;
    }

    public static boolean getBooleanFromJsonObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getBoolean(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return false;
        }
    }

    public static JSONObject getContextPayload() {
        return ___Il$;
    }

    public static JSONObject getLumberjackPayload() {
        return l$$$11Il1;
    }

    public static Map<String, Object> getOrderProperties() {
        return II1$II$_1;
    }

    public static Map<String, Object> getPaymentProperties() {
        return $$II__1$l_;
    }

    public static ArrayList<JSONObject> getPreInitBatch() {
        return ___I1$lI;
    }

    public static JSONObject getSessionCreatedJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.KEY, CoreConfig.getInstance().getLumberjackKey());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "checkout.mobile.sessionCreated.metrics");
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "session_created");
            jSONObject3.put("platform", "android");
            jSONObject3.put("framework", I1I_l1 + "_android_" + AnalyticsUtil.getFramework());
            jSONArray2.put(jSONObject3);
            jSONObject2.put("labels", jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("metrics", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return jSONObject;
        }
    }

    public static JSONObject getSessionErroredJson(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.KEY, CoreConfig.getInstance().getLumberjackKey());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "checkout.mobile.sessionErrored.metrics");
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "session_errored");
            jSONObject3.put("platform", "android");
            jSONObject3.put("framework", I1I_l1 + "_android_" + AnalyticsUtil.getFramework());
            jSONObject3.put("severity", str);
            jSONArray2.put(jSONObject3);
            jSONObject2.put("labels", jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("metrics", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return jSONObject;
        }
    }

    public static String getStringFromJsonObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return null;
        }
    }

    public static Object getValueFromJsonObject(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return null;
        }
    }

    public static void init(Context context, String str, String str2) {
        $l_I$1();
        I1I_l1 = str;
        ll_$$111 = str2;
        _l_l_1IlI = BaseConfig.getAdvertisingId(context);
        l$Illl.clear();
        setBaseImportJSON(context);
        llIl = true;
        IIII$1$_I();
        transmitSavedEvents(context);
    }

    private static boolean l$1_I$l$(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    private static JSONObject lI_l1Il_() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("density", $l_I$1);
        jSONObject.put("width", I1lII);
        jSONObject.put("height", $$_$I1l1_);
        return jSONObject;
    }

    public static void logVajraCritialError(String str) {
        _llI(getSessionErroredJson(str));
    }

    public static void postData() {
        synchronized (l$$$11Il1) {
            JSONObject filterPayload = filterPayload(l$$$11Il1);
            l$$$11Il1 = filterPayload;
            Logger.d(filterPayload.toString());
            __l1_(l$$$11Il1);
        }
        _$_l_$1l$();
    }

    public static void saveEventsToPreferences(Context context) {
        synchronized (l$$$11Il1) {
            SharedPreferenceUtil.setProtectedValue(context, l$1_I$l$, filterPayload(l$$$11Il1).toString(), ll_$$111);
        }
    }

    public static void setBaseImportJSON(Context context) {
        try {
            l$1_I$l$(context);
            __l1_(context);
            GpuInfoUtil.loadFromCache(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.KEY, CoreConfig.getInstance().getLumberjackKey());
            jSONObject.put("events", new JSONArray());
            JSONObject I__1l2 = I__1l(context);
            ___Il$ = I__1l2;
            jSONObject.put("context", I__1l2);
            jSONObject.put("mode", "live");
            l$$$11Il1 = jSONObject;
            Logger.d(jSONObject.toString());
            _llI(getSessionCreatedJson());
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in creating BaseImportJSON");
            l$$$11Il1 = new JSONObject();
        }
    }

    public static void trackErrorEvent(String str, JSONObject jSONObject, String str2) {
        l$1_I$l$(str, jSONObject, str2);
    }

    public static void trackEvent(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                AnalyticsUtil.reportError(e.getMessage(), "S0", androidx.concurrent.futures.a.a(new StringBuilder("Error adding analytics property "), entry.getKey(), " to JSONObject"));
            }
        }
        trackEvent(str, jSONObject);
    }

    public static void trackEventWithMetric(String str, JSONObject jSONObject, long j) {
        try {
            JSONObject createBaseTrackEvent = createBaseTrackEvent(str);
            if (createBaseTrackEvent == null) {
                createBaseTrackEvent = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            createBaseTrackEvent.put("properties", jSONObject);
            createBaseTrackEvent.put("metric", j);
            l$1_I$l$(createBaseTrackEvent);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in tracking event with metric");
        }
    }

    public static void trackExceptionEvent(String str, JSONObject jSONObject, String str2) {
        l$1_I$l$(str, jSONObject, str2);
    }

    public static void trackPage(String str, String str2) {
        trackEvent(android.support.v4.media.b.b("Viewed ", str, " Page"), com.google.android.gms.ads.identifier.a.a("url", str2));
    }

    public static void transmitSavedEvents(Context context) {
        String protectedValue = SharedPreferenceUtil.getProtectedValue(context, l$1_I$l$, null);
        if (protectedValue == null || protectedValue.isEmpty()) {
            return;
        }
        try {
            __l1_(new JSONObject(protectedValue));
            SharedPreferenceUtil.removeValue(context, l$1_I$l$);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
        }
    }

    public static void updateGpuInfo() {
        JSONObject optJSONObject;
        try {
            if (___Il$ == null || !GpuInfoUtil.isGpuInfoAvailable() || (optJSONObject = ___Il$.optJSONObject("device")) == null) {
                return;
            }
            optJSONObject.put("gpu_renderer", GpuInfoUtil.getGpuRenderer());
            optJSONObject.put("gpu_vendor", GpuInfoUtil.getGpuVendor());
            Logger.d("GPU info updated: " + GpuInfoUtil.getGpuRenderer());
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", "Error updating GPU info in context");
        }
    }

    private static void __l1_(Context context) {
        Display defaultDisplay = ((WindowManager) BaseUtils.getSystemService(context, "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        $l_I$1 = displayMetrics.density;
        $$_$I1l1_ = displayMetrics.heightPixels;
        I1lII = displayMetrics.widthPixels;
    }

    private static JSONObject _llI(Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", BaseConfig.getAdvertisingId(context));
        jSONObject.put("manufacturer", $I__I);
        jSONObject.put("model", $l$I1I11I1);
        jSONObject.put("name", lI_l1Il_);
        jSONObject.put("type", "phone");
        jSONObject.put("version", "Android" + Build.VERSION.RELEASE);
        jSONObject.put($I__I, Build.MANUFACTURER);
        jSONObject.put($l$I1I11I1, Build.MODEL);
        jSONObject.put("device_size", BaseUtils.getDisplayWidth(context) + "w X " + BaseUtils.getDisplayHeight(context) + "h");
        jSONObject.put("device_resolution", BaseUtils.getDisplayResolution(context));
        long totalRamMB = BaseUtils.getTotalRamMB(context);
        jSONObject.put("total_ram_mb", totalRamMB);
        jSONObject.put("free_ram_mb", BaseUtils.getFreeRamMB(context));
        jSONObject.put("cpu_cores", BaseUtils.getCpuCores());
        jSONObject.put("performance_class", PerformanceUtil.getPerformanceClass(context));
        jSONObject.put("is_low_end_device", PerformanceUtil.isLowEndDevice(context));
        jSONObject.put("power_save_mode", BaseUtils.isPowerSaveMode(context));
        jSONObject.put("battery_level", BaseUtils.getBatteryLevel(context));
        jSONObject.put("is_charging", BaseUtils.isCharging(context));
        jSONObject.put("is_low_ram_device", totalRamMB <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        jSONObject.put("gpu_renderer", GpuInfoUtil.getGpuRenderer());
        jSONObject.put("gpu_vendor", GpuInfoUtil.getGpuVendor());
        return jSONObject;
    }

    private static CharSequence l$1_I$l$() {
        return AnalyticsUtil.returnUndefinedIfNull(System.getProperty("http.agent"));
    }

    private static void l$1_I$l$(Context context) {
        _$_l_$1l$ = BaseUtils.getCellularNetworkType(context);
        IIII$1$_I = BaseUtils.getCellularNetworkProviderName(context);
        int i = AnonymousClass3.$SwitchMap$com$razorpay$NetworkType[BaseUtils.getDataNetworkType(context).ordinal()];
        if (i == 1) {
            __Il11I1l = true;
        } else if (i == 2) {
            $lll$_lIl = true;
        } else {
            if (i != 3) {
                return;
            }
            __II$$ = true;
        }
    }

    private static JSONObject I__1l(Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", AnalyticsUtil.getKeyType());
        jSONObject.put("device", _llI(context));
        jSONObject.put("sdk", $l$I1I11I1());
        jSONObject.put("network", _l_1l__(context));
        jSONObject.put("screen", lI_l1Il_());
        jSONObject.put("locale", BaseUtils.getLocale());
        jSONObject.put("timezone", __l1_());
        jSONObject.put("framework", I1I_l1 + "_android_" + AnalyticsUtil.getFramework());
        jSONObject.put("user_agent", l$1_I$l$());
        jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
        jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
        jSONObject.put("webview_user_agent", BaseUtils.getWebViewUserAgent(context));
        return jSONObject;
    }

    private static JSONObject _l_1l__(Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bluetooth", __II$$);
        jSONObject.put("carrier", IIII$1$_I);
        jSONObject.put("cellular", $lll$_lIl);
        jSONObject.put("cellular_network_type", _$_l_$1l$);
        jSONObject.put("wifi", __Il11I1l);
        jSONObject.put("carrier_network", BaseUtils.getCarrierOperatorName(context));
        jSONObject.put("network_type", BaseUtils.getNetworkType(context));
        jSONObject.put("ip_address", BaseUtils.ipAddress);
        jSONObject.put("is_roming", BaseUtils.isNetworkRoaming(context));
        Map<String, String> deviceAttributes = BaseUtils.getDeviceAttributes(context);
        jSONObject.put("device_Id", deviceAttributes.get("device_Id"));
        String str = $I__I;
        jSONObject.put(str, deviceAttributes.get(str));
        String str2 = $l$I1I11I1;
        jSONObject.put(str2, deviceAttributes.get(str2));
        return jSONObject;
    }

    private static void __l1_(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            if (!CoreConfig.getInstance().isLumberjackEnabled().booleanValue() || CoreConfig.getInstance().isVersionBlocked(ll_$$111) || jSONArray.length() == 0) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("x-identifier", CoreConfig.getInstance().getLumberjackSdkIdentifier());
            hashMap.put(RtspHeaders.CONTENT_TYPE, "application/json");
            Logger.d("Sending data to lumberjack");
            l$1_I$l$(jSONObject, jSONArray);
            String jSONObject2 = jSONObject.toString();
            String $I__I2 = $I__I();
            String trackUrl = GlobalUrlConfig.instance().getTrackUrl();
            if (!$I__I2.isEmpty()) {
                trackUrl = trackUrl + "?key_id=" + $I__I2;
            }
            Owl.post(trackUrl, jSONObject2, hashMap, new Callback() { // from class: com.razorpay.Lumberjack.1
                @Override // com.razorpay.Callback
                public void run(ResponseObject responseObject) {
                    Logger.d("Response from lumberjack: " + responseObject.getResponseResult());
                }
            });
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "makePostRequest: failed to read events array");
        }
    }

    private static void l$1_I$l$(JSONObject jSONObject) {
        int length;
        int intValue;
        if (!llIl) {
            ___I1$lI.add(jSONObject);
            return;
        }
        try {
            JSONObject addGlobalProperties = addGlobalProperties(jSONObject);
            String optString = addGlobalProperties.optString(NotificationCompat.CATEGORY_EVENT, "");
            if (Il__I1Il.contains(optString) && (intValue = l$Illl.merge(optString, 1, new j()).intValue()) > 1) {
                if (l$1_I$l$(optString, addGlobalProperties, intValue)) {
                    return;
                } else {
                    addGlobalProperties.put("attempt", intValue);
                }
            }
            synchronized (l$$$11Il1) {
                JSONArray jSONArray = l$$$11Il1.getJSONArray("events");
                jSONArray.put(addGlobalProperties);
                length = jSONArray.length();
            }
            if (length == 1) {
                __Il11I1l();
            }
            if (length >= 10) {
                Logger.d("Lumberjack: Auto-flushing batch (" + length + " events exceeded threshold of 10)");
                postData();
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    public static void trackEvent(String str, JSONObject jSONObject) {
        try {
            JSONObject createBaseTrackEvent = createBaseTrackEvent(str);
            if (createBaseTrackEvent == null) {
                createBaseTrackEvent = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            createBaseTrackEvent.put("properties", jSONObject);
            l$1_I$l$(createBaseTrackEvent);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in adding properties to base json for event tracking");
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, new JSONObject());
    }

    private static void _llI(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("accept", "application/json");
        hashMap.put("content-type", "applications/json");
        Owl.post("https://lumberjack-metrics.razorpay.com/v1/frontend-metrics", jSONObject.toString(), hashMap, new Callback() { // from class: com.razorpay.Lumberjack.2
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject) {
                Logger.d("Response from vjDash: " + responseObject.getResponseResult());
            }
        });
    }

    private static boolean l$1_I$l$(String str, JSONObject jSONObject, int i) {
        synchronized (l$$$11Il1) {
            try {
                JSONArray jSONArray = l$$$11Il1.getJSONArray("events");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (str.equals(jSONObject2.optString(NotificationCompat.CATEGORY_EVENT))) {
                        Set<String> set = l_lIl.get(str);
                        JSONObject optJSONObject = jSONObject2.optJSONObject("properties");
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("properties");
                        if (optJSONObject != null && optJSONObject2 != null && set != null) {
                            String str2 = "attempt" + i + "_";
                            for (String str3 : set) {
                                if (optJSONObject2.has(str3)) {
                                    optJSONObject.put(str2 + str3, optJSONObject2.get(str3));
                                }
                            }
                        }
                        return true;
                    }
                }
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S0", "Error merging dedup event properties");
            }
            return false;
        }
    }

    private static void l$1_I$l$(String str, JSONObject jSONObject, String str2) {
        try {
            JSONObject createBaseTrackEvent = createBaseTrackEvent(str);
            if (createBaseTrackEvent == null) {
                createBaseTrackEvent = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("checkout_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            createBaseTrackEvent.put("properties", jSONObject);
            if (str2 != null && !str2.isEmpty()) {
                createBaseTrackEvent.put("value", str2);
            }
            l$1_I$l$(createBaseTrackEvent);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in tracking event with value/content");
        }
    }

    private static void l$1_I$l$(JSONObject jSONObject, JSONArray jSONArray) {
        JSONObject optJSONObject = jSONObject.optJSONObject("context");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
            if (optJSONObject2 == null) {
                Logger.d("Lumberjack event verification: index=" + i + ", event=<non-json>, properties={}, context=" + optJSONObject);
            } else {
                StringBuilder c = androidx.collection.g.c(i, "Lumberjack event verification: index=", ", event=");
                c.append(optJSONObject2.optString(NotificationCompat.CATEGORY_EVENT));
                c.append(", properties=");
                c.append(optJSONObject2.optJSONObject("properties"));
                c.append(", context=");
                c.append(optJSONObject);
                Logger.d(c.toString());
            }
        }
    }

    private static void l$1_I$l$(JSONObject jSONObject, String str, AnalyticsProperty.Scope scope) {
        try {
            Object valueFromJsonObject = getValueFromJsonObject(jSONObject, str);
            if (valueFromJsonObject != null) {
                if (scope == AnalyticsProperty.Scope.PAYMENT) {
                    addPaymentProperty(str, valueFromJsonObject);
                } else if (scope == AnalyticsProperty.Scope.ORDER) {
                    addOrderProperty(str, valueFromJsonObject);
                }
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread l$1_I$l$(Runnable runnable) {
        Thread thread = new Thread(runnable, "Lumberjack-FlushTimer");
        thread.setDaemon(true);
        return thread;
    }

    private static boolean l$1_I$l$(String str, List<String> list) {
        for (String str2 : list) {
            if (!str2.contains(")+") && !str2.contains(")*") && !str2.contains(")?") && !str2.contains("}+") && !str2.contains("}*")) {
                if (str.matches(str2)) {
                    return true;
                }
            }
            Logger.w("Lumberjack: skipping potentially unsafe regex pattern");
        }
        return false;
    }
}
