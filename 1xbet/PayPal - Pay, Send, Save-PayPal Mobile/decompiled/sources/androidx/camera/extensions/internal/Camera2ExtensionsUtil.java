package androidx.camera.extensions.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsUtil;", "", "<init>", "()V", "", "cameraXMode", "convertCameraXModeToCamera2Mode", "(I)I", "camera2Mode", "convertCamera2ModeToCameraXMode", "(I)Ljava/lang/Integer;", "Landroid/content/Context;", "applicationContext", "", "", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "createCameraId2CameraExtensionCharacteristicsMap", "(Landroid/content/Context;)Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ExtensionsUtil {
    public static final androidx.camera.extensions.internal.Camera2ExtensionsUtil INSTANCE = new androidx.camera.extensions.internal.Camera2ExtensionsUtil();

    private Camera2ExtensionsUtil() {
    }

    public final int convertCameraXModeToCamera2Mode(int cameraXMode) {
        if (cameraXMode == 1) {
            return 2;
        }
        if (cameraXMode == 2) {
            return 3;
        }
        if (cameraXMode == 3) {
            return 4;
        }
        if (cameraXMode == 4) {
            return 1;
        }
        if (cameraXMode == 5) {
            return 0;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unavailable CameraX extension mode (");
        sb.append(cameraXMode);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.lang.Integer convertCamera2ModeToCameraXMode(int camera2Mode) {
        if (camera2Mode == 0) {
            return 5;
        }
        if (camera2Mode == 1) {
            return 4;
        }
        if (camera2Mode == 2) {
            return 1;
        }
        if (camera2Mode != 3) {
            return camera2Mode != 4 ? null : 3;
        }
        return 2;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, android.hardware.camera2.CameraExtensionCharacteristics> createCameraId2CameraExtensionCharacteristicsMap(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) applicationContext.getSystemService(android.hardware.camera2.CameraManager.class);
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            for (java.lang.String str : cameraIdList) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                android.hardware.camera2.CameraExtensionCharacteristics cameraExtensionCharacteristics = cameraManager.getCameraExtensionCharacteristics(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraExtensionCharacteristics, "");
                linkedHashMap.put(str, cameraExtensionCharacteristics);
            }
            return linkedHashMap;
        } catch (android.hardware.camera2.CameraAccessException e) {
            return linkedHashMap;
        }
    }
}
