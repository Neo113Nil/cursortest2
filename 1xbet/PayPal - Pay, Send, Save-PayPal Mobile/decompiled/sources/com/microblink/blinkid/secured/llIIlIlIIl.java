package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIIlIlIIl extends java.util.TimerTask {
    public final /* synthetic */ com.microblink.blinkid.secured.IlIllIlIIl IlIllIlIIl;
    public final float[] llIIlIlIIl = {0.0f, 0.0f, 0.0f};

    public llIIlIlIIl(com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl) {
        this.IlIllIlIIl = ilIllIlIIl;
    }

    public final /* synthetic */ void llIIlIlIIl() {
        this.IlIllIlIIl.llIIlIlIIl(this.llIIlIlIIl);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.IlIllIlIIl.lIIIIIllll.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llIIlIlIIl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.llIIlIlIIl.this.llIIlIlIIl();
            }
        });
    }
}
