package androidx.camera.camera2.compat;

/* loaded from: classes6.dex */
public final class EvCompImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.compat.EvCompImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRangesFor;

    private EvCompImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.EvCompImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.compat.EvCompImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider3) {
        return new androidx.camera.camera2.compat.EvCompImpl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.compat.EvCompImpl newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        return new androidx.camera.camera2.compat.EvCompImpl(cameraProperties, useCaseThreads, comboRequestListener);
    }
}
