package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class z<T> extends com.ironsource.adqualitysdk.sdk.i.u<android.webkit.WebView, T> implements android.view.View.OnLayoutChangeListener {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3310 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3311 = 125;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3312;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private java.util.Map<android.webkit.WebView, com.ironsource.adqualitysdk.sdk.i.kd> f3313 = new java.util.WeakHashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private java.util.List<com.ironsource.adqualitysdk.sdk.i.jy> f3314 = new java.util.ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jz f3315;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3316;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.kd f3317;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.util.List<java.lang.String> f3318;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String f3319;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f3320;

    /* renamed from: ﻛ */
    abstract T mo5772(android.webkit.WebView webView);

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ com.ironsource.adqualitysdk.sdk.i.ba.d m8718(com.ironsource.adqualitysdk.sdk.i.z zVar) {
        int i = 2 % 2;
        int i2 = f3310 + 85;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ba.d m8717 = zVar.m8717();
        int i4 = f3312 + 51;
        f3310 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8717;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ org.json.JSONObject m8719(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3312 + 73;
        f3310 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8720 = m8720(str);
        int i4 = f3312 + 115;
        f3310 = i4 % 128;
        int i5 = i4 % 2;
        return m8720;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8721(com.ironsource.adqualitysdk.sdk.i.z zVar) {
        int i = 2 % 2;
        int i2 = f3312 + 21;
        f3310 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = zVar.f3320;
        if (i3 != 0) {
            return z;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8722(com.ironsource.adqualitysdk.sdk.i.z zVar, android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3310 + 83;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        zVar.m8716(webView);
        int i4 = f3312 + 103;
        f3310 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ java.util.List m8725(com.ironsource.adqualitysdk.sdk.i.z zVar) {
        int i = 2 % 2;
        int i2 = f3312 + 105;
        int i3 = i2 % 128;
        f3310 = i3;
        int i4 = i2 % 2;
        java.util.List<java.lang.String> list = zVar.f3318;
        int i5 = i3 + 29;
        f3312 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻐ */
    public final /* synthetic */ void mo5817(org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
        int i = 2 % 2;
        int i2 = f3310 + 53;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        m8723(jSONObject, (android.webkit.WebView) obj, (android.webkit.WebView) obj2);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f3310 + 45;
        f3312 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public final /* synthetic */ void mo5820(org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
        int i = 2 % 2;
        int i2 = f3310 + 35;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        m8731(jSONObject, (android.webkit.WebView) obj, (android.webkit.WebView) obj2);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8729(java.lang.String str, java.util.List<java.lang.String> list, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        this.f3316 = z;
        this.f3315 = new com.ironsource.adqualitysdk.sdk.i.jz(str, z3);
        this.f3320 = z2;
        this.f3318 = list;
        int i2 = f3310 + 15;
        f3312 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8732() {
        int i = 2 % 2;
        java.util.Iterator<android.webkit.WebView> it = this.f3313.keySet().iterator();
        while (it.hasNext()) {
            int i2 = f3312 + 65;
            f3310 = i2 % 128;
            if (i2 % 2 == 0) {
                android.webkit.WebView next = it.next();
                next.removeOnLayoutChangeListener(this);
                this.f3313.get(next);
                this.f3314.iterator();
                throw null;
            }
            android.webkit.WebView next2 = it.next();
            next2.removeOnLayoutChangeListener(this);
            com.ironsource.adqualitysdk.sdk.i.kd kdVar = this.f3313.get(next2);
            java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jy> it2 = this.f3314.iterator();
            while (it2.hasNext()) {
                kdVar.m8342(it2.next());
                int i3 = f3310 + 123;
                f3312 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        this.f3314.clear();
        this.f3317 = null;
        this.f3313.clear();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final android.webkit.WebView m8728() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.kd kdVar = this.f3317;
        java.lang.Object obj = null;
        if (kdVar != null) {
            int i2 = f3310 + 99;
            f3312 = i2 % 128;
            if (i2 % 2 == 0) {
                return kdVar.m8347();
            }
            kdVar.m8347();
            throw null;
        }
        int i3 = f3312 + 27;
        f3310 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ba.d m8717() {
        int i = 2 % 2;
        int i2 = f3312 + 19;
        f3310 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.kd kdVar = this.f3317;
        if (kdVar == null) {
            return null;
        }
        com.ironsource.adqualitysdk.sdk.i.ba.d m8346 = kdVar.m8346();
        int i3 = f3310 + 99;
        f3312 = i3 % 128;
        int i4 = i3 % 2;
        return m8346;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8733(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3310;
        int i3 = i2 + 71;
        f3312 = i3 % 128;
        int i4 = i3 % 2;
        if (webView != null) {
            int i5 = i2 + 81;
            f3312 = i5 % 128;
            int i6 = i5 % 2;
            if (this.f3313.containsKey(webView)) {
                return;
            }
            com.ironsource.adqualitysdk.sdk.i.kd m8341 = com.ironsource.adqualitysdk.sdk.i.kd.m8341(webView, m8715(android.text.TextUtils.getCapsMode("", 0, 0) + 9, false, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 210, "ￛ\r\u0010\u000f\u0018\u000e\u0017￦ￛ", android.graphics.Color.red(0) + 1).intern());
            if (this.f3317 == null) {
                this.f3317 = m8341;
            }
            this.f3313.put(webView, m8341);
            com.ironsource.adqualitysdk.sdk.i.jy m8724 = m8724();
            this.f3314.add(m8724);
            m8341.m8345(m8724);
            m8716(webView);
            webView.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = f3310 + 79;
        int i11 = i10 % 128;
        f3312 = i11;
        int i12 = i10 % 2;
        try {
            if (view instanceof android.webkit.WebView) {
                int i13 = i11 + 115;
                f3310 = i13 % 128;
                if (i13 % 2 != 0) {
                    android.webkit.WebView webView = (android.webkit.WebView) view;
                    if (this.f3313.containsKey(webView)) {
                        m8716(webView);
                        return;
                    }
                    return;
                }
                this.f3313.containsKey((android.webkit.WebView) view);
                throw null;
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8715(android.graphics.Color.blue(0) + 16, true, 223 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7\u0003￠\u0016\u0004", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 6).intern(), m8715(23 - android.graphics.Color.alpha(0), true, 222 - android.view.KeyEvent.keyCodeFromString(""), "\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0006\r\u0000\u0007￢\u0013\u0014\u000e", android.widget.ExpandableListView.getPackedPositionType(0L) + 14).intern(), th, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8730(java.util.List<android.webkit.WebView> list) {
        int i = 2 % 2;
        int i2 = f3310 + 51;
        f3312 = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (list != null) {
            java.util.Iterator<android.webkit.WebView> it = list.iterator();
            while (it.hasNext()) {
                m8733(it.next());
                int i3 = f3312 + 89;
                f3310 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.z$3, reason: invalid class name */
    final class AnonymousClass3 implements com.ironsource.adqualitysdk.sdk.i.jy {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3321 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f3322 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static byte[] f3323 = {-53, 37, -38, 37, -54, 37, -53, 51, -50, 49, -34, 49, -56, 108, -121, -54, 2, -16, com.google.common.base.Ascii.CR, -5, -54, 78, -72, -72, -76};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f3324 = null;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f3325 = -994685928;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f3326 = -1935763430;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f3327 = 59;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f3328 = -3430038402762217348L;

        AnonymousClass3() {
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ void m8735(com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3 anonymousClass3, android.webkit.WebView webView, java.lang.String str, boolean z) {
            int i = 2 % 2;
            int i2 = f3322 + 89;
            f3321 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass3.m8737(webView, str, z);
            int i4 = f3322 + 87;
            f3321 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﻛ */
        public final void mo8318(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
            int i = 2 % 2;
            java.lang.String substring = str2.substring(0, str2.indexOf(63));
            java.lang.String substring2 = str2.substring(str2.indexOf(63) + 1);
            if (substring.equals(m8738("\ue80f鉵᳤蝨ǩ豨", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 31357).intern())) {
                com.ironsource.adqualitysdk.sdk.i.z.m8722(com.ironsource.adqualitysdk.sdk.i.z.this, webView);
                return;
            }
            if (substring.equals(m8736((short) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 1), 994686043 - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.lastIndexOf("", '0', 0, 0) - 59, 1935763430 - (android.os.Process.myPid() >> 22), (byte) (36 - android.view.View.combineMeasuredStates(0, 0))).intern())) {
                int i2 = f3321 + 69;
                f3322 = i2 % 128;
                if (i2 % 2 != 0) {
                    org.json.JSONObject m8719 = com.ironsource.adqualitysdk.sdk.i.z.m8719(substring2);
                    com.ironsource.adqualitysdk.sdk.i.z zVar = com.ironsource.adqualitysdk.sdk.i.z.this;
                    zVar.m8731(m8719, webView, (android.webkit.WebView) zVar.mo5772(webView));
                    return;
                } else {
                    org.json.JSONObject m87192 = com.ironsource.adqualitysdk.sdk.i.z.m8719(substring2);
                    com.ironsource.adqualitysdk.sdk.i.z zVar2 = com.ironsource.adqualitysdk.sdk.i.z.this;
                    zVar2.m8731(m87192, webView, (android.webkit.WebView) zVar2.mo5772(webView));
                    int i3 = 92 / 0;
                    return;
                }
            }
            if (!(!substring.equals(m8738("\ue80f⇣篈뗞쾱ᦊ", android.text.TextUtils.lastIndexOf("", '0', 0) + 51692).intern()))) {
                org.json.JSONObject m87193 = com.ironsource.adqualitysdk.sdk.i.z.m8719(substring2);
                com.ironsource.adqualitysdk.sdk.i.z zVar3 = com.ironsource.adqualitysdk.sdk.i.z.this;
                zVar3.mo5818(m87193, webView, com.ironsource.adqualitysdk.sdk.i.z.m8718(zVar3), com.ironsource.adqualitysdk.sdk.i.z.this.mo5772(webView));
                int i4 = f3322 + 65;
                f3321 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            if (substring.equals(m8738("\ue80f㹩䓜欼놙쟺", android.graphics.ImageFormat.getBitsPerPixel(0) + 54882).intern())) {
                org.json.JSONObject m87194 = com.ironsource.adqualitysdk.sdk.i.z.m8719(substring2);
                m87194.remove(com.ironsource.adqualitysdk.sdk.i.is.f2639);
                com.ironsource.adqualitysdk.sdk.i.z zVar4 = com.ironsource.adqualitysdk.sdk.i.z.this;
                zVar4.mo5823(m87194, webView, zVar4.mo5772(webView));
                return;
            }
            if (!(!substring.equals(m8736((short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 994686043 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-59) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1935763435 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (byte) (48 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).intern()))) {
                org.json.JSONObject m87195 = com.ironsource.adqualitysdk.sdk.i.z.m8719(substring2);
                com.ironsource.adqualitysdk.sdk.i.kl.m8453(m87195.optString(m8736((short) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 994686044 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (-61) - android.text.TextUtils.lastIndexOf("", '0'), android.os.Process.getGidForName("") + 1935763443, (byte) (105 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0))).intern()), m87195.optString(m8736((short) android.text.TextUtils.getOffsetAfter("", 0), 994686028 - android.view.MotionEvent.axisFromString(""), (-60) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1935763445 - android.view.View.resolveSize(0, 0), (byte) ((-10) - android.text.TextUtils.indexOf("", "", 0, 0))).intern()), m87195.optString(m8738("\ue819曥\uf5c9䓒펴⊎", 36586 - android.text.TextUtils.lastIndexOf("", '0', 0)).intern()), m87195.optString(m8736((short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 994686029, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 60, 1935763451 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 71)).intern()));
                int i6 = f3321 + 73;
                f3322 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﾒ */
        public final void mo8319(final android.webkit.WebView webView, final java.lang.String str, final boolean z) {
            int i = 2 % 2;
            com.ironsource.adqualitysdk.sdk.i.p.m8549(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.5
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5825() {
                    if (com.ironsource.adqualitysdk.sdk.i.z.m8721(com.ironsource.adqualitysdk.sdk.i.z.this)) {
                        if (com.ironsource.adqualitysdk.sdk.i.z.m8725(com.ironsource.adqualitysdk.sdk.i.z.this) == null || com.ironsource.adqualitysdk.sdk.i.z.m8725(com.ironsource.adqualitysdk.sdk.i.z.this).isEmpty()) {
                            com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3.m8735(com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3.this, webView, str, z);
                            return;
                        }
                        java.util.Iterator it = com.ironsource.adqualitysdk.sdk.i.z.m8725(com.ironsource.adqualitysdk.sdk.i.z.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((java.lang.String) it.next())) {
                                com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3.m8735(com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3.this, webView, str, z);
                                return;
                            }
                        }
                    }
                }
            });
            int i2 = f3322 + 33;
            f3321 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﻐ */
        public final void mo8316(android.webkit.WebView webView) {
            int i = 2 % 2;
            int i2 = f3321 + 49;
            f3322 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.z.m8722(com.ironsource.adqualitysdk.sdk.i.z.this, webView);
            int i4 = f3322 + 105;
            f3321 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private void m8737(final android.webkit.WebView webView, final java.lang.String str, final boolean z) {
            int i = 2 % 2;
            com.ironsource.adqualitysdk.sdk.i.p.m8546(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5825() {
                    final java.lang.String originalUrl = webView.getOriginalUrl();
                    final java.lang.Object mo5772 = com.ironsource.adqualitysdk.sdk.i.z.this.mo5772(webView);
                    com.ironsource.adqualitysdk.sdk.i.p.m8549(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.2.4

                        /* renamed from: ﮐ, reason: contains not printable characters */
                        private static int f3334 = 1;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3335 = 0;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f3336 = 41;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5825() {
                            int i2 = 2 % 2;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            try {
                                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2630, str);
                                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2632, m8739(android.text.TextUtils.getTrimmedLength("") + 3, true, 154 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\ufff3\u0006\u0007", (android.os.Process.myTid() >> 22) + 3).intern());
                                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2641, originalUrl);
                                if (z) {
                                    int i3 = f3334 + 121;
                                    f3335 = i3 % 128;
                                    jSONObject.put(i3 % 2 != 0 ? com.ironsource.adqualitysdk.sdk.i.is.f2642 : com.ironsource.adqualitysdk.sdk.i.is.f2642, true);
                                }
                            } catch (org.json.JSONException e) {
                                java.lang.String intern = m8739(16 - android.text.TextUtils.getOffsetBefore("", 0), false, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "\u0000\r\u0003\u000b\u0004\u0011\ufff6\u0004\u0001\ufff5\b\u0004\u0016￠\u0003\uffe7", android.graphics.Color.blue(0) + 6).intern();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(m8739(android.view.View.getDefaultSize(0, 0) + 27, false, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 134, "\u000f\f\u0006\u000eￃ\r\u0016\u0012\u0011\uffddￃ￨\u0015\u0015\u0012\u0015ￃ\u0006\u0015\b\u0004\u0017\f\u0011\nￃ\u0006", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern());
                                sb.append(e.getLocalizedMessage());
                                com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
                            }
                            com.ironsource.adqualitysdk.sdk.i.z.this.mo5821(jSONObject, webView, com.ironsource.adqualitysdk.sdk.i.z.m8718(com.ironsource.adqualitysdk.sdk.i.z.this), mo5772);
                        }

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static java.lang.String m8739(int i2, boolean z2, int i3, java.lang.String str2, int i4) {
                            java.lang.String str3;
                            char[] cArr = str2;
                            if (str2 != null) {
                                cArr = str2.toCharArray();
                            }
                            char[] cArr2 = cArr;
                            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
                                char[] cArr3 = new char[i2];
                                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i2) {
                                    com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                                    cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i3);
                                    int i5 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                                    cArr3[i5] = (char) (cArr3[i5] - f3336);
                                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                                }
                                if (i4 > 0) {
                                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = i4;
                                    char[] cArr4 = new char[i2];
                                    java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
                                    java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                                    java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i2 - com.ironsource.adqualitysdk.sdk.i.d.f1652);
                                }
                                if (z2) {
                                    char[] cArr5 = new char[i2];
                                    com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                                    while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i2) {
                                        cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i2 - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                                        com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                                    }
                                    cArr3 = cArr5;
                                }
                                str3 = new java.lang.String(cArr3);
                            }
                            return str3;
                        }
                    });
                }
            });
            int i2 = f3321 + 23;
            f3322 = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﻛ */
        public final void mo8317(android.webkit.WebView webView, java.lang.String str) {
            int i = 2 % 2;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2638, str);
                jSONObject.put(com.ironsource.adqualitysdk.sdk.i.is.f2633, com.ironsource.adqualitysdk.sdk.i.is.f2636);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.ironsource.adqualitysdk.sdk.i.is.f2640, jSONObject);
                com.ironsource.adqualitysdk.sdk.i.z zVar = com.ironsource.adqualitysdk.sdk.i.z.this;
                zVar.mo5824(jSONObject2, webView, this, zVar.mo5772(webView));
                int i2 = f3321 + 103;
                f3322 = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8738("\ue82b襒⪈쯋洹\u0e6e꿉䄰\ue240莗⓳옫果ᣟ먃孫", android.view.View.MeasureSpec.getSize(0) + 24907).intern(), m8738("\ue839珋\udf84㭜蜚\ue285亁ꩭ㘱釰ﶺ奢ꔮĚ沚좀呏뀊ᮆ枆썮⼰諼ᚻ爤\ude2b㨍藔\ue19e", android.text.AndroidCharacter.getMirror('0') + 39829).intern(), (java.lang.Throwable) e, false);
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static java.lang.String m8738(java.lang.String str, int i) {
            java.lang.String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
                com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
                char[] cArr3 = new char[cArr2.length];
                com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                    cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f3328);
                    com.ironsource.adqualitysdk.sdk.i.i.f2463++;
                }
                str2 = new java.lang.String(cArr3);
            }
            return str2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static java.lang.String m8736(short s, int i, int i2, int i3, byte b) {
            java.lang.String obj;
            synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = f3327;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f3323;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f3326 + i3] + i4);
                    } else {
                        i5 = (short) (f3324[f3326 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f3326 + i6;
                    com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                    com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f3325);
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                    while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                        byte[] bArr2 = f3323;
                        if (bArr2 != null) {
                            int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                            com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                            com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                        } else {
                            short[] sArr = f3324;
                            int i8 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                            com.ironsource.adqualitysdk.sdk.i.n.f3100 = i8 - 1;
                            com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((short) (sArr[i8] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                        }
                        sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                        com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                        com.ironsource.adqualitysdk.sdk.i.n.f3099++;
                    }
                }
                obj = sb.toString();
            }
            return obj;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jy m8724() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3 anonymousClass3 = new com.ironsource.adqualitysdk.sdk.i.z.AnonymousClass3();
        int i2 = f3310 + 69;
        f3312 = i2 % 128;
        if (i2 % 2 == 0) {
            return anonymousClass3;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8716(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3310 + 41;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.kd kdVar = this.f3313.get(webView);
        if (!this.f3316) {
            return;
        }
        int i4 = f3310 + 109;
        f3312 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
            if (!kdVar.m8343()) {
                return;
            }
        } else if (!kdVar.m8343()) {
            return;
        }
        if (!com.ironsource.adqualitysdk.sdk.i.ko.m8481(webView)) {
            int i6 = f3312 + 107;
            f3310 = i6 % 128;
            int i7 = i6 % 2;
            kdVar.m8344();
        }
        m8726(webView);
        int i8 = f3310 + 3;
        f3312 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m8726(android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3310 + 7;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        this.f3315.m8326(webView);
        int i4 = f3310 + 79;
        f3312 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static org.json.JSONObject m8720(java.lang.String str) {
        java.lang.String decode;
        int i = 2 % 2;
        int i2 = f3312 + 25;
        f3310 = i2 % 128;
        int i3 = i2 % 2;
        try {
            decode = java.net.URLDecoder.decode(str, m8715(4 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), true, 193 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0002\u0010\u0011\ufff4￩", 3 - android.view.View.resolveSize(0, 0)).intern());
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8715(17 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, android.view.View.MeasureSpec.getMode(0) + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7\u0003￠\u0016\u0004", android.graphics.Color.green(0) + 5).intern(), m8715((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 18, false, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "\uffbf\u0006\u0004\u0013\u0013\b\r\u0006\uffbf\u0003\u0000\u0013\u0000￤\u0011\u0011\u000e\u0011", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 13).intern(), e);
        }
        if (!android.text.TextUtils.isEmpty(decode)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(decode);
            int i4 = f3310 + 7;
            f3312 = i4 % 128;
            if (i4 % 2 == 0) {
                return jSONObject;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = f3310 + 67;
        f3312 = i5 % 128;
        int i6 = i5 % 2;
        return new org.json.JSONObject();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8734(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3310;
        int i3 = i2 + 49;
        f3312 = i3 % 128;
        int i4 = i3 % 2;
        this.f3319 = str;
        int i5 = i2 + 81;
        f3312 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* renamed from: ﾒ */
    public final java.lang.String mo5815(T t) {
        int i = 2 % 2;
        int i2 = f3310;
        int i3 = i2 + 5;
        f3312 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.f3319;
        int i4 = i2 + 79;
        f3312 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8727(org.json.JSONObject jSONObject, android.webkit.WebView webView) {
        int i = 2 % 2;
        int i2 = f3310 + 27;
        f3312 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (webView != null) {
            try {
                java.lang.String str = com.ironsource.adqualitysdk.sdk.i.is.f2599;
                boolean z = false;
                if (webView.getWindowToken() != null) {
                    int i3 = f3312 + 79;
                    f3310 = i3 % 128;
                    if (i3 % 2 != 0) {
                        z = true;
                    }
                } else {
                    int i4 = f3310 + 5;
                    f3312 = i4 % 128;
                    int i5 = i4 % 2;
                }
                jSONObject.put(str, z);
                int i6 = f3310 + 109;
                f3312 = i6 % 128;
                int i7 = i6 % 2;
                return;
            } catch (org.json.JSONException unused) {
            }
        }
        int i8 = f3312 + 57;
        f3310 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8731(org.json.JSONObject jSONObject, android.webkit.WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f3310 + 109;
        f3312 = i2 % 128;
        int i3 = i2 % 2;
        m8727(jSONObject, webView);
        super.mo5820(jSONObject, webView, t);
        int i4 = f3312 + 79;
        f3310 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8723(org.json.JSONObject jSONObject, android.webkit.WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f3312 + 87;
        f3310 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObject.remove(com.ironsource.adqualitysdk.sdk.i.is.f2639);
            super.mo5817(jSONObject, webView, t);
            int i3 = f3310 + 17;
            f3312 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        jSONObject.remove(com.ironsource.adqualitysdk.sdk.i.is.f2639);
        super.mo5817(jSONObject, webView, t);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8715(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f3311);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
