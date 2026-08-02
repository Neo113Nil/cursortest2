package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/camera/camera2/pipe/config/FrameGraphConfigModule;", "", "Landroidx/camera/camera2/pipe/config/CameraGraphComponent;", "cameraGraphComponent", "Landroidx/camera/camera2/pipe/FrameGraph$Config;", "config", "<init>", "(Landroidx/camera/camera2/pipe/config/CameraGraphComponent;Landroidx/camera/camera2/pipe/FrameGraph$Config;)V", "provideCameraGraphConfig", "()Landroidx/camera/camera2/pipe/FrameGraph$Config;", "Landroidx/camera/camera2/pipe/CameraGraph;", "provideCameraGraph", "()Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "provideGraphProcessor", "()Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "provideFrameCaptureQueue", "()Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "provideSessionLock", "()Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "provideFrameDistributor", "()Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "provideController3A", "()Landroidx/camera/camera2/pipe/graph/Controller3A;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/config/CameraGraphComponent;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/FrameGraph$Config;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes.dex */
public final class FrameGraphConfigModule {
    private final androidx.camera.camera2.pipe.FrameGraph.Config Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.config.CameraGraphComponent getHighSpeedVideoSizes;

    public FrameGraphConfigModule(androidx.camera.camera2.pipe.config.CameraGraphComponent cameraGraphComponent, androidx.camera.camera2.pipe.FrameGraph.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoSizes = cameraGraphComponent;
        this.Camera2StreamConfigurationMap = config;
    }

    @dagger.Provides
    /* renamed from: provideCameraGraphConfig, reason: from getter */
    public final androidx.camera.camera2.pipe.FrameGraph.Config getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.CameraGraph provideCameraGraph() {
        return this.getHighSpeedVideoSizes.cameraGraph();
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.graph.GraphProcessor provideGraphProcessor() {
        return this.getHighSpeedVideoSizes.graphProcessor();
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.internal.FrameCaptureQueue provideFrameCaptureQueue() {
        return this.getHighSpeedVideoSizes.frameCaptureQueue();
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.internal.GraphSessionLock provideSessionLock() {
        return this.getHighSpeedVideoSizes.sessionLock();
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.internal.FrameDistributor provideFrameDistributor() {
        return this.getHighSpeedVideoSizes.frameDistributor();
    }

    @dagger.Provides
    public final androidx.camera.camera2.pipe.graph.Controller3A provideController3A() {
        return this.getHighSpeedVideoSizes.controller3A();
    }
}
