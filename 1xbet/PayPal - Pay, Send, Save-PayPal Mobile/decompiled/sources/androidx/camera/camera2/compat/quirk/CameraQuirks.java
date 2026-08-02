package androidx.camera.camera2.compat.quirk;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "streamConfigurationMapCompat", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/impl/Quirks;", "quirks$delegate", "Lkotlin/Lazy;", "getQuirks", "()Landroidx/camera/core/impl/Quirks;", "quirks", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraQuirks {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.StreamConfigurationMapCompat Camera2StreamConfigurationMap;

    /* renamed from: quirks$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy quirks;

    @javax.inject.Inject
    public CameraQuirks(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.compat.StreamConfigurationMapCompat streamConfigurationMapCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamConfigurationMapCompat, "");
        this.getHighSpeedVideoFpsRanges = cameraMetadata;
        this.Camera2StreamConfigurationMap = streamConfigurationMapCompat;
        this.quirks = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.compat.quirk.CameraQuirks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.compat.quirk.CameraQuirks.m69$r8$lambda$3nXzTEXW5hJTW6NAsrAgNfo7qI(androidx.camera.camera2.compat.quirk.CameraQuirks.this);
            }
        });
    }

    public final androidx.camera.core.impl.Quirks getQuirks() {
        return (androidx.camera.core.impl.Quirks) this.quirks.getValue();
    }

    /* renamed from: $r8$lambda$3nXzTEXW5hJTW6N-AsrAgNfo7qI, reason: not valid java name */
    public static /* synthetic */ androidx.camera.core.impl.Quirks m69$r8$lambda$3nXzTEXW5hJTW6NAsrAgNfo7qI(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        androidx.camera.core.impl.QuirkSettings quirkSettings = androidx.camera.core.impl.QuirkSettingsHolder.instance().get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quirkSettings, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cameraQuirks.getHighSpeedVideoFpsRanges == null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            return new androidx.camera.core.impl.Quirks(arrayList);
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk.class, androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk(cameraQuirks.getHighSpeedVideoFpsRanges));
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk.class, androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk.class, androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.class, androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk(cameraQuirks.Camera2StreamConfigurationMap));
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class, androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk.class, androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk.class, androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class, androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk.class, androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk.class, androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class, androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.class, androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk.class, androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class, androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk.class, androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk.class, androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk.INSTANCE);
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk.class, androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk.class, androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class, androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk(cameraQuirks.getHighSpeedVideoFpsRanges));
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.class, androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class, androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class, androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk.class, androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class, androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.INSTANCE.isEnabled())) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class, androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.INSTANCE.isEnabled(cameraQuirks.getHighSpeedVideoFpsRanges))) {
            arrayList.add(new androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk());
        }
        androidx.camera.core.impl.Quirks quirks = new androidx.camera.core.impl.Quirks(arrayList);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("camera2 CameraQuirks = ");
        sb.append(androidx.camera.core.impl.Quirks.toString(quirks));
        androidx.camera.core.Logger.d("CameraQuirks", sb.toString());
        return quirks;
    }
}
