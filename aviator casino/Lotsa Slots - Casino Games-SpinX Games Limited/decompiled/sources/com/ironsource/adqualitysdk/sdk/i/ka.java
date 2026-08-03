package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class ka {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2968 = 6;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2969 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2970 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2971 = {'l', 'c', 't', io.ktor.util.date.GMTDateParser.SECONDS, 'o', 'p', 'a', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'i', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, io.ktor.util.date.GMTDateParser.MINUTES, 'e', 'n', 'r', 'w', 'v', 'q', '_', 'b', 'A', 'Q', 'y', 'R', 'G', 'E', ' ', 'g', 'j', 'x', io.ktor.util.date.GMTDateParser.ZONE, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, '|', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, '~', com.google.common.base.Ascii.MAX, 128};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2972 = 5266008854105235194L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private android.content.Context f2973;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f2974;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.as f2975;

    public ka(android.content.Context context, com.ironsource.adqualitysdk.sdk.i.as asVar, long j) {
        this.f2973 = context;
        this.f2975 = asVar;
        this.f2974 = j;
        new com.ironsource.adqualitysdk.sdk.i.ha(context);
    }

    /* renamed from: ﾇ */
    public org.json.JSONObject mo5897(org.json.JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws org.json.JSONException {
        org.json.JSONObject jSONObject2;
        int i = 2 % 2;
        int i2 = f2969 + 47;
        f2970 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject == null) {
            jSONObject2 = new org.json.JSONObject();
            int i4 = f2970 + 107;
            f2969 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        org.json.JSONObject m8414 = com.ironsource.adqualitysdk.sdk.i.kj.m8414(jSONObject2);
        m8414.put(m8328("\u0c65ఄ\uedc6\uf34cᡖ첅矨睝◒造", android.text.TextUtils.indexOf("", "", 0, 0)).intern(), this.f2975.m6115());
        java.lang.String m6113 = this.f2975.m6113();
        if (!android.text.TextUtils.isEmpty(m6113)) {
            int i6 = f2969 + 71;
            f2970 = i6 % 128;
            m8414.put(m8328("筝笴쭰헹ᣓ犄╕⸉", i6 % 2 != 0 ? android.graphics.ImageFormat.getBitsPerPixel(1) : android.graphics.ImageFormat.getBitsPerPixel(0) + 1).intern(), m6113);
        }
        if (!(!z2)) {
            int i7 = f2969 + 19;
            f2970 = i7 % 128;
            if (i7 % 2 == 0 ? this.f2974 > 0 : this.f2974 > 1) {
                m8414.put(m8327(android.view.View.resolveSize(0, 0) + 4, "\u0001\u0002\u0003\u0004", (byte) (15 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), this.f2974);
            }
            m8414.put(m8327(5 - (android.os.Process.myPid() >> 22), "\u0002\u0005¡¡\u0092", (byte) (android.text.AndroidCharacter.getMirror('0') + 1)).intern(), this.f2975.m6120());
            m8414.put(m8328("ᐉᑭ墾䘭Ћ㦋몸", android.text.TextUtils.indexOf("", "")).intern(), this.f2975.m6111());
            m8414.put(m8327((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, "\b\tv", (byte) (18 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), this.f2975.m6117());
            m8414.put(m8327(android.view.View.MeasureSpec.getMode(0) + 2, "\r\u0007", (byte) (120 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), this.f2975.m6124());
            m8414.put(m8328("潳漇㎖ⴖ碠\ue03c", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), java.util.Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            m8414.put(m8328("\uec62\uec16弬䆦辣䪮韸눁ᘥ", android.view.View.MeasureSpec.getSize(0)).intern(), com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getSDKVersion());
            m8414.put(m8328("⭷⬃弨必ᘥ", android.view.View.getDefaultSize(0, 0)).intern(), com.ironsource.adqualitysdk.sdk.i.kh.m8386());
            m8414.put(m8327(5 - (android.os.Process.myPid() >> 22), "\u0010\n\n\u0006\u008a", (byte) (android.graphics.Color.green(0) + 30)).intern(), android.os.Build.MODEL);
            m8414.put(m8328("\udf08\udf65♣㣸\ueb75☔ꒆ볠훯潐ꈭ⢭ホ窏\ue34e⹃", android.view.MotionEvent.axisFromString("") + 1).intern(), android.os.Build.MANUFACTURER);
            m8414.put(m8328("\uef39\uef49﹈\ue0de\udda7屒钷擅\ue032妜\ud873È", android.view.ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m8327(7 - android.view.View.resolveSize(0, 0), "\f\u0012\u0007\u000f\u0002\ni", (byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 5)).intern());
            m8414.put(m8328("ꄕꅺ\ueb95\uf51c툨\uefaa暨", android.graphics.Color.alpha(0)).intern(), com.ironsource.adqualitysdk.sdk.i.kf.m8365());
            com.ironsource.adqualitysdk.sdk.i.kh.m8385(this.f2973, m8414);
            com.ironsource.adqualitysdk.sdk.i.kf.m8376(this.f2973, m8414);
            com.ironsource.adqualitysdk.sdk.i.kf.m8363(this.f2973, m8414, z3);
            com.ironsource.adqualitysdk.sdk.i.kf.m8377(m8414);
            com.ironsource.adqualitysdk.sdk.i.kf.m8369(m8414);
            m8414.put(m8327(4 - android.view.View.MeasureSpec.getSize(0), "\r\u000f\t\f", (byte) (52 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).intern(), z);
            com.ironsource.adqualitysdk.sdk.i.kf.m8367(this.f2973, m8414);
            com.ironsource.adqualitysdk.sdk.i.kf.m8374(m8414);
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(this.f2975.m6110());
                jSONObject3.remove(m8327(android.graphics.Color.red(0) + 13, "\u0007\n\u0011\f\u0006\u000e\u000e\b\f\u0017\u0001\u0005\u0093", (byte) (48 - android.text.TextUtils.lastIndexOf("", '0', 0))).intern());
                if (jSONObject3.length() > 0) {
                    int i8 = f2969 + 29;
                    f2970 = i8 % 128;
                    m8414.putOpt(i8 % 2 != 0 ? m8328("䀦䁋\ud8ed왣朗ᨳ윂䚩", android.graphics.Color.green(0)).intern() : m8328("䀦䁋\ud8ed왣朗ᨳ윂䚩", android.graphics.Color.green(0)).intern(), jSONObject3);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.m.m8532(m8327((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 25, "\u0015\u0007\u0013\b\f\u0006\u000e\b\u0016\u0017\n\u0011\b\u0006\u0004\u0003\u001d\u0011\u0011\u0006\f\u0007\u0003\u0005\u009b", (byte) (41 - android.text.TextUtils.getCapsMode("", 0, 0))).intern(), m8327(36 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0019\f\u0010\u0001\u0013\u001f\u0007\n\n\t\u000e\u0018\u001c\u0007\b\u0005\u0007\u0018\n\u0007\u0000\b\u001a\u001c\u0004\u0005\r\u0018\u0003\u0005\u001d\u0007\u0011\t\u000e\u0000", (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45)).intern(), e);
            }
        }
        return m8414;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.as m8329() {
        int i = 2 % 2;
        int i2 = f2970 + 33;
        f2969 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2975;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8328(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2972, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2972));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8327(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f2971;
            char c = f2968;
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
