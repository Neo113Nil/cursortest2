package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class LowLightBoostControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.LowLightBoostControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> getHighSpeedVideoFpsRangesFor;

    private LowLightBoostControl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.LowLightBoostControl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.impl.LowLightBoostControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider4) {
        return new androidx.camera.camera2.impl.LowLightBoostControl_Factory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.impl.LowLightBoostControl newInstance(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        return new androidx.camera.camera2.impl.LowLightBoostControl(cameraMetadata, state3AControl, useCaseThreads, comboRequestListener);
    }
}
