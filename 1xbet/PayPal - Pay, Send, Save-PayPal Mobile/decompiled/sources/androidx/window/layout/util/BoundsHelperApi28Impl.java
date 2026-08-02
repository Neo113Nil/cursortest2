package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/layout/util/BoundsHelperApi28Impl;", "Landroidx/window/layout/util/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Landroid/content/Context;", "maximumWindowBounds", "(Landroid/content/Context;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BoundsHelperApi28Impl implements androidx.window.layout.util.BoundsHelper {
    public static final androidx.window.layout.util.BoundsHelperApi28Impl INSTANCE = new androidx.window.layout.util.BoundsHelperApi28Impl();

    private BoundsHelperApi28Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect currentWindowBounds(android.app.Activity p0) {
        android.view.DisplayCutout dJ_;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = p0.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            if (androidx.window.layout.util.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
                java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                rect.set((android.graphics.Rect) invoke);
            } else {
                java.lang.Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke2, "");
                rect.set((android.graphics.Rect) invoke2);
            }
        } catch (java.lang.Exception e) {
            if ((e instanceof java.lang.NoSuchFieldException) || (e instanceof java.lang.NoSuchMethodException) || (e instanceof java.lang.IllegalAccessException) || (e instanceof java.lang.reflect.InvocationTargetException)) {
                androidx.window.layout.util.BoundsHelper.INSTANCE.getTAG();
                p0.getWindowManager().getDefaultDisplay().getRectSize(rect);
            } else {
                throw e;
            }
        }
        android.view.Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        if (!androidx.window.layout.util.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
            int access$getNavigationBarHeight = androidx.window.layout.util.BoundsHelperKt.access$getNavigationBarHeight(p0);
            if (rect.bottom + access$getNavigationBarHeight == point.y) {
                rect.bottom += access$getNavigationBarHeight;
            } else if (rect.right + access$getNavigationBarHeight == point.x) {
                rect.right += access$getNavigationBarHeight;
            } else if (rect.left == access$getNavigationBarHeight) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !androidx.window.layout.util.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultDisplay);
            dJ_ = androidx.window.layout.util.BoundsHelperKt.dJ_(defaultDisplay);
            if (dJ_ != null) {
                if (rect.left == androidx.window.layout.util.DisplayCompatHelperApi28.INSTANCE.safeInsetLeft(dJ_)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == androidx.window.layout.util.DisplayCompatHelperApi28.INSTANCE.safeInsetRight(dJ_)) {
                    rect.right += androidx.window.layout.util.DisplayCompatHelperApi28.INSTANCE.safeInsetRight(dJ_);
                }
                if (rect.top == androidx.window.layout.util.DisplayCompatHelperApi28.INSTANCE.safeInsetTop(dJ_)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == androidx.window.layout.util.DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(dJ_)) {
                    rect.bottom += androidx.window.layout.util.DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(dJ_);
                }
            }
        }
        return rect;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect maximumWindowBounds(android.content.Context p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return androidx.window.layout.util.BoundsHelperApi24Impl.INSTANCE.maximumWindowBounds(p0);
    }
}
