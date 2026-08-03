package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fw extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2144 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2145 = 7859804800989236600L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2146 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        java.lang.Object obj = null;
        com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(null);
        eaVar.m7674();
        int i2 = f2146 + 105;
        f2144 = i2 % 128;
        if (i2 % 2 == 0) {
            return eaVar;
        }
        super.hashCode();
        throw null;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2146 + 49;
        f2144 = i2 % 128;
        java.lang.String intern = m7776("㖐昇铘㗳\ueb10蹆紆픚\u0019ꔱ쑽ଷ幫", i2 % 2 != 0 ? android.view.KeyEvent.getDeadChar(1, 0) : android.view.KeyEvent.getDeadChar(0, 0)).intern();
        int i3 = f2144 + 117;
        f2146 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7776(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2145, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2145));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
