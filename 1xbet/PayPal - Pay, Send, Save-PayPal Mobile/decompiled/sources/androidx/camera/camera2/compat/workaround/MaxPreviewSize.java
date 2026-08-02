package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/compat/workaround/MaxPreviewSize;", "", "Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "extraCroppingQuirk", "<init>", "(Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;)V", "Landroid/util/Size;", "defaultMaxPreviewResolution", "getMaxPreviewResolution", "(Landroid/util/Size;)Landroid/util/Size;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaxPreviewSize {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk getHighSpeedVideoFpsRanges;

    public MaxPreviewSize(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk) {
        this.getHighSpeedVideoFpsRanges = extraCroppingQuirk;
    }

    public /* synthetic */ MaxPreviewSize(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.class) : extraCroppingQuirk);
    }

    public final android.util.Size getMaxPreviewResolution(android.util.Size defaultMaxPreviewResolution) {
        android.util.Size verifiedResolution;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultMaxPreviewResolution, "");
        androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk = this.getHighSpeedVideoFpsRanges;
        return (extraCroppingQuirk == null || (verifiedResolution = extraCroppingQuirk.getVerifiedResolution(androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV)) == null || verifiedResolution.getWidth() * verifiedResolution.getHeight() <= defaultMaxPreviewResolution.getWidth() * defaultMaxPreviewResolution.getHeight()) ? defaultMaxPreviewResolution : verifiedResolution;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaxPreviewSize() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
