package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIIllIIII {
    public static volatile com.microblink.blinkid.secured.IlIIllIIII IllIIIllII;
    public final java.util.HashMap IlIllIlIIl = new java.util.HashMap();
    public final com.microblink.blinkid.secured.IlIlIlIIIl llIIlIlIIl;

    public IlIIllIIII() {
        this.llIIlIlIIl = null;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl("IntentDataIO");
        this.llIIlIlIIl = ilIlIlIIIl;
        ilIlIlIIIl.start();
    }

    public static com.microblink.blinkid.secured.IlIIllIIII llIIlIlIIl() {
        if (IllIIIllII == null) {
            synchronized (com.microblink.blinkid.secured.IlIIllIIII.class) {
                if (IllIIIllII == null) {
                    IllIIIllII = new com.microblink.blinkid.secured.IlIIllIIII();
                }
            }
        }
        return IllIIIllII;
    }
}
