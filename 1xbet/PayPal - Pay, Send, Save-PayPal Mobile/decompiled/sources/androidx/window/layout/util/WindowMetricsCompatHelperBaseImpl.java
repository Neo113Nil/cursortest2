package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010"}, d2 = {"Landroidx/window/layout/util/WindowMetricsCompatHelperBaseImpl;", "Landroidx/window/layout/util/WindowMetricsCompatHelper;", "<init>", "()V", "Landroid/view/WindowMetrics;", "windowMetrics", "", "density", "Landroidx/window/layout/WindowMetrics;", "translateWindowMetrics", "(Landroid/view/WindowMetrics;F)Landroidx/window/layout/WindowMetrics;", "Landroid/content/Context;", "context", "Landroidx/window/layout/util/DensityCompatHelper;", "densityCompatHelper", "currentWindowMetrics", "(Landroid/content/Context;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "maximumWindowMetrics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowMetricsCompatHelperBaseImpl implements androidx.window.layout.util.WindowMetricsCompatHelper {
    public static final androidx.window.layout.util.WindowMetricsCompatHelperBaseImpl INSTANCE = new androidx.window.layout.util.WindowMetricsCompatHelperBaseImpl();

    private WindowMetricsCompatHelperBaseImpl() {
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public final androidx.window.layout.WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        throw new java.lang.UnsupportedOperationException("translateWindowMetrics not available before API30");
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public final androidx.window.layout.WindowMetrics currentWindowMetrics(android.content.Context context, androidx.window.layout.util.DensityCompatHelper densityCompatHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(densityCompatHelper, "");
        android.content.Context unwrapContext$window_release = androidx.window.layout.util.ContextCompatHelper.INSTANCE.unwrapContext$window_release(context);
        if (unwrapContext$window_release instanceof android.app.Activity) {
            return currentWindowMetrics((android.app.Activity) unwrapContext$window_release, densityCompatHelper);
        }
        if ((unwrapContext$window_release instanceof android.inputmethodservice.InputMethodService) || (unwrapContext$window_release instanceof android.app.Application)) {
            java.lang.Object systemService = context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            androidx.window.layout.util.DisplayHelper displayHelper = androidx.window.layout.util.DisplayHelper.INSTANCE;
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
            android.graphics.Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
            return new androidx.window.layout.WindowMetrics(new android.graphics.Rect(0, 0, realSizeForDisplay.x, realSizeForDisplay.y), densityCompatHelper.density(context));
        }
        throw new java.lang.IllegalArgumentException("Must provide a UiContext or Application Context");
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public final androidx.window.layout.WindowMetrics currentWindowMetrics(android.app.Activity activity, androidx.window.layout.util.DensityCompatHelper densityCompatHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(densityCompatHelper, "");
        return new androidx.window.layout.WindowMetrics(new androidx.window.core.Bounds(androidx.window.layout.util.BoundsHelper.INSTANCE.getInstance().currentWindowBounds(activity)), densityCompatHelper.density(activity));
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public final androidx.window.layout.WindowMetrics maximumWindowMetrics(android.content.Context context, androidx.window.layout.util.DensityCompatHelper densityCompatHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(densityCompatHelper, "");
        return new androidx.window.layout.WindowMetrics(new androidx.window.core.Bounds(androidx.window.layout.util.BoundsHelper.INSTANCE.getInstance().maximumWindowBounds(context)), densityCompatHelper.density(context));
    }
}
