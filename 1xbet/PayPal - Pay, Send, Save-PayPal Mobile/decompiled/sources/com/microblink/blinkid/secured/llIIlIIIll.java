package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class llIIlIIIll implements com.microblink.blinkid.secured.lIllIlIlII {
    public com.microblink.blinkid.hardware.orientation.Orientation IIlIIIllIl;
    public final int IlIllIlIIl;
    public boolean IllIIIIllI;
    public final int IllIIIllII;
    public long lIIIIIllll;
    public android.graphics.RectF lIlIIIIlIl;
    public boolean llIIIlllll;
    public long llIIlIIlll = 0;
    public byte[] llIIlIlIIl;

    public llIIlIIIll(int i, int i2, int i3) {
        this.llIIlIlIIl = null;
        this.IlIllIlIIl = i;
        this.IllIIIllII = i2;
        if (i3 > 0) {
            this.llIIlIlIIl = new byte[i3];
        }
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long IllIIIIllI() {
        return this.lIIIIIllll;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public void IllIIIllII() {
        this.lIlIIIIlIl = null;
        this.IIlIIIllIl = null;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(android.graphics.RectF rectF) {
        this.lIlIIIIlIl = rectF;
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(rectF);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.IIlIIIllIl = orientation;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public long llIIlIlIIl() {
        return this.llIIlIIlll;
    }
}
