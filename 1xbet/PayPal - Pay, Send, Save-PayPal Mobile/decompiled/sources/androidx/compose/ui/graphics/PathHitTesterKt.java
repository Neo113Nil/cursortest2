package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "path", "", "tolerance", "Landroidx/compose/ui/graphics/PathHitTester;", "PathHitTester", "(Landroidx/compose/ui/graphics/Path;F)Landroidx/compose/ui/graphics/PathHitTester;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/Path;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathHitTesterKt {
    private static final androidx.compose.ui.graphics.Path getHighSpeedVideoFpsRanges = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();

    public static /* synthetic */ androidx.compose.ui.graphics.PathHitTester PathHitTester$default(androidx.compose.ui.graphics.Path path, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return PathHitTester(path, f);
    }

    public static final androidx.compose.ui.graphics.PathHitTester PathHitTester(androidx.compose.ui.graphics.Path path, float f) {
        androidx.compose.ui.graphics.PathHitTester pathHitTester = new androidx.compose.ui.graphics.PathHitTester();
        pathHitTester.updatePath(path, f);
        return pathHitTester;
    }
}
