package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\b\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "format", "", "Landroid/util/Size;", "getExtraSupportedResolutions", "(I)[Landroid/util/Size;", "T", "Ljava/lang/Class;", "klass", "(Ljava/lang/Class;)[Landroid/util/Size;", "getHighSpeedVideoSizes", "()[Landroid/util/Size;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraSupportedOutputSizeQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.Companion(null);

    public final android.util.Size[] getExtraSupportedResolutions(int format) {
        return (format == 34 && INSTANCE.isMotoE5Play$camera_camera2()) ? getHighSpeedVideoSizes() : new android.util.Size[0];
    }

    public final <T> android.util.Size[] getExtraSupportedResolutions(java.lang.Class<T> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        return (android.hardware.camera2.params.StreamConfigurationMap.isOutputSupportedFor(klass) && INSTANCE.isMotoE5Play$camera_camera2()) ? getHighSpeedVideoSizes() : new android.util.Size[0];
    }

    private static android.util.Size[] getHighSpeedVideoSizes() {
        return new android.util.Size[]{new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, 1080), new android.util.Size(960, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)};
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "isMotoE5Play$camera_camera2", "isMotoE5Play"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isMotoE5Play$camera_camera2();
        }

        public final boolean isMotoE5Play$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isMotorolaDevice() && kotlin.text.StringsKt.equals("moto e5 play", android.os.Build.MODEL, true);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
