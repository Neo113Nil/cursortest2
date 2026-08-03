package com.fyber.inneractive.sdk.serverapi;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.serverapi.d {
    public static final java.util.List c = java.util.Arrays.asList(5);
    public static final java.util.List d = java.util.Arrays.asList(java.lang.Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0.a()), java.lang.Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0_WRAPPER.a()));

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f4264a;
    public final java.lang.String b;

    public c(com.fyber.inneractive.sdk.config.global.r rVar) {
        java.lang.String str;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            str = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2 && com.fyber.inneractive.sdk.util.k.n()) {
                str = telephonyManager.getSimOperator();
            }
        } catch (java.lang.Exception unused) {
            str = null;
        }
        this.b = str;
        this.f4264a = rVar;
    }

    public final java.lang.String a() {
        try {
            return ((android.telephony.TelephonyManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void a(java.lang.String str, java.util.HashMap hashMap) {
        java.lang.String str2;
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f4263a;
        try {
            java.lang.Class.forName(com.unity3d.services.core.properties.MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (java.lang.Throwable unused) {
            str2 = "native";
        }
        hashMap.put("frmn", str2);
        hashMap.put("headset", a(com.fyber.inneractive.sdk.serverapi.b.m()));
        hashMap.put("is_muted", a(com.fyber.inneractive.sdk.serverapi.b.k()));
        hashMap.put("btry_c", a(com.fyber.inneractive.sdk.serverapi.b.i()));
        hashMap.put("btry_l", com.fyber.inneractive.sdk.serverapi.b.b());
        hashMap.put("bt_con", a(com.fyber.inneractive.sdk.serverapi.b.g()));
        java.lang.Long e = com.fyber.inneractive.sdk.serverapi.b.e();
        hashMap.put("tod", e == null ? "" : java.lang.String.valueOf(e));
        hashMap.put("apnm", a(com.fyber.inneractive.sdk.serverapi.b.f()));
        hashMap.put("dnd", a(com.fyber.inneractive.sdk.serverapi.b.l()));
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        hashMap.put("lng", iAConfigManager.o);
        java.lang.String a2 = iAConfigManager.w.a(com.fyber.inneractive.sdk.serverapi.b.a(str), "LAST_DOMAIN_SHOWED");
        if (!android.text.TextUtils.isEmpty(a2) && a2.contains(",")) {
            a2 = a2.split(",")[0];
        }
        hashMap.put("ldomain", a2);
        hashMap.put("lbundle", iAConfigManager.w.a(com.fyber.inneractive.sdk.serverapi.b.a(str), "LAST_APP_BUNDLE_ID"));
        java.lang.String a3 = iAConfigManager.w.a(com.fyber.inneractive.sdk.serverapi.b.a(str), "LAST_CLICKED");
        if (android.text.TextUtils.equals(a3, "0")) {
            a3 = "";
        }
        hashMap.put("lclick", a3);
        java.lang.String a4 = iAConfigManager.w.a(com.fyber.inneractive.sdk.serverapi.b.a(str), "LAST_VAST_SKIPED");
        if (android.text.TextUtils.equals(a4, "0")) {
            a4 = "";
        }
        hashMap.put("v_lskip", a4);
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType a5 = com.fyber.inneractive.sdk.serverapi.b.a(str);
        hashMap.put("v_lclicktype", a5.isFullscreenUnit() ? iAConfigManager.w.a(a5, "LAST_VAST_CLICKED_TYPE") : "");
        hashMap.put("sdur", java.lang.String.valueOf(com.fyber.inneractive.sdk.serverapi.b.c()));
        hashMap.put("userid", iAConfigManager.C.g);
        hashMap.put("low_power_mode", a(com.fyber.inneractive.sdk.serverapi.b.n()));
        hashMap.put("dark_mode", a(com.fyber.inneractive.sdk.serverapi.b.h()));
        hashMap.put("d_api", com.fyber.inneractive.sdk.serverapi.b.d());
        hashMap.put("media_muted", a(com.fyber.inneractive.sdk.serverapi.b.j()));
        java.lang.Integer a6 = com.fyber.inneractive.sdk.serverapi.b.a();
        hashMap.put("asv", a6 != null ? java.lang.String.valueOf(a6) : "");
    }

    public static java.lang.String a(java.lang.Boolean bool) {
        return bool != null ? bool.booleanValue() ? "1" : "0" : "";
    }
}
