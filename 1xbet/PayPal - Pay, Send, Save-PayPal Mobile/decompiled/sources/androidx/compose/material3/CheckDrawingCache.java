package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000b"}, d2 = {"Landroidx/compose/material3/CheckDrawingCache;", "", "Landroidx/compose/ui/graphics/Path;", "p0", "Landroidx/compose/ui/graphics/PathMeasure;", "p1", "p2", "<init>", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathMeasure;Landroidx/compose/ui/graphics/Path;)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Path;", "()Landroidx/compose/ui/graphics/Path;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/PathMeasure;", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/graphics/PathMeasure;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CheckDrawingCache {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.PathMeasure Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path getHighSpeedVideoFpsRanges;

    private CheckDrawingCache(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathMeasure pathMeasure, androidx.compose.ui.graphics.Path path2) {
        this.getHighSpeedVideoFpsRanges = path;
        this.Camera2StreamConfigurationMap = pathMeasure;
        this.getHighResolutionOutputSizeshNQ4ISI = path2;
    }

    public /* synthetic */ CheckDrawingCache(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathMeasure pathMeasure, androidx.compose.ui.graphics.Path path2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.AndroidPath_androidKt.Path() : path, (i & 2) != 0 ? androidx.compose.ui.graphics.AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i & 4) != 0 ? androidx.compose.ui.graphics.AndroidPath_androidKt.Path() : path2);
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final androidx.compose.ui.graphics.Path getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.compose.ui.graphics.PathMeasure getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final androidx.compose.ui.graphics.Path getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }
}
