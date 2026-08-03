package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1365cJ {
    public static byte[] A0N;
    public static java.lang.String[] A0O = {"pFRbUbIPvfwTsTWtR68DyqtfsQzo0Y9e", "Jmt0yS7cxIqywVTLVazlNOZqViG4fijG", "7JVXgwFSulrh0z9RNSntkrow2", "W96LwBzZpPkBapcy7gGTKWs8B4GUDBcq", "br88nFbBZbLJ3vTh4p9wwCNTIA57FmIY", "mzQptMR0Z3d1fPQPbwNf4EthVYWzR3DW", "IPE7BiI9pZn923UUuncSvZhUL3wMHGrT", "br6hrssh6VRKiVV1vNUkmhf3WWjX02F0"};
    public com.facebook.ads.redexgen.core.C1241aJ A08;
    public com.facebook.ads.redexgen.core.C1241aJ A09;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0E;
    public final int A0F;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0G;
    public final com.facebook.ads.redexgen.core.NN A0H;
    public final com.facebook.ads.redexgen.core.NY A0I;
    public final com.facebook.ads.redexgen.core.C0897Nd A0J;
    public final com.facebook.ads.redexgen.core.C1636gi A0K;
    public final com.facebook.ads.redexgen.core.VI A0L;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0M;
    public int A03 = 16;
    public int A02 = 12;
    public int A01 = 10;
    public int A04 = 20;
    public int A05 = 40;
    public int A06 = 52;
    public int A00 = 10;
    public int A07 = 8;
    public boolean A0D = true;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0O[2].length() != 25) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0O;
            strArr[3] = "XwNXbwlUcFi7qEktIehGuIyqazGrk614";
            strArr[1] = "hx9Csixc74t4pIrSAOrr1o5nquGlqFF4";
            copyOfRange[i4] = (byte) (i5 ^ 30);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{109, 118, 126, 126, 126, 126, 126, 126, 126, 4, 97, 97, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 53, 50, 47, 50, 47, 39, 42, 104, 32, 47, 40, 47, 53, 46, com.google.common.base.Ascii.EM, 39, 37, 50, 47, 48, 47, 50, 63, 42, 50, 48, 41};
    }

    static {
        A04();
    }

    public C1365cJ(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VI vi, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        this.A0K = c1636gi;
        this.A0M = interfaceC1177Yh;
        this.A0I = abstractC1801jd.A29().A0I();
        this.A0J = abstractC1801jd.A29().A0K();
        this.A0H = abstractC1801jd.A28();
        this.A0E = abstractC1801jd.A2T();
        this.A0C = abstractC1801jd.A2P();
        this.A0F = com.facebook.ads.redexgen.core.AbstractC1499eU.A00(c1636gi.getResources().getDisplayMetrics());
        this.A0L = vi;
        this.A0G = abstractC1801jd;
        A03();
    }

    private android.widget.ImageView A00(final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        android.graphics.Bitmap scaledBitmap = android.graphics.Bitmap.createScaledBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.OTHER_SKIP), this.A04, this.A04, true);
        android.widget.ImageView imageView = new android.widget.ImageView(this.A0K);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(android.graphics.Color.parseColor(A02(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cG
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1365cJ.A0B(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.this, view);
            }
        });
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        return imageView;
    }

    private android.widget.TextView A01() {
        if (android.text.TextUtils.isEmpty(this.A0G.A29().A0I().A08())) {
            return null;
        }
        android.widget.TextView textView = new android.widget.TextView(this.A0K);
        textView.setText(this.A0G.A29().A0I().A08());
        textView.setTextColor(-1);
        textView.setTextSize(13.0f);
        textView.setGravity(17);
        return textView;
    }

    private void A03() {
        this.A03 *= this.A0F;
        this.A02 *= this.A0F;
        this.A01 *= this.A0F;
        this.A04 *= this.A0F;
        this.A05 *= this.A0F;
        this.A06 *= this.A0F;
        this.A00 *= this.A0F;
        this.A07 *= this.A0F;
    }

    private void A05(android.widget.FrameLayout frameLayout) {
        android.view.View view = new android.view.View(this.A0K);
        view.setBackgroundColor(android.graphics.Color.parseColor(A02(9, 9, 57)));
        view.setAlpha(0.8f);
        frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private void A06(android.widget.FrameLayout frameLayout) {
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.A0K);
        this.A08 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0K, false, this.A0G, this.A0L, this.A0M, com.facebook.ads.redexgen.core.EnumC1244aM.A02, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A0G));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(0, 0, this.A04, this.A03);
        frameLayout2.addView(this.A08, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private void A07(android.widget.FrameLayout frameLayout) {
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.A0K);
        this.A09 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0K, false, this.A0G, this.A0L, this.A0M, com.facebook.ads.redexgen.core.EnumC1244aM.A02, com.facebook.ads.redexgen.core.EnumC1247aP.A04);
        com.facebook.ads.redexgen.core.YB.A0K(this.A09);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(this.A04, 0, 0, this.A03);
        frameLayout2.addView(this.A09, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private void A08(android.widget.FrameLayout frameLayout) {
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.A0K);
        com.facebook.ads.redexgen.core.C1245aN A02 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0K, com.facebook.ads.redexgen.core.EnumC1244aM.A02, this.A0G);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(this.A04, 0, 0, this.A03);
        frameLayout2.addView(A02, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        if (r9 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c5, code lost:
    
        if (r2 <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        r10 = null;
        r9 = r13.A0C;
        r8 = com.facebook.ads.redexgen.core.C1365cJ.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dc, code lost:
    
        if (r8[0].charAt(31) == r8[6].charAt(31)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        r8 = com.facebook.ads.redexgen.core.C1365cJ.A0O;
        r8[3] = "NBSSb5i8vB7h2DITQFZ0JVIGTEGpjtjm";
        r8[1] = "r6oo3XDBH3cPwN6mP2aoTtDXeEGymFZK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        if (r9 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        if (r15 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        r10 = A00(r15);
        r7.addView(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC1499eU.A01(r13.A0K, r6, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011c, code lost:
    
        r8 = com.facebook.ads.redexgen.core.C1365cJ.A0O;
        r8[0] = "LTYB5M4Mhdd1oprOtejFkg7YcKqdK9Vm";
        r8[6] = "s8tsGyr3r09N1mPmkZSZvoZyMzIeZ0vJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0128, code lost:
    
        if (r9 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fa, code lost:
    
        r7.addView(r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
    
        if (r13.A0D != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0101, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C1365cJ.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        if (r2[4].charAt(0) == r2[7].charAt(0)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013a, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C1365cJ.A0O;
        r2[3] = "Yzc02jbTluogikiQi2Wv962AcLGu9uF1";
        r2[1] = "JahYjLhPUhQBnUZY2LL7YeIOJlGmyCNi";
        r6.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        r14.addView(r7, new android.widget.FrameLayout.LayoutParams(-1, -2, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0153, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
    
        if (r9 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(android.widget.FrameLayout frameLayout, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.A0K);
        frameLayout2.setPadding(0, this.A06, this.A02, this.A02);
        if (this.A0E) {
            frameLayout2.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1364cI(this, viewOnClickListenerC0834Kr));
        }
        android.graphics.Bitmap bitmap = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.NAV_CROSS);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, this.A04, this.A04, true);
        android.widget.ImageView dubiousSkip = new android.widget.ImageView(this.A0K);
        com.facebook.ads.redexgen.core.YB.A0G(1002, dubiousSkip);
        dubiousSkip.setImageBitmap(createScaledBitmap);
        dubiousSkip.setColorFilter(-1);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(android.graphics.Color.parseColor(A02(0, 9, 80)));
        dubiousSkip.setBackground(gradientDrawable);
        dubiousSkip.setPadding(this.A01, this.A01, this.A01, this.A01);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        dubiousSkip.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cF
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1365cJ.this.A0G(view);
            }
        });
        long A00 = this.A0J.A00();
        if (this.A0B) {
            com.facebook.ads.redexgen.core.C0897Nd c0897Nd = this.A0J;
            if (A0O[2].length() != 25) {
                throw new java.lang.RuntimeException();
            }
            A0O[2] = "EDg5a4vgNKTBN5Vd4K7j2JAWQ";
            A00 = c0897Nd.A01();
        }
        boolean z = this.A0D;
        if (A0O[2].length() != 25) {
            java.lang.String[] strArr = A0O;
            strArr[3] = "lPr3oecF17Vr0ETjxWpa6eT7xUG7TKGz";
            strArr[1] = "pN0Dd6Okr1h1scp4h6gPnTJrQwG996nC";
        } else {
            java.lang.String[] strArr2 = A0O;
            strArr2[3] = "tzOwMkw7uDsuhpEAhy55DDXkTNG5R2eG";
            strArr2[1] = "LVlHDeBQ28ZWrMMDEXcUdCCcU9GvuA6m";
        }
    }

    private void A0A(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        viewOnClickListenerC0834Kr.setPadding(this.A04, this.A03, this.A04, this.A03);
        viewOnClickListenerC0834Kr.setTextSize(14.0f);
        viewOnClickListenerC0834Kr.A0D();
        viewOnClickListenerC0834Kr.setIncludeFontPadding(true);
        viewOnClickListenerC0834Kr.setLayoutParams(layoutParams);
        viewOnClickListenerC0834Kr.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        com.facebook.ads.redexgen.core.YB.A0V(viewOnClickListenerC0834Kr, com.facebook.ads.redexgen.core.YB.A06(-1, this.A00));
        viewOnClickListenerC0834Kr.setId(android.view.View.generateViewId());
        if (viewOnClickListenerC0834Kr.getParent() != null) {
            ((android.view.ViewGroup) viewOnClickListenerC0834Kr.getParent()).removeView(viewOnClickListenerC0834Kr);
        }
    }

    public static /* synthetic */ void A0B(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, android.view.View view) {
        viewOnClickListenerC0834Kr.A0E(A02(63, 4, 71));
        viewOnClickListenerC0834Kr.setVisibility(4);
    }

    public final android.view.View A0C(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        if (viewOnClickListenerC0834Kr != null) {
            viewOnClickListenerC0834Kr.setV2Design(true);
        }
        return A0D(viewOnClickListenerC0834Kr, null);
    }

    public final android.view.View A0D(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, android.widget.ImageView imageView) {
        this.A0A = viewOnClickListenerC0834Kr;
        this.A0B = imageView != null;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.A0K);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.C1336bq c1336bq = new com.facebook.ads.redexgen.core.C1336bq(this.A0K, this.A0H.A01(), true, false, false);
        c1336bq.A04(this.A0I.A0G(), this.A0I.A0E().toLowerCase(java.util.Locale.getDefault()), null, false, false);
        c1336bq.setAlignment(17);
        c1336bq.setTitleTextSize(28);
        c1336bq.setDescriptionTextSize(13);
        c1336bq.A02();
        c1336bq.setPadding(this.A05, 0, this.A05, 0);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0K);
        linearLayout.setClickable(true);
        if (com.facebook.ads.redexgen.core.C1086Up.A1D(this.A0K)) {
            linearLayout.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1363cH(this, viewOnClickListenerC0834Kr));
        }
        linearLayout.setPadding(0, -this.A04, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (imageView != null) {
            if (imageView.getParent() != null) {
                ((android.view.ViewGroup) imageView.getParent()).removeView(imageView);
            }
            linearLayout.addView(imageView);
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A03, 0, this.A07);
        linearLayout.addView(c1336bq, layoutParams);
        android.widget.TextView A01 = A01();
        if (A01 != null) {
            new android.widget.LinearLayout.LayoutParams(-2, -2).setMargins(0, this.A07, 0, this.A03);
            linearLayout.addView(A01);
        }
        if (viewOnClickListenerC0834Kr != null) {
            A0A(viewOnClickListenerC0834Kr);
            linearLayout.addView(viewOnClickListenerC0834Kr, layoutParams);
            if (android.text.TextUtils.isEmpty(viewOnClickListenerC0834Kr.getText())) {
                com.facebook.ads.redexgen.core.YB.A0H(viewOnClickListenerC0834Kr);
            }
        }
        linearLayout.setAlpha(1.0f);
        A05(frameLayout);
        frameLayout.addView(linearLayout);
        A09(frameLayout, viewOnClickListenerC0834Kr);
        if (this.A0G.A2M()) {
            A06(frameLayout);
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = this.A0G;
        java.lang.String[] strArr = A0O;
        if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
            throw new java.lang.RuntimeException();
        }
        A0O[2] = "4iwGVt394BTmmSYCgqRVgc6es";
        if (abstractC1801jd.A2W()) {
            A08(frameLayout);
        } else if (this.A0G.A2V()) {
            A07(frameLayout);
        }
        return frameLayout;
    }

    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0E() {
        return this.A0A;
    }

    public final void A0F() {
        if (this.A08 != null) {
            this.A08.A0O();
        }
        com.facebook.ads.redexgen.core.C1241aJ c1241aJ = this.A09;
        java.lang.String[] strArr = A0O;
        if (strArr[4].charAt(0) != strArr[7].charAt(0)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0O;
        strArr2[3] = "2Z0HXqlllvltE4fpmlk2k5YgzqGJ81zY";
        strArr2[1] = "EMsyCAj6WMyQurvXYMEHBK7qX1GDVftC";
        if (c1241aJ != null) {
            this.A09.A0O();
        }
    }

    public final /* synthetic */ void A0G(android.view.View view) {
        this.A0K.A0F().AB0();
        this.A0M.A4j(A02(18, 45, 88));
    }

    public final void A0H(boolean z) {
        if (!z && this.A08 != null) {
            this.A08.A0P();
        }
        if (this.A09 != null) {
            this.A09.A0P();
        }
    }

    public final void A0I(boolean z) {
        this.A0D = z;
    }
}
