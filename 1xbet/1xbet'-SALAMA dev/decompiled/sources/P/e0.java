package P;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f5051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f5052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f5053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5054d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f5051a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f5052b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f5053c = declaredField3;
            declaredField3.setAccessible(true);
            f5054d = true;
        } catch (ReflectiveOperationException e7) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
        }
    }
}
