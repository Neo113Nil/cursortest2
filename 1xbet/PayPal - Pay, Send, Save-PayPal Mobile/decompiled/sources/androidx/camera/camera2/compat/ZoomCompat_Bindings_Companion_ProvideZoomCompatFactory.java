package androidx.camera.camera2.compat;

/* loaded from: classes6.dex */
public final class ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.ZoomCompat> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighResolutionOutputSizeshNQ4ISI;

    private ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.ZoomCompat get() {
        return provideZoomCompat(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.compat.ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider) {
        return new androidx.camera.camera2.compat.ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory(provider);
    }

    public static androidx.camera.camera2.compat.ZoomCompat provideZoomCompat(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        return (androidx.camera.camera2.compat.ZoomCompat) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.ZoomCompat.Bindings.INSTANCE.provideZoomCompat(cameraProperties));
    }
}
