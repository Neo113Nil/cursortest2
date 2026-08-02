package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/workaround/CloseCameraOnCameraGraphClose;", "", "<init>", "()V", "", "isExtensions", "shouldCloseCameraDevice", "(Z)Z", "Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseCameraOnCameraGraphClose {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk getHighResolutionOutputSizeshNQ4ISI = (androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.class);

    public final boolean shouldCloseCameraDevice(boolean isExtensions) {
        androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk closeCameraDeviceOnCameraGraphCloseQuirk = this.getHighResolutionOutputSizeshNQ4ISI;
        if (closeCameraDeviceOnCameraGraphCloseQuirk != null) {
            return closeCameraDeviceOnCameraGraphCloseQuirk.shouldCloseCameraDevice(isExtensions);
        }
        return false;
    }
}
