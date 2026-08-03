package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ko {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f3076 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.ko.d f3077;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f3078;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3079;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f3080;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.ko.d f3081;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3082;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3083;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3084;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3085;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3086;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8484() {
        f3078 = (char) 6;
        f3080 = new char[]{'j', 'a', 'v', io.ktor.util.date.GMTDateParser.SECONDS, 'c', 'r', 'i', 'p', 't', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 'e', 'l', '(', 'o', 'b', '\"', ')', ';', 'C', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'n', '\'', ' ', 'f', 'W', 'V', 'w', io.ktor.util.date.GMTDateParser.HOURS, io.ktor.util.date.GMTDateParser.MINUTES, 'U', 'E', 'k', 'g', 'q', 'x'};
    }

    static {
        m8484();
        f3085 = true;
        f3082 = true;
        f3086 = true;
        byte b = 0;
        f3084 = false;
        f3083 = false;
        f3081 = new com.ironsource.adqualitysdk.sdk.i.ko.d(b);
        f3077 = new com.ironsource.adqualitysdk.sdk.i.ko.d(b);
        int i = f3079 + 21;
        f3076 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static synchronized com.ironsource.adqualitysdk.sdk.i.at m8493() {
        com.ironsource.adqualitysdk.sdk.i.at mo6050;
        synchronized (com.ironsource.adqualitysdk.sdk.i.ko.class) {
            int i = 2 % 2;
            int i2 = f3076 + 69;
            f3079 = i2 % 128;
            int i3 = i2 % 2;
            mo6050 = com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6050();
            int i4 = f3079 + 31;
            f3076 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        return mo6050;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8488(android.webkit.WebView webView, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3076 + 3;
        f3079 = i2 % 128;
        int i3 = i2 % 2;
        if (webView != null) {
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8483(23 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0001\u0002\u0003\u0002\u0004\u0005\u0000\u000b\b\t\n\u000b\u0003\u0002\u0006\u0011\u0002\u0007\u000e\u000f\r\u0010", (byte) (33 - android.text.TextUtils.getOffsetBefore("", 0))).intern());
            sb.append(str);
            sb.append(m8483(android.text.TextUtils.getOffsetBefore("", 0) + 4, "\u0010\u0011\u0011\f", (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36)).intern());
            webView.loadUrl(sb.toString());
            int i4 = f3079 + 77;
            f3076 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static android.webkit.WebViewClient m8492(android.webkit.WebView webView) {
        int i = 2 % 2;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int i2 = f3079 + 97;
            f3076 = i2 % 128;
            if (i2 % 2 == 0) {
                m8493().m6128();
                throw null;
            }
            if (m8493().m6128() && !(!m8485(webView.getContext()))) {
                int i3 = f3079 + 123;
                f3076 = i3 % 128;
                if (i3 % 2 != 0) {
                    return webView.getWebViewClient();
                }
                int i4 = 33 / 0;
                return webView.getWebViewClient();
            }
        }
        com.ironsource.adqualitysdk.sdk.i.Cif<android.webkit.WebViewClient> m8482 = m8482(webView);
        if (m8482 != null) {
            return m8482.mo7963();
        }
        throw new java.lang.RuntimeException(m8483(33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u0013\f\u0017\u0007\u0015\u0016\u0014\n\u0012\u001d\t\u0012\u0015\u0012\u001c\u0007\u0014 \u0007\u000b\u0018\u0015\u0006\u0007\t\u0016\u000b\u0014\u001e\f\u000b\u0006§", (byte) (67 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static android.webkit.WebChromeClient m8489(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3076 + 91;
        f3079 = i2 % 128;
        if ((i2 % 2 != 0 || android.os.Build.VERSION.SDK_INT >= 26) && !(!m8493().m6126()) && m8496(webView.getContext())) {
            int i3 = f3076 + 1;
            f3079 = i3 % 128;
            if (i3 % 2 == 0) {
                return webView.getWebChromeClient();
            }
            webView.getWebChromeClient();
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.Cif<android.webkit.WebChromeClient> m8486 = m8486(webView);
        if (m8486 == null) {
            throw new java.lang.RuntimeException(m8483(35 - android.text.TextUtils.getTrimmedLength(""), "\u0013\f\u0017\u0007\u0015\u0016\u0014\n\u0012\u001d\t\u0012\u0015\u0012\u001c\u0007\f\u0014\u001d\u0004\u0011\u0019\u0006\u0016\u0006\u0007\t\u0016\u000b\u0014\u001e\f\u000b\u0006Â", (byte) (94 - android.graphics.drawable.Drawable.resolveOpacity(0, 0))).intern());
        }
        return m8486.mo7963();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m8481(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3076 + 17;
        f3079 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = m8492(webView) instanceof com.ironsource.adqualitysdk.sdk.i.hr;
        if (i3 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.Cif<android.webkit.WebViewClient> m8482(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3079 + 69;
        f3076 = i2 % 128;
        if (i2 % 2 == 0) {
            m8480(webView.getContext());
            int i3 = 52 / 0;
            return m8494(webView, m8490(), f3081);
        }
        m8480(webView.getContext());
        return m8494(webView, m8490(), f3081);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.Cif<android.webkit.WebChromeClient> m8486(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3079 + 121;
        f3076 = i2 % 128;
        if (i2 % 2 != 0) {
            m8480(webView.getContext());
            return m8494(webView, m8479(), f3077);
        }
        m8480(webView.getContext());
        m8494(webView, m8479(), f3077);
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m8480(android.content.Context context) {
        int i = 2 % 2;
        int i2 = f3076 + 21;
        f3079 = i2 % 128;
        int i3 = i2 % 2;
        if (f3085) {
            f3085 = false;
            try {
                android.webkit.WebView webView = new android.webkit.WebView(context);
                com.ironsource.adqualitysdk.sdk.i.hr hrVar = new com.ironsource.adqualitysdk.sdk.i.hr(null, new android.webkit.WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.5
                });
                webView.setWebViewClient(hrVar);
                com.ironsource.adqualitysdk.sdk.i.hu huVar = new com.ironsource.adqualitysdk.sdk.i.hu(null, new android.webkit.WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.2
                });
                webView.setWebChromeClient(huVar);
                f3081 = m8491(webView, hrVar, m8490());
                f3077 = m8491(webView, huVar, m8479());
                int i4 = f3079 + 121;
                f3076 = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.Throwable th) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8483(12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u001c\u0007\u0014 \u0007\u000b\u0018!\t\u0007\t\u0005", (byte) (80 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), m8483(32 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "#\u0001\u0001\u0011\u000b\u001d\n\"\u0010\n\u001e\b\u001b\u0003\u0012\u001d\u0011\u0001\u0012\u000bãã\u000b\u0004\u0016\u0005\u0006\u0007\t\u0016\t\u0002", (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 117)).intern(), th, false);
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m8485(android.content.Context context) {
        boolean z;
        int i = 2 % 2;
        if (f3082) {
            try {
                f3082 = false;
                android.webkit.WebView webView = new android.webkit.WebView(context);
                com.ironsource.adqualitysdk.sdk.i.hr hrVar = new com.ironsource.adqualitysdk.sdk.i.hr(null, new android.webkit.WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.1
                });
                webView.setWebViewClient(hrVar);
                if (hrVar == webView.getWebViewClient()) {
                    int i2 = f3079 + 29;
                    f3076 = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                f3084 = z;
                int i4 = f3079 + 27;
                f3076 = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.Throwable th) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8483(12 - android.text.TextUtils.getCapsMode("", 0, 0), "\u001c\u0007\u0014 \u0007\u000b\u0018!\t\u0007\t\u0005", (byte) (android.graphics.Color.blue(0) + 79)).intern(), m8483((android.view.ViewConfiguration.getTapTimeout() >> 16) + 36, "#\u0001\u0001\u0011\u000b\u001d\n\"\u0010\n\u001e\b\u001b\u0003\u0012\u000b\u001d\u0012\u0004\u0002\u001c\u000b\u0013\u001d\b\u0010\u0018\b\t\u001c\u0017\u0006\u0007\u000b\u0014\t", (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 16)).intern(), th, false);
            }
        }
        return f3084;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8496(android.content.Context context) {
        int i = 2 % 2;
        if (f3086) {
            boolean z = false;
            f3086 = false;
            android.webkit.WebView webView = new android.webkit.WebView(context);
            com.ironsource.adqualitysdk.sdk.i.hu huVar = new com.ironsource.adqualitysdk.sdk.i.hu(null, new android.webkit.WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.3
            });
            webView.setWebChromeClient(huVar);
            if (huVar == webView.getWebChromeClient()) {
                int i2 = f3076 + 35;
                f3079 = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                int i4 = f3076 + 95;
                f3079 = i4 % 128;
                int i5 = i4 % 2;
            }
            f3083 = z;
        }
        return f3083;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.ko.d m8491(android.webkit.WebView webView, T t, com.ironsource.adqualitysdk.sdk.i.ii iiVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ko.d dVar = new com.ironsource.adqualitysdk.sdk.i.ko.d((byte) 0);
        com.ironsource.adqualitysdk.sdk.i.Cif m8478 = m8478(webView, iiVar, m8493().m6127(), m8493().m6129());
        if (m8478 != null) {
            int i2 = f3079 + 73;
            f3076 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.Object mo7963 = m8478.mo7963();
            if (mo7963 == t) {
                dVar.m8499();
            } else {
                com.ironsource.adqualitysdk.sdk.i.Cif m8487 = m8487(mo7963, iiVar, m8493().m6130(), m8493().m6131());
                if (m8487 != null) {
                    int i4 = f3079 + 9;
                    f3076 = i4 % 128;
                    java.lang.Object obj = null;
                    if (i4 % 2 != 0) {
                        if (m8487.mo7963() == t) {
                            int i5 = f3079 + 57;
                            f3076 = i5 % 128;
                            if (i5 % 2 == 0) {
                                dVar.m8501();
                                super.hashCode();
                                throw null;
                            }
                            dVar.m8501();
                        }
                    } else {
                        m8487.mo7963();
                        super.hashCode();
                        throw null;
                    }
                }
            }
        }
        return dVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8494(android.webkit.WebView webView, com.ironsource.adqualitysdk.sdk.i.ii iiVar, com.ironsource.adqualitysdk.sdk.i.ko.d dVar) {
        T mo7963;
        int i = 2 % 2;
        int i2 = f3076 + 97;
        f3079 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                int i3 = 64 / 0;
                if (!dVar.m8498()) {
                    return null;
                }
            } else if (!dVar.m8498()) {
                return null;
            }
            com.ironsource.adqualitysdk.sdk.i.Cif<T> m8478 = m8478(webView, iiVar, m8493().m6127(), m8493().m6129());
            if (!dVar.m8500() || m8478 == null || (mo7963 = m8478.mo7963()) == null) {
                return m8478;
            }
            int i4 = f3076 + 63;
            f3079 = i4 % 128;
            int i5 = i4 % 2;
            return !mo7963.getClass().equals(m8478.mo7964().getType()) ? m8487(mo7963, iiVar, m8493().m6130(), m8493().m6131()) : m8478;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8483(12 - android.graphics.Color.alpha(0), "\u001c\u0007\u0014 \u0007\u000b\u0018!\t\u0007\t\u0005", (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 79)).intern(), m8483(android.view.KeyEvent.normalizeMetaState(0) + 26, "#\u0001\u0001\u0011\u000b\u001d\"\t\u00ad\u00ad\t\u0012#\u0015\u0005\n\u0007\u000b\u0014\t\u0012\u001d\u0007\u000b\b\u0017", (byte) (57 - android.view.KeyEvent.getDeadChar(0, 0))).intern(), th, false);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8478(android.webkit.WebView webView, com.ironsource.adqualitysdk.sdk.i.ii iiVar, java.util.List<java.lang.String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f3076 + 69;
        f3079 = i3 % 128;
        int i4 = i3 % 2;
        com.ironsource.adqualitysdk.sdk.i.Cif<T> m8495 = m8495(webView, iiVar, list, i);
        int i5 = f3079 + 45;
        f3076 = i5 % 128;
        int i6 = i5 % 2;
        return m8495;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8487(T t, com.ironsource.adqualitysdk.sdk.i.ii iiVar, java.util.List<java.lang.String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f3076 + 53;
        f3079 = i3 % 128;
        int i4 = i3 % 2;
        com.ironsource.adqualitysdk.sdk.i.Cif<T> m8495 = m8495(t, iiVar, list, i);
        int i5 = f3079 + 113;
        f3076 = i5 % 128;
        int i6 = i5 % 2;
        return m8495;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8495(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ii iiVar, final java.util.List<java.lang.String> list, int i) {
        int i2 = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.Cif<T> m8045 = com.ironsource.adqualitysdk.sdk.i.id.m7934().m7936().m8045(obj, iiVar, new com.ironsource.adqualitysdk.sdk.i.hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* renamed from: ｋ */
            public final java.lang.reflect.Field[] mo7872(java.lang.Object obj2) {
                com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937();
                return com.ironsource.adqualitysdk.sdk.i.hw.m7864(obj2.getClass(), true, -1, list);
            }
        }, list, i);
        int i3 = f3076 + 121;
        f3079 = i3 % 128;
        int i4 = i3 % 2;
        return m8045;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.ii m8490() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ii iiVar = new com.ironsource.adqualitysdk.sdk.i.ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7425(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
                return android.webkit.WebViewClient.class.equals(cif.mo7964().getType());
            }
        };
        int i2 = f3076 + 29;
        f3079 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return iiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.ii m8479() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ii iiVar = new com.ironsource.adqualitysdk.sdk.i.ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7425(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
                return android.webkit.WebChromeClient.class.equals(cif.mo7964().getType());
            }
        };
        int i2 = f3076 + 61;
        f3079 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return iiVar;
    }

    static class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3088;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3089;

        private d() {
            this.f3089 = false;
            this.f3088 = false;
        }

        /* synthetic */ d(byte b) {
            this();
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean m8497() {
            return this.f3089;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        final void m8499() {
            this.f3089 = true;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        final boolean m8500() {
            return this.f3088;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        final void m8501() {
            this.f3088 = true;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        final boolean m8498() {
            return m8497() || m8500();
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8483(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f3080;
            char c = f3078;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}
