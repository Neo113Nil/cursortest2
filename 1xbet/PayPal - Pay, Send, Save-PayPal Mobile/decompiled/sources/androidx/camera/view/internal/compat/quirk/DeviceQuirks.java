package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirks {
    private static volatile androidx.camera.core.impl.Quirks getHighResolutionOutputSizeshNQ4ISI;

    static {
        androidx.camera.core.impl.QuirkSettingsHolder.instance().observe(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.core.util.Consumer() { // from class: androidx.camera.view.internal.compat.quirk.DeviceQuirks$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.view.internal.compat.quirk.DeviceQuirks.getHighSpeedVideoSizes((androidx.camera.core.impl.QuirkSettings) obj);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.Quirks(androidx.camera.view.internal.compat.quirk.DeviceQuirksLoader.Camera2StreamConfigurationMap(quirkSettings));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("view DeviceQuirks = ");
        sb.append(androidx.camera.core.impl.Quirks.toString(getHighResolutionOutputSizeshNQ4ISI));
        androidx.camera.core.Logger.d("DeviceQuirks", sb.toString());
    }

    private DeviceQuirks() {
    }

    public static <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        return (T) getHighResolutionOutputSizeshNQ4ISI.get(cls);
    }
}
