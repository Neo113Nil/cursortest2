package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideFrameCaptureQueueFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighSpeedVideoFpsRangesFor;

    private FrameGraphConfigModule_ProvideFrameCaptureQueueFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighSpeedVideoFpsRangesFor = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.FrameCaptureQueue get() {
        return provideFrameCaptureQueue(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideFrameCaptureQueueFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideFrameCaptureQueueFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.internal.FrameCaptureQueue provideFrameCaptureQueue(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.internal.FrameCaptureQueue) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.provideFrameCaptureQueue());
    }
}
