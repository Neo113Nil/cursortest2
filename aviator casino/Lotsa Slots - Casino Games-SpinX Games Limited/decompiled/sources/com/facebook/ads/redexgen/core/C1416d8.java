package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.d8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1416d8 extends android.webkit.WebViewClient {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1420dC A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A02[5].charAt(10) != 'q') {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i4] = (byte) (i5 ^ 33);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, com.google.common.base.Ascii.FF, 17, 32, com.google.common.base.Ascii.FF, 7, 6, 90, 93, 74, 85, 95, 83, 82, com.google.common.base.Ascii.DC2, 85, 95, 83, com.google.common.base.Ascii.CR, 17, 17, com.google.common.base.Ascii.NAK, 58, 0, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.ETB, 19, 17, 10, com.google.common.base.Ascii.FF, 17, 10, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 106, 109, 115};
    }

    static {
        A01();
    }

    public C1416d8(com.facebook.ads.redexgen.core.C1420dC c1420dC) {
        this.A00 = c1420dC;
    }

    private void A02(int i, java.lang.String str, java.lang.String str2, boolean z) {
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1407cz c1407cz;
        if (z) {
            this.A00.A0S();
        }
        vi = this.A00.A0D;
        vi.A04(com.facebook.ads.redexgen.core.VH.A0Q, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (org.json.JSONException unused) {
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        c1636gi = this.A00.A0B;
        c1636gi.A0F().A6E(jSONObject2);
        c1407cz = this.A00.A0E;
        c1407cz.A04(com.facebook.ads.redexgen.core.AbstractC1048Td.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        long j;
        com.facebook.ads.redexgen.core.InterfaceC1418dA interfaceC1418dA;
        com.facebook.ads.redexgen.core.InterfaceC1418dA interfaceC1418dA2;
        vi = this.A00.A0D;
        vi.A04(com.facebook.ads.redexgen.core.VH.A0R, null);
        c1636gi = this.A00.A0B;
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi.A0F();
        j = this.A00.A00;
        A0F.A6F(com.facebook.ads.redexgen.core.Y1.A01(j));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC1418dA = this.A00.A03;
        if (interfaceC1418dA == null) {
            return;
        }
        interfaceC1418dA2 = this.A00.A03;
        interfaceC1418dA2.AGh();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (android.os.Build.VERSION.SDK_INT < 23) {
            A02(i, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String A00 = A00(0, 0, 93);
        A02(errorCode, sb.append(A00).append((java.lang.Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(java.util.Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        A02(i, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        com.facebook.ads.redexgen.core.InterfaceC1419dB interfaceC1419dB;
        com.facebook.ads.redexgen.core.InterfaceC1419dB interfaceC1419dB2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (org.json.JSONException unused) {
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        c1636gi = this.A00.A0B;
        java.lang.String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1636gi.A0F().A6A(jSONObject2);
            abstractC1801jd = this.A00.A09;
            com.facebook.ads.redexgen.core.AbstractC1421dD.A04(abstractC1801jd.A1D());
            interfaceC1419dB = this.A00.A04;
            if (interfaceC1419dB != null) {
                interfaceC1419dB2 = this.A00.A04;
                interfaceC1419dB2.AFU();
            }
            java.lang.String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx;
        com.facebook.ads.redexgen.core.C1428dK c1428dK;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        c1636gi = this.A00.A0B;
        c1042Sx = this.A00.A0A;
        c1428dK = this.A00.A0H;
        abstractC1801jd = this.A00.A09;
        return com.facebook.ads.redexgen.core.C1430dM.A00(c1636gi, c1042Sx, webResourceRequest, c1428dK, abstractC1801jd.A1T());
    }
}
