package com.razorpay;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.core.os.EnvironmentCompat;
import androidx.credentials.provider.CredentialEntry;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class MonitoringUtil {
    private static volatile String $I__I = "";
    private static volatile String $l$I1I11I1 = null;
    static final String DEPENDENCY_MERCHANT_CALLBACK_HANDOVER = "merchant_callback_handover";
    static final String DEPENDENCY_NATIVE_INTENT_HANDOFF = "native_intent_handoff";
    static final String DEPENDENCY_TLS = "tls";
    static final String DEPENDENCY_WEBVIEW_CREATION = "webview_creation";
    static final String DEPENDENCY_WEBVIEW_RENDER = "webview_render";
    static final String DEPENDENCY_WEBVIEW_RENDERER_PROCESS = "webview_renderer_process";
    static final String FAILURE_CLASS_CRITICAL_DEPENDENCY_FAILED = "critical_dependency_failed";
    static final String FAILURE_CLASS_SDK_CRASH = "sdk_crash";
    static final String FAILURE_CLASS_SDK_PROCESS_EXIT = "sdk_process_exit";
    static final String FEATURE_CUSTOM_UI = "custom_ui";
    static final String FEATURE_STANDARD_CHECKOUT = "standard_checkout";
    private static volatile String IIII$1$_I = "";
    private static volatile String I__1l = "";
    static final String STAGE_CHECKOUT_OPEN = "checkout_open";
    static final String STAGE_CHECKOUT_RENDER = "checkout_render";
    static final String STAGE_MERCHANT_CALLBACK_HANDOVER = "merchant_callback_handover";
    static final String STAGE_PAYMENT_HANDOVER = "payment_handover";
    static final String STAGE_PAYMENT_RESULT_PROCESS = "payment_result_process";
    static final String STAGE_PAYMENT_RESULT_RECEIVE = "payment_result_receive";
    static final String STAGE_PAYMENT_SUBMIT = "payment_submit";
    private static volatile String _$_l_$1l$ = "";
    private static volatile String _1__ = "";
    private static final String __l1_ = "monitoring_checkout_context";
    private static volatile String _l_1l__ = "standalone";
    private static final String _llI = "monitoring_last_process_exit_key";
    private static final String l$1_I$l$ = "monitoring_checkout_active";
    private static volatile String lI_l1Il_ = "";

    public static class AndroidProcessExitProvider implements ProcessExitProvider {
        private final Context l$1_I$l$;

        public AndroidProcessExitProvider(Context context) {
            this.l$1_I$l$ = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            r1 = r1.getHistoricalProcessExitReasons(r18.l$1_I$l$.getPackageName(), 0, 5);
         */
        @Override // com.razorpay.MonitoringUtil.ProcessExitProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public List<ProcessExitRecord> getHistoricalProcessExitReasons() {
            Context context;
            List historicalProcessExitReasons;
            int reason;
            long timestamp;
            int pid;
            int importance;
            int status;
            long pss;
            long rss;
            String description;
            InputStream traceInputStream;
            if (Build.VERSION.SDK_INT < 30 || (context = this.l$1_I$l$) == null || (r1 = (ActivityManager) context.getSystemService("activity")) == null || historicalProcessExitReasons == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = historicalProcessExitReasons.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo a = androidx.media3.exoplayer.hls.u.a(it.next());
                try {
                    traceInputStream = a.getTraceInputStream();
                    r4 = traceInputStream != null;
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } catch (Exception unused) {
                }
                reason = a.getReason();
                timestamp = a.getTimestamp();
                pid = a.getPid();
                importance = a.getImportance();
                status = a.getStatus();
                pss = a.getPss();
                rss = a.getRss();
                description = a.getDescription();
                arrayList.add(new ProcessExitRecord(reason, timestamp, pid, importance, status, pss, rss, description, r4));
            }
            return arrayList;
        }
    }

    public interface ProcessExitProvider {
        List<ProcessExitRecord> getHistoricalProcessExitReasons();
    }

    public static class ProcessExitRecord {
        final String description;
        final int importance;
        final int pid;
        final long pss;
        final int reason;
        final long rss;
        final int status;
        final long timestamp;
        final boolean traceAvailable;

        public ProcessExitRecord(int i, long j, int i2, int i3, int i4, long j2, long j3, String str, boolean z) {
            this.reason = i;
            this.timestamp = j;
            this.pid = i2;
            this.importance = i3;
            this.status = i4;
            this.pss = j2;
            this.rss = j3;
            this.description = str;
            this.traceAvailable = z;
        }

        public String dedupeKey() {
            return this.timestamp + ":" + this.pid + ":" + this.reason;
        }
    }

    private static String __l1_(int i) {
        return Build.VERSION.SDK_INT < 30 ? "unknown_process_exit" : i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? i != 9 ? "unknown_process_exit" : "excessive_resource_usage" : "initialization_failure" : "anr" : "native_crash" : "java_crash" : "low_memory_kill";
    }

    private static String _llI(int i) {
        return Build.VERSION.SDK_INT < 30 ? "Process exited while checkout was active" : i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? i != 9 ? "Process exited while checkout was active" : "Excessive resource usage while checkout was active" : "App initialization failure while checkout was active" : "ANR while checkout was active" : "Native crash while checkout was active" : "Java crash while checkout was active" : "Low-memory kill while checkout was active";
    }

    public static void capturePreviousProcessExit(Context context) {
        capturePreviousProcessExit(context, new AndroidProcessExitProvider(context));
    }

    public static void clearCheckout(Context context) {
        try {
            SharedPreferenceUtil.removeValue(context, l$1_I$l$);
            SharedPreferenceUtil.removeValue(context, __l1_);
        } catch (Exception unused) {
        }
        _1__ = "";
        $I__I = "";
        lI_l1Il_ = "";
        _$_l_$1l$ = "";
        IIII$1$_I = "";
        $l$I1I11I1 = null;
    }

    public static Map<String, Object> commonProperties(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_type", _l_1l__);
        hashMap.put("sdk_version", I__1l);
        hashMap.put("feature", _1__);
        hashMap.put("checkout_stage", $I__I);
        hashMap.put("payment_attempt_id", getPaymentAttemptId());
        hashMap.put("method", lI_l1Il_);
        hashMap.put("payment_id", _$_l_$1l$);
        hashMap.put("checkout_id", AnalyticsUtil.getLocalOrderId());
        hashMap.put("local_order_id", AnalyticsUtil.getLocalOrderId());
        hashMap.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
        hashMap.put("merchant_key", IIII$1$_I);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("device_manufacturer", Build.MANUFACTURER);
        hashMap.put("device_model", Build.MODEL);
        if (context != null) {
            hashMap.put("merchant_package", context.getPackageName());
        }
        return hashMap;
    }

    public static String getPaymentAttemptId() {
        if ($l$I1I11I1 == null) {
            $l$I1I11I1 = AnalyticsUtil.getUniqueId();
        }
        return $l$I1I11I1;
    }

    private static void l$1_I$l$(Context context, ProcessExitRecord processExitRecord) {
        Map<String, Object> l$1_I$l$2 = l$1_I$l$(context);
        l$1_I$l$2.put("failure_class", FAILURE_CLASS_SDK_PROCESS_EXIT);
        l$1_I$l$2.put("severity", "S0");
        l$1_I$l$2.put("exit_reason", reasonToString(processExitRecord.reason));
        l$1_I$l$2.put("exit_reason_code", Integer.valueOf(processExitRecord.reason));
        l$1_I$l$2.put("exit_timestamp", Long.valueOf(processExitRecord.timestamp));
        l$1_I$l$2.put("exit_description", l$1_I$l$(processExitRecord.description));
        l$1_I$l$2.put("exit_importance", Integer.valueOf(processExitRecord.importance));
        l$1_I$l$2.put("exit_status", Integer.valueOf(processExitRecord.status));
        l$1_I$l$2.put("pss_kb", Long.valueOf(processExitRecord.pss));
        l$1_I$l$2.put("rss_kb", Long.valueOf(processExitRecord.rss));
        l$1_I$l$2.put("trace_available", Boolean.valueOf(processExitRecord.traceAvailable));
        l$1_I$l$2.put("native_issue_type", __l1_(processExitRecord.reason));
        l$1_I$l$2.put("process_exit_summary", _llI(processExitRecord.reason));
        l$1_I$l$2.put("is_blocking", Boolean.TRUE);
        l$1_I$l$2.put("can_recover", Boolean.FALSE);
        l$1_I$l$2.put("reason_code", reasonToString(processExitRecord.reason));
        l$1_I$l$2.put("reason_message", _llI(processExitRecord.reason));
        AnalyticsUtil.trackEvent(AnalyticsEvent.SDK_PROCESS_EXIT_LOGGED, AnalyticsUtil.getJSONResponse(l$1_I$l$2));
    }

    public static void persistActiveCheckout(Context context) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferenceUtil.setValue(context, l$1_I$l$, CredentialEntry.TRUE_STRING);
            SharedPreferenceUtil.setValue(context, __l1_, AnalyticsUtil.getJSONResponse(commonProperties(context)).toString());
        } catch (Exception unused) {
        }
    }

    public static String reasonToString(int i) {
        return Build.VERSION.SDK_INT < 30 ? "REASON_UNKNOWN" : i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? i != 9 ? android.support.v4.media.a.a(i, "REASON_") : "REASON_EXCESSIVE_RESOURCE_USAGE" : "REASON_INITIALIZATION_FAILURE" : "REASON_ANR" : "REASON_CRASH_NATIVE" : "REASON_CRASH" : "REASON_LOW_MEMORY";
    }

    public static void refreshPaymentAttempt() {
        $l$I1I11I1 = AnalyticsUtil.getUniqueId();
    }

    public static void reset() {
        _l_1l__ = "standalone";
        I__1l = "";
        _1__ = "";
        $I__I = "";
        $l$I1I11I1 = null;
        lI_l1Il_ = "";
        _$_l_$1l$ = "";
        IIII$1$_I = "";
    }

    public static void setCheckoutStage(String str) {
        if (str == null) {
            str = "";
        }
        $I__I = str;
    }

    public static void setPaymentId(String str) {
        if (str == null) {
            str = "";
        }
        _$_l_$1l$ = str;
    }

    public static void setPaymentMethod(String str) {
        if (str == null) {
            str = "";
        }
        lI_l1Il_ = str;
    }

    public static void setSdkInfo(String str, String str2) {
        if (str == null) {
            str = "standalone";
        }
        _l_1l__ = str;
        if (str2 == null) {
            str2 = "";
        }
        I__1l = str2;
    }

    public static void startCheckout(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        _1__ = str;
        if (str2 == null) {
            str2 = "";
        }
        IIII$1$_I = str2;
        $l$I1I11I1 = AnalyticsUtil.getUniqueId();
        setCheckoutStage(STAGE_CHECKOUT_OPEN);
        persistActiveCheckout(context);
    }

    public static void trackBlockingCaughtException(Context context, Throwable th, Thread thread, String str) {
        Map<String, Object> commonProperties = commonProperties(context);
        commonProperties.put("failure_class", FAILURE_CLASS_SDK_CRASH);
        commonProperties.put("severity", "S0");
        String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        commonProperties.put("exception_class", th == null ? EnvironmentCompat.MEDIA_UNKNOWN : th.getClass().getName());
        if (thread != null) {
            str2 = thread.getName();
        }
        commonProperties.put("thread_name", str2);
        Boolean bool = Boolean.FALSE;
        commonProperties.put("is_fatal", bool);
        Boolean bool2 = Boolean.TRUE;
        commonProperties.put("is_swallowed", bool2);
        commonProperties.put("is_blocking", bool2);
        commonProperties.put("can_recover", bool);
        commonProperties.put("stacktrace_hash", __l1_(str));
        commonProperties.put("reason_code", "caught_runtime_exception");
        commonProperties.put("reason_message", th == null ? "" : l$1_I$l$(th.getMessage()));
        AnalyticsUtil.trackEvent(AnalyticsEvent.SDK_CRASH_LOGGED, AnalyticsUtil.getJSONResponse(commonProperties));
    }

    public static void trackCriticalDependencyFailure(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        Map<String, Object> commonProperties = commonProperties(context);
        commonProperties.put("failure_class", FAILURE_CLASS_CRITICAL_DEPENDENCY_FAILED);
        commonProperties.put("severity", z ? "S0" : "S1");
        commonProperties.put("dependency_name", l$1_I$l$(str));
        commonProperties.put("dependency_operation", l$1_I$l$(str2));
        commonProperties.put("reason_code", l$1_I$l$(str3));
        commonProperties.put("reason_message", l$1_I$l$(str4));
        commonProperties.put("is_blocking", Boolean.valueOf(z));
        commonProperties.put("can_recover", Boolean.valueOf(z2));
        commonProperties.put("fallback_used", Boolean.valueOf(z2));
        commonProperties.put("fallback_outcome", l$1_I$l$(str5));
        AnalyticsUtil.trackEvent(AnalyticsEvent.CRITICAL_DEPENDENCY_FAILED, AnalyticsUtil.getJSONResponse(commonProperties));
    }

    public static void trackSdkCrash(Context context, Throwable th, Thread thread, String str) {
        Map<String, Object> commonProperties = commonProperties(context);
        commonProperties.put("failure_class", FAILURE_CLASS_SDK_CRASH);
        commonProperties.put("severity", "S0");
        String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        commonProperties.put("exception_class", th == null ? EnvironmentCompat.MEDIA_UNKNOWN : th.getClass().getName());
        if (thread != null) {
            str2 = thread.getName();
        }
        commonProperties.put("thread_name", str2);
        commonProperties.put("is_fatal", Boolean.TRUE);
        commonProperties.put("stacktrace_hash", __l1_(str));
        commonProperties.put("reason_message", th == null ? "" : l$1_I$l$(th.getMessage()));
        AnalyticsUtil.trackEvent(AnalyticsEvent.SDK_CRASH_LOGGED, AnalyticsUtil.getJSONResponse(commonProperties));
    }

    public static boolean wasCheckoutActive(Context context) {
        return CredentialEntry.TRUE_STRING.equals(SharedPreferenceUtil.getValue(context, l$1_I$l$));
    }

    public static void capturePreviousProcessExit(Context context, ProcessExitProvider processExitProvider) {
        List<ProcessExitRecord> historicalProcessExitReasons;
        if (context == null || processExitProvider == null || Build.VERSION.SDK_INT < 30 || !wasCheckoutActive(context) || (historicalProcessExitReasons = processExitProvider.getHistoricalProcessExitReasons()) == null || historicalProcessExitReasons.isEmpty()) {
            return;
        }
        for (ProcessExitRecord processExitRecord : historicalProcessExitReasons) {
            if (processExitRecord != null && l$1_I$l$(processExitRecord.reason)) {
                String dedupeKey = processExitRecord.dedupeKey();
                if (!dedupeKey.equals(SharedPreferenceUtil.getValue(context, _llI))) {
                    SharedPreferenceUtil.setValue(context, _llI, dedupeKey);
                    l$1_I$l$(context, processExitRecord);
                    return;
                }
            }
        }
    }

    private static String __l1_(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(l$1_I$l$(str).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static Map<String, Object> l$1_I$l$(Context context) {
        Map<String, Object> commonProperties = commonProperties(context);
        Object obj = commonProperties.get("sdk_type");
        Object obj2 = commonProperties.get("sdk_version");
        try {
            String value = SharedPreferenceUtil.getValue(context, __l1_);
            if (value != null && value.length() != 0) {
                JSONObject jSONObject = new JSONObject(value);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    commonProperties.put(next, jSONObject.get(next));
                }
                if (obj != null && !"standalone".equals(obj)) {
                    commonProperties.put("sdk_type", obj);
                }
                if (obj2 != null && obj2.toString().length() > 0) {
                    commonProperties.put("sdk_version", obj2);
                }
            }
        } catch (Exception unused) {
        }
        return commonProperties;
    }

    private static boolean l$1_I$l$(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return i == 6 || i == 4 || i == 5 || i == 7;
    }

    private static String l$1_I$l$(String str) {
        return str == null ? "" : str;
    }
}
