package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.appcompat.widget.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0616f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f8620a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f8621b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f8622c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f8620a);
        } else {
            drawable.setState(f8621b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Object obj;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            Insets insetsA = AbstractC0614e0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (drawable instanceof J.g) {
            obj = drawable;
            ((J.h) ((J.g) drawable)).getClass();
            obj = null;
        }
        if (i7 >= 29) {
            boolean z4 = AbstractC0612d0.f8606a;
        } else if (AbstractC0612d0.f8606a) {
            try {
                Object objInvoke = AbstractC0612d0.f8607b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC0612d0.f8608c.getInt(objInvoke), AbstractC0612d0.f8609d.getInt(objInvoke), AbstractC0612d0.f8610e.getInt(objInvoke), AbstractC0612d0.f8611f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f8622c;
    }

    public static PorterDuff.Mode c(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
