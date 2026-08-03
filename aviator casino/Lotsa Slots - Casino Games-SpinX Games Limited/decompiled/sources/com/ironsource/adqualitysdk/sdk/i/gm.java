package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gm extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2217 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2218 = 50675;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2219 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2220 = 15581;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2221 = 38828;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2222 = 53056;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2217 + 91;
        f2219 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7804("碘ﴦ써᭽\ue925꒦혨㽆ꕧẹ醾黵䇇쓢ﶱ㼎掦찣唄媏ﬄ뽐ꑅ扡ဃ槮⿕羪ꯓ\ud96a\u05fd鄳쪩ద", 34 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern();
        int i4 = f2217 + 7;
        f2219 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2217;
        int i3 = i2 + 47;
        f2219 = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 121;
        f2219 = i4 % 128;
        int i5 = i4 % 2;
        return com.amazon.device.ads.DTBAdRequest.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bi biVar = new com.ironsource.adqualitysdk.sdk.i.bi(mo7794());
        int i2 = f2217 + 83;
        f2219 = i2 % 128;
        int i3 = i2 % 2;
        return biVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2217 + 93;
        f2219 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7804("\ue925꒦혨㽆ꕧẹ㳨⨅꾁䍞", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 10).intern();
        int i4 = f2219 + 41;
        f2217 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7804(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2218)) ^ ((c2 >>> 5) + f2221)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2220) ^ ((c3 + i2) ^ ((c3 << 4) + f2222))));
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
