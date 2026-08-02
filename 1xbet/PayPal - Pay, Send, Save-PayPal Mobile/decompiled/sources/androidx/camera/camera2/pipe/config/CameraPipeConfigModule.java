package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraPipeConfigModule;", "", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "config", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)V", "provideCameraPipeConfig", "()Landroidx/camera/camera2/pipe/CameraPipe$Config;", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "provideCameraPipeFlags", "()Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "cameraPipeConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "provideCameraInteropConfig", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module(includes = {androidx.camera.camera2.pipe.config.ThreadConfigModule.class}, subcomponents = {androidx.camera.camera2.pipe.config.CameraGraphComponent.class, androidx.camera.camera2.pipe.config.FrameGraphComponent.class})
/* loaded from: classes6.dex */
public final class CameraPipeConfigModule {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraPipe.Config getHighSpeedVideoFpsRangesFor;

    public CameraPipeConfigModule(androidx.camera.camera2.pipe.CameraPipe.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoFpsRangesFor = config;
    }

    @dagger.Provides
    /* renamed from: provideCameraPipeConfig, reason: from getter */
    public final androidx.camera.camera2.pipe.CameraPipe.Config getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.CameraPipe.Flags provideCameraPipeFlags() {
        return this.getHighSpeedVideoFpsRangesFor.getFlags();
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig provideCameraInteropConfig(androidx.camera.camera2.pipe.CameraPipe.Config cameraPipeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeConfig, "");
        return cameraPipeConfig.getCameraInteropConfig();
    }
}
