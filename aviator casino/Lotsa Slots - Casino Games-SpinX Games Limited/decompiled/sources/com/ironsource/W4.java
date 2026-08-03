package com.ironsource;

/* loaded from: classes5.dex */
public class W4 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6040a = "W4";

    public static org.json.JSONObject a(android.content.Context context) {
        com.ironsource.sdk.utils.SDKUtils.loadGoogleAdvertiserInfo(context);
        java.lang.String advertiserId = com.ironsource.sdk.utils.SDKUtils.getAdvertiserId();
        java.lang.String limitAdTracking = com.ironsource.sdk.utils.SDKUtils.getLimitAdTracking();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(advertiserId)) {
                com.ironsource.sdk.utils.Logger.i(f6040a, "add AID");
                jSONObject.put("deviceIds[AID]", com.ironsource.sdk.utils.SDKUtils.encodeString(advertiserId));
            }
            if (!android.text.TextUtils.isEmpty(limitAdTracking)) {
                com.ironsource.sdk.utils.Logger.i(f6040a, "add LAT");
                jSONObject.put(com.ironsource.X3.j.M, java.lang.Boolean.parseBoolean(limitAdTracking));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public static org.json.JSONObject b(android.content.Context context) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
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

    private static void c(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.y), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(com.ironsource.Jb.Y().a().h())));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void d(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            java.lang.String b = com.ironsource.U3.b(context);
            java.lang.String d = com.ironsource.U3.d(context);
            if (!android.text.TextUtils.isEmpty(d)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("rawConnectionType"), com.ironsource.sdk.utils.SDKUtils.encodeString(d));
            }
            if (!android.text.TextUtils.isEmpty(b) && !b.equals("none")) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("connectionType"), com.ironsource.sdk.utils.SDKUtils.encodeString(b));
            }
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.v), com.ironsource.U3.e(context));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void e(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.P), com.ironsource.X4.b(context).a(context));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void f(android.content.Context context, org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        try {
            if (a(com.ironsource.X3.j.k0)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.k0), a2.D(context));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void g(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.M6.b1), com.ironsource.Jb.Y().a().K(context));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void h(android.content.Context context, org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        try {
            if (a(com.ironsource.X3.j.n0)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.n0), a2.i(context));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.Y), com.ironsource.Jb.Y().a().l(context));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void c(android.content.Context context, org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        try {
            if (a(com.ironsource.X3.j.l0)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.l0), a2.E(context));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        try {
            if (a(com.ironsource.X3.j.i0)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.i0), a2.j());
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public static org.json.JSONObject c(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        com.ironsource.X4 b = com.ironsource.X4.b(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String d = b.d();
            if (d != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("deviceOEM"), com.ironsource.sdk.utils.SDKUtils.encodeString(d));
            }
            java.lang.String c = b.c();
            if (c != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("deviceModel"), com.ironsource.sdk.utils.SDKUtils.encodeString(c));
            }
            java.lang.String e = b.e();
            if (e != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.m), com.ironsource.sdk.utils.SDKUtils.encodeString(e));
            }
            java.lang.String f = b.f();
            if (f != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.n), f.replaceAll("[^0-9/.]", ""));
            }
            java.lang.String f2 = b.f();
            if (f2 != null) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.o), com.ironsource.sdk.utils.SDKUtils.encodeString(f2));
            }
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.p), java.lang.String.valueOf(b.a()));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.q), com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.sdk.utils.SDKUtils.getSDKVersion()));
            if (b.b() != null && b.b().length() > 0) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.r), com.ironsource.sdk.utils.SDKUtils.encodeString(b.b()));
            }
            java.lang.String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!android.text.TextUtils.isEmpty(language)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.x), com.ironsource.sdk.utils.SDKUtils.encodeString(language.toUpperCase(java.util.Locale.getDefault())));
            }
            if (a(com.ironsource.X3.j.j0)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.j0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(a2.r(context))));
            }
            java.lang.String g = com.ironsource.E1.g(context);
            if (!android.text.TextUtils.isEmpty(g)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("bundleId"), com.ironsource.sdk.utils.SDKUtils.encodeString(g));
            }
            java.lang.String valueOf = java.lang.String.valueOf(a2.r());
            if (!android.text.TextUtils.isEmpty(valueOf)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.K), com.ironsource.sdk.utils.SDKUtils.encodeString(valueOf));
            }
            java.lang.String valueOf2 = java.lang.String.valueOf(a2.p());
            if (!android.text.TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.O), com.ironsource.sdk.utils.SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("gpi"), com.ironsource.C2974bd.e(context));
            jSONObject.put("mcc", com.ironsource.T3.b(context));
            jSONObject.put("mnc", com.ironsource.T3.c(context));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.S), com.ironsource.T3.f(context));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.R), com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.T3.g(context)));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.V), com.ironsource.E1.f(context));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.X), com.ironsource.E1.d(context));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("appVersion"), com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.E1.b(context)));
            jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString("stid"), com.ironsource.C2974bd.d(context));
            java.lang.String e2 = com.ironsource.E1.e(context);
            if (!android.text.TextUtils.isEmpty(e2)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.c0), com.ironsource.sdk.utils.SDKUtils.encodeString(e2));
            }
            jSONObject.put(com.ironsource.X3.j.d0, com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(a2.a())));
            jSONObject.put(com.ironsource.X3.j.e0, com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(a2.m())));
            java.lang.String H = a2.H(context);
            if (!android.text.TextUtils.isEmpty(H)) {
                jSONObject.put("icc", H);
            }
            java.lang.String d2 = a2.d();
            if (!android.text.TextUtils.isEmpty(d2)) {
                jSONObject.put("tz", com.ironsource.sdk.utils.SDKUtils.encodeString(d2));
            }
            jSONObject.put("uxt", com.ironsource.sdk.utils.IronSourceStorageUtils.isUxt());
        } catch (java.lang.Exception e3) {
            com.ironsource.C3180n4.d().a(e3);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
        }
        return jSONObject;
    }

    private static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            if (android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, com.ironsource.sdk.utils.SDKUtils.encodeString(str2));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static boolean a(java.lang.String str) {
        return com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        try {
            a(jSONObject, com.ironsource.X3.j.H, java.lang.String.valueOf(a2.k()));
            a(jSONObject, com.ironsource.X3.j.I, java.lang.String.valueOf(a2.c()));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void a(android.content.Context context, org.json.JSONObject jSONObject) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        try {
            if (a(com.ironsource.X3.j.m0)) {
                jSONObject.put(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.m0), a2.f(context));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}
