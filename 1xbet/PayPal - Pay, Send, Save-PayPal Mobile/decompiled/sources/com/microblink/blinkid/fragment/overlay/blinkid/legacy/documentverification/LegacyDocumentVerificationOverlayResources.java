package com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification;

@java.lang.Deprecated
/* loaded from: classes10.dex */
class LegacyDocumentVerificationOverlayResources extends com.microblink.blinkid.fragment.overlay.OverlayResources {
    final android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges;
    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    final android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    final android.graphics.drawable.Drawable getHighSpeedVideoSizesFor;
    final android.graphics.drawable.Drawable getInputSizeshNQ4ISI;

    LegacyDocumentVerificationOverlayResources(android.app.Activity activity, int i) {
        super(activity, i, com.microblink.blinkid.library.R.style.MB_blinkid_scan_box_overlay_style);
        this.getHighResolutionOutputSizeshNQ4ISI = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_torchOnDrawable);
        this.getInputSizeshNQ4ISI = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_torchOffDrawable);
        this.getHighSpeedVideoFpsRangesFor = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_exitScanDrawable);
        this.Camera2StreamConfigurationMap = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_frontSideSplashDrawable);
        this.getHighSpeedVideoSizesFor = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_backSideSplashDrawable);
        this.getHighSpeedVideoFpsRanges = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_frontSideInstructionsDrawable);
        this.getHighSpeedVideoSizes = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay_mb_backSideInstructionsDrawable);
    }

    @Override // com.microblink.blinkid.fragment.overlay.OverlayResources
    public final int[] IlIllIlIIl() {
        return com.microblink.blinkid.library.R.styleable.BlinkIdScanBoxOverlay;
    }
}
