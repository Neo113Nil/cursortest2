package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1336bq extends android.widget.LinearLayout {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final android.widget.TextView A00;
    public final android.widget.TextView A01;
    public final android.widget.TextView A02;
    public final boolean A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 10, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CR};
    }

    static {
        A01();
        A06 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C1336bq(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z, int i, int i2, int i3) {
        super(c1636gi);
        setOrientation(1);
        this.A02 = new android.widget.TextView(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0a(this.A02, true, i);
        this.A02.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new android.widget.TextView(c1636gi);
        this.A00 = new android.widget.TextView(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0a(this.A00, false, i2);
        this.A00.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = com.facebook.ads.redexgen.core.C1086Up.A17(c1636gi);
        int i4 = this.A03 ? -2 : -1;
        addView(this.A02, new android.widget.LinearLayout.LayoutParams(i4, -2));
        addView(this.A01, new android.widget.LinearLayout.LayoutParams(i4, -2));
        this.A01.setVisibility(8);
        A03(c0894Na, z);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i4, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1336bq(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z, boolean z2, boolean z3) {
        this(c1636gi, c0894Na, z, r4, r5, z3 ? r6 / 2 : r6);
        int i = z2 ? 18 : 22;
        int i2 = z2 ? 14 : 16;
        int i3 = A07;
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z) {
        this.A02.setTextColor(c0894Na.A07(z));
        this.A01.setTextColor(c0894Na.A05(z));
        this.A00.setTextColor(c0894Na.A06(z));
    }

    public final void A04(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        boolean z3 = !android.text.TextUtils.isEmpty(str);
        boolean z4 = !android.text.TextUtils.isEmpty(str2);
        android.widget.TextView textView = this.A02;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        android.widget.TextView textView2 = this.A00;
        if (!z3) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i = 3;
        java.lang.String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            java.lang.String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z3 || !z4) {
                android.widget.TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    java.lang.String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z) {
                        i = 2;
                    } else if (z2) {
                        i = 4;
                    }
                    textView3.setMaxLines(i);
                    return;
                }
            } else {
                this.A02.setMaxLines(z ? 1 : 2);
                this.A00.setMaxLines(z ? 1 : z2 ? 3 : 2);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public android.widget.TextView getDescriptionTextView() {
        return this.A00;
    }

    public android.widget.TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i) {
        if (this.A03) {
            setGravity(i);
        }
        this.A02.setGravity(i);
        this.A00.setGravity(i);
    }

    public void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC1339bt A03 = com.facebook.ads.redexgen.core.AbstractC1340bu.A03(viewOnClickListenerC0834Kr, A00(0, 9, 20));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionTextSize(int i) {
        this.A00.setTextSize(i);
    }

    public void setDescriptionVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public void setTitleTextSize(int i) {
        this.A02.setTextSize(i);
    }
}
