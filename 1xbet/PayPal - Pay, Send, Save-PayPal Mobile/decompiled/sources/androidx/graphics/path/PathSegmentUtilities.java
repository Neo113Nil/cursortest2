package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Landroidx/graphics/path/PathSegment;", "CloseSegment", "Landroidx/graphics/path/PathSegment;", "getCloseSegment", "()Landroidx/graphics/path/PathSegment;", "DoneSegment", "getDoneSegment"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathSegmentUtilities {
    private static final androidx.graphics.path.PathSegment DoneSegment = new androidx.graphics.path.PathSegment(androidx.graphics.path.PathSegment.Type.Done, new android.graphics.PointF[0], 0.0f);
    private static final androidx.graphics.path.PathSegment CloseSegment = new androidx.graphics.path.PathSegment(androidx.graphics.path.PathSegment.Type.Close, new android.graphics.PointF[0], 0.0f);

    public static final androidx.graphics.path.PathSegment getDoneSegment() {
        return DoneSegment;
    }

    public static final androidx.graphics.path.PathSegment getCloseSegment() {
        return CloseSegment;
    }
}
