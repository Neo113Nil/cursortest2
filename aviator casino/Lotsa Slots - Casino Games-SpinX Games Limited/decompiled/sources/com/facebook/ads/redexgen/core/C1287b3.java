package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1287b3 extends android.webkit.WebViewClient {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", "c", "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", "K"};
    public java.util.Date A00;
    public boolean A01 = false;
    public final com.facebook.ads.redexgen.core.C1636gi A02;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.LV> A03;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1> A04;
    public final java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.Y2> A06;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1581fp> A07;
    public final java.util.concurrent.atomic.AtomicInteger A08;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A09;
    public final boolean A0A;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, 38, 40, 45, 42, -14, 8, 52, 51, 57, 55, 52, 49, -69, -36, -27, -32, -36, -37, com.google.common.base.Ascii.FS, 77, 56, 67, 76, 56, 75, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 62, -9, 44, 41, 32, -9, 39, 56, 75, 63, -9, kotlin.io.encoding.Base64.padSymbol, 70, 73, -9, com.google.common.base.Ascii.GS, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 67, 60, -9, com.google.common.base.Ascii.CAN, 58, 58, 60, 74, 74, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, -57, -83, 60, 72, 72, 68, com.google.common.base.Ascii.DC4, 57, 102, 102, 99, 102, 59, 84, 89, 71, 76, 75, 6, 56, 75, 87, 91, 75, 89, 90, 6, 76, 85, 88, 6, 44, 79, 82, 75, 6, 39, 73, 73, 75, 89, 89, 6, 34, 59, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 46, 51, 50, -19, com.google.common.base.Ascii.US, 50, 62, 66, 50, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, -19, 51, 60, 63, -19, 19, 54, 57, 50, -19, com.google.common.base.Ascii.SO, 48, 48, 50, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -19, 49, 50, 59, 54, 50, 49, 67, 68, 77, 72, 68, 67, 62, 84, 81, 72, 62, 79, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 83, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 59, 80, 67, kotlin.io.encoding.Base64.padSymbol, 73, 72, 8, 67, kotlin.io.encoding.Base64.padSymbol, 73, 41, 44, 47, 40, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.GS, -29, -29, -18, -5, -5, 8, -18, -10, -7, -3, 2, 8, -5, -18, -4, -7, -8, -9, -4, -18, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, -38, 32, 33, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 98, 85, 97, 101, 85, 99, 100, 79, 89, 84, 78, 63, 82, 78, 9, 74, 70, 59, 67, 72, 5, -16, -5, -8, -13, -18, -1, -16, 3, -9, 55, 37, 34, com.google.common.base.Ascii.US, 54, 41, 37, 55};
        java.lang.String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A09(java.lang.String str, java.util.List<java.lang.String> list) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.getDefault());
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public C1287b3(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1> weakReference, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1581fp> weakReference2, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.Y2> weakReference3, java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> checkAssetsByJavascriptBridge, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.LV> weakReference4, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicReference<java.lang.String> requestId, boolean z) {
        this.A02 = c1636gi;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z;
    }

    private android.webkit.WebResourceResponse A00() {
        return new android.webkit.WebResourceResponse(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 10, 100), java.nio.charset.StandardCharsets.UTF_8.name(), 403, A01(13, 6, 1), java.util.Collections.singletonMap(A01(0, 13, 79), A01(198, 8, 55)), new java.io.ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(int i, java.lang.String str) {
        if (A01(175, 23, 51).equals(str)) {
            this.A02.A0F().AKx();
            return;
        }
        this.A02.A0F().AKy(i, str);
        if (this.A04.get() != null) {
            this.A04.get().ADu(i, str);
        }
    }

    private final void A04(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(java.util.Locale.US).contains(A01(160, 11, 100))) {
            return;
        }
        this.A02.A0F().AL2(webResourceResponse.getStatusCode(), com.facebook.ads.redexgen.core.AbstractC1145Xb.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A06(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A01(145, 15, 105), str);
            jSONObject.put(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 10, 25), str2);
            jSONObject.put(A01(206, 10, 122), this.A09.get());
        } catch (org.json.JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A08().ABC(A01(236, 8, 74), com.facebook.ads.redexgen.core.AbstractC1048Td.A2c, new com.facebook.ads.redexgen.core.C1049Te(com.facebook.ads.internal.protocol.AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A01(19, 36, 97);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r5 = com.facebook.ads.redexgen.core.C1042Sx.A09(r7.A02);
        r6 = A09(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A01(77, 31, 112);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r4 = com.facebook.ads.redexgen.core.LV.A0H;
        r0 = A01(108, 37, 87);
        android.util.Log.w(r4, r0);
        r0 = r5.toString();
        A06(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A07(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        java.lang.String scheme = uri.getScheme();
        if (path == null || scheme == null) {
            return true;
        }
        java.lang.String[] strArr = A0C;
        java.lang.String scheme2 = strArr[3];
        java.lang.String path2 = strArr[6];
        if (scheme2.length() != path2.length()) {
            throw new java.lang.RuntimeException();
        }
        A0C[5] = "5na5yijD7UxFpHVkXXcSH2RW6Zg";
        java.lang.String path3 = A01(171, 4, 77);
        if (scheme.equals(path3)) {
            boolean isDebug = com.facebook.ads.internal.api.BuildConfigApi.isDebug();
            java.lang.String[] strArr2 = A0C;
            java.lang.String scheme3 = strArr2[3];
            java.lang.String path4 = strArr2[6];
            if (scheme3.length() == path4.length()) {
                A0C[5] = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH";
            }
        } else {
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.A02.A0F().AKz(this.A03.get() != null);
        if (this.A03.get() != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.A05.get();
            java.lang.String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0K();
            }
        }
        if (this.A04.get() != null) {
            this.A04.get().AF8();
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0F().AL0();
        this.A00 = new java.util.Date();
        new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.LW(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        this.A01 = true;
        A03(i, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        boolean A12 = com.facebook.ads.redexgen.core.C1086Up.A12(this.A02);
        java.lang.String A01 = A01(0, 0, 53);
        if (A12 || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A03(webResourceError.getErrorCode(), A01 + ((java.lang.Object) webResourceError.getDescription()));
        } else {
            this.A02.A0F().AL1(com.facebook.ads.redexgen.core.AbstractC1145Xb.A01(webResourceError.getErrorCode(), A01 + ((java.lang.Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A04(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        this.A02.A0F().AL3();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.AbstractC1282ay.A0D(com.facebook.ads.redexgen.core.AbstractC1048Td.A2b);
        com.facebook.ads.redexgen.core.InterfaceC1285b1 adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AGg();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.net.Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A07(url)) {
            android.webkit.WebResourceResponse A00 = A00();
            A04(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (this.A04.get() != null) {
            this.A04.get().ADN(str, new com.facebook.ads.redexgen.core.C1293b9().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new java.lang.RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}
