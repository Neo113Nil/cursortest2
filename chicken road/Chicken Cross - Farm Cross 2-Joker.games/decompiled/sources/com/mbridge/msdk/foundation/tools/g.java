package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* compiled from: BaseSameDiTool.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f9423a = null;
    public static String b = null;
    public static boolean c = false;
    public static int d = 0;
    private static String e = "";
    private static boolean f = false;
    private static String g = "";
    private static boolean h = false;
    private static boolean i = false;

    /* compiled from: BaseSameDiTool.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9424a;

        a(Context context) {
            this.f9424a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f9424a);
                    g.a(advertisingIdInfo.getId());
                    g.d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f9424a, advertisingIdInfo.getId(), g.d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b a2 = new c().a(this.f9424a);
                        g.a(a2.a());
                        g.d = a2.b() ? 1 : 0;
                        g.b(this.f9424a, a2.a(), g.d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th) {
                    q0.b("DomainSameDiTool", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i2) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i2));
        } catch (Exception e2) {
            q0.b("DomainSameDiTool", e2.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(b) ? "" : b;
        }
        if (!TextUtils.isEmpty(b)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? d == 0 ? b : "" : b;
        }
        if (!c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f9423a) ? "" : f9423a;
        }
        if (!TextUtils.isEmpty(f9423a)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? d == 0 ? f9423a : "" : f9423a;
        }
        m0.l();
        if (!c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            c = true;
        }
        return TextUtils.isEmpty(f9423a) ? "" : f9423a;
    }

    public static String e() {
        if (TextUtils.isEmpty(g) && !f) {
            b();
        }
        return g;
    }

    public static int a() {
        return d;
    }

    public static void a(int i2) {
        d = i2;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f) {
            return e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i2);
                jSONObject.put("amazonId", string);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    g = jSONObject2;
                    e = k0.b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e2) {
                q0.b("DomainSameDiTool", e2.getMessage());
            }
        } catch (Throwable th) {
            q0.b("DomainSameDiTool", th.getMessage());
        }
        f = true;
        return e;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str) {
        b = k0.b(str);
        f9423a = str;
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            h = false;
        }
        if (i) {
            return h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            h = true;
        }
        i = true;
        return h;
    }
}
