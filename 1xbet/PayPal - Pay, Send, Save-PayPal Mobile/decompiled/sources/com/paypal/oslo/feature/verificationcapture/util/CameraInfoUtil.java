package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/CameraInfoUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/MediaDeviceInfo;", "enumerateCameras", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/hardware/camera2/CameraManager;", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/MediaDeviceInfo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraInfoUtil {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.util.CameraInfoUtil INSTANCE = new com.paypal.oslo.feature.verificationcapture.util.CameraInfoUtil();

    private CameraInfoUtil() {
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo> enumerateCameras(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        android.hardware.camera2.CameraManager cameraManager = systemService instanceof android.hardware.camera2.CameraManager ? (android.hardware.camera2.CameraManager) systemService : null;
        if (cameraManager == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        try {
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : cameraIdList) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(cameraManager, str);
                if (highSpeedVideoFpsRangesFor != null) {
                    arrayList.add(highSpeedVideoFpsRangesFor);
                }
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[CameraInfoUtil] Failed to enumerate cameras", e);
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f1, blocks: (B:3:0x0003, B:6:0x0017, B:9:0x003a, B:14:0x0079, B:16:0x0083, B:18:0x008d, B:21:0x0091, B:25:0x00bc, B:27:0x00e4, B:32:0x009a, B:34:0x00a5, B:38:0x00b6, B:43:0x004f, B:46:0x0053, B:54:0x006a, B:56:0x0021, B:61:0x002c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo getHighSpeedVideoFpsRangesFor(android.hardware.camera2.CameraManager p0, java.lang.String p1) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        android.util.Size size;
        java.lang.String str3;
        try {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = p0.getCameraCharacteristics(p1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "");
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            int i = 1;
            if (num != null && num.intValue() == 0) {
                str2 = "front";
            } else {
                if (num == null || num.intValue() != 1) {
                    str = (num == null || num.intValue() != 2) ? "unknown" : com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL;
                } else {
                    str = "back";
                }
                str2 = str;
            }
            float[] fArr = (float[]) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "front")) {
                obj = "Front-facing";
            } else {
                if (fArr != null && fArr.length != 0) {
                    float f = fArr[0];
                    if (f < 3.0f) {
                        obj = "Ultra-wide";
                    } else if (f < 6.0f) {
                        obj = "Wide";
                    } else {
                        obj = "Telephoto";
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera ");
                sb.append(p1);
                obj = sb.toString();
            }
            java.lang.String str4 = obj;
            android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            android.util.Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(256) : null;
            if (outputSizes != null && outputSizes.length != 0) {
                size = outputSizes[0];
                int lastIndex = kotlin.collections.ArraysKt.getLastIndex(outputSizes);
                if (lastIndex != 0) {
                    int width = size.getWidth() * size.getHeight();
                    if (lastIndex > 0) {
                        while (true) {
                            android.util.Size size2 = outputSizes[i];
                            int width2 = size2.getWidth() * size2.getHeight();
                            if (width < width2) {
                                size = size2;
                                width = width2;
                            }
                            if (i == lastIndex) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (size == null) {
                    int width3 = size.getWidth();
                    int height = size.getHeight();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("videoinput ");
                    sb2.append(width3);
                    sb2.append("x");
                    sb2.append(height);
                    str3 = sb2.toString();
                } else {
                    str3 = "videoinput";
                }
                java.lang.String str5 = str3;
                java.lang.String str6 = android.os.Build.MANUFACTURER;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                return new com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo(p1, str6, str5, str4, str2);
            }
            size = null;
            if (size == null) {
            }
            java.lang.String str52 = str3;
            java.lang.String str62 = android.os.Build.MANUFACTURER;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str62, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo(p1, str62, str52, str4, str2);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[CameraInfoUtil] Failed to get camera info", e);
            return null;
        }
    }
}
