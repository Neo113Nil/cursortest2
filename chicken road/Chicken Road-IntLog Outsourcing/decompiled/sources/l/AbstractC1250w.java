package l;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1250w {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f10979a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f10980b;

    static {
        try {
            f10980b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof y.f) {
                ((y.g) ((y.f) drawable)).getClass();
                return a(null);
            }
            if (drawable instanceof C1251x) {
                return a(((C1251x) drawable).f10981a);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        char c2;
        Insets opticalInsets;
        int i2;
        int i3;
        int i6;
        int i7;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i2 = opticalInsets.left;
            rect.left = i2;
            i3 = opticalInsets.right;
            rect.right = i3;
            i6 = opticalInsets.top;
            rect.top = i6;
            i7 = opticalInsets.bottom;
            rect.bottom = i7;
            return rect;
        }
        Class cls = f10980b;
        if (cls != null) {
            try {
                boolean z = drawable instanceof y.f;
                Object obj = drawable;
                if (z) {
                    ((y.g) ((y.f) drawable)).getClass();
                    obj = null;
                }
                Object invoke = obj.getClass().getMethod("getOpticalInsets", null).invoke(obj, null);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : cls.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c2 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c2 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c2 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f10979a;
    }

    public static PorterDuff.Mode c(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
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
