package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIlIlllIIl implements com.microblink.blinkid.secured.llIlIlllll {
    public final /* synthetic */ com.microblink.blinkid.secured.IIIllIlIIl IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.secured.IIllIIllll llIIlIlIIl;

    public IIlIlllIIl(com.microblink.blinkid.secured.IIIllIlIIl iIIllIlIIl, com.microblink.blinkid.secured.IIllIIllll iIllIIllll) {
        this.IlIllIlIIl = iIIllIlIIl;
        this.llIIlIlIIl = iIllIIllll;
    }

    @Override // com.microblink.blinkid.secured.llIlIlllll
    public final com.microblink.blinkid.secured.lIllIlIlII llIIlIlIIl() {
        return new com.microblink.blinkid.hardware.camera.Camera2Frame(this.IlIllIlIIl);
    }
}
