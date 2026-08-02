package androidx.camera.core;

/* loaded from: classes6.dex */
public abstract class MeteringPointFactory {
    private android.util.Rational getHighSpeedVideoSizes;

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    protected abstract android.graphics.PointF convertPoint(float f, float f2);

    public MeteringPointFactory() {
        this(null);
    }

    public MeteringPointFactory(android.util.Rational rational) {
        this.getHighSpeedVideoSizes = rational;
    }

    protected void setSurfaceAspectRatio(android.util.Rational rational) {
        this.getHighSpeedVideoSizes = rational;
    }

    public final androidx.camera.core.MeteringPoint createPoint(float f, float f2) {
        return createPoint(f, f2, getDefaultPointSize());
    }

    public final androidx.camera.core.MeteringPoint createPoint(float f, float f2, float f3) {
        android.graphics.PointF convertPoint = convertPoint(f, f2);
        return new androidx.camera.core.MeteringPoint(convertPoint.x, convertPoint.y, f3, this.getHighSpeedVideoSizes);
    }
}
