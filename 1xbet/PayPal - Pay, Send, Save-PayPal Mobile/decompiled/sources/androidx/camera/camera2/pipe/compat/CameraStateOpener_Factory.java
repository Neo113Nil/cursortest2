package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class CameraStateOpener_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.CameraStateOpener> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraOpener> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> getOutputMinFrameDuration;

    private CameraStateOpener_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraOpener> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getInputFormats = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.CameraStateOpener get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get());
    }

    public static androidx.camera.camera2.pipe.compat.CameraStateOpener_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraOpener> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider7) {
        return new androidx.camera.camera2.pipe.compat.CameraStateOpener_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static androidx.camera.camera2.pipe.compat.CameraStateOpener newInstance(androidx.camera.camera2.pipe.compat.CameraOpener cameraOpener, androidx.camera.camera2.pipe.compat.Camera2MetadataProvider camera2MetadataProvider, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks, androidx.camera.camera2.pipe.core.TimeSource timeSource, androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig, androidx.camera.camera2.pipe.core.Threads threads) {
        return new androidx.camera.camera2.pipe.compat.CameraStateOpener(cameraOpener, camera2MetadataProvider, cameraErrorListener, camera2Quirks, timeSource, cameraInteropConfig, threads);
    }
}
