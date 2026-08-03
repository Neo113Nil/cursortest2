package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f3014 = {136934295, 177149977, -228372702, -659920166, -2116254203, 420315150, -904234512, -287154276, -556082825, -1560858683, 1900107094, 1932430285, -283875828, -1995212670, 1926388147, 431039938, -1661346139, 1104805391};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3015 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3016 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.String m8383(java.lang.String str) {
        int i = 2 % 2;
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(new java.lang.String(new char[]{'H', io.ktor.util.date.GMTDateParser.MINUTES, 'a', 'c', 'S', 'H', 'A', '1'}));
            mac.init(new javax.crypto.spec.SecretKeySpec(m8382(new int[]{1806413626, 2068907337, -1047133191, 450663253, 324727625, -1875511098, -1461430813, -783151434, 558547077, -435842307, 1713514153, -1886234662, 91873295, 1353393094, -327895077, -2084091848, 842685020, 346743968}, 34 - (android.view.ViewConfiguration.getTapTimeout() >> 16)).intern().getBytes(m8382(new int[]{-1904779879, 1069825387, -1535093355, -525644514}, android.graphics.Color.rgb(0, 0, 0) + 16777221).intern()), mac.getAlgorithm()));
            java.lang.String m8076 = com.ironsource.adqualitysdk.sdk.i.il.m8076(mac.doFinal(str.replaceAll(m8382(new int[]{-1431299200, -509694227}, 1 - android.text.TextUtils.getOffsetAfter("", 0)).intern(), "").replaceAll(m8382(new int[]{356972264, 1318647050}, -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern(), "").getBytes(m8382(new int[]{-1904779879, 1069825387, -1535093355, -525644514}, android.text.TextUtils.getOffsetBefore("", 0) + 5).intern())));
            int i2 = f3016 + 45;
            f3015 = i2 % 128;
            int i3 = i2 % 2;
            return m8076;
        } catch (java.lang.Exception e) {
            java.lang.String intern = m8382(new int[]{-226393848, 1944085175, -1212036742, -350792545, 1842113100, -455419861}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 9).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8382(new int[]{621687716, -546043472, -847725700, -405194691}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7).intern());
            sb.append(e.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8382(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3014.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
            }
            str = new java.lang.String(cArr2, 0, i);
        }
        return str;
    }
}
