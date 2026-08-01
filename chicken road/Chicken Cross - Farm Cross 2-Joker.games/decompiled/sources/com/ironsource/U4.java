package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class U4 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7943a = "U4";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f7943a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f7943a, "add LAT");
                jSONObject.put(U3.j.M, Boolean.parseBoolean(limitAdTracking));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(U3.j.y), SDKUtils.encodeString(String.valueOf(Ib.a0().a().h())));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String b = R3.b(context);
            String d = R3.d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(d));
            }
            if (!TextUtils.isEmpty(b) && !b.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(b));
            }
            jSONObject.put(SDKUtils.encodeString(U3.j.v), R3.e(context));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(U3.j.P), V4.b(context).a(context));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        try {
            if (a(U3.j.k0)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.k0), a2.D(context));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(L6.a1), Ib.a0().a().J(context));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        try {
            if (a(U3.j.n0)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.n0), a2.i(context));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(U3.j.Y), Ib.a0().a().l(context));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        try {
            if (a(U3.j.l0)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.l0), a2.E(context));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        try {
            if (a(U3.j.i0)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.i0), a2.j());
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public static JSONObject c(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        V4 b = V4.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String d = b.d();
            if (d != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(d));
            }
            String c = b.c();
            if (c != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(c));
            }
            String e = b.e();
            if (e != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.m), SDKUtils.encodeString(e));
            }
            String f = b.f();
            if (f != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.n), f.replaceAll("[^0-9/.]", ""));
            }
            String f2 = b.f();
            if (f2 != null) {
                jSONObject.put(SDKUtils.encodeString(U3.j.o), SDKUtils.encodeString(f2));
            }
            jSONObject.put(SDKUtils.encodeString(U3.j.p), String.valueOf(b.a()));
            jSONObject.put(SDKUtils.encodeString(U3.j.q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (b.b() != null && b.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(U3.j.r), SDKUtils.encodeString(b.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(U3.j.j0)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.j0), SDKUtils.encodeString(String.valueOf(a2.r(context))));
            }
            String g = C1.g(context);
            if (!TextUtils.isEmpty(g)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g));
            }
            String valueOf = String.valueOf(a2.r());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.K), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(a2.p());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.O), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put("mcc", Q3.b(context));
            jSONObject.put("mnc", Q3.c(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.S), Q3.f(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.R), SDKUtils.encodeString(Q3.g(context)));
            jSONObject.put(SDKUtils.encodeString(U3.j.V), C1.f(context));
            jSONObject.put(SDKUtils.encodeString(U3.j.X), C1.d(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C1.b(context)));
            String e2 = C1.e(context);
            if (!TextUtils.isEmpty(e2)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.c0), SDKUtils.encodeString(e2));
            }
            jSONObject.put(U3.j.d0, SDKUtils.encodeString(String.valueOf(a2.a())));
            jSONObject.put(U3.j.e0, SDKUtils.encodeString(String.valueOf(a2.m())));
            String H = a2.H(context);
            if (!TextUtils.isEmpty(H)) {
                jSONObject.put("icc", H);
            }
            String d2 = a2.d();
            if (!TextUtils.isEmpty(d2)) {
                jSONObject.put("tz", SDKUtils.encodeString(d2));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
        } catch (Exception e3) {
            C4491k4.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        try {
            a(jSONObject, U3.j.H, String.valueOf(a2.k()));
            a(jSONObject, U3.j.I, String.valueOf(a2.c()));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        try {
            if (a(U3.j.m0)) {
                jSONObject.put(SDKUtils.encodeString(U3.j.m0), a2.f(context));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
