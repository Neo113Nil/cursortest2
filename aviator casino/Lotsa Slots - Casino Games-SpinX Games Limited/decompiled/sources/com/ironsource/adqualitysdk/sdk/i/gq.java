package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gq extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2256 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2257 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2258 = -3462051208747850941L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2256 + 7;
        f2257 = i2 % 128;
        int i3 = i2 % 2;
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        return m7810("挠築勤⧂±Ὓ\uf67e쵥ꐉ茡鯞狿䧑₃㾡ᙛ\ued3d쐷ꌽ믯鋂槾䂙徹㙕൹\ue472", i3 != 0 ? 31755 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) : (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 6372).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2256;
        int i3 = i2 + 65;
        f2257 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        f2257 = i5 % 128;
        int i6 = i5 % 2;
        return com.facebook.ads.AdSettings.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bn bnVar = new com.ironsource.adqualitysdk.sdk.i.bn(mo7794());
        int i2 = f2257 + 9;
        f2256 = i2 % 128;
        int i3 = i2 % 2;
        return bnVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2257 + 117;
        f2256 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7810("挥㡫햲狽ฅꭁ䂚ᷗ", 23369 - android.view.KeyEvent.keyCodeFromString("")).intern();
        int i4 = f2256 + 23;
        f2257 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7810(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2258);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
