package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "Landroidx/camera/core/impl/Quirk;", "", "workaroundByCaptureIntentPreview", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CaptureIntentPreviewQuirk extends androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.Companion INSTANCE = androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.Companion.getHighSpeedVideoFpsRangesFor;

    default boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean workaroundByCaptureIntentPreview(androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk captureIntentPreviewQuirk) {
            return androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.super.workaroundByCaptureIntentPreview();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/Quirks;", "quirks", "", "workaroundByCaptureIntentPreview", "(Landroidx/camera/core/impl/Quirks;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.Companion getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.Companion();

        private Companion() {
        }

        public final boolean workaroundByCaptureIntentPreview(androidx.camera.core.impl.Quirks quirks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
            java.util.Iterator it = quirks.getAll(androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.class).iterator();
            while (it.hasNext()) {
                if (((androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                    return true;
                }
            }
            return false;
        }
    }
}
