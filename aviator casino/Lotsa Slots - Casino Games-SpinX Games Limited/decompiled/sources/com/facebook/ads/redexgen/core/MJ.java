package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MJ {
    public static final com.facebook.ads.redexgen.core.MJ A02 = new com.facebook.ads.redexgen.core.MJ();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof com.facebook.ads.redexgen.core.MJ)) {
            return false;
        }
        com.facebook.ads.redexgen.core.MJ mj = (com.facebook.ads.redexgen.core.MJ) obj;
        return this.A00 == mj.A00 && this.A01 == mj.A01;
    }

    public final int hashCode() {
        return new java.lang.Byte(this.A00).hashCode() + new java.lang.Boolean(this.A01).hashCode();
    }
}
