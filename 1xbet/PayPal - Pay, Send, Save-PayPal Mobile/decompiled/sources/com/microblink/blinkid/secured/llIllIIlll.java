package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIllIIlll implements android.hardware.Camera.PictureCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.lIllIIlIIl IlIllIlIIl;
    public long llIIlIlIIl = com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor.DEFAULT_FRAME_TIME_US;

    public llIllIIlll(com.microblink.blinkid.secured.lIllIIlIIl lilliiliil) {
        this.IlIllIlIIl = lilliiliil;
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.IlIIlIIIII ilIIlIIIII) {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.IlIllIlIIl.lIIIIIlIlI;
        if (ilIllIIlIl != null) {
            ilIllIIlIl.IIlIIIllIl();
            ilIllIIlIl.IllIIIIllI();
        }
        this.IlIllIlIIl.lIlIIIIlIl = true;
        this.IlIllIlIIl.IlIlIlIIlI = 1;
        com.microblink.blinkid.secured.lIlIllIIlI lililliili = this.IlIllIlIIl.IllIIIllII;
        if (lililliili != null) {
            lililliili.onHighResFrame(ilIIlIIIII);
        }
        ilIIlIIIII.IlIllIlIIl();
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
        com.microblink.blinkid.util.Log.i(this, "on picture taken", new java.lang.Object[0]);
        if (bArr == null) {
            this.IlIllIlIIl.IlIlIlIIlI = 1;
            return;
        }
        this.IlIllIlIIl.lIlIIIIlIl = false;
        this.IlIllIlIIl.llIIlIlIIl.stopPreview();
        android.hardware.Camera.Size pictureSize = camera.getParameters().getPictureSize();
        final com.microblink.blinkid.secured.IlIIlIIIII ilIIlIIIII = new com.microblink.blinkid.secured.IlIIlIIIII(pictureSize.width, pictureSize.height);
        ilIIlIIIII.llIIIlllll = true;
        ilIIlIIIII.IllIIIIllI = false;
        ilIIlIIIII.llIIlIlIIl = bArr;
        long j = this.llIIlIlIIl;
        this.llIIlIlIIl = 1 + j;
        ilIIlIIIII.lIIIIIllll = j;
        try {
            com.microblink.blinkid.secured.lIllIIlIIl lilliiliil = this.IlIllIlIIl;
            lilliiliil.llIIlIlIIl.setPreviewCallbackWithBuffer(lilliiliil.IIIIIIIIII);
            this.IlIllIlIIl.llIIlIlIIl.startPreview();
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.IlIllIlIIl.lllllIlIll;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.llIllIIlll$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.llIllIIlll.this.llIIlIlIIl(ilIIlIIIII);
                }
            };
            long j2 = this.IlIllIlIIl.llIIIlllll.IllIIIllII;
            ilIlIlIIIl.llIIIlllll();
            if (ilIlIlIIIl.IllIIIIllI.get()) {
                com.microblink.blinkid.util.Log.w(ilIlIlIIIl, "Processing queue {} is exiting, unable to post job to it", ilIlIlIIIl.llIIIlllll);
            } else {
                ilIlIlIIIl.llIIlIlIIl.postDelayed(runnable, j2);
            }
        } catch (java.lang.RuntimeException e) {
            com.microblink.blinkid.util.Log.e(this, e, "Unable to restart camera preview", new java.lang.Object[0]);
        }
    }
}
