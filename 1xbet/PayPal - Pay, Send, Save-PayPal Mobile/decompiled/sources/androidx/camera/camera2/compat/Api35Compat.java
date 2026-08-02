package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/compat/Api35Compat;", "", "<init>", "()V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "parameters", "", "level", "", "setFlashStrengthLevel", "(Ljava/util/Map;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api35Compat {
    public static final androidx.camera.camera2.compat.Api35Compat INSTANCE = new androidx.camera.camera2.compat.Api35Compat();

    private Api35Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final void setFlashStrengthLevel(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> parameters, int level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        parameters.put(android.hardware.camera2.CaptureRequest.FLASH_STRENGTH_LEVEL, java.lang.Integer.valueOf(level));
    }
}
