package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "DoneSegment", "Landroidx/compose/ui/graphics/PathSegment;", "getDoneSegment", "()Landroidx/compose/ui/graphics/PathSegment;", "CloseSegment", "getCloseSegment"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathSegmentKt {
    private static final androidx.compose.ui.graphics.PathSegment DoneSegment = new androidx.compose.ui.graphics.PathSegment(androidx.compose.ui.graphics.PathSegment.Type.Done, new float[0], 0.0f);
    private static final androidx.compose.ui.graphics.PathSegment CloseSegment = new androidx.compose.ui.graphics.PathSegment(androidx.compose.ui.graphics.PathSegment.Type.Close, new float[0], 0.0f);

    public static final androidx.compose.ui.graphics.PathSegment getDoneSegment() {
        return DoneSegment;
    }

    public static final androidx.compose.ui.graphics.PathSegment getCloseSegment() {
        return CloseSegment;
    }
}
