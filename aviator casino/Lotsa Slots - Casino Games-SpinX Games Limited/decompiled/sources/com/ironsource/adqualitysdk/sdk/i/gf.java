package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gf extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2191 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2192 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2193 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2194 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2195 = -1330576333536084783L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String mo7795() {
        char green;
        int alpha;
        int i = 2 % 2;
        int i2 = f2191 + 29;
        f2193 = i2 % 128;
        if (i2 % 2 == 0) {
            green = (char) android.graphics.Color.green(1);
            alpha = 241007937 << android.graphics.Color.alpha(0);
        } else {
            green = (char) android.graphics.Color.green(0);
            alpha = 241007937 - android.graphics.Color.alpha(0);
        }
        java.lang.String intern = m7792(green, "㳑픊ퟟ\ued88", "䅵嵽餎Ꮃ", "၆䪦듦䆊䨖葌䐃淩샥帣麆죸ꮞᣴ䶌⥢䬢\ue706\ue55dꑩ꺜\ua95c挰韼氾焧ᕌꖁ椝㞐䐅㲋顯浪펟\ueada鍎꧵ࢀ䗭ぞ繰\ue94bꛖ漜ვﮢ粷ঊ霹袜", alpha).intern();
        int i3 = f2193 + 7;
        f2191 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.Class mo7793() {
        java.lang.Class<com.ironsource.adqualitysdk.sdk.IronSourceAdQuality> cls;
        int i = 2 % 2;
        int i2 = f2191;
        int i3 = i2 + 81;
        f2193 = i3 % 128;
        if (i3 % 2 == 0) {
            cls = com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.class;
            int i4 = 88 / 0;
        } else {
            cls = com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.class;
        }
        int i5 = i2 + 69;
        f2193 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bh bhVar = new com.ironsource.adqualitysdk.sdk.i.bh(mo7794());
        int i2 = f2191 + 3;
        f2193 = i2 % 128;
        int i3 = i2 % 2;
        return bhVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2191 + 37;
        f2193 = i2 % 128;
        int i3 = i2 % 2;
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        return m7792(i3 == 0 ? (char) (35313 << (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))) : (char) (35313 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))), "㳑픊ퟟ\ued88", "ઍ˱\uf062\ue189", "\ue094扊﨣䳵ꔘ럜쨧የ縬鵍牽⛗砨\ud926\u0895", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1644359947).intern();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7792(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2195) ^ f2192) ^ f2194);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
