package com.facebook.ads.internal.view;

/* loaded from: assets/audience_network/classes2.dex */
public final class FullScreenAdToolbar extends com.facebook.ads.redexgen.core.AbstractC1171Yb {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public com.facebook.ads.redexgen.core.YZ A00;
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya A01;
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya A02;
    public com.facebook.ads.redexgen.core.ZC A03;
    public boolean A04;
    public boolean A05;
    public final android.widget.RelativeLayout A06;
    public final com.facebook.ads.redexgen.core.VI A07;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A08;
    public final com.facebook.ads.redexgen.core.ZK A09;
    public final com.facebook.ads.redexgen.core.C1473e4 A0A;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 22);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new java.lang.RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
        A0H = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    }

    public FullScreenAdToolbar(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.VI vi, int i, int i2, boolean z) {
        super(c1636gi);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z;
        this.A08 = interfaceC1177Yh;
        this.A07 = vi;
        setGravity(16);
        this.A09 = new com.facebook.ads.redexgen.core.ZK(c1636gi, i, z);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1186Yq(this));
        if (!this.A05) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new android.widget.RelativeLayout(c1636gi);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new com.facebook.ads.redexgen.core.C1473e4(c1636gi);
            com.facebook.ads.redexgen.core.YB.A0G(1006, this.A0A);
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i2 != -1) {
                A0G(c1636gi, i2);
                return;
            }
            return;
        }
        if (i2 != -1) {
            A0G(c1636gi, i2);
        }
        this.A06 = new android.widget.RelativeLayout(c1636gi);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new com.facebook.ads.redexgen.core.C1473e4(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0G(1006, this.A0A);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A08() {
        super.A08();
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        if (this.A03 != null) {
            this.A03.setVisibility(8);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A09() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0A() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0B() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0C(float f, int i) {
        this.A09.A03(f, i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0D(com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z) {
        boolean z2 = this.A04;
        int A05 = c0894Na.A05(z2);
        this.A0A.A02(c0894Na.A0B(z2), A05);
        boolean z3 = this.A05;
        java.lang.String A02 = A02(8, 9, 52);
        if (!z3) {
            if (this.A00 != null) {
                this.A00.setIconColors(A05);
                this.A00.setContentDescription(A02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(A05);
            this.A03.setContentDescription(A02);
        }
        this.A09.A04(c0894Na, z2, z);
        if (z2) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            com.facebook.ads.redexgen.core.YB.A0V(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final boolean A0E() {
        return this.A09.A05();
    }

    public final void A0F(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, int i) {
        this.A09.setInitialUnskippableSeconds(i);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c0906Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c0906Nm, str, this.A07, this.A08);
        }
    }

    public final void A0G(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i) {
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A00);
            this.A00.removeAllViews();
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new com.facebook.ads.redexgen.core.YZ(c1636gi, i);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new com.facebook.ads.redexgen.core.ZC(c1636gi);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public int getToolbarHeight() {
        return com.facebook.ads.redexgen.core.AbstractC1171Yb.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setAdReportingVisible(boolean z) {
        A04(!this.A05 ? this.A00 : this.A03, z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setCTAClickListener(android.view.View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A0A.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(viewOnClickListenerC0834Kr, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setFullscreen(boolean z) {
        this.A04 = z;
    }

    public void setOnlyPageDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm) {
        if (c0906Nm != null) {
            this.A0A.setPageDetails(c0906Nm);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setPageDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, int i, com.facebook.ads.redexgen.core.C0912Ns c0912Ns) {
        this.A09.setInitialUnskippableSeconds(i);
        this.A0A.setPageDetails(c0906Nm);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c0906Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c0906Nm, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setPageDetailsVisible(boolean z) {
        this.A06.removeAllViews();
        if (z) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgress(float f) {
        this.A09.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressClickListener(android.view.View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressImage(com.facebook.ads.redexgen.core.YM ym) {
        this.A09.setProgressImage(ym);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressImmediate(float f) {
        this.A09.setProgressImmediate(f);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressSpinnerInvisible(boolean z) {
        this.A09.setProgressSpinnerInvisible(z);
    }

    private void setReportingViewColor(android.view.View view) {
        if (view != null) {
            com.facebook.ads.redexgen.core.YB.A0S(view, 0, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarActionMessage(java.lang.String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarActionMode(int i) {
        this.A09.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarListener(com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya) {
        this.A02 = interfaceC1170Ya;
    }
}
