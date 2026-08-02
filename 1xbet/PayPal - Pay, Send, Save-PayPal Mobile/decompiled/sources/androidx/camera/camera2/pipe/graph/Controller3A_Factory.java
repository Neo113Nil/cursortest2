package androidx.camera.camera2.pipe.graph;

/* loaded from: classes6.dex */
public final class Controller3A_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.Controller3A> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphState3A> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoSizes;

    private Controller3A_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphState3A> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.Controller3A get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.graph.Controller3A_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphState3A> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> provider4) {
        return new androidx.camera.camera2.pipe.graph.Controller3A_Factory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.pipe.graph.Controller3A newInstance(androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.graph.GraphState3A graphState3A, androidx.camera.camera2.pipe.graph.Listener3A listener3A) {
        return new androidx.camera.camera2.pipe.graph.Controller3A(graphProcessor, cameraMetadata, graphState3A, listener3A);
    }
}
