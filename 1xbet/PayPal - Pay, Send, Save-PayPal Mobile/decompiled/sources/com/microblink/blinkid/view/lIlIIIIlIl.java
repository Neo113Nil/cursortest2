package com.microblink.blinkid.view;

/* loaded from: classes10.dex */
public final class lIlIIIIlIl implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.BaseCameraView.BaseCameraListener IlIllIlIIl;
    public final /* synthetic */ android.graphics.Rect[] llIIlIlIIl;

    public lIlIIIIlIl(com.microblink.blinkid.view.BaseCameraView.BaseCameraListener baseCameraListener, android.graphics.Rect[] rectArr) {
        this.IlIllIlIIl = baseCameraListener;
        this.llIIlIlIIl = rectArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.IlIllIlIIl.getHighSpeedVideoFpsRanges.llIIlIlIIl.onAutofocusStarted(com.microblink.blinkid.view.BaseCameraView.getHighSpeedVideoSizes(this.IlIllIlIIl.getHighSpeedVideoFpsRanges, this.llIIlIlIIl));
    }
}
