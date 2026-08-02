package androidx.camera.extensions.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/extensions/internal/compat/quirk/AvoidCaptureProcessProgressAvailabilityCheckQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvoidCaptureProcessProgressAvailabilityCheckQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion INSTANCE = new androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/extensions/internal/compat/quirk/AvoidCaptureProcessProgressAvailabilityCheckQuirk$Companion;", "", "<init>", "()V", "", "load", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final boolean load() {
            return kotlin.text.StringsKt.equals("Xiaomi", android.os.Build.BRAND, true) && kotlin.text.StringsKt.equals("dada", android.os.Build.DEVICE, true);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return INSTANCE.load();
    }
}
