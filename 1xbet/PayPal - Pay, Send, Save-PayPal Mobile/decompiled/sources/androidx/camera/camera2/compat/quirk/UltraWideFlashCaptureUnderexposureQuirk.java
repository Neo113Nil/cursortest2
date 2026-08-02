package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;", "Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UltraWideFlashCaptureUnderexposureQuirk implements androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.Companion(null);
    private static final java.util.List<java.lang.String> BUILD_MODEL_PREFIXES = kotlin.collections.CollectionsKt.listOf("sm-s921");

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "", "", "BUILD_MODEL_PREFIXES", "Ljava/util/List;", "getBUILD_MODEL_PREFIXES", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<java.lang.String> getBUILD_MODEL_PREFIXES() {
            return androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.BUILD_MODEL_PREFIXES;
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            java.util.List<java.lang.String> build_model_prefixes = getBUILD_MODEL_PREFIXES();
            if (!(build_model_prefixes instanceof java.util.Collection) || !build_model_prefixes.isEmpty()) {
                java.util.Iterator<T> it = build_model_prefixes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    java.lang.String str2 = android.os.Build.MODEL;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                    java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (kotlin.text.StringsKt.startsWith$default(lowerCase, str, false, 2, (java.lang.Object) null)) {
                        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
                        if (num == null || num.intValue() != 1) {
                            break;
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
