package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gs extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2262 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2263 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2264 = 8256350376084531591L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2263 + 37;
        f2262 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7812("\uf5bcꋱ㖭\uf5df쬙\ue6ce傇氼叆괫䳥軨맶ᝠ⪂\ue49fކ累\uf0bd䊴涯ꍲ庺륏쭕ૌ⑄\u1779ᅿ\uecf0艾䵹缌囟栍ꬋ씽㣺㙭Ā⌮\ue21c鿂翟装䐍旿헸훾ⸯ쎮㎑㲡遇ꦝ榸骷穧瞥", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1).intern();
        int i4 = f2263 + 37;
        f2262 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2262 + 73;
        int i3 = i2 % 128;
        f2263 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        f2262 = i5 % 128;
        int i6 = i5 % 2;
        return com.fyber.inneractive.sdk.external.InneractiveAdManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bt btVar = new com.ironsource.adqualitysdk.sdk.i.bt(mo7794());
        int i2 = f2263 + 1;
        f2262 = i2 % 128;
        int i3 = i2 % 2;
        return btVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2263 + 57;
        f2262 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7812("Ϧ磒걗Ώᄻ缷銒깢ꖈ眐픞䲧侷촛덴", -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern();
        int i4 = f2263 + 97;
        f2262 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7812(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2264, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2264));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
