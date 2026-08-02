package com.microblink.blinkid.fragment.overlay.blinkid.settings.options;

/* loaded from: classes10.dex */
public interface BlinkIdOverlaySettingsOptions<T> {
    public static final long DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS = 12000;

    T isHighResSuccessFrameCaptureEnabled(boolean z);

    T setBackSideScanningTimeoutMs(long j);

    T setBeepResourceId(int i);

    T setCameraSettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings);

    T setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener);

    T setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener);

    T setDocumentDataMatchRequired(boolean z);

    T setLockedToPortrait(boolean z);

    T setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode);

    T setScanUIEventListener(com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener);

    T setShowMrzDots(boolean z);

    T setShowNotSupportedDialog(boolean z);

    T setShowTooltipTimeIntervalMs(long j);

    T setSplashResourceId(int i);
}
