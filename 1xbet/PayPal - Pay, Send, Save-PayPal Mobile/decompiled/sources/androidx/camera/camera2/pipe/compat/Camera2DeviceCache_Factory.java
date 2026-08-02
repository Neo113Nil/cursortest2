package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2DeviceCache_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2DeviceCache> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.hardware.camera2.CameraManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<android.content.pm.PackageManager> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getInputSizeshNQ4ISI;

    private Camera2DeviceCache_Factory(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<android.content.Context> provider3, dagger.internal.Provider<android.content.pm.PackageManager> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> provider5, dagger.internal.Provider<androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider7, dagger.internal.Provider<kotlinx.coroutines.Job> provider8) {
        this.getHighSpeedVideoSizes = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.getInputFormats = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getHighSpeedVideoFpsRangesFor = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2DeviceCache get() {
        return newInstance(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2DeviceCache_Factory create(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<android.content.Context> provider3, dagger.internal.Provider<android.content.pm.PackageManager> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> provider5, dagger.internal.Provider<androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider7, dagger.internal.Provider<kotlinx.coroutines.Job> provider8) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCache_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2DeviceCache newInstance(javax.inject.Provider<android.hardware.camera2.CameraManager> provider, androidx.camera.camera2.pipe.core.Threads threads, android.content.Context context, android.content.pm.PackageManager packageManager, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, javax.inject.Provider<androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory> provider2, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, kotlinx.coroutines.Job job) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCache(provider, threads, context, packageManager, cameraErrorListener, provider2, cameraPipeLifetime, job);
    }
}
