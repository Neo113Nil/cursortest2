package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraFactory extends androidx.camera.core.impl.CameraPresenceMonitor {

    public interface Interrogator {
        java.util.List<java.lang.String> getAvailableCameraIds(java.util.List<java.lang.String> list);
    }

    public interface Provider {
        androidx.camera.core.impl.CameraFactory newInstance(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.core.CameraSelector cameraSelector, long j, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) throws androidx.camera.core.InitializationException;
    }

    java.util.Set<java.lang.String> getAvailableCameraIds();

    androidx.camera.core.impl.CameraInternal getCamera(java.lang.String str) throws androidx.camera.core.CameraUnavailableException;

    androidx.camera.core.concurrent.CameraCoordinator getCameraCoordinator();

    java.lang.Object getCameraManager();

    androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> getCameraPresenceSource();

    default void shutdown() {
    }
}
