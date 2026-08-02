package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIlIlIlIl implements com.microblink.blinkid.secured.lIIlIIlIll {
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIlIIIl llIIlIlIIl;

    public llIlIlIlIl(com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl) {
        this.llIIlIlIIl = ilIIIlIIIl;
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final boolean IlIllIlIIl() {
        com.microblink.blinkid.secured.IlIllIlIIl ilIllIlIIl = this.llIIlIlIIl.llIIlIlIIl;
        return ilIllIlIIl != null && ilIllIlIIl.IllIIIllII.get();
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final void IllIIIllII() {
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final boolean canReceiveFrame() {
        return true;
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final void llIIlIlIIl(com.microblink.blinkid.secured.IlIllIlllI ilIllIlllI) {
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = this.llIIlIlIIl.lllIIIlIlI;
        if (lililliili != null) {
            lililliili.onHighResFrame(ilIllIlllI);
        }
        ilIllIlllI.IlIllIlIIl();
    }

    @Override // com.microblink.blinkid.secured.lIIlIIlIll
    public final boolean llIIlIlIIl() {
        int i = this.llIIlIlIIl.llIIlIIlll.IllIIIllII;
        return i == 4 || i == 2;
    }
}
