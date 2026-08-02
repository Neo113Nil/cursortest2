package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Landroidx/window/layout/util/DensityCompatHelperApi34Impl;", "Landroidx/window/layout/util/DensityCompatHelper;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "density", "(Landroid/content/Context;)F", "Landroid/content/res/Configuration;", "Landroid/view/WindowMetrics;", "p1", "(Landroid/content/res/Configuration;Landroid/view/WindowMetrics;)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DensityCompatHelperApi34Impl implements androidx.window.layout.util.DensityCompatHelper {
    public static final androidx.window.layout.util.DensityCompatHelperApi34Impl INSTANCE = new androidx.window.layout.util.DensityCompatHelperApi34Impl();

    private DensityCompatHelperApi34Impl() {
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public final float density(android.content.Context p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return ((android.view.WindowManager) p0.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public final float density(android.content.res.Configuration p0, android.view.WindowMetrics p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        return p1.getDensity();
    }
}
