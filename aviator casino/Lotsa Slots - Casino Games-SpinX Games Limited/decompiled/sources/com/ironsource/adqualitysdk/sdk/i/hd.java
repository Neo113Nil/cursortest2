package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hd extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2318 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2319 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2320 = 4467967161972385851L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2319 + 45;
        f2318 = i2 % 128;
        java.lang.String intern = m7826("ﶅ쇛\ufdeb괰ⅇꦅ紲᧘崙좉\udc30\uf8b4밼殼뼗宸ἤ謊Ṧ㩛繁⩕露鵕\ud97d䵧堌籂㡴\uec5a㢧\udf1a", (i2 % 2 == 0 ? android.view.KeyEvent.getDeadChar(1, 1) : android.view.KeyEvent.getDeadChar(0, 0)) + 1).intern();
        int i3 = f2319 + 1;
        f2318 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2318 + 27;
        f2319 = i2 % 128;
        if (i2 % 2 == 0) {
            return net.pubnative.lite.sdk.HyBid.class;
        }
        int i3 = 2 / 0;
        return net.pubnative.lite.sdk.HyBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.by byVar = new com.ironsource.adqualitysdk.sdk.i.by(mo7794());
        int i2 = f2318 + 111;
        f2319 = i2 % 128;
        int i3 = i2 % 2;
        return byVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2319 + 113;
        f2318 = i2 % 128;
        return m7826("淮\ue74b涞�첤輅\u2fe9\uf47b쵣\uee18軶ᕏⱓ", i2 % 2 == 0 ? android.view.KeyEvent.keyCodeFromString("") : 1 - android.view.KeyEvent.keyCodeFromString("")).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7826(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2320, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2320));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
