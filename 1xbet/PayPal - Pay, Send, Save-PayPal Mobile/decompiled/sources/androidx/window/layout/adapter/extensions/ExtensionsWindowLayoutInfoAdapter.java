package androidx.window.layout.adapter.extensions;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\nJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\nJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionsWindowLayoutInfoAdapter;", "", "<init>", "()V", "translate", "Landroidx/window/layout/FoldingFeature;", "windowMetrics", "Landroidx/window/layout/WindowMetrics;", "oemFeature", "Landroidx/window/extensions/layout/FoldingFeature;", "translate$window_release", "Landroidx/window/layout/WindowLayoutInfo;", "context", "Landroid/content/Context;", "info", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "", "Landroidx/window/layout/SupportedPosture;", "features", "Landroidx/window/extensions/layout/SupportedWindowFeatures;", "validBounds", "", "bounds", "Landroidx/window/core/Bounds;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter INSTANCE = new androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    public final androidx.window.layout.FoldingFeature translate$window_release(androidx.window.layout.WindowMetrics windowMetrics, androidx.window.extensions.layout.FoldingFeature oemFeature) {
        androidx.window.layout.HardwareFoldingFeature.Type fold;
        androidx.window.layout.FoldingFeature.State state;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oemFeature, "");
        int type = oemFeature.getType();
        if (type == 1) {
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getHINGE();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = androidx.window.layout.FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = androidx.window.layout.FoldingFeature.State.HALF_OPENED;
        }
        android.graphics.Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "");
        androidx.window.core.Bounds bounds2 = new androidx.window.core.Bounds(bounds);
        android.graphics.Rect bounds3 = windowMetrics.getBounds();
        if (bounds2.isZero() || ((bounds2.getWidth() != bounds3.width() && bounds2.getHeight() != bounds3.height()) || ((bounds2.getWidth() < bounds3.width() && bounds2.getHeight() < bounds3.height()) || (bounds2.getWidth() == bounds3.width() && bounds2.getHeight() == bounds3.height())))) {
            return null;
        }
        android.graphics.Rect bounds4 = oemFeature.getBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds4, "");
        return new androidx.window.layout.HardwareFoldingFeature(new androidx.window.core.Bounds(bounds4), fold, state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.window.layout.WindowLayoutInfo translate$window_release(android.content.Context context, androidx.window.extensions.layout.WindowLayoutInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        androidx.window.layout.WindowMetricsCalculatorCompat windowMetricsCalculatorCompat = new androidx.window.layout.WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return translate$window_release(windowMetricsCalculatorCompat.computeCurrentWindowMetrics(context), info);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (context instanceof android.app.Activity)) {
            return translate$window_release(windowMetricsCalculatorCompat.computeCurrentWindowMetrics((android.app.Activity) context), info);
        }
        throw new java.lang.UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
    }

    public final androidx.window.layout.WindowLayoutInfo translate$window_release(androidx.window.layout.WindowMetrics windowMetrics, androidx.window.extensions.layout.WindowLayoutInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        java.util.List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayFeatures, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature foldingFeature : displayFeatures) {
            androidx.window.layout.FoldingFeature translate$window_release = foldingFeature instanceof androidx.window.extensions.layout.FoldingFeature ? INSTANCE.translate$window_release(windowMetrics, foldingFeature) : null;
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return new androidx.window.layout.WindowLayoutInfo(arrayList);
    }

    public final java.util.List<androidx.window.layout.SupportedPosture> translate$window_release(androidx.window.extensions.layout.SupportedWindowFeatures features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "");
        java.util.List displayFoldFeatures = features.getDisplayFoldFeatures();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayFoldFeatures, "");
        java.util.List list = displayFoldFeatures;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((androidx.window.extensions.layout.DisplayFoldFeature) it.next()).hasProperties(new int[]{1})) {
                    return kotlin.collections.CollectionsKt.listOf(androidx.window.layout.SupportedPosture.TABLETOP);
                }
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
