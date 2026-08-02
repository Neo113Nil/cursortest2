package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class UseCaseSurfaceManager_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.UseCaseSurfaceManager> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> getHighSpeedVideoSizes;

    private UseCaseSurfaceManager_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider2, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser> provider3, dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.UseCaseSurfaceManager get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.impl.UseCaseSurfaceManager_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider2, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser> provider3, dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> provider4) {
        return new androidx.camera.camera2.impl.UseCaseSurfaceManager_Factory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.impl.UseCaseSurfaceManager newInstance(androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser inactiveSurfaceCloser, androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter) {
        return new androidx.camera.camera2.impl.UseCaseSurfaceManager(useCaseThreads, cameraPipe, inactiveSurfaceCloser, sessionConfigAdapter);
    }
}
