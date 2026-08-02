package androidx.camera.core;

/* loaded from: classes.dex */
public interface CameraInfo {
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final java.lang.String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final java.lang.String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";
    public static final float INTRINSIC_ZOOM_RATIO_UNKNOWN = 1.0f;
    public static final int TORCH_STRENGTH_LEVEL_UNSUPPORTED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ImplementationType {
    }

    default void addCameraStateListener(java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.core.CameraState> consumer) {
    }

    default androidx.camera.core.CameraIdentifier getCameraIdentifier() {
        return null;
    }

    androidx.camera.core.CameraSelector getCameraSelector();

    androidx.view.LiveData<androidx.camera.core.CameraState> getCameraState();

    androidx.camera.core.ExposureState getExposureState();

    java.lang.String getImplementationType();

    default float getIntrinsicZoomRatio() {
        return 1.0f;
    }

    default int getLensFacing() {
        return -1;
    }

    default int getMaxTorchStrengthLevel() {
        return 0;
    }

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i);

    androidx.view.LiveData<java.lang.Integer> getTorchState();

    androidx.view.LiveData<androidx.camera.core.ZoomState> getZoomState();

    boolean hasFlashUnit();

    default boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return false;
    }

    default boolean isLogicalMultiCameraSupported() {
        return false;
    }

    default boolean isLowLightBoostSupported() {
        return false;
    }

    default boolean isPrivateReprocessingSupported() {
        return false;
    }

    default boolean isSessionConfigSupported(androidx.camera.core.SessionConfig sessionConfig) {
        return false;
    }

    default boolean isTorchStrengthSupported() {
        return false;
    }

    default boolean isZslSupported() {
        return false;
    }

    default void removeCameraStateListener(androidx.core.util.Consumer<androidx.camera.core.CameraState> consumer) {
    }

    static boolean mustPlayShutterSound() {
        return androidx.camera.core.internal.compat.MediaActionSoundCompat.mustPlayShutterSound();
    }

    default java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
        return java.util.Collections.emptySet();
    }

    default java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges(androidx.camera.core.SessionConfig sessionConfig) {
        return java.util.Collections.emptySet();
    }

    default java.util.Set<androidx.camera.core.DynamicRange> querySupportedDynamicRanges(java.util.Set<androidx.camera.core.DynamicRange> set) {
        return androidx.camera.core.impl.DynamicRanges.findAllPossibleMatches(set, java.util.Collections.singleton(androidx.camera.core.DynamicRange.SDR));
    }

    default java.util.Set<androidx.camera.core.CameraInfo> getPhysicalCameraInfos() {
        return java.util.Collections.emptySet();
    }

    default androidx.view.LiveData<java.lang.Integer> getTorchStrengthLevel() {
        return new androidx.view.MutableLiveData(0);
    }

    default androidx.view.LiveData<java.lang.Integer> getLowLightBoostState() {
        return new androidx.view.MutableLiveData(-1);
    }
}
