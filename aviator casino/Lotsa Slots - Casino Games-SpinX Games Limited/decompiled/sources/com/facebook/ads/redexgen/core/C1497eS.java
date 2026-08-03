package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1497eS {
    public static byte[] A0n;
    public static java.lang.String[] A0o = {"rlKCEchcqf0ciqqi5AvJfjd9N52fSCy8", "PNo7HsDb73vpBHqbFnDgLDKmrYNJyDDd", "113OeC", "Cx3CvN9GF4y9AfAfmcXjlQVU3pQMYVJa", "l70rAAhZwLIPPR5uDe0F7aYKOgrudYX3", "BVxdVuILB7huRlQ", "M763HrTZfS2tZdU8T7Ka7fPhorhGOaFK", "qRF7Z25uKAZ9gvWIqbx"};
    public android.widget.ImageView A0M;
    public android.widget.ImageView A0N;
    public android.widget.LinearLayout A0O;
    public android.widget.RelativeLayout A0P;
    public android.widget.TextView A0Q;
    public android.widget.TextView A0R;
    public com.facebook.ads.redexgen.core.C7M A0S;
    public com.facebook.ads.redexgen.core.C1241aJ A0T;
    public com.facebook.ads.redexgen.core.C1241aJ A0U;
    public com.facebook.ads.redexgen.core.C1245aN A0V;
    public com.facebook.ads.redexgen.core.C1330bk A0W;
    public com.facebook.ads.redexgen.core.C1365cJ A0X;
    public final android.os.Handler A0b;
    public final android.widget.FrameLayout A0c;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0d;
    public final com.facebook.ads.redexgen.core.NN A0e;
    public final com.facebook.ads.redexgen.core.NY A0f;
    public final com.facebook.ads.redexgen.core.C0897Nd A0g;
    public final com.facebook.ads.redexgen.core.C0906Nm A0h;
    public final com.facebook.ads.redexgen.core.C1636gi A0i;
    public final com.facebook.ads.redexgen.core.VI A0j;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0k;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0l;
    public int A06 = 160;
    public int A07 = 130;
    public int A03 = 56;
    public int A04 = 430;
    public int A0K = 110;
    public int A0L = 70;
    public int A0A = 120;
    public int A0G = 48;
    public int A0F = 44;
    public int A0D = 24;
    public int A0C = 20;
    public int A0B = 16;
    public int A09 = 12;
    public int A08 = 10;
    public int A0H = 8;
    public int A0E = 4;
    public int A0J = com.ironsource.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED;
    public int A0I = androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
    public int A05 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
    public boolean A0Y = false;
    public final java.util.concurrent.atomic.AtomicBoolean A0m = new java.util.concurrent.atomic.AtomicBoolean(false);
    public int A00 = 0;
    public int A02 = 0;
    public int A01 = this.A06;
    public boolean A0Z = true;
    public final int A0a = (int) com.facebook.ads.redexgen.core.XX.A02;

    public static java.lang.String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0n, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 50;
            java.lang.String[] strArr = A0o;
            if (strArr[7].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A0o[2] = "GQ96jzl1cN6JO8qYFngU1";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0M() {
        A0n = new byte[]{com.google.common.base.Ascii.CR, com.google.common.base.Ascii.US, 111, com.google.common.base.Ascii.US, 111, com.google.common.base.Ascii.US, 111, 44, 55, 63, 63, 63, 63, 63, 63, 63, 91, 84, 101, 91, 89, 78, 83, 76, 83, 78, 67, 117, 121, 123, 56, 112, 119, 117, 115, 116, 121, 121, 125, 56, 119, 114, 101, 56, Byte.MAX_VALUE, 120, 98, 115, 100, 101, 98, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 119, 122, 56, 112, Byte.MAX_VALUE, 120, Byte.MAX_VALUE, 101, 126, 73, 119, 117, 98, Byte.MAX_VALUE, 96, Byte.MAX_VALUE, 98, 111, 88, 83, 89, 126, 92, 79, 89, 107, com.google.common.base.Ascii.SI, 110, 94, 79, 88, 88, 83, 78, 85, 82, 73, 111, 88, 94, 68, 94, 81, 88, 79, 124, 89, 92, 77, 73, 88, 79, com.google.common.base.Ascii.GS, 84, 78, com.google.common.base.Ascii.GS, 83, 72, 81, 81, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SYN};
    }

    static {
        A0M();
    }

    public C1497eS(final com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, android.os.Handler handler, com.facebook.ads.redexgen.core.VI vi) {
        this.A0i = c1636gi;
        this.A0d = abstractC1801jd;
        this.A0j = vi;
        this.A0h = abstractC1801jd.A2C();
        this.A0g = abstractC1801jd.A29().A0K();
        this.A0k = interfaceC1177Yh;
        this.A0b = handler;
        this.A0f = abstractC1801jd.A29().A0I();
        this.A0e = abstractC1801jd.A28();
        this.A0l = viewOnClickListenerC0834Kr;
        this.A0S = new com.facebook.ads.redexgen.core.C7M(c1636gi) { // from class: com.facebook.ads.redexgen.X.1E
            @Override // com.facebook.ads.redexgen.core.C7M, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.C7M, android.view.View
            public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
                return false;
            }
        };
        this.A0P = new android.widget.RelativeLayout(c1636gi);
        this.A0W = new com.facebook.ads.redexgen.core.C1330bk(c1636gi);
        this.A0R = new android.widget.TextView(c1636gi);
        this.A0M = new android.widget.ImageView(c1636gi);
        this.A0c = new android.widget.FrameLayout(this.A0i);
        A0K();
    }

    public static int A00(int i) {
        if (com.facebook.ads.redexgen.core.P3.A01(i, -1) >= 4.5d) {
            return -1;
        }
        return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    }

    private android.widget.FrameLayout.LayoutParams A01() {
        if (this.A0i.getResources().getConfiguration().orientation == 2) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            int i = this.A0L;
            int orientation = this.A0C;
            layoutParams.setMargins(0, i, 0, orientation);
            return layoutParams;
        }
        int orientation2 = this.A0Y ? this.A0I : this.A0J;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, orientation2);
        int orientation3 = this.A0K;
        layoutParams2.setMargins(0, orientation3, 0, 0);
        return layoutParams2;
    }

    private android.widget.FrameLayout.LayoutParams A02() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, this.A0G, this.A09, 0);
        return layoutParams;
    }

    private android.widget.ImageView A03() {
        android.graphics.Bitmap scaledBitmap = android.graphics.Bitmap.createScaledBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.OTHER_SKIP), this.A0C, this.A0C, true);
        android.widget.ImageView imageView = new android.widget.ImageView(this.A0i);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(android.graphics.Color.parseColor(A0H(7, 9, 61)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A08, this.A08, this.A08, this.A08);
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.eO
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1497eS.this.A0b(view);
            }
        });
        if (this.A0l != null && this.A0l.getCtaActionHelper().A06() == null) {
            this.A0l.getCtaActionHelper().A07(new com.facebook.ads.redexgen.core.InterfaceC0886Mr() { // from class: com.facebook.ads.redexgen.X.FQ
                @Override // com.facebook.ads.redexgen.core.InterfaceC0886Mr
                public final void ACk() {
                    com.facebook.ads.redexgen.core.C1497eS.this.A0Z();
                }
            });
        }
        imageView.setLayoutParams(A02());
        imageView.setVisibility(0);
        return imageView;
    }

    private android.widget.LinearLayout.LayoutParams A04() {
        int width = this.A0i.getResources().getConfiguration().orientation;
        int i = -1;
        int i2 = -2;
        int i3 = 0;
        if (width == 2) {
            i = this.A04;
            i2 = -2;
            java.lang.String[] strArr = A0o;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[0];
            int width2 = str.charAt(0);
            int orientation = str2.charAt(0);
            if (width2 == orientation) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0o;
            strArr2[4] = "2Ia5vAscFxMcZ1ZcpDs6xoNSTk8YU4BA";
            strArr2[3] = "l5LN0cSfS0eMNqZA7sTWe2HczOJrVC6l";
            i3 = this.A0B;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i, i2);
        layoutParams.gravity = 81;
        int height = this.A0B;
        int width3 = this.A0B;
        layoutParams.setMargins(height, i3, width3, 0);
        return layoutParams;
    }

    private android.widget.LinearLayout A05() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0i);
        linearLayout.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setGravity(80);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private android.widget.LinearLayout A06() {
        java.lang.String A09;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0i);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (this.A0f.A0C().isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.facebook.ads.redexgen.core.C1500eV(this.A0i).A02(new com.facebook.ads.redexgen.core.C1319bZ(this.A0i, -1, -1, com.facebook.ads.redexgen.core.YM.RATINGS)).A04(this.A0f.A0C()).A03(this.A0f.A0B()));
        if (!this.A0f.A09().isEmpty()) {
            try {
                A09 = com.facebook.ads.redexgen.core.AbstractC1150Xg.A01(java.lang.Integer.parseInt(this.A0f.A09()));
            } catch (java.lang.NumberFormatException unused) {
                A09 = this.A0f.A09();
            }
            arrayList.add(new com.facebook.ads.redexgen.core.C1500eV(this.A0i).A02(new com.facebook.ads.redexgen.core.C1319bZ(this.A0i, -1, -1, com.facebook.ads.redexgen.core.YM.NUCLEUS_GROUP)).A04(A09).A03(this.A0f.A0A()));
        }
        if (!this.A0f.A05().isEmpty()) {
            arrayList.add(new com.facebook.ads.redexgen.core.C1500eV(this.A0i).A02(new com.facebook.ads.redexgen.core.C1319bZ(this.A0i, -1, -1, com.facebook.ads.redexgen.core.YM.DOWNLOAD)).A04(this.A0f.A05()).A03(this.A0f.A06()));
        }
        com.facebook.ads.redexgen.core.NY ny = this.A0f;
        if (A0o[2].length() == 29) {
            throw new java.lang.RuntimeException();
        }
        A0o[2] = "3vpsIj";
        if (!ny.A01().isEmpty()) {
            arrayList.add(new com.facebook.ads.redexgen.core.C1500eV(this.A0i).A02(new com.facebook.ads.redexgen.core.C1319bZ(this.A0i, -1, -1, com.facebook.ads.redexgen.core.YM.NUCLEUS_DURATION)).A04(this.A0f.A01()).A03(this.A0f.A0D()));
        }
        if (!this.A0f.A02().isEmpty()) {
            arrayList.add(new com.facebook.ads.redexgen.core.C1500eV(this.A0i).A02(new com.facebook.ads.redexgen.core.C1319bZ(this.A0i, -1, -1, com.facebook.ads.redexgen.core.YM.GRID_4)).A04(this.A0f.A02()).A03(this.A0f.A03()));
        }
        for (int i = 0; i < java.lang.Math.min(3, arrayList.size()); i++) {
            linearLayout.addView((android.view.View) arrayList.get(i));
        }
        linearLayout.setId(android.view.View.generateViewId());
        return linearLayout;
    }

    private android.widget.LinearLayout A07(android.widget.RelativeLayout relativeLayout, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0i);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, viewOnClickListenerC0834Kr.getId());
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A0H, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        android.widget.TextView textView = new android.widget.TextView(this.A0i);
        textView.setText(this.A0f.A07());
        textView.setTextSize(10.0f);
        linearLayout.setId(android.view.View.generateViewId());
        com.facebook.ads.redexgen.core.C1319bZ iconView = new com.facebook.ads.redexgen.core.C1319bZ(this.A0i, -1, -1, com.facebook.ads.redexgen.core.YM.GOOGLE_PLAY_STORE);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(this.A09, this.A09);
        layoutParams2.rightMargin = this.A0E;
        iconView.setLayoutParams(layoutParams2);
        iconView.setAlpha(0.5f);
        linearLayout.addView(iconView);
        linearLayout.addView(textView);
        relativeLayout.addView(linearLayout);
        return linearLayout;
    }

    private android.widget.RelativeLayout.LayoutParams A08(android.widget.LinearLayout linearLayout) {
        int i;
        int i2 = this.A0i.getResources().getConfiguration().orientation;
        if (linearLayout == null || this.A0Y || i2 == 2) {
            int orientation = this.A01;
            i = (-orientation) / 4;
        } else {
            int orientation2 = this.A01;
            i = (-orientation2) / 2;
        }
        int i3 = this.A01;
        int orientation3 = this.A01;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i3, orientation3);
        layoutParams.setMargins(0, i, 0, 0);
        layoutParams.addRule(14);
        return layoutParams;
    }

    private android.widget.RelativeLayout.LayoutParams A09(android.widget.LinearLayout linearLayout, android.widget.TextView textView) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        if (this.A0l != null) {
            this.A0l.setTextColor(A00(this.A0e.A01().A04()));
            com.facebook.ads.redexgen.core.YB.A0V(this.A0l, com.facebook.ads.redexgen.core.YB.A06(this.A0e.A01().A04(), 40));
        }
        if (linearLayout != null) {
            layoutParams.addRule(3, linearLayout.getId());
            layoutParams.setMargins(this.A0B, this.A0D + this.A00 + this.A02, this.A0B, 0);
        } else {
            layoutParams.addRule(3, textView.getId());
            layoutParams.setMargins(this.A0B, this.A0A + this.A00 + this.A02, this.A0B, 0);
        }
        return layoutParams;
    }

    private android.widget.RelativeLayout.LayoutParams A0A(android.widget.TextView textView) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A0D + this.A02, 1, 0);
        layoutParams.addRule(3, textView.getId());
        return layoutParams;
    }

    private android.widget.RelativeLayout.LayoutParams A0B(com.facebook.ads.redexgen.core.C1330bk c1330bk) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, c1330bk.getId());
        layoutParams.setMargins(this.A0B, this.A0D + this.A02, this.A0B, 0);
        return layoutParams;
    }

    private android.widget.RelativeLayout A0C() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0i);
        android.widget.LinearLayout.LayoutParams layoutParams = A04();
        relativeLayout.setClipChildren(false);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setId(android.view.View.generateViewId());
        return relativeLayout;
    }

    private android.widget.TextView A0D(android.widget.RelativeLayout relativeLayout, android.widget.TextView textView) {
        if (android.text.TextUtils.isEmpty(this.A0d.A29().A0I().A08())) {
            return null;
        }
        android.widget.TextView textView2 = new android.widget.TextView(this.A0i);
        textView2.setText(this.A0d.A29().A0I().A08());
        textView2.setTextColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
        textView2.setMaxLines(1);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setTypeface(android.graphics.Typeface.DEFAULT);
        textView2.setTextSize(12.0f);
        textView2.setTextAlignment(4);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, textView.getId());
        textView2.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0v, 0, 0);
        relativeLayout.addView(textView2);
        com.facebook.ads.redexgen.core.YB.A0K(textView2);
        return textView2;
    }

    private android.widget.TextView A0E(android.widget.RelativeLayout relativeLayout, com.facebook.ads.redexgen.core.C1330bk c1330bk) {
        android.widget.TextView textView = new android.widget.TextView(this.A0i);
        textView.setText(this.A0f.A0G());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setTextAlignment(4);
        textView.setLayoutParams(A0B(c1330bk));
        relativeLayout.addView(textView);
        textView.setId(android.view.View.generateViewId());
        return textView;
    }

    private com.facebook.ads.redexgen.core.C1330bk A0G(android.widget.LinearLayout linearLayout) {
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A0i);
        c1330bk.setRadius(30);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        com.facebook.ads.redexgen.core.LM downloadImageTask = new com.facebook.ads.redexgen.core.LM(c1330bk, this.A0i).A04();
        downloadImageTask.A07(this.A0h.A01());
        c1330bk.setLayoutParams(A08(linearLayout));
        c1330bk.setId(android.view.View.generateViewId());
        return c1330bk;
    }

    private void A0I() {
        android.graphics.Bitmap scaledBitmap;
        final boolean A05 = this.A0g.A05();
        if (A05) {
            scaledBitmap = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.SKIP_ARROW_APP_INSTALL);
        } else {
            scaledBitmap = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.NAV_CROSS);
        }
        android.graphics.Bitmap scaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(scaledBitmap, this.A0C, this.A0C, true);
        this.A0M = new android.widget.ImageView(this.A0i);
        this.A0M.setImageBitmap(scaledBitmap2);
        this.A0M.setColorFilter(-1);
        android.graphics.drawable.GradientDrawable circleBackground = new android.graphics.drawable.GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(android.graphics.Color.parseColor(A0H(7, 9, 61)));
        this.A0M.setBackground(circleBackground);
        this.A0M.setPadding(this.A08, this.A08, this.A08, this.A08);
        this.A0M.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.eN
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1497eS.this.A0g(A05, view);
            }
        });
        this.A0M.setLayoutParams(A02());
        this.A0c.addView(this.A0M);
        boolean shouldShowThirdEndCard = this.A0Z;
        if (!shouldShowThirdEndCard) {
            this.A0M.setVisibility(8);
        }
        this.A0N = null;
        boolean shouldShowThirdEndCard2 = this.A0Z;
        if (shouldShowThirdEndCard2 && this.A0g.A00() > 0) {
            boolean shouldShowThirdEndCard3 = this.A0d.A2P();
            if (shouldShowThirdEndCard3) {
                this.A0N = A03();
                this.A0c.addView(this.A0N);
            }
            com.facebook.ads.redexgen.core.AbstractC1499eU.A01(this.A0i, this.A0M, this.A0g.A00(), this.A0N);
        }
    }

    private void A0J() {
        if (this.A0l != null) {
            android.widget.RelativeLayout relativeLayout = this.A0P;
            java.lang.String[] strArr = A0o;
            if (strArr[6].charAt(0) == strArr[0].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            A0o[1] = "ppz6iX8Db8cBXV1NkZFvhJGHZsoHwG5T";
            A0T(relativeLayout, this.A0l, this.A0O, this.A0Q != null ? this.A0Q : this.A0R);
            android.widget.LinearLayout A07 = A07(this.A0P, this.A0l);
            if (this.A0d.A2M()) {
                A0Q(this.A0P, A07, this.A0l);
            }
            if (this.A0d.A2W()) {
                A0S(this.A0P, A07, this.A0l);
            } else {
                if (!this.A0d.A2V()) {
                    return;
                }
                A0R(this.A0P, A07, this.A0l);
            }
        }
    }

    private void A0K() {
        this.A0J *= this.A0a;
        this.A0I *= this.A0a;
        this.A05 *= this.A0a;
        this.A0K *= this.A0a;
        this.A0L *= this.A0a;
        this.A06 *= this.A0a;
        this.A01 *= this.A0a;
        this.A07 *= this.A0a;
        this.A03 *= this.A0a;
        this.A04 *= this.A0a;
        this.A0A *= this.A0a;
        this.A0G *= this.A0a;
        this.A0F *= this.A0a;
        this.A0D *= this.A0a;
        this.A0C *= this.A0a;
        this.A0B *= this.A0a;
        this.A09 *= this.A0a;
        this.A08 *= this.A0a;
        this.A0H *= this.A0a;
        this.A0E *= this.A0a;
    }

    private void A0L() {
        android.view.ViewParent parent = this.A0c.getParent();
        boolean z = parent instanceof android.view.ViewGroup;
        java.lang.String A0H = A0H(27, 45, 36);
        if (!z) {
            this.A0k.A4j(A0H);
            return;
        }
        ((android.view.ViewGroup) parent).removeView(this.A0c);
        java.lang.String[] strArr = A0o;
        if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        A0o[2] = "R58z0cOD";
        android.view.ViewParent parent2 = parent.getParent();
        if (parent2 instanceof android.view.ViewGroup) {
            this.A0m.set(true);
            this.A0X = new com.facebook.ads.redexgen.core.C1365cJ(this.A0i, this.A0d, this.A0j, this.A0b, this.A0k);
            ((android.view.ViewGroup) parent.getParent()).addView(this.A0X.A0D(this.A0l, this.A0W));
            return;
        }
        this.A0k.A4j(A0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void A0Z() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0N);
        this.A0d.A2K(false);
        this.A0d.A29().A0M(-1);
    }

    private void A0O(android.view.View view, int i, float[] fArr) {
        android.graphics.drawable.shapes.RoundRectShape roundRectShape = new android.graphics.drawable.shapes.RoundRectShape(fArr, null, null);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i);
        view.setBackground(shapeDrawable);
    }

    private void A0P(android.widget.RelativeLayout relativeLayout) {
        A0O(relativeLayout, android.graphics.Color.argb(230, 13, 13, 13), new float[]{100.0f, 100.0f, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private void A0Q(android.widget.RelativeLayout relativeLayout, android.widget.LinearLayout linearLayout, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A0T = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0i, false, this.A0d, this.A0j, this.A0k, com.facebook.ads.redexgen.core.EnumC1244aM.A02, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A0d));
        com.facebook.ads.redexgen.core.YB.A0K(this.A0T);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0B, 0, this.A0B);
        layoutParams.addRule(7, viewOnClickListenerC0834Kr.getId());
        layoutParams.addRule(3, linearLayout.getId());
        this.A0T.setLayoutParams(layoutParams);
        relativeLayout.addView(this.A0T);
    }

    private void A0R(android.widget.RelativeLayout relativeLayout, android.widget.LinearLayout linearLayout, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A0U = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0i, false, this.A0d, this.A0j, this.A0k, com.facebook.ads.redexgen.core.EnumC1244aM.A02, com.facebook.ads.redexgen.core.EnumC1247aP.A04);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0U);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0H, 0, this.A0B);
        layoutParams.addRule(5, viewOnClickListenerC0834Kr.getId());
        layoutParams.addRule(3, linearLayout.getId());
        this.A0U.setLayoutParams(layoutParams);
        relativeLayout.addView(this.A0U);
    }

    private void A0S(android.widget.RelativeLayout relativeLayout, android.widget.LinearLayout linearLayout, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A0V = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0i, com.facebook.ads.redexgen.core.EnumC1244aM.A02, this.A0d);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0B, 0, this.A0B);
        layoutParams.addRule(5, viewOnClickListenerC0834Kr.getId());
        layoutParams.addRule(3, linearLayout.getId());
        this.A0V.setLayoutParams(layoutParams);
        relativeLayout.addView(this.A0V);
    }

    private void A0T(android.widget.RelativeLayout relativeLayout, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, android.widget.LinearLayout linearLayout, android.widget.TextView textView) {
        android.widget.RelativeLayout.LayoutParams A09 = A09(linearLayout, textView);
        viewOnClickListenerC0834Kr.setIncludeFontPadding(false);
        viewOnClickListenerC0834Kr.setLayoutParams(A09);
        viewOnClickListenerC0834Kr.A0D();
        viewOnClickListenerC0834Kr.setHeight(this.A03);
        viewOnClickListenerC0834Kr.setTextSize(18.0f);
        viewOnClickListenerC0834Kr.setCornerRadiusPx(40);
        viewOnClickListenerC0834Kr.setTextColor(A00(this.A0e.A01().A04()));
        com.facebook.ads.redexgen.core.YB.A0V(viewOnClickListenerC0834Kr, com.facebook.ads.redexgen.core.YB.A06(this.A0e.A01().A04(), 40));
        viewOnClickListenerC0834Kr.setId(android.view.View.generateViewId());
        if (viewOnClickListenerC0834Kr.getParent() != null) {
            ((android.view.ViewGroup) viewOnClickListenerC0834Kr.getParent()).removeView(viewOnClickListenerC0834Kr);
        }
        relativeLayout.addView(viewOnClickListenerC0834Kr);
        java.lang.String[] strArr = A0o;
        if (strArr[7].length() == strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0o;
        strArr2[6] = "8zkkPZUpUKfzaqOn5D7DKafOgXWnQm3O";
        strArr2[0] = "dX4UD2PNpDYdvYGpKlyYeFfcBh95RD7k";
    }

    private void A0U(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A0S.setLayoutManager(new com.facebook.ads.redexgen.core.C1706hr(this.A0i, 0, false));
        android.widget.FrameLayout.LayoutParams screenshotsRecyclerViewParams = A01();
        this.A0S.setLayoutParams(screenshotsRecyclerViewParams);
        int i = 4;
        if (this.A0i.getResources().getConfiguration().orientation == 2) {
            i = 2;
        }
        this.A0S.setAdapter(new com.facebook.ads.redexgen.core.FO(this.A0i, this.A0g.A02(), this.A0H, this.A0S, viewOnClickListenerC0834Kr, i));
    }

    private void A0V(final com.facebook.ads.redexgen.core.InterfaceC1496eR interfaceC1496eR) {
        final android.widget.ImageView imageView = new android.widget.ImageView(this.A0i);
        imageView.setAdjustViewBounds(true);
        com.facebook.ads.redexgen.core.LM lm = new com.facebook.ads.redexgen.core.LM(imageView, this.A0i);
        if (!this.A0g.A02().isEmpty()) {
            lm.A06(new com.facebook.ads.redexgen.core.InterfaceC1292b8() { // from class: com.facebook.ads.redexgen.X.FR
                @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
                public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
                    com.facebook.ads.redexgen.core.C1497eS.this.A0c(imageView, interfaceC1496eR, c1291b7);
                }
            });
            lm.A07(this.A0g.A02().get(0));
        } else {
            interfaceC1496eR.AE9();
        }
    }

    public final android.widget.FrameLayout A0W() {
        this.A0c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        int orientation = this.A0i.getResources().getConfiguration().orientation;
        if (orientation == 2) {
            int orientation2 = this.A07;
            this.A01 = orientation2;
        }
        android.view.View view = new android.view.View(this.A0i);
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        int orientation3 = android.graphics.Color.parseColor(A0H(0, 7, 28));
        view.setBackgroundColor(orientation3);
        this.A0c.addView(view);
        final android.widget.LinearLayout linearLayout = A05();
        this.A0P = A0C();
        if (com.facebook.ads.redexgen.core.C1086Up.A1D(this.A0i)) {
            this.A0P.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1494eP(this));
        }
        A0P(this.A0P);
        this.A0O = A06();
        this.A0W = A0G(this.A0O);
        this.A0P.addView(this.A0W);
        this.A0R = A0E(this.A0P, this.A0W);
        this.A0Q = A0D(this.A0P, this.A0R);
        if (this.A0O != null) {
            this.A0O.setLayoutParams(A0A(this.A0Q != null ? this.A0Q : this.A0R));
            this.A0P.addView(this.A0O);
        }
        A0J();
        linearLayout.addView(this.A0P);
        if (this.A0d.A2T()) {
            android.view.View blackBackgroundView = new android.view.View(this.A0i);
            blackBackgroundView.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1495eQ(this));
            int orientation4 = this.A0i.getResources().getConfiguration().orientation;
            if (orientation4 == 2) {
                blackBackgroundView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, this.A0L, 48));
            } else {
                blackBackgroundView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, this.A0K, 48));
            }
            this.A0c.addView(blackBackgroundView);
        }
        A0I();
        this.A0c.addView(linearLayout);
        A0V(new com.facebook.ads.redexgen.core.InterfaceC1496eR() { // from class: com.facebook.ads.redexgen.X.FX
            @Override // com.facebook.ads.redexgen.core.InterfaceC1496eR
            public final void AE9() {
                com.facebook.ads.redexgen.core.C1497eS.this.A0d(linearLayout);
            }
        });
        if (this.A0j != null) {
            com.facebook.ads.redexgen.core.VK.A04(this.A0c, this.A0j, com.facebook.ads.redexgen.core.VH.A0S);
        }
        android.widget.FrameLayout frameLayout = this.A0c;
        if (A0o[1].charAt(29) == 'N') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0o;
        strArr[4] = "M4KdLm6ABwqrDNV9iNEtQhvJeVkDc5WF";
        strArr[3] = "JxvlRLbpjqvrEz4I8nTM6vTNM6szdWyt";
        return frameLayout;
    }

    public final android.widget.FrameLayout A0X() {
        return this.A0c;
    }

    public final void A0Y() {
        if (this.A0T != null) {
            this.A0T.A0O();
        }
        if (this.A0U != null) {
            this.A0U.A0P();
        }
        if (this.A0X != null) {
            this.A0X.A0F();
        }
    }

    public final void A0a(int i) {
        if (!this.A0m.get()) {
            com.facebook.ads.redexgen.core.FO fo = (com.facebook.ads.redexgen.core.FO) this.A0S.getAdapter();
            if (fo == null) {
                this.A0i.A08().ABC(A0H(16, 11, 8), com.facebook.ads.redexgen.core.AbstractC1048Td.A0A, new com.facebook.ads.redexgen.core.C1049Te(A0H(72, 42, 15)));
            }
            if (this.A0l != null) {
                A09(this.A0O, this.A0Q != null ? this.A0Q : this.A0R);
            }
            if (i == 2) {
                this.A01 = this.A07;
                this.A00 = 0;
                if (fo != null) {
                    fo.A0O(2);
                }
                if (this.A0d.A2M()) {
                    this.A02 = -this.A08;
                }
            } else {
                this.A02 = 0;
                this.A01 = this.A06;
                if (this.A0Y) {
                    this.A00 = this.A05;
                    if (this.A0d.A2M()) {
                        this.A00 = this.A05 - this.A0F;
                    }
                }
                if (fo != null) {
                    fo.A0O(4);
                }
            }
            this.A0S.setLayoutParams(A01());
            this.A0P.setLayoutParams(A04());
            this.A0W.setLayoutParams(A08(this.A0O));
            this.A0R.setLayoutParams(A0B(this.A0W));
            if (this.A0O != null) {
                this.A0O.setLayoutParams(A0A(this.A0Q != null ? this.A0Q : this.A0R));
            }
            if (this.A0l != null) {
                this.A0l.setLayoutParams(A09(this.A0O, this.A0Q != null ? this.A0Q : this.A0R));
            }
            this.A0M.setLayoutParams(A02());
        }
    }

    public final /* synthetic */ void A0b(android.view.View view) {
        if (this.A0l != null) {
            com.facebook.ads.redexgen.core.EnumC0885Mq A0E = this.A0l.A0E(A0H(114, 4, 84));
            if (this.A0d.A2N()) {
                return;
            }
            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
            if (A0E != actionOutcome) {
                com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome2 = com.facebook.ads.redexgen.core.EnumC0885Mq.A06;
                if (A0E != actionOutcome2) {
                    A0Z();
                }
            }
        }
    }

    public final /* synthetic */ void A0c(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.InterfaceC1496eR interfaceC1496eR, com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int imageWidth = drawable.getIntrinsicWidth();
            if (imageWidth > drawable.getIntrinsicHeight()) {
                this.A0Y = true;
                int imageWidth2 = this.A0i.getResources().getConfiguration().orientation;
                if (imageWidth2 == 2) {
                    this.A00 = 0;
                } else {
                    this.A00 = this.A05;
                    com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = this.A0d;
                    if (A0o[1].charAt(29) == 'N') {
                        throw new java.lang.RuntimeException();
                    }
                    A0o[1] = "S95acxw01Fp1FcMeAJU8kfpwrSO3Cs6T";
                    if (abstractC1801jd.A2M()) {
                        this.A00 = this.A05 - this.A0F;
                    }
                }
            }
        }
        interfaceC1496eR.AE9();
    }

    public final /* synthetic */ void A0d(android.widget.LinearLayout linearLayout) {
        A0U(this.A0l);
        com.facebook.ads.redexgen.core.YB.A0J(this.A0S);
        this.A0c.addView(this.A0S);
        linearLayout.bringToFront();
        this.A0M.bringToFront();
    }

    public final void A0e(boolean z) {
        if (!z && this.A0T != null) {
            this.A0T.A0P();
        }
        if (this.A0U != null) {
            com.facebook.ads.redexgen.core.C1241aJ c1241aJ = this.A0U;
            java.lang.String[] strArr = A0o;
            if (strArr[6].charAt(0) == strArr[0].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0o;
            strArr2[4] = "pU4AIYssLBN1acDZt2jXfcrExTRsZlct";
            strArr2[3] = "VzJEZ9FHvuTJuATo3MsieoimYI89kdwu";
            c1241aJ.A0P();
        }
        if (this.A0X != null) {
            this.A0X.A0H(z);
        }
    }

    public final void A0f(boolean z) {
        this.A0Z = z;
    }

    public final /* synthetic */ void A0g(boolean z, android.view.View view) {
        if (z) {
            A0L();
        } else {
            this.A0i.A0F().AB0();
            this.A0k.A4j(A0H(27, 45, 36));
        }
    }

    public final boolean A0h() {
        return this.A0M != null && this.A0M.getVisibility() == 0;
    }
}
