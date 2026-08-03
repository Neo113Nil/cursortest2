package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1270am extends android.widget.LinearLayout {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"Jr0WeKM", "aLyr78qnX3", "WDzI2yCoQnaG5WlFPMLzJUV1", "NMdl8UzP9SICP", "nTr6FgA", "dLt28u1n76", "a9DRmwxXZv9mu", "zh83YRMbL55XtKeOm"};
    public static final int A06;

    @javax.annotation.Nullable
    public android.graphics.Bitmap A00;
    public android.widget.TextView A01;
    public android.widget.TextView A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            java.lang.String[] strArr = A05;
            if (strArr[0].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[3] = "ZRUGDW6hHHeRJ";
            strArr2[6] = "Carw9iBjdVQlg";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 11);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{com.google.common.base.Ascii.RS, 2, 2, 6, 5};
    }

    static {
        A02();
        A06 = com.facebook.ads.redexgen.core.XV.A05;
    }

    public C1270am(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A03 = c1636gi;
        A01();
    }

    private void A01() {
        setOrientation(1);
        this.A02 = new android.widget.TextView(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.A02.setTextColor(-16250871);
        this.A02.setTextSize(2, 15.0f);
        this.A02.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A02.setSingleLine(true);
        this.A02.setVisibility(8);
        this.A02.setGravity(17);
        this.A02.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        addView(this.A02, layoutParams);
        this.A01 = new android.widget.TextView(getContext());
        android.widget.LinearLayout.LayoutParams subtitleTextViewParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.A01.setAlpha(0.5f);
        this.A01.setTextColor(-9211021);
        this.A01.setTextSize(2, 12.0f);
        this.A01.setCompoundDrawablePadding(com.facebook.ads.redexgen.core.XV.A0A);
        this.A01.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A01.setSingleLine(true);
        this.A01.setVisibility(8);
        this.A01.setGravity(17);
        addView(this.A01, subtitleTextViewParams);
        if (com.facebook.ads.redexgen.core.C1086Up.A2w(this.A03)) {
            this.A02.setVisibility(4);
            this.A01.setVisibility(4);
        }
    }

    private android.graphics.Bitmap getPadlockBitmap() {
        if (this.A00 == null) {
            this.A00 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_PADLOCK_V2);
            this.A00 = android.graphics.Bitmap.createScaledBitmap(this.A00, A06, A06, true);
        }
        return this.A00;
    }

    public void setSubtitle(@javax.annotation.Nullable java.lang.String str) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        if (android.text.TextUtils.isEmpty(str)) {
            this.A01.setText((java.lang.CharSequence) null);
            android.widget.TextView textView = this.A01;
            if (A05[2].length() == 20) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[0] = "pcOg4Bl";
            strArr[4] = "wYgGrPO";
            textView.setVisibility(4);
            return;
        }
        android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(str);
        this.A01.setText(A00.getHost());
        android.widget.TextView textView2 = this.A01;
        if (A00(0, 5, 125).equals(A00.getScheme())) {
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(getResources(), getPadlockBitmap());
        } else {
            bitmapDrawable = null;
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(bitmapDrawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.A01.setVisibility(0);
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
