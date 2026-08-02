package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllllIlIll implements android.hardware.Camera.PreviewCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.lIllIIlIIl IlIllIlIIl;
    public long llIIlIlIIl = 0;

    public lllllIlIll(com.microblink.blinkid.secured.lIllIIlIIl lilliiliil) {
        this.IlIllIlIIl = lilliiliil;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.microblink.blinkid.secured.lIllIIlIIl lilliiliil = this.IlIllIlIIl;
        com.microblink.blinkid.secured.IlIIIIIlll ilIIIIIlll = lilliiliil.llIIlIIlll;
        if (ilIIIIIlll == null) {
            com.microblink.blinkid.util.Log.w(lilliiliil, "Cannot obtain frame by its buffer because frame pool has been disposed", new java.lang.Object[0]);
            return;
        }
        com.microblink.blinkid.secured.IlIlIlIIlI ilIlIlIIlI = ilIIIIIlll.llIIlIlIIl;
        com.microblink.blinkid.hardware.camera.Camera1Frame camera1Frame = null;
        if (ilIlIlIIlI != null) {
            synchronized (ilIlIlIIlI) {
                java.util.HashMap hashMap = ilIlIlIIlI.IllIIIIllI;
                if (hashMap != null) {
                    com.microblink.blinkid.hardware.camera.Camera1Frame camera1Frame2 = (com.microblink.blinkid.hardware.camera.Camera1Frame) hashMap.get(bArr);
                    if (camera1Frame2 != null) {
                        camera1Frame2.IllIIIllII();
                        camera1Frame = camera1Frame2;
                    }
                }
            }
        }
        if (camera1Frame == null) {
            com.microblink.blinkid.util.Log.d(this.IlIllIlIIl, "Cannot find frame by its buffer. This is OK if buffered callback is disabled. Otherwise this is an error!", new java.lang.Object[0]);
            camera1Frame = (com.microblink.blinkid.hardware.camera.Camera1Frame) this.IlIllIlIIl.llIIlIIlll.llIIlIlIIl.llIIlIlIIl();
            camera1Frame.llIIlIlIIl = bArr;
        }
        long j = this.llIIlIlIIl;
        this.llIIlIlIIl = 1 + j;
        camera1Frame.lIIIIIllll = j;
        camera1Frame.IllIIIIllI = this.IlIllIlIIl.IlIllIlIIl.IllIIIllII.get();
        camera1Frame.llIIIlllll = this.IlIllIlIIl.llIIlIlIIl();
        com.microblink.blinkid.util.Log.v(this.IlIllIlIIl, "Frame {} has arrived from camera", java.lang.Long.valueOf(camera1Frame.lIIIIIllll));
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = this.IlIllIlIIl.IllIIIllII;
        if (lililliili == null || !lililliili.canReceiveFrame()) {
            camera1Frame.IlIllIlIIl();
        } else {
            this.IlIllIlIIl.IllIIIllII.onCameraFrame(camera1Frame);
        }
    }
}
