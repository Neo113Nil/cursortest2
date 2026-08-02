package androidx.camera.video.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewBlackScreenQuirk implements androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk.Companion INSTANCE = new androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk.Companion(null);
    private static final boolean getHighResolutionOutputSizeshNQ4ISI;
    private static final boolean getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk$Companion;", "", "<init>", "()V", "", "load", "()Z", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final boolean load() {
            return androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk.getHighSpeedVideoFpsRangesFor || androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        getHighSpeedVideoFpsRangesFor = kotlin.text.StringsKt.equals(android.os.Build.BRAND, "motorola", true) && kotlin.text.StringsKt.equals(android.os.Build.MODEL, "motorola edge 20 fusion", true);
        getHighResolutionOutputSizeshNQ4ISI = kotlin.text.StringsKt.equals(android.os.Build.BRAND, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, true) && kotlin.text.StringsKt.equals(android.os.Build.MODEL, "sm-t580", true);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return INSTANCE.load();
    }
}
