package com.ironsource;

/* renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3327v8 {
    private static com.ironsource.C3327v8 b;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.J5 f6775a;

    private C3327v8() {
    }

    private static com.ironsource.C3327v8 a() {
        if (b == null) {
            b = new com.ironsource.C3327v8();
        }
        return b;
    }

    public static void a(com.ironsource.D5 d5, com.ironsource.C3291t8 c3291t8) {
        if (d5 != null) {
            try {
                a().f6775a = new com.ironsource.J5(d5, c3291t8);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(com.ironsource.C3083he.a aVar) {
        a(aVar, new java.util.HashMap());
    }

    public static void a(com.ironsource.C3083he.a aVar, java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.J5 j5 = a().f6775a;
        if (j5 == null) {
            android.util.Log.d(com.ironsource.B5.f5622a, com.ironsource.B5.V);
            return;
        }
        if (map != null) {
            map.put("eventid", java.lang.Integer.valueOf(aVar.b));
        }
        j5.a(aVar.f6294a, map);
    }
}
