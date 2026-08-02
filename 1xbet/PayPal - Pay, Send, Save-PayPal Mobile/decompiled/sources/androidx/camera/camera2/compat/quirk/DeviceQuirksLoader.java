package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DeviceQuirksLoader;", "", "<init>", "()V", "Landroidx/camera/core/impl/QuirkSettings;", "quirkSettings", "", "Landroidx/camera/core/impl/Quirk;", "loadQuirks", "(Landroidx/camera/core/impl/QuirkSettings;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceQuirksLoader {
    public static final androidx.camera.camera2.compat.quirk.DeviceQuirksLoader INSTANCE = new androidx.camera.camera2.compat.quirk.DeviceQuirksLoader();

    private DeviceQuirksLoader() {
    }

    public final java.util.List<androidx.camera.core.impl.Quirk> loadQuirks(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirkSettings, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.class, androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.class, androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk.class, androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.class, androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class, androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.class, androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.class, androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.class, androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.class, androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.class, androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class, androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class, androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.class, androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class, androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class, androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class, androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class, androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.class, androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.INSTANCE.load())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ZslDisablerQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.class, androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.INSTANCE.load())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class, androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.load())) {
            arrayList.add(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.INSTANCE);
        }
        return arrayList;
    }
}
