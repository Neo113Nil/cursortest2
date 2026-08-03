package Z;

/* loaded from: classes.dex */
public final class m implements Z.l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1865b = 0;

    static {
        new java.util.ArrayList(new i1.C0187f(new java.lang.Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static Z.k a(android.app.Activity activity) {
        android.graphics.Rect rect;
        y.Q b2;
        android.view.WindowMetrics currentWindowMetrics;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            currentWindowMetrics = ((android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            kotlin.jvm.internal.i.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i2 >= 29) {
            android.content.res.Configuration configuration = activity.getResources().getConfiguration();
            try {
                java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(configuration);
                java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new android.graphics.Rect((android.graphics.Rect) invoke);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.w("m", e2);
                rect = b(activity);
            } catch (java.lang.NoSuchFieldException e3) {
                android.util.Log.w("m", e3);
                rect = b(activity);
            } catch (java.lang.NoSuchMethodException e4) {
                android.util.Log.w("m", e4);
                rect = b(activity);
            } catch (java.lang.reflect.InvocationTargetException e5) {
                android.util.Log.w("m", e5);
                rect = b(activity);
            }
        } else if (i2 >= 28) {
            rect = b(activity);
        } else {
            rect = new android.graphics.Rect();
            android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                android.graphics.Point point = new android.graphics.Point();
                defaultDisplay.getRealSize(point);
                android.content.res.Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM);
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i3 = rect.bottom + dimensionPixelSize;
                if (i3 == point.y) {
                    rect.bottom = i3;
                } else {
                    int i4 = rect.right + dimensionPixelSize;
                    if (i4 == point.x) {
                        rect.right = i4;
                    }
                }
            }
        }
        int i5 = android.os.Build.VERSION.SDK_INT;
        if (i5 < 30) {
            b2 = (i5 >= 30 ? new y.H() : i5 >= 29 ? new y.G() : new y.F()).b();
            kotlin.jvm.internal.i.d(b2, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i5 < 30) {
                throw new java.lang.Exception("Incompatible SDK version");
            }
            b2 = d0.C0107a.f2738a.a(activity);
        }
        return new Z.k(new W.b(rect), b2);
    }

    public static android.graphics.Rect b(android.app.Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        android.view.DisplayCutout displayCutout = null;
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((android.graphics.Rect) invoke);
            } else {
                java.lang.Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                kotlin.jvm.internal.i.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((android.graphics.Rect) invoke2);
            }
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.w("m", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (java.lang.NoSuchFieldException e3) {
            android.util.Log.w("m", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (java.lang.NoSuchMethodException e4) {
            android.util.Log.w("m", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (java.lang.reflect.InvocationTargetException e5) {
            android.util.Log.w("m", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        android.view.Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        kotlin.jvm.internal.i.d(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            android.content.res.Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                java.lang.Object newInstance = constructor.newInstance(null);
                java.lang.reflect.Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(currentDisplay, newInstance);
                java.lang.reflect.Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                java.lang.Object obj2 = declaredField2.get(newInstance);
                if (F0.e.y(obj2)) {
                    displayCutout = F0.e.n(obj2);
                }
            } catch (java.lang.ClassNotFoundException e6) {
                android.util.Log.w("m", e6);
            } catch (java.lang.IllegalAccessException e7) {
                android.util.Log.w("m", e7);
            } catch (java.lang.InstantiationException e8) {
                android.util.Log.w("m", e8);
            } catch (java.lang.NoSuchFieldException e9) {
                android.util.Log.w("m", e9);
            } catch (java.lang.NoSuchMethodException e10) {
                android.util.Log.w("m", e10);
            } catch (java.lang.reflect.InvocationTargetException e11) {
                android.util.Log.w("m", e11);
            }
            if (displayCutout != null) {
                int i4 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i4 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i5 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i5 == safeInsetRight) {
                    int i6 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i6;
                }
                int i7 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i7 == safeInsetTop) {
                    rect.top = 0;
                }
                int i8 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i8 == safeInsetBottom) {
                    int i9 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i9;
                }
            }
        }
        return rect;
    }
}
