package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "isExtensions", "shouldCloseCameraDevice", "(Z)Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements androidx.camera.core.impl.Quirk {
    private static final boolean Camera2StreamConfigurationMap;
    private static final boolean getHighResolutionOutputSizeshNQ4ISI;
    private static final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.Companion(null);
    private static final boolean getHighSpeedVideoFpsRangesFor = kotlin.jvm.internal.Intrinsics.areEqual(android.os.Build.HARDWARE, "samsungexynos7570");
    private static final boolean getHighSpeedVideoSizes = kotlin.jvm.internal.Intrinsics.areEqual(android.os.Build.HARDWARE, "samsungexynos7870");

    public final boolean shouldCloseCameraDevice(boolean isExtensions) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            return isExtensions;
        }
        if (!getHighSpeedVideoFpsRanges || getHighSpeedVideoFpsRangesFor || getHighSpeedVideoSizes) {
            return true;
        }
        return isExtensions;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final boolean isEnabled() {
            if (androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.getHighSpeedVideoFpsRangesFor || androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.getHighSpeedVideoSizes) {
                return true;
            }
            int i = android.os.Build.VERSION.SDK_INT;
            return (30 <= i && i < 34 && (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isOppoDevice() || androidx.camera.camera2.compat.quirk.Device.INSTANCE.isOnePlusDevice() || androidx.camera.camera2.compat.quirk.Device.INSTANCE.isRealmeDevice())) || androidx.camera.camera2.compat.quirk.Device.INSTANCE.isVivoDevice() || androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.getHighResolutionOutputSizeshNQ4ISI || androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.getHighSpeedVideoFpsRanges || androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.Camera2StreamConfigurationMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    static {
        boolean z;
        boolean z2;
        if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isXiaomiDevice()) {
            java.lang.String str = android.os.Build.DEVICE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (kotlin.collections.ArraysKt.contains(new java.lang.String[]{"aurora", "houji"}, lowerCase)) {
                z = true;
                getHighResolutionOutputSizeshNQ4ISI = z;
                if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSonyDevice()) {
                    java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"XQ-DQ", "SO", "A301SO"});
                    if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
                        for (java.lang.String str2 : listOf) {
                            java.lang.String str3 = android.os.Build.DEVICE;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                            if (kotlin.text.StringsKt.startsWith(str3, str2, true)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                z2 = false;
                Camera2StreamConfigurationMap = z2;
                getHighSpeedVideoFpsRanges = !androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && android.os.Build.VERSION.SDK_INT >= 31 && android.os.Build.VERSION.SDK_INT <= 34;
            }
        }
        z = false;
        getHighResolutionOutputSizeshNQ4ISI = z;
        if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSonyDevice()) {
        }
        z2 = false;
        Camera2StreamConfigurationMap = z2;
        getHighSpeedVideoFpsRanges = !androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && android.os.Build.VERSION.SDK_INT >= 31 && android.os.Build.VERSION.SDK_INT <= 34;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEnabled() {
        return INSTANCE.isEnabled();
    }
}
