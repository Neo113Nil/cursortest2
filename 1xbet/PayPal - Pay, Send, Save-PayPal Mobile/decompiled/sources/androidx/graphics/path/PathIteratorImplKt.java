package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Landroidx/graphics/path/PathSegment$Type;", "getHighSpeedVideoFpsRanges", "[Landroidx/graphics/path/PathSegment$Type;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathIteratorImplKt {
    private static final androidx.graphics.path.PathSegment.Type[] getHighSpeedVideoFpsRanges = androidx.graphics.path.PathSegment.Type.values();

    public static final /* synthetic */ androidx.graphics.path.PathSegment.Type access$platformToAndroidXSegmentType(int i) {
        switch (i) {
            case 0:
                return androidx.graphics.path.PathSegment.Type.Move;
            case 1:
                return androidx.graphics.path.PathSegment.Type.Line;
            case 2:
                return androidx.graphics.path.PathSegment.Type.Quadratic;
            case 3:
                return androidx.graphics.path.PathSegment.Type.Conic;
            case 4:
                return androidx.graphics.path.PathSegment.Type.Cubic;
            case 5:
                return androidx.graphics.path.PathSegment.Type.Close;
            case 6:
                return androidx.graphics.path.PathSegment.Type.Done;
            default:
                throw new java.lang.IllegalArgumentException("Unknown path segment type ".concat(java.lang.String.valueOf(i)));
        }
    }
}
