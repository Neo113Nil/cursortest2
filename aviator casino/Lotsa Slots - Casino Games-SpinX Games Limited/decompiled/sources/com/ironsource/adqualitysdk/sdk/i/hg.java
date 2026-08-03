package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hg extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2335 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2336 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2337 = 5055998094937703637L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2335 + 21;
        f2336 = i2 % 128;
        java.lang.String intern = (i2 % 2 != 0 ? m7829("䒶됙ꗾ锒蘨\uf78b\ue729탅쇣ㄍ⋤Ꮉ̜粼汒崹事빧꿄颩蠛粒\ueaf9\uda37쯙㭪㐚▀ᕒۆ瞤", android.view.ViewConfiguration.getMinimumFlingVelocity() * 7022742) : m7829("䒶됙ꗾ锒蘨\uf78b\ue729탅쇣ㄍ⋤Ꮉ̜粼汒崹事빧꿄颩蠛粒\ueaf9\uda37쯙㭪㐚▀ᕒۆ瞤", 61603 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern();
        int i3 = f2336 + 3;
        f2335 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2336 + 41;
        int i3 = i2 % 128;
        f2335 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        f2336 = i5 % 128;
        if (i5 % 2 == 0) {
            return com.qq.e.comm.managers.GDTAdSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.cf cfVar = new com.ironsource.adqualitysdk.sdk.i.cf(mo7794());
        int i2 = f2335 + 85;
        f2336 = i2 % 128;
        if (i2 % 2 == 0) {
            return cfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2335 + 63;
        f2336 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7829("䒡\ua637膵\ue323캬⠘\u0b8b", android.view.KeyEvent.normalizeMetaState(0) + 57991).intern();
        int i4 = f2336 + 25;
        f2335 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7829(java.lang.String str, int i) {
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
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2337);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
