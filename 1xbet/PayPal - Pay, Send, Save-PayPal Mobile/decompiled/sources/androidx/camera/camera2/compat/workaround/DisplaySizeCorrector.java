package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/workaround/DisplaySizeCorrector;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;", "getHighSpeedVideoFpsRanges", "Landroid/util/Size;", "getDisplaySize", "()Landroid/util/Size;", "displaySize"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DisplaySizeCorrector {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk getHighSpeedVideoFpsRanges = (androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.class);

    public final android.util.Size getDisplaySize() {
        androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.getHighSpeedVideoFpsRanges;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.getDisplaySize();
        }
        return null;
    }
}
