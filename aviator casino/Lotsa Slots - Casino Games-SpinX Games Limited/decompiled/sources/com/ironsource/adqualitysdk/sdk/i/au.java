package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class au {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f447 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f448 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f449 = true;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f453 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f454 = 145;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f456;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.au.e f457;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.util.List<java.lang.String> f458;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f455 = {261, 266, 257, 246, 265, 242, 244, 243, 256, 263, 253, 264, kotlin.text.Typography.half, 214, 259, kotlin.text.Typography.plusMinus, 250, 255, 260, 249, 262, 245, 213};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f452 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f451 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f450 = 31383;

    enum e {
        f465,
        f467,
        f464,
        f463;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f460 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f461 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f462;

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m6140() {
            f462 = 95;
        }

        public static com.ironsource.adqualitysdk.sdk.i.au.e valueOf(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f461 + 79;
            f460 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.au.e eVar = (com.ironsource.adqualitysdk.sdk.i.au.e) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.au.e.class, str);
            int i4 = f460 + 9;
            f461 = i4 % 128;
            if (i4 % 2 != 0) {
                return eVar;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.ironsource.adqualitysdk.sdk.i.au.e[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f460 + 45;
            f461 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.au.e[] eVarArr = (com.ironsource.adqualitysdk.sdk.i.au.e[]) values().clone();
            int i4 = f460 + 75;
            f461 = i4 % 128;
            if (i4 % 2 != 0) {
                return eVarArr;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        static {
            m6140();
            int i = f461 + 61;
            f460 = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static java.lang.String m6139(int i, boolean z, int i2, java.lang.String str, int i3) {
            java.lang.String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
                char[] cArr3 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                    cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                    int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                    cArr3[i4] = (char) (cArr3[i4] - f462);
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                if (i3 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                    char[] cArr4 = new char[i];
                    java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                    java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                    java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                        cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                        com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new java.lang.String(cArr3);
            }
            return str2;
        }
    }

    public au(org.json.JSONObject jSONObject) {
        this.f457 = m6133(jSONObject.optString(m6135(null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0084\u0083\u0082\u0081").intern()));
        this.f458 = m6136(jSONObject.optString(m6134((char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23200), "\u0000\u0000\u0000\u0000", "얈\ue493ꁘꑚ", "䍄\ue58d", android.text.TextUtils.indexOf("", "", 0, 0)).intern()));
        this.f456 = m6132(jSONObject.optString(m6134((char) (16857 - android.view.MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "멨鏮\uda93왁", "⸁늪샧ꕗ플픍", (-1) - android.view.MotionEvent.axisFromString("")).intern()));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.au.e m6133(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f447 + 123;
        f448 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            str.hashCode();
            super.hashCode();
            throw null;
        }
        int hashCode = str.hashCode();
        char c = 65535;
        if (hashCode != 92611485) {
            if (hashCode != 93621297) {
                if (hashCode == 96946943 && !(!str.equals(m6135(null, 127 - android.view.Gravity.getAbsoluteGravity(0, 0), null, "\u0081\u0087\u0086\u0085\u0084").intern()))) {
                    int i3 = f447 + 13;
                    f448 = i3 % 128;
                    int i4 = i3 % 2;
                    c = 0;
                }
            } else if (str.equals(m6135(null, 127 - android.text.TextUtils.getCapsMode("", 0, 0), null, "\u008c\u0089\u008b\u0084\u0088").intern())) {
                c = 2;
            }
        } else if (str.equals(m6135(null, android.widget.ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0084\u008a\u0089\u0088\u0086").intern())) {
            c = 1;
        }
        if (c == 0) {
            return com.ironsource.adqualitysdk.sdk.i.au.e.f463;
        }
        if (c == 1) {
            return com.ironsource.adqualitysdk.sdk.i.au.e.f467;
        }
        if (c == 2) {
            com.ironsource.adqualitysdk.sdk.i.au.e eVar = com.ironsource.adqualitysdk.sdk.i.au.e.f464;
            int i5 = f448 + 35;
            f447 = i5 % 128;
            int i6 = i5 % 2;
            return eVar;
        }
        com.ironsource.adqualitysdk.sdk.i.au.e eVar2 = com.ironsource.adqualitysdk.sdk.i.au.e.f465;
        int i7 = f447 + 7;
        f448 = i7 % 128;
        if (i7 % 2 != 0) {
            return eVar2;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List<java.lang.String> m6136(java.lang.String str) {
        int i = 2 % 2;
        java.util.List<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (!android.text.TextUtils.isEmpty(str)) {
            int i2 = f448 + 9;
            f447 = i2 % 128;
            int i3 = i2 % 2;
            arrayList = java.util.Arrays.asList(str.split(m6135(null, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, null, "\u008d").intern()));
        }
        int i4 = f447 + 29;
        f448 = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m6132(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f447 + 115;
        f448 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            if (android.text.TextUtils.isEmpty(str) || !(!str.equals(m6134((char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44422), "\u0000\u0000\u0000\u0000", "꒞❜蘶ᾭ", "䜣জ樄月", (-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0)).intern()))) {
                return null;
            }
            int i3 = f448 + 105;
            f447 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        android.text.TextUtils.isEmpty(str);
        super.hashCode();
        throw null;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.au$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f459;

        static {
            int[] iArr = new int[com.ironsource.adqualitysdk.sdk.i.au.e.valuesCustom().length];
            f459 = iArr;
            try {
                iArr[com.ironsource.adqualitysdk.sdk.i.au.e.f465.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f459[com.ironsource.adqualitysdk.sdk.i.au.e.f463.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f459[com.ironsource.adqualitysdk.sdk.i.au.e.f464.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f459[com.ironsource.adqualitysdk.sdk.i.au.e.f467.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6138(java.lang.String str) {
        int i;
        int i2 = 2 % 2;
        try {
            i = com.ironsource.adqualitysdk.sdk.i.au.AnonymousClass4.f459[this.f457.ordinal()];
        } catch (java.lang.Exception e2) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m6134((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "\uea2c斂聉\uf291", "슄ꊚ届\uf5e8ሜ᪔㣁돀\ude2cထ㵜뻢씫ʑ㜆\uf090悤놶ô炳辧襧", android.view.ViewConfiguration.getTouchSlop() >> 8).intern(), m6135(null, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0084\u008b\u0088\u0086\u0093\u0091\u0097\u0096\u008b\u0095\u0089\u0094\u0093\u0090\u0092\u0091\u0090\u008f\u0089\u008f\u008f\u008e").intern(), (java.lang.Throwable) e2, false);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.f458.contains(str);
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
        } else if (this.f458.size() > 0) {
            int i3 = f447 + 87;
            f448 = i3 % 128;
            int i4 = i3 % 2;
            if (com.ironsource.adqualitysdk.sdk.i.kn.m8467(str, this.f458.get(0)) >= 0) {
                return false;
            }
            int i5 = f447 + 31;
            f448 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (this.f458.size() <= 0 || com.ironsource.adqualitysdk.sdk.i.kn.m8467(str, this.f458.get(0)) < 0) {
            return false;
        }
        int i7 = f448 + 91;
        f447 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m6137() {
        int i = 2 % 2;
        int i2 = f448 + 79;
        int i3 = i2 % 128;
        f447 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f456;
        int i5 = i3 + 119;
        f448 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m6135(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.k.f2966) {
            char[] cArr3 = f455;
            int i2 = f454;
            if (f453) {
                int length = bArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length;
                char[] cArr4 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[bArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] + i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr4);
            }
            if (f449) {
                int length2 = cArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length2;
                char[] cArr5 = new char[length2];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[cArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr5);
            }
            int length3 = iArr.length;
            com.ironsource.adqualitysdk.sdk.i.k.f2965 = length3;
            char[] cArr6 = new char[length3];
            com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                cArr6[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[iArr[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                com.ironsource.adqualitysdk.sdk.i.k.f2967++;
            }
            return new java.lang.String(cArr6);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m6134(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
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
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f452) ^ f451) ^ f450);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
