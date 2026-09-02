package o;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f8097a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f8098b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8099c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8100d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8101e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f8102f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.PendingIntent f8103g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0941a(java.lang.String str, android.app.PendingIntent pendingIntent) {
        androidx.core.graphics.drawable.IconCompat b2 = androidx.core.graphics.drawable.IconCompat.b(2131165278);
        android.os.Bundle bundle = new android.os.Bundle();
        this.f8100d = true;
        this.f8098b = b2;
        int i2 = b2.f2174a;
        if (i2 == -1) {
            int i3 = android.os.Build.VERSION.SDK_INT;
            java.lang.Object obj = b2.f2175b;
            if (i3 >= 28) {
                i2 = s.d.c(obj);
            } else {
                try {
                    i2 = ((java.lang.Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (java.lang.IllegalAccessException e2) {
                    android.util.Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f8102f = o.b.a(str);
                    this.f8103g = pendingIntent;
                    this.f8097a = bundle;
                    this.f8099c = true;
                    this.f8100d = true;
                } catch (java.lang.NoSuchMethodException e3) {
                    android.util.Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f8102f = o.b.a(str);
                    this.f8103g = pendingIntent;
                    this.f8097a = bundle;
                    this.f8099c = true;
                    this.f8100d = true;
                } catch (java.lang.reflect.InvocationTargetException e4) {
                    android.util.Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f8102f = o.b.a(str);
                    this.f8103g = pendingIntent;
                    this.f8097a = bundle;
                    this.f8099c = true;
                    this.f8100d = true;
                }
            }
        }
        if (i2 == 2) {
            this.f8101e = b2.c();
        }
        this.f8102f = o.b.a(str);
        this.f8103g = pendingIntent;
        this.f8097a = bundle;
        this.f8099c = true;
        this.f8100d = true;
    }
}
