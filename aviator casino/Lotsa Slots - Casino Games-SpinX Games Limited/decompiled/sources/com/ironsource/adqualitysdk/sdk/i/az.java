package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class az {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f626 = 1;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f627;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f628 = {455223294, -736123933, -1603527667, -1128342658, -1596813003, -1827028241, -664626200, 1704613885, 1503993505, -322766345, -1852325636, 672285885, -470105997, 1430502983, 900694578, -668460477, 2078601704, -1545452048};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long f629 = -4924610577456800240L;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private java.lang.String f630;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.az.a f631 = com.ironsource.adqualitysdk.sdk.i.az.a.f653;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.az.b f632 = com.ironsource.adqualitysdk.sdk.i.az.b.f660;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f633;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.String f634;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.String f635;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String f636;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String f637;

    public enum a {
        f653,
        f652,
        f651,
        f649,
        f650,
        f644;


        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f640 = 1;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static byte[] f641;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static short[] f642;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f643;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f645;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f646;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f647;

        /* renamed from: ﻛ, reason: contains not printable characters */
        static void m6260() {
            f647 = -1966716893;
            f646 = 8;
            f645 = 1283333153;
            f641 = new byte[]{-5, -55, -84, 0, -21, 63, 67, 63, -39, 57, -23, 4, 122, 6, 108, com.google.common.base.Ascii.DC2, 126, 8, 121, 118, 8, 120, 6, -6, com.google.common.base.Ascii.FF, 0, -70, -68, -115, -124, -87, -115, Byte.MIN_VALUE, -3, -101, -63, -98, -111};
        }

        public static com.ironsource.adqualitysdk.sdk.i.az.a valueOf(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f640 + 85;
            f643 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.az.a aVar = (com.ironsource.adqualitysdk.sdk.i.az.a) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.az.a.class, str);
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
            int i5 = f640 + 13;
            f643 = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.ironsource.adqualitysdk.sdk.i.az.a[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f643 + 13;
            f640 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.az.a[] aVarArr = (com.ironsource.adqualitysdk.sdk.i.az.a[]) values().clone();
            int i4 = f640 + 41;
            f643 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return aVarArr;
        }

        static {
            m6260();
            int i = f640 + 13;
            f643 = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.String m6259(short s, int i, int i2, int i3, byte b) {
            java.lang.String obj;
            synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = f646;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f641;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f647 + i3] + i4);
                    } else {
                        i5 = (short) (f642[f647 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f647 + i6;
                    com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                    com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f645);
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                    while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                        byte[] bArr2 = f641;
                        if (bArr2 != null) {
                            int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                            com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                            com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                        } else {
                            short[] sArr = f642;
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

    public enum b {
        f660,
        f662,
        f659,
        f661,
        f663,
        f658;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f654 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f655 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f657 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m6262() {
            f655 = new char[]{'X', 181, 186, 186, 129, 268, 268, 263, 263, 258, 265, 267, 269, 273, 265, 265, 278, 279, 271, 263, 260, 258, 270, 278, 'a', 195, 193, 195, 199, 192, 194, 207, 202, 188, 192, 206, 198, 185, 193, 200, 197, 196, 197, 199, 201, 197, 198, '\"', 'D', 'H', 'J', 'E', 'C', 'R', 'V', 'N', 'L', 'N', 'J', io.ktor.util.date.GMTDateParser.MONTH, 'Q', 'J', 'F', 'E', 'N', 'N', 'K', 'K', '#', 'C', 'E', 'J', 'H', 'D', 'Q', io.ktor.util.date.GMTDateParser.YEAR, 'Q', 'W', 'Q', 'J', 'K', 'C', 'J', 'L', 'R', 'Q', 'I', 'N', 'N', 'I', 'D', 'K', 'Q', 'P', '\'', 'N', 'L', 'L', 'Q', 'Q', 'R'};
        }

        public static com.ironsource.adqualitysdk.sdk.i.az.b valueOf(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f654 + 13;
            f657 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.az.b bVar = (com.ironsource.adqualitysdk.sdk.i.az.b) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.az.b.class, str);
            if (i3 == 0) {
                int i4 = 68 / 0;
            }
            return bVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.ironsource.adqualitysdk.sdk.i.az.b[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f654 + 69;
            f657 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.az.b[] bVarArr = (com.ironsource.adqualitysdk.sdk.i.az.b[]) values().clone();
            int i4 = f657 + 97;
            f654 = i4 % 128;
            if (i4 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        static {
            m6262();
            int i = f657 + 55;
            f654 = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static java.lang.String m6261(java.lang.String str, int[] iArr, boolean z) {
            java.lang.String str2;
            byte[] bArr = str;
            if (str != null) {
                bArr = str.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
            }
            byte[] bArr2 = bArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2296) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                java.lang.System.arraycopy(f655, i, cArr, 0, i2);
                if (bArr2 != null) {
                    char[] cArr2 = new char[i2];
                    com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                    char c = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                        if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] == 1) {
                            cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) + 1) - c);
                        } else {
                            cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) - c);
                        }
                        c = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297];
                        com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    java.lang.System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    java.lang.System.arraycopy(cArr3, 0, cArr, i5, i4);
                    java.lang.System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2297] = cArr[(i2 - com.ironsource.adqualitysdk.sdk.i.h.f2297) - 1];
                        com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                        cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] - iArr[2]);
                        com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                    }
                }
                str2 = new java.lang.String(cArr);
            }
            return str2;
        }
    }

    az(java.lang.String str) {
        this.f633 = str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    final void m6257(com.ironsource.adqualitysdk.sdk.i.cp cpVar) {
        int i = 2 % 2;
        cpVar.m7299();
        this.f633 = cpVar.m7300();
        this.f636 = cpVar.m7295();
        this.f635 = cpVar.m7290();
        if (!m6249(new int[]{-521863514, 381937645, -571024264, 2114789544}, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 8).intern().equals(this.f635)) {
            int i2 = f626 + 65;
            f627 = i2 % 128;
            if (i2 % 2 == 0) {
            }
            this.f637 = cpVar.m7291();
            this.f634 = cpVar.m7292();
            this.f630 = cpVar.m7294();
        }
        this.f635 = m6249(new int[]{688880972, 1338191211}, 3 - android.view.View.getDefaultSize(0, 0)).intern();
        int i3 = f627 + 103;
        f626 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 5;
        }
        this.f637 = cpVar.m7291();
        this.f634 = cpVar.m7292();
        this.f630 = cpVar.m7294();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final void m6258(com.ironsource.adqualitysdk.sdk.i.az.a aVar) {
        int i = 2 % 2;
        int i2 = f626 + 21;
        f627 = i2 % 128;
        int i3 = i2 % 2;
        this.f631 = aVar;
        if (aVar != com.ironsource.adqualitysdk.sdk.i.az.a.f644) {
            int i4 = f626 + 83;
            f627 = i4 % 128;
            int i5 = i4 % 2;
            this.f632 = com.ironsource.adqualitysdk.sdk.i.az.b.f660;
        }
        int i6 = com.ironsource.adqualitysdk.sdk.i.az.AnonymousClass5.f639[this.f631.ordinal()];
        if (i6 == 1) {
            int i7 = f626 + 67;
            f627 = i7 % 128;
            int i8 = i7 % 2;
        } else if (i6 == 3 || i6 == 4 || i6 == 5) {
            m6250();
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m6255(com.ironsource.adqualitysdk.sdk.i.az.b bVar) {
        int i = 2 % 2;
        int i2 = f626 + 45;
        f627 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f632 = bVar;
            m6258(com.ironsource.adqualitysdk.sdk.i.az.a.f644);
            int i3 = 66 / 0;
        } else {
            this.f632 = bVar;
            m6258(com.ironsource.adqualitysdk.sdk.i.az.a.f644);
        }
        int i4 = f626 + 105;
        f627 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m6250() {
        java.lang.String m6246;
        int i = 2 % 2;
        if (this.f633.equals(m6248("䀆챉쉔㚴䁑鈼縖Ⳓ㠯᩼\uf643", android.view.View.resolveSizeAndState(0, 0, 0)).intern())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(m6251());
        sb2.append(m6249(new int[]{-446017547, -1509863197}, android.view.View.combineMeasuredStates(0, 0) + 1).intern());
        sb.append(sb2.toString());
        java.lang.String m6253 = m6253();
        if (m6253 != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(m6253);
            sb3.append(m6249(new int[]{-446017547, -1509863197}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
            sb.append(sb3.toString());
        }
        java.lang.String m6247 = m6247();
        if (m6247 != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(m6247);
            sb4.append(m6249(new int[]{-446017547, -1509863197}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1).intern());
            sb.append(sb4.toString());
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(m6249(new int[]{-1497888288, -2009197094, 2066887034, -458036270}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 8).intern());
        if (this.f631 == com.ironsource.adqualitysdk.sdk.i.az.a.f644) {
            int i2 = f627 + 103;
            f626 = i2 % 128;
            int i3 = i2 % 2;
            m6246 = m6249(new int[]{-1224987667, 1006438990, 972705399, 1094576115}, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7).intern();
        } else {
            m6246 = m6246();
        }
        sb5.append(m6246);
        sb5.append(m6249(new int[]{-446017547, -1509863197}, android.view.KeyEvent.getDeadChar(0, 0) + 1).intern());
        sb.append(sb5.toString());
        if (this.f631 == com.ironsource.adqualitysdk.sdk.i.az.a.f649 || this.f631 == com.ironsource.adqualitysdk.sdk.i.az.a.f650) {
            com.ironsource.adqualitysdk.sdk.i.m.m8535(m6249(new int[]{962724271, 2070611166, 1657831648, 1195001043, 951186923, 599890710}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern(), sb.toString());
            return;
        }
        java.lang.String m6252 = m6252(this.f632);
        if (m6252 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(m6248("眘뺔殪岠睕\ue0e1ퟹ䛣༹梣徯컪螸", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16).intern());
            sb6.append(m6252);
            sb.append(sb6.toString());
            int i4 = f626 + 119;
            f627 = i4 % 128;
            int i5 = i4 % 2;
        }
        com.ironsource.adqualitysdk.sdk.i.m.m8530(m6249(new int[]{962724271, 2070611166, 1657831648, 1195001043, 951186923, 599890710}, 12 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)).intern(), sb.toString());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String m6251() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m6249(new int[]{-1147569661, -272628229, -1147569661, -272628229, -1147569661, -272628229, 263022688, -536448294}, android.text.TextUtils.getOffsetAfter("", 0) + 15).intern());
        sb.append(this.f633);
        sb.append(m6249(new int[]{-1208171018, 654264981, -976882580, -661812587, 850339439, 1229713186}, 10 - android.widget.ExpandableListView.getPackedPositionChild(0L)).intern());
        java.lang.String obj = sb.toString();
        if (this.f636 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(this.f636);
            sb2.append(m6248("ᢅ䯦㚌℔ᢥ", android.view.ViewConfiguration.getTouchSlop() >> 8).intern());
            obj = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(m6249(new int[]{-1147569661, -272628229, -1147569661, -272628229, -1147569661, -272628229, -1208868695, 1002682254}, (android.os.Process.myTid() >> 22) + 14).intern());
        java.lang.String obj2 = sb3.toString();
        int i2 = f627 + 29;
        f626 = i2 % 128;
        int i3 = i2 % 2;
        return obj2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String m6253() {
        java.lang.String str;
        int i = 2 % 2;
        if (this.f633 == null || (str = this.f635) == null) {
            int i2 = f627 + 95;
            f626 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f627 + 67;
        f626 = i4 % 128;
        int i5 = i4 % 2;
        if (!(!str.equals(m6249(new int[]{688880972, 1338191211}, 2 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern()))) {
            int i6 = f627 + 53;
            f626 = i6 % 128;
            int i7 = i6 % 2;
            if (this.f631 != com.ironsource.adqualitysdk.sdk.i.az.a.f650) {
                str = m6249(new int[]{-1529157247, -1067184197, -263964391, -646454502, 1639657939, -490349525}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10).intern();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f633);
        sb.append(m6249(new int[]{-1271509155, -129331995, -1964958635, -1987323259, -1078380847, 1454938374, -882754763, -1294458365}, 14 - android.text.TextUtils.getTrimmedLength("")).intern());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private java.lang.String m6247() {
        int i = 2 % 2;
        int i2 = f627 + 115;
        int i3 = i2 % 128;
        f626 = i3;
        int i4 = i2 % 2;
        if (this.f637 == null) {
            return null;
        }
        int i5 = i3 + 111;
        f627 = i5 % 128;
        int i6 = i5 % 2;
        if (this.f634 == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m6248("㗈墮酨䊛㖛ۺⴃ墋䷞躛ꕺ킘씡ᙑ㶦䡘崨鸍뗽쀛풸柑\u0c3a맟泭\uef9a萲㇋", (-1) - android.os.Process.getGidForName("")).intern());
        sb.append(this.f637);
        sb.append(m6249(new int[]{511269803, -1762551066}, 3 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb.append(this.f634);
        java.lang.String obj = sb.toString();
        int i7 = f626 + 1;
        f627 = i7 % 128;
        int i8 = i7 % 2;
        return obj;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ﻐ, reason: contains not printable characters */
        static final /* synthetic */ int[] f638;

        /* renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f639;

        static {
            int[] iArr = new int[com.ironsource.adqualitysdk.sdk.i.az.b.valuesCustom().length];
            f638 = iArr;
            try {
                iArr[com.ironsource.adqualitysdk.sdk.i.az.b.f658.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f638[com.ironsource.adqualitysdk.sdk.i.az.b.f662.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f638[com.ironsource.adqualitysdk.sdk.i.az.b.f659.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f638[com.ironsource.adqualitysdk.sdk.i.az.b.f661.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f638[com.ironsource.adqualitysdk.sdk.i.az.b.f663.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.ironsource.adqualitysdk.sdk.i.az.a.valuesCustom().length];
            f639 = iArr2;
            try {
                iArr2[com.ironsource.adqualitysdk.sdk.i.az.a.f652.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f639[com.ironsource.adqualitysdk.sdk.i.az.a.f651.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f639[com.ironsource.adqualitysdk.sdk.i.az.a.f649.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f639[com.ironsource.adqualitysdk.sdk.i.az.a.f644.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f639[com.ironsource.adqualitysdk.sdk.i.az.a.f650.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String m6252(com.ironsource.adqualitysdk.sdk.i.az.b bVar) {
        int i = 2 % 2;
        int i2 = f626 + 69;
        f627 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj = null;
        if (bVar != null) {
            int i4 = com.ironsource.adqualitysdk.sdk.i.az.AnonymousClass5.f638[bVar.ordinal()];
            if (i4 == 1) {
                return m6248("Ɥꅤ뺩뤈Ꟙ：ˢꍖ\udfa2睃誧⭘坨\uef86ቻ돗켿枔騦㮛䛮鸁⏻䉊ﺨᙐ", android.text.AndroidCharacter.getMirror('0') - '0').intern();
            }
            if (i4 == 2) {
                return java.lang.String.format(m6249(new int[]{1774830178, 648022803, -284275693, -2134552186, 1060154556, 150556639, 1240608641, -1725962027, 2113813124, -254135115, -1388419528, 1592604023, -330292194, -59596372, -249453407, 345835048, 1779849888, 425726122, 1503434012, -541059464, -1766708416, 1067678654, 1060154556, 150556639, 1240608641, -1725962027, -1706620635, -912435250, -1702450320, 853370110, -313028479, 1652580358}, android.text.TextUtils.indexOf("", "", 0, 0) + 62).intern(), this.f633, this.f635, this.f630);
            }
            if (i4 == 3) {
                java.lang.String format = java.lang.String.format(m6249(new int[]{685639142, -1802374468, -1766708416, 1067678654, 1060154556, 150556639, 1240608641, -1725962027, -1385407742, -1262659844, -1571258135, 963451361, 183471044, -1556790898, -192086299, -1192071881, -1513517395, 1880817318, 56532696, -1357181167, 1125960264, -370688110, -666104877, -1241789415, 1267391027, 2102840719, 968610096, 123799223}, 55 - android.text.TextUtils.indexOf("", "")).intern(), this.f633, this.f635);
                int i5 = f626 + 93;
                f627 = i5 % 128;
                if (i5 % 2 == 0) {
                    return format;
                }
                throw null;
            }
            if (i4 == 4) {
                java.lang.String intern = m6248("恩퍲淊엉怯贃톃\udf95ᡌՆ妊埍邆鷂섃켗ࣀᗖ䥃䝘脅\uec0b\uf090㺜㤉摁磅뛗놇ﲇ\ue009⸍⧆瓐", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16).intern();
                int i6 = f626 + 1;
                f627 = i6 % 128;
                if (i6 % 2 == 0) {
                    return intern;
                }
                super.hashCode();
                throw null;
            }
            if (i4 == 5) {
                return m6249(new int[]{-1752147785, -858007144, -1763914835, 8443484, 1313639681, -1221362853, 1233157180, -1211735629, -1208171018, 654264981, -976882580, -661812587, 414971468, 1704189267}, 26 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
            }
        }
        int i7 = f626 + 47;
        f627 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private java.lang.String m6246() {
        int i = 2 % 2;
        int i2 = f626 + 25;
        f627 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String name = this.f631.name();
        int i4 = f627 + 115;
        f626 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final java.lang.String m6254() {
        java.lang.String m6252;
        int i = 2 % 2;
        int i2 = f627 + 69;
        f626 = i2 % 128;
        if (i2 % 2 == 0) {
            m6252 = m6252(this.f632);
            int i3 = 75 / 0;
        } else {
            m6252 = m6252(this.f632);
        }
        int i4 = f627 + 57;
        f626 = i4 % 128;
        int i5 = i4 % 2;
        return m6252;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    final com.ironsource.adqualitysdk.sdk.i.az.a m6256() {
        int i = 2 % 2;
        int i2 = f626;
        int i3 = i2 + 43;
        f627 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.az.a aVar = this.f631;
        int i4 = i2 + 15;
        f627 = i4 % 128;
        if (i4 % 2 == 0) {
            return aVar;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6249(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f628.clone();
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m6248(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f629, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f629));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
