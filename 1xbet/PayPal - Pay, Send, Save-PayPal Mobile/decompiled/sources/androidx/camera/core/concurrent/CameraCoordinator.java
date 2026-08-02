package androidx.camera.core.concurrent;

/* loaded from: classes6.dex */
public interface CameraCoordinator extends androidx.camera.core.impl.InternalCameraPresenceListener {
    public static final int CAMERA_OPERATING_MODE_CONCURRENT = 2;
    public static final int CAMERA_OPERATING_MODE_SINGLE = 1;
    public static final int CAMERA_OPERATING_MODE_UNSPECIFIED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CameraOperatingMode {
    }

    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i, int i2);
    }

    void addListener(androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener);

    default void addPendingCameraInfo(androidx.camera.core.CameraInfo cameraInfo) {
    }

    java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    java.util.List<java.util.List<androidx.camera.core.CameraSelector>> getConcurrentCameraSelectors();

    java.lang.String getPairedConcurrentCameraId(java.lang.String str);

    default void init(androidx.camera.core.impl.CameraRepository cameraRepository) {
    }

    void removeListener(androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener);

    default void removePendingCameraInfo(androidx.camera.core.CameraInfo cameraInfo) {
    }

    void setActiveConcurrentCameraInfos(java.util.List<androidx.camera.core.CameraInfo> list);

    void setCameraOperatingMode(int i);

    void shutdown();
}
