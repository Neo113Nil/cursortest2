package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class FocusMeteringControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.FocusMeteringControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.MeteringRegionCorrection> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.ZoomCompat> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoSizes;

    private FocusMeteringControl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.MeteringRegionCorrection> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider4, dagger.internal.Provider<androidx.camera.camera2.compat.ZoomCompat> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.FocusMeteringControl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.FocusMeteringControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.MeteringRegionCorrection> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.State3AControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider4, dagger.internal.Provider<androidx.camera.camera2.compat.ZoomCompat> provider5) {
        return new androidx.camera.camera2.impl.FocusMeteringControl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.impl.FocusMeteringControl newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.compat.workaround.MeteringRegionCorrection meteringRegionCorrection, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.compat.ZoomCompat zoomCompat) {
        return new androidx.camera.camera2.impl.FocusMeteringControl(cameraProperties, meteringRegionCorrection, state3AControl, useCaseThreads, zoomCompat);
    }
}
