package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk;", "Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;", "<init>", "()V", "Landroidx/core/backported/fixes/KnownIssue;", "getKnownIssue", "()Landroidx/core/backported/fixes/KnownIssue;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PixelJpegRSupportedQuirk extends androidx.camera.core.internal.compat.quirk.BackportedFixQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.Companion(null);

    @Override // androidx.camera.core.internal.compat.quirk.BackportedFixQuirk
    public final androidx.core.backported.fixes.KnownIssue getKnownIssue() {
        return androidx.core.backported.fixes.KnownIssues.KI_398591036;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PixelJpegRSupportedQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final boolean isEnabled() {
            return android.os.Build.VERSION.SDK_INT >= 34 && new androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk().hasIssue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEnabled() {
        return INSTANCE.isEnabled();
    }
}
