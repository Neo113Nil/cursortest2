package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hc extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2312 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2313 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2314 = 17502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2315 = 61929;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2316 = 59286;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2317 = 1644;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2312 + 33;
        f2313 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7825("箑ꎘ࣓퍸䅡䉩褯荁\ue501\ueea3\udd3b\u0dd7⠧⠹䢕ᛔ侷퀖ử㟯郶䣕猻야莗\ue0faꈆ䧣ᔣ퓑ꌀ왿\udd3b\u0dd7⠧⠹쭣\udfc1駰澭", android.graphics.Color.red(0) + 40).intern();
        int i4 = f2313 + 37;
        f2312 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2312 + 75;
        f2313 = i2 % 128;
        if (i2 % 2 == 0) {
            return tv.superawesome.sdk.publisher.AwesomeAds.class;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.cd cdVar = new com.ironsource.adqualitysdk.sdk.i.cd(mo7794());
        int i2 = f2313 + 125;
        f2312 = i2 % 128;
        int i3 = i2 % 2;
        return cdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2313 + 39;
        f2312 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7825("勿⥺琳﬩嫞\uf675䓕嬲廣诉諛ᡮ", 11 - android.widget.ExpandableListView.getPackedPositionChild(0L)).intern();
        int i4 = f2312 + 45;
        f2313 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return intern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7825(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2314)) ^ ((c2 >>> 5) + f2315)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2316) ^ ((c3 + i2) ^ ((c3 << 4) + f2317))));
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
