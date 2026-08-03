package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZM extends android.widget.LinearLayout {
    public static java.lang.String[] A0A = {"iBjFS74UqofOwX9raECs8wFiPopmP8ZT", "DvkIZsK2SfYDf1PYliynkurznpBmB2mx", "JthO9De0vDUnz", "alrxHoKVfabvqyWYzjdfx1EKUXaFGyZT", "MSxuugz3RBTPC5P7p9BXefIxh5y8oQF5", "xAXGeIm", "UaB9zlLwJ5ijSfJwpwiqdPYYRduUW", "7D"};
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.XX.A02 * 40.0f);
    public int A00;
    public final android.graphics.drawable.GradientDrawable A01;
    public final android.graphics.drawable.GradientDrawable A02;
    public final android.widget.ImageView A03;
    public final android.widget.LinearLayout A04;
    public final android.widget.RelativeLayout A05;
    public final android.widget.TextView A06;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final int A09;

    public ZM(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i) {
        super(c1636gi);
        this.A01 = new android.graphics.drawable.GradientDrawable();
        this.A02 = new android.graphics.drawable.GradientDrawable();
        this.A08 = c1636gi;
        this.A07 = abstractC1801jd;
        this.A09 = this.A07.A2D().A00();
        this.A03 = new android.widget.ImageView(c1636gi);
        this.A04 = new android.widget.LinearLayout(c1636gi);
        this.A05 = new android.widget.RelativeLayout(c1636gi);
        this.A06 = new android.widget.TextView(c1636gi);
        this.A00 = i;
        A00();
    }

    private void A00() {
        this.A01.setShape(1);
        this.A01.setColor(Integer.MIN_VALUE);
        this.A02.setShape(0);
        this.A02.setColor(Integer.MIN_VALUE);
        this.A02.setCornerRadii(new float[]{50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f});
        if (!android.text.TextUtils.isEmpty(this.A07.A2D().A05())) {
            A02();
            this.A05.addView(this.A06);
        }
        A01();
        this.A05.addView(this.A03);
        setToolbarActionMode(this.A00);
        setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, com.facebook.ads.redexgen.core.XV.A0b, 0);
        this.A04.addView(this.A05, layoutParams);
        addView(this.A04, new android.widget.LinearLayout.LayoutParams(-2, -2));
    }

    private void A01() {
        this.A03.setColorFilter(-1);
        this.A03.setPadding(com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0B, A0B);
        layoutParams.addRule(1, this.A06.getId());
        this.A03.setLayoutParams(layoutParams);
    }

    private void A02() {
        this.A06.setTextColor(-1);
        this.A06.setTextSize(13.0f);
        this.A06.setText(this.A07.A2D().A05());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.A06.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 500, false));
        }
        this.A06.setPadding(com.facebook.ads.redexgen.core.XV.A0Z, 0, 0, 0);
        com.facebook.ads.redexgen.core.YB.A0K(this.A06);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        this.A06.setLayoutParams(layoutParams);
    }

    public final boolean A03() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    private com.facebook.ads.redexgen.core.YM getNtdIcon() {
        switch (this.A09) {
            case 1:
                com.facebook.ads.redexgen.core.YM actionEncodedImage = com.facebook.ads.redexgen.core.YM.ICON_SKIP;
                return actionEncodedImage;
            case 2:
                com.facebook.ads.redexgen.core.YM actionEncodedImage2 = com.facebook.ads.redexgen.core.YM.AD_NTD_CHEVRON_DOWN;
                return actionEncodedImage2;
            case 3:
                com.facebook.ads.redexgen.core.YM actionEncodedImage3 = com.facebook.ads.redexgen.core.YM.AD_NTD_FAST_FORWARD;
                return actionEncodedImage3;
            case 4:
                com.facebook.ads.redexgen.core.YM actionEncodedImage4 = com.facebook.ads.redexgen.core.YM.AD_NTD_DIAGONAL_ARROW;
                return actionEncodedImage4;
            case 5:
                com.facebook.ads.redexgen.core.YM actionEncodedImage5 = com.facebook.ads.redexgen.core.YM.AD_NTD_PANEL_OPEN;
                return actionEncodedImage5;
            default:
                com.facebook.ads.redexgen.core.YM actionEncodedImage6 = com.facebook.ads.redexgen.core.YM.OTHER_SKIP;
                return actionEncodedImage6;
        }
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(android.view.View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setToolbarActionMode(int i) {
        com.facebook.ads.redexgen.core.YM ym;
        this.A08.A0F().AGB(i);
        this.A00 = i;
        setVisibility(4);
        this.A06.setVisibility(8);
        this.A05.setBackground(this.A01);
        this.A03.setPadding(com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y);
        switch (i) {
            case 0:
                ym = com.facebook.ads.redexgen.core.YM.NAV_CROSS;
                setVisibility(0);
                break;
            case 1:
                ym = com.facebook.ads.redexgen.core.YM.ICON_SKIP;
                setVisibility(0);
                break;
            case 8:
                ym = getNtdIcon();
                if (!android.text.TextUtils.isEmpty(this.A07.A2D().A05())) {
                    this.A06.setVisibility(0);
                    this.A03.setPadding(0, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y);
                    android.widget.RelativeLayout relativeLayout = this.A05;
                    android.graphics.drawable.GradientDrawable gradientDrawable = this.A02;
                    java.lang.String[] strArr = A0A;
                    if (strArr[2].length() == strArr[7].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0A;
                    strArr2[4] = "oZDmetKHu9grnCPFFZaM4ttbALN8X9Pg";
                    strArr2[1] = "vBKViN6oqvNYKRPMnY7Cbo5hW74eYH8B";
                    relativeLayout.setBackground(gradientDrawable);
                }
                setVisibility(0);
                break;
            default:
                ym = com.facebook.ads.redexgen.core.YM.NAV_CROSS;
                break;
        }
        this.A03.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        if (i == 1) {
            com.facebook.ads.redexgen.core.YB.A0G(1005, this.A03);
        } else {
            com.facebook.ads.redexgen.core.YB.A0G(1002, this.A03);
        }
    }
}
