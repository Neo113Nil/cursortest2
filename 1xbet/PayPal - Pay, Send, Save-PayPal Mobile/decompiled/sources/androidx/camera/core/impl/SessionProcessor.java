package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface SessionProcessor {
    public static final int TYPE_CAMERA2_EXTENSION = 1;
    public static final int TYPE_DEFAULT = 0;

    public interface CaptureSessionRequestProcessor {
        android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeStillCaptureLatency();

        void setExtensionStrength(int i);
    }

    void deInitSession();

    default android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeCaptureLatency() {
        return null;
    }

    androidx.camera.core.impl.SessionConfig initSession(androidx.camera.core.CameraInfo cameraInfo, androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration);

    default void setCaptureSessionRequestProcessor(androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor captureSessionRequestProcessor) {
    }

    default java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewSize(android.util.Size size) {
        return java.util.Collections.emptyMap();
    }

    default java.util.Set<java.lang.Integer> getSupportedCameraOperations() {
        return java.util.Collections.emptySet();
    }

    default java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key, java.lang.Object>> getAvailableCharacteristicsKeyValues() {
        return java.util.Collections.emptyList();
    }

    default android.util.Range<java.lang.Float> getExtensionZoomRange() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key, java.lang.Object> pair : getAvailableCharacteristicsKeyValues()) {
            if (((android.hardware.camera2.CameraCharacteristics.Key) pair.first).equals(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                return (android.util.Range) pair.second;
            }
        }
        return null;
    }

    default int[] getExtensionAvailableStabilizationModes() {
        for (android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key, java.lang.Object> pair : getAvailableCharacteristicsKeyValues()) {
            if (((android.hardware.camera2.CameraCharacteristics.Key) pair.first).equals(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                return (int[]) pair.second;
            }
        }
        return null;
    }

    default android.util.Pair<java.lang.Integer, java.lang.Integer> getImplementationType() {
        return android.util.Pair.create(0, 0);
    }
}
