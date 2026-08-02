package com.microblink.blinkid.view.viewfinder.managers;

/* loaded from: classes10.dex */
public class DocumentViewfinderManager {
    private final android.widget.TextView Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.view.viewfinder.ViewfinderShapeView getHighResolutionOutputSizeshNQ4ISI;
    private final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());
    private final android.widget.ImageView getHighSpeedVideoFpsRangesFor;

    public DocumentViewfinderManager(com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.getHighResolutionOutputSizeshNQ4ISI = viewfinderShapeView;
        this.Camera2StreamConfigurationMap = textView;
        this.getHighSpeedVideoFpsRangesFor = imageView;
    }

    public void clearSplashScreen(long j, long j2) {
        clearSplashScreen(j, j2, null);
    }

    public void showSplashScreen(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i) {
        this.getHighSpeedVideoFpsRanges.post(new com.microblink.blinkid.view.viewfinder.managers.llIIlIlIIl(this, drawable, charSequence, i));
    }

    public void clearSplashScreen(long j, long j2, java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRanges.postDelayed(new com.microblink.blinkid.view.viewfinder.managers.IllIIIllII(this, j2, runnable), j);
    }
}
