package androidx.camera.video.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/GLProcessingStuckOnCodecFlushQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "load", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GLProcessingStuckOnCodecFlushQuirk implements androidx.camera.core.impl.Quirk {
    public static final androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk INSTANCE = new androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk();

    private GLProcessingStuckOnCodecFlushQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return kotlin.text.StringsKt.equals("positivo", android.os.Build.BRAND, true) && kotlin.text.StringsKt.equals("twist 2 pro", android.os.Build.MODEL, true);
    }
}
