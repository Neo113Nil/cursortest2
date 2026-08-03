package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gg extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2196 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2197 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2198 = -1404568807357103665L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2196 + 119;
        f2197 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7797("磸䆽꺌喯碛耝⵿წ羭裄\u2439ᥨ盳醕㳯ظ洯陛㟰\u0eef摬齳\u0e77㞓岸ꐯल㱏口곮ǡ╔䨯떪ᢥⶐ䅑멠\u139d⪌㦷䌹橃퍔ッ䯿攻\ud80e㜽傫緟샂⹁奖璛", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1).intern();
        int i4 = f2196 + 29;
        f2197 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2196 + 109;
        int i3 = i2 % 128;
        f2197 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        f2196 = i5 % 128;
        int i6 = i5 % 2;
        return com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bf bfVar = new com.ironsource.adqualitysdk.sdk.i.bf(mo7794());
        int i2 = f2196 + 49;
        f2197 = i2 % 128;
        int i3 = i2 % 2;
        return bfVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int keyRepeatTimeout;
        int i = 2 % 2;
        int i2 = f2196 + 83;
        f2197 = i2 % 128;
        if (i2 % 2 == 0) {
            android.view.ViewConfiguration.getKeyRepeatTimeout();
            keyRepeatTimeout = 0;
        } else {
            keyRepeatTimeout = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1;
        }
        java.lang.String intern = m7797("麶톻䎞毝黗တ쁱⻃駢ᣑ줶✑邪Ɩ퇻", keyRepeatTimeout).intern();
        int i3 = f2196 + 125;
        f2197 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7797(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2198, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2198));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
