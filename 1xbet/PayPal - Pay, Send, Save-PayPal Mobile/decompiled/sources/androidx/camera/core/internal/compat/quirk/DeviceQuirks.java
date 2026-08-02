package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirks {
    private static volatile androidx.camera.core.impl.Quirks Camera2StreamConfigurationMap;

    static {
        androidx.camera.core.impl.QuirkSettingsHolder.instance().observe(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.core.util.Consumer() { // from class: androidx.camera.core.internal.compat.quirk.DeviceQuirks$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.internal.compat.quirk.DeviceQuirks.getHighSpeedVideoFpsRangesFor((androidx.camera.core.impl.QuirkSettings) obj);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        Camera2StreamConfigurationMap = new androidx.camera.core.impl.Quirks(androidx.camera.core.internal.compat.quirk.DeviceQuirksLoader.getHighSpeedVideoFpsRangesFor(quirkSettings));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("core DeviceQuirks = ");
        sb.append(androidx.camera.core.impl.Quirks.toString(Camera2StreamConfigurationMap));
        androidx.camera.core.Logger.d("DeviceQuirks", sb.toString());
    }

    private DeviceQuirks() {
    }

    public static androidx.camera.core.impl.Quirks getAll() {
        return Camera2StreamConfigurationMap;
    }

    public static <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        return (T) Camera2StreamConfigurationMap.get(cls);
    }
}
