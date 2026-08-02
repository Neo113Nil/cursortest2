package androidx.camera.core;

/* loaded from: classes6.dex */
public class SurfaceOrientedMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoSizes;

    public SurfaceOrientedMeteringPointFactory(float f, float f2) {
        this.getHighSpeedVideoSizes = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected android.graphics.PointF convertPoint(float f, float f2) {
        return new android.graphics.PointF(f / this.getHighSpeedVideoSizes, f2 / this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SurfaceOrientedMeteringPointFactory(float f, float f2, androidx.camera.core.UseCase useCase) {
        super(r5);
        android.util.Rational rational;
        if (useCase == null) {
            rational = null;
        } else {
            android.util.Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
            if (attachedSurfaceResolution == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UseCase ");
                sb.append(useCase);
                sb.append(" is not bound.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            rational = new android.util.Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        this.getHighSpeedVideoSizes = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
    }
}
