package E;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f569a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f570b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f571c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f572d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f569a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f570b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f571c = declaredField3;
            declaredField3.setAccessible(true);
            f572d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
