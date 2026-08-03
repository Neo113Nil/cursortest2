package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ag implements java.lang.Comparable<com.ironsource.adqualitysdk.sdk.i.ag> {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f176 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f177 = null;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f178 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f179 = {118, 4, -107, -119, -118, -99, -106, 0, 0, 0, 0};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f180 = 813367882;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f181 = -1022637897;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f182 = 75;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jn f183;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.ironsource.adqualitysdk.sdk.i.ag agVar) {
        int i = 2 % 2;
        int i2 = f178 + 31;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        int m5882 = m5882(agVar);
        int i4 = f178 + 41;
        f176 = i4 % 128;
        int i5 = i4 % 2;
        return m5882;
    }

    public ag(com.ironsource.adqualitysdk.sdk.i.jn jnVar) {
        this.f183 = jnVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized org.json.JSONObject m5888() {
        org.json.JSONObject m8238;
        int i = 2 % 2;
        int i2 = f176 + 53;
        f178 = i2 % 128;
        if (i2 % 2 == 0) {
            m8238 = this.f183.m8238();
            int i3 = 61 / 0;
        } else {
            m8238 = this.f183.m8238();
        }
        return m8238;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m5887(int i) {
        int i2 = 2 % 2;
        int i3 = f176 + 55;
        f178 = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.f183.m8238() != null) {
                int i4 = f178 + 103;
                f176 = i4 % 128;
                int i5 = i4 % 2;
                com.ironsource.adqualitysdk.sdk.i.kj.m8418(this.f183.m8238(), i, m5881());
            }
        } else {
            this.f183.m8238();
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.util.List<java.lang.String> m5881() {
        int i = 2 % 2;
        int i2 = f178 + 43;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(com.ironsource.adqualitysdk.sdk.i.is.f2608);
        int i4 = f176 + 107;
        f178 = i4 % 128;
        if (i4 % 2 != 0) {
            return asList;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.jn m5883() {
        int i = 2 % 2;
        int i2 = f178 + 105;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f183;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private long m5877() {
        int i = 2 % 2;
        int i2 = f178 + 11;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        long optLong = m5888().optLong(m5880((short) ((-118) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1022638014 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 73, (-813367883) - android.os.Process.getGidForName(""), (byte) (android.view.MotionEvent.axisFromString("") + 1)).intern());
        int i4 = f178 + 99;
        f176 = i4 % 128;
        if (i4 % 2 == 0) {
            return optLong;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private long m5878() {
        int i = 2 % 2;
        int i2 = f178 + 71;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        long optInt = m5888().optInt(m5880((short) (5 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.view.Gravity.getAbsoluteGravity(0, 0) + 1022637998, (-74) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (-813367881) - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1)).intern());
        int i4 = f178 + 115;
        f176 = i4 % 128;
        int i5 = i4 % 2;
        return optInt;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private java.lang.String m5876() {
        java.lang.String m8237;
        int i = 2 % 2;
        int i2 = f178 + 119;
        f176 = i2 % 128;
        if (i2 % 2 != 0) {
            m8237 = this.f183.m8237();
            int i3 = 37 / 0;
        } else {
            m8237 = this.f183.m8237();
        }
        int i4 = f176 + 33;
        f178 = i4 % 128;
        int i5 = i4 % 2;
        return m8237;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.lang.String m5886() {
        int i = 2 % 2;
        int i2 = f178 + 117;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String optString = m5888().optString(m5880((short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 114), 1022638009 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 71, (-813367881) - android.widget.ExpandableListView.getPackedPositionChild(0L), (byte) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        int i4 = f176 + 111;
        f178 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return optString;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m5884() {
        int i = 2 % 2;
        int i2 = f178 + 11;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String optString = m5888().optString(m5880((short) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 94), 1022638014 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 71, android.text.TextUtils.getCapsMode("", 0, 0) - 813367877, (byte) android.graphics.Color.alpha(0)).intern(), null);
        int i4 = f178 + 109;
        f176 = i4 % 128;
        if (i4 % 2 == 0) {
            return optString;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5885(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f176 + 15;
        f178 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m5888().put(m5880((short) (95 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.graphics.ImageFormat.getBitsPerPixel(0) + 1022638015, (android.os.Process.myPid() >> 22) - 72, (-813367876) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) android.graphics.Color.argb(0, 0, 0, 0)).intern(), str);
            int i4 = f176 + 11;
            f178 = i4 % 128;
            int i5 = i4 % 2;
        } catch (org.json.JSONException unused) {
        }
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f176 + 111;
        f178 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m5888 = m5888();
        if (i3 != 0) {
            return m5888.toString();
        }
        m5888.toString();
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i2 = f176 + 61;
        f178 = i2 % 128;
        java.lang.Object obj2 = null;
        if (i2 % 2 == 0) {
            obj.getClass();
            super.hashCode();
            throw null;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        boolean equals = m5876().equals(((com.ironsource.adqualitysdk.sdk.i.ag) obj).m5876());
        int i3 = f178 + 75;
        f176 = i3 % 128;
        if (i3 % 2 == 0) {
            return equals;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f178 + 45;
        f176 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            m5888();
            super.hashCode();
            throw null;
        }
        if (m5888() != null) {
            return m5888().hashCode();
        }
        int i3 = f176 + 59;
        f178 = i3 % 128;
        if (i3 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int m5882(com.ironsource.adqualitysdk.sdk.i.ag agVar) {
        int i = 2 % 2;
        int i2 = f178 + 17;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        long m5877 = m5877();
        long m58772 = agVar.m5877();
        if (m5877 < m58772) {
            int i4 = f178 + 21;
            f176 = i4 % 128;
            int i5 = i4 % 2;
            return -1;
        }
        if (m5877 != m58772) {
            return 1;
        }
        int i6 = f176 + 41;
        f178 = i6 % 128;
        int i7 = i6 % 2;
        return m5879(agVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int m5879(com.ironsource.adqualitysdk.sdk.i.ag agVar) {
        int i = 2 % 2;
        long m5878 = m5878();
        long m58782 = agVar.m5878();
        if (m5878 < m58782) {
            int i2 = f178 + 41;
            f176 = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        if (m5878 != m58782) {
            return 1;
        }
        int i4 = f178 + 3;
        f176 = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m5880(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f182;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f179;
                if (bArr != null) {
                    i5 = (byte) (bArr[f180 + i3] + i4);
                } else {
                    i5 = (short) (f177[f180 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f180 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f181);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f179;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f177;
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
