package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dp {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1814 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f1815 = 44506;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1816 = 28523;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1817 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f1818 = 63272;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f1819 = 27121;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f1820;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.String f1821;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.String f1822;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1823;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String f1824;

    public dp(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1820 = jSONObject.optString(m7592("銺㝐ㄫគ阴⳹\uded6䯪", 7 - android.text.TextUtils.getCapsMode("", 0, 0)).intern());
            this.f1822 = jSONObject.optString(m7592("앏饆\uf6b8燄ꝱ냅", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5).intern());
            this.f1821 = jSONObject.optString(m7592("炐痐碔뀕遏⌺", 5 - android.graphics.Color.alpha(0)).intern());
            this.f1824 = jSONObject.optString(m7592("弈罃첊꾬㋆߈\ue6cfꨢ", android.graphics.Color.green(0) + 7).intern());
            this.f1823 = jSONObject.optBoolean(m7592("뜔\ud97c\uf749\ue7c1嚜锾்杳࣎꛲", 10 - android.text.TextUtils.getOffsetAfter("", 0)).intern());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String m7594() {
        int i = 2 % 2;
        int i2 = f1817;
        int i3 = i2 + 83;
        f1814 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f1820;
        int i5 = i2 + 5;
        f1814 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m7595() {
        int i = 2 % 2;
        int i2 = f1817 + 125;
        int i3 = i2 % 128;
        f1814 = i3;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        java.lang.String str = this.f1822;
        int i4 = i3 + 19;
        f1817 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.String m7597() {
        int i = 2 % 2;
        int i2 = f1817;
        int i3 = i2 + 45;
        f1814 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f1821;
        int i5 = i2 + 107;
        f1814 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.String m7593() {
        java.lang.String str;
        int i = 2 % 2;
        int i2 = f1817 + 25;
        int i3 = i2 % 128;
        f1814 = i3;
        if (i2 % 2 == 0) {
            str = this.f1824;
            int i4 = 65 / 0;
        } else {
            str = this.f1824;
        }
        int i5 = i3 + 77;
        f1817 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7596() {
        int i = 2 % 2;
        int i2 = f1814;
        int i3 = i2 + 65;
        f1817 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1823;
        int i5 = i2 + 101;
        f1817 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7592(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1819)) ^ ((c2 >>> 5) + f1815)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1818) ^ ((c3 + i2) ^ ((c3 << 4) + f1816))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
