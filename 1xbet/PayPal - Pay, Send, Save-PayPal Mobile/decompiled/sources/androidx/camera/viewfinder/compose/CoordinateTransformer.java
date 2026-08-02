package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/compose/CoordinateTransformer;", "", "Landroidx/compose/ui/geometry/Offset;", "transform-MK-Hz9U", "(J)J", "transform", "Landroidx/compose/ui/graphics/Matrix;", "getTransformMatrix-sQKQjiQ", "()[F", "transformMatrix"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CoordinateTransformer {
    /* renamed from: getTransformMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo1036getTransformMatrixsQKQjiQ();

    /* renamed from: transform-MK-Hz9U, reason: not valid java name */
    default long mo1037transformMKHz9U(long j) {
        return androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(mo1036getTransformMatrixsQKQjiQ(), j);
    }
}
