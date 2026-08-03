package h;

/* renamed from: h.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0165x {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Rect f3277a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f3278b;

    static {
        try {
            f3278b = java.lang.Class.forName("android.graphics.Insets");
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.DrawableContainer)) {
            if (drawable instanceof s.f) {
                ((s.g) ((s.f) drawable)).getClass();
                return a(null);
            }
            if (drawable instanceof h.C0166y) {
                return a(((h.C0166y) drawable).f3279a);
            }
            if (drawable instanceof android.graphics.drawable.ScaleDrawable) {
                return a(((android.graphics.drawable.ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (android.graphics.drawable.Drawable drawable2 : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.Rect b(android.graphics.drawable.Drawable drawable) {
        char c2;
        android.graphics.Insets opticalInsets;
        int i2;
        int i3;
        int i4;
        int i5;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            android.graphics.Rect rect = new android.graphics.Rect();
            i2 = opticalInsets.left;
            rect.left = i2;
            i3 = opticalInsets.right;
            rect.right = i3;
            i4 = opticalInsets.top;
            rect.top = i4;
            i5 = opticalInsets.bottom;
            rect.bottom = i5;
            return rect;
        }
        java.lang.Class cls = f3278b;
        if (cls != null) {
            try {
                boolean z2 = drawable instanceof s.f;
                java.lang.Object obj = drawable;
                if (z2) {
                    ((s.g) ((s.f) drawable)).getClass();
                    obj = null;
                }
                java.lang.Object invoke = obj.getClass().getMethod("getOpticalInsets", null).invoke(obj, null);
                if (invoke != null) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    for (java.lang.reflect.Field field : cls.getFields()) {
                        java.lang.String name = field.getName();
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
            } catch (java.lang.Exception unused) {
                android.util.Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f3277a;
    }

    public static android.graphics.PorterDuff.Mode c(int i2, android.graphics.PorterDuff.Mode mode) {
        if (i2 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
