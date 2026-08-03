package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class hl extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2358 = 3;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2359 = {'v', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'w', 'x', 'y'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2360 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2361;

    public static class b extends com.ironsource.adqualitysdk.sdk.i.hl {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2369 = 5;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2370 = {'c', 'o', io.ktor.util.date.GMTDateParser.MINUTES, '.', 'v', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'w', 'a', 'r', 'V', 'A', 'p', 'i', 'C', 't', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'f', io.ktor.util.date.GMTDateParser.HOURS, 'j', 'k', 'q'};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2371 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2372;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final java.lang.String mo7795() {
            int i = 2 % 2;
            int i2 = f2372 + 75;
            f2371 = i2 % 128;
            java.lang.String intern = (i2 % 2 == 0 ? m7836(19 << android.text.TextUtils.getOffsetAfter("", 1), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u0000\r\f\r\u000e\u0007\b\u0001\n\b\u0007\b\t\u0005\n\u0013\u0011\u0012\u0006\u0012\u0005\u0007²", (byte) (22 << android.view.View.MeasureSpec.getSize(1))) : m7836(android.text.TextUtils.getOffsetAfter("", 0) + 33, "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u0000\r\f\r\u000e\u0007\b\u0001\n\b\u0007\b\t\u0005\n\u0013\u0011\u0012\u0006\u0012\u0005\u0007²", (byte) (android.view.View.MeasureSpec.getSize(0) + 62))).intern();
            int i3 = f2372 + 123;
            f2371 = i3 % 128;
            if (i3 % 2 != 0) {
                return intern;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final java.lang.Class mo7793() {
            int i = 2 % 2;
            int i2 = f2372 + 31;
            f2371 = i2 % 128;
            if (i2 % 2 != 0) {
                return com.vungle.warren.VungleApiClient.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
            int i = 2 % 2;
            com.ironsource.adqualitysdk.sdk.i.cc ccVar = new com.ironsource.adqualitysdk.sdk.i.cc(m7836((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, "\u0000\t\u0007\b\t\u0005", (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 70)).intern());
            int i2 = f2371 + 77;
            f2372 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return ccVar;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.String m7836(int i, java.lang.String str, byte b) {
            java.lang.String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
                char[] cArr3 = f2370;
                char c = f2369;
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr4[i] = (char) (cArr2[i] - b);
                }
                if (i > 1) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                        com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                        com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                        } else {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                            if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                                com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                                com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                                int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                            } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                                com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                                com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                                int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                            } else {
                                int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                                int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                                cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                            }
                        }
                        com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                    }
                }
                str2 = new java.lang.String(cArr4);
            }
            return str2;
        }
    }

    public static class a extends com.ironsource.adqualitysdk.sdk.i.hl {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2362 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2363 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2364 = 67;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static short[] f2365 = null;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2366 = 1721737273;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2367 = -1536501439;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static byte[] f2368 = {-20, 73, 70, -77, -78, 102, -107, -74, 96, -109, -74, 74, -74, -74, 80, 103, -116, -74, 76, -73, 76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -72, com.google.common.base.Ascii.SI, -115, 68, -68, -77, 66, -66, 73, 74, 116, -12, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 124, -122, -74, 74, -74, -74, -80, 7, -114, -79, 67};

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final java.lang.String mo7795() {
            int i = 2 % 2;
            int i2 = f2363 + 77;
            f2362 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String intern = m7835((short) (android.view.ViewConfiguration.getTouchSlop() >> 8), 1536501537 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) - 68, (-1721737273) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (79 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).intern();
            int i4 = f2363 + 33;
            f2362 = i4 % 128;
            int i5 = i4 % 2;
            return intern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final java.lang.Class mo7793() {
            int i = 2 % 2;
            int i2 = f2363 + 77;
            f2362 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
            return com.vungle.ads.internal.network.VungleApiClient.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
            int i = 2 % 2;
            com.ironsource.adqualitysdk.sdk.i.cj cjVar = new com.ironsource.adqualitysdk.sdk.i.cj(mo7794());
            int i2 = f2362 + 21;
            f2363 = i2 % 128;
            if (i2 % 2 != 0) {
                return cjVar;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static java.lang.String m7835(short s, int i, int i2, int i3, byte b) {
            java.lang.String obj;
            synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = f2364;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2368;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2366 + i3] + i4);
                    } else {
                        i5 = (short) (f2365[f2366 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2366 + i6;
                    com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                    com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2367);
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                    while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                        byte[] bArr2 = f2368;
                        if (bArr2 != null) {
                            int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                            com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                            com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                        } else {
                            short[] sArr = f2365;
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
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int red;
        int maximumDrawingCacheSize;
        int i = 2 % 2;
        int i2 = f2361 + 41;
        f2360 = i2 % 128;
        if (i2 % 2 == 0) {
            red = 53 << android.graphics.Color.red(0);
            maximumDrawingCacheSize = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >>> 90) + 122;
        } else {
            red = android.graphics.Color.red(0) + 6;
            maximumDrawingCacheSize = 6 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        }
        return m7834(red, "\u0001\u0002\u0000\u0005\u0005\u0003", (byte) maximumDrawingCacheSize).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7834(int i, java.lang.String str, byte b2) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f2359;
            char c = f2358;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b2);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b2);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b2);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}
