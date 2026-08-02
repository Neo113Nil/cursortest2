package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIIIIIlII {
    public final com.microblink.blinkid.secured.IlIlIlIIIl IlIllIlIIl;
    public com.microblink.blinkid.secured.IIIllIlIIl IllIIIllII;
    public final com.microblink.blinkid.secured.lIIlIIlIll llIIIlllll;
    public android.media.ImageReader llIIlIlIIl;
    public final java.util.concurrent.atomic.AtomicInteger IllIIIIllI = new java.util.concurrent.atomic.AtomicInteger(0);
    public java.util.concurrent.atomic.AtomicBoolean lIlIIIIlIl = new java.util.concurrent.atomic.AtomicBoolean(false);
    public long llIIlIIlll = 0;
    public final com.microblink.blinkid.secured.lIlIIlIlll IIlIIIllIl = new com.microblink.blinkid.secured.lIlIIlIlll(this);
    public final com.microblink.blinkid.secured.IllIllIlll lIIIIIllll = new com.microblink.blinkid.secured.IllIllIlll(this);

    public IIIIIIIlII(com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl, com.microblink.blinkid.secured.lIIlIIlIll liiliilill) {
        this.llIIIlllll = liiliilill;
        this.IlIllIlIIl = ilIlIlIIIl;
    }

    public final void llIIlIlIIl() {
        android.media.ImageReader imageReader = this.llIIlIlIIl;
        if (imageReader != null) {
            imageReader.close();
            this.llIIlIlIIl = null;
        }
    }
}
