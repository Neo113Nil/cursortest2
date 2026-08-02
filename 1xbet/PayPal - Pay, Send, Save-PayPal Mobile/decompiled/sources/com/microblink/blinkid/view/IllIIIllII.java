package com.microblink.blinkid.view;

/* loaded from: classes10.dex */
public final class IllIIIllII implements java.lang.Runnable {
    public final /* synthetic */ int IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.view.IllIIIIllI IllIIIllII;
    public final /* synthetic */ int llIIlIlIIl;

    public IllIIIllII(com.microblink.blinkid.view.IllIIIIllI illIIIIllI, int i, int i2) {
        this.IllIIIllII = illIIIIllI;
        this.llIIlIlIIl = i;
        this.IlIllIlIIl = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.microblink.blinkid.view.surface.ICameraView] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0 = this.IllIIIllII.llIIlIlIIl.IllIIIIllI;
        if (r0 != 0) {
            r0.setPreviewSize(this.llIIlIlIIl, this.IlIllIlIIl);
        }
    }
}
