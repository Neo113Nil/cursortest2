package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraInternal extends androidx.camera.core.Camera, androidx.camera.core.UseCase.StateChangeCallback {
    void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection);

    void close();

    void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection);

    androidx.camera.core.impl.CameraControlInternal getCameraControlInternal();

    androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal();

    androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState();

    default boolean getHasTransform() {
        return true;
    }

    default boolean isRemoved() {
        return false;
    }

    default void onRemoved() {
    }

    void open();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release();

    default void setActiveResumingMode(boolean z) {
    }

    default void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z) {
    }

    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean getHighSpeedVideoFpsRanges;

        State(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
        }
    }

    default boolean isFrontFacing() {
        return getCameraInfo().getLensFacing() == 0;
    }

    @Override // androidx.camera.core.Camera
    default androidx.camera.core.CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    @Override // androidx.camera.core.Camera
    default androidx.camera.core.CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    @Override // androidx.camera.core.Camera
    default androidx.camera.core.impl.CameraConfig getExtendedConfig() {
        return androidx.camera.core.impl.CameraConfigs.defaultConfig();
    }
}
