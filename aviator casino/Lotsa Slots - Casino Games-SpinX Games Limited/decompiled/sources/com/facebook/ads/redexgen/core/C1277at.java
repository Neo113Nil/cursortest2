package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1277at extends android.webkit.WebViewClient {
    public static byte[] A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1636gi> A02;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1274aq> A03;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1269al> A04;
    public final com.facebook.ads.redexgen.core.InterfaceC1273ap A01 = new com.facebook.ads.redexgen.core.InterfaceC1273ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.facebook.ads.redexgen.core.InterfaceC1273ap
        public final boolean AAf(java.lang.String str) {
            return com.facebook.ads.redexgen.core.C1277at.A04(str);
        }
    };
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1275ar> A00 = new java.lang.ref.WeakReference<>(null);

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 8, 9, 71, com.google.common.base.Ascii.US, 17, com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.SYN, 37, 42, com.google.common.base.Ascii.ESC, 37, 39, 48, 45, 50, 45, 48, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.FF, 3, 9, com.google.common.base.Ascii.US, 2, 4, 9, 67, 4, 3, com.google.common.base.Ascii.EM, 8, 3, com.google.common.base.Ascii.EM, 67, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, Byte.MAX_VALUE, 114, 56, Byte.MAX_VALUE, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, com.google.common.base.Ascii.ESC, 77, 87, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CR, 10, 55, com.google.common.base.Ascii.RS, 1, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.US};
    }

    public C1277at(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1636gi> weakReference, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1274aq> weakReference2, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1269al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(java.lang.String str, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        c1636gi.A08().ABC(A00(11, 11, 104), com.facebook.ads.redexgen.core.AbstractC1048Td.A09, new com.facebook.ads.redexgen.core.C1049Te(A00(111, 5, 91) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        if (r0.contains(r2) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A03(android.webkit.WebView webView, java.lang.String str) {
        boolean z;
        boolean A14;
        java.lang.String A00;
        java.lang.String A002;
        java.lang.String A003;
        boolean z2;
        boolean z3;
        java.util.Set set;
        java.util.Set set2;
        android.content.Intent intent;
        java.lang.String A004 = A00(116, 8, 68);
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A02.get();
        if (c1636gi != null) {
            z = com.facebook.ads.redexgen.core.M3.A0A;
            if ((z && (android.text.TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                android.net.Uri uri = com.facebook.ads.redexgen.core.XB.A00(str);
                java.lang.String scheme = uri.getScheme();
                try {
                    A14 = com.facebook.ads.redexgen.core.C1086Up.A14(c1636gi);
                    A00 = A00(48, 33, 58);
                    A002 = A00(22, 26, 65);
                    A003 = A00(105, 6, 36);
                } catch (java.lang.Exception e) {
                    c1636gi.A08().ABD(A004, com.facebook.ads.redexgen.core.AbstractC1048Td.A2d, new com.facebook.ads.redexgen.core.C1049Te(e));
                    c1636gi.A0F().AA2(e.toString());
                }
                if (A14) {
                    set2 = com.facebook.ads.redexgen.core.M3.A0D;
                    if (!set2.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                        if (A003.equalsIgnoreCase(scheme)) {
                            intent = android.content.Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new android.content.Intent(A002, uri);
                        }
                        intent.addCategory(A00);
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!com.facebook.ads.redexgen.core.C1140Wu.A0D(c1636gi, intent)) {
                                A02(str, c1636gi);
                            }
                            return true;
                        } catch (com.facebook.ads.redexgen.core.C1138Ws unused) {
                            if (A003.equals(scheme)) {
                                java.lang.String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!android.text.TextUtils.isEmpty(stringExtra)) {
                                    if (!com.facebook.ads.redexgen.core.C1140Wu.A0D(c1636gi, new android.content.Intent(A002, com.facebook.ads.redexgen.core.XB.A00(stringExtra)))) {
                                        A02(str, c1636gi);
                                    }
                                    return true;
                                }
                            }
                            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A00(111, 5, 91) + str);
                            c1049Te.A05(1);
                            c1636gi.A08().ABD(A00(11, 11, 104), com.facebook.ads.redexgen.core.AbstractC1048Td.A06, c1049Te);
                            return true;
                        }
                    }
                    return false;
                }
                z2 = com.facebook.ads.redexgen.core.M3.A0A;
                if (!z2 || !A003.equalsIgnoreCase(scheme)) {
                    z3 = com.facebook.ads.redexgen.core.M3.A0A;
                    if (!z3 || !com.facebook.ads.redexgen.core.AbstractC1145Xb.A04(str)) {
                        set = com.facebook.ads.redexgen.core.M3.A0D;
                    }
                    return com.facebook.ads.redexgen.core.C1140Wu.A0D(c1636gi, new android.content.Intent(A002, uri));
                }
                android.content.Intent parseUri = android.content.Intent.parseUri(str, 1);
                parseUri.addCategory(A00);
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                if (c1636gi.getPackageManager().resolveActivity(parseUri, 65536) != null && com.facebook.ads.redexgen.core.C1140Wu.A0D(c1636gi, parseUri)) {
                    webView.goBack();
                    return true;
                }
                return false;
            } catch (java.lang.SecurityException e2) {
                c1636gi.A08().ABD(A004, com.facebook.ads.redexgen.core.AbstractC1048Td.A2d, new com.facebook.ads.redexgen.core.C1049Te(e2));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(java.lang.String str) {
        return true;
    }

    public final void A05(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1275ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        com.facebook.ads.redexgen.core.C1269al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        com.facebook.ads.redexgen.core.InterfaceC1274aq interfaceC1274aq = this.A03.get();
        if (interfaceC1274aq != null) {
            interfaceC1274aq.AF7(str);
        }
        com.facebook.ads.redexgen.core.InterfaceC1275ar interfaceC1275ar = this.A00.get();
        if (interfaceC1275ar != null) {
            interfaceC1275ar.ADB(webView.canGoBack());
            interfaceC1275ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.facebook.ads.redexgen.core.InterfaceC1274aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A02.get();
        if (c1636gi != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String A00 = A00(0, 0, 109);
            java.lang.String errorMessage = com.facebook.ads.redexgen.core.AbstractC1145Xb.A01(i, sb.append(A00).append(str).toString(), A00 + str2);
            c1636gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A02.get();
        if (c1636gi != null) {
            int errorCode = webResourceError.getErrorCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String A00 = A00(0, 0, 109);
            java.lang.String errorMessage = com.facebook.ads.redexgen.core.AbstractC1145Xb.A01(errorCode, sb.append(A00).append((java.lang.Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            c1636gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.facebook.ads.redexgen.core.C1636gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.facebook.ads.redexgen.core.C1636gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.AbstractC1282ay.A0D(com.facebook.ads.redexgen.core.AbstractC1048Td.A2e);
        com.facebook.ads.redexgen.core.InterfaceC1274aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        return A03(webView, str);
    }
}
