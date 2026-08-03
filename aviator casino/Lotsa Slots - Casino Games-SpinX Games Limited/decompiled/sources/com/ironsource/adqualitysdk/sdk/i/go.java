package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class go extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2230 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2231 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2232 = 70;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2233 = -1255406502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2234 = 1481656921;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2235;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2236 = {-61, 2, -11, com.google.common.base.Ascii.CR, -3, -1, -15, -5, com.google.common.base.Ascii.ETB};

    public static class d extends com.ironsource.adqualitysdk.sdk.i.go {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2244 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2245 = 21564;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2246 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2247 = 43169;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2248 = 44132;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f2249 = 27752;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final java.lang.String mo7795() {
            int i = 2 % 2;
            int i2 = f2244 + 45;
            f2246 = i2 % 128;
            java.lang.String intern = m7808("뚊쫍⛲굢볖툧썊鵣牒ꂷ賍傏ꄪꇄ䒫ැ狒\uf449\uf41c饨\uf3fa涕裸늊䒫ැ狒\uf449럚ㅺ䞵≩ケ쨕ⵀ뽦", i2 % 2 != 0 ? 40 << android.view.View.MeasureSpec.makeMeasureSpec(1, 1) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 35).intern();
            int i3 = f2246 + 95;
            f2244 = i3 % 128;
            if (i3 % 2 != 0) {
                return intern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final java.lang.Class mo7793() {
            int i = 2 % 2;
            int i2 = f2246 + 123;
            int i3 = i2 % 128;
            f2244 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            f2246 = i5 % 128;
            int i6 = i5 % 2;
            return com.bytedance.sdk.openadsdk.TTAdSdk.class;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static java.lang.String m7808(java.lang.String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2249)) ^ ((c2 >>> 5) + f2247)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2245) ^ ((c3 + i2) ^ ((c3 << 4) + f2248))));
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

    public static class c extends com.ironsource.adqualitysdk.sdk.i.go {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2237 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2238 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2239 = {-29, -15, -34, -28, 17, -64, 72, -41, 7, -27, -57, 37, 9, -37, -49, com.google.common.base.Ascii.US, -29, 17, -37, -33, com.google.common.base.Ascii.SI, -39, com.google.common.base.Ascii.NAK, -31, -95, com.google.common.base.Ascii.US, -29, 17, -91, com.google.common.base.Ascii.EM, -32, com.google.common.base.Ascii.NAK, -35, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 17, 7, -13, -42, 33, com.google.common.base.Ascii.FF, -34, 0};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2240 = 40;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2241 = -1059823865;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2242 = -927051618;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static short[] f2243;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final java.lang.String mo7795() {
            int i = 2 % 2;
            int i2 = f2238 + 17;
            f2237 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String intern = m7807((short) ((-120) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)), 927051717 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1059823865, (byte) (106 - android.text.TextUtils.lastIndexOf("", '0'))).intern();
            int i4 = f2238 + 117;
            f2237 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return intern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final java.lang.Class mo7793() {
            int i = 2 % 2;
            int i2 = f2238 + 81;
            f2237 = i2 % 128;
            if (i2 % 2 != 0) {
                return com.bytedance.sdk.openadsdk.api.init.PAGSdk.class;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static java.lang.String m7807(short s, int i, int i2, int i3, byte b) {
            java.lang.String obj;
            synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = f2240;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2239;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2241 + i3] + i4);
                    } else {
                        i5 = (short) (f2243[f2241 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2241 + i6;
                    com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                    com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2242);
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                    while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                        byte[] bArr2 = f2239;
                        if (bArr2 != null) {
                            int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                            com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                            com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                        } else {
                            short[] sArr = f2243;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bm bmVar = new com.ironsource.adqualitysdk.sdk.i.bm(mo7794());
        int i2 = f2231 + 39;
        f2230 = i2 % 128;
        if (i2 % 2 != 0) {
            return bmVar;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2230 + 59;
        f2231 = i2 % 128;
        return (i2 % 2 != 0 ? m7806((short) ((-1) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1255406600 << (android.view.ViewConfiguration.getDoubleTapTimeout() >> 44), 49 % android.os.Process.getGidForName(""), (-1481656921) >> android.view.View.MeasureSpec.getSize(1), (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0)) : m7806((short) ((r7 > 0L ? 1 : (r7 == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1255406600, android.os.Process.getGidForName("") - 70, (-1481656921) - android.view.View.MeasureSpec.getSize(0), (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7806(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2232;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2236;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2234 + i3] + i4);
                } else {
                    i5 = (short) (f2235[f2234 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2234 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2233);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2236;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2235;
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
