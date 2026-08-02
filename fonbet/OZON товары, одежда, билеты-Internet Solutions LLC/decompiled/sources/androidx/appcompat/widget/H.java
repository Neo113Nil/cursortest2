package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f37627a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f37628b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f37629c = new Rect();

    /* loaded from: classes8.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f37630a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f37631b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f37632c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f37633d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f37634e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f37635f;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z11;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                } catch (ClassNotFoundException unused) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z11 = false;
                    if (z11) {
                    }
                } catch (NoSuchFieldException unused2) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z11 = false;
                    if (z11) {
                    }
                } catch (NoSuchMethodException unused3) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z11 = false;
                    if (z11) {
                    }
                }
            } catch (ClassNotFoundException unused4) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused5) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused6) {
                method = null;
                field = null;
            }
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField("right");
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                    field3 = null;
                }
                try {
                    field4 = cls.getField("bottom");
                    z11 = true;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                    field4 = null;
                    z11 = false;
                    if (z11) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z11 = false;
                if (z11) {
                }
            } catch (NoSuchFieldException unused10) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z11 = false;
                if (z11) {
                }
            } catch (NoSuchMethodException unused11) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z11 = false;
                if (z11) {
                }
            }
            if (z11) {
                f37631b = null;
                f37632c = null;
                f37633d = null;
                f37634e = null;
                f37635f = null;
                f37630a = false;
                return;
            }
            f37631b = method;
            f37632c = field;
            f37633d = field2;
            f37634e = field3;
            f37635f = field4;
            f37630a = true;
        }

        @NonNull
        static Rect a(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f37630a) {
                try {
                    Object invoke = f37631b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f37632c.getInt(invoke), f37633d.getInt(invoke), f37634e.getInt(invoke), f37635f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return H.f37629c;
        }
    }

    /* loaded from: classes8.dex */
    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    static void a(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || i11 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f37627a);
        } else {
            drawable.setState(f37628b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Rect b(@NonNull Drawable drawable) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (Build.VERSION.SDK_INT < 29) {
            boolean z11 = drawable instanceof androidx.core.graphics.drawable.f;
            Drawable drawable2 = drawable;
            if (z11) {
                drawable2 = ((androidx.core.graphics.drawable.f) drawable).b();
            }
            return a.a(drawable2);
        }
        Insets a11 = b.a(drawable);
        i11 = a11.left;
        i12 = a11.top;
        i13 = a11.right;
        i14 = a11.bottom;
        return new Rect(i11, i12, i13, i14);
    }

    public static PorterDuff.Mode c(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
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
