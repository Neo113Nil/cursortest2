package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1241aJ extends android.widget.LinearLayout {
    public static java.lang.String[] A0I = {"Jjhv1QqAIW86EmEZitDWSXUy5KAygWmD", "Knznf5NxnzMSGuCyCavmDPpLrbg6IGSX", "ILZruYKannRuDYsFiZYXNynBpyms", "eZKheB7115JCtr5xxUXw9oXkLPe4M5DC", "o2TLnhgUMatQJZ63WkSJRDhfBnbI", "vZrVQG4SvGUnBHUUGdfxrKmAlJmFc80m", "RT8BtEaKHOdmDtB2bzxk3zMCIxucDNYE", "yGiX4fEKWzcCLDIcRuEbwAcVWGPLZUB"};
    public android.widget.ImageView A00;
    public android.widget.ImageView A01;
    public com.facebook.ads.redexgen.core.InterfaceC1242aK A02;
    public java.lang.Runnable A03;
    public boolean A04;
    public final int A05;
    public final android.graphics.Bitmap A06;
    public final android.graphics.Bitmap A07;
    public final android.graphics.Bitmap A08;
    public final android.graphics.Bitmap A09;
    public final android.graphics.Bitmap A0A;
    public final android.graphics.Bitmap A0B;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0C;
    public final com.facebook.ads.redexgen.core.C1636gi A0D;
    public final com.facebook.ads.redexgen.core.VI A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0F;
    public final com.facebook.ads.redexgen.core.EnumC1244aM A0G;
    public final com.facebook.ads.redexgen.core.EnumC1247aP A0H;

    public C1241aJ(com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM, com.facebook.ads.redexgen.core.InterfaceC1242aK interfaceC1242aK, com.facebook.ads.redexgen.core.EnumC1247aP enumC1247aP) {
        this(c1636gi, z, abstractC1801jd, vi, interfaceC1177Yh, enumC1244aM, enumC1247aP);
        this.A02 = interfaceC1242aK;
    }

    public C1241aJ(com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM, com.facebook.ads.redexgen.core.EnumC1247aP enumC1247aP) {
        super(c1636gi);
        this.A07 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CREDIT_LINE_INFO_ICON);
        this.A06 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CREDIT_LINE_DETAIL_ICON);
        this.A04 = false;
        this.A08 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_ICON);
        this.A09 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_TEXT);
        this.A0A = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CREDIT_LINE_COLLAPSE_TEXT);
        this.A0B = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CREDIT_LINE_TEXT);
        this.A05 = abstractC1801jd.A27();
        this.A0E = vi;
        this.A0F = interfaceC1177Yh;
        this.A0G = enumC1244aM;
        this.A0D = c1636gi;
        this.A0C = abstractC1801jd;
        this.A0H = enumC1247aP;
        A05();
        A0K(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        com.facebook.ads.redexgen.core.YB.A0M(this.A00, 1.0f, 0.0f, 100);
        A0E(3, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, new com.facebook.ads.redexgen.core.InterfaceC1228a6() { // from class: com.facebook.ads.redexgen.X.MA
            @Override // com.facebook.ads.redexgen.core.InterfaceC1228a6
            public final void AK7(java.lang.Object obj, long j) {
                com.facebook.ads.redexgen.core.C1241aJ.this.A0U(obj, j);
            }
        }, new com.facebook.ads.redexgen.core.C1237aF(this));
        postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.aA
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1241aJ.this.A0R();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        A0E(2, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, new com.facebook.ads.redexgen.core.InterfaceC1228a6() { // from class: com.facebook.ads.redexgen.X.MB
            @Override // com.facebook.ads.redexgen.core.InterfaceC1228a6
            public final void AK7(java.lang.Object obj, long j) {
                com.facebook.ads.redexgen.core.C1241aJ.this.A0V(obj, j);
            }
        }, new com.facebook.ads.redexgen.core.C1235aD(this));
        com.facebook.ads.redexgen.core.YB.A0M(this.A00, 0.0f, 1.0f, 0);
        com.facebook.ads.redexgen.core.YB.A0O(this.A00, 0);
    }

    private void A04() {
        if (this.A04 && this.A03 != null) {
            A06();
            A02();
        }
    }

    private void A05() {
        switch (this.A0H) {
            case A03:
                com.facebook.ads.redexgen.core.AbstractC1243aL.A02(this.A0D, this.A0G);
                break;
            case A02:
                com.facebook.ads.redexgen.core.AbstractC1243aL.A01(this.A0D, this.A0G);
                break;
        }
    }

    private void A06() {
        if (this.A04 && this.A03 != null) {
            removeCallbacks(this.A03);
            this.A03 = null;
        }
        java.lang.String[] strArr = A0I;
        if (strArr[4].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A0I[6] = "PZwK6paCNaN1NNUi7D9zVsXgJs4CpRYo";
        this.A04 = false;
    }

    private void A07() {
        switch (this.A0H) {
            case A02:
                com.facebook.ads.redexgen.core.YB.A0N(this, -859190839);
                return;
            default:
                if (A0I[7].length() == 20) {
                    throw new java.lang.RuntimeException();
                }
                A0I[6] = "J4Bl2paDruPebaLnqzXafrD0wXfUXyp3";
                com.facebook.ads.redexgen.core.YB.A0N(this, -870569165);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        switch (this.A0H) {
            case A02:
                android.widget.ImageView imageView = this.A01;
                int i = com.facebook.ads.redexgen.core.XV.A0S;
                if (A0I[7].length() != 20) {
                    java.lang.String[] strArr = A0I;
                    strArr[4] = "IwvL04OrKqzmIeLShS8Q4SIdnVqi";
                    strArr[2] = "Ml3LYYHXQPQgDXepFoLqaPfqy73Y";
                    imageView.setPadding(i, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A00);
                    return;
                }
                throw new java.lang.RuntimeException();
            case A04:
                this.A01.setPadding(com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A00);
                this.A01.setVisibility(8);
                return;
            default:
                this.A01.setPadding(com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A00);
                return;
        }
    }

    private void A09() {
        switch (this.A0H) {
            case A02:
                A0F(this.A00, this.A09, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A01, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A01, com.facebook.ads.redexgen.core.XV.A0U);
                break;
            case A04:
                A0F(this.A00, this.A0B, com.facebook.ads.redexgen.core.XV.A02, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A02, com.facebook.ads.redexgen.core.XV.A00, -2);
                break;
            default:
                A0F(this.A00, this.A06, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A0A, -2);
                break;
        }
    }

    private void A0A() {
        switch (this.A0H) {
            case A02:
                A0F(this.A01, this.A08, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0U);
                return;
            case A04:
                android.widget.ImageView imageView = this.A01;
                android.graphics.Bitmap bitmap = this.A0A;
                int i = com.facebook.ads.redexgen.core.XV.A0S;
                int i2 = com.facebook.ads.redexgen.core.XV.A00;
                int i3 = com.facebook.ads.redexgen.core.XV.A0S;
                int i4 = com.facebook.ads.redexgen.core.XV.A00;
                java.lang.String[] strArr = A0I;
                if (strArr[4].length() != strArr[2].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0I;
                strArr2[0] = "BqxrFQJIBIExT1rCMndHo1bmHb8U1dtr";
                strArr2[3] = "4mbJeCFNsEoBSiTcA819Z9qBG38wKlHe";
                A0F(imageView, bitmap, i, i2, i3, i4, -2);
                return;
            default:
                A0F(this.A01, this.A07, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, -2);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.a9
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1241aJ.this.A02();
            }
        };
        postDelayed(this.A03, this.A05);
    }

    private void A0C() {
        this.A04 = true;
        com.facebook.ads.redexgen.core.YB.A0O(this.A00, 0);
        A0B();
    }

    private final void A0D() {
        com.facebook.ads.redexgen.core.YB.A0O(this.A00, 8);
        com.facebook.ads.redexgen.core.YB.A0O(this.A01, 0);
        if (this.A0H == com.facebook.ads.redexgen.core.EnumC1247aP.A04) {
            this.A01.setPadding(com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A00);
        } else {
            this.A01.setPadding(com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00);
        }
    }

    private void A0E(int i, int i2, com.facebook.ads.redexgen.core.InterfaceC1228a6 interfaceC1228a6, android.animation.LayoutTransition.TransitionListener transitionListener) {
        android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition();
        layoutTransition.setAnimator(i, new com.facebook.ads.redexgen.core.C1239aH(this, i2, interfaceC1228a6));
        layoutTransition.addTransitionListener(transitionListener);
        setLayoutTransition(layoutTransition);
    }

    private void A0F(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        com.facebook.ads.redexgen.core.YB.A0K(imageView);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, i5);
        imageView.setPadding(i, i2, i3, i4);
        imageView.setLayoutParams(layoutParams);
    }

    private void A0K(boolean z) {
        setOrientation(0);
        setPadding(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        A07();
        setCornerRadius(com.facebook.ads.redexgen.core.XV.A0C);
        this.A01 = new android.widget.ImageView(getContext());
        A0A();
        addView(this.A01);
        if (this.A0H == com.facebook.ads.redexgen.core.EnumC1247aP.A04) {
            this.A01.setVisibility(8);
        }
        this.A00 = new android.widget.ImageView(getContext());
        A09();
        addView(this.A00);
        A0L(z);
        setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.a8
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1241aJ.this.A0T(view);
            }
        });
    }

    private void A0L(boolean z) {
        if (z && (this.A0H == com.facebook.ads.redexgen.core.EnumC1247aP.A03 || this.A0H == com.facebook.ads.redexgen.core.EnumC1247aP.A04)) {
            A0C();
        } else {
            com.facebook.ads.redexgen.core.YB.A0O(this.A00, 8);
            com.facebook.ads.redexgen.core.YB.A0O(this.A01, 0);
        }
    }

    public final void A0O() {
        A06();
    }

    public final void A0P() {
        A06();
        A0D();
    }

    public final void A0Q() {
        this.A04 = true;
        post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.aB
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1241aJ.this.A0S();
            }
        });
    }

    public final /* synthetic */ void A0R() {
        com.facebook.ads.redexgen.core.YB.A0O(this.A00, 8);
    }

    public final /* synthetic */ void A0S() {
        postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.a7
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1241aJ.this.A03();
            }
        }, 300L);
    }

    public final /* synthetic */ void A0T(android.view.View view) {
        if (this.A04) {
            if (this.A0H == com.facebook.ads.redexgen.core.EnumC1247aP.A04) {
                return;
            }
            A04();
            if (this.A02 != null) {
                this.A02.ADW(view);
                return;
            } else {
                com.facebook.ads.redexgen.core.AbstractC1243aL.A07(this.A0E, this.A0D, this.A0F, this.A0C, this.A0G);
                return;
            }
        }
        A0Q();
    }

    public final /* synthetic */ void A0U(java.lang.Object obj, long j) {
        ((android.view.View) obj).animate().translationX(getWidth()).setDuration(j).setInterpolator(new com.facebook.ads.redexgen.core.X7(1.5f)).setListener(new com.facebook.ads.redexgen.core.C1238aG(this)).start();
    }

    public final /* synthetic */ void A0V(java.lang.Object obj, long j) {
        android.view.View view = (android.view.View) obj;
        view.setTranslationX(getWidth());
        view.animate().translationX(0.0f).setDuration(j).setListener(new com.facebook.ads.redexgen.core.C1236aE(this)).setInterpolator(new com.facebook.ads.redexgen.core.X8(1.5f)).start();
    }

    private void setCornerRadius(float f) {
        setOutlineProvider(new com.facebook.ads.redexgen.core.C1234aC(this, f));
        setClipToOutline(true);
    }
}
