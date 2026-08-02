package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;", "Landroidx/camera/core/impl/Quirk;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;)V", "", "isFlashModeTorchRequired", "()Z", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TorchFlashRequiredFor3aUpdateQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.Companion(null);
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.mutableListOf("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoFpsRangesFor;

    public TorchFlashRequiredFor3aUpdateQuirk(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        this.getHighSpeedVideoFpsRangesFor = cameraMetadata;
    }

    public final boolean isFlashModeTorchRequired() {
        return !androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.getHighSpeedVideoFpsRangesFor);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            for (java.lang.String str : androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.getHighSpeedVideoFpsRanges) {
                java.lang.String str2 = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, str)) {
                    android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                    java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
                    return num != null && num.intValue() == 0;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
