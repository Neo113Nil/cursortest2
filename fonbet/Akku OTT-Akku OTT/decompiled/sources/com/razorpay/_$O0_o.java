package com.razorpay;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.razorpay.AnalyticsProperty;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class _$O0_o {
    private static JSONArray O$$$__o0Oo(Context context) {
        JSONArray jSONArray = new JSONArray();
        Iterator<ResolveInfo> it = BaseUtils.getListOfAppsWhichHandleDeepLink(context, "io.rzp://rzp.io").iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = it.next().activityInfo.taskAffinity;
            i++;
            try {
                String deviceToken = getDeviceToken(context.createPackageContext(str, 2));
                if (deviceToken != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("rzp_device_token", deviceToken);
                    jSONObject.put("card_saving_token_source", str);
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e) {
                if (e instanceof SecurityException) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.SHARE_PREFERENCES_SECURITY_EXCEPTION);
                } else {
                    AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
                }
                Logger.e("Error fetching global device token", e);
            }
        }
        AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.ORDER;
        AnalyticsUtil.addProperty("sdk_count", new AnalyticsProperty(i, scope));
        AnalyticsUtil.addProperty("sdk_count_with_token", new AnalyticsProperty(jSONArray.length(), scope));
        return jSONArray;
    }

    public static void clearDeviceToken(Context context) {
        SharedPreferenceUtil.getPublicEditor(context).remove("rzp_device_token").apply();
    }

    public static void fetchDeviceTokenFromOtherAppsIfRequired(Context context) throws IllegalStateException {
        if (_Oo_O_$.getInstance().isCardSavingLocalEnabled() && getDeviceToken(context) != null) {
            AnalyticsUtil.addProperty("device_token_source_single", new AnalyticsProperty(context.getPackageName(), AnalyticsProperty.Scope.ORDER));
        } else if (_Oo_O_$.getInstance().isCardSavingBroadcastReceiverFlowEnabled()) {
            sendBroadcastForFetchingDeviceToken(context);
        } else if (_Oo_O_$.getInstance().isCardSavingSharedPreferencesFlowEnabled()) {
            getCorrectDeviceTokenFromInfoListAndSave(context, O$$$__o0Oo(context));
        }
    }

    public static String getAppToken(Context context) {
        return SharedPreferenceUtil.getPrivatePrefs(context).getString("rzp_app_token", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCorrectDeviceTokenFromInfoListAndSave(Context context, JSONArray jSONArray) {
        JSONObject jSONObject;
        String str;
        String str2 = "";
        if (jSONArray != null && jSONArray.length() != 0) {
            if (jSONArray.length() == 1) {
                jSONObject = jSONArray.getJSONObject(0);
            } else {
                if (jSONArray.length() != 1) {
                    String str3 = "{";
                    String str4 = null;
                    boolean z = false;
                    boolean z2 = true;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            if (z2) {
                                z2 = false;
                            } else {
                                str3 = str3 + ",";
                            }
                            str3 = str3 + "'" + jSONObject2.getString("card_saving_token_source") + "': '" + jSONObject2.getString("rzp_device_token") + "'";
                            if (str4 == null) {
                                str4 = jSONObject2.getString("rzp_device_token");
                            } else if (!str4.equals(jSONObject2.getString("rzp_device_token"))) {
                                z = true;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    String b = androidx.compose.runtime.changelist.d.b(str3, "}");
                    if (z) {
                        AnalyticsUtil.trackEvent(AnalyticsEvent.MULTIPLE_TOKEN_EVENT, AnalyticsUtil.getJSONResponse(com.google.android.gms.ads.identifier.a.a("packages", b)));
                        return null;
                    }
                    jSONObject = jSONArray.getJSONObject(0);
                }
                jSONObject = null;
                if (jSONObject != null) {
                    try {
                        str = jSONObject.getString("rzp_device_token");
                        try {
                            str2 = jSONObject.getString("card_saving_token_source");
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        str = "";
                    }
                    setDeviceToken(context, str);
                    AnalyticsUtil.addProperty("device_token_source_single", new AnalyticsProperty(str2, AnalyticsProperty.Scope.ORDER));
                    return str;
                }
            }
            if (jSONObject != null) {
            }
        }
        return null;
    }

    public static String getDeviceToken(Context context) {
        return SharedPreferenceUtil.getPublicPrefs(context).getString("rzp_device_token", null);
    }

    public static void sendBroadcastForFetchingDeviceToken(Context context) {
        Intent intent = new Intent();
        intent.setAction("rzp.device_token.share");
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        for (int i = 0; i < queryBroadcastReceivers.size(); i++) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(i).activityInfo;
            intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.razorpay", "com.razorpay.CheckoutActivity"));
            intent.putExtra("forward", intent2);
            context.sendOrderedBroadcast(intent, null, new BroadcastReceiver() { // from class: com.razorpay._$O0_o.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent3) {
                    String string;
                    Bundle resultExtras = getResultExtras(false);
                    if (resultExtras == null || (string = resultExtras.getString("device_token_info_list")) == null) {
                        return;
                    }
                    try {
                        _$O0_o.getCorrectDeviceTokenFromInfoListAndSave(context2, new JSONArray(string));
                    } catch (Exception unused) {
                    }
                }
            }, null, -1, null, null);
        }
    }

    public static void setAppToken(Context context, String str) {
        SharedPreferenceUtil.getPrivateEditor(context).putString("rzp_app_token", str).apply();
    }

    public static void setDeviceToken(Context context, String str) {
        SharedPreferenceUtil.getPublicEditor(context).putString("rzp_device_token", str).apply();
    }
}
