package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCapturePixelHDRPlusQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.Companion(null);
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL"});

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z", "", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.Camera2StreamConfigurationMap.contains(android.os.Build.MODEL) && androidx.camera.camera2.compat.quirk.Device.INSTANCE.isGoogleDevice();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
