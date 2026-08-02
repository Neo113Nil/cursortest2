package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class n {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
    
        if (r11.contains(1) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.camera.core.Camera camera) {
        boolean z;
        java.lang.Float f;
        java.lang.Integer num;
        android.graphics.Rect rect;
        int[] iArr;
        int i;
        androidx.camera.camera2.interop.Camera2CameraInfo from = androidx.camera.camera2.interop.Camera2CameraInfo.from(camera.getCameraInfo());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        java.lang.Integer num2 = (java.lang.Integer) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        boolean z2 = true;
        java.lang.String str = "not_found";
        java.lang.String str2 = num2 == null ? "null" : num2.intValue() == 0 ? "limited" : num2.intValue() == 2 ? "legacy" : num2.intValue() == 1 ? a.b.m : num2.intValue() == 4 ? com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL : num2.intValue() == 3 ? "level_3" : "not_found";
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        int[] iArr2 = (int[]) from.getCameraCharacteristic(key);
        int[] iArr3 = (int[]) from.getCameraCharacteristic(key);
        if (iArr3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 : iArr3) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
            if (arrayList.contains(1)) {
                z = true;
                f = (java.lang.Float) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
                num = (java.lang.Integer) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                if (num != null) {
                    str = null;
                } else if (num.intValue() == 0) {
                    str = "uncalibrated";
                } else if (num.intValue() == 1) {
                    str = "approximate";
                } else if (num.intValue() == 2) {
                    str = "calibrated";
                }
                rect = (android.graphics.Rect) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                iArr = (int[]) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                if (iArr != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i3 : iArr) {
                        arrayList2.add(java.lang.Integer.valueOf(i3));
                    }
                }
                z2 = false;
                i = (java.lang.Integer) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                java.lang.String str3 = android.os.Build.VERSION.SDK_INT < 28 ? (java.lang.String) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.INFO_VERSION) : "not_supplied_sdk_28+_only";
                com.dyneti.android.dyscan.b bVar = new com.dyneti.android.dyscan.b();
                bVar.f3291a = str2;
                if (iArr2 == null) {
                    iArr2 = new int[0];
                }
                bVar.i = iArr2;
                bVar.b = z;
                if (f == null) {
                    f = java.lang.Float.valueOf(0.0f);
                }
                bVar.c = f;
                if (str == null) {
                    str = "";
                }
                bVar.d = str;
                if (rect == null) {
                    rect = new android.graphics.Rect();
                }
                bVar.e = rect;
                bVar.f = z2;
                if (i == null) {
                    i = 0;
                }
                bVar.g = i;
                bVar.h = str3 != null ? str3 : "";
                bVar.j = com.dyneti.android.dyscan.t.m;
                bVar.k = com.dyneti.android.dyscan.t.n;
                bVar.l = com.dyneti.android.dyscan.t.f3339o;
                com.dyneti.android.dyscan.t.l = bVar;
            }
        }
        z = false;
        f = (java.lang.Float) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        num = (java.lang.Integer) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
        if (num != null) {
        }
        rect = (android.graphics.Rect) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        iArr = (int[]) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
        }
        z2 = false;
        i = (java.lang.Integer) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (android.os.Build.VERSION.SDK_INT < 28) {
        }
        com.dyneti.android.dyscan.b bVar2 = new com.dyneti.android.dyscan.b();
        bVar2.f3291a = str2;
        if (iArr2 == null) {
        }
        bVar2.i = iArr2;
        bVar2.b = z;
        if (f == null) {
        }
        bVar2.c = f;
        if (str == null) {
        }
        bVar2.d = str;
        if (rect == null) {
        }
        bVar2.e = rect;
        bVar2.f = z2;
        if (i == null) {
        }
        bVar2.g = i;
        bVar2.h = str3 != null ? str3 : "";
        bVar2.j = com.dyneti.android.dyscan.t.m;
        bVar2.k = com.dyneti.android.dyscan.t.n;
        bVar2.l = com.dyneti.android.dyscan.t.f3339o;
        com.dyneti.android.dyscan.t.l = bVar2;
    }
}
