package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class CameraTools {
    public static int getDeviceOrientation(android.content.Context context, android.hardware.Camera.CameraInfo cameraInfo) {
        int imageOrientation = getImageOrientation(context, cameraInfo);
        return cameraInfo.facing == 1 ? (360 - imageOrientation) % 360 : imageOrientation;
    }

    public static int getImageOrientation(android.content.Context context) {
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        for (int i = 0; i < numberOfCameras; i++) {
            android.hardware.Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 1) {
                return getImageOrientation(context, cameraInfo);
            }
        }
        return 270;
    }

    private static java.lang.Integer Camera2StreamConfigurationMap(android.content.Context context, boolean z) {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        if (cameraManager == null) {
            return null;
        }
        try {
            for (java.lang.String str : cameraManager.getCameraIdList()) {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == (!z)) {
                    return (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.Integer getHardwareSupportLevel(android.content.Context context, boolean z) {
        return Camera2StreamConfigurationMap(context, z);
    }

    private static java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, boolean z) {
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        if (cameraManager == null) {
            return null;
        }
        try {
            for (java.lang.String str : cameraManager.getCameraIdList()) {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == (!z)) {
                    return (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.Integer getSensorOrientation(android.content.Context context, boolean z) {
        return getHighResolutionOutputSizeshNQ4ISI(context, z);
    }

    public static int getDeviceOrientation(int i) {
        return (360 - i) % 360;
    }

    public static int getImageOrientation(android.content.Context context, boolean z) {
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        for (int i = 0; i < numberOfCameras; i++) {
            android.hardware.Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == z) {
                return getImageOrientation(context, cameraInfo);
            }
        }
        return 270;
    }

    public static int getImageOrientation(android.content.Context context, android.hardware.Camera.CameraInfo cameraInfo) {
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        int rotation;
        if (cameraInfo != null) {
            int i = 0;
            if (context != null && (windowManager = (android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && (rotation = defaultDisplay.getRotation()) != 0) {
                if (rotation == 1) {
                    i = 90;
                } else if (rotation == 2) {
                    i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
                } else if (rotation == 3) {
                    i = 270;
                }
            }
            if (cameraInfo.facing == 1) {
                return (cameraInfo.orientation + i) % 360;
            }
            return ((cameraInfo.orientation - i) + 360) % 360;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
