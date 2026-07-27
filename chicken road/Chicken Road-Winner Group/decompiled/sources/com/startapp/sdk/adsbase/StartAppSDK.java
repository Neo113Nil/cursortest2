package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.d2;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.mg;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class StartAppSDK {

    public static class InitParams {
        private String accountId;
        private final String appId;
        private Runnable callback;
        private final Context context;
        private SDKAdPreferences sdkAdPrefs;

        public void init() {
            fh.f3695a.a(this.context, this.accountId, this.appId, this.sdkAdPrefs, this.callback);
        }

        public InitParams setAccountId(String str) {
            this.accountId = str;
            return this;
        }

        public InitParams setCallback(Runnable runnable) {
            this.callback = runnable;
            return this;
        }

        @Deprecated
        public InitParams setReturnAdsEnabled(boolean z3) {
            return this;
        }

        public InitParams setSdkAdPrefs(SDKAdPreferences sDKAdPreferences) {
            this.sdkAdPrefs = sDKAdPreferences;
            return this;
        }

        private InitParams(Context context, String str) {
            this.context = context;
            this.appId = str;
        }
    }

    public static void addWrapper(Context context, String str, String str2) {
        gh ghVar = fh.f3695a;
        ghVar.getClass();
        if (context == null || str == null || str2 == null) {
            return;
        }
        if (ghVar.f3789o == null) {
            ghVar.f3789o = new TreeMap();
        }
        ghVar.f3789o.put(str, str2);
        sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f3341G.a();
        TreeMap treeMap = ghVar.f3789o;
        WeakHashMap weakHashMap = si.f4343a;
        String jSONObject = new JSONObject(treeMap).toString();
        rf edit = sfVar.edit();
        edit.a("sharedPrefsWrappers", jSONObject);
        edit.f4299a.putString("sharedPrefsWrappers", jSONObject);
        edit.apply();
    }

    public static void enableConsent(Context context, boolean z3) {
        ((g6) com.startapp.sdk.components.a.a(context).f3362j.a()).f = z3;
    }

    public static void enableMediationMode(Context context, String str, String str2) {
        enableConsent(context, false);
        StartAppAd.disableAutoInterstitial();
        addWrapper(context, str, str2);
        fh.f3695a.f3791q = true;
    }

    @Deprecated
    public static void enableReturnAds(boolean z3) {
    }

    private static void ensureValidAppId(String str) {
        if (str == null) {
            throw new NullPointerException(paramIs("appId", null, null));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(paramIs("appId", "empty", null));
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                throw new IllegalArgumentException(paramIs("appId", "invalid", str));
            }
        }
    }

    private static void ensureValidContext(Context context) {
        if (context == null) {
            throw new NullPointerException(paramIs("context", null, null));
        }
        if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
            throw new IllegalArgumentException(paramIs("context", "invalid", "getBaseContext() == null"));
        }
        if (context.getApplicationContext() == null) {
            throw new IllegalArgumentException(paramIs("context", "invalid", "getApplicationContext() == null"));
        }
    }

    public static String getBidToken() {
        return d2.a(fh.f3695a.f3794t);
    }

    public static SharedPreferences getExtras(Context context) {
        return (SharedPreferences) com.startapp.sdk.components.a.a(context).f3343I.a();
    }

    public static String getVersion() {
        return "5.3.0";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static InitParams initParams(Context context, String str) {
        ensureValidContext(context);
        ensureValidAppId(str);
        return new InitParams(context, str);
    }

    private static String paramIs(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" is ");
        sb.append(str2);
        sb.append(str3 == null ? "" : ": ".concat(str3));
        return sb.toString();
    }

    public static void setTestAdsEnabled(boolean z3) {
        fh.f3695a.f3794t = z3;
    }

    public static void setUserConsent(Context context, String str, long j3, boolean z3) {
        fh.f3695a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f3341G.a();
            String string = sfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
            String str2 = CommonUrlParts.Values.FALSE_INTEGER;
            if (string != null) {
                if (string.equals(z3 ? "1" : CommonUrlParts.Values.FALSE_INTEGER)) {
                    return;
                }
            }
            String concat = (z3 ? "1" : CommonUrlParts.Values.FALSE_INTEGER).concat("M");
            d9 d9Var = new d9(e9.f3617d);
            d9Var.f3574d = B0.c.j("User consent: ", str);
            d9Var.f3575e = concat;
            d9Var.a();
            rf edit = sfVar.edit();
            if (z3) {
                str2 = "1";
            }
            edit.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            edit.f4299a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            edit.apply();
            mg.f4061d.a(context, MetaDataRequest$RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        mg.f4061d.a(context, MetaDataRequest$RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d3) {
        sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f3341G.a();
        float f = sfVar.getFloat("inAppPurchaseAmount", 0.0f);
        rf edit = sfVar.edit();
        float f3 = (float) (f + d3);
        edit.a("inAppPurchaseAmount", Float.valueOf(f3));
        edit.f4299a.putFloat("inAppPurchaseAmount", f3);
        edit.a("payingUser", Boolean.TRUE);
        edit.f4299a.putBoolean("payingUser", true);
        edit.apply();
        mg.f4061d.a(context, MetaDataRequest$RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    @Deprecated
    public static void init(Context context, String str, boolean z3) {
        init(context, (String) null, str, z3);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z3) {
        fh.f3695a.a(context, str, str2, sDKAdPreferences, null);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, boolean z3) {
        init(context, str, str2, new SDKAdPreferences(), z3);
    }

    @Deprecated
    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z3) {
        init(context, null, str, sDKAdPreferences, z3);
    }
}
