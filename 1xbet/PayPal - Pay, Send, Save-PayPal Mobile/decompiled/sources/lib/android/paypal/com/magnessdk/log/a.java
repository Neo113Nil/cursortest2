package lib.android.paypal.com.magnessdk.log;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6941a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private static boolean getHighSpeedVideoSizes = java.lang.Boolean.valueOf(java.lang.System.getProperty("magnes.debug.mode", java.lang.Boolean.FALSE.toString())).booleanValue();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: lib.android.paypal.com.magnessdk.log.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    @interface InterfaceC0227a {
    }

    public static void a(java.lang.Class<?> cls, int i, java.lang.String str) {
    }

    public static void a(java.lang.Class<?> cls, int i, java.lang.Throwable th) {
        boolean z = getHighSpeedVideoSizes;
        if (z) {
            if (i == 0) {
                th.getMessage();
                return;
            }
            if (i == 1) {
                th.getMessage();
                return;
            }
            if (i == 2) {
                th.getMessage();
            } else if (i == 3 && z) {
                th.getMessage();
            }
        }
    }

    public static void a(java.lang.Class<?> cls, int i, org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (getHighSpeedVideoSizes) {
            jSONObject.toString(2);
        }
    }

    private a() {
    }
}
