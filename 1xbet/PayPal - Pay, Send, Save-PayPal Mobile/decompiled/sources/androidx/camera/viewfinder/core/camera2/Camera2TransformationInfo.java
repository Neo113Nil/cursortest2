package androidx.camera.viewfinder.core.camera2;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0010J?\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0017\u0010\u0010"}, d2 = {"Landroidx/camera/viewfinder/core/camera2/Camera2TransformationInfo;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "cropRectLeft", "cropRectTop", "cropRectRight", "cropRectBottom", "Landroidx/camera/viewfinder/core/TransformationInfo;", "createFromCharacteristics", "(Landroid/hardware/camera2/CameraCharacteristics;FFFF)Landroidx/camera/viewfinder/core/TransformationInfo;", "", "mirrorMode", "(Landroid/hardware/camera2/CameraCharacteristics;IFFFF)Landroidx/camera/viewfinder/core/TransformationInfo;", "p0", "p1", "p2", "p3", "p4", "p5", "getHighResolutionOutputSizeshNQ4ISI", "OutputConfigurationMirrorMode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Camera2TransformationInfo {
    public static final androidx.camera.viewfinder.core.camera2.Camera2TransformationInfo INSTANCE = new androidx.camera.viewfinder.core.camera2.Camera2TransformationInfo();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/viewfinder/core/camera2/Camera2TransformationInfo$OutputConfigurationMirrorMode;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface OutputConfigurationMirrorMode {
    }

    private Camera2TransformationInfo() {
    }

    public static /* synthetic */ androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics$default(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 16) != 0) {
            f4 = Float.NaN;
        }
        return createFromCharacteristics(cameraCharacteristics, f, f2, f3, f4);
    }

    public static /* synthetic */ androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics$default(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i, float f, float f2, float f3, float f4, int i2, java.lang.Object obj) {
        return createFromCharacteristics(cameraCharacteristics, i, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? Float.NaN : f2, (i2 & 16) != 0 ? Float.NaN : f3, (i2 & 32) != 0 ? Float.NaN : f4);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int mirrorMode, float cropRectLeft, float cropRectTop, float cropRectRight, float cropRectBottom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return getHighResolutionOutputSizeshNQ4ISI(cameraCharacteristics, mirrorMode, cropRectLeft, cropRectTop, cropRectRight, cropRectBottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r3 != 270) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r11 == 3) goto L22;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final androidx.camera.viewfinder.core.TransformationInfo getHighResolutionOutputSizeshNQ4ISI(android.hardware.camera2.CameraCharacteristics p0, int p1, float p2, float p3, float p4, float p5) {
        boolean z;
        boolean z2;
        java.lang.Integer num = (java.lang.Integer) p0.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        int intValue = num != null ? num.intValue() : 0;
        if (p1 != 0) {
            if (p1 != 2) {
            }
            z = true;
            z2 = false;
        } else {
            java.lang.Integer num2 = (java.lang.Integer) p0.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            if (num2 != null && num2.intValue() == 0) {
                if (intValue != 90) {
                }
                z2 = true;
                z = false;
            }
            z = false;
            z2 = false;
        }
        return new androidx.camera.viewfinder.core.TransformationInfo(intValue, z, z2, p2, p3, p4, p5);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, float cropRectLeft, float cropRectTop, float cropRectRight, float cropRectBottom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return getHighResolutionOutputSizeshNQ4ISI(cameraCharacteristics, 0, cropRectLeft, cropRectTop, cropRectRight, cropRectBottom);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i, float f, float f2, float f3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, i, f, f2, f3, 0.0f, 32, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, i, f, f2, 0.0f, 0.0f, 48, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, i, f, 0.0f, 0.0f, 0.0f, 56, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, i, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, float f, float f2, float f3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, f, f2, f3, 0.0f, 16, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, f, f2, 0.0f, 0.0f, 24, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, f, 0.0f, 0.0f, 0.0f, 28, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.TransformationInfo createFromCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return createFromCharacteristics$default(cameraCharacteristics, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }
}
