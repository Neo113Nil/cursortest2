package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/layout/util/BoundsHelperApi30Impl;", "Landroidx/window/layout/util/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Landroid/content/Context;", "maximumWindowBounds", "(Landroid/content/Context;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BoundsHelperApi30Impl implements androidx.window.layout.util.BoundsHelper {
    public static final androidx.window.layout.util.BoundsHelperApi30Impl INSTANCE = new androidx.window.layout.util.BoundsHelperApi30Impl();

    private BoundsHelperApi30Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect currentWindowBounds(android.app.Activity p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        android.graphics.Rect bounds = ((android.view.WindowManager) p0.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "");
        return bounds;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public final android.graphics.Rect maximumWindowBounds(android.content.Context p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        android.graphics.Rect bounds = ((android.view.WindowManager) p0.getSystemService(android.view.WindowManager.class)).getMaximumWindowMetrics().getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "");
        return bounds;
    }
}
