package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jg extends android.content.BroadcastReceiver {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2706 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2707 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String f2708;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2709;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private android.content.Context f2710;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2711 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.Set<com.ironsource.adqualitysdk.sdk.i.jb> f2712 = new java.util.HashSet();

    /* renamed from: ﻏ, reason: contains not printable characters */
    static void m8146() {
        f2709 = 189;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8150(com.ironsource.adqualitysdk.sdk.i.jg jgVar, android.content.Context context) {
        int i = 2 % 2;
        int i2 = f2706 + 3;
        f2707 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8149 = m8149(context);
        int i4 = f2706 + 3;
        f2707 = i4 % 128;
        int i5 = i4 % 2;
        return m8149;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ java.lang.String m8151() {
        int i = 2 % 2;
        int i2 = f2707 + 111;
        int i3 = i2 % 128;
        f2706 = i3;
        int i4 = i2 % 2;
        java.lang.String str = f2708;
        int i5 = i3 + 51;
        f2707 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8153(com.ironsource.adqualitysdk.sdk.i.jg jgVar, boolean z) {
        int i = 2 % 2;
        int i2 = f2706 + 27;
        f2707 = i2 % 128;
        int i3 = i2 % 2;
        jgVar.m8152(z);
        int i4 = f2706 + 3;
        f2707 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    static {
        m8146();
        f2708 = m8148(android.text.TextUtils.lastIndexOf("", '0') + 21, true, 293 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "�\f\ufff9\f￫\u0003\n\u0007\u000f\f�￦\n�\u000e\u0001�\ufffb�￪", 12 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        int i = f2706 + 85;
        f2707 = i % 128;
        int i2 = i % 2;
    }

    public jg(android.content.Context context) {
        this.f2710 = context.getApplicationContext();
        com.ironsource.adqualitysdk.sdk.i.m.m8517(f2708, m8148(android.text.TextUtils.indexOf("", "", 0) + 30, true, 285 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\t\u0005\u0003\u0005\u0012\uffc0\u0014\u0013\u0001\u0003\u0004\u0001\u000f\u0012\u0002\uffc0\u0010\u0015\uffc0\u0007\u000e\t\u0014\u0014\u0005\ufff3ￎ\u0012\u0005\u0016", 26 - android.graphics.Color.red(0)).intern());
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(m8148((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, true, android.os.Process.getGidForName("") + 275, "\uffff\ufff4\u0001\ufff4\uffff￮\ufff0\ufff9\ufff9\ufffa￮\uffd9\u0019\u0019\u001a\u000e\uffd9\u001f\u0010\u0019\uffd9\u000f\u0014\u001a\u001d\u000f\u0019\f\ufff0\ufff2\ufff9￬\ufff3￮\n\u0004", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28).intern());
        this.f2710.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8158() {
        int i = 2 % 2;
        int i2 = f2707 + 109;
        f2706 = i2 % 128;
        int i3 = i2 % 2;
        this.f2710.unregisterReceiver(this);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m8157(com.ironsource.adqualitysdk.sdk.i.jb jbVar) {
        int i = 2 % 2;
        int i2 = f2707 + 99;
        f2706 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            this.f2712.add(jbVar);
            throw null;
        }
        this.f2712.add(jbVar);
        int i3 = f2707 + 117;
        f2706 = i3 % 128;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m8159(com.ironsource.adqualitysdk.sdk.i.jb jbVar) {
        int i = 2 % 2;
        int i2 = f2706 + 27;
        f2707 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f2712.remove(jbVar);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2712.remove(jbVar);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private synchronized java.util.Set<com.ironsource.adqualitysdk.sdk.i.jb> m8145() {
        java.util.HashSet hashSet;
        int i = 2 % 2;
        hashSet = new java.util.HashSet(this.f2712);
        int i2 = f2706 + 23;
        f2707 = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8154() {
        int i = 2 % 2;
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jb> it = m8145().iterator();
        while (it.hasNext()) {
            int i2 = f2707 + 55;
            f2706 = i2 % 128;
            int i3 = i2 % 2;
            it.next().mo5978();
        }
        int i4 = f2706 + 9;
        f2707 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8156() {
        int i = 2 % 2;
        int i2 = f2706 + 111;
        f2707 = i2 % 128;
        int i3 = i2 % 2;
        java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jb> it = m8145().iterator();
        while (!(!it.hasNext())) {
            it.next();
        }
        int i4 = f2707 + 51;
        f2706 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final android.content.Context context, final android.content.Intent intent) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.p.m8549(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f2713 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f2714 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2715 = {14198, 6651, 27255, 48355, 36208, 57332, 8319, 29367, 17257, 38368, 58999, 51375, 6508, 27618, 48229, 36583, 57113, 8694, 29308, 17663, 38257, 59384, 51320, 6893, 27502, 48627, 36458, 53493, 8566, 29682, 17512, 38625, 59158, 51611, 6676, 27796, 21898, 31523, 2228, 56885, 61347, 48444, 17059, 4202, 8631, 63289, 33982, 43580, 31673, 2365, 57004, 60467, 48530, 17167, 4244, 9755, 63436, 34061, 43648, 30731, 2458, 57105, 60565, 'n', 12013, 23879, 35817, 47718, 59620, 5993, 17901, 29796, 41723, 53602, 65535, 11884, 23779, 'T', 12010, 23905, 35828, 47725, 59565, 6015, 17838, 29822, 41725, 53556, 65528, 11901, 23790, 35691, 47601, 59474, 5833, 17668, 29637, 41543, 53444, 65346, 11723, 23635, 35526, 47453, 59328, 5713, 17614, 29509, 31103, 22474, 9292, 62163, 49984, 37264, 28255, 15578, 3338, 56263, 43072, 34558, 22343, 9667, 62019, 49357, 37228, 28669};

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f2716 = 8260748659738685058L;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                int i2 = 2 % 2;
                int i3 = f2713 + 15;
                f2714 = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        if (!intent.getAction().equals(m8160((char) (8465 >> (android.view.ViewConfiguration.getFadingEdgeLength() >> 51)), android.text.TextUtils.indexOf("", "", 1, 1), 13 >> (android.view.ViewConfiguration.getScrollDefaultDelay() >> 47)).intern())) {
                            return;
                        }
                    } else if (!intent.getAction().equals(m8160((char) (14103 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), android.text.TextUtils.indexOf("", "", 0, 0), 36 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                        return;
                    }
                    int i4 = f2713 + 59;
                    f2714 = i4 % 128;
                    int i5 = i4 % 2;
                    com.ironsource.adqualitysdk.sdk.i.m.m8516(com.ironsource.adqualitysdk.sdk.i.jg.m8151(), m8160((char) (21956 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.view.KeyEvent.normalizeMetaState(0) + 36, android.os.Process.getGidForName("") + 28).intern());
                    if (!intent.getBooleanExtra(m8160((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.view.MotionEvent.axisFromString("") + 64, 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), false)) {
                        if (com.ironsource.adqualitysdk.sdk.i.jg.m8150(com.ironsource.adqualitysdk.sdk.i.jg.this, context)) {
                            com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.4
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5825() {
                                    com.ironsource.adqualitysdk.sdk.i.jg.m8153(com.ironsource.adqualitysdk.sdk.i.jg.this, true);
                                    com.ironsource.adqualitysdk.sdk.i.jg.this.m8154();
                                }
                            });
                            return;
                        } else {
                            com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5825() {
                                    com.ironsource.adqualitysdk.sdk.i.jg.m8153(com.ironsource.adqualitysdk.sdk.i.jg.this, false);
                                    com.ironsource.adqualitysdk.sdk.i.jg.this.m8156();
                                }
                            });
                            return;
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.m.m8516(com.ironsource.adqualitysdk.sdk.i.jg.m8151(), m8160((char) android.text.TextUtils.indexOf("", "", 0), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 78, 31 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                    com.ironsource.adqualitysdk.sdk.i.p.m8551(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5825() {
                            com.ironsource.adqualitysdk.sdk.i.jg.this.m8156();
                            com.ironsource.adqualitysdk.sdk.i.jg.m8153(com.ironsource.adqualitysdk.sdk.i.jg.this, false);
                        }
                    });
                    int i6 = f2713 + 3;
                    f2714 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (java.lang.Exception e) {
                    com.ironsource.adqualitysdk.sdk.i.kl.m8455(com.ironsource.adqualitysdk.sdk.i.jg.m8151(), m8160((char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 31035), android.view.MotionEvent.axisFromString("") + 109, 18 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), (java.lang.Throwable) e, false);
                }
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static java.lang.String m8160(char c, int i2, int i3) {
                java.lang.String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
                    char[] cArr = new char[i3];
                    com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i3) {
                        cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2715[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i2] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2716)) ^ c);
                        com.ironsource.adqualitysdk.sdk.i.c.f1208++;
                    }
                    str = new java.lang.String(cArr);
                }
                return str;
            }
        });
        int i2 = f2706 + 23;
        f2707 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m8155() {
        boolean z;
        int i = 2 % 2;
        int i2 = f2707 + 73;
        int i3 = i2 % 128;
        f2706 = i3;
        int i4 = i2 % 2;
        z = this.f2711;
        int i5 = i3 + 35;
        f2707 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m8152(boolean z) {
        int i = 2 % 2;
        int i2 = f2707;
        int i3 = i2 + 15;
        f2706 = i3 % 128;
        if (i3 % 2 != 0) {
            this.f2711 = z;
            int i4 = 17 / 0;
        } else {
            this.f2711 = z;
        }
        int i5 = i2 + 27;
        f2706 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m8149(android.content.Context context) {
        int i = 2 % 2;
        int i2 = f2707 + 51;
        f2706 = i2 % 128;
        if (i2 % 2 == 0) {
            android.net.NetworkInfo m8147 = m8147(context);
            if (m8147 == null || !m8147.isConnected()) {
                int i3 = f2706 + 79;
                f2707 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 61 / 0;
                }
                return false;
            }
            java.lang.String str = f2708;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8148(android.text.TextUtils.lastIndexOf("", '0', 0) + 9, true, 286 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\uffbf\n\u0011\u000e\u0016\u0013\u0004￭", android.graphics.Color.blue(0) + 8).intern());
            sb.append(m8147.getTypeName());
            sb.append(m8148(10 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), true, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 281, "\u0012\u0006ￃ\uffd1\u0007\b\u0017\u0006\b\u0011\u0011", android.view.View.getDefaultSize(0, 0) + 3).intern());
            com.ironsource.adqualitysdk.sdk.i.m.m8516(str, sb.toString());
            return true;
        }
        m8147(context);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static android.net.NetworkInfo m8147(android.content.Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = f2706 + 9;
            f2707 = i2 % 128;
            return ((android.net.ConnectivityManager) context.getSystemService((i2 % 2 == 0 ? m8148(77 << (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 3911 >> android.widget.ExpandableListView.getPackedPositionType(0L), "\ufff6\f\u0007￼\t￼\u0007\ufff6\ufff8\u0001\u0001\u0002", 1 >> (android.view.ViewConfiguration.getLongPressTimeout() + 6)) : m8148(13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 298 - android.widget.ExpandableListView.getPackedPositionType(0L), "\ufff6\f\u0007￼\t￼\u0007\ufff6\ufff8\u0001\u0001\u0002", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1)).intern())).getActiveNetworkInfo();
        }
        int i3 = f2706 + 37;
        f2707 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8148(int i, boolean z, int i2, java.lang.String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2709);
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
