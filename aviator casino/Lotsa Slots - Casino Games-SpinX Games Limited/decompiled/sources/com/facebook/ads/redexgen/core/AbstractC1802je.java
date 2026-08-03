package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1802je extends com.facebook.ads.redexgen.core.AbstractC0984Qq<com.facebook.ads.redexgen.core.PX> {
    public static java.lang.String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public com.facebook.ads.redexgen.core.NM A00;
    public final java.util.List<com.facebook.ads.redexgen.core.UK> A01;
    public final int A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.AbstractC1580fo A04 = new com.facebook.ads.redexgen.core.C1804jg(this);

    public AbstractC1802je(com.facebook.ads.redexgen.core.C0x c0x, java.util.List<com.facebook.ads.redexgen.core.UK> list, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A03 = c1636gi;
        this.A02 = c0x.getChildSpacing();
        this.A01 = list;
    }

    private android.view.ViewGroup.MarginLayoutParams A01(int i) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        int size = this.A01.size() - 1;
        java.lang.String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i2, 0, i >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    public final int A0B() {
        return this.A01.size();
    }

    public final void A0O(android.widget.ImageView imageView, int i) {
        com.facebook.ads.redexgen.core.UK uk = this.A01.get(i);
        com.facebook.ads.redexgen.core.C1098Vb adCoverImage = uk.getAdCoverImage();
        if (adCoverImage != null) {
            com.facebook.ads.redexgen.core.LM A04 = new com.facebook.ads.redexgen.core.LM(imageView, this.A03).A04();
            A04.A06(new com.facebook.ads.redexgen.core.C1803jf(this, i, uk));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0P(com.facebook.ads.redexgen.core.NM nm) {
        this.A00 = nm;
    }

    public void A0Q(com.facebook.ads.redexgen.core.PX px, int i) {
        px.A0p().setLayoutParams(A01(i));
    }
}
