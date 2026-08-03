package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1192Yw extends android.widget.RelativeLayout {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"1ndtPHkCNG2MrcfU", "OkotuIrDHFdt3GuHIAQXgGngH1IosrSP", "w1znC0uCczOhgZoOcmgh63wQHQC04hJe", "LpK8hBAwmPAdG3KY0YfFHbQT3q40mu0e", "O8GEFlZj6nQCoGB8qsscGdpyRLKvgqm0", "WaIEcxX", "XMBXBBLBPjQfoEVhqbgB7WanyEloQPjm", "KaNBEQe5mownSAjOblO08Wd4OxcuEM8d"};
    public static final int A05;
    public static final int A06;
    public final android.widget.ImageView A00;
    public final android.widget.ImageView A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A04;
            if (strArr[0].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "ULiiLRGxcEAphtP2D4AjLhxKdPtmqQZf";
            strArr2[3] = "IodoKdznfIBMKrNK9oRp1NZvy6AtC0Mf";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
            i4++;
        }
    }

    public static void A02() {
        java.lang.String[] strArr = A04;
        if (strArr[4].charAt(18) == strArr[3].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[4] = "AIVPcyptJR7BDqEaYBWxJso7N9d0VHMs";
        strArr2[3] = "PIjuROse392MLv7GhU36YdX9Z5SxUZMR";
        A03 = new byte[]{Byte.MIN_VALUE, -109, -98, -99, -96, -94, 78, 111, -110};
    }

    static {
        A02();
        A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 6.0f);
    }

    public C1192Yw(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A02 = c1636gi;
        com.facebook.ads.redexgen.core.YB.A0V(this, com.facebook.ads.redexgen.core.YB.A06(855638016, A05));
        this.A01 = A00(com.facebook.ads.redexgen.core.YM.DEFAULT_INFO_ICON);
        this.A00 = A00(com.facebook.ads.redexgen.core.YM.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 31));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1636gi);
        linearLayout.setOrientation(0);
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        addView(linearLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        setClickable(true);
        setFocusable(true);
    }

    private android.widget.ImageView A00(com.facebook.ads.redexgen.core.YM ym) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.A02);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(0, A06, 0, A06);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        imageView.setColorFilter(-1);
        android.widget.LinearLayout.LayoutParams iconLayoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        iconLayoutParams.weight = 1.0f;
        imageView.setLayoutParams(iconLayoutParams);
        return imageView;
    }
}
