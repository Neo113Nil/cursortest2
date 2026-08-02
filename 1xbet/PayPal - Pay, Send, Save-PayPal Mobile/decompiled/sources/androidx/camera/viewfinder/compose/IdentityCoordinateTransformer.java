package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/viewfinder/compose/IdentityCoordinateTransformer;", "Landroidx/camera/viewfinder/compose/CoordinateTransformer;", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "transform-MK-Hz9U", "(J)J", "transform", "Landroidx/compose/ui/graphics/Matrix;", "transformMatrix", "[F", "getTransformMatrix-sQKQjiQ", "()[F"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IdentityCoordinateTransformer implements androidx.camera.viewfinder.compose.CoordinateTransformer {
    public static final androidx.camera.viewfinder.compose.IdentityCoordinateTransformer INSTANCE = new androidx.camera.viewfinder.compose.IdentityCoordinateTransformer();
    private static final float[] transformMatrix = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);
    public static final int $stable = 8;

    @Override // androidx.camera.viewfinder.compose.CoordinateTransformer
    /* renamed from: transform-MK-Hz9U */
    public final long mo1037transformMKHz9U(long j) {
        return j;
    }

    private IdentityCoordinateTransformer() {
    }

    @Override // androidx.camera.viewfinder.compose.CoordinateTransformer
    /* renamed from: getTransformMatrix-sQKQjiQ */
    public final float[] mo1036getTransformMatrixsQKQjiQ() {
        return transformMatrix;
    }
}
