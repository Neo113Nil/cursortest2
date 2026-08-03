package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1341bv implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"OcC8Yw10ta4EzUHryW8qF9f8Kw9JuvuB", "8f8LYzxOMmLQdsAhKRfNVONBERHkcGt2", "CzyGp", "2PtxVvqYppmcLS4cwbsjetyeZ5i3nCKD", "x35AdtEajADMGuwsONv03k5bW5eRm", "TNmYMyEiRrCRNh2BAihsQXhXdDRTY", "KzXNDxf0CUBsvqnb9B4FND8KZCDQkeqp", "bZ2905qMAeosph8FN3SjH9j5ipegj0aG"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0819Kc A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 58, 54, 48, 50};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1341bv(com.facebook.ads.redexgen.core.C0819Kc c0819Kc) {
        this.A00 = c0819Kc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 85));
            if (((com.facebook.ads.redexgen.core.AbstractC1349c3) this.A00).A07.A0D() != null) {
                ((com.facebook.ads.redexgen.core.AbstractC1349c3) this.A00).A07.A0D().ACQ();
            }
        } catch (java.lang.Throwable th) {
            if (A02[1].charAt(21) != 'O') {
                throw new java.lang.RuntimeException();
            }
            A02[2] = "i9GBCPULPHC1kq3f4RL3YMSEVPUJV";
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
