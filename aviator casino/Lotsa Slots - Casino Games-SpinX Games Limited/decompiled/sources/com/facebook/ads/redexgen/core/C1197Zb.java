package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1197Zb extends android.widget.RelativeLayout {
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.C0926Og A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.InterfaceC1201Zf A04;
    public final boolean A05;
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 44.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 75.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.XX.A02 * 25.0f);
    public static final int A0F = (int) (com.facebook.ads.redexgen.core.XX.A02 * 45.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.XX.A02 * 15.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1197Zb(com.facebook.ads.redexgen.core.C1196Za c1196Za) {
        super(r0);
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf;
        boolean z;
        boolean z2;
        boolean z3;
        c1636gi = c1196Za.A0B;
        c1636gi2 = c1196Za.A0B;
        this.A03 = c1636gi2;
        this.A02 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(this.A03.A02());
        interfaceC1201Zf = c1196Za.A02;
        this.A04 = interfaceC1201Zf;
        z = c1196Za.A0A;
        this.A01 = z ? A0E : A0F;
        z2 = c1196Za.A0A;
        this.A00 = z2 ? A0B : A0C;
        z3 = c1196Za.A07;
        this.A05 = z3;
        setFocusable(true);
        android.view.View A01 = A01(c1196Za);
        android.view.View A00 = A00(c1196Za);
        android.view.View footerView = getFooterView();
        com.facebook.ads.redexgen.core.YB.A0K(A01);
        com.facebook.ads.redexgen.core.YB.A0K(A00);
        com.facebook.ads.redexgen.core.YB.A0K(footerView);
        android.widget.RelativeLayout.LayoutParams contentParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, A01.getId());
        layoutParams.addRule(2, footerView.getId());
        android.widget.RelativeLayout.LayoutParams footerParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(A01, contentParams);
        addView(A00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(0);
    }

    public /* synthetic */ C1197Zb(com.facebook.ads.redexgen.core.C1196Za c1196Za, com.facebook.ads.redexgen.core.ZY zy) {
        this(c1196Za);
    }

    private android.view.View A00(com.facebook.ads.redexgen.core.C1196Za c1196Za) {
        com.facebook.ads.redexgen.core.YM ym;
        int i;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        ym = c1196Za.A01;
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        imageView.setColorFilter(-1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.A01, this.A01);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        i = c1196Za.A00;
        gradientDrawable.setColor(i);
        com.facebook.ads.redexgen.core.YB.A0V(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        android.widget.TextView subtitleView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.YB.A0a(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        str = c1196Za.A06;
        subtitleView.setText(str);
        subtitleView.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        android.widget.TextView titleView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.YB.A0a(titleView, false, 16);
        titleView.setTextColor(-10459280);
        str2 = c1196Za.A05;
        titleView.setText(str2);
        titleView.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        z = c1196Za.A08;
        if (z) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = c1196Za.A04;
            if (!android.text.TextUtils.isEmpty(str3)) {
                com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A03);
                android.widget.LinearLayout.LayoutParams iconParams = new android.widget.LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c1330bk.setFullCircleCorners(true);
                com.facebook.ads.redexgen.core.LM A05 = new com.facebook.ads.redexgen.core.LM(c1330bk, this.A03).A05(A0F, A0F);
                str5 = c1196Za.A04;
                A05.A07(str5);
                linearLayout2.addView(c1330bk, iconParams);
            }
            com.facebook.ads.redexgen.core.C1203Zh c1203Zh = new com.facebook.ads.redexgen.core.C1203Zh(this.A03);
            str4 = c1196Za.A03;
            c1203Zh.setData(str4, com.facebook.ads.redexgen.core.YM.CHECKMARK);
            c1203Zh.setSelected(true);
            linearLayout2.addView(c1203Zh, new android.widget.LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private android.view.View A01(com.facebook.ads.redexgen.core.C1196Za c1196Za) {
        boolean z;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z = c1196Za.A09;
        if (z) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CROSS));
            imageView.setOnClickListener(new com.facebook.ads.redexgen.core.ZY(this));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private android.view.View getFooterView() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.SETTINGS));
        imageView.setColorFilter(-13272859);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.YB.A0a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        android.widget.LinearLayout.LayoutParams settingsIconParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new com.facebook.ads.redexgen.core.ZZ(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
