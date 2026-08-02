package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class lIIIIIllll implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.IlIllIlllI IlIllIlIIl;
    public final /* synthetic */ java.lang.Throwable llIIlIlIIl;

    public lIIIIIllll(com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI, java.lang.Throwable th) {
        this.IlIllIlIIl = ilIllIlllI;
        this.llIIlIlIIl = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.view.CameraEventsListener cameraEventsListener;
        cameraEventsListener = this.IlIllIlIIl.llIIlIlIIl.llIIlIlIIl;
        cameraEventsListener.onError(this.llIIlIlIIl);
    }
}
