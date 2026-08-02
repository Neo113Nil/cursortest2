package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class DeferredUseCaseCameraRequestControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRangesFor;

    private DeferredUseCaseCameraRequestControl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl get() {
        return newInstance(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2) {
        return new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl newInstance(javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> provider, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        return new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl(provider, useCaseThreads);
    }
}
