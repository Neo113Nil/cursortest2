package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk;", "Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCaptureFlashNotFireQuirk implements androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.Companion(null);
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"itel w6004", "sm-j700m"});
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"sm-j700f", "sm-j710f"});

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCaptureFlashNotFireQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            java.util.List list = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.Camera2StreamConfigurationMap;
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (list.contains(lowerCase)) {
                android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
                if (num != null && num.intValue() == 0) {
                    z = true;
                    java.util.List list2 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str2 = android.os.Build.MODEL;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                    java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    return !z || list2.contains(lowerCase2);
                }
            }
            z = false;
            java.util.List list22 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str22 = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str22, "");
            java.lang.String lowerCase22 = str22.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase22, "");
            if (z) {
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
