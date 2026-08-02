package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIIlIll implements com.microblink.blinkid.secured.IIIIlIIlIl {
    public final com.microblink.blinkid.secured.lIIIlIIllI IlIllIlIIl;
    public com.microblink.blinkid.secured.lIllIIIlll lIlIIIIlIl;
    public final com.microblink.blinkid.secured.IllllIlIIl llIIlIlIIl;
    public android.view.SurfaceHolder IllIIIllII = null;
    public boolean llIIIlllll = false;
    public android.graphics.SurfaceTexture IllIIIIllI = null;
    public final com.microblink.blinkid.secured.IIIIlIllIl llIIlIIlll = new com.microblink.blinkid.secured.IIIIlIllIl(this);
    public final com.microblink.blinkid.secured.llllIllllI IIlIIIllIl = new com.microblink.blinkid.secured.llllIllllI(this);

    public lIlIIIlIll(com.microblink.blinkid.secured.IllllIlIIl illllIlIIl, com.microblink.blinkid.secured.lIIIlIIllI liiiliilli) {
        this.llIIlIlIIl = illllIlIIl;
        this.IlIllIlIIl = liiiliilli;
    }

    @Override // com.microblink.blinkid.secured.IIIIlIIlIl
    public final android.view.TextureView.SurfaceTextureListener IlIllIlIIl() {
        return this.IIlIIIllIl;
    }

    public final android.view.Surface IllIIIllII() {
        android.view.SurfaceHolder surfaceHolder = this.IllIIIllII;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurface();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.IllIIIIllI;
        com.microblink.blinkid.secured.lIllIIIlll lilliiilll = this.lIlIIIIlIl;
        surfaceTexture.setDefaultBufferSize(lilliiilll.llIIlIlIIl, lilliiilll.IlIllIlIIl);
        return new android.view.Surface(this.IllIIIIllI);
    }

    public final void llIIIlllll() {
        android.view.SurfaceHolder surfaceHolder = this.IllIIIllII;
        if (surfaceHolder != null) {
            com.microblink.blinkid.secured.lIllIIIlll lilliiilll = this.lIlIIIIlIl;
            surfaceHolder.setFixedSize(lilliiilll.llIIlIlIIl, lilliiilll.IlIllIlIIl);
        }
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.lIllIIIlll lilliiilll, com.microblink.blinkid.secured.lIlIIllIll liliillill) {
        this.lIlIIIIlIl = lilliiilll;
        if (this.IllIIIllII != null) {
            liliillill.llIIlIlIIl.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIlIIIlIll$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.lIlIIIlIll.this.llIIIlllll();
                }
            });
        }
    }

    @Override // com.microblink.blinkid.secured.IIIIlIIlIl
    public final android.view.SurfaceHolder.Callback llIIlIlIIl() {
        return this.llIIlIIlll;
    }
}
