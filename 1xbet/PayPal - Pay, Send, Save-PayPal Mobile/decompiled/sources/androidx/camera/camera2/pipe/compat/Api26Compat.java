package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api26Compat;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraCaptureSession", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfiguration", "", "finalizeOutputConfigurations", "(Landroid/hardware/camera2/CameraCaptureSession;Ljava/util/List;)V", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Ljava/lang/Class;", "klass", "newOutputConfiguration", "(Landroid/util/Size;Ljava/lang/Class;)Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfig", "enableSurfaceSharing", "(Landroid/hardware/camera2/params/OutputConfiguration;)V", "Landroid/view/Surface;", "getSurfaces", "(Landroid/hardware/camera2/params/OutputConfiguration;)Ljava/util/List;", "surface", "addSurfaces", "(Landroid/hardware/camera2/params/OutputConfiguration;Landroid/view/Surface;)V", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "interopSessionStateCallback", "session", "onCaptureQueueEmpty", "(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api26Compat {
    public static final androidx.camera.camera2.pipe.compat.Api26Compat INSTANCE = new androidx.camera.camera2.pipe.compat.Api26Compat();

    private Api26Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final void finalizeOutputConfigurations(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfiguration) throws android.hardware.camera2.CameraAccessException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCaptureSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfiguration, "");
        cameraCaptureSession.finalizeOutputConfigurations(outputConfiguration);
    }

    @kotlin.jvm.JvmStatic
    public static final android.hardware.camera2.params.OutputConfiguration newOutputConfiguration(android.util.Size size, java.lang.Class<?> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        return new android.hardware.camera2.params.OutputConfiguration(size, klass);
    }

    @kotlin.jvm.JvmStatic
    public static final void enableSurfaceSharing(android.hardware.camera2.params.OutputConfiguration outputConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfig, "");
        outputConfig.enableSurfaceSharing();
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<android.view.Surface> getSurfaces(android.hardware.camera2.params.OutputConfiguration outputConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfig, "");
        java.util.List<android.view.Surface> surfaces = outputConfig.getSurfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
        return surfaces;
    }

    @kotlin.jvm.JvmStatic
    public static final void addSurfaces(android.hardware.camera2.params.OutputConfiguration outputConfig, android.view.Surface surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        outputConfig.addSurface(surface);
    }

    @kotlin.jvm.JvmStatic
    public static final void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession.StateCallback interopSessionStateCallback, android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        if (interopSessionStateCallback != null) {
            interopSessionStateCallback.onCaptureQueueEmpty(session);
        }
    }
}
