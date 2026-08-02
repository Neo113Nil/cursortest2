package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class State3AControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.State3AControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRangesFor;

    private State3AControl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.State3AControl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.impl.State3AControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3) {
        return new androidx.camera.camera2.impl.State3AControl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.impl.State3AControl newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler autoFlashAEModeDisabler, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        return new androidx.camera.camera2.impl.State3AControl(cameraProperties, autoFlashAEModeDisabler, useCaseThreads);
    }
}
