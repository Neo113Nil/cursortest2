package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1318bY extends android.widget.RelativeLayout {
    public static java.lang.String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final android.widget.LinearLayout A01;
    public final com.facebook.ads.redexgen.core.C1795jT A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.VA A04;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A05;

    public C1318bY(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1795jT c1795jT, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, int i, int i2) {
        super(c1636gi);
        this.A03 = c1636gi;
        this.A02 = c1795jT;
        this.A04 = va;
        this.A05 = interfaceC1177Yh;
        this.A00 = i;
        this.A01 = new android.widget.LinearLayout(c1636gi);
        A00();
        addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i2);
    }

    private void A00() {
        int i = 0;
        while (true) {
            int A23 = this.A02.A23();
            java.lang.String[] strArr = A06;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[4];
            int charAt = str.charAt(18);
            int i2 = str2.charAt(18);
            if (charAt == i2) {
                throw new java.lang.RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i < A23) {
                com.facebook.ads.redexgen.core.LF lf = new com.facebook.ads.redexgen.core.LF(this.A03, this.A02.A27(i), this.A04, this.A05);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i3 = com.facebook.ads.redexgen.core.LF.A0C;
                int i4 = com.facebook.ads.redexgen.core.LF.A0C;
                int i5 = com.facebook.ads.redexgen.core.LF.A0C;
                int i6 = com.facebook.ads.redexgen.core.LF.A0C;
                layoutParams.setMargins(i3, i4, i5, i6);
                lf.setLayoutParams(layoutParams);
                this.A01.addView(lf);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
        }
    }
}
