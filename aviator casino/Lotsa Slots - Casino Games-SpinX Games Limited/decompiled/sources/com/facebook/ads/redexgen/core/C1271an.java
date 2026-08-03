package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1271an extends android.widget.LinearLayout {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"Mfdbn5Fl8k5qESsaG0tegRjcib9VHyOt", "n0hxWP15hSbsHLgypwcG0GAEv81vEzmV", "Vpnz2oFEzE2IYGPVAE8ZMW29wyhZcEwz", "XXuq8LnmLUMAtFguuOE2ao", "65dSWN68FJcVNMzXlJchEDZxxrt4hqBN", "4lVNSswaDDObG8m1C4PrWCxrHhrY", "bBsj4v6TxeKFgxIfhKXDpm0rApYDu", "O9LsOEgR32mEkKEZI9qaQe7VINaI1GfC"};
    public static final int A06;

    @javax.annotation.Nullable
    public android.graphics.drawable.Drawable A00;
    public android.widget.TextView A01;
    public android.widget.TextView A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A05;
            if (strArr[5].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[5] = "BgS7v0vuK4FmmS5TgN4Oq9qrsj8N";
            strArr2[6] = "egQQbAPCKiEugSC3TXQQi3lfGkkhl";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
            i4++;
        }
    }

    public static void A02() {
        A04 = new byte[]{6, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS};
    }

    static {
        A02();
        A06 = com.facebook.ads.redexgen.core.XV.A0O;
    }

    public C1271an(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A03 = c1636gi;
        A01();
    }

    private void A01() {
        setOrientation(1);
        this.A02 = new android.widget.TextView(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.A02.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A02.setTextSize(2, 20.0f);
        this.A02.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A02.setSingleLine(true);
        this.A02.setVisibility(8);
        this.A02.setGravity(17);
        addView(this.A02, layoutParams);
        this.A01 = new android.widget.TextView(getContext());
        android.widget.LinearLayout.LayoutParams subtitleTextViewParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.A01.setAlpha(0.5f);
        this.A01.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A01.setTextSize(2, 15.0f);
        this.A01.setCompoundDrawablePadding(A06);
        this.A01.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A01.setSingleLine(true);
        this.A01.setVisibility(8);
        this.A01.setGravity(17);
        addView(this.A01, subtitleTextViewParams);
        if (com.facebook.ads.redexgen.core.C1086Up.A2w(this.A03)) {
            android.widget.TextView textView = this.A02;
            java.lang.String[] strArr = A05;
            if (strArr[5].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A05[1] = "YCLa9ko3h9BxKjOoBFpqdrzQ8S4ZW0px";
            textView.setVisibility(4);
            this.A01.setVisibility(4);
        }
    }

    private android.graphics.drawable.Drawable getPadlockDrawable() {
        if (this.A00 == null) {
            this.A00 = com.facebook.ads.redexgen.core.YN.A03(this.A03, com.facebook.ads.redexgen.core.YM.BROWSER_PADLOCK);
        }
        return this.A00;
    }

    public void setSubtitle(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.A01.setText((java.lang.CharSequence) null);
            this.A01.setVisibility(4);
        } else {
            android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(str);
            this.A01.setText(A00.getHost());
            this.A01.setCompoundDrawablesRelativeWithIntrinsicBounds(A00(0, 5, 54).equals(A00.getScheme()) ? getPadlockDrawable() : null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            this.A01.setVisibility(0);
        }
    }

    public void setTitle(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.A02.setText((java.lang.CharSequence) null);
            this.A02.setVisibility(4);
        } else {
            this.A02.setText(str);
            this.A02.setVisibility(0);
        }
    }
}
