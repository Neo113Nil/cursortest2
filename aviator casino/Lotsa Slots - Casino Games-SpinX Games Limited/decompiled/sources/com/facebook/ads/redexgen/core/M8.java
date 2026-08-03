package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class M8 extends android.widget.LinearLayout implements com.facebook.ads.redexgen.core.InterfaceC1279av {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"gmSbsJUTV6ssYU6sPFdQApLIq3Ne91IM", "MfGeHL5PmkPbpLjQYYWOTSdzt", "", "SJThwTW85f7z2tdQDzwWLTm6w", "rQXooJE", "LhKJvtc1UCCcm5M0SWMNGP7YHUEfZfxE", "", "2Oh5HyK"};
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final android.net.Uri A0H;
    public static final android.view.View.OnTouchListener A0I;
    public android.widget.ImageView A00;
    public android.widget.ImageView A01;
    public android.widget.ImageView A02;
    public android.widget.ImageView A03;
    public com.facebook.ads.redexgen.core.C1270am A04;
    public com.facebook.ads.redexgen.core.InterfaceC1278au A05;
    public java.lang.String A06;
    public final android.webkit.WebView A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.InterfaceC1275ar A09;
    public final boolean A0A;
    public final boolean A0B;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 93);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {-43, -12, -10, -2, -68, -27, -24, -20, -34, 0, 41, 44, 49, com.google.common.base.Ascii.ESC, 44, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, 56, 45, 54, -24, 54, 41, 60, 49, 62, 45, -24, 42, 58, 55, 63, 59, 45, 58, 41, 42, 55, kotlin.io.encoding.Base64.padSymbol, 60, 2, 42, 52, 41, 54, 51, 55, 68, 58, 72, 69, 63, 58, 4, 63, 68, 74, 59, 68, 74, 4, 55, 57, 74, 63, 69, 68, 4, 44, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, 45, -29, -17, -19, -82, -31, -18, -28, -14, -17, -23, -28, -82, -29, -24, -14, -17, -19, -27, 59, 71, 71, 67, com.google.common.base.Ascii.CR, 2, 2, 74, 74, 74, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 54, 66, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO};
        java.lang.String[] strArr = A0D;
        if (strArr[2].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0D;
        strArr2[7] = "Ujyw6mT";
        strArr2[4] = "Vqhraj8";
        A0C = bArr;
    }

    static {
        A0A();
        A0F = android.graphics.Color.rgb(224, 224, 224);
        A0G = android.graphics.Color.argb(34, 0, 0, 0);
        A0E = com.facebook.ads.redexgen.core.XV.A0k;
        A0H = com.facebook.ads.redexgen.core.XB.A00(A06(90, 23, 118));
        A0I = new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1255aX();
    }

    public M8(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.webkit.WebView webView, boolean z) {
        super(c1636gi);
        this.A09 = new com.facebook.ads.redexgen.core.M9(this);
        this.A07 = webView;
        this.A08 = c1636gi;
        this.A0A = com.facebook.ads.redexgen.core.AbstractC1087Uq.A06(c1636gi);
        this.A0B = z;
        A08();
        A0C(false);
    }

    private void A08() {
        float f;
        com.facebook.ads.redexgen.core.YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new android.widget.ImageView(this.A08);
        this.A01.setContentDescription(A06(4, 5, 28));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A0E, A0E);
        layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0b, 0);
        this.A01.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0I);
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1256aY(this));
        addView(this.A01, layoutParams);
        if (this.A0A && !com.facebook.ads.redexgen.core.C1086Up.A2w(this.A08)) {
            this.A00 = new android.widget.ImageView(this.A08);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 54));
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A0E, A0E);
            this.A00.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BACK_ARROW_V2));
            this.A00.setOnTouchListener(A0I);
            this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1257aZ(this));
            addView(this.A00, layoutParams2);
        }
        this.A04 = new com.facebook.ads.redexgen.core.C1270am(this.A08);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, -2);
        if (this.A0A || com.facebook.ads.redexgen.core.C1086Up.A2w(this.A08)) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        layoutParams3.weight = f;
        this.A04.setGravity(17);
        if (com.facebook.ads.redexgen.core.C1086Up.A2w(this.A08) && !this.A0B) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A08);
            linearLayout.setOrientation(1);
            addView(linearLayout, layoutParams3);
            com.facebook.ads.redexgen.core.YB.A0K(linearLayout);
            android.widget.ImageView imageView = new android.widget.ImageView(this.A08);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.HANDLER));
            linearLayout.addView(imageView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            android.widget.LinearLayout.LayoutParams closeButtonParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView(this.A04, closeButtonParams);
        } else {
            addView(this.A04, layoutParams3);
        }
        if (this.A0A && !com.facebook.ads.redexgen.core.C1086Up.A2w(this.A08)) {
            this.A02 = new android.widget.ImageView(this.A08);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 93));
            android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(A0E, A0E);
            this.A02.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(com.facebook.ads.redexgen.core.YN.A02(com.facebook.ads.redexgen.core.YM.BACK_ARROW_V2));
            this.A02.setOnTouchListener(A0I);
            this.A02.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1258aa(this));
            addView(this.A02, layoutParams4);
        }
        this.A03 = new android.widget.ImageView(this.A08);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(A0E, A0E);
        layoutParams5.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, 0, 0);
        this.A03.setContentDescription(A06(16, 19, 107));
        this.A03.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0I);
        this.A03.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1259ab(this));
        addView(this.A03, layoutParams5);
        A09();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (r5 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r4.get(0).activityInfo == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (A06(72, 18, 35).equals(r4.get(0).activityInfo.packageName) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r5 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_LAUNCH_CHROME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r5 = getExternalBrowserBitmap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        if (r5 == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09() {
        android.content.pm.PackageManager packageManager;
        android.graphics.Bitmap bitmap = null;
        boolean A0k = com.facebook.ads.redexgen.core.C1086Up.A0k(this.A08);
        if (!A0k && (packageManager = this.A08.getPackageManager()) != null) {
            java.util.List<android.content.pm.ResolveInfo> infos = packageManager.queryIntentActivities(new android.content.Intent(A06(46, 26, 121), A0H), 65536);
            if (infos.isEmpty()) {
                this.A03.setVisibility(8);
            } else {
                int size = infos.size();
                java.lang.String[] strArr = A0D;
                if (strArr[7].length() == strArr[4].length()) {
                    A0D[0] = "OiPmrAn3GllLAwonlzrco6n6FhbN6530";
                }
            }
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A2w(this.A08) || A0k) {
            android.widget.ImageView imageView = this.A03;
            java.lang.String[] strArr2 = A0D;
            if (strArr2[2].length() != strArr2[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A0D[0] = "H3zrzdIXpl7cuf9737Dh0UcXPx3q90pI";
            imageView.setVisibility(0);
            bitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(bitmap);
        java.lang.String[] strArr3 = A0D;
        if (strArr3[2].length() != strArr3[6].length()) {
            throw new java.lang.RuntimeException();
        }
        A0D[5] = "C5b1pkMeIVGGxpo7XcAe9IGkuMZh8kn1";
    }

    private void A0C(boolean z) {
        int i = z ? 0 : 8;
        if (this.A00 != null) {
            this.A00.setVisibility(i);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (z) {
            A0C(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public com.facebook.ads.redexgen.core.InterfaceC1275ar getBrowserNavigationListener() {
        return this.A09;
    }

    public static android.graphics.Bitmap getExternalBrowserBitmap() {
        com.facebook.ads.redexgen.core.YM ym = com.facebook.ads.redexgen.core.YM.BROWSER_LAUNCH_NATIVE_V2;
        if (A0D[0].charAt(23) == 'K') {
            throw new java.lang.RuntimeException();
        }
        A0D[0] = "lUY1mRDCMXM3WZHcFiHRXNaY27JpPEEp";
        return com.facebook.ads.redexgen.core.YN.A01(ym);
    }

    public void setCloseButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1278au interfaceC1278au) {
        this.A05 = interfaceC1278au;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public void setTitle(java.lang.String str) {
        this.A04.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public void setUrl(java.lang.String str) {
        this.A06 = str;
        if (!android.text.TextUtils.isEmpty(this.A06)) {
            java.lang.String A06 = A06(35, 11, 107);
            if (A0D[0].charAt(23) == 'K') {
                throw new java.lang.RuntimeException();
            }
            A0D[0] = "qQ1cUQL6zuFcmcs6RwakvLgHhcCBx0UL";
            if (!A06.equals(this.A06)) {
                this.A04.setSubtitle(this.A06);
                this.A03.setEnabled(true);
                this.A03.setColorFilter((android.graphics.ColorFilter) null);
                return;
            }
        }
        this.A04.setSubtitle(null);
        this.A03.setEnabled(false);
        this.A03.setColorFilter(new android.graphics.PorterDuffColorFilter(A0F, android.graphics.PorterDuff.Mode.SRC_IN));
    }
}
