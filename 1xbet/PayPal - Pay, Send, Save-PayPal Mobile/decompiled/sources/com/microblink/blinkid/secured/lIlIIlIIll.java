package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIlIIll implements com.microblink.blinkid.secured.lIIlIIlIll {
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIlIIIl llIIlIlIIl;

    public lIlIIlIIll(com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl) {
        this.llIIlIlIIl = ilIIIlIIIl;
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final boolean IlIllIlIIl() {
        com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.llIIlIlIIl.llIIlIlIIl;
        return ilIllIlIIl == null || ilIllIlIIl.IllIIIllII.get();
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final void IllIIIllII() {
        com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl = this.llIIlIlIIl;
        int i = ilIIIlIIIl.IIIIIIIIII.llIIlIIlll;
        if (i == 4 || i == 3) {
            return;
        }
        ilIIIlIIIl.llIIlIlIIl(ilIIIlIIIl.IlIIlllIIl);
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final boolean canReceiveFrame() {
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = this.llIIlIlIIl.lllIIIlIlI;
        return lililliili != null && lililliili.canReceiveFrame();
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final void llIIlIlIIl(com.microblink.blinkid.secured.IlIllIlllI ilIllIlllI) {
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = this.llIIlIlIIl.lllIIIlIlI;
        if (lililliili != null) {
            lililliili.onCameraFrame(ilIllIlllI);
        }
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final boolean llIIlIlIIl() {
        int i = this.llIIlIlIIl.llIIlIIlll.IllIIIllII;
        return i == 4 || i == 2;
    }
}
