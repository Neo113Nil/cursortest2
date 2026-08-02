package androidx.camera.extensions.internal;

/* loaded from: classes6.dex */
public class ExtensionsUtils {
    private ExtensionsUtils() {
    }

    public static java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getCameraCharacteristicsMap(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        java.util.Set<java.lang.String> highSpeedVideoSizes;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = (android.hardware.camera2.CameraCharacteristics) cameraInfoInternal.getCameraCharacteristics();
        linkedHashMap.put(cameraId, cameraCharacteristics);
        if (android.os.Build.VERSION.SDK_INT >= 28 && (highSpeedVideoSizes = androidx.camera.extensions.internal.ExtensionsUtils.Api28Impl.getHighSpeedVideoSizes(cameraCharacteristics)) != null) {
            for (java.lang.String str : highSpeedVideoSizes) {
                if (!java.util.Objects.equals(str, cameraId)) {
                    linkedHashMap.put(str, (android.hardware.camera2.CameraCharacteristics) cameraInfoInternal.getPhysicalCameraCharacteristics(str));
                }
            }
        }
        return linkedHashMap;
    }

    public static java.util.Set<java.lang.Integer> getSupportedCameraOperations(java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO) || list.contains(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(java.util.Arrays.asList(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, android.hardware.camera2.CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && list.contains(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH)) {
            hashSet.add(8);
        }
        return hashSet;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.util.Set<java.lang.String> getHighSpeedVideoSizes(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (java.lang.Exception unused) {
                return java.util.Collections.emptySet();
            }
        }
    }
}
