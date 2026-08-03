package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ec {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1928 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1930;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.lang.String f1932;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ec.d f1933;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1929 = {kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1931 = -7605205605632478800L;

    public enum d {
        f1942,
        f1945,
        f1941,
        f1944,
        f1943,
        f1940,
        f1937,
        f1939;


        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f1934 = 1;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static int f1935;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int[] f1938;

        /* renamed from: ﻛ, reason: contains not printable characters */
        static void m7696() {
            f1938 = new int[]{1717058614, 1031984232, -943601397, -152405379, -1486019363, -1934155298, 1932065484, -1778533344, -1705003521, 1252470615, 1009345864, 1343019728, -1922918527, -1784794012, -1293588187, 1849672706, 1438100390, -1658116809};
        }

        public static com.ironsource.adqualitysdk.sdk.i.ec.d valueOf(java.lang.String str) {
            int i = 2 % 2;
            int i2 = f1934 + 63;
            f1935 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.ec.d dVar = (com.ironsource.adqualitysdk.sdk.i.ec.d) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.ec.d.class, str);
            if (i3 != 0) {
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = f1935 + 107;
            f1934 = i4 % 128;
            int i5 = i4 % 2;
            return dVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.ironsource.adqualitysdk.sdk.i.ec.d[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f1934 + 89;
            f1935 = i2 % 128;
            int i3 = i2 % 2;
            com.ironsource.adqualitysdk.sdk.i.ec.d[] dVarArr = (com.ironsource.adqualitysdk.sdk.i.ec.d[]) values().clone();
            int i4 = f1934 + 7;
            f1935 = i4 % 128;
            int i5 = i4 % 2;
            return dVarArr;
        }

        static {
            m7696();
            int i = f1934 + 55;
            f1935 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static java.lang.String m7697(int[] iArr, int i) {
            java.lang.String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1938.clone();
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

    public ec(com.ironsource.adqualitysdk.sdk.i.ec.d dVar, java.lang.String str) {
        this.f1933 = dVar;
        this.f1932 = str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ec.d m7693() {
        int i = 2 % 2;
        int i2 = f1928 + 105;
        int i3 = i2 % 128;
        f1930 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.ec.d dVar = this.f1933;
        int i4 = i3 + 19;
        f1928 = i4 % 128;
        int i5 = i4 % 2;
        return dVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.String m7690() {
        int i = 2 % 2;
        int i2 = f1930 + 13;
        int i3 = i2 % 128;
        f1928 = i3;
        int i4 = i2 % 2;
        java.lang.String str = this.f1932;
        int i5 = i3 + 69;
        f1930 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7692(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f1928 + 37;
        f1930 = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = this.f1932.equals(str);
        int i4 = f1930 + 21;
        f1928 = i4 % 128;
        int i5 = i4 % 2;
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (m7686() == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (m7688() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (m7688() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ec.f1928 + 65;
        com.ironsource.adqualitysdk.sdk.i.ec.f1930 = r1 % 128;
        r1 = r1 % 2;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7691() {
        int i = 2 % 2;
        if (!m7695() && !m7694()) {
            int i2 = f1930 + 35;
            f1928 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 46 / 0;
            }
        }
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m7695() {
        int i = 2 % 2;
        if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1944) {
            int i2 = f1930 + 63;
            f1928 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = f1928 + 25;
        f1930 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7694() {
        int i = 2 % 2;
        int i2 = f1928 + 71;
        f1930 = i2 % 128;
        int i3 = i2 % 2;
        if (m7693() != com.ironsource.adqualitysdk.sdk.i.ec.d.f1943) {
            return false;
        }
        int i4 = f1930 + 111;
        f1928 = i4 % 128;
        return i4 % 2 != 0;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m7688() {
        int i = 2 % 2;
        int i2 = f1930 + 59;
        f1928 = i2 % 128;
        if (i2 % 2 == 0) {
            m7693();
            com.ironsource.adqualitysdk.sdk.i.ec.d dVar = com.ironsource.adqualitysdk.sdk.i.ec.d.f1940;
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1940) {
            return true;
        }
        int i3 = f1930 + 25;
        f1928 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m7686() {
        int i = 2 % 2;
        int i2 = f1930 + 45;
        f1928 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
            if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1937) {
                return true;
            }
        } else if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1937) {
            return true;
        }
        int i4 = f1928 + 41;
        f1930 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m7685() {
        int i = 2 % 2;
        if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1941) {
            int i2 = f1928 + 59;
            f1930 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = f1930 + 87;
        f1928 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m7689() {
        int i = 2 % 2;
        int i2 = f1928 + 85;
        f1930 = i2 % 128;
        int i3 = i2 % 2;
        if (m7693() != com.ironsource.adqualitysdk.sdk.i.ec.d.f1939) {
            return false;
        }
        int i4 = f1928 + 87;
        f1930 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return true;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m7687() {
        int i = 2 % 2;
        if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1945) {
            int i2 = f1928 + 115;
            f1930 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f1928 + 95;
        f1930 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final boolean m7684() {
        int i = 2 % 2;
        int i2 = f1928 + 89;
        f1930 = i2 % 128;
        if (i2 % 2 != 0) {
            m7693();
            com.ironsource.adqualitysdk.sdk.i.ec.d dVar = com.ironsource.adqualitysdk.sdk.i.ec.d.f1942;
            throw null;
        }
        if (m7693() == com.ironsource.adqualitysdk.sdk.i.ec.d.f1942) {
            return true;
        }
        int i3 = f1928 + 93;
        f1930 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f1933);
        sb.append(m7683((char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1), (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), -((byte) android.view.KeyEvent.getModifierMetaStateMask())).intern());
        sb.append(this.f1932);
        java.lang.String obj = sb.toString();
        int i2 = f1930 + 67;
        f1928 = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7683(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f1929[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f1931)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
