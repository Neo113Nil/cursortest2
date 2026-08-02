package androidx.camera.camera2.pipe.internal;

/* loaded from: classes6.dex */
public final class CameraGraphRequestListenersImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRangesFor;

    private CameraGraphRequestListenersImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        return new androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl newInstance(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl(graphSessionLock, graphProcessor, coroutineScope);
    }
}
