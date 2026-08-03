package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0992Qy {
    public static byte[] A06;
    public static java.lang.String[] A07 = {com.ironsource.Fc.e, "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public com.facebook.ads.redexgen.core.InterfaceC0990Qw A04 = null;
    public java.util.ArrayList<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new java.util.ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_END_OF_PLAYLIST);
            java.lang.String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{76, 75, com.google.common.base.Ascii.RS, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0L(com.facebook.ads.redexgen.core.RK rk);

    public abstract boolean A0M();

    public abstract boolean A0N(com.facebook.ads.redexgen.core.RK rk);

    public abstract boolean A0O(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2);

    public abstract boolean A0P(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2);

    public abstract boolean A0Q(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2);

    public abstract boolean A0R(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.RK rk2, com.facebook.ads.redexgen.core.C0991Qx c0991Qx, com.facebook.ads.redexgen.core.C0991Qx c0991Qx2);

    static {
        A09();
    }

    public static int A06(com.facebook.ads.redexgen.core.RK rk) {
        int i;
        i = rk.A0C;
        int i2 = i & 14;
        if (rk.A0f()) {
            return 4;
        }
        int flags = i2 & 4;
        if (flags == 0) {
            int pos = rk.A0P();
            int oldPos = rk.A0M();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    private final com.facebook.ads.redexgen.core.C0991Qx A07() {
        return new com.facebook.ads.redexgen.core.C0991Qx();
    }

    public final long A0A() {
        return this.A00;
    }

    public final long A0B() {
        return this.A01;
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.C0991Qx A0E(com.facebook.ads.redexgen.core.RH rh, com.facebook.ads.redexgen.core.RK rk) {
        return A07().A01(rk);
    }

    public final com.facebook.ads.redexgen.core.C0991Qx A0F(com.facebook.ads.redexgen.core.RH rh, com.facebook.ads.redexgen.core.RK rk, int i, java.util.List<java.lang.Object> payloads) {
        return A07().A01(rk);
    }

    public final void A0G() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new java.lang.NullPointerException(A08(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0J(com.facebook.ads.redexgen.core.InterfaceC0990Qw interfaceC0990Qw) {
        this.A04 = interfaceC0990Qw;
    }

    public final void A0K(com.facebook.ads.redexgen.core.RK rk) {
        if (this.A04 != null) {
            this.A04.ACv(rk);
        }
    }

    public boolean A0S(com.facebook.ads.redexgen.core.RK rk, java.util.List<java.lang.Object> payloads) {
        return A0N(rk);
    }
}
