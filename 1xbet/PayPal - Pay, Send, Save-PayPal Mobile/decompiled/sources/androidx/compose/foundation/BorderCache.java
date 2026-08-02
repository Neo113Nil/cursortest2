package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "Landroidx/compose/ui/graphics/ImageBitmap;", "p0", "Landroidx/compose/ui/graphics/Canvas;", "p1", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "p2", "Landroidx/compose/ui/graphics/Path;", "p3", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/Canvas;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Path;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class BorderCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.ImageBitmap getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    androidx.compose.ui.graphics.Path getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.drawscope.CanvasDrawScope Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Canvas getHighSpeedVideoFpsRanges;

    private BorderCache(androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Path path) {
        this.getHighSpeedVideoSizes = imageBitmap;
        this.getHighSpeedVideoFpsRanges = canvas;
        this.Camera2StreamConfigurationMap = canvasDrawScope;
        this.getHighSpeedVideoFpsRangesFor = path;
    }

    public /* synthetic */ BorderCache(androidx.compose.ui.graphics.ImageBitmap imageBitmap, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Path path, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BorderCache(getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.getHighSpeedVideoSizes;
        int hashCode = imageBitmap == null ? 0 : imageBitmap.hashCode();
        androidx.compose.ui.graphics.Canvas canvas = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = canvas == null ? 0 : canvas.hashCode();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.Camera2StreamConfigurationMap;
        int hashCode3 = canvasDrawScope == null ? 0 : canvasDrawScope.hashCode();
        androidx.compose.ui.graphics.Path path = this.getHighSpeedVideoFpsRangesFor;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (path != null ? path.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.BorderCache)) {
            return false;
        }
        androidx.compose.foundation.BorderCache borderCache = (androidx.compose.foundation.BorderCache) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, borderCache.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, borderCache.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, borderCache.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, borderCache.getHighSpeedVideoFpsRangesFor);
    }

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }
}
