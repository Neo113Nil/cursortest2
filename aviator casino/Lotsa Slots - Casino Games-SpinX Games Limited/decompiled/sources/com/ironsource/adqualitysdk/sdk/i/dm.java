package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dm {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1794 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1795;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private java.lang.String f1797;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.ISAdQualityAdType f1798;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.util.List<java.lang.String> f1799;

    /* renamed from: ｋ, reason: contains not printable characters */
    private org.json.JSONObject f1800;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String f1801;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String f1802;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1796 = {25984, 28912, 20350, 9702, 4906, 1618, 14821, 21317, 18127, 30815, 'p', 5404, 10888, 16406, 21913, 27394, 41070, 46353, 35457, 57361, 62861, 51991, 8341, 13837, 2946, 24857, 45426, 42000, 39835, 61700, 58550, 55836, 12678, 10011, 6793, 28691, 'w', 5400, 10904, 16417, 21917, 27412, 32921, 38424, 43951, 49408, 54934, 60459, 441, 5931};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f1793 = 1989832669443659133L;

    public dm(org.json.JSONObject jSONObject) {
        this.f1798 = com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.UNKNOWN;
        this.f1802 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONObject.optString(m7581((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26099), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1, 4 - android.graphics.Color.green(0)).intern()));
        java.lang.String m7682 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONObject.optString(m7581((char) (4940 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 4 - android.view.View.resolveSize(0, 0), 6 - android.graphics.Color.alpha(0)).intern()));
        if (!android.text.TextUtils.isEmpty(m7682)) {
            this.f1798 = com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.fromInt(java.lang.Integer.parseInt(m7682));
        }
        this.f1800 = jSONObject.optJSONObject(m7581((char) android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, 6 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        this.f1799 = com.ironsource.adqualitysdk.sdk.i.kj.m8413(jSONObject, m7581((char) (40976 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 15 - android.graphics.ImageFormat.getBitsPerPixel(0), android.view.MotionEvent.axisFromString("") + 11).intern(), new java.util.ArrayList());
        this.f1801 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONObject.optString(m7581((char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 45316), 25 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 10).intern()));
        this.f1797 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONObject.optString(m7581((char) android.view.Gravity.getAbsoluteGravity(0, 0), 36 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14).intern()));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.lang.String m7586() {
        int i = 2 % 2;
        int i2 = f1795 + 81;
        int i3 = i2 % 128;
        f1794 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f1802;
        int i5 = i3 + 107;
        f1795 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.ISAdQualityAdType m7585() {
        int i = 2 % 2;
        int i2 = f1795 + 115;
        f1794 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1798;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final org.json.JSONObject m7584() {
        int i = 2 % 2;
        int i2 = f1794;
        int i3 = i2 + 61;
        f1795 = i3 % 128;
        int i4 = i3 % 2;
        org.json.JSONObject jSONObject = this.f1800;
        int i5 = i2 + 91;
        f1795 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m7587() {
        int i = 2 % 2;
        int i2 = f1794;
        int i3 = i2 + 1;
        f1795 = i3 % 128;
        int i4 = i3 % 2;
        java.util.List<java.lang.String> list = this.f1799;
        int i5 = i2 + 31;
        f1795 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.String m7583() {
        int i = 2 % 2;
        int i2 = f1794 + 7;
        int i3 = i2 % 128;
        f1795 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f1801;
        int i5 = i3 + 57;
        f1794 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final java.lang.String m7582() {
        int i = 2 % 2;
        int i2 = f1794 + 11;
        int i3 = i2 % 128;
        f1795 = i3;
        if (i2 % 2 != 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        java.lang.String str = this.f1797;
        int i4 = i3 + 29;
        f1794 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7581(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f1796[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f1793)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
