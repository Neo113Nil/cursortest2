package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2Backend_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2Backend> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataCache> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getInputSizeshNQ4ISI;

    private Camera2Backend_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCache> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataCache> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceManager> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder> provider5, dagger.internal.Provider<android.content.Context> provider6) {
        this.getInputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2Backend get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2Backend_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCache> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataCache> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceManager> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder> provider5, dagger.internal.Provider<android.content.Context> provider6) {
        return new androidx.camera.camera2.pipe.compat.Camera2Backend_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2Backend newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache, androidx.camera.camera2.pipe.compat.Camera2MetadataCache camera2MetadataCache, androidx.camera.camera2.pipe.compat.Camera2DeviceManager camera2DeviceManager, androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder builder, android.content.Context context) {
        return new androidx.camera.camera2.pipe.compat.Camera2Backend(threads, camera2DeviceCache, camera2MetadataCache, camera2DeviceManager, builder, context);
    }
}
