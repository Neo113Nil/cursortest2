package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIlIlIIlll extends com.microblink.blinkid.secured.IllIllIIll {
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIlIIIl llIIlIlIIl;

    public IIlIlIIlll(com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl) {
        this.llIIlIlIIl = ilIIIlIIIl;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl = this.llIIlIlIIl;
        ilIIIlIIIl.lIIIIIlIlI = null;
        ilIIIlIIIl.IIIIIIIIII.llIIlIlIIl();
        com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl2 = this.llIIlIlIIl;
        ilIIIlIIIl2.IlIIIIIlll = false;
        ilIIIlIIIl2.lllIIlIIlI = false;
        ilIIIlIIIl2.IlIllIlllI.llIIlIlIIl(new java.lang.RuntimeException("Failed to configure camera capture session"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl = this.llIIlIlIIl;
        if (ilIIIlIIIl.IlllIIIllI) {
            return;
        }
        ilIIIlIIIl.lIIIIIlIlI = cameraCaptureSession;
        ilIIIlIIIl.IlIIIIIlll = false;
        ilIIIlIIIl.lllIIlIIlI = true;
        ilIIIlIIIl.lIllIIlIIl();
    }
}
