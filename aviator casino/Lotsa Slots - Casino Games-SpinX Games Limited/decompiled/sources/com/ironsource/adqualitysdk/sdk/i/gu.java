package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gu extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2271 = 57740;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2272 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2273;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2274;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2275;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2273 + 31;
        f2272 = i2 % 128;
        return m7815(i2 % 2 == 0 ? (char) ((-1) >>> (android.widget.ExpandableListView.getPackedPositionForChild(0, 1) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 1) == 1L ? 0 : -1))) : (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "☍唻욥줐", "얚袋점籄\ue099音䵦⪖ᮝ앧興襊랁홰늄ᶧᕪ\uf6fb꽿é\ue1a0꜃\ue97a码", android.view.KeyEvent.keyCodeFromString("")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2273 + 9;
        int i3 = i2 % 128;
        f2272 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        f2273 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return com.inmobi.sdk.InMobiSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bp bpVar = new com.ironsource.adqualitysdk.sdk.i.bp(mo7794());
        int i2 = f2272 + 71;
        f2273 = i2 % 128;
        int i3 = i2 % 2;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        char indexOf;
        int threadPriority;
        int i = 2 % 2;
        int i2 = f2273 + 7;
        f2272 = i2 % 128;
        if (i2 % 2 == 0) {
            indexOf = (char) (8740 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", 'F', 0));
            threadPriority = android.os.Process.getThreadPriority(1) >>> 191;
        } else {
            indexOf = (char) (24734 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0));
            threadPriority = (android.os.Process.getThreadPriority(0) + 20) >> 6;
        }
        return m7815(indexOf, "\u0000\u0000\u0000\u0000", "♩ꮉ鼿쁠", "Ꚅ唉㥾\ue9b7㈃⅟", threadPriority).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7815(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
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
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2275) ^ f2274) ^ f2271);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
