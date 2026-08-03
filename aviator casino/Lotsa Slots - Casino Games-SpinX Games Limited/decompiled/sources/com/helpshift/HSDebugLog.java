package com.helpshift;

/* loaded from: classes4.dex */
public class HSDebugLog {
    private static final int DBGL_MSG_LIMIT = 10000;
    private static final int DBGL_TAG_LIMIT = 100;
    private static final int DBGL_THROWABLE_LIMIT = 5000;
    private static final java.lang.String TAG = "DebugLog";
    private static final java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor(new com.helpshift.concurrency.HSThreadFactory("debugLogThread"));

    private HSDebugLog() {
    }

    private static void appendLog(final java.lang.Integer num, final java.lang.String str, final java.lang.String str2, final java.lang.Throwable th) {
        if (com.helpshift.util.Utils.isEmpty(str2)) {
            str2 = "";
        }
        if (str2.length() > 10000) {
            str2 = str2.substring(0, 10000);
        }
        if (com.helpshift.util.Utils.isEmpty(str)) {
            str = "";
        }
        if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        try {
            executor.submit(new java.lang.Runnable() { // from class: com.helpshift.HSDebugLog$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.HSDebugLog.lambda$appendLog$0(num, str, str2, th);
                }
            });
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error executing Debug logs update", e);
        }
    }

    static /* synthetic */ void lambda$appendLog$0(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            org.json.JSONObject jsonify = jsonify(num, str, str2, th);
            if (jsonify.length() != 0) {
                com.helpshift.core.HSContext.getInstance().getConfigManager().addDebugLog(jsonify);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to update DebugLog", e);
        }
    }

    private static org.json.JSONObject jsonify(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, num);
            jSONObject.put("t", str);
            jSONObject.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, str2);
            if (th != null) {
                jSONObject.put("e", getStackTraceString(th));
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to create JSONObject debugLog", e);
            return new org.json.JSONObject();
        }
    }

    public static int v(java.lang.String str, java.lang.String str2) {
        return v(str, str2, null);
    }

    public static int v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int v = android.util.Log.v(str, str2, th);
        appendLog(2, str, str2, th);
        return v;
    }

    public static int d(java.lang.String str, java.lang.String str2) {
        return d(str, str2, null);
    }

    public static int d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int d = android.util.Log.d(str, str2, th);
        appendLog(3, str, str2, th);
        return d;
    }

    public static int i(java.lang.String str, java.lang.String str2) {
        return i(str, str2, null);
    }

    public static int i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int i = android.util.Log.i(str, str2, th);
        appendLog(4, str, str2, th);
        return i;
    }

    public static int w(java.lang.String str, java.lang.String str2) {
        return w(str, str2, null);
    }

    public static int w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int e = android.util.Log.e(str, str2, th);
        appendLog(5, str, str2, th);
        return e;
    }

    public static boolean isLoggable(java.lang.String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    public static int w(java.lang.String str, java.lang.Throwable th) {
        return w(str, "", th);
    }

    public static int e(java.lang.String str, java.lang.String str2) {
        return e(str, str2, null);
    }

    public static int e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int e = android.util.Log.e(str, str2, th);
        appendLog(6, str, str2, th);
        return e;
    }

    public static int wtf(java.lang.String str, java.lang.String str2) {
        return wtf(str, str2, null);
    }

    public static int wtf(java.lang.String str, java.lang.Throwable th) {
        return wtf(str, "", th);
    }

    public static int wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int wtf = android.util.Log.wtf(str, str2, th);
        appendLog(-1, str, str2, th);
        return wtf;
    }

    public static java.lang.String getStackTraceString(java.lang.Throwable th) {
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(th);
        if (com.helpshift.util.Utils.isEmpty(stackTraceString)) {
            return "";
        }
        return stackTraceString.length() > 5000 ? stackTraceString.substring(0, 5000) : stackTraceString;
    }
}
