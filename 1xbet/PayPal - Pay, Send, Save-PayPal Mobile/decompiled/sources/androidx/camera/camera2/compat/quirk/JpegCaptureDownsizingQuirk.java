package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;", "Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "", "", "getHighSpeedVideoSizes", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JpegCaptureDownsizingQuirk implements androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk {
    public static final androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk INSTANCE = new androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk();
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf("redmi note 8 pro");

    private JpegCaptureDownsizingQuirk() {
    }

    public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        java.util.Set<java.lang.String> set = getHighSpeedVideoSizes;
        java.lang.String str = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!set.contains(lowerCase)) {
            return false;
        }
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
        return num != null && num.intValue() == 0;
    }
}
