package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/window/layout/util/WindowMetricsCompatHelper;", "", "Landroid/view/WindowMetrics;", "windowMetrics", "", "density", "Landroidx/window/layout/WindowMetrics;", "translateWindowMetrics", "(Landroid/view/WindowMetrics;F)Landroidx/window/layout/WindowMetrics;", "Landroid/content/Context;", "context", "Landroidx/window/layout/util/DensityCompatHelper;", "densityCompatHelper", "currentWindowMetrics", "(Landroid/content/Context;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "maximumWindowMetrics", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WindowMetricsCompatHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.util.WindowMetricsCompatHelper.Companion INSTANCE = androidx.window.layout.util.WindowMetricsCompatHelper.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.window.layout.WindowMetrics currentWindowMetrics(android.app.Activity activity, androidx.window.layout.util.DensityCompatHelper densityCompatHelper);

    androidx.window.layout.WindowMetrics currentWindowMetrics(android.content.Context context, androidx.window.layout.util.DensityCompatHelper densityCompatHelper);

    androidx.window.layout.WindowMetrics maximumWindowMetrics(android.content.Context context, androidx.window.layout.util.DensityCompatHelper densityCompatHelper);

    androidx.window.layout.WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float density);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/window/layout/util/WindowMetricsCompatHelper$Companion;", "", "<init>", "()V", "Landroidx/window/layout/util/WindowMetricsCompatHelper;", "getInstance", "()Landroidx/window/layout/util/WindowMetricsCompatHelper;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.window.layout.util.WindowMetricsCompatHelper.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.window.layout.util.WindowMetricsCompatHelper.Companion();

        private Companion() {
        }

        public final androidx.window.layout.util.WindowMetricsCompatHelper getInstance() {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.window.layout.util.WindowMetricsCompatHelperApi34Impl.INSTANCE;
            }
            return android.os.Build.VERSION.SDK_INT >= 30 ? androidx.window.layout.util.WindowMetricsCompatHelperApi30Impl.INSTANCE : androidx.window.layout.util.WindowMetricsCompatHelperBaseImpl.INSTANCE;
        }
    }
}
