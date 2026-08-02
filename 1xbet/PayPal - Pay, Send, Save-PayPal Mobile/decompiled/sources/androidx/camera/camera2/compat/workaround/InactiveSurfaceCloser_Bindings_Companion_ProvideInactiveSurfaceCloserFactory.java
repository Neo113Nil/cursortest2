package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getHighSpeedVideoFpsRangesFor;

    private InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser get() {
        return provideInactiveSurfaceCloser(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        return new androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory(provider);
    }

    public static androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser provideInactiveSurfaceCloser(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser.Bindings.INSTANCE.provideInactiveSurfaceCloser(cameraQuirks));
    }
}
