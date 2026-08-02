package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirks {
    private static volatile androidx.camera.core.impl.Quirks getHighSpeedVideoFpsRangesFor;

    static {
        androidx.camera.core.impl.QuirkSettingsHolder.instance().observe(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.core.util.Consumer() { // from class: androidx.camera.video.internal.compat.quirk.DeviceQuirks$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.video.internal.compat.quirk.DeviceQuirks.getHighSpeedVideoFpsRanges((androidx.camera.core.impl.QuirkSettings) obj);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        getHighSpeedVideoFpsRangesFor = new androidx.camera.core.impl.Quirks(androidx.camera.video.internal.compat.quirk.DeviceQuirksLoader.getHighSpeedVideoFpsRanges(quirkSettings));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("video DeviceQuirks = ");
        sb.append(androidx.camera.core.impl.Quirks.toString(getHighSpeedVideoFpsRangesFor));
        androidx.camera.core.Logger.d("DeviceQuirks", sb.toString());
    }

    private DeviceQuirks() {
    }

    public static androidx.camera.core.impl.Quirks getAll() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        return (T) getHighSpeedVideoFpsRangesFor.get(cls);
    }

    public static <T extends androidx.camera.core.impl.Quirk> java.util.List<T> getAll(java.lang.Class<T> cls) {
        return getHighSpeedVideoFpsRangesFor.getAll(cls);
    }
}
