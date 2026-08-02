package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class CameraControlStateAdapter_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.CameraControlStateAdapter> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> getHighSpeedVideoSizes;

    private CameraControlStateAdapter_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> provider, dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.CameraControlStateAdapter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.adapter.CameraControlStateAdapter_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.ZoomControl> provider, dagger.internal.Provider<androidx.camera.camera2.impl.EvCompControl> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.TorchControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> provider4) {
        return new androidx.camera.camera2.adapter.CameraControlStateAdapter_Factory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.adapter.CameraControlStateAdapter newInstance(androidx.camera.camera2.impl.ZoomControl zoomControl, androidx.camera.camera2.impl.EvCompControl evCompControl, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl) {
        return new androidx.camera.camera2.adapter.CameraControlStateAdapter(zoomControl, evCompControl, torchControl, lowLightBoostControl);
    }
}
