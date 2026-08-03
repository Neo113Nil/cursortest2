package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1684hU extends com.facebook.ads.redexgen.core.R5 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public com.facebook.ads.redexgen.core.C7M A00;
    public android.widget.Scroller A01;
    public final com.facebook.ads.redexgen.core.R7 A02 = new com.facebook.ads.redexgen.core.C1689hZ(this);

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(com.facebook.ads.redexgen.core.R2 r2, int i, int i2);

    public abstract android.view.View A0D(com.facebook.ads.redexgen.core.R2 r2);

    @java.lang.Deprecated
    public abstract com.facebook.ads.redexgen.core.C1705hq A0E(com.facebook.ads.redexgen.core.R2 r2);

    public abstract int[] A0H(com.facebook.ads.redexgen.core.R2 r2, android.view.View view);

    static {
        A09();
    }

    private final com.facebook.ads.redexgen.core.C1705hq A05(com.facebook.ads.redexgen.core.R2 r2) {
        return A0E(r2);
    }

    private void A07() {
        this.A00.A1i(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws java.lang.IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1h(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new java.lang.IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(com.facebook.ads.redexgen.core.R2 r2, int i, int i2) {
        com.facebook.ads.redexgen.core.C1705hq A05;
        int A0C;
        if (!(r2 instanceof com.facebook.ads.redexgen.core.RE) || (A05 = A05(r2)) == null || (A0C = A0C(r2, i, i2)) == -1) {
            return false;
        }
        A05.A0A(A0C);
        r2.A1N(A05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.R5
    public final boolean A0B(int i, int i2) {
        com.facebook.ads.redexgen.core.R2 layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (java.lang.Math.abs(i2) > minFlingVelocity || java.lang.Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    public final void A0F() {
        com.facebook.ads.redexgen.core.R2 layoutManager;
        android.view.View A0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1e(A0H[0], A0H[1]);
        }
    }

    public final void A0G(com.facebook.ads.redexgen.core.C7M c7m) throws java.lang.IllegalStateException {
        if (this.A00 == c7m) {
            return;
        }
        com.facebook.ads.redexgen.core.C7M c7m2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new java.lang.RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (c7m2 != null) {
            A07();
        }
        this.A00 = c7m;
        if (this.A00 != null) {
            A08();
            this.A01 = new android.widget.Scroller(this.A00.getContext(), new android.view.animation.DecelerateInterpolator());
            A0F();
        }
    }
}
