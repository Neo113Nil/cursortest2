package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2MetadataCache_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2MetadataCache> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private Camera2MetadataCache_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2MetadataCache get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2MetadataCache_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider5) {
        return new androidx.camera.camera2.pipe.compat.Camera2MetadataCache_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2MetadataCache newInstance(android.content.Context context, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.core.Permissions permissions, androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig cameraMetadataConfig, androidx.camera.camera2.pipe.core.TimeSource timeSource) {
        return new androidx.camera.camera2.pipe.compat.Camera2MetadataCache(context, threads, permissions, cameraMetadataConfig, timeSource);
    }
}
