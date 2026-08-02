package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.appcompat.widget.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0637f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8620a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8621b = new int[0];

    /* renamed from: c, reason: collision with root package name */
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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Insets a2 = AbstractC0635e0.a(drawable);
            i7 = a2.left;
            i8 = a2.top;
            i9 = a2.right;
            i10 = a2.bottom;
            return new Rect(i7, i8, i9, i10);
        }
        boolean z4 = drawable instanceof J.g;
        Object obj = drawable;
        if (z4) {
            ((J.h) ((J.g) drawable)).getClass();
            obj = null;
        }
        if (i11 >= 29) {
            boolean z7 = AbstractC0633d0.f8606a;
        } else if (AbstractC0633d0.f8606a) {
            try {
                Object invoke = AbstractC0633d0.f8607b.invoke(obj, null);
                if (invoke != null) {
                    return new Rect(AbstractC0633d0.f8608c.getInt(invoke), AbstractC0633d0.f8609d.getInt(invoke), AbstractC0633d0.f8610e.getInt(invoke), AbstractC0633d0.f8611f.getInt(invoke));
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
