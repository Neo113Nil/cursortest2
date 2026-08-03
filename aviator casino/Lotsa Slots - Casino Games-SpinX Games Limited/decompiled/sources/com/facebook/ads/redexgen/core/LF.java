package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class LF extends com.facebook.ads.redexgen.core.C0938Os {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", "O", "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final android.widget.LinearLayout A00;
    public final android.widget.RelativeLayout A01;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.VA A04;
    public final com.facebook.ads.redexgen.core.Y2 A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A06;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A02() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A03);
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A03);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A03).A05(A0D, A0D).A07(this.A02.A2C().A01());
        c1330bk.setFullCircleCorners(true);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        com.facebook.ads.redexgen.core.YB.A0K(c1330bk);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(c1330bk, layoutParams);
        android.widget.TextView textView = new android.widget.TextView(this.A03);
        com.facebook.ads.redexgen.core.YB.A0K(textView);
        textView.setTextColor(this.A02.A28().A01().A07(true));
        textView.setText(this.A02.A29().A0I().A0G());
        textView.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c1330bk.getId());
        relativeLayout.addView(textView, layoutParams2);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A03);
        com.facebook.ads.redexgen.core.YB.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        com.facebook.ads.redexgen.core.C1332bm c1332bm = new com.facebook.ads.redexgen.core.C1332bm(this.A03, A0B, 5, A0A, -1);
        c1332bm.setGravity(16);
        linearLayout.addView(c1332bm, new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.widget.TextView textView2 = new android.widget.TextView(this.A03);
        textView2.setTextColor(this.A02.A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        com.facebook.ads.redexgen.core.YB.A0a(textView2, false, 14);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (android.text.TextUtils.isEmpty(this.A02.A29().A0I().A0C())) {
            java.lang.String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c1332bm.setRating(java.lang.Float.parseFloat(this.A02.A29().A0I().A0C()));
            if (this.A02.A29().A0I().A09() != null) {
                textView2.setText(A00(0, 1, 116) + java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(this.A02.A29().A0I().A09())) + A00(1, 1, 1));
            }
        }
        android.widget.TextView textView3 = new android.widget.TextView(this.A03);
        textView3.setTextColor(this.A02.A28().A01().A07(true));
        textView3.setText(this.A02.A29().A0I().A04());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A03() {
        A07 = new byte[]{com.google.common.base.Ascii.GS, 105};
    }

    static {
        A03();
        A0C = (int) (com.facebook.ads.redexgen.core.C0938Os.A08 * 12.0f);
        A0D = (int) (com.facebook.ads.redexgen.core.C0938Os.A08 * 84.0f);
        A0B = (int) (com.facebook.ads.redexgen.core.C0938Os.A08 * 14.0f);
        A09 = com.facebook.ads.redexgen.core.XV.A0v;
        A0A = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
    }

    public LF(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi);
        this.A05 = new com.facebook.ads.redexgen.core.Y2();
        this.A03 = c1636gi;
        this.A02 = abstractC1801jd;
        this.A04 = va;
        this.A06 = interfaceC1177Yh;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new android.widget.RelativeLayout(c1636gi);
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1636gi, this.A01, abstractC1801jd.A29().A0H().A08());
        this.A00 = new android.widget.LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A02();
        A01();
        this.A01.addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private void A01() {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(this.A03, com.facebook.ads.redexgen.core.EnumC1529ez.A04.A03(), this.A02.A28().A01(), this.A02.A29().A0J().A06(), this.A04, this.A06, null, this.A05, this.A02.A2A());
        viewOnClickListenerC0834Kr.setViewShowsOverMedia(true);
        com.facebook.ads.redexgen.core.YB.A0G(1001, viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setCta(this.A02.A29().A0J(), this.A02.A2E(), new java.util.HashMap(), null);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        viewOnClickListenerC0834Kr.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(viewOnClickListenerC0834Kr, layoutParams);
    }
}
