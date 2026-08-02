package androidx.camera.extensions.internal;

/* loaded from: classes6.dex */
public interface VendorExtender {
    default androidx.camera.core.impl.SessionProcessor createSessionProcessor(android.content.Context context) {
        return null;
    }

    default android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRange(android.util.Size size) {
        return null;
    }

    default void init(androidx.camera.core.CameraInfo cameraInfo) {
    }

    default boolean isCaptureProcessProgressAvailable() {
        return false;
    }

    default boolean isCurrentExtensionModeAvailable() {
        return false;
    }

    default boolean isExtensionAvailable(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map) {
        return false;
    }

    default boolean isExtensionStrengthAvailable() {
        return false;
    }

    default boolean isPostviewAvailable() {
        return false;
    }

    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedPreviewOutputResolutions() {
        return java.util.Collections.emptyList();
    }

    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedCaptureOutputResolutions() {
        return java.util.Collections.emptyList();
    }

    default android.util.Size[] getSupportedYuvAnalysisResolutions() {
        return new android.util.Size[0];
    }

    default java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewResolutions(android.util.Size size) {
        return java.util.Collections.emptyMap();
    }

    default java.util.List<android.hardware.camera2.CaptureResult.Key> getSupportedCaptureResultKeys() {
        return java.util.Collections.emptyList();
    }

    default java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key, java.lang.Object>> getAvailableCharacteristicsKeyValues() {
        return java.util.Collections.emptyList();
    }
}
