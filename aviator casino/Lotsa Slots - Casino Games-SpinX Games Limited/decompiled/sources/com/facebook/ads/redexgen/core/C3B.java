package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3B, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3B extends com.facebook.ads.redexgen.core.ED {
    public static java.lang.String[] A01 = {"BuRuvxulsaJnTsptWr5C74N6kbe62CR1", "s8BhV7yvVPv9fWwhaDhts8ISKp0Ib3uz", "BHQbL486YclXfOG4TttSSmYhAQDicEvh", "6QlBJVUCqIJjaBYG", "bf17tAIDP3PP5oHcfI5KYvpff0TMzylU", "en59KaoZPANthNZYpe9YMIumKtT", "Zp8Yp0vRpWPiTIr1M3XMCxUDLLEg", "TVOb3qDH058zXjUqb6AporPz"};
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.E1> A00;

    public C3B(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(c1636gi, null);
    }

    public C3B(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet) {
        this(c1636gi, attributeSet, 0);
    }

    public C3B(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i) {
        super(c1636gi, attributeSet, i);
        this.A00 = new com.facebook.ads.redexgen.core.C0637Da(this);
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
        android.widget.RelativeLayout.LayoutParams spinnerParams = new android.widget.RelativeLayout.LayoutParams(applyDimension, applyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A06(this.A00);
        }
        setVisibility(8);
        if (A01[6].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[4] = "qxykbLgy7uMqmiLSWk5iAMCsSUesvX5c";
        strArr[0] = "yfv8cLzmeBPWJWXBFW506HD39p2knuA3";
        super.A08();
    }
}
