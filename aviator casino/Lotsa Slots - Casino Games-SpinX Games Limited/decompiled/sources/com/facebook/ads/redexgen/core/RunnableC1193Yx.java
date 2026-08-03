package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1193Yx implements java.lang.Runnable {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04886o A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new java.lang.RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, 7, 41, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, 3, com.google.common.base.Ascii.RS};
    }

    static {
        A01();
    }

    public RunnableC1193Yx(com.facebook.ads.redexgen.core.C04886o c04886o) {
        this.A00 = c04886o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            c0673Ek = this.A00.A00.A06;
            c0673Ek.A0b(10);
            ((com.facebook.ads.redexgen.core.AbstractC0936Oq) this.A00.A00).A08.A0F().A3a(A00(0, 18, 115));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
