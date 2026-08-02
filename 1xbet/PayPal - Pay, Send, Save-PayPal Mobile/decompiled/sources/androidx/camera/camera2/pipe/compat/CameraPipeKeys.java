package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraPipeKeys;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/Metadata$Key;", "", "camera2ExtensionMode", "Landroidx/camera/camera2/pipe/Metadata$Key;", "getCamera2ExtensionMode", "()Landroidx/camera/camera2/pipe/Metadata$Key;", "camera2CaptureRequestTag", "getCamera2CaptureRequestTag", "", "ignore3ARequiredParameters", "getIgnore3ARequiredParameters", "CAMERA2_EXTENSION_MODE_AUTOMATIC", com.visa.cbp.getEncExpo.warmup, "CAMERA2_EXTENSION_MODE_FACE_RETOUCH", "CAMERA2_EXTENSION_MODE_BOKEH", "CAMERA2_EXTENSION_MODE_HDR", "CAMERA2_EXTENSION_MODE_NIGHT"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraPipeKeys {
    public static final int CAMERA2_EXTENSION_MODE_AUTOMATIC = 0;
    public static final int CAMERA2_EXTENSION_MODE_BOKEH = 2;
    public static final int CAMERA2_EXTENSION_MODE_FACE_RETOUCH = 1;
    public static final int CAMERA2_EXTENSION_MODE_HDR = 3;
    public static final int CAMERA2_EXTENSION_MODE_NIGHT = 4;
    public static final androidx.camera.camera2.pipe.compat.CameraPipeKeys INSTANCE = new androidx.camera.camera2.pipe.compat.CameraPipeKeys();
    private static final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Integer> camera2ExtensionMode = androidx.camera.camera2.pipe.Metadata.Key.INSTANCE.create("androidx.camera.camera2.pipe.extensionMode", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class));
    private static final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Object> camera2CaptureRequestTag = androidx.camera.camera2.pipe.Metadata.Key.INSTANCE.create("androidx.camera.camera2.pipe.captureRequestTag", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    private static final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Boolean> ignore3ARequiredParameters = androidx.camera.camera2.pipe.Metadata.Key.INSTANCE.create("androidx.camera.camera2.pipe.ignore3ARequiredParameters", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class));

    private CameraPipeKeys() {
    }

    public final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Integer> getCamera2ExtensionMode() {
        return camera2ExtensionMode;
    }

    public final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Object> getCamera2CaptureRequestTag() {
        return camera2CaptureRequestTag;
    }

    public final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Boolean> getIgnore3ARequiredParameters() {
        return ignore3ARequiredParameters;
    }
}
