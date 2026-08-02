package androidx.camera.extensions.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> getHighSpeedVideoFpsRanges(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.EnsurePostviewFormatEquivalenceQuirk.class, androidx.camera.extensions.internal.compat.quirk.EnsurePostviewFormatEquivalenceQuirk.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.EnsurePostviewFormatEquivalenceQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk.class, androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk.class, androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk.load())) {
            arrayList.add(new androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk());
        }
        return arrayList;
    }
}
