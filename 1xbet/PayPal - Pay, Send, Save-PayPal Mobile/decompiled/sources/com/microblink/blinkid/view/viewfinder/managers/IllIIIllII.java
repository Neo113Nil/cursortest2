package com.microblink.blinkid.view.viewfinder.managers;

/* loaded from: classes10.dex */
public final class IllIIIllII implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Runnable IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.managers.DocumentViewfinderManager IllIIIllII;
    public final /* synthetic */ long llIIlIlIIl;

    public IllIIIllII(com.microblink.blinkid.view.viewfinder.managers.DocumentViewfinderManager documentViewfinderManager, long j, java.lang.Runnable runnable) {
        this.IllIIIllII = documentViewfinderManager;
        this.llIIlIlIIl = j;
        this.IlIllIlIIl = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView;
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        long j = this.llIIlIlIIl;
        com.microblink.blinkid.view.viewfinder.managers.IlIllIlIIl ilIllIlIIl = new com.microblink.blinkid.view.viewfinder.managers.IlIllIlIIl(this);
        viewfinderShapeView = this.IllIIIllII.getHighResolutionOutputSizeshNQ4ISI;
        textView = this.IllIIIllII.Camera2StreamConfigurationMap;
        imageView = this.IllIIIllII.getHighSpeedVideoFpsRangesFor;
        com.microblink.blinkid.view.viewfinder.managers.ViewfinderAnimationUtil.createSplashAnimation(j, ilIllIlIIl, viewfinderShapeView, textView, imageView).start();
    }
}
