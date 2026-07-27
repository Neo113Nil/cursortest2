package D;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f197a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f198b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f199c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f200d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f197a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f198b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f199c = declaredField3;
            declaredField3.setAccessible(true);
            f200d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
