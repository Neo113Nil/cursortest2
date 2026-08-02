package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public class IIllIllIIl {
    public final com.microblink.blinkid.secured.llIlIlllll IlIllIlIIl;
    public final com.microblink.blinkid.secured.lIllIlIlII[] IllIIIllII;
    public int llIIIlllll = -1;
    public final int llIIlIlIIl;

    public IIllIllIIl(com.microblink.blinkid.secured.llIlIlllll llililllll, int i) {
        this.IlIllIlIIl = llililllll;
        this.IllIIIllII = new com.microblink.blinkid.secured.lIllIlIlII[i];
        this.llIIlIlIIl = i - 1;
    }

    public com.microblink.blinkid.secured.lIllIlIlII llIIlIlIIl() {
        com.microblink.blinkid.secured.lIllIlIlII lillililii;
        synchronized (this) {
            int i = this.llIIIlllll;
            if (i == -1) {
                lillililii = this.IlIllIlIIl.llIIlIlIIl();
            } else {
                com.microblink.blinkid.secured.lIllIlIlII lillililii2 = this.IllIIIllII[i];
                this.llIIIlllll = i - 1;
                lillililii = lillililii2;
            }
            lillililii.IllIIIllII();
        }
        return lillililii;
    }
}
