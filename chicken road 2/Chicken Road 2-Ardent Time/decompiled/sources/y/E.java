package y;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Field f8420a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Field f8421b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f8422c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8423d;

    static {
        try {
            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAttachInfo");
            f8420a = declaredField;
            declaredField.setAccessible(true);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f8421b = declaredField2;
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f8422c = declaredField3;
            declaredField3.setAccessible(true);
            f8423d = true;
        } catch (java.lang.ReflectiveOperationException e2) {
            android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
