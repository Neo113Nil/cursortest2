package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/util/DensityCompatHelper;", "densityCompatHelper", "<init>", "(Landroidx/window/layout/util/DensityCompatHelper;)V", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "(Landroid/content/Context;)Landroidx/window/layout/WindowMetrics;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Landroidx/window/layout/WindowMetrics;", "computeMaximumWindowMetrics", "Camera2StreamConfigurationMap", "Landroidx/window/layout/util/DensityCompatHelper;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/ArrayList;", "", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "insetsTypeMasks", "Ljava/util/ArrayList;", "getInsetsTypeMasks$window_release", "()Ljava/util/ArrayList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowMetricsCalculatorCompat implements androidx.window.layout.WindowMetricsCalculator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.window.layout.util.DensityCompatHelper getHighSpeedVideoFpsRangesFor;
    private final java.util.ArrayList<java.lang.Integer> insetsTypeMasks;

    public WindowMetricsCalculatorCompat(androidx.window.layout.util.DensityCompatHelper densityCompatHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(densityCompatHelper, "");
        this.getHighSpeedVideoFpsRangesFor = densityCompatHelper;
        this.insetsTypeMasks = kotlin.collections.CollectionsKt.arrayListOf(java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.statusBars()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.navigationBars()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.captionBar()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.ime()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.systemGestures()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.tappableElement()), java.lang.Integer.valueOf(androidx.core.view.WindowInsetsCompat.Type.displayCutout()));
    }

    public /* synthetic */ WindowMetricsCalculatorCompat(androidx.window.layout.util.DensityCompatHelper densityCompatHelper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.window.layout.util.DensityCompatHelper.INSTANCE.getInstance() : densityCompatHelper);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public final androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return androidx.window.layout.util.WindowMetricsCompatHelper.INSTANCE.getInstance().currentWindowMetrics(context, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public final androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return androidx.window.layout.util.WindowMetricsCompatHelper.INSTANCE.getInstance().currentWindowMetrics(activity, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public final androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return androidx.window.layout.util.WindowMetricsCompatHelper.INSTANCE.getInstance().maximumWindowMetrics(activity, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public final androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return androidx.window.layout.util.WindowMetricsCompatHelper.INSTANCE.getInstance().maximumWindowMetrics(context, this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.util.ArrayList<java.lang.Integer> getInsetsTypeMasks$window_release() {
        return this.insetsTypeMasks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowMetricsCalculatorCompat() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
