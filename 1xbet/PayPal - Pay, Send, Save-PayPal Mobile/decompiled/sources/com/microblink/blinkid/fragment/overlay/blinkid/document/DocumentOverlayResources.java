package com.microblink.blinkid.fragment.overlay.blinkid.document;

@java.lang.Deprecated
/* loaded from: classes10.dex */
class DocumentOverlayResources extends com.microblink.blinkid.fragment.overlay.OverlayResources {
    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges;
    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    final android.graphics.drawable.Drawable getHighSpeedVideoSizes;

    DocumentOverlayResources(android.app.Activity activity, int i) {
        super(activity, i, com.microblink.blinkid.library.R.style.MB_default_simple_box_overlay_style);
        this.getHighSpeedVideoFpsRanges = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdSimpleBoxOverlay_mb_torchOnDrawable);
        this.getHighSpeedVideoSizes = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdSimpleBoxOverlay_mb_torchOffDrawable);
        this.getHighSpeedVideoFpsRangesFor = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdSimpleBoxOverlay_mb_exitScanDrawable);
    }

    @Override // com.microblink.blinkid.fragment.overlay.OverlayResources
    public final int[] IlIllIlIIl() {
        return com.microblink.blinkid.library.R.styleable.BlinkIdSimpleBoxOverlay;
    }
}
