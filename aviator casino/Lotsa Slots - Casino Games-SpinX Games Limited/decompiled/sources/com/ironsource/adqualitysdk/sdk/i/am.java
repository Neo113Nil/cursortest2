package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class am {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f355 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f356 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f357 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f358 = 81;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f359 = -399147315;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f360 = 675718672;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f361 = {-13, 3, 10, 3, -21, com.google.common.base.Ascii.VT, -5, 5, 10, -18, com.google.common.base.Ascii.CR, 3, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m6009(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = f355 + 19;
        f356 = i3 % 128;
        if (i3 % 2 == 0) {
            map.containsKey(str);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (map.containsKey(str)) {
            int i4 = f356 + 81;
            f355 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 61 / 0;
            }
            return false;
        }
        int size = map.size();
        if (m6007(map)) {
            int i6 = f356 + 99;
            f355 = i6 % 128;
            int i7 = i6 % 2;
            i = 1;
        } else {
            i = 0;
        }
        return size >= 5 + i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6007(java.util.Map<java.lang.String, java.lang.String> map) {
        int i = 2 % 2;
        int i2 = f355 + 37;
        f356 = i2 % 128;
        int i3 = i2 % 2;
        boolean containsKey = map.containsKey(m6006((short) android.view.View.getDefaultSize(0, 0), android.graphics.Color.blue(0) - 675718575, (-68) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 399147315 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        int i4 = f356 + 93;
        f355 = i4 % 128;
        if (i4 % 2 == 0) {
            return containsKey;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m6005(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f356 + 113;
        f355 = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = m6006((short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 675718575, android.view.KeyEvent.getDeadChar(0, 0) - 68, 399147315 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) android.widget.ExpandableListView.getPackedPositionType(0L)).intern().equals(str);
        int i4 = f356 + 49;
        f355 = i4 % 128;
        if (i4 % 2 == 0) {
            return equals;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m6008(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        if (com.ironsource.adqualitysdk.sdk.i.kn.m8474(str, 64) && com.ironsource.adqualitysdk.sdk.i.kn.m8474(str2, 64)) {
            int i2 = f355;
            int i3 = i2 + 61;
            f356 = i3 % 128;
            r2 = i3 % 2 != 0;
            int i4 = i2 + 9;
            f356 = i4 % 128;
            int i5 = i4 % 2;
        }
        return r2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m6006(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f358;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f361;
                if (bArr != null) {
                    i5 = (byte) (bArr[f359 + i3] + i4);
                } else {
                    i5 = (short) (f357[f359 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f359 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f360);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f361;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f357;
                        int i8 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i8 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((short) (sArr[i8] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    }
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
