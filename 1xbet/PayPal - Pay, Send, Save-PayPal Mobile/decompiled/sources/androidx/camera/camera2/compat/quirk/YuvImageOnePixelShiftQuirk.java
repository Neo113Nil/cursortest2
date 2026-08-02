package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk;", "Landroidx/camera/core/internal/compat/quirk/OnePixelShiftQuirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class YuvImageOnePixelShiftQuirk implements androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/YuvImageOnePixelShiftQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isMotorolaDevice() && kotlin.text.StringsKt.equals("MotoG3", android.os.Build.MODEL, true)) || (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("SM-G532F", android.os.Build.MODEL, true)) || ((androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("SM-J700F", android.os.Build.MODEL, true)) || ((androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("SM-A920F", android.os.Build.MODEL, true)) || ((androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("SM-J415F", android.os.Build.MODEL, true)) || (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isXiaomiDevice() && kotlin.text.StringsKt.equals("Mi A1", android.os.Build.MODEL, true)))));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
