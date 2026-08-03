package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class cs extends com.ironsource.adqualitysdk.sdk.i.cw {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1525 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1526;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1527 = {19162736, -398683865, 1417979791, 1411542675, 1249477380, 2120613847, -1816099421, 272801372, -417689036, 33892345, 1213341077, 1918875064, -1120952721, -2094119905, 361636502, 170442661, 1692679066, 1320543342};

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.Object m7316(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        java.util.List list2;
        java.lang.String str;
        int i = 2 % 2;
        java.lang.Class cls = (java.lang.Class) m7362(list, 0, java.lang.Class.class);
        java.util.List arrayList = new java.util.ArrayList();
        if (list.size() > 1) {
            arrayList = (java.util.List) m7362(list, 1, java.util.List.class);
        }
        if (list.size() > 2) {
            int i2 = f1525 + 87;
            f1526 = i2 % 128;
            int i3 = i2 % 2;
            list2 = (java.util.List) m7362(list, 2, java.util.List.class);
            int i4 = f1526 + 87;
            f1525 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            list2 = null;
        }
        try {
            if (list2 == null) {
                return com.ironsource.adqualitysdk.sdk.i.kk.m8434(cls, (java.util.List<java.lang.Object>) arrayList);
            }
            java.lang.Class[] clsArr = new java.lang.Class[list2.size()];
            list2.toArray(clsArr);
            return com.ironsource.adqualitysdk.sdk.i.kk.m8431(cls, (java.util.List<java.lang.Object>) arrayList, clsArr);
        } catch (java.lang.Exception e) {
            java.lang.String m7299 = clVar.m7205().m7299();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7314(new int[]{-648942494, 517050492, 645298800, 726756224, 321196532, 69693753, -773314648, 2093283333, 410495892, -1310066735}, 19 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            sb.append(cls.getName());
            sb.append(m7314(new int[]{-1153318335, -79935885, -690300098, 834177949, 189391420, -1202993097}, 12 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb.append(arrayList);
            if (list2 != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(m7314(new int[]{1115323421, -1469423853, -1042293973, -1987409538, 1522265525, 700249561, 1630840307, 24452277}, 13 - android.graphics.Color.blue(0)).intern());
                sb2.append(list2);
                str = sb2.toString();
            } else {
                int i6 = f1525 + 73;
                f1526 = i6 % 128;
                int i7 = i6 % 2;
                str = "";
            }
            sb.append(str);
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m7299, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static char m7313(java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        int i2 = f1525 + 33;
        f1526 = i2 % 128;
        int i3 = i2 % 2;
        char intValue = (char) ((java.lang.Number) m7362(list, 0, java.lang.Number.class)).intValue();
        int i4 = f1526 + 119;
        f1525 = i4 % 128;
        if (i4 % 2 != 0) {
            return intValue;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.Class m7315(java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        int i2 = f1526 + 103;
        f1525 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Class<?> cls = java.lang.reflect.Array.newInstance((java.lang.Class<?>) m7362(list, 0, java.lang.Class.class), 0).getClass();
        int i4 = f1525 + 39;
        f1526 = i4 % 128;
        if (i4 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m7317(java.util.List<java.lang.Object> list) {
        int i = 2 % 2;
        int i2 = f1526 + 7;
        f1525 = i2 % 128;
        int i3 = i2 % 2;
        if (com.ironsource.adqualitysdk.sdk.i.kk.m8439(m7362(list, 0, java.lang.Object.class), (java.lang.String) m7362(list, 1, java.lang.String.class), (java.util.List) m7362(list, 2, java.util.List.class)) == null) {
            return false;
        }
        int i4 = f1526 + 17;
        f1525 = i4 % 128;
        return !(i4 % 2 == 0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7314(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1527.clone();
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
