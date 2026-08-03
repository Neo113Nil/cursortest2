package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1280aw extends android.widget.RelativeLayout {
    public static com.facebook.ads.redexgen.core.InterfaceC1177Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public com.facebook.ads.redexgen.core.AbstractC1684hU A00;
    public com.facebook.ads.redexgen.core.C1636gi A01;
    public com.facebook.ads.redexgen.core.C0w A02;
    public com.facebook.ads.redexgen.core.M1 A03;
    public com.facebook.ads.redexgen.core.C1329bj A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, com.google.common.base.Ascii.SI, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = com.facebook.ads.redexgen.core.XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 15.0f);
        A05 = new com.facebook.ads.redexgen.core.C0864Lv();
    }

    public C1280aw(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A01 = c1636gi;
        this.A02 = new com.facebook.ads.redexgen.core.C0w(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0K(this.A02);
        this.A00 = new com.facebook.ads.redexgen.core.C7N();
        this.A00.A0G(this.A02);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private java.util.ArrayList<com.facebook.ads.redexgen.core.C1474e5> A01(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (abstractC1801jd == null) {
            return new java.util.ArrayList<>();
        }
        java.util.List<com.facebook.ads.redexgen.core.NR> A2G = abstractC1801jd.A2G();
        java.util.ArrayList<com.facebook.ads.redexgen.core.C1474e5> arrayList = new java.util.ArrayList<>(A2G.size());
        for (int i = 0; i < A2G.size(); i++) {
            arrayList.add(new com.facebook.ads.redexgen.core.C1474e5(i, A2G.size(), A2G.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(com.facebook.ads.redexgen.core.UK uk, int i) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.C1474e5> A01 = A01(uk.A13());
        this.A02.setCardsInfo(A01);
        this.A03 = new com.facebook.ads.redexgen.core.M1(this.A01, A01, uk.A13(), this.A01.A02().A0A(), uk, A05, uk.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = com.facebook.ads.redexgen.core.XX.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(uk, A01);
    }

    public final void A06(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        if (this.A03 != null) {
            this.A03.A0P(c1581fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), com.facebook.ads.redexgen.core.AbstractC1048Td.A1v, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 51, 125)));
        }
        this.A02.A20(c1581fp);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC1177Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0O((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(com.facebook.ads.redexgen.core.UK uk, java.util.ArrayList<com.facebook.ads.redexgen.core.C1474e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new com.facebook.ads.redexgen.core.C0861Ls(this));
        this.A04 = new com.facebook.ads.redexgen.core.C1329bj(this.A01, uk.A13().A28().A01(), arrayList.size());
        com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
