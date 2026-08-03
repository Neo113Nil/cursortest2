package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class M6 extends android.widget.LinearLayout implements com.facebook.ads.redexgen.core.InterfaceC1279av {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final android.net.Uri A0L;
    public static final android.view.View.OnTouchListener A0M;
    public android.widget.ImageView A00;
    public android.widget.ImageView A01;
    public android.widget.ImageView A02;
    public android.widget.ImageView A03;
    public android.widget.LinearLayout A04;
    public com.facebook.ads.redexgen.core.C1271an A05;
    public com.facebook.ads.redexgen.core.InterfaceC1278au A06;
    public java.lang.String A07;
    public final android.webkit.WebView A08;
    public final com.facebook.ads.redexgen.core.C1636gi A09;
    public final com.facebook.ads.redexgen.core.InterfaceC1275ar A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, com.google.common.base.Ascii.DC2, -114, -73, -70, -66, -80, -22, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ESC, 5, com.google.common.base.Ascii.SYN, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, -45, -5, 5, -6, 7, 4, com.google.common.base.Ascii.ETB, 36, com.google.common.base.Ascii.SUB, 40, 37, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, -28, com.google.common.base.Ascii.US, 36, 42, com.google.common.base.Ascii.ESC, 36, 42, -28, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, 42, com.google.common.base.Ascii.US, 37, 36, -28, com.google.common.base.Ascii.FF, -1, -5, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, -35, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 19, 33, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, 19, -35, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 33, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0I = android.graphics.Color.rgb(224, 224, 224);
        A0L = com.facebook.ads.redexgen.core.XB.A00(A06(90, 23, 25));
        A0M = new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1260ac();
        A0K = android.graphics.Color.argb(34, 0, 0, 0);
        A0G = com.facebook.ads.redexgen.core.XV.A0P;
        A0H = com.facebook.ads.redexgen.core.XV.A0I;
        A0J = com.facebook.ads.redexgen.core.XV.A0A;
    }

    public M6(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.webkit.WebView webView) {
        this(c1636gi, webView, false, false);
    }

    public M6(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.webkit.WebView webView, boolean z, boolean z2) {
        super(c1636gi);
        this.A0A = new com.facebook.ads.redexgen.core.M7(this);
        this.A08 = webView;
        this.A09 = c1636gi;
        this.A0B = com.facebook.ads.redexgen.core.AbstractC1087Uq.A06(c1636gi);
        this.A0D = z;
        this.A0C = z2;
        A08();
        if (z2) {
            A0C(false);
        }
    }

    private void A08() {
        float f;
        com.facebook.ads.redexgen.core.YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new android.widget.ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 16));
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A0G, A0G);
        this.A01.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0M);
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1261ad(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !com.facebook.ads.redexgen.core.C1086Up.A2w(this.A09)) {
            this.A00 = new android.widget.ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            android.view.ViewGroup.LayoutParams backButtonParams = new android.widget.LinearLayout.LayoutParams(A0G, A0G);
            this.A00.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BACK_ARROW));
            this.A00.setOnTouchListener(A0M);
            this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1262ae(this));
            addView(this.A00, backButtonParams);
        }
        this.A05 = new com.facebook.ads.redexgen.core.C1271an(this.A09);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        if (this.A0B || com.facebook.ads.redexgen.core.C1086Up.A2w(this.A09)) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        layoutParams2.weight = f;
        this.A05.setGravity(17);
        if (com.facebook.ads.redexgen.core.C1086Up.A2w(this.A09) && !this.A0D) {
            this.A04 = new android.widget.LinearLayout(this.A09);
            this.A04.setOrientation(1);
            this.A04.setPadding(0, A0J, 0, A0J);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            android.widget.ImageView imageView = new android.widget.ImageView(this.A09);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.HANDLER));
            imageView.setPadding(0, A0H, 0, A0H);
            android.widget.LinearLayout.LayoutParams closeButtonParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(imageView, closeButtonParams);
            android.widget.LinearLayout.LayoutParams titleViewsParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A05, titleViewsParams);
        } else {
            addView(this.A05, layoutParams2);
        }
        if (this.A0B && !com.facebook.ads.redexgen.core.C1086Up.A2w(this.A09)) {
            this.A02 = new android.widget.ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            android.view.ViewGroup.LayoutParams titleViewsParams2 = new android.widget.LinearLayout.LayoutParams(A0G, A0G);
            this.A02.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(com.facebook.ads.redexgen.core.YN.A02(com.facebook.ads.redexgen.core.YM.BACK_ARROW));
            this.A02.setOnTouchListener(A0M);
            this.A02.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1263af(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new android.widget.ImageView(this.A09);
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(A0G, A0G);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0M);
        this.A03.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1264ag(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (A06(72, 18, 116).equals(r3.activityInfo.packageName) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        r3 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_LAUNCH_CHROME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        if (A06(72, 18, 116).equals(r3.activityInfo.packageName) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09() {
        android.content.pm.PackageManager packageManager;
        android.graphics.Bitmap bitmap = null;
        boolean A0k = com.facebook.ads.redexgen.core.C1086Up.A0k(this.A09);
        if (!A0k && (packageManager = this.A09.getPackageManager()) != null) {
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new android.content.Intent(A06(46, 26, 123), A0L), 65536);
            if (queryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else {
                if (queryIntentActivities.size() == 1) {
                    android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(0);
                    java.lang.String[] strArr = A0F;
                    if (strArr[4].length() != strArr[0].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A0F[6] = "Y9G9nX";
                    if (resolveInfo.activityInfo != null) {
                        android.content.pm.ResolveInfo resolveInfo2 = queryIntentActivities.get(0);
                        if (A0F[2].length() != 9) {
                            java.lang.String[] strArr2 = A0F;
                            strArr2[7] = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH";
                            strArr2[3] = "kBU630hheaj535sYoezwG0Sk33mkxVnX";
                        }
                    }
                }
                bitmap = getExternalBrowserBitmap();
            }
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A2w(this.A09) || A0k) {
            this.A03.setVisibility(0);
            bitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(bitmap);
    }

    private void A0C(boolean z) {
        int i = z ? 0 : 8;
        android.widget.ImageView imageView = this.A00;
        if (A0F[1].charAt(15) == 'W') {
            throw new java.lang.RuntimeException();
        }
        A0F[2] = "nknH3C2";
        if (imageView != null) {
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
        return this.A0A;
    }

    private android.graphics.Bitmap getExternalBrowserBitmap() {
        if (this.A0C) {
            return com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_LAUNCH_NATIVE_V2);
        }
        return com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1278au interfaceC1278au) {
        this.A06 = interfaceC1278au;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public void setTitle(java.lang.String str) {
        this.A05.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1279av
    public void setUrl(java.lang.String str) {
        this.A07 = str;
        if (android.text.TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new android.graphics.PorterDuffColorFilter(A0I, android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((android.graphics.ColorFilter) null);
        }
    }
}
