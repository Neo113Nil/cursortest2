package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIIlIIlll {
    public final java.lang.String IlIllIlIIl;
    public final java.lang.String[] IllIIIIllI;
    public final java.lang.String IllIIIllII;
    public final java.lang.String lIlIIIIlIl;
    public final java.lang.String llIIIlllll;
    public final java.lang.String llIIlIlIIl;

    public llIIlIIlll(com.microblink.blinkid.secured.IIlIIllIII iIlIIllIII, java.lang.String str, java.lang.String str2, java.lang.String[] strArr, java.lang.String str3) {
        this.IlIllIlIIl = com.microblink.blinkid.secured.lIIllllllI.llIIlIlIIl(iIlIIllIII.llIIlIlIIl);
        this.llIIlIlIIl = iIlIIllIII.IlIllIlIIl;
        this.IllIIIllII = str;
        this.llIIIlllll = str2;
        this.IllIIIIllI = strArr;
        this.lIlIIIIlIl = str3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request{sdkVersion='");
        sb.append(this.llIIlIlIIl);
        sb.append("', sdkName='");
        sb.append(this.IlIllIlIIl);
        sb.append("', licenceId='");
        sb.append(this.IllIIIllII);
        sb.append("', licensee='");
        sb.append(this.llIIIlllll);
        sb.append("', applicationIds='");
        sb.append(java.util.Arrays.toString(this.IllIIIIllI));
        sb.append("', packageName='");
        sb.append(this.lIlIIIIlIl);
        sb.append("', platform='ANDROID'}");
        return sb.toString();
    }
}
