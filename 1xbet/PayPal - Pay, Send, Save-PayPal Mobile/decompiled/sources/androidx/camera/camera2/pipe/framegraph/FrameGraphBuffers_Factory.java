package androidx.camera.camera2.pipe.framegraph;

/* loaded from: classes6.dex */
public final class FrameGraphBuffers_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRanges;

    private FrameGraphBuffers_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers newInstance(androidx.camera.camera2.pipe.CameraGraph cameraGraph, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers(cameraGraph, coroutineScope);
    }
}
