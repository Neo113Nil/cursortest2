package androidx.camera.video.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PrematureEndOfStreamVideoQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "load", "()Z", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrematureEndOfStreamVideoQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final boolean getHighSpeedVideoSizes;
    public static final androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk INSTANCE = new androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk();

    private PrematureEndOfStreamVideoQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return getHighSpeedVideoSizes;
    }

    static {
        getHighSpeedVideoSizes = kotlin.text.StringsKt.equals("OPPO", android.os.Build.BRAND, true) && kotlin.text.StringsKt.equals("CPH1931", android.os.Build.MODEL, true);
    }
}
