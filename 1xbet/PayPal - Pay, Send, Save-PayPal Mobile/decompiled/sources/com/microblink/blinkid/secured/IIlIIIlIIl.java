package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIlIIIlIIl {
    public final int IlIllIlIIl;
    public final int IllIIIllII;
    public final int llIIlIlIIl;

    public IIlIIIlIIl(java.lang.String str) {
        this.llIIlIlIIl = -1;
        this.IlIllIlIIl = -1;
        this.IllIIIllII = -1;
        if (str == null) {
            throw new java.lang.NullPointerException("Cannot parse null version string!");
        }
        java.lang.String[] split = str.split("\\.");
        if (split.length == 0) {
            throw new java.lang.IllegalArgumentException("Invalid version string ".concat(str));
        }
        if (split.length > 0) {
            this.llIIlIlIIl = java.lang.Integer.parseInt(split[0]);
            if (split.length >= 2) {
                this.IlIllIlIIl = java.lang.Integer.parseInt(split[1]);
                if (split.length >= 3) {
                    this.IllIIIllII = java.lang.Integer.parseInt(split[2]);
                }
            }
        }
    }

    public final boolean IlIllIlIIl(com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl) {
        if (iIlIIIlIIl == null) {
            throw new java.lang.NullPointerException("Cannot compare with null version!");
        }
        int i = this.llIIlIlIIl;
        int i2 = iIlIIIlIIl.llIIlIlIIl;
        if (i < i2) {
            return false;
        }
        if (i > i2) {
            return true;
        }
        int i3 = this.IlIllIlIIl;
        if (i3 == -1) {
            return false;
        }
        int i4 = iIlIIIlIIl.IlIllIlIIl;
        if (i4 == -1) {
            return i3 != 0;
        }
        if (i3 < i4) {
            return false;
        }
        if (i3 > i4) {
            return true;
        }
        int i5 = this.IllIIIllII;
        if (i5 == -1) {
            return false;
        }
        int i6 = iIlIIIlIIl.IllIIIllII;
        return i6 == -1 ? i5 != 0 : i5 > i6;
    }

    public final boolean llIIlIlIIl(com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl) {
        if (iIlIIIlIIl == null) {
            throw new java.lang.NullPointerException("Cannot compare with null version!");
        }
        int i = this.llIIlIlIIl;
        int i2 = iIlIIIlIIl.llIIlIlIIl;
        if (i < i2) {
            return false;
        }
        if (i > i2) {
            return true;
        }
        int i3 = this.IlIllIlIIl;
        if (i3 == -1) {
            int i4 = iIlIIIlIIl.IlIllIlIIl;
            return i4 == -1 || i4 == 0;
        }
        int i5 = iIlIIIlIIl.IlIllIlIIl;
        if (i5 == -1) {
            return true;
        }
        if (i3 < i5) {
            return false;
        }
        if (i3 > i5) {
            return true;
        }
        int i6 = this.IllIIIllII;
        if (i6 == -1) {
            int i7 = iIlIIIlIIl.IllIIIllII;
            return i7 == -1 || i7 == 0;
        }
        int i8 = iIlIIIlIIl.IllIIIllII;
        return i8 == -1 || i6 >= i8;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.llIIlIlIIl);
        if (this.IlIllIlIIl != -1) {
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(this.IlIllIlIIl);
            if (this.IllIIIllII != -1) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(this.IllIIIllII);
            }
        }
        return sb.toString();
    }
}
