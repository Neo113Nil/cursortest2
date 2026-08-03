package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1276as extends android.webkit.WebChromeClient {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"UcT", "7pCxO", "d1eUuJRsSQrbyeV", "NvcYkIOLS6u3Z", "4rhEUJepg5yzUmxbs6HYJp18fCLzs", "c8rjrCABAqtuVN2R", "gqC4klM2hvrTEGu", "cDVUBFjHiz5XJka2"};
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1636gi> A00;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1274aq> A01;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1269al> A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A04;
            if (strArr[4].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[0] = "xQ2";
            strArr2[1] = "BwhB4";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{81, 86, 81, -66, -31, -28, -35, -104, -69, -32, -25, -25, -21, -35, -22, -117, -104, -114, -100, -103, -109, -114, 88, -109, -104, -98, -113, -104, -98, 88, -117, -115, -98, -109, -103, -104, 88, 113, 111, 126, -119, 109, 121, 120, 126, 111, 120, 126, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -50, -49, -60, -51, -64, -63, -53, -60, -68, -86, -89, -92, -69, -82, -86, -68};
    }

    static {
        A01();
    }

    public C1276as(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1636gi> weakReference, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1274aq> weakReference2, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1269al> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(android.webkit.ValueCallback valueCallback) {
        boolean z;
        android.webkit.ValueCallback valueCallback2;
        android.webkit.ValueCallback valueCallback3;
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A00.get();
        if (c1636gi != null && c1636gi.A0E() != null) {
            z = com.facebook.ads.redexgen.core.M3.A09;
            if (z) {
                valueCallback2 = com.facebook.ads.redexgen.core.M3.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = com.facebook.ads.redexgen.core.M3.A08;
                    valueCallback3.onReceiveValue(null);
                    java.lang.String[] strArr = A04;
                    if (strArr[4].length() == strArr[3].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A04;
                    strArr2[4] = "8y9TMu8YjdwMhcx8OyIx8Raox9jk1";
                    strArr2[3] = "8D57YjnpkPWjk";
                    android.webkit.ValueCallback unused = com.facebook.ads.redexgen.core.M3.A08 = null;
                }
                android.webkit.ValueCallback unused2 = com.facebook.ads.redexgen.core.M3.A08 = valueCallback;
                try {
                    android.content.Intent intent = new android.content.Intent(A00(15, 33, 6));
                    intent.addCategory(A00(48, 32, 91));
                    intent.setType(A00(0, 3, 3));
                    c1636gi.A0E().startActivityForResult(android.content.Intent.createChooser(intent, A00(3, 12, 84)), 1001);
                    return true;
                } catch (java.lang.Exception e) {
                    c1636gi.A08().ABD(A00(80, 8, 33), com.facebook.ads.redexgen.core.AbstractC1048Td.A2d, new com.facebook.ads.redexgen.core.C1049Te(e));
                    android.webkit.ValueCallback unused3 = com.facebook.ads.redexgen.core.M3.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String message = consoleMessage.message();
        com.facebook.ads.redexgen.core.C1269al c1269al = this.A02.get();
        if (!android.text.TextUtils.isEmpty(message) && consoleMessage.messageLevel() == android.webkit.ConsoleMessage.MessageLevel.LOG && c1269al != null) {
            c1269al.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.facebook.ads.redexgen.core.C1269al timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        com.facebook.ads.redexgen.core.InterfaceC1274aq interfaceC1274aq = this.A01.get();
        if (interfaceC1274aq != null) {
            interfaceC1274aq.AFY(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(android.webkit.WebView webView, java.lang.String str) {
        super.onReceivedTitle(webView, str);
        com.facebook.ads.redexgen.core.InterfaceC1274aq listener = this.A01.get();
        if (listener != null) {
            listener.AFb(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> filePathCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
