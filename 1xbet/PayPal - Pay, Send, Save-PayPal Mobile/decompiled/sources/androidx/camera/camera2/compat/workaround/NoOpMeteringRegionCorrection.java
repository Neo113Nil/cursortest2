package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/workaround/NoOpMeteringRegionCorrection;", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "<init>", "()V", "Landroidx/camera/core/MeteringPoint;", "meteringPoint", "", "meteringMode", "Landroid/graphics/PointF;", "getCorrectedPoint", "(Landroidx/camera/core/MeteringPoint;I)Landroid/graphics/PointF;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoOpMeteringRegionCorrection implements androidx.camera.camera2.compat.workaround.MeteringRegionCorrection {
    public static final androidx.camera.camera2.compat.workaround.NoOpMeteringRegionCorrection INSTANCE = new androidx.camera.camera2.compat.workaround.NoOpMeteringRegionCorrection();

    private NoOpMeteringRegionCorrection() {
    }

    @Override // androidx.camera.camera2.compat.workaround.MeteringRegionCorrection
    public final android.graphics.PointF getCorrectedPoint(androidx.camera.core.MeteringPoint meteringPoint, int meteringMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meteringPoint, "");
        return new android.graphics.PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}
