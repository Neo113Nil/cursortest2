package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ZL implements com.facebook.ads.redexgen.core.UD {
    public final /* synthetic */ java.lang.String[] A00;

    public ZL(java.lang.String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.core.UD
    public final boolean A3A(java.lang.String str) {
        for (java.lang.String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
