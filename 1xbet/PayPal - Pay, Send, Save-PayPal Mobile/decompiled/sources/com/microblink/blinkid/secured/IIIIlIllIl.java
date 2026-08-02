package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIIlIllIl implements android.view.SurfaceHolder.Callback {
    public final /* synthetic */ com.microblink.blinkid.secured.lIlIIIlIll llIIlIlIIl;

    public IIIIlIllIl(com.microblink.blinkid.secured.lIlIIIlIll liliiilill) {
        this.llIIlIlIIl = liliiilill;
    }

    public final void llIIlIlIIl() {
        this.llIIlIlIIl.IlIllIlIIl.llIIlIlIIl.IllIIlIIII();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        com.microblink.blinkid.util.Log.d(this, "Surface changed to size: {}x{}, format: {}", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i));
        com.microblink.blinkid.secured.lIlIIIlIll liliiilill = this.llIIlIlIIl;
        com.microblink.blinkid.secured.lIllIIIlll lilliiilll = liliiilill.lIlIIIIlIl;
        if (lilliiilll == null || lilliiilll.llIIlIlIIl != i2 || lilliiilll.IlIllIlIIl != i3 || liliiilill.IllIIIllII == null) {
            return;
        }
        com.microblink.blinkid.util.Log.d(this, "Setting surface holder fixed size to {}", lilliiilll);
        com.microblink.blinkid.secured.lIlIIIlIll liliiilill2 = this.llIIlIlIIl;
        android.view.SurfaceHolder surfaceHolder2 = liliiilill2.IllIIIllII;
        com.microblink.blinkid.secured.lIllIIIlll lilliiilll2 = liliiilill2.lIlIIIIlIl;
        surfaceHolder2.setFixedSize(lilliiilll2.llIIlIlIIl, lilliiilll2.IlIllIlIIl);
        com.microblink.blinkid.secured.lIlIIIlIll liliiilill3 = this.llIIlIlIIl;
        liliiilill3.llIIIlllll = true;
        liliiilill3.llIIlIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.IIIIlIllIl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.secured.IIIIlIllIl.this.llIIlIlIIl();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.microblink.blinkid.util.Log.i(this, "Surface has been created!", new java.lang.Object[0]);
        com.microblink.blinkid.secured.lIlIIIlIll liliiilill = this.llIIlIlIIl;
        liliiilill.IllIIIllII = surfaceHolder;
        com.microblink.blinkid.secured.lIllIIIlll lilliiilll = liliiilill.lIlIIIIlIl;
        if (lilliiilll != null) {
            surfaceHolder.setFixedSize(lilliiilll.llIIlIlIIl, lilliiilll.IlIllIlIIl);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.microblink.blinkid.util.Log.i(this, "Surface is being destroyed", new java.lang.Object[0]);
        if (this.llIIlIlIIl.IllIIIllII != null) {
            com.microblink.blinkid.util.Log.i(this, "Removing callback from surface holder", new java.lang.Object[0]);
            this.llIIlIlIIl.IllIIIllII.removeCallback(this);
            this.llIIlIlIIl.IllIIIllII = null;
        }
    }
}
