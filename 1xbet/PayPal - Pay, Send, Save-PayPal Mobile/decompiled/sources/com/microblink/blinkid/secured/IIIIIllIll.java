package com.microblink.blinkid.secured;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class IIIIIllIll {
    public static final com.microblink.blinkid.secured.IIIIIllIll IlIllIlIIl;
    public static final /* synthetic */ com.microblink.blinkid.secured.IIIIIllIll[] IllIIIllII;
    public final com.microblink.blinkid.secured.IlIlIlIIIl llIIlIlIIl;

    static {
        com.microblink.blinkid.secured.IIIIIllIll iIIIIllIll = new com.microblink.blinkid.secured.IIIIIllIll();
        IlIllIlIIl = iIIIIllIll;
        IllIIIllII = new com.microblink.blinkid.secured.IIIIIllIll[]{iIIIIllIll};
    }

    public IIIIIllIll() {
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl("Camera1");
        ilIlIlIIIl.start();
        this.llIIlIlIIl = ilIlIlIIIl;
    }

    public static com.microblink.blinkid.secured.IIIIIllIll valueOf(java.lang.String str) {
        return (com.microblink.blinkid.secured.IIIIIllIll) java.lang.Enum.valueOf(com.microblink.blinkid.secured.IIIIIllIll.class, str);
    }

    public static com.microblink.blinkid.secured.IIIIIllIll[] values() {
        return (com.microblink.blinkid.secured.IIIIIllIll[]) IllIIIllII.clone();
    }
}
