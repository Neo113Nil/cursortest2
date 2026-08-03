package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1245aN extends android.widget.LinearLayout {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"4iYy1NiEXPr50pSHLe", "HBHFKoag", "wA4Ui03I", "2gIO3BT", "OrT35hYFj4GxiCS6J9xeeeUbe1P", "nGPsLdYcSrB888UHIbwtZyr3qehde", "KYwyCcQkvGwH5Y", "JT6Ig6jVa1kb71ozaZw7zaiPm8CFCh"};
    public android.graphics.Bitmap A00;
    public android.widget.ImageView A01;
    public final android.graphics.Bitmap A02;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-34, -19, -32, -33, -28, -17, -38, -25, -28, -23, -32};
    }

    static {
        A03();
    }

    public C1245aN(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi);
        this.A02 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CREDIT_LINE_DETAIL_ICON);
        this.A04 = c1636gi;
        this.A03 = abstractC1801jd;
        com.facebook.ads.redexgen.core.AbstractC1243aL.A03(c1636gi, enumC1244aM);
        A02();
    }

    private void A01() {
        this.A01 = new android.widget.ImageView(getContext());
        com.facebook.ads.redexgen.core.YB.A0K(this.A01);
        this.A01.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.A01.setAdjustViewBounds(true);
        int i = com.facebook.ads.redexgen.core.XV.A02;
        int i2 = -2;
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = this.A03;
            java.lang.String[] strArr = A06;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[7];
            int width = str.length();
            int height = str2.length();
            if (width == height) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[4] = "x8xY3MB01JBdxcqqDL0wMDWxAwS";
            strArr2[7] = "xOuUcUrUHCCBixtYHxFt84BQtGsdzP";
            if (abstractC1801jd != null && this.A03.A0t() != null) {
                int height2 = this.A03.A0t().A04();
                if (height2 > 0) {
                    int height3 = this.A03.A0t().A04();
                    i2 = (int) (height3 * com.facebook.ads.redexgen.core.XX.A02);
                    i = -2;
                }
            }
        }
        android.widget.LinearLayout.LayoutParams creditLineLayoutParams = new android.widget.LinearLayout.LayoutParams(i2, i);
        if (this.A00 != null) {
            this.A01.setImageBitmap(this.A00);
        } else {
            this.A01.setImageBitmap(this.A02);
        }
        addView(this.A01, creditLineLayoutParams);
        java.lang.String[] strArr3 = A06;
        java.lang.String str3 = strArr3[1];
        java.lang.String str4 = strArr3[2];
        int width2 = str3.length();
        int height4 = str4.length();
        if (width2 != height4) {
            A06[3] = "pXE18ZtALSro7";
            return;
        }
        java.lang.String[] strArr4 = A06;
        strArr4[6] = "iRqRQPIdY5QAhD";
        strArr4[5] = "IqpqjnSjtnqm1TdvzBeDXrY2K4YMi";
    }

    private void A02() {
        setOrientation(0);
        setPadding(com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        com.facebook.ads.redexgen.core.YB.A0N(this, 452984831);
        com.facebook.ads.redexgen.core.YB.A0E(com.facebook.ads.redexgen.core.XV.A0C, this);
        getDownloadedBitmap();
        A01();
    }

    public final void A04() {
        getDownloadedBitmap();
        if (this.A01 == null || this.A00 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = this.A03;
        if (A06[3].length() == 27) {
            throw new java.lang.RuntimeException();
        }
        A06[3] = "jEdvzIR";
        if (abstractC1801jd != null && this.A03.A0t() != null && this.A03.A0t().A04() > 0) {
            android.widget.LinearLayout.LayoutParams creditLineLayoutParams = new android.widget.LinearLayout.LayoutParams((int) (this.A03.A0t().A04() * com.facebook.ads.redexgen.core.XX.A02), -2);
            this.A01.setLayoutParams(creditLineLayoutParams);
            this.A01.setImageBitmap(null);
            this.A01.setImageBitmap(this.A00);
        }
    }

    private void getDownloadedBitmap() {
        if (this.A03 != null && this.A03.A0t() != null && this.A03.A0t().A05() != null && this.A03.A0t().A04() > 0 && this.A03.A0t().A03() > 0) {
            try {
                this.A00 = new com.facebook.ads.redexgen.core.C1042Sx(this.A04).A0O(this.A03.A0t().A05(), (int) (this.A03.A0t().A03() * com.facebook.ads.redexgen.core.XX.A02), (int) (this.A03.A0t().A04() * com.facebook.ads.redexgen.core.XX.A02));
            } catch (java.lang.Exception e) {
                this.A04.A08().ABC(A00(0, 11, 27), 3900, new com.facebook.ads.redexgen.core.C1049Te(e));
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        com.facebook.ads.redexgen.core.YB.A0N(this, i);
    }
}
