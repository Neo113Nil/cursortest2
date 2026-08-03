package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1031Sm {
    public static boolean A04;
    public static byte[] A05;
    public static final java.lang.String A06;
    public final com.facebook.ads.redexgen.core.C1032Sn A00;
    public final com.facebook.ads.redexgen.core.C1033So A01;
    public final com.facebook.ads.redexgen.core.C1632ge A02;
    public final com.facebook.ads.redexgen.core.InterfaceC1612gK A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = com.facebook.ads.redexgen.core.C1031Sm.class.getSimpleName();
    }

    public C1031Sm(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.CY cy, com.facebook.ads.redexgen.core.C1032Sn c1032Sn, com.facebook.ads.redexgen.core.C1033So c1033So) {
        this.A02 = c1632ge;
        this.A03 = cy.A5U(com.facebook.ads.redexgen.core.EnumC1613gL.A06);
        this.A00 = c1032Sn;
        this.A01 = c1033So;
        this.A03.A41(new com.facebook.ads.redexgen.core.C1644gq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAe()) {
                this.A02.A05().AAO();
                return;
            }
            java.lang.String btExtras = this.A03.A7i().optString(A00(0, 9, 7));
            if (!android.text.TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || com.facebook.ads.redexgen.core.C1086Up.A0j(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
