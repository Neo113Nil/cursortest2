package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> Camera2StreamConfigurationMap(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class, androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class, androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.getHighSpeedVideoFpsRangesFor())) {
            arrayList.add(new androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
