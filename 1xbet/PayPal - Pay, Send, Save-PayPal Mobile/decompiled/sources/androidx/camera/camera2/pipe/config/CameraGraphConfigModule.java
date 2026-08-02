package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraGraphConfigModule;", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraGraphId;)V", "provideCameraGraphConfig", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "provideCameraGraphId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes.dex */
public final class CameraGraphConfigModule {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraphId getHighSpeedVideoSizes;

    public CameraGraphConfigModule(androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.CameraGraphId cameraGraphId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphId, "");
        this.getHighSpeedVideoFpsRangesFor = config;
        this.getHighSpeedVideoSizes = cameraGraphId;
    }

    @dagger.Provides
    /* renamed from: provideCameraGraphConfig, reason: from getter */
    public final androidx.camera.camera2.pipe.CameraGraph.Config getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @dagger.Provides
    /* renamed from: provideCameraGraphId, reason: from getter */
    public final androidx.camera.camera2.pipe.CameraGraphId getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }
}
