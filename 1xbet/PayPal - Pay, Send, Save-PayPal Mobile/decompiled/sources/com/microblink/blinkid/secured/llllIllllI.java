package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llllIllllI implements android.view.TextureView.SurfaceTextureListener {
    public final /* synthetic */ com.microblink.blinkid.secured.lIlIIIlIll llIIlIlIIl;

    public llllIllllI(com.microblink.blinkid.secured.lIlIIIlIll liliiilill) {
        this.llIIlIlIIl = liliiilill;
    }

    public final void IlIllIlIIl(android.graphics.SurfaceTexture surfaceTexture) {
        com.microblink.blinkid.secured.lIlIIIlIll liliiilill = this.llIIlIlIIl;
        liliiilill.IllIIIIllI = surfaceTexture;
        liliiilill.IlIllIlIIl.llIIlIlIIl.IllIIlIIII();
    }

    public final /* synthetic */ void llIIlIlIIl(android.graphics.SurfaceTexture surfaceTexture) {
        this.llIIlIlIIl.IllIIIIllI = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(final android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.microblink.blinkid.util.Log.i(this, "SurfaceTexture has become available (size: {}x{})", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (this.llIIlIlIIl.IlIllIlIIl.llIIlIlIIl.IlIlIlIIlI.get()) {
            return;
        }
        this.llIIlIlIIl.llIIlIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llllIllllI$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.llllIllllI.this.llIIlIlIIl(surfaceTexture);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.microblink.blinkid.util.Log.i(this, "SurfaceTexture is about to be destroyed", new java.lang.Object[0]);
        com.microblink.blinkid.secured.IllllIlIIl illllIlIIl = this.llIIlIlIIl.llIIlIlIIl;
        if (illllIlIIl == null) {
            com.microblink.blinkid.util.Log.i(this, "Immediately releasing SurfaceTexture", new java.lang.Object[0]);
            return true;
        }
        illllIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llllIllllI$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.llllIllllI.this.llIIlIlIIl();
            }
        });
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(final android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.microblink.blinkid.util.Log.i(this, "SurfaceTexture has changed size (new size: {}x{})", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (this.llIIlIlIIl.IlIllIlIIl.llIIlIlIIl.IlIlIlIIlI.get()) {
            return;
        }
        this.llIIlIlIIl.llIIlIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llllIllllI$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.llllIllllI.this.IlIllIlIIl(surfaceTexture);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public final void llIIlIlIIl() {
        if (this.llIIlIlIIl.IllIIIIllI != null) {
            com.microblink.blinkid.util.Log.i(this, "Releasing SurfaceTexture", new java.lang.Object[0]);
            this.llIIlIlIIl.IllIIIIllI.release();
            this.llIIlIlIIl.IllIIIIllI = null;
        }
    }
}
