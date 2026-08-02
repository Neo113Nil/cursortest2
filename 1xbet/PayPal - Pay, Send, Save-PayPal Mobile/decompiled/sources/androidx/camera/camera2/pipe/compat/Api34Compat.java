package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\""}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api34Compat;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "extensionCharacteristics", "", "extension", "", "isPostviewAvailable", "(Landroid/hardware/camera2/CameraExtensionCharacteristics;I)Z", "isCaptureProcessProgressAvailable", "Landroid/util/Size;", "captureSize", "format", "", "getPostviewSupportedSizes", "(Landroid/hardware/camera2/CameraExtensionCharacteristics;ILandroid/util/Size;I)Ljava/util/List;", "Landroid/hardware/camera2/params/ExtensionSessionConfiguration;", "extensionSessionConfiguration", "Landroid/hardware/camera2/params/OutputConfiguration;", "postviewOutputConfiguration", "", "setPostviewOutputConfiguration", "(Landroid/hardware/camera2/params/ExtensionSessionConfiguration;Landroid/hardware/camera2/params/OutputConfiguration;)V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "isZoomOverrideSupported", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "Landroid/hardware/camera2/params/SessionConfiguration;", "sessionConfiguration", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "setColorSpace", "(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/graphics/ColorSpace$Named;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api34Compat {
    public static final androidx.camera.camera2.pipe.compat.Api34Compat INSTANCE = new androidx.camera.camera2.pipe.compat.Api34Compat();

    private Api34Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isPostviewAvailable(android.hardware.camera2.CameraExtensionCharacteristics extensionCharacteristics, int extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionCharacteristics, "");
        return extensionCharacteristics.isPostviewAvailable(extension);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isCaptureProcessProgressAvailable(android.hardware.camera2.CameraExtensionCharacteristics extensionCharacteristics, int extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionCharacteristics, "");
        return extensionCharacteristics.isCaptureProcessProgressAvailable(extension);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<android.util.Size> getPostviewSupportedSizes(android.hardware.camera2.CameraExtensionCharacteristics extensionCharacteristics, int extension, android.util.Size captureSize, int format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionCharacteristics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSize, "");
        java.util.List<android.util.Size> postviewSupportedSizes = extensionCharacteristics.getPostviewSupportedSizes(extension, captureSize, format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(postviewSupportedSizes, "");
        return postviewSupportedSizes;
    }

    @kotlin.jvm.JvmStatic
    public static final void setPostviewOutputConfiguration(android.hardware.camera2.params.ExtensionSessionConfiguration extensionSessionConfiguration, android.hardware.camera2.params.OutputConfiguration postviewOutputConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionSessionConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postviewOutputConfiguration, "");
        extensionSessionConfiguration.setPostviewOutputConfiguration(postviewOutputConfiguration);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isZoomOverrideSupported(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        int[] iArr = (int[]) cameraMetadata.get(key);
        return iArr != null && kotlin.collections.ArraysKt.contains(iArr, 1);
    }

    @kotlin.jvm.JvmStatic
    public static final void setColorSpace(android.hardware.camera2.params.SessionConfiguration sessionConfiguration, android.graphics.ColorSpace.Named colorSpace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorSpace, "");
        sessionConfiguration.setColorSpace(colorSpace);
    }
}
