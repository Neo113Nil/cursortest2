package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class e implements com.iovation.mobile.android.a.h {
    public static java.lang.String d(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
        int length = cameraManager.getCameraIdList().length;
        java.lang.String str = "{";
        for (int i = 0; i < length; i++) {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraManager.getCameraIdList()[i]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "");
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 3)) {
                java.lang.String valueOf = java.lang.String.valueOf(cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1));
                if (!kotlin.jvm.internal.Intrinsics.areEqual(valueOf, "null")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append('\'');
                    sb.append(i);
                    sb.append("':'");
                    sb.append(valueOf);
                    sb.append("';");
                    str = sb.toString();
                }
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "{")) {
            return "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!com.iovation.mobile.android.d.a.a("android.permission.CAMERA", context)) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            linkedHashMap.put("ACAT", d(context));
        } catch (java.lang.Exception unused) {
        }
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "9adf7a";
    }
}
