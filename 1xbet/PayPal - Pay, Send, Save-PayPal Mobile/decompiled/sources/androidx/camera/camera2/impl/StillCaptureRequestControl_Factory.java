package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class StillCaptureRequestControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.StillCaptureRequestControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> getHighSpeedVideoSizes;

    private StillCaptureRequestControl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.StillCaptureRequestControl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.StillCaptureRequestControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.FlashControl> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2) {
        return new androidx.camera.camera2.impl.StillCaptureRequestControl_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.impl.StillCaptureRequestControl newInstance(androidx.camera.camera2.impl.FlashControl flashControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        return new androidx.camera.camera2.impl.StillCaptureRequestControl(flashControl, useCaseThreads);
    }
}
