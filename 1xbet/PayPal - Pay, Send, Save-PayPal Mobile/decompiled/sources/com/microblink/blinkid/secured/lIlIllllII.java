package com.microblink.blinkid.secured;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class lIlIllllII {
    public static final com.microblink.blinkid.secured.lIlIllllII IllIIIllII;
    public static final /* synthetic */ com.microblink.blinkid.secured.lIlIllllII[] llIIIlllll;
    public final com.microblink.blinkid.secured.IlIlIlIIIl IlIllIlIIl;
    public final com.microblink.blinkid.secured.IlIlIlIIIl llIIlIlIIl;

    static {
        com.microblink.blinkid.secured.lIlIllllII lilillllii = new com.microblink.blinkid.secured.lIlIllllII();
        IllIIIllII = lilillllii;
        llIIIlllll = new com.microblink.blinkid.secured.lIlIllllII[]{lilillllii};
    }

    public lIlIllllII() {
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl("BaseCamera2Frame");
        ilIlIlIIIl.start();
        this.llIIlIlIIl = ilIlIlIIIl;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl2 = new com.microblink.blinkid.secured.IlIlIlIIIl("Camera2FullResFrame");
        ilIlIlIIIl2.start();
        this.IlIllIlIIl = ilIlIlIIIl2;
    }

    public static com.microblink.blinkid.secured.lIlIllllII valueOf(java.lang.String str) {
        return (com.microblink.blinkid.secured.lIlIllllII) java.lang.Enum.valueOf(com.microblink.blinkid.secured.lIlIllllII.class, str);
    }

    public static com.microblink.blinkid.secured.lIlIllllII[] values() {
        return (com.microblink.blinkid.secured.lIlIllllII[]) llIIIlllll.clone();
    }
}
