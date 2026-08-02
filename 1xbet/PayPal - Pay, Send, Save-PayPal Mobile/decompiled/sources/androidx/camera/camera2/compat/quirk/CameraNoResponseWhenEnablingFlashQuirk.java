package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk;", "Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraNoResponseWhenEnablingFlashQuirk implements androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.Companion(null);
    private static final java.util.List<java.lang.String> AFFECTED_MODELS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN", "VIVO 1610"});

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CameraNoResponseWhenEnablingFlashQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "", "", "AFFECTED_MODELS", "Ljava/util/List;", "getAFFECTED_MODELS", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<java.lang.String> getAFFECTED_MODELS() {
            return androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.AFFECTED_MODELS;
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            java.util.List<java.lang.String> affected_models = getAFFECTED_MODELS();
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (!affected_models.contains(upperCase)) {
                return false;
            }
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 1;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
