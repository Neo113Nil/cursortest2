package androidx.camera.camera2.config;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010'R\u0014\u0010$\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010*"}, d2 = {"Landroidx/camera/camera2/config/CameraAppConfig;", "", "Landroid/content/Context;", "context", "Landroidx/camera/core/impl/CameraThreadConfig;", "cameraThreadConfig", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "camera2InteropCallbacks", "Landroidx/camera/core/concurrent/CameraCoordinator;", "cameraCoordinator", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "<init>", "(Landroid/content/Context;Landroidx/camera/core/impl/CameraThreadConfig;Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;Landroidx/camera/core/concurrent/CameraCoordinator;Landroidx/camera/core/CameraXConfig;)V", "provideContext", "()Landroid/content/Context;", "provideCameraThreadConfig", "()Landroidx/camera/core/impl/CameraThreadConfig;", "provideCameraPipe", "()Landroidx/camera/camera2/pipe/CameraPipe;", "provideCamera2InteropCallbacks", "()Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "provideCameraCoordinator", "()Landroidx/camera/core/concurrent/CameraCoordinator;", "provideCameraXConfig", "()Landroidx/camera/core/CameraXConfig;", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "provideDisplayInfoManager", "(Landroid/content/Context;)Landroidx/camera/camera2/impl/DisplayInfoManager;", "getOutputFormats", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/camera/core/impl/CameraThreadConfig;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/CameraPipe;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/concurrent/CameraCoordinator;", "Landroidx/camera/core/CameraXConfig;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public final class CameraAppConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraPipe getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.CameraXConfig getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.core.concurrent.CameraCoordinator Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.CameraThreadConfig getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    public CameraAppConfig(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.core.CameraXConfig cameraXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraThreadConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInteropStateCallbackRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraXConfig, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = cameraThreadConfig;
        this.getHighSpeedVideoFpsRangesFor = cameraPipe;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraInteropStateCallbackRepository;
        this.Camera2StreamConfigurationMap = cameraCoordinator;
        this.getOutputFormats = cameraXConfig;
    }

    @dagger.Provides
    /* renamed from: provideContext, reason: from getter */
    public final android.content.Context getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @dagger.Provides
    /* renamed from: provideCameraThreadConfig, reason: from getter */
    public final androidx.camera.core.impl.CameraThreadConfig getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @dagger.Provides
    /* renamed from: provideCameraPipe, reason: from getter */
    public final androidx.camera.camera2.pipe.CameraPipe getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @dagger.Provides
    /* renamed from: provideCamera2InteropCallbacks, reason: from getter */
    public final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @dagger.Provides
    /* renamed from: provideCameraCoordinator, reason: from getter */
    public final androidx.camera.core.concurrent.CameraCoordinator getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @dagger.Provides
    /* renamed from: provideCameraXConfig, reason: from getter */
    public final androidx.camera.core.CameraXConfig getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @dagger.Provides
    public final androidx.camera.camera2.impl.DisplayInfoManager provideDisplayInfoManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return androidx.camera.camera2.impl.DisplayInfoManager.INSTANCE.getInstance(context);
    }
}
