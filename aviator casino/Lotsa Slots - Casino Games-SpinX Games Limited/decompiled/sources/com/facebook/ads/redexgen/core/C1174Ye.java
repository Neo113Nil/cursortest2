package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1174Ye extends android.widget.LinearLayout {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"c7FfjQ6y3HaOHMc3qahze5tazZKFUWq1", "dcjzuF3AqOMcB85rWB1c89WERUNuq1B5", "XaDq3zOpduRXpYeV6weqhdOc6hHMeHaG", "Q9qxFF5jdCSss8nmQrnDrKCnC4cH87bf", "mFimVIfUvc9UC82U0ppl8tgspTjbkT4E", "57zseqNU9OKtNdE63wjpGd4u4uyNaDsl", "MUX7fVpzJp514oXL2qVdvbHezKVj77rn", "k1MvgkHtcy8fDpGprRj2aO2t64o5A9wC"};
    public int A00;
    public android.widget.ImageView A01;
    public final android.widget.TextView A02;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A03;
    public final com.facebook.ads.redexgen.core.C1042Sx A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.EnumC1176Yg A06;
    public final com.facebook.ads.redexgen.core.C1319bZ A07;
    public final java.lang.String A08;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0A;
            if (strArr[3].charAt(13) != strArr[1].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[3] = "OzxZ8QvRVggYR8fS16eYEPx7e3FaNVjG";
            strArr2[1] = "hJPaGMutZvNvi8XFOWZAJRaNW6kshKbn";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
            i4++;
        }
    }

    public static void A06() {
        A09 = new byte[]{102, 102, 102, com.google.common.base.Ascii.SI, 53, 36, 36, 9, 96, 72, 94, 88, 72, 102, com.google.common.base.Ascii.DLE, 1, 1, 46, com.google.common.base.Ascii.RS, 1, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, 46, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, 2};
    }

    static {
        A06();
    }

    public C1174Ye(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.EnumC1176Yg enumC1176Yg, int i) {
        super(c1636gi);
        int i2;
        int i3;
        int i4;
        int i5;
        this.A05 = c1636gi;
        this.A04 = new com.facebook.ads.redexgen.core.C1042Sx(this.A05);
        this.A03 = abstractC1801jd;
        this.A06 = enumC1176Yg;
        this.A00 = i;
        this.A08 = A05(A03());
        android.graphics.drawable.Drawable A00 = A00();
        setOrientation(0);
        int i6 = enumC1176Yg.A00;
        i2 = com.facebook.ads.redexgen.core.C0950Pe.A0B;
        float f = i2;
        i3 = com.facebook.ads.redexgen.core.C0950Pe.A0B;
        float f2 = i3;
        i4 = com.facebook.ads.redexgen.core.C0950Pe.A0B;
        float f3 = i4;
        i5 = com.facebook.ads.redexgen.core.C0950Pe.A0B;
        com.facebook.ads.redexgen.core.YB.A0T(this, i6, new float[]{f, f2, 0.0f, 0.0f, 0.0f, 0.0f, f3, i5});
        setPadding(com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A0S);
        android.widget.LinearLayout.LayoutParams iconLayout = new android.widget.LinearLayout.LayoutParams(com.facebook.ads.redexgen.core.C0950Pe.A0A, com.facebook.ads.redexgen.core.C0950Pe.A0A);
        iconLayout.gravity = 17;
        iconLayout.rightMargin = com.facebook.ads.redexgen.core.XV.A0t;
        if (A00 != null) {
            this.A01 = new com.facebook.ads.redexgen.core.C1330bk(c1636gi);
            this.A01.setImageDrawable(A00);
            this.A01.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            addView(this.A01, iconLayout);
        }
        android.widget.LinearLayout.LayoutParams iconLayout2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        iconLayout2.gravity = 17;
        this.A02 = new android.widget.TextView(c1636gi);
        this.A02.setSingleLine(true);
        this.A02.setTextColor(enumC1176Yg.A01);
        this.A02.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.YB.A0a(this.A02, true, 14);
        addView(this.A02, iconLayout2);
        this.A07 = new com.facebook.ads.redexgen.core.C1319bZ(c1636gi, 0, enumC1176Yg.A01, com.facebook.ads.redexgen.core.YM.RIGHT_ARROW_ICON);
        android.widget.LinearLayout.LayoutParams arrowLayout = new android.widget.LinearLayout.LayoutParams(com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A05);
        arrowLayout.gravity = 17;
        addView(this.A07, arrowLayout);
    }

    private android.graphics.drawable.Drawable A00() {
        android.graphics.drawable.Drawable A02 = A02();
        android.graphics.drawable.Drawable clientIcon = A01();
        if (this.A03.A20() && A02 != null) {
            return A02;
        }
        if (clientIcon != null) {
            return clientIcon;
        }
        return A02;
    }

    private android.graphics.drawable.Drawable A01() {
        try {
            android.content.pm.PackageManager packageManager = this.A05.getPackageManager();
            if (packageManager != null) {
                return this.A05.getApplicationInfo().loadIcon(packageManager);
            }
        } catch (java.lang.Exception e) {
            this.A05.A08().ABC(A04(14, 12, 43), 3802, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
        java.lang.String[] strArr = A0A;
        if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0A;
        strArr2[3] = "jUfyBK5zlH0tl8V7sWmOgq7X259zWj2J";
        strArr2[1] = "SGIYZLeU9975u8UEdBoCCWNy5l7CdrBr";
        return null;
    }

    private android.graphics.drawable.Drawable A02() {
        java.lang.String A11 = this.A03.A11();
        if (!android.text.TextUtils.isEmpty(A11)) {
            try {
                return new android.graphics.drawable.BitmapDrawable(this.A05.getResources(), this.A04.A0O(A11, com.facebook.ads.redexgen.core.C0950Pe.A0A, com.facebook.ads.redexgen.core.C0950Pe.A0A));
            } catch (java.lang.Exception ex) {
                this.A05.A08().ABC(A04(14, 12, 43), 3801, new com.facebook.ads.redexgen.core.C1049Te(ex));
            }
        }
        java.lang.String[] strArr = A0A;
        if (strArr[6].charAt(24) != strArr[0].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0A;
        strArr2[4] = "ZW7Ma5Rt6RF6OtA2ZfTqzGK0I4YaPrZB";
        strArr2[5] = "zx4dLaY49jPP5LwtUTckaWLPrAPuKDRF";
        return null;
    }

    private java.lang.String A03() {
        java.lang.String A12 = this.A03.A12();
        if (this.A03.A21()) {
            boolean isEmpty = android.text.TextUtils.isEmpty(A12);
            java.lang.String[] strArr = A0A;
            if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[6] = "bWh5ZJLUuxhwdzQeFGE5pJ27zwRBZYtK";
            strArr2[0] = "k8oYCR3AxWxSTXJGQikG90YPzIUE2fAr";
            if (!isEmpty) {
                return A12;
            }
        }
        try {
            android.content.pm.PackageManager packageManager = this.A05.getPackageManager();
            if (packageManager != null) {
                java.lang.String charSequence = this.A05.getApplicationInfo().loadLabel(packageManager).toString();
                if (!android.text.TextUtils.isEmpty(charSequence)) {
                    return charSequence;
                }
            }
        } catch (java.lang.Exception ex) {
            this.A05.A08().ABC(A04(14, 12, 43), 3803, new com.facebook.ads.redexgen.core.C1049Te(ex));
        }
        return A12;
    }

    public static java.lang.String A05(java.lang.String str) {
        if (str.length() > 10) {
            return str.substring(0, 10) + A04(0, 3, 18);
        }
        return str;
    }

    private void A07(float f) {
        if (f > 0.0f) {
            this.A07.setVisibility(8);
        } else {
            this.A07.setVisibility(0);
        }
    }

    private void A08(float f) {
        java.lang.String text;
        java.lang.String A04 = A04(3, 5, 14);
        if (f > 0.0f) {
            int ceil = (int) java.lang.Math.ceil(f / 1000.0f);
            boolean isEmpty = android.text.TextUtils.isEmpty(this.A08);
            java.lang.String A042 = A04(8, 6, 97);
            if (isEmpty) {
                text = this.A03.A2D().A07().replace(A042, java.lang.String.valueOf(ceil));
            } else {
                text = this.A03.A2D().A03().replace(A04, this.A08).replace(A042, java.lang.String.valueOf(ceil));
            }
        } else if (android.text.TextUtils.isEmpty(this.A08)) {
            text = this.A03.A2D().A08();
        } else {
            text = this.A03.A2D().A04().replace(A04, this.A08);
        }
        this.A02.setText(text);
    }

    public final int A09() {
        return this.A00;
    }

    public final void A0A(float f) {
        A07(f);
        A08(f);
    }

    public final void A0B(float f) {
        A08(f);
        A07(f);
    }

    public final void A0C(int i) {
        this.A05.A0F().AGB(i);
        this.A00 = i;
    }
}
