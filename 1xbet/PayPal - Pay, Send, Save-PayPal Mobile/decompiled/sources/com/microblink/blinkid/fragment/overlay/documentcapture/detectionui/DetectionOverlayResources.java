package com.microblink.blinkid.fragment.overlay.documentcapture.detectionui;

/* loaded from: classes10.dex */
class DetectionOverlayResources extends com.microblink.blinkid.fragment.overlay.OverlayResources {
    final android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    final android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    final android.graphics.drawable.Drawable getOutputFormats;
    final int getOutputMinFrameDuration;

    DetectionOverlayResources(android.content.Context context, int i) {
        super(context, i, com.microblink.blinkid.library.R.style.MB_default_detection_overlay_style);
        this.Camera2StreamConfigurationMap = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_torchOnDrawable);
        this.getOutputFormats = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_torchOffDrawable);
        this.getHighSpeedVideoSizes = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_exitScanDrawable);
        this.getHighResolutionOutputSizeshNQ4ISI = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_instructionsBackgroundDrawable);
        this.getOutputMinFrameDuration = IllIIIllII(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_instructionsTextAppearance);
        this.getHighSpeedVideoFpsRanges = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_successFlashColor);
        this.getHighSpeedVideoFpsRangesFor = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay_mb_detectionRectangleColor);
        llIIlIlIIl();
    }

    @Override // com.microblink.blinkid.fragment.overlay.OverlayResources
    public final int[] IlIllIlIIl() {
        return com.microblink.blinkid.library.R.styleable.DocumentCaptureDetectionOverlay;
    }
}
