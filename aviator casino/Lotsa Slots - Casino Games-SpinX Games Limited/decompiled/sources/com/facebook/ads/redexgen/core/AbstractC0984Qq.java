package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0984Qq<VH extends com.facebook.ads.redexgen.core.RK> {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"jUIKGw1ynNKnpAPmELSBfekQdKvvLP7N", "sNNGTv9KS6vRRQA34Mdww0wVckPktM11", "3xVPsODXVzGzX7adQrLtZXDPvj0RZqnv", "LC797JiAE7pTB", "T5D6LMII5PxeSeaFwmiiVgotr7WAYFJE", "TBv1Ih1UUm000Zp3KSd8PMLF2uMFBpSk", "SYlNiiXgaMsNCcAbu", "5Eyk2D6YZF50L"};
    public final com.facebook.ads.redexgen.core.C0985Qr A01 = new com.facebook.ads.redexgen.core.C0985Qr();
    public boolean A00 = false;

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{-73, -69, -123, -88, -41, -54, -58, -39, -54, -69, -50, -54, -36, -122, -118, 84, -125, -94, 118, -99, -94, -104, -118, -99, -103, -85};
    }

    public abstract int A0B();

    public abstract VH A0F(android.view.ViewGroup viewGroup, int i);

    public abstract void A0K(VH vh, int i);

    static {
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    private final void A0A(VH holder, int i, java.util.List<java.lang.Object> payloads) {
        A0K(holder, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final int A0C(int i) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final long A0D(int i) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final VH A0E(android.view.ViewGroup viewGroup, int i) {
        com.facebook.ads.redexgen.core.P4.A01(A08(0, 13, 100));
        VH holder = A0F(viewGroup, i);
        holder.A00 = i;
        com.facebook.ads.redexgen.core.P4.A00();
        return holder;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0G() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0H(com.facebook.ads.redexgen.core.AbstractC0986Qs abstractC0986Qs) {
        this.A01.registerObserver(abstractC0986Qs);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0I(com.facebook.ads.redexgen.core.AbstractC0986Qs abstractC0986Qs) {
        this.A01.unregisterObserver(abstractC0986Qs);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final void A0J(VH vh, int i) {
        vh.A03 = i;
        if (A0M()) {
            long A0D = A0D(i);
            java.lang.String[] strArr = A03;
            if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            A03[0] = "nL6OAJIdW8sl7jDyOoO0QwKhwUxIf89k";
            vh.A05 = A0D;
        }
        vh.A0a(1, 519);
        com.facebook.ads.redexgen.core.P4.A01(A08(13, 13, 51));
        A0A(vh, i, vh.A0R());
        vh.A0T();
        android.view.ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof com.facebook.ads.redexgen.core.R3) {
            ((com.facebook.ads.redexgen.core.R3) layoutParams).A01 = true;
        }
        com.facebook.ads.redexgen.core.P4.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public void A0L(com.facebook.ads.redexgen.core.C7M c7m) {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final boolean A0M() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Qq != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.RK> */
    public final boolean A0N(VH holder) {
        return false;
    }
}
