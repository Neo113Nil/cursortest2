package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllIllIlll {
    public final /* synthetic */ com.microblink.blinkid.secured.IIIIIIIlII llIIlIlIIl;

    public IllIllIlll(com.microblink.blinkid.secured.IIIIIIIlII iIIIIIIlII) {
        this.llIIlIlIIl = iIIIIIIlII;
    }

    public final void llIIlIlIIl(android.media.Image image) {
        image.close();
        int decrementAndGet = this.llIIlIlIIl.IllIIIIllI.decrementAndGet();
        com.microblink.blinkid.util.Log.v(this, "[close] Active images: {}", java.lang.Integer.valueOf(decrementAndGet));
        if (decrementAndGet != 0 || !this.llIIlIlIIl.lIlIIIIlIl.get()) {
            this.llIIlIlIIl.llIIIlllll.IllIIIllII();
        } else {
            com.microblink.blinkid.util.Log.i(this, "Closing image reader", new java.lang.Object[0]);
            this.llIIlIlIIl.llIIlIlIIl();
        }
    }
}
