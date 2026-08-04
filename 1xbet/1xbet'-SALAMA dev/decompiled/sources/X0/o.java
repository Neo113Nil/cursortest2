package X0;

import P.f0;
import P.g0;
import P.h0;
import P.i0;
import P.q0;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7459b = 0;

    static {
        new ArrayList(new p050g6.e(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static m a(Activity activity) throws Exception {
        Rect rect;
        i0 g0Var;
        q0 q0VarB;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            t6.h.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i7 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                t6.h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e7) {
                Log.w("o", e7);
                rect = b(activity);
            } catch (NoSuchFieldException e8) {
                Log.w("o", e8);
                rect = b(activity);
            } catch (NoSuchMethodException e9) {
                Log.w("o", e9);
                rect = b(activity);
            } catch (InvocationTargetException e10) {
                Log.w("o", e10);
                rect = b(activity);
            }
        } else if (i7 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i8 = rect.bottom + dimensionPixelSize;
                if (i8 == point.y) {
                    rect.bottom = i8;
                } else {
                    int i9 = rect.right + dimensionPixelSize;
                    if (i9 == point.x) {
                        rect.right = i9;
                    }
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            if (i10 >= 30) {
                g0Var = new h0();
            } else {
                g0Var = i10 >= 29 ? new g0() : new f0();
            }
            q0VarB = g0Var.b();
            t6.h.d(q0VarB, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i10 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            q0VarB = p011b1.a.f10125a.a(activity);
        }
        return new m(new U0.b(rect), q0VarB);
    }

    public static Rect b(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutG = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                t6.h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                t6.h.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e7) {
            Log.w("o", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e8) {
            Log.w("o", e8);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e9) {
            Log.w("o", e9);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e10) {
            Log.w("o", e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        t6.h.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i7 = rect.bottom + dimensionPixelSize;
            if (i7 == point.y) {
                rect.bottom = i7;
            } else {
                int i8 = rect.right + dimensionPixelSize;
                if (i8 == point.x) {
                    rect.right = i8;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (S0.e.s(obj2)) {
                    displayCutoutG = S0.e.g(obj2);
                }
            } catch (ClassNotFoundException e11) {
                Log.w("o", e11);
            } catch (IllegalAccessException e12) {
                Log.w("o", e12);
            } catch (InstantiationException e13) {
                Log.w("o", e13);
            } catch (NoSuchFieldException e14) {
                Log.w("o", e14);
            } catch (NoSuchMethodException e15) {
                Log.w("o", e15);
            } catch (InvocationTargetException e16) {
                Log.w("o", e16);
            }
            if (displayCutoutG != null) {
                if (rect.left == displayCutoutG.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutG.getSafeInsetRight()) {
                    rect.right = displayCutoutG.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutG.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutG.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutG.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
