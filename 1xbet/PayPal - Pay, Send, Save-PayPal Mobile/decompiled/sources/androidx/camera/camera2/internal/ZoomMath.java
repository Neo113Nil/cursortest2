package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/camera2/internal/ZoomMath;", "", "<init>", "()V", "", "zoomRatio", "minZoomRatio", "maxZoomRatio", "getLinearZoomFromZoomRatio", "(FFF)F", "linearZoom", "getZoomRatioFromLinearZoom", "num", "", "nearZero$camera_camera2", "(F)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomMath {
    public static final androidx.camera.camera2.internal.ZoomMath INSTANCE = new androidx.camera.camera2.internal.ZoomMath();

    private ZoomMath() {
    }

    public final boolean nearZero$camera_camera2(float num) {
        return ((double) java.lang.Math.abs(num)) < ((double) java.lang.Math.ulp(java.lang.Math.abs(num))) * 2.0d;
    }

    public final float getLinearZoomFromZoomRatio(float zoomRatio, float minZoomRatio, float maxZoomRatio) {
        if (nearZero$camera_camera2(minZoomRatio - maxZoomRatio) || nearZero$camera_camera2(zoomRatio)) {
            return 0.0f;
        }
        if (nearZero$camera_camera2(zoomRatio - maxZoomRatio)) {
            return 1.0f;
        }
        if (nearZero$camera_camera2(zoomRatio - minZoomRatio)) {
            return 0.0f;
        }
        float f = 1.0f / minZoomRatio;
        return androidx.core.math.MathUtils.clamp((f - (1.0f / zoomRatio)) / (f - (1.0f / maxZoomRatio)), 0.0f, 1.0f);
    }

    public final float getZoomRatioFromLinearZoom(float linearZoom, float minZoomRatio, float maxZoomRatio) {
        if (nearZero$camera_camera2(linearZoom - 1.0f)) {
            return maxZoomRatio;
        }
        if (nearZero$camera_camera2(linearZoom - 0.0f)) {
            return minZoomRatio;
        }
        float f = 1.0f / minZoomRatio;
        return androidx.core.math.MathUtils.clamp(1.0f / (f - ((f - (1.0f / maxZoomRatio)) * linearZoom)), minZoomRatio, maxZoomRatio);
    }
}
