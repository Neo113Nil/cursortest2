package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZslDisablerQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.Companion(null);
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1"});
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf("MI 8");

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk$Companion;", "", "<init>", "()V", "", "load", "()Z", "", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Z", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.String> p0) {
            for (java.lang.String str : p0) {
                java.lang.String str2 = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (kotlin.text.StringsKt.startsWith$default(upperCase, str, false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean load() {
            if (androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.Camera2StreamConfigurationMap)) {
                return true;
            }
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isXiaomiDevice() && getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.getHighSpeedVideoFpsRangesFor);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
