package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1254aW extends android.widget.ImageView {
    public static java.lang.String[] A0B = {"bxOOFOssooUR0RjZyatL4oOd1ggfHKhR", "plfhpGKDQv9IGhMy4A8hpuBVWtzTu73m", "mlkot9yGvNPR", "TmCHOkbW5b1zt9NPZxI16MTUer5XzrjL", "vWAJRy5Sp9zXb743yVWn2E8zfo", "KypmqauLEfpZtoNpXrgclfphsSGW0tHg", "5jpOR", "IeZIdLyfRFMrKrbxyFHDhs6fILRacDEb"};
    public android.os.Handler A00;
    public android.view.View.OnLayoutChangeListener A01;
    public android.view.ViewTreeObserver.OnScrollChangedListener A02;
    public android.widget.ImageView A03;
    public boolean A04;
    public final android.view.View A05;
    public final com.facebook.ads.NativeAdLayout A06;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.YM A09;
    public final com.facebook.ads.redexgen.core.InterfaceC1242aK A0A;

    public C1254aW(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, android.view.View view, com.facebook.ads.redexgen.core.YM ym, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.redexgen.core.InterfaceC1242aK interfaceC1242aK) {
        super(c1636gi);
        this.A05 = view;
        this.A09 = ym;
        this.A08 = c1636gi;
        this.A06 = nativeAdLayout;
        this.A0A = interfaceC1242aK;
        this.A07 = abstractC1801jd;
        com.facebook.ads.redexgen.core.AbstractC1243aL.A02(c1636gi, enumC1244aM);
        A02();
    }

    private int A00(android.graphics.Rect rect) {
        return this.A08.getResources().getDisplayMetrics().widthPixels - rect.left;
    }

    private void A02() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        this.A03 = new android.widget.ImageView(this.A08);
        this.A03.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(this.A09));
        this.A03.setLayoutParams(layoutParams);
        this.A06.addView(this.A03);
        com.facebook.ads.redexgen.core.YB.A0O(this.A03, 4);
        this.A03.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aR
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.C1254aW.this.A0C(view);
            }
        });
        this.A00 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A01 = new android.view.View.OnLayoutChangeListener() { // from class: com.facebook.ads.redexgen.X.aS
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                com.facebook.ads.redexgen.core.C1254aW.this.A0D(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.A02 = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.ads.redexgen.X.aT
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                com.facebook.ads.redexgen.core.C1254aW.this.A05();
            }
        };
        this.A03.addOnAttachStateChangeListener(new com.facebook.ads.redexgen.core.ViewOnAttachStateChangeListenerC1253aV(this));
    }

    private void A03() {
        if (this.A01 != null) {
            this.A06.removeOnLayoutChangeListener(this.A01);
            this.A01 = null;
        }
        if (this.A02 != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.A06.getViewTreeObserver();
            android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.A02;
            if (A0B[1].charAt(24) != 'W') {
                throw new java.lang.RuntimeException();
            }
            A0B[3] = "RZhHI7oSNBBsQ6jn8HmNiHu90Tl2574S";
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            this.A02 = null;
        }
    }

    private void A04() {
        this.A00.postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.aU
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1254aW.this.A09();
            }
        }, this.A07.A27());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.A03.getLayoutParams();
        android.graphics.Rect rect = new android.graphics.Rect();
        this.A05.getGlobalVisibleRect(rect);
        android.graphics.Rect nativeAdLayoutLocation = new android.graphics.Rect();
        this.A06.getGlobalVisibleRect(nativeAdLayoutLocation);
        layoutParams.leftMargin = rect.left - nativeAdLayoutLocation.left;
        layoutParams.topMargin = rect.top - nativeAdLayoutLocation.top;
        if (rect.left > A00(nativeAdLayoutLocation) / 2) {
            layoutParams.leftMargin = (layoutParams.leftMargin - this.A03.getWidth()) + this.A05.getWidth();
        }
        layoutParams.topMargin += (this.A05.getHeight() - this.A03.getHeight()) / 2;
        this.A03.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.YB.A0O(this.A03, 0);
        if (A0B[3].charAt(3) != 'H') {
            throw new java.lang.RuntimeException();
        }
        A0B[0] = "t5NtMJanNbto08EujsjrDgIQKMRNzNUY";
        this.A03.bringToFront();
        if (!this.A04) {
            this.A04 = true;
            if (A0B[6].length() == 21) {
                throw new java.lang.RuntimeException();
            }
            A0B[5] = "2KnGvfPknQwZySrVrzkTNTPZBlnzDeA4";
            A04();
        }
    }

    private void A06(int i, int i2) {
        com.facebook.ads.redexgen.core.YB.A0O(this.A03, i);
        com.facebook.ads.redexgen.core.YB.A0O(this.A05, i2);
    }

    public final void A09() {
        A03();
        A06(8, 0);
        this.A00.removeCallbacksAndMessages(null);
        this.A04 = false;
    }

    public final void A0A() {
        A06(4, 4);
        this.A03.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.aQ
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C1254aW.this.A05();
            }
        });
        if (this.A01 != null) {
            this.A06.addOnLayoutChangeListener(this.A01);
        }
        if (this.A02 != null) {
            this.A06.getViewTreeObserver().addOnScrollChangedListener(this.A02);
        }
    }

    public final void A0B() {
        A06(4, 4);
        A05();
    }

    public final /* synthetic */ void A0C(android.view.View view) {
        A03();
        this.A0A.ADW(view);
    }

    public final /* synthetic */ void A0D(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        A05();
    }
}
