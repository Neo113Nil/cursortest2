package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.UseTorchAsFlash> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraDevices> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculator> getHighSpeedVideoSizes;

    private UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraDevices> provider2, dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculator> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.UseTorchAsFlash get() {
        return provideUseTorchAsFlash(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.compat.workaround.UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraDevices> provider2, dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculator> provider3) {
        return new androidx.camera.camera2.compat.workaround.UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.compat.workaround.UseTorchAsFlash provideUseTorchAsFlash(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.camera2.pipe.CameraDevices cameraDevices, androidx.camera.camera2.internal.IntrinsicZoomCalculator intrinsicZoomCalculator) {
        return (androidx.camera.camera2.compat.workaround.UseTorchAsFlash) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.workaround.UseTorchAsFlash.Bindings.INSTANCE.provideUseTorchAsFlash(cameraQuirks, cameraDevices, intrinsicZoomCalculator));
    }
}
