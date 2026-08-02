package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIllIIIlll {
    public final int IlIllIlIIl;
    public final int llIIlIlIIl;

    public lIllIIIlll(int i, int i2) {
        this.llIIlIlIIl = i;
        this.IlIllIlIIl = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.microblink.blinkid.secured.lIllIIIlll)) {
            return false;
        }
        com.microblink.blinkid.secured.lIllIIIlll lilliiilll = (com.microblink.blinkid.secured.lIllIIIlll) obj;
        return this.llIIlIlIIl == lilliiilll.llIIlIlIIl && this.IlIllIlIIl == lilliiilll.IlIllIlIIl;
    }

    public final int hashCode() {
        return (this.llIIlIlIIl * 32713) + this.IlIllIlIIl;
    }
}
