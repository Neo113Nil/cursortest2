package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Landroid/util/Size;", "getDisplaySize", "()Landroid/util/Size;", "displaySize", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SmallDisplaySizeQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.Companion(null);
    private static final java.util.Map<java.lang.String, android.util.Size> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("REDMI NOTE 8", new android.util.Size(1080, 2340)), kotlin.TuplesKt.to("REDMI NOTE 7", new android.util.Size(1080, 2340)), kotlin.TuplesKt.to("SM-A207M", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1560)), kotlin.TuplesKt.to("REDMI NOTE 7S", new android.util.Size(1080, 2340)), kotlin.TuplesKt.to("SM-A127F", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("SM-A536E", new android.util.Size(1080, 2400)), kotlin.TuplesKt.to("220233L2I", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("V2149", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("VIVO 1920", new android.util.Size(1080, 2340)), kotlin.TuplesKt.to("CPH2223", new android.util.Size(1080, 2400)), kotlin.TuplesKt.to("V2029", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("CPH1901", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1520)), kotlin.TuplesKt.to("REDMI Y3", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1520)), kotlin.TuplesKt.to("SM-A045M", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("SM-A146U", new android.util.Size(1080, 2408)), kotlin.TuplesKt.to("CPH1909", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1520)), kotlin.TuplesKt.to("NOKIA 4.2", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1520)), kotlin.TuplesKt.to("SM-G960U1", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, 2960)), kotlin.TuplesKt.to("SM-A137F", new android.util.Size(1080, 2408)), kotlin.TuplesKt.to("VIVO 1816", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1520)), kotlin.TuplesKt.to("INFINIX X6817", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1612)), kotlin.TuplesKt.to("SM-A037F", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("NOKIA 2.4", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("SM-A125M", new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1600)), kotlin.TuplesKt.to("INFINIX X670", new android.util.Size(1080, 2400)));

    public final android.util.Size getDisplaySize() {
        java.util.Map<java.lang.String, android.util.Size> map = getHighSpeedVideoFpsRanges;
        java.lang.String str = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        android.util.Size size = map.get(upperCase);
        kotlin.jvm.internal.Intrinsics.checkNotNull(size);
        return size;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk$Companion;", "", "<init>", "()V", "", "load", "()Z", "", "", "Landroid/util/Size;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean load() {
            java.util.Map map = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.getHighSpeedVideoFpsRanges;
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return map.containsKey(upperCase);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
