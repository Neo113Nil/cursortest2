package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes6.dex */
public class StreamSharingForceEnabler {
    private final androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk getHighSpeedVideoFpsRanges = (androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.class);
    private final androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk getHighSpeedVideoFpsRangesFor = (androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.class);

    public boolean shouldForceEnableStreamSharing(java.lang.String str, java.util.Collection<androidx.camera.core.UseCase> collection) {
        androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.getHighSpeedVideoFpsRanges;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.shouldForceEnableStreamSharing(str, collection);
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.shouldForceEnableStreamSharing(str, collection);
        }
        return false;
    }
}
