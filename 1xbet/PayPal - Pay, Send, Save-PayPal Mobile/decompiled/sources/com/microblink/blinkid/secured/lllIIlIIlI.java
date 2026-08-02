package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllIIlIIlI implements com.microblink.blinkid.secured.lIllIlIlII {
    public final com.microblink.blinkid.hardware.camera.memory.BitmapCameraFrame IlIllIlIIl;
    public final com.microblink.blinkid.secured.IlIIlIIIII llIIlIlIIl;

    public lllIIlIIlI(com.microblink.blinkid.secured.IlIIlIIIII ilIIlIIIII) {
        this.llIIlIlIIl = ilIIlIIIII;
        byte[] bArr = ilIIlIIIII.llIIlIlIIl;
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            throw new java.lang.RuntimeException("Failed to decode photo data!");
        }
        this.IlIllIlIIl = new com.microblink.blinkid.hardware.camera.memory.BitmapCameraFrame(decodeByteArray, ilIIlIIIII.lIIIIIllll, true);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IlIllIlIIl() {
        this.IlIllIlIIl.IlIllIlIIl();
        this.llIIlIlIIl.IlIllIlIIl();
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long IllIIIIllI() {
        return this.llIIlIlIIl.lIIIIIllll;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IllIIIllII() {
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final double llIIIlllll() {
        return -1.0d;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(android.graphics.RectF rectF) {
        this.IlIllIlIIl.IllIIIllII = rectF;
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(rectF);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final boolean llIIlIlIIl(long j) {
        return this.IlIllIlIIl.llIIlIlIIl(j);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long llIIlIlIIl() {
        return this.IlIllIlIIl.IlIllIlIIl;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.IlIllIlIIl.lIlIIIIlIl = orientation;
    }
}
