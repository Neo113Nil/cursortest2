package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "configType", "Landroid/util/Size;", "getVerifiedResolution", "(Landroidx/camera/core/impl/SurfaceConfig$ConfigType;)Landroid/util/Size;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraCroppingQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.Companion(null);
    private static final java.util.Map<java.lang.String, android.util.Range<java.lang.Integer>> getHighSpeedVideoFpsRangesFor;

    public final android.util.Size getVerifiedResolution(androidx.camera.core.impl.SurfaceConfig.ConfigType configType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "");
        if (!INSTANCE.isSamsungDistortion$camera_camera2()) {
            return null;
        }
        int i = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.WhenMappings.$EnumSwitchMapping$0[configType.ordinal()];
        if (i == 1) {
            return new android.util.Size(1920, 1080);
        }
        if (i == 2) {
            return new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT);
        }
        if (i != 3) {
            return null;
        }
        return new android.util.Size(3264, 1836);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "", "", "Landroid/util/Range;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "isSamsungDistortion$camera_camera2", "isSamsungDistortion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isSamsungDistortion$camera_camera2();
        }

        public final boolean isSamsungDistortion$camera_camera2() {
            if (!androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            java.util.Map map = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.getHighSpeedVideoFpsRangesFor;
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (!map.containsKey(upperCase)) {
                return false;
            }
            java.util.Map map2 = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.getHighSpeedVideoFpsRangesFor;
            java.lang.String str2 = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            java.lang.String upperCase2 = str2.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            android.util.Range range = (android.util.Range) map2.get(upperCase2);
            if (range != null) {
                return range.contains((android.util.Range) java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            }
            return true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.Integer num = (java.lang.Comparable) 21;
        java.lang.Integer num2 = (java.lang.Comparable) 26;
        getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("SM-T580", null), kotlin.TuplesKt.to("SM-J710MN", new android.util.Range(num, num2)), kotlin.TuplesKt.to("SM-A320FL", null), kotlin.TuplesKt.to("SM-G570M", null), kotlin.TuplesKt.to("SM-G610F", null), kotlin.TuplesKt.to("SM-G610M", new android.util.Range(num, num2)));
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.impl.SurfaceConfig.ConfigType.values().length];
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
