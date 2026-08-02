package com.razorpay;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class AutoOtpUtils {
    public static JSONObject createStatsPayload(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otp_read", z ? 1 : 0);
            return jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
            return null;
        }
    }

    public static int getSmsPermissionAskedCount(Context context) {
        return SharedPreferenceUtil.getPrivatePrefs(context).getInt("rzp_permission_asked_count", 0);
    }

    public static void incrementSmsPermissionAskedCount(Context context) {
        SharedPreferenceUtil.getPrivateEditor(context).putInt("rzp_permission_asked_count", SharedPreferenceUtil.getPrivatePrefs(context).getInt("rzp_permission_asked_count", 0) + 1).apply();
    }
}
