package androidx.window.layout.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/window/core/layout/WindowSizeClass;", "Landroidx/window/layout/WindowMetrics;", "windowMetrics", "computeWindowSizeClass", "(Ljava/util/Set;Landroidx/window/layout/WindowMetrics;)Landroidx/window/core/layout/WindowSizeClass;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowSizeClassFactory {
    public static final androidx.window.core.layout.WindowSizeClass computeWindowSizeClass(java.util.Set<androidx.window.core.layout.WindowSizeClass> set, androidx.window.layout.WindowMetrics windowMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        return androidx.window.core.layout.WindowSizeClassSelectors.computeWindowSizeClass(set, windowMetrics.getWidthDp(), windowMetrics.getHeightDp());
    }
}
