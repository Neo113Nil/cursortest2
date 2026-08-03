package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1459dq extends android.widget.LinearLayout {
    public android.widget.LinearLayout A00;
    public java.lang.String A01;
    public boolean A02;
    public final int A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;
    public final com.facebook.ads.redexgen.core.C1330bk A05;
    public final com.facebook.ads.redexgen.core.C1336bq A06;
    public static java.lang.String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.XX.A02 * 32.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1459dq(com.facebook.ads.redexgen.core.Cdo cdo) {
        super(r0);
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.C0894Na c0894Na;
        int i;
        boolean z;
        java.lang.String str;
        c1636gi = cdo.A08;
        this.A02 = false;
        this.A01 = "";
        c1636gi2 = cdo.A08;
        this.A04 = c1636gi2;
        this.A05 = new com.facebook.ads.redexgen.core.C1330bk(this.A04);
        com.facebook.ads.redexgen.core.C1636gi c1636gi3 = this.A04;
        c0894Na = cdo.A01;
        this.A06 = new com.facebook.ads.redexgen.core.C1336bq(c1636gi3, c0894Na, true, false, true);
        i = cdo.A00;
        this.A03 = i;
        z = cdo.A05;
        this.A02 = z;
        str = cdo.A04;
        this.A01 = str;
        A03(cdo);
    }

    public /* synthetic */ C1459dq(com.facebook.ads.redexgen.core.Cdo cdo, com.facebook.ads.redexgen.core.GX gx) {
        this(cdo);
    }

    private void A00() {
        A01(this.A05, androidx.compose.material.TextFieldImplKt.AnimationDuration);
        A01(this.A06, 170);
        if (this.A00 != null) {
            A01(this.A00, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN);
        }
    }

    private void A01(android.view.View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator(2.0f));
    }

    private void A02(com.facebook.ads.redexgen.core.Cdo cdo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        str = cdo.A03;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.A00 = new android.widget.LinearLayout(getContext());
            this.A00.setGravity(17);
            int i = A0C / 2;
            if (this.A02) {
                i = 0;
            }
            android.widget.LinearLayout linearLayout = this.A00;
            int i2 = A0C;
            int i3 = A0C;
            int marginTop = A0C;
            linearLayout.setPadding(i2, i, i3, marginTop / 2);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, i, 0, 0);
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setTextColor(-1);
            com.facebook.ads.redexgen.core.YB.A0a(textView, false, 16);
            str2 = cdo.A03;
            textView.setText(str2);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            com.facebook.ads.redexgen.core.LM A04 = new com.facebook.ads.redexgen.core.LM(imageView, this.A04).A04();
            str3 = cdo.A02;
            A04.A07(str3);
            int i4 = A0A;
            int marginTop2 = A0A;
            android.widget.LinearLayout.LayoutParams informativeContainerParams = new android.widget.LinearLayout.LayoutParams(i4, marginTop2);
            int marginTop3 = A0C;
            informativeContainerParams.setMargins(0, 0, marginTop3 / 2, 0);
            if (this.A02) {
                com.facebook.ads.redexgen.core.C1324be c1324be = new com.facebook.ads.redexgen.core.C1324be(getContext(), 0, -1, com.facebook.ads.redexgen.core.YM.PLAYABLE_ICON);
                c1324be.setLayoutParams(new android.widget.LinearLayout.LayoutParams(A0B, A0B));
                this.A00.addView(c1324be);
            } else {
                this.A00.addView(imageView, informativeContainerParams);
                this.A00.addView(textView, layoutParams2);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setCornerRadius(100.0f);
                gradientDrawable.setColor(469762047);
                com.facebook.ads.redexgen.core.YB.A0V(this.A00, gradientDrawable);
            }
            android.view.View view = this.A00;
            java.lang.String[] strArr = A07;
            java.lang.String str4 = strArr[5];
            java.lang.String str5 = strArr[7];
            int length = str4.length();
            int marginTop4 = str5.length();
            if (length != marginTop4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
            strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
            addView(view, layoutParams);
        }
    }

    private void A03(com.facebook.ads.redexgen.core.Cdo cdo) {
        com.facebook.ads.redexgen.core.NY ny;
        com.facebook.ads.redexgen.core.C0906Nm c0906Nm;
        com.facebook.ads.redexgen.core.NY ny2;
        com.facebook.ads.redexgen.core.C0906Nm c0906Nm2;
        com.facebook.ads.redexgen.core.YB.A0N(this.A05, 0);
        this.A05.setRadius(50);
        if (!this.A02) {
            ny = cdo.A06;
            if (ny.A00() == com.facebook.ads.redexgen.core.NW.A05) {
                this.A05.setFullCircleCorners(true);
            } else {
                com.facebook.ads.redexgen.core.C1330bk c1330bk = this.A05;
                int i = A09;
                java.lang.String[] strArr = A07;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
                c1330bk.setRadius(i);
            }
        } else {
            this.A05.setRadius(A09);
        }
        com.facebook.ads.redexgen.core.LM A04 = new com.facebook.ads.redexgen.core.LM(this.A05, this.A04).A04();
        c0906Nm = cdo.A07;
        A04.A07(c0906Nm.A01());
        com.facebook.ads.redexgen.core.C1336bq c1336bq = this.A06;
        ny2 = cdo.A06;
        java.lang.String A0G = ny2.A0G();
        c0906Nm2 = cdo.A07;
        c1336bq.A04(A0G, c0906Nm2.A03(), null, false, true);
        if (!this.A02) {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        } else {
            this.A06.getDescriptionTextView().setText(this.A01);
        }
        this.A06.setAlignment(17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        android.view.View view = this.A05;
        android.view.ViewGroup.LayoutParams titleAndDescriptionParams = new android.widget.LinearLayout.LayoutParams(A08, A08);
        addView(view, titleAndDescriptionParams);
        addView(this.A06, layoutParams);
        A02(cdo);
        com.facebook.ads.redexgen.core.YB.A0N(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(com.facebook.ads.redexgen.core.InterfaceC1458dp interfaceC1458dp) {
        A00();
        postDelayed(new com.facebook.ads.redexgen.core.GX(this, interfaceC1458dp), this.A03);
    }
}
