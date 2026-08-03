package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ao extends com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass5 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f366 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f367 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f368 = 7195623589099981187L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.String m6018() {
        int i = 2 % 2;
        int i2 = f366 + 65;
        f367 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String optString = m6072().optString(m6015("牷좑爒Ŧ콲尀䫜", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1).intern());
        int i4 = f366 + 11;
        f367 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return optString;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.Object m6016(java.lang.String str) {
        int i = 2 % 2;
        org.json.JSONObject m6017 = m6017();
        if (m6017 == null) {
            int i2 = f367 + 73;
            f366 = i2 % 128;
            java.lang.Object obj = null;
            if (i2 % 2 != 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        java.lang.Object opt = m6017.opt(str);
        int i3 = f367 + 55;
        f366 = i3 % 128;
        int i4 = i3 % 2;
        return opt;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final org.json.JSONObject m6017() {
        org.json.JSONObject m6072;
        int maximumFlingVelocity;
        int i = 2 % 2;
        int i2 = f366 + 57;
        f367 = i2 % 128;
        if (i2 % 2 != 0) {
            m6072 = m6072();
            maximumFlingVelocity = (android.view.ViewConfiguration.getMaximumFlingVelocity() / 109) + 1;
        } else {
            m6072 = m6072();
            maximumFlingVelocity = 1 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        }
        return m6072.optJSONObject(m6015("た㟦〫︗H譣ᘧ錯힃\ud81a", maximumFlingVelocity).intern());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m6015(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f368, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f368));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
