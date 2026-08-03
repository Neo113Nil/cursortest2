package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gv extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2276 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2277 = -4174718550658798707L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2278 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int packedPositionGroup;
        int i = 2 % 2;
        int i2 = f2276 + 121;
        f2278 = i2 % 128;
        if (i2 % 2 == 0) {
            android.widget.ExpandableListView.getPackedPositionGroup(1L);
            packedPositionGroup = 0;
        } else {
            packedPositionGroup = 1 - android.widget.ExpandableListView.getPackedPositionGroup(0L);
        }
        java.lang.String intern = m7816("疅痦塚\ue366\uf3b8됑盙瑐\udbd9Ǣ\ue658쓹⦀志僊⬾罷\uee17芢祼촼㱣\ueca2코ዥ䪠嵖ᶋ惑飾轗揪뚄㛆年눷Ћ䔧⮰v樲鍞闥噎믣↻옐ꒆ\u09c9翶", packedPositionGroup).intern();
        int i3 = f2278 + 109;
        f2276 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2276 + 43;
        int i3 = i2 % 128;
        f2278 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 107;
        f2276 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return com.hyprmx.android.sdk.placement.PlacementType.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bo boVar = new com.ironsource.adqualitysdk.sdk.i.bo(mo7794());
        int i2 = f2278 + 125;
        f2276 = i2 % 128;
        int i3 = i2 % 2;
        return boVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2276 + 43;
        f2278 = i2 % 128;
        java.lang.String intern = m7816("㳀㲨䡢\uf389\ue396ꓣ髩頼銙ᇛ", i2 % 2 == 0 ? android.view.ViewConfiguration.getKeyRepeatDelay() - 48 : (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern();
        int i3 = f2276 + 113;
        f2278 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7816(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2277, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2277));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
