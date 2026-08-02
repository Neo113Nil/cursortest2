package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "", "workaroundByCaptureIntentPreview", "()Z", "workaroundBySurfaceProcessing", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk, androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFailedWhenVideoCaptureIsBoundQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$isSamsungA53(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return getHighSpeedVideoFpsRangesFor();
        }

        public static final /* synthetic */ boolean access$isSamsungTabA8(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return getHighSpeedVideoSizes();
        }

        private static boolean getHighSpeedVideoSizes() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice()) {
                return kotlin.text.StringsKt.equals("gta8", android.os.Build.DEVICE, true) || kotlin.text.StringsKt.equals("gta8wifi", android.os.Build.DEVICE, true);
            }
            return false;
        }

        private static boolean getHighSpeedVideoFpsRangesFor() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice()) {
                java.lang.String str = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                if (kotlin.text.StringsKt.startsWith$default(str, "SM-A536", false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        }

        public static final /* synthetic */ boolean access$isBluStudioX10(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isBluDevice() && kotlin.text.StringsKt.equals("studio x10", android.os.Build.MODEL, true);
        }

        public static final /* synthetic */ boolean access$isItelW6004(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isItelDevice() && kotlin.text.StringsKt.equals("itel w6004", android.os.Build.MODEL, true);
        }

        public static final /* synthetic */ boolean access$isMotoE13(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isMotorolaDevice() && kotlin.text.StringsKt.equals("moto e13", android.os.Build.MODEL, true);
        }

        public static final /* synthetic */ boolean access$isPixel4XLApi29(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return kotlin.text.StringsKt.equals("pixel 4 xl", android.os.Build.MODEL, true) && android.os.Build.VERSION.SDK_INT == 29;
        }

        public static final /* synthetic */ boolean access$isPositivoTwist2Pro(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isPositivoDevice() && kotlin.text.StringsKt.equals("twist 2 pro", android.os.Build.MODEL, true);
        }

        public static final /* synthetic */ boolean access$isVivo1805(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion) {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isVivoDevice() && kotlin.text.StringsKt.equals("vivo 1805", android.os.Build.MODEL, true);
        }

        public final boolean isEnabled() {
            return (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isBluDevice() && kotlin.text.StringsKt.equals("studio x10", android.os.Build.MODEL, true)) || (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isItelDevice() && kotlin.text.StringsKt.equals("itel w6004", android.os.Build.MODEL, true)) || ((androidx.camera.camera2.compat.quirk.Device.INSTANCE.isVivoDevice() && kotlin.text.StringsKt.equals("vivo 1805", android.os.Build.MODEL, true)) || ((androidx.camera.camera2.compat.quirk.Device.INSTANCE.isPositivoDevice() && kotlin.text.StringsKt.equals("twist 2 pro", android.os.Build.MODEL, true)) || ((kotlin.text.StringsKt.equals("pixel 4 xl", android.os.Build.MODEL, true) && android.os.Build.VERSION.SDK_INT == 29) || ((androidx.camera.camera2.compat.quirk.Device.INSTANCE.isMotorolaDevice() && kotlin.text.StringsKt.equals("moto e13", android.os.Build.MODEL, true)) || getHighSpeedVideoSizes() || getHighSpeedVideoFpsRangesFor() || androidx.camera.camera2.compat.quirk.Device.INSTANCE.isUniSocChipsetDevice()))));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean workaroundByCaptureIntentPreview() {
        androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion = INSTANCE;
        return androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isBluStudioX10(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isItelW6004(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isVivo1805(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isPositivoTwist2Pro(companion);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean workaroundBySurfaceProcessing() {
        androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion companion = INSTANCE;
        return androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isBluStudioX10(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isItelW6004(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isVivo1805(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isPositivoTwist2Pro(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isPixel4XLApi29(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isMotoE13(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isSamsungTabA8(companion) || androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.access$isSamsungA53(companion) || androidx.camera.camera2.compat.quirk.Device.INSTANCE.isUniSocChipsetDevice();
    }
}
