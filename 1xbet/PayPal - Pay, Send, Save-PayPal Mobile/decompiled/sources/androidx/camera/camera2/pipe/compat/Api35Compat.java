package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0018\u00010\u00142\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api35Compat;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isTorchStrengthSupported", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "", "getDefaultTorchStrengthLevel", "(Landroidx/camera/camera2/pipe/CameraMetadata;)I", "getMaxTorchStrengthLevel", "format", "Landroid/util/Size;", "surfaceSize", "Landroid/hardware/camera2/params/OutputConfiguration;", "newImageReaderOutputConfiguration", "(ILandroid/util/Size;)Landroid/hardware/camera2/params/OutputConfiguration;", "sessionType", "", "outputs", "Landroid/hardware/camera2/params/SessionConfiguration;", "newSessionConfiguration", "(ILjava/util/List;)Landroid/hardware/camera2/params/SessionConfiguration;", "Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "cameraDeviceSetup", "templateType", "Landroid/hardware/camera2/CaptureRequest$Builder;", "createCaptureRequest", "(Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;I)Landroid/hardware/camera2/CaptureRequest$Builder;", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "getAvailableSessionCharacteristicsKeys", "(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api35Compat {
    public static final androidx.camera.camera2.pipe.compat.Api35Compat INSTANCE = new androidx.camera.camera2.pipe.compat.Api35Compat();

    private Api35Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isTorchStrengthSupported(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
        return num != null && num.intValue() > 1;
    }

    @kotlin.jvm.JvmStatic
    public static final int getDefaultTorchStrengthLevel(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @kotlin.jvm.JvmStatic
    public static final int getMaxTorchStrengthLevel(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @kotlin.jvm.JvmStatic
    public static final android.hardware.camera2.params.OutputConfiguration newImageReaderOutputConfiguration(int format, android.util.Size surfaceSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSize, "");
        return new android.hardware.camera2.params.OutputConfiguration(format, surfaceSize);
    }

    @kotlin.jvm.JvmStatic
    public static final android.hardware.camera2.params.SessionConfiguration newSessionConfiguration(int sessionType, java.util.List<android.hardware.camera2.params.OutputConfiguration> outputs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputs, "");
        return new android.hardware.camera2.params.SessionConfiguration(sessionType, outputs);
    }

    @kotlin.jvm.JvmStatic
    public static final android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(android.hardware.camera2.CameraDevice.CameraDeviceSetup cameraDeviceSetup, int templateType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDeviceSetup, "");
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = cameraDeviceSetup.createCaptureRequest(templateType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createCaptureRequest, "");
        return createCaptureRequest;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<android.hardware.camera2.CameraCharacteristics.Key<?>> getAvailableSessionCharacteristicsKeys(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }
}
