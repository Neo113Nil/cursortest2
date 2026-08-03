package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1311bR extends android.widget.RelativeLayout {
    public java.lang.Runnable A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final android.os.Handler A04;
    public final android.widget.RelativeLayout A05;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A08;
    public final boolean A09;
    public static java.lang.String[] A0A = {"kYsHPXjvuexLDNrmkTwQRT55JzcBiXge", "zR3fYtNBsqomhYEo3ppbb9RnVT1IpAxV", "wFb9hYTzbBEOXc5fjtd4fRZ2PpBU", "Jmvb938kXbh75xCyq", "upuGJiFXYhI8XO38RIbXHNvluMbxxtSG", "1OgTCiUraoc2pkcUsvx3qQ0hwrqmeKBW", "dxUwSJcX1cxyOWbOOT9qAgg5mCGn3F5b", "jNBoK2eCg"};
    public static final int A0F = com.facebook.ads.redexgen.core.XV.A0J;
    public static final int A0B = com.facebook.ads.redexgen.core.XV.A0T;
    public static final int A0C = com.facebook.ads.redexgen.core.XV.A09;
    public static final int A0G = com.facebook.ads.redexgen.core.XV.A05;
    public static final int A0E = com.facebook.ads.redexgen.core.XV.A0H;
    public static final int A0D = com.facebook.ads.redexgen.core.XV.A08;

    public C1311bR(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, int i, boolean z) {
        super(c1636gi);
        this.A01 = false;
        this.A02 = false;
        this.A04 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A07 = c1636gi;
        this.A06 = abstractC1801jd;
        this.A08 = viewOnClickListenerC0834Kr;
        this.A03 = i;
        this.A09 = z;
        this.A05 = A00();
        A0I(getResources().getConfiguration().orientation);
        this.A05.setTranslationY(A0D);
        addView(this.A05);
        A07();
    }

    private android.widget.RelativeLayout A00() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A07);
        relativeLayout.setPadding(com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A05);
        com.facebook.ads.redexgen.core.YB.A0P(relativeLayout, -1, A0C);
        relativeLayout.setElevation(com.facebook.ads.redexgen.core.XV.A0I);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A01, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A01);
        if (this.A08 != null) {
            android.widget.RelativeLayout.LayoutParams ctaButtonParams = new android.widget.RelativeLayout.LayoutParams(-2, A0E);
            ctaButtonParams.addRule(11);
            ctaButtonParams.addRule(15);
            layoutParams.addRule(0, this.A08.getId());
            relativeLayout.addView(this.A08, ctaButtonParams);
        }
        com.facebook.ads.redexgen.core.C1330bk appIcon = getAppIcon();
        com.facebook.ads.redexgen.core.YB.A0K(appIcon);
        relativeLayout.addView(appIcon);
        layoutParams.addRule(1, appIcon.getId());
        android.widget.RelativeLayout bannerOverlayView = getTitleAndRatings();
        relativeLayout.addView(bannerOverlayView, layoutParams);
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A07.A0F().ADH();
        this.A05.animate().translationY(A0D).setDuration(300L).setListener(new com.facebook.ads.redexgen.core.C1310bQ(this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A05.animate().translationY(0.0f).setDuration(300L).setListener(new com.facebook.ads.redexgen.core.C1309bP(this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A00 != null) {
            this.A04.removeCallbacks(this.A00);
            this.A00 = null;
        }
        if (A0A[5].charAt(7) != 'r') {
            throw new java.lang.RuntimeException();
        }
        A0A[2] = "cQXagcaAbk5GCnj2W1DiXrWYc93f";
        this.A01 = false;
    }

    private void A07() {
        new com.facebook.ads.redexgen.core.YJ(100, 500, this.A07, new com.facebook.ads.redexgen.core.C0837Ku(this)).A00(this.A05);
    }

    public final void A0E() {
        this.A00 = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.bO
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1311bR.this.A05();
            }
        };
        this.A01 = true;
        this.A04.postDelayed(this.A00, this.A03);
    }

    public final void A0F() {
        A06();
        this.A04.removeCallbacksAndMessages(null);
        if (this.A05 != null) {
            android.widget.RelativeLayout relativeLayout = this.A05;
            java.lang.String[] strArr = A0A;
            if (strArr[3].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A0A[5] = "MnxsWfXrlV78UabQbsjfyCXWA2ulRwGh";
            relativeLayout.clearAnimation();
        }
    }

    public final void A0G() {
        A06();
        if (!this.A02 && this.A05 != null) {
            this.A05.clearAnimation();
        }
    }

    public final void A0H() {
        if (!this.A02 && !this.A01 && this.A05 != null) {
            A0E();
        }
    }

    public final void A0I(int i) {
        android.widget.RelativeLayout.LayoutParams bannerOverlayParams;
        if (i == 1) {
            bannerOverlayParams = new android.widget.RelativeLayout.LayoutParams(-1, A0B);
            bannerOverlayParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A00);
        } else {
            int screenWidth = getResources().getDisplayMetrics().widthPixels;
            bannerOverlayParams = new android.widget.RelativeLayout.LayoutParams((int) (screenWidth * 0.5d), A0B);
        }
        this.A05.setLayoutParams(bannerOverlayParams);
    }

    private com.facebook.ads.redexgen.core.C1330bk getAppIcon() {
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A07);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A07).A05(A0F, A0F).A07(this.A06.A2C().A01());
        android.widget.RelativeLayout.LayoutParams iconViewParams = new android.widget.RelativeLayout.LayoutParams(A0F, A0F);
        iconViewParams.addRule(9);
        c1330bk.setLayoutParams(iconViewParams);
        return c1330bk;
    }

    private android.widget.LinearLayout getRatingCountAndStar() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A07);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.TextView textView = new android.widget.TextView(this.A07);
        com.facebook.ads.redexgen.core.YB.A0K(textView);
        textView.setTextColor(this.A06.A28().A01().A07(false));
        textView.setText(this.A06.A29().A0I().A0C());
        textView.setTextSize(13.0f);
        linearLayout.addView(textView);
        com.facebook.ads.redexgen.core.C1333bn c1333bn = new com.facebook.ads.redexgen.core.C1333bn(this.A07, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0G, A0G);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0I);
        linearLayout.addView(c1333bn, layoutParams);
        return linearLayout;
    }

    private android.widget.TextView getTitle() {
        android.widget.TextView textView = new android.widget.TextView(this.A07);
        textView.setTextColor(this.A06.A28().A01().A07(false));
        textView.setText(this.A06.A29().A0I().A0G());
        textView.setTextSize(15.0f);
        textView.setMaxLines(1);
        return textView;
    }

    private android.widget.RelativeLayout getTitleAndRatings() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A07);
        relativeLayout.setGravity(16);
        android.widget.TextView title = getTitle();
        com.facebook.ads.redexgen.core.YB.A0K(title);
        relativeLayout.addView(title);
        android.widget.LinearLayout ratingCountAndStar = getRatingCountAndStar();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, title.getId());
        layoutParams.addRule(12);
        relativeLayout.addView(ratingCountAndStar, layoutParams);
        return relativeLayout;
    }
}
