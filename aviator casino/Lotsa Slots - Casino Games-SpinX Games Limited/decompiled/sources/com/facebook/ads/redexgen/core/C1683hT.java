package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1683hT extends com.facebook.ads.redexgen.core.C1006Rm implements com.facebook.ads.internal.api.AdOptionsViewApi, com.facebook.ads.redexgen.core.InterfaceC1242aK {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"HVqi6jlpWuJt2YtXNdvGk3FhV0BHl3EV", "MmKJ6DDV7RS65o7dKLAsYGebg3Me5CTe", "1YJN2Qnc4ttaIZRVWQztvMy6euLicnbf", "AdY32lBMWhACAu5OzQBb3WT", "7pW2kqTunwh3p", "By284lxDKeQhXfwWoADF7ASQT9nDXNCZ", "", "3GcamP2dghLgpW6nys2YEXVC3i8y"};
    public static final int A0D;
    public static final int A0E;
    public android.widget.ImageView A00;
    public android.widget.ImageView A01;
    public com.facebook.ads.redexgen.core.C1254aW A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final android.content.Context A06;
    public final android.widget.LinearLayout A07;
    public final com.facebook.ads.AdOptionsView A08;
    public final com.facebook.ads.NativeAdLayout A09;
    public final com.facebook.ads.redexgen.core.UK A0A;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        byte[] bArr = {81, 102, 115, 108, 113, 119, 35, 66, 103};
        java.lang.String[] strArr = A0C;
        if (strArr[3].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[3] = "u5VvbSB0F1Ye86S0UUtiEMk";
        strArr2[7] = "xkynJM0f4daSI4M9ryujsiLCexBq";
        A0B = bArr;
    }

    static {
        A08();
        A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 23.0f);
        A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    }

    public C1683hT(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation orientation, int i, com.facebook.ads.AdOptionsView adOptionsView) {
        this.A05 = false;
        this.A04 = false;
        this.A03 = false;
        this.A08 = adOptionsView;
        this.A09 = nativeAdLayout;
        this.A06 = context;
        this.A07 = new android.widget.LinearLayout(context);
        this.A08.addView(this.A07);
        this.A07.setOrientation(orientation != com.facebook.ads.AdOptionsView.Orientation.HORIZONTAL ? 1 : 0);
        this.A0A = com.facebook.ads.redexgen.core.UK.A0L(nativeAdBase.getInternalNativeAd());
        this.A0A.A1c(nativeAdLayout);
        this.A0A.A1e(this);
        com.facebook.ads.redexgen.core.C1818ju A12 = this.A0A.A12();
        if (A12 != null && A12.A0R() && !A12.A0P()) {
            this.A07.setVisibility(8);
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A08, com.facebook.ads.redexgen.core.EnumC1146Xc.A0C);
        if (A0C()) {
            A05();
            return;
        }
        if (A0B()) {
            A06();
        } else {
            A09(i);
        }
        A04();
    }

    public C1683hT(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private android.widget.ImageView A00(com.facebook.ads.redexgen.core.YM ym) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.A08.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(A0E, A0E, A0E, A0E);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        return imageView;
    }

    public static com.facebook.ads.redexgen.core.YM A01(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (com.facebook.ads.redexgen.core.AbstractC1243aL.A00(abstractC1801jd) == com.facebook.ads.redexgen.core.EnumC1247aP.A02) {
            return com.facebook.ads.redexgen.core.YM.AD_CHOICE_COLLAPSED_PILL;
        }
        return com.facebook.ads.redexgen.core.YM.CREDIT_LINE_COLLAPSED_PILL;
    }

    public static com.facebook.ads.redexgen.core.YM A02(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (com.facebook.ads.redexgen.core.AbstractC1243aL.A00(abstractC1801jd) == com.facebook.ads.redexgen.core.EnumC1247aP.A02) {
            return com.facebook.ads.redexgen.core.YM.AD_CHOICE_EXPANDED_PILL;
        }
        return com.facebook.ads.redexgen.core.YM.CREDIT_LINE_PILL;
    }

    private void A04() {
        this.A07.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Rb
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1683hT.this.A0D(view);
            }
        });
    }

    private void A05() {
        com.facebook.ads.redexgen.core.C1245aN A02 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0A.A15(), com.facebook.ads.redexgen.core.EnumC1244aM.A05, this.A0A.A13());
        A02.setBackgroundColor(-2145637581);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.A07.addView(A02, layoutParams);
    }

    private void A06() {
        if (this.A0A.A13() != null) {
            A0A(A01(this.A0A.A13()));
        }
        if (this.A00 != null && this.A09 != null && this.A0A.A13() != null) {
            this.A02 = com.facebook.ads.redexgen.core.AbstractC1246aO.A03(this.A0A.A15(), com.facebook.ads.redexgen.core.EnumC1244aM.A05, this.A0A.A13(), this.A00, A02(this.A0A.A13()), this.A09, this);
            if (this.A0A.A13().A2Q()) {
                this.A02.A0A();
            }
        }
    }

    private void A07() {
        this.A0A.A1O();
        if (com.facebook.ads.redexgen.core.C1086Up.A2Z(this.A06)) {
            this.A07.performAccessibilityAction(128, null);
        }
    }

    private void A09(int i) {
        this.A01 = A00(com.facebook.ads.redexgen.core.YM.DEFAULT_INFO_ICON);
        A0A(com.facebook.ads.redexgen.core.YM.AD_CHOICES_ICON);
        this.A07.addView(this.A01);
        setIconSizeDp(i);
        setIconColor(-10459280);
    }

    private void A0A(com.facebook.ads.redexgen.core.YM ym) {
        this.A00 = A00(ym);
        this.A00.setContentDescription(A03(0, 9, 53));
        this.A07.addView(this.A00);
    }

    private boolean A0B() {
        return this.A0A.A13() != null && this.A0A.A13().A2Q();
    }

    private boolean A0C() {
        return this.A0A.A13() != null && this.A0A.A13().A2W();
    }

    public final /* synthetic */ void A0D(android.view.View view) {
        if (A0B()) {
            if (this.A02 != null) {
                this.A02.A0B();
                return;
            }
            return;
        }
        A07();
    }

    public final void A0E(com.facebook.ads.redexgen.core.YM ym) {
        if (this.A01 != null) {
            this.A01.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        }
    }

    public final boolean A0F() {
        return this.A03;
    }

    public final boolean A0G() {
        return this.A04;
    }

    public final boolean A0H() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1242aK
    public final void ADW(android.view.View view) {
        A07();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z && this.A02 != null) {
            this.A02.A09();
        }
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        if (this.A01 != null) {
            this.A01.setColorFilter(i);
        }
        if (this.A00 != null && !A0B()) {
            this.A00.setColorFilter(i);
            this.A03 = true;
        }
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int iconSize = java.lang.Math.max(A0D, (int) (com.facebook.ads.redexgen.core.XX.A02 * i));
        android.widget.LinearLayout.LayoutParams iconParams = new android.widget.LinearLayout.LayoutParams(iconSize, iconSize);
        if (this.A01 != null) {
            this.A01.setLayoutParams(iconParams);
        }
        if (this.A00 != null) {
            this.A00.setLayoutParams(iconParams);
            this.A04 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setOnAdClosedListener(com.facebook.ads.AdClosedListener adClosedListener) {
        this.A0A.A1Y(adClosedListener);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.YB.A0O(this.A01, z ? 8 : 0);
        }
        this.A05 = true;
    }
}
