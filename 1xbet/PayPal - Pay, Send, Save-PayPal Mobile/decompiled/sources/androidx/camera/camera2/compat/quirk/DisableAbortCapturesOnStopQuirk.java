package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DisableAbortCapturesOnStopQuirk implements androidx.camera.core.impl.Quirk {
    private static final boolean Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.Companion(null);
    private static final boolean getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final boolean isEnabled() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isTecnoDevice() || androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.Camera2StreamConfigurationMap || androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        boolean z = false;
        Camera2StreamConfigurationMap = androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("d2q", android.os.Build.DEVICE, true);
        if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isPocoDevice() && kotlin.text.StringsKt.equals("M2102J20SG", android.os.Build.MODEL, true)) {
            z = true;
        }
        getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEnabled() {
        return INSTANCE.isEnabled();
    }
}
