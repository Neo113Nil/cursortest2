package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0980Qm {
    public static byte[] A03;
    public int A00;
    public final android.graphics.Rect A01;
    public final com.facebook.ads.redexgen.core.R2 A02;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(android.view.View view);

    public abstract int A0D(android.view.View view);

    public abstract int A0E(android.view.View view);

    public abstract int A0F(android.view.View view);

    public abstract int A0G(android.view.View view);

    public abstract int A0H(android.view.View view);

    public abstract void A0J(int i);

    public AbstractC0980Qm(com.facebook.ads.redexgen.core.R2 r2) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new android.graphics.Rect();
        this.A02 = r2;
    }

    public /* synthetic */ AbstractC0980Qm(com.facebook.ads.redexgen.core.R2 r2, com.facebook.ads.redexgen.core.C1704hp c1704hp) {
        this(r2);
    }

    public static com.facebook.ads.redexgen.core.C1704hp A00(com.facebook.ads.redexgen.core.R2 r2) {
        return new com.facebook.ads.redexgen.core.C1704hp(r2);
    }

    public static com.facebook.ads.redexgen.core.C1703ho A01(com.facebook.ads.redexgen.core.R2 r2) {
        return new com.facebook.ads.redexgen.core.C1703ho(r2);
    }

    public static com.facebook.ads.redexgen.core.AbstractC0980Qm A02(com.facebook.ads.redexgen.core.R2 r2, int i) {
        switch (i) {
            case 0:
                return A00(r2);
            case 1:
                return A01(r2);
            default:
                throw new java.lang.IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
