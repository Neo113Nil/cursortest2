package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class M3 extends com.facebook.ads.redexgen.core.AbstractC1282ay {
    public static android.webkit.ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"r5lFqG0C0bBGIxytTEblkmz8pOWiln6U", "Y5tMFhpuLobi6U3v3neZGAzEpbrZh2e0", "35iZKMkwZFt7WP5rciHAZ1WswbletKXm", "1wdh7bxI31pnh6pFTaTypUqx", "X0GEkrMG66X1N8QG", "HQ8AmQiqT9dTkfwWyhZ7u2ZNdQoS7Fbv", "yjHJSxajRdLfdjSgilcNPSPFyTq4dELg", "ut8cBtSHXrZx3QiSKTpc7NoA9ie10da9"};
    public static final java.util.Set<java.lang.String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public com.facebook.ads.redexgen.core.C1636gi A04;
    public com.facebook.ads.redexgen.core.C1269al A05;
    public com.facebook.ads.redexgen.core.InterfaceC1274aq A06;
    public com.facebook.ads.redexgen.core.C1277at A07;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{43, 55, 55, 51, 100, 120, 120, 124, Byte.MAX_VALUE};
    }

    static {
        A06();
        A0D = new java.util.HashSet(2);
        A09 = false;
        A0A = false;
        A0D.add(A03(0, 4, 113));
        A0D.add(A03(4, 5, 62));
    }

    public M3(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.app.Activity activity, com.facebook.ads.redexgen.core.InterfaceC1274aq interfaceC1274aq) {
        super(activity, c1636gi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c1636gi, interfaceC1274aq);
    }

    public M3(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC1274aq interfaceC1274aq) {
        super(c1636gi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c1636gi, interfaceC1274aq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1282ay
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1277at A0H() {
        return new com.facebook.ads.redexgen.core.C1277at(new java.lang.ref.WeakReference(this.A04), new java.lang.ref.WeakReference(this.A06), new java.lang.ref.WeakReference(this.A05));
    }

    private void A05() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A07(int i, int i2, android.content.Intent intent) {
        if (A08 != null && i == 1001) {
            A08.onReceiveValue(android.webkit.WebChromeClient.FileChooserParams.parseResult(i2, intent));
            A08 = null;
        }
    }

    private void A08(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC1274aq interfaceC1274aq) {
        this.A04 = c1636gi;
        this.A06 = interfaceC1274aq;
        this.A05 = new com.facebook.ads.redexgen.core.C1269al(this);
        A09 = com.facebook.ads.redexgen.core.AbstractC1087Uq.A03(this.A04);
        A0A = com.facebook.ads.redexgen.core.AbstractC1087Uq.A04(this.A04);
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0G());
        this.A07 = A0H();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1282ay
    public final android.webkit.WebChromeClient A0G() {
        return new com.facebook.ads.redexgen.core.C1276as(new java.lang.ref.WeakReference(this.A04), new java.lang.ref.WeakReference(this.A06), new java.lang.ref.WeakReference(this.A05));
    }

    public final void A0K(long j) {
        if (this.A00 < 0) {
            this.A00 = j;
        }
        A05();
        java.lang.String[] strArr = A0C;
        if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[4] = "TnIn5PelVgDBsDwa";
        strArr2[3] = "kaGwwHcDVWZGOuagxs1W4ZQa";
    }

    public final void A0L(long j) {
        if (this.A01 < 0) {
            this.A01 = j;
        }
        A05();
    }

    public final void A0M(long j) {
        if (this.A02 < 0) {
            this.A02 = j;
        }
        A05();
        java.lang.String[] strArr = A0C;
        if (strArr[5].charAt(4) == strArr[7].charAt(4)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[6] = "DwC46XxC2zY9iA5O924mXxlTXzY8IGhb";
        strArr2[0] = "1LscF1ZcfF08U7LpSibJFf3LFm8iDmJu";
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1282ay, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        com.facebook.ads.redexgen.core.AbstractC1288b4.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public java.lang.String getFirstUrl() {
        android.webkit.WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = java.lang.System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(com.facebook.ads.redexgen.core.InterfaceC1275ar interfaceC1275ar) {
        this.A07.A05(new java.lang.ref.WeakReference<>(interfaceC1275ar));
    }
}
