package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public abstract class b {
    protected static java.io.File d;

    protected static org.json.JSONObject a(java.lang.String str) {
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 0, "entering getCachedConfig");
        try {
            java.lang.String b = b(str);
            if (b.isEmpty()) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 0, "leaving getCachedConfig,cached config loaded empty");
                return null;
            }
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 0, "leaving getCachedConfig,cached config loadsuccessfully");
            return new org.json.JSONObject(b);
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 3, e);
            return null;
        }
    }

    protected static java.lang.String b(java.lang.String str) {
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 0, "Loading loadCachedConfigData");
        java.io.File file = d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_DATA");
        return a.c.b(new java.io.File(file, sb.toString()));
    }

    static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 0, "entering deleteCachedConfigDataFromDisk");
        java.io.File file = d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_DATA");
        java.io.File file2 = new java.io.File(file, sb.toString());
        java.io.File file3 = d;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append("_TIME");
        return a.c.a(file2) && a.c.a(new java.io.File(file3, sb2.toString()));
    }

    protected abstract void a(org.json.JSONObject jSONObject);

    protected abstract org.json.JSONObject b();

    protected java.lang.String c(java.lang.String str) {
        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "Loading loadCachedConfigTime");
        java.io.File file = d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_TIME");
        return a.c.b(new java.io.File(file, sb.toString()));
    }

    protected abstract org.json.JSONObject c();

    protected abstract java.lang.String d();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean Camera2StreamConfigurationMap(org.json.JSONObject jSONObject, long j, lib.android.paypal.com.magnessdk.c.EnumC0221c enumC0221c) {
        java.lang.String str;
        java.lang.Object obj;
        if (enumC0221c == lib.android.paypal.com.magnessdk.c.EnumC0221c.RAMP) {
            obj = lib.android.paypal.com.magnessdk.c.i.CONF_REFRESH_TIME_KEY;
        } else {
            if (enumC0221c != lib.android.paypal.com.magnessdk.c.EnumC0221c.REMOTE) {
                str = "";
                return java.lang.System.currentTimeMillis() <= j + (jSONObject.optLong(str, 0L) * 1000);
            }
            obj = lib.android.paypal.com.magnessdk.c.j.CONF_REFRESH_TIME_KEY;
        }
        str = obj.toString();
        if (java.lang.System.currentTimeMillis() <= j + (jSONObject.optLong(str, 0L) * 1000)) {
        }
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.b.class, 0, "entering saveConfigData");
        java.io.File file = d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append("_DATA");
        java.io.File file2 = new java.io.File(file, sb.toString());
        java.io.File file3 = d;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append("_TIME");
        java.io.File file4 = new java.io.File(file3, sb2.toString());
        a.c.a(file2, str);
        a.c.a(file4, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
    }
}
