package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIllIll implements com.microblink.blinkid.secured.IllllIlIIl {
    public final android.os.Handler llIIlIlIIl = new android.os.Handler();

    @Override // com.microblink.blinkid.secured.IllllIlIIl
    public final void llIIlIlIIl(java.lang.Runnable runnable) {
        this.llIIlIlIIl.post(runnable);
    }

    @Override // com.microblink.blinkid.secured.IllllIlIIl
    public final android.os.Handler llIIlIlIIl() {
        return this.llIIlIlIIl;
    }
}
