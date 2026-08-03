package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class LV extends com.facebook.ads.redexgen.core.AbstractC1282ay {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"X5ywJXgSTO8PHmyyLHkjy", "LJCQW", "068uN", "say", "rTIjgGKqeW39zjdqZS0Aqu4tLxC", "Qrp", "m8T4zYbfVU3hLt0iEDnj", "pXMACVxBUOAUm1D"};
    public static final java.lang.String A0H;
    public float A00;
    public com.facebook.ads.redexgen.core.Y2 A01;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A02;
    public com.facebook.ads.redexgen.core.C1581fp A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final android.graphics.Path A07;
    public final android.graphics.RectF A08;
    public final com.facebook.ads.redexgen.core.C1636gi A09;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1> A0A;
    public final java.util.concurrent.atomic.AtomicBoolean A0B;
    public final java.util.concurrent.atomic.AtomicBoolean A0C;
    public final java.util.concurrent.atomic.AtomicInteger A0D;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A0E;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0F = new byte[]{91, 126, 89, 117, 116, 110, 104, 117, 118};
    }

    static {
        A04();
        A0H = com.facebook.ads.redexgen.core.LV.class.getSimpleName();
    }

    public LV(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1> weakReference, int i, java.lang.String str) {
        this(c1636gi, weakReference, i, false);
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(c1636gi)) {
            c1636gi.A02().A0B().AKo(this, str == null ? A02(0, 0, 91) : str, false, true);
            this.A06 = true;
        }
    }

    public LV(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1> weakReference, int i, boolean z) {
        super(c1636gi);
        this.A0B = new java.util.concurrent.atomic.AtomicBoolean();
        this.A0C = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.A07 = new android.graphics.Path();
        this.A08 = new android.graphics.RectF();
        this.A0D = new java.util.concurrent.atomic.AtomicInteger(5000);
        this.A0E = new java.util.concurrent.atomic.AtomicReference<>();
        this.A01 = new com.facebook.ads.redexgen.core.Y2();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1636gi;
        this.A04 = z;
        this.A0A = weakReference;
        this.A02 = new com.facebook.ads.redexgen.core.C0859Lq(this);
        this.A03 = new com.facebook.ads.redexgen.core.C1581fp(this, i, new java.lang.ref.WeakReference(this.A02), this.A09);
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new com.facebook.ads.redexgen.core.C1284b0(this, weakReference.get(), this.A03, this.A0B, this.A0C, this.A09), A02(0, 9, 46));
    }

    private final boolean A05() {
        return this.A0B.get();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1282ay
    public final android.webkit.WebChromeClient A0G() {
        return new com.facebook.ads.redexgen.core.C1286b2();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1282ay
    public final android.webkit.WebViewClient A0H() {
        return new com.facebook.ads.redexgen.core.C1287b3(this.A09, this.A0A, new java.lang.ref.WeakReference(this.A03), new java.lang.ref.WeakReference(this.A01), new java.lang.ref.WeakReference(this.A0C), new java.lang.ref.WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0K() {
        this.A09.A0F().AKq();
        this.A0B.set(true);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C0850Lh(this.A03));
    }

    public final void A0L(int i, int i2) {
        if (this.A03 != null) {
            this.A03.A0W(i);
            this.A03.A0X(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1282ay, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A02().A0B().AKU(this);
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        com.facebook.ads.redexgen.core.YB.A0J(this);
        this.A02 = null;
        this.A01 = null;
        com.facebook.ads.redexgen.core.AbstractC1288b4.A03(this);
        super.destroy();
    }

    public com.facebook.ads.redexgen.core.Y2 getTouchDataRecorder() {
        return this.A01;
    }

    public com.facebook.ads.redexgen.core.C1581fp getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            java.lang.String[] strArr = A0G;
            if (strArr[1].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0G;
            strArr2[1] = "xZYpx";
            strArr2[2] = "aqsn9";
            this.A07.reset();
            this.A07.addRoundRect(this.A08, this.A00, this.A00, android.graphics.Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A09;
        java.lang.String[] strArr = A0G;
        if (strArr[6].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0G;
        strArr2[6] = "5ON080OOKwQwIFP5OG7h";
        strArr2[0] = "JBDgk0gsadULglMDLs8S8";
        c1636gi.A0F().AL4(i);
        if (i == 0 && A05()) {
            this.A03.A0U();
        } else {
            if (i != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z) {
        this.A04 = z;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.A0C.set(z);
    }

    public void setCornerRadius(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z) {
        this.A05 = z;
    }

    public void setRequestId(java.lang.String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i) {
        if (i >= 0) {
            this.A0D.set(i);
        }
    }
}
