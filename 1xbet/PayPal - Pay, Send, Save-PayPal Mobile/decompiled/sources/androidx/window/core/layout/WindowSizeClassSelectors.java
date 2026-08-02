package androidx.window.core.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\b\u001a'\u0010\t\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\b"}, d2 = {"", "Landroidx/window/core/layout/WindowSizeClass;", "", "widthDp", "heightDp", "computeWindowSizeClass", "(Ljava/util/Set;FF)Landroidx/window/core/layout/WindowSizeClass;", "", "(Ljava/util/Set;II)Landroidx/window/core/layout/WindowSizeClass;", "computeWindowSizeClassPreferHeight"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowSizeClassSelectors {
    public static final androidx.window.core.layout.WindowSizeClass computeWindowSizeClass(java.util.Set<androidx.window.core.layout.WindowSizeClass> set, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return computeWindowSizeClass(set, (int) f, (int) f2);
    }

    public static final androidx.window.core.layout.WindowSizeClass computeWindowSizeClass(java.util.Set<androidx.window.core.layout.WindowSizeClass> set, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<androidx.window.core.layout.WindowSizeClass> set2 = set;
        int i3 = 0;
        for (androidx.window.core.layout.WindowSizeClass windowSizeClass : set2) {
            if (windowSizeClass.getMinWidthDp() <= i && windowSizeClass.getMinWidthDp() > i3) {
                i3 = windowSizeClass.getMinWidthDp();
            }
        }
        androidx.window.core.layout.WindowSizeClass windowSizeClass2 = new androidx.window.core.layout.WindowSizeClass(0, 0);
        for (androidx.window.core.layout.WindowSizeClass windowSizeClass3 : set2) {
            if (windowSizeClass3.getMinWidthDp() == i3 && windowSizeClass3.getMinHeightDp() <= i2 && windowSizeClass2.getMinHeightDp() <= windowSizeClass3.getMinHeightDp()) {
                windowSizeClass2 = windowSizeClass3;
            }
        }
        return windowSizeClass2;
    }

    public static final androidx.window.core.layout.WindowSizeClass computeWindowSizeClassPreferHeight(java.util.Set<androidx.window.core.layout.WindowSizeClass> set, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<androidx.window.core.layout.WindowSizeClass> set2 = set;
        int i3 = 0;
        for (androidx.window.core.layout.WindowSizeClass windowSizeClass : set2) {
            if (windowSizeClass.getMinHeightDp() <= i2 && windowSizeClass.getMinHeightDp() > i3) {
                i3 = windowSizeClass.getMinHeightDp();
            }
        }
        androidx.window.core.layout.WindowSizeClass windowSizeClass2 = new androidx.window.core.layout.WindowSizeClass(0, 0);
        for (androidx.window.core.layout.WindowSizeClass windowSizeClass3 : set2) {
            if (windowSizeClass3.getMinHeightDp() == i3 && windowSizeClass3.getMinWidthDp() <= i && windowSizeClass2.getMinWidthDp() <= windowSizeClass3.getMinWidthDp()) {
                windowSizeClass2 = windowSizeClass3;
            }
        }
        return windowSizeClass2;
    }
}
