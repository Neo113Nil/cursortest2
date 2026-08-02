package com.microblink.blinkid.view;

/* loaded from: classes10.dex */
public final class IllIIIIllI {
    public final /* synthetic */ com.microblink.blinkid.view.BaseCameraView llIIlIlIIl;

    public IllIIIIllI(com.microblink.blinkid.view.BaseCameraView baseCameraView) {
        this.llIIlIlIIl = baseCameraView;
    }

    public final void IlIllIlIIl() {
        this.llIIlIlIIl.IIlIIIllIl();
        this.llIIlIlIIl.getInputSizeshNQ4ISI = false;
        com.microblink.blinkid.view.BaseCameraView baseCameraView = this.llIIlIlIIl;
        if (baseCameraView.llIIlIlIIl != null) {
            baseCameraView.llIIlIlIIl(new com.microblink.blinkid.view.llIIIlllll(this));
        }
    }

    public final void llIIlIlIIl(java.lang.Throwable th) {
        android.os.Handler handler;
        com.microblink.blinkid.util.Log.e(this.llIIlIlIIl, th, "Exception caught on camera startup", new java.lang.Object[0]);
        this.llIIlIlIIl.getInputSizeshNQ4ISI = false;
        com.microblink.blinkid.view.BaseCameraView baseCameraView = this.llIIlIlIIl;
        baseCameraView.IlIllIlIIl = true;
        handler = baseCameraView.getInputFormats;
        handler.post(new com.microblink.blinkid.view.llIIlIlIIl(this, th));
    }

    public final void llIIlIlIIl() {
        this.llIIlIlIIl.llIIlIIlll();
        this.llIIlIlIIl.getInputSizeshNQ4ISI = true;
        com.microblink.blinkid.view.BaseCameraView baseCameraView = this.llIIlIlIIl;
        if (baseCameraView.llIIlIlIIl != null) {
            baseCameraView.llIIlIlIIl(new com.microblink.blinkid.view.IlIllIlIIl(this));
        }
    }

    public final void llIIlIlIIl(int i, int i2) {
        android.os.Handler handler;
        handler = this.llIIlIlIIl.getInputFormats;
        handler.post(new com.microblink.blinkid.view.IllIIIllII(this, i, i2));
    }
}
