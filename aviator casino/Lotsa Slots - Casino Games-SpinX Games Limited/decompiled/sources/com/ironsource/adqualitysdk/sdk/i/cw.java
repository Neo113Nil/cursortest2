package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class cw {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1537 = {679857902, 577356931, 473962123, 165503771, 2023347102, 1579755624, -312948113, -1465615372, -663307277, -1891407845, 1016657963, 1100270769, 1064856563, -320254708, 660866195, -1761943135, -1676633008, 1554262506};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1538 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1539;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m7362(java.util.List<java.lang.Object> list, int i, java.lang.Class<T> cls) {
        int i2 = 2 % 2;
        T t = (T) list.get(i);
        if (t != null) {
            int i3 = f1539 + 7;
            f1538 = i3 % 128;
            int i4 = i3 % 2;
            if (!cls.isAssignableFrom(t.getClass())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7359(new int[]{-911488373, 1132367982, -1006369020, 110809697, 1493263282, 1795933479}, 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                sb.append(t.getClass().getName());
                sb.append(m7359(new int[]{-1390919090, -667087883}, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4).intern());
                sb.append(cls.getName());
                throw new java.lang.ClassCastException(sb.toString());
            }
        }
        int i5 = f1538 + 47;
        f1539 = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected static <T> boolean m7360(java.util.List<java.lang.Object> list, int i, java.lang.Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = f1538 + 55;
        f1539 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 == 0) {
            java.lang.Object obj2 = list.get(i);
            if (obj2 != null && !cls.isAssignableFrom(obj2.getClass())) {
                return false;
            }
            int i4 = f1539 + 107;
            f1538 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        list.get(i);
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    protected static java.util.List<java.lang.Object> m7361(java.util.List<java.lang.Object> list, int i) {
        java.util.List<java.lang.Object> list2;
        int i2 = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list.size() <= i) {
            return arrayList;
        }
        int i3 = f1538 + 111;
        f1539 = i3 % 128;
        int i4 = i3 % 2;
        if (!m7360(list, i, java.util.List.class)) {
            return arrayList;
        }
        int i5 = f1539 + 71;
        f1538 = i5 % 128;
        if (i5 % 2 == 0) {
            list2 = (java.util.List) m7362(list, i, java.util.List.class);
            int i6 = 75 / 0;
        } else {
            list2 = (java.util.List) m7362(list, i, java.util.List.class);
        }
        return list2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7359(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1537.clone();
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
