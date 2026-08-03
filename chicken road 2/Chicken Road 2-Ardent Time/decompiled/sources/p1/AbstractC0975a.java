package p1;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0975a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer f8311a;

    static {
        java.lang.Integer num;
        java.lang.Object obj;
        java.lang.Integer num2 = null;
        try {
            obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Throwable unused) {
        }
        if (obj instanceof java.lang.Integer) {
            num = (java.lang.Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f8311a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f8311a = num2;
    }
}
