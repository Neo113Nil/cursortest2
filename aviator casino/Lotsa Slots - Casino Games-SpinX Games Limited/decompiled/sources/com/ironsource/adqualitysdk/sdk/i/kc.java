package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kc {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2983 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2984;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2985 = {1025544850, -314566486, -147617137, -1082412112, 138059252, -476438189, -933727488, -1608874423, -927041735, 1280789362, 1927033438, -1624149396, 157163810, 1764982836, 846874785, 1254733006, -1878974093, 1416506261};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.ba.d> f2986;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.ref.WeakReference<android.webkit.WebView> f2987;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2988;

    public kc(android.webkit.WebView webView) {
        this.f2987 = new java.lang.ref.WeakReference<>(webView);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final android.webkit.WebView m8339() {
        int i = 2 % 2;
        int i2 = f2984 + 37;
        f2983 = i2 % 128;
        int i3 = i2 % 2;
        android.webkit.WebView webView = this.f2987.get();
        int i4 = f2984 + 125;
        f2983 = i4 % 128;
        int i5 = i4 % 2;
        return webView;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ba.d m8337() {
        int i = 2 % 2;
        int i2 = f2983;
        int i3 = i2 + 13;
        f2984 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.ref.WeakReference<com.ironsource.adqualitysdk.sdk.i.ba.d> weakReference = this.f2986;
        if (weakReference != null) {
            return weakReference.get();
        }
        int i5 = i2 + 63;
        f2984 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8332(com.ironsource.adqualitysdk.sdk.i.ba.d dVar) {
        int i = 2 % 2;
        this.f2986 = new java.lang.ref.WeakReference<>(dVar);
        int i2 = f2983 + 37;
        f2984 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8333(com.ironsource.adqualitysdk.sdk.i.ba.d dVar) {
        int i = 2 % 2;
        new java.lang.ref.WeakReference(dVar);
        int i2 = f2984 + 71;
        f2983 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8338(android.webkit.WebViewClient webViewClient) {
        int i = 2 % 2;
        int i2 = f2983 + 5;
        f2984 = i2 % 128;
        int i3 = i2 % 2;
        android.webkit.WebView m8339 = m8339();
        if (m8339 != null) {
            try {
                com.ironsource.adqualitysdk.sdk.i.hr hrVar = new com.ironsource.adqualitysdk.sdk.i.hr(com.ironsource.adqualitysdk.sdk.i.ko.m8492(m8339), webViewClient);
                m8332(hrVar);
                m8339.setWebViewClient(hrVar);
                this.f2988 = true;
                int i4 = f2983 + 15;
                f2984 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 61 / 0;
                    return;
                }
                return;
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8334(new int[]{1958964947, 1643038258, -1226902848, -1658057597, 305519973, -1135629721, -295575135, -1389772063}, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 16).intern(), m8334(new int[]{785300948, -1806512046, 215855656, -74328926, -1414176270, 1855323541, -905868023, -14658158, -936110783, 1884754485, 398054873, -1856727316, 1992380902, -619259732}, android.view.View.MeasureSpec.getMode(0) + 27).intern(), (java.lang.Throwable) e, false);
            }
        }
        this.f2988 = false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8335(android.webkit.WebChromeClient webChromeClient) {
        int i = 2 % 2;
        int i2 = f2983 + 89;
        f2984 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            android.webkit.WebView m8339 = m8339();
            if (m8339 != null) {
                try {
                    android.webkit.WebChromeClient m8489 = com.ironsource.adqualitysdk.sdk.i.ko.m8489(m8339);
                    if (m8489 != null && !(m8489 instanceof android.webkit.WebChromeClient)) {
                        com.ironsource.adqualitysdk.sdk.i.hu huVar = new com.ironsource.adqualitysdk.sdk.i.hu(m8489, webChromeClient);
                        m8333(huVar);
                        m8339.setWebChromeClient(huVar);
                    }
                    int i3 = f2983 + 123;
                    f2984 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    super.hashCode();
                    throw null;
                } catch (java.lang.Exception e) {
                    com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8334(new int[]{1958964947, 1643038258, -1226902848, -1658057597, 305519973, -1135629721, -295575135, -1389772063}, android.graphics.Color.red(0) + 16).intern(), m8334(new int[]{785300948, -1806512046, 215855656, -74328926, -1414176270, 1855323541, -905868023, -14658158, -1678569775, -1695975826, -960162793, -77567311, -979943013, 2104793189, 918814131, -838351239}, 29 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern(), (java.lang.Throwable) e, false);
                    return;
                }
            }
            return;
        }
        m8339();
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m8336() {
        boolean z;
        int i = 2 % 2;
        int i2 = f2984 + 109;
        int i3 = i2 % 128;
        f2983 = i3;
        if (i2 % 2 == 0) {
            z = this.f2988;
            int i4 = 44 / 0;
        } else {
            z = this.f2988;
        }
        int i5 = i3 + 15;
        f2984 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8334(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2985.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
            }
            str = new java.lang.String(cArr2, 0, i);
        }
        return str;
    }
}
