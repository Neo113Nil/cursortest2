package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIIIIIIII implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.microblink.blinkid.secured.IIIIlIIlIl {
    public final com.microblink.blinkid.secured.IlIlIlIIIl IlIllIlIIl;
    public final com.microblink.blinkid.secured.IlIIlllIIl IllIIIllII;
    public final com.microblink.blinkid.secured.IlIlIlllIl llIIlIlIIl;
    public int llIIIlllll = 0;
    public int IllIIIIllI = 0;
    public android.view.SurfaceHolder lIlIIIIlIl = null;
    public android.graphics.SurfaceTexture llIIlIIlll = null;

    public IIIIIIIIII(com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl, com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl, com.microblink.blinkid.secured.IlIIlllIIl ilIIlllIIl) {
        this.llIIlIlIIl = ilIlIlllIl;
        this.IlIllIlIIl = ilIlIlIIIl;
        this.IllIIIllII = ilIIlllIIl;
    }

    @Override // com.microblink.blinkid.secured.IIIIlIIlIl
    public final android.view.TextureView.SurfaceTextureListener IlIllIlIIl() {
        return this;
    }

    public final /* synthetic */ void IlIllIlIIl(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.llIIlIIlll = surfaceTexture;
        this.llIIIlllll = i;
        this.IllIIIIllI = i2;
        this.IllIIIllII.IlIllIlIIl();
    }

    public final /* synthetic */ void IllIIIllII() {
        if (this.llIIlIIlll != null) {
            com.microblink.blinkid.util.Log.i(this, "Releasing SurfaceTexture", new java.lang.Object[0]);
            this.llIIlIIlll.release();
            this.llIIlIIlll = null;
        }
    }

    @Override // com.microblink.blinkid.secured.IIIIlIIlIl
    public final android.view.SurfaceHolder.Callback llIIlIlIIl() {
        return this;
    }

    public final /* synthetic */ void llIIlIlIIl(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.llIIlIIlll = surfaceTexture;
        this.llIIIlllll = i;
        this.IllIIIIllI = i2;
        this.IllIIIllII.IlIllIlIIl();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(final android.graphics.SurfaceTexture surfaceTexture, final int i, final int i2) {
        com.microblink.blinkid.util.Log.i(this, "SurfaceTexture has become available (size: {}x{})", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (this.IllIIIllII.llIIlIlIIl.lIlIIIIlIl) {
            return;
        }
        this.IlIllIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IIIIIIIIII$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IIIIIIIIII.this.llIIlIlIIl(surfaceTexture, i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.microblink.blinkid.util.Log.i(this, "SurfaceTexture is about to be destroyed", new java.lang.Object[0]);
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.IlIllIlIIl;
        if (ilIlIlIIIl != null) {
            ilIlIlIIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IIIIIIIIII$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.IIIIIIIIII.this.IllIIIllII();
                }
            });
            return false;
        }
        com.microblink.blinkid.util.Log.i(this, "Immediately releasing SurfaceTexture", new java.lang.Object[0]);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(final android.graphics.SurfaceTexture surfaceTexture, final int i, final int i2) {
        com.microblink.blinkid.util.Log.i(this, "SurfaceTexture has changed size (new size: {}x{})", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (this.IllIIIllII.llIIlIlIIl.lIlIIIIlIl) {
            return;
        }
        this.IlIllIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IIIIIIIIII$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IIIIIIIIII.this.IlIllIlIIl(surfaceTexture, i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        com.microblink.blinkid.util.Log.d(this, "Surface changed to size: {}x{}, format: {}", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.microblink.blinkid.util.Log.i(this, "Surface has been created!", new java.lang.Object[0]);
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.llIIlIlIIl.IlIllIlIIl.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int i2 = point.y;
        this.lIlIIIIlIl = surfaceHolder;
        this.llIIIlllll = i;
        this.IllIIIIllI = i2;
        this.IllIIIllII.IlIllIlIIl();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.microblink.blinkid.util.Log.i(this, "Surface is being destroyed", new java.lang.Object[0]);
        if (this.lIlIIIIlIl != null) {
            com.microblink.blinkid.util.Log.i(this, "Removing callback from surface holder", new java.lang.Object[0]);
            this.lIlIIIIlIl.removeCallback(this);
            this.lIlIIIIlIl = null;
        }
    }

    public final void llIIlIlIIl(android.hardware.Camera camera) {
        android.view.SurfaceHolder surfaceHolder = this.lIlIIIIlIl;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.llIIlIIlll);
        }
    }
}
