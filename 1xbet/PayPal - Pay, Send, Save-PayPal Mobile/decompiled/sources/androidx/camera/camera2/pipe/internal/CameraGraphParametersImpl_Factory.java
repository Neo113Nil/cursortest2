package androidx.camera.camera2.pipe.internal;

/* loaded from: classes6.dex */
public final class CameraGraphParametersImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> getHighSpeedVideoFpsRangesFor;

    private CameraGraphParametersImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        return new androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl newInstance(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl(graphSessionLock, graphProcessor, coroutineScope);
    }
}
