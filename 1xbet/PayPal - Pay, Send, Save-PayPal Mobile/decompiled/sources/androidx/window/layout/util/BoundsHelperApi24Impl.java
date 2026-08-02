package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/layout/util/BoundsHelperApi24Impl;", "Landroidx/window/layout/util/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Landroid/content/Context;", "maximumWindowBounds", "(Landroid/content/Context;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BoundsHelperApi24Impl implements androidx.window.layout.util.BoundsHelper {
    public static final androidx.window.layout.util.BoundsHelperApi24Impl INSTANCE = new androidx.window.layout.util.BoundsHelperApi24Impl();

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect currentWindowBounds(android.app.Activity p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!androidx.window.layout.util.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
            androidx.window.layout.util.DisplayHelper displayHelper = androidx.window.layout.util.DisplayHelper.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultDisplay);
            android.graphics.Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
            int access$getNavigationBarHeight = androidx.window.layout.util.BoundsHelperKt.access$getNavigationBarHeight(p0);
            if (rect.bottom + access$getNavigationBarHeight == realSizeForDisplay.y) {
                rect.bottom += access$getNavigationBarHeight;
                return rect;
            }
            if (rect.right + access$getNavigationBarHeight == realSizeForDisplay.x) {
                rect.right += access$getNavigationBarHeight;
            }
        }
        return rect;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect maximumWindowBounds(android.content.Context p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return androidx.window.layout.util.BoundsHelperApi16Impl.INSTANCE.maximumWindowBounds(p0);
    }
}
