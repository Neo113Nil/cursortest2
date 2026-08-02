package com.microblink.blinkid.view;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.IllIIIIllI IlIllIlIIl;
    public final /* synthetic */ java.lang.Throwable llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.view.IllIIIIllI illIIIIllI, java.lang.Throwable th) {
        this.IlIllIlIIl = illIIIIllI;
        this.llIIlIlIIl = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.view.CameraEventsListener cameraEventsListener = this.IlIllIlIIl.llIIlIlIIl.llIIlIlIIl;
        if (cameraEventsListener != null) {
            cameraEventsListener.onError(this.llIIlIlIIl);
        }
    }
}
