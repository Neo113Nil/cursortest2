package com.microblink.blinkid.view.viewfinder.managers;

/* loaded from: classes10.dex */
public final class IlIllIlIIl implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.managers.IllIIIllII llIIlIlIIl;

    public IlIllIlIIl(com.microblink.blinkid.view.viewfinder.managers.IllIIIllII illIIIllII) {
        this.llIIlIlIIl = illIIIllII;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        viewfinderShapeView = this.llIIlIlIIl.IllIIIllII.getHighResolutionOutputSizeshNQ4ISI;
        viewfinderShapeView.setInnerAlpha(0.0f);
        imageView = this.llIIlIlIIl.IllIIIllII.getHighSpeedVideoFpsRangesFor;
        imageView.setVisibility(4);
        textView = this.llIIlIlIIl.IllIIIllII.Camera2StreamConfigurationMap;
        textView.setVisibility(4);
        java.lang.Runnable runnable = this.llIIlIlIIl.IlIllIlIIl;
        if (runnable != null) {
            runnable.run();
        }
    }
}
