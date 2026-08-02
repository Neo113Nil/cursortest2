package com.microblink.blinkid.view;

/* loaded from: classes10.dex */
public final class IlIllIlIIl implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.IllIIIIllI llIIlIlIIl;

    public IlIllIlIIl(com.microblink.blinkid.view.IllIIIIllI illIIIIllI) {
        this.llIIlIlIIl = illIIIIllI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        com.microblink.blinkid.view.CameraEventsListener cameraEventsListener;
        z = this.llIIlIlIIl.llIIlIlIIl.getInputSizeshNQ4ISI;
        if (!z || (cameraEventsListener = this.llIIlIlIIl.llIIlIlIIl.llIIlIlIIl) == null) {
            return;
        }
        cameraEventsListener.onCameraPreviewStarted();
    }
}
