package androidx.camera.extensions.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsInfoProvider;", "", "", "cameraId", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "getExtensionCharacteristics", "(Ljava/lang/String;)Landroid/hardware/camera2/CameraExtensionCharacteristics;", "", "mode", "", "isExtensionAvailable", "(Ljava/lang/String;I)Z", "format", "", "Landroid/util/Size;", "getSupportedOutputSizes", "(Ljava/lang/String;II)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Camera2ExtensionsInfoProvider {
    android.hardware.camera2.CameraExtensionCharacteristics getExtensionCharacteristics(java.lang.String cameraId);

    java.util.List<android.util.Size> getSupportedOutputSizes(java.lang.String cameraId, int mode, int format);

    boolean isExtensionAvailable(java.lang.String cameraId, int mode);
}
