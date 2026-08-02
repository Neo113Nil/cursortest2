package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class, androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.getHighSpeedVideoFpsRangesFor())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk());
        }
        androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.getHighResolutionOutputSizeshNQ4ISI();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class, true)) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class, androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class, androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.LowMemoryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class, androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.Camera2StreamConfigurationMap())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class, androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.class, androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.Camera2StreamConfigurationMap())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.class, androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.load())) {
            arrayList.add(androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.INSTANCE);
        }
        return arrayList;
    }
}
