package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\n\u0010\u000eJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "cameraId", "", "imageFormat", "", "Landroid/util/Size;", "getExcludedSizes", "(Ljava/lang/String;I)Ljava/util/List;", "Ljava/lang/Class;", "klass", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;ILjava/lang/Class;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExcludedSupportedSizesQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.Companion(null);

    public final java.util.List<android.util.Size> getExcludedSizes(java.lang.String cameraId, int imageFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.Companion companion = INSTANCE;
        if (!companion.isOnePlus6$camera_camera2()) {
            if (!companion.isOnePlus6T$camera_camera2()) {
                if (companion.isHuaweiP20Lite$camera_camera2()) {
                    return getHighResolutionOutputSizeshNQ4ISI(cameraId, imageFormat, null);
                }
                if (companion.isSamsungJ7PrimeApi27Above$camera_camera2()) {
                    return getHighSpeedVideoFpsRanges(cameraId, imageFormat, null);
                }
                if (companion.isSamsungJ7Api27Above$camera_camera2()) {
                    return getHighSpeedVideoFpsRangesFor(cameraId, imageFormat, null);
                }
                if (!companion.isRedmiNote9Pro$camera_camera2()) {
                    if (companion.isSamsungA05s$camera_camera2()) {
                        if (imageFormat == 35) {
                            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(3840, 2160), new android.util.Size(3264, 2448), new android.util.Size(3200, 2400), new android.util.Size(2688, 1512), new android.util.Size(2592, 1944), new android.util.Size(2592, 1940), new android.util.Size(1920, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH)});
                        }
                        return kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (companion.isNokia7Plus$camera_camera2()) {
                        if (imageFormat == 35) {
                            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(4032, 3024), new android.util.Size(4000, 3000), new android.util.Size(3264, 2448), new android.util.Size(3200, 2400), new android.util.Size(3024, 3024), new android.util.Size(2976, 2976), new android.util.Size(2448, 2448)});
                        }
                        return kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (!companion.isSamsungZFold4$camera_camera2()) {
                        androidx.camera.core.Logger.w("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                        return kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "1") && imageFormat == 35) {
                        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT), new android.util.Size(1920, 1080), new android.util.Size(2304, 1296), new android.util.Size(640, 360), new android.util.Size(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 144), new android.util.Size(2336, 1080), new android.util.Size(2400, 1080), new android.util.Size(1920, 824), new android.util.Size(1088, 1088), new android.util.Size(1728, 1728), new android.util.Size(2736, 2736), new android.util.Size(1824, 712)});
                    }
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "0") && imageFormat == 256) {
                    return kotlin.collections.CollectionsKt.listOf(new android.util.Size(9280, 6944));
                }
                return kotlin.collections.CollectionsKt.emptyList();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "0") && imageFormat == 256) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(4160, 3120), new android.util.Size(4000, 3000)});
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "0") && imageFormat == 256) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(4160, 3120), new android.util.Size(4000, 3000)});
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public final java.util.List<android.util.Size> getExcludedSizes(java.lang.String cameraId, java.lang.Class<?> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.Companion companion = INSTANCE;
        if (companion.isHuaweiP20Lite$camera_camera2()) {
            return getHighResolutionOutputSizeshNQ4ISI(cameraId, -1, klass);
        }
        if (companion.isSamsungJ7PrimeApi27Above$camera_camera2()) {
            return getHighSpeedVideoFpsRanges(cameraId, -1, klass);
        }
        if (companion.isSamsungJ7Api27Above$camera_camera2()) {
            return getHighSpeedVideoFpsRangesFor(cameraId, -1, klass);
        }
        androidx.camera.core.Logger.w("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private static java.util.List<android.util.Size> getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, int p1, java.lang.Class<?> p2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, "0") && (p1 == 34 || p1 == 35 || p2 != null)) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT), new android.util.Size(400, 400)});
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private static java.util.List<android.util.Size> getHighSpeedVideoFpsRanges(java.lang.String p0, int p1, java.lang.Class<?> p2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, "0")) {
            if (p1 == 34 || p2 != null) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(4128, 3096), new android.util.Size(4128, 2322), new android.util.Size(3088, 3088), new android.util.Size(3264, 2448), new android.util.Size(3264, 1836), new android.util.Size(2048, 1536), new android.util.Size(2048, 1152), new android.util.Size(1920, 1080)});
            }
            if (p1 == 35) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(4128, 2322), new android.util.Size(3088, 3088), new android.util.Size(3264, 2448), new android.util.Size(3264, 1836), new android.util.Size(2048, 1536), new android.util.Size(2048, 1152), new android.util.Size(1920, 1080)});
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(p0, "1") && (p1 == 34 || p1 == 35 || p2 != null)) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(3264, 2448), new android.util.Size(3264, 1836), new android.util.Size(2448, 2448), new android.util.Size(1920, 1920), new android.util.Size(2048, 1536), new android.util.Size(2048, 1152), new android.util.Size(1920, 1080)});
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private static java.util.List<android.util.Size> getHighSpeedVideoFpsRangesFor(java.lang.String p0, int p1, java.lang.Class<?> p2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, "0")) {
            if (p1 == 34 || p2 != null) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(4128, 3096), new android.util.Size(4128, 2322), new android.util.Size(3088, 3088), new android.util.Size(3264, 2448), new android.util.Size(3264, 1836), new android.util.Size(2048, 1536), new android.util.Size(2048, 1152), new android.util.Size(1920, 1080)});
            }
            if (p1 == 35) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(2048, 1536), new android.util.Size(2048, 1152), new android.util.Size(1920, 1080)});
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(p0, "1") && (p1 == 34 || p1 == 35 || p2 != null)) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{new android.util.Size(2576, 1932), new android.util.Size(2560, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH), new android.util.Size(1920, 1920), new android.util.Size(2048, 1536), new android.util.Size(2048, 1152), new android.util.Size(1920, 1080)});
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "isOnePlus6$camera_camera2", "isOnePlus6", "isOnePlus6T$camera_camera2", "isOnePlus6T", "isHuaweiP20Lite$camera_camera2", "isHuaweiP20Lite", "isSamsungJ7PrimeApi27Above$camera_camera2", "isSamsungJ7PrimeApi27Above", "isSamsungJ7Api27Above$camera_camera2", "isSamsungJ7Api27Above", "isRedmiNote9Pro$camera_camera2", "isRedmiNote9Pro", "isSamsungA05s$camera_camera2", "isSamsungA05s", "isNokia7Plus$camera_camera2", "isNokia7Plus", "isSamsungZFold4$camera_camera2", "isSamsungZFold4"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isOnePlus6$camera_camera2() || isOnePlus6T$camera_camera2() || isHuaweiP20Lite$camera_camera2() || isSamsungJ7PrimeApi27Above$camera_camera2() || isSamsungJ7Api27Above$camera_camera2() || isRedmiNote9Pro$camera_camera2() || isSamsungA05s$camera_camera2() || isNokia7Plus$camera_camera2() || isSamsungZFold4$camera_camera2();
        }

        public final boolean isOnePlus6$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isOnePlusDevice() && kotlin.text.StringsKt.equals("OnePlus6", android.os.Build.DEVICE, true);
        }

        public final boolean isOnePlus6T$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isOnePlusDevice() && kotlin.text.StringsKt.equals("OnePlus6T", android.os.Build.DEVICE, true);
        }

        public final boolean isHuaweiP20Lite$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isHuaweiDevice() && kotlin.text.StringsKt.equals("HWANE", android.os.Build.DEVICE, true);
        }

        public final boolean isSamsungJ7PrimeApi27Above$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("ON7XELTE", android.os.Build.DEVICE, true) && android.os.Build.VERSION.SDK_INT >= 27;
        }

        public final boolean isSamsungJ7Api27Above$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("J7XELTE", android.os.Build.DEVICE, true) && android.os.Build.VERSION.SDK_INT >= 27;
        }

        public final boolean isRedmiNote9Pro$camera_camera2() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isRedmiDevice() && kotlin.text.StringsKt.equals("joyeuse", android.os.Build.DEVICE, true);
        }

        public final boolean isSamsungA05s$camera_camera2() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals("a05s", android.os.Build.DEVICE, true)) {
                java.lang.String str = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) upperCase, (java.lang.CharSequence) "SM-A057", false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNokia7Plus$camera_camera2() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isNokiaDevice()) {
                return kotlin.text.StringsKt.equals("B2N", android.os.Build.DEVICE, true) || kotlin.text.StringsKt.equals("B2N_sprout", android.os.Build.DEVICE, true);
            }
            return false;
        }

        public final boolean isSamsungZFold4$camera_camera2() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice()) {
                return kotlin.text.StringsKt.equals("q4q", android.os.Build.DEVICE, true) || kotlin.text.StringsKt.equals("SCG16", android.os.Build.DEVICE, true) || kotlin.text.StringsKt.equals("SC-55C", android.os.Build.DEVICE, true);
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
