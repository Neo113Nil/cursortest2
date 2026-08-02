package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/layout/util/BoundsHelperApi29Impl;", "Landroidx/window/layout/util/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Landroid/content/Context;", "maximumWindowBounds", "(Landroid/content/Context;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BoundsHelperApi29Impl implements androidx.window.layout.util.BoundsHelper {
    public static final androidx.window.layout.util.BoundsHelperApi29Impl INSTANCE = new androidx.window.layout.util.BoundsHelperApi29Impl();

    private BoundsHelperApi29Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect currentWindowBounds(android.app.Activity p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        android.content.res.Configuration configuration = p0.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            return new android.graphics.Rect((android.graphics.Rect) invoke);
        } catch (java.lang.Exception e) {
            if ((e instanceof java.lang.NoSuchFieldException) || (e instanceof java.lang.NoSuchMethodException) || (e instanceof java.lang.IllegalAccessException) || (e instanceof java.lang.reflect.InvocationTargetException)) {
                androidx.window.layout.util.BoundsHelper.INSTANCE.getTAG();
                return androidx.window.layout.util.BoundsHelperApi28Impl.INSTANCE.currentWindowBounds(p0);
            }
            throw e;
        }
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect maximumWindowBounds(android.content.Context p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return androidx.window.layout.util.BoundsHelperApi28Impl.INSTANCE.maximumWindowBounds(p0);
    }
}
