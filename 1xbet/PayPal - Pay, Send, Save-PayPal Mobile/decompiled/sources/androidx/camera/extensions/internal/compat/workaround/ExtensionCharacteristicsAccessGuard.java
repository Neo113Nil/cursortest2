package androidx.camera.extensions.internal.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/extensions/internal/compat/workaround/ExtensionCharacteristicsAccessGuard;", "", "<init>", "()V", "", "allowPostviewAvailabilityCheck", "()Z", "allowCaptureProcessProgressAvailabilityCheck", "Landroidx/camera/extensions/internal/compat/quirk/AvoidPostviewAvailabilityCheckQuirk;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/extensions/internal/compat/quirk/AvoidPostviewAvailabilityCheckQuirk;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/extensions/internal/compat/quirk/AvoidCaptureProcessProgressAvailabilityCheckQuirk;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/extensions/internal/compat/quirk/AvoidCaptureProcessProgressAvailabilityCheckQuirk;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtensionCharacteristicsAccessGuard {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk getHighSpeedVideoFpsRangesFor = (androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk) androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.AvoidPostviewAvailabilityCheckQuirk.class);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk Camera2StreamConfigurationMap = (androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk) androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.AvoidCaptureProcessProgressAvailabilityCheckQuirk.class);

    public final boolean allowPostviewAvailabilityCheck() {
        return this.getHighSpeedVideoFpsRangesFor == null;
    }

    public final boolean allowCaptureProcessProgressAvailabilityCheck() {
        return this.Camera2StreamConfigurationMap == null;
    }
}
