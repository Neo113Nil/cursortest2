package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0004\u001a/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u0004\u0018\u00010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\"\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/CameraMetadata;", "", "preferredMode", "getSupportedAfMode", "(Landroidx/camera/camera2/pipe/CameraMetadata;I)I", "getSupportedAeMode", "", "isExternalFlashAeModeSupported", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "getSupportedAwbMode", "T", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "key", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "getAvailableAfModes", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Ljava/util/List;", "availableAfModes", "getAvailableAeModes", "availableAeModes", "getAvailableAwbModes", "availableAwbModes"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraMetadataIntegrationKt {
    public static final java.util.List<java.lang.Integer> getAvailableAfModes(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object orDefault = cameraMetadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key, (android.hardware.camera2.CameraCharacteristics.Key) new int[]{0});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(orDefault, "");
        return kotlin.collections.ArraysKt.asList((int[]) orDefault);
    }

    public static final java.util.List<java.lang.Integer> getAvailableAeModes(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object orDefault = cameraMetadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key, (android.hardware.camera2.CameraCharacteristics.Key) new int[]{0});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(orDefault, "");
        return kotlin.collections.ArraysKt.asList((int[]) orDefault);
    }

    public static final java.util.List<java.lang.Integer> getAvailableAwbModes(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object orDefault = cameraMetadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key, (android.hardware.camera2.CameraCharacteristics.Key) new int[]{0});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(orDefault, "");
        return kotlin.collections.ArraysKt.asList((int[]) orDefault);
    }

    public static final int getSupportedAfMode(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        if (getAvailableAfModes(cameraMetadata).contains(java.lang.Integer.valueOf(i))) {
            return i;
        }
        if (getAvailableAfModes(cameraMetadata).contains(4)) {
            return 4;
        }
        return getAvailableAfModes(cameraMetadata).contains(1) ? 1 : 0;
    }

    public static final int getSupportedAeMode(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        return getAvailableAeModes(cameraMetadata).contains(java.lang.Integer.valueOf(i)) ? i : getAvailableAeModes(cameraMetadata).contains(1) ? 1 : 0;
    }

    public static final boolean isExternalFlashAeModeSupported(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        return android.os.Build.VERSION.SDK_INT >= 28 && getSupportedAeMode(cameraMetadata, 5) == 5;
    }

    public static final int getSupportedAwbMode(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        return getAvailableAwbModes(cameraMetadata).contains(java.lang.Integer.valueOf(i)) ? i : getAvailableAwbModes(cameraMetadata).contains(1) ? 1 : 0;
    }

    public static final <T> T getOrDefault(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, android.hardware.camera2.CameraCharacteristics.Key<T> key, T t) {
        T t2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (cameraMetadata == null || (t2 = (T) cameraMetadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key<T>>) key, (android.hardware.camera2.CameraCharacteristics.Key<T>) t)) == null) ? t : t2;
    }
}
