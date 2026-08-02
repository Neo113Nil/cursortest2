package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIlIlll implements android.media.ImageReader.OnImageAvailableListener {
    public final /* synthetic */ com.microblink.blinkid.secured.IIIIIIIlII llIIlIlIIl;

    public lIlIIlIlll(com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII) {
        this.llIIlIlIIl = iIIIIIIlII;
    }

    public final /* synthetic */ void llIIlIlIIl(com.microblink.blinkid.secured.IlIllIlllI ilIllIlllI) {
        if (this.llIIlIlIIl.llIIIlllll.canReceiveFrame()) {
            this.llIIlIlIIl.llIIIlllll.llIIlIlIIl(ilIllIlllI);
        } else {
            ilIllIlllI.IlIllIlIIl();
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image image;
        try {
            image = imageReader.acquireNextImage();
            if (image != null) {
                try {
                    com.microblink.blinkid.util.Log.v(this, "[acquire] Active images: {}", java.lang.Integer.valueOf(this.llIIlIlIIl.IllIIIIllI.incrementAndGet()));
                    if (!this.llIIlIlIIl.llIIIlllll.canReceiveFrame()) {
                        this.llIIlIlIIl.lIIIIIllll.llIIlIlIIl(image);
                        return;
                    }
                    final com.microblink.blinkid.secured.IlIllIlllI ilIllIlllI = (com.microblink.blinkid.secured.IlIllIlllI) this.llIIlIlIIl.IllIIIllII.llIIlIlIIl.llIIlIlIIl();
                    com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII = this.llIIlIlIIl;
                    com.microblink.blinkid.secured.IllIllIlll illIllIlll = iIIIIIIlII.lIIIIIllll;
                    ilIllIlllI.llIIlIlIIl = image;
                    ilIllIlllI.IllIIIllII = illIllIlll;
                    ilIllIlllI.llIIIlllll = iIIIIIIlII.llIIIlllll.llIIlIlIIl();
                    ilIllIlllI.IllIIIIllI = this.llIIlIlIIl.llIIIlllll.IlIllIlIIl();
                    com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII2 = this.llIIlIlIIl;
                    long j = iIIIIIIlII2.llIIlIIlll;
                    iIIIIIIlII2.llIIlIIlll = 1 + j;
                    ilIllIlllI.lllIIIlIlI = j;
                    iIIIIIIlII2.IlIllIlIIl.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIlIIlIlll$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.microblink.blinkid.secured.lIlIIlIlll.this.llIIlIlIIl(ilIllIlllI);
                        }
                    });
                } catch (java.lang.Exception e) {
                    e = e;
                    com.microblink.blinkid.util.Log.e(this, e, "Failed to acquire latest image!", new java.lang.Object[0]);
                    if (image != null) {
                        this.llIIlIlIIl.lIIIIIllll.llIIlIlIIl(image);
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            image = null;
        }
    }
}
