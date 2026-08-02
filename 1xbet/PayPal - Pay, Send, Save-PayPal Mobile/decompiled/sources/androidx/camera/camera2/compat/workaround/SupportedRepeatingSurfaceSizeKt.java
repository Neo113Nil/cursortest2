package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "Landroid/util/Size;", "getSupportedRepeatingSurfaceSizes", "([Landroid/util/Size;)[Landroid/util/Size;", "Camera2StreamConfigurationMap", "Landroid/util/Size;", "getHighSpeedVideoSizes", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Comparator;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SupportedRepeatingSurfaceSizeKt {
    private static final android.util.Size Camera2StreamConfigurationMap = new android.util.Size(320, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
    private static final java.util.Comparator<android.util.Size> getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.utils.CompareSizesByArea();

    public static final android.util.Size[] getSupportedRepeatingSurfaceSizes(android.util.Size[] sizeArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizeArr, "");
        if (((androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
            return sizeArr;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : sizeArr) {
            if (getHighResolutionOutputSizeshNQ4ISI.compare(size, Camera2StreamConfigurationMap) >= 0) {
                arrayList.add(size);
            }
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }
}
