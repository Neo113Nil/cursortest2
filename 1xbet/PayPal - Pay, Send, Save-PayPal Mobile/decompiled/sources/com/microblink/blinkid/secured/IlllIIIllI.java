package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlllIIIllI implements com.microblink.blinkid.secured.llIlIlllll {
    public final /* synthetic */ int IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.secured.lIllIIlIIl IllIIIIllI;
    public final /* synthetic */ int IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIIIlll lIlIIIIlIl;
    public final /* synthetic */ int llIIIlllll;
    public final /* synthetic */ com.microblink.blinkid.secured.IIllIIllll llIIlIlIIl;

    public IlllIIIllI(com.microblink.blinkid.secured.IlIIIIIlll ilIIIIIlll, com.microblink.blinkid.secured.IIllIIllll iIllIIllll, int i, int i2, int i3, com.microblink.blinkid.secured.lIllIIlIIl lilliiliil) {
        this.lIlIIIIlIl = ilIIIIIlll;
        this.llIIlIlIIl = iIllIIllll;
        this.IlIllIlIIl = i;
        this.IllIIIllII = i2;
        this.llIIIlllll = i3;
        this.IllIIIIllI = lilliiliil;
    }

    @Override // com.microblink.blinkid.secured.llIlIlllll
    public final com.microblink.blinkid.secured.lIllIlIlII llIIlIlIIl() {
        return new com.microblink.blinkid.hardware.camera.Camera1Frame(this.IlIllIlIIl, this.IllIIIllII, this.llIIIlllll, this.lIlIIIIlIl, this.IllIIIIllI);
    }
}
