package util.h.xy.cy;

/* loaded from: classes5.dex */
public final class ma {
    private static long Camera2StreamConfigurationMap = 2457411417541981002L;
    private static char getHighResolutionOutputSizeshNQ4ISI = 14066;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 294925130;
    private static int getOutputFormats = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26116(byte[]... bArr) {
        int length;
        int i;
        int i2 = getOutputFormats + 117;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            length = bArr.length;
            i = 1;
        } else {
            length = bArr.length;
            i = 0;
        }
        while (i < length) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 47) % 128;
            m26113(bArr[i]);
            i++;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26113(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getOutputFormats = (i + 119) % 128;
        if (bArr == null) {
            int i2 = i + 109;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = getHighSpeedVideoFpsRanges + 57;
            getOutputFormats = i4 % 128;
            if (i4 % 2 == 0) {
                bArr[i3] = -1;
                i3 += 94;
            } else {
                bArr[i3] = -1;
                i3++;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26114(char[]... cArr) {
        for (char[] cArr2 : cArr) {
            if (cArr2 != null) {
                int length = cArr2.length;
                int i = 0;
                while (i < length) {
                    cArr2[i] = 255;
                    i++;
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 93) % 128;
                }
            } else {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 93) % 128;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26119(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 15;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        getOutputFormats = (i + 7) % 128;
        return false;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 15) % 128;
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 97) % 128;
        char[] cArr = charArray2;
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i2]) % 65535);
            cArr3[i3] = (char) (((cArr2[i3] * 32718) + cArr3[i2]) / 65535);
            cArr2[i3] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i3] ^ charArray3[rcVar.f2652]) ^ (Camera2StreamConfigurationMap ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 93) % 128;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26117(byte[] bArr, byte[] bArr2) throws java.lang.IllegalArgumentException {
        int i = 0;
        if (!m26119(bArr)) {
            int i2 = getHighSpeedVideoFpsRanges + 91;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                m26119(bArr2);
                throw new java.lang.ArithmeticException();
            }
            if (!m26119(bArr2)) {
                if (bArr.length != bArr2.length) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ⳮ൳癑䴣䖩맕\uec18䓚춀ﱝ췲㉭兜뇺리ݮ㽻렍刵t\udd11ᣎ䞦뢩\ue77dႛ樰쐪䖊쥺鍏십䢦蜽摶쨅镛솒鐹뺮空镠Ꜳ鴯\ue51e븘㜀\ue34c༣ặ켰ﲎꞵ䲟\ude93ﭏ唦滚塊䁷予ǫ렑馡핌睜먴", (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 224), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 479337249, "\udf77淤\ue0e3鄀", "\u0000\u0000\u0000\u0000", objArr);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                }
                int length = bArr.length;
                byte[] bArr3 = new byte[length];
                while (i < length) {
                    int i3 = (getHighSpeedVideoFpsRanges + 35) % 128;
                    getOutputFormats = i3;
                    bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
                    i++;
                    getHighSpeedVideoFpsRanges = (i3 + 73) % 128;
                }
                return bArr3;
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ue05e玓ꋩ甫\ue3e3ꓚ懮홨࿗霎\ue453읋靓\ue14eᢢ黗ꭾꞣ牜춥怏㴒鑓፳\uec3e蹋⠶௳", (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 11409), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "䘜눗鄗찬", "\u0000\u0000\u0000\u0000", objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26120(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length;
        int i;
        int i2 = getOutputFormats + 77;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            bArr3 = new byte[bArr.length];
            length = bArr2.length;
            i = 1;
        } else {
            bArr3 = new byte[bArr.length];
            length = bArr2.length;
            i = 0;
        }
        while (i < length) {
            int i3 = getHighSpeedVideoFpsRanges;
            getOutputFormats = (i3 + 105) % 128;
            bArr3[i] = bArr[bArr2[i]];
            i++;
            getOutputFormats = (i3 + 103) % 128;
        }
        return bArr3;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26122(byte[] bArr, byte[] bArr2) {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 17) % 128;
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr2.length;
        for (int i = 0; i < length; i++) {
            bArr3[bArr2[i]] = bArr[i];
        }
        getHighSpeedVideoFpsRanges = (getOutputFormats + 101) % 128;
        return bArr3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m26115(int i) throws util.h.xy.da.b {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 103) % 128;
        if (i <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("酖詠쀩瑸Ѡϵ䥐ि罧냚蟿栃ݏ莢餕쐉䝍⦿쎼璋첵잺⺧", (char) android.view.View.resolveSize(0, 0), (-1336550347) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "㔪嗜鞰參", "\u0000\u0000\u0000\u0000", objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr = new byte[4];
        util.h.xy.cw.c.m26082().mo26126(bArr);
        int abs = java.lang.Math.abs(java.nio.ByteBuffer.wrap(bArr).getInt());
        int i2 = getOutputFormats + 101;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return abs % i;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m26112(byte[] bArr) throws util.h.xy.da.b {
        int i = (getHighSpeedVideoFpsRanges + 77) % 128;
        getOutputFormats = i;
        int length = bArr.length;
        int i2 = i + 23;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 2;
        }
        for (int i4 = 0; i4 < length; i4++) {
            int m26115 = m26115(length);
            byte b = bArr[i4];
            bArr[i4] = bArr[m26115];
            bArr[m26115] = b;
        }
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26121(byte[] bArr) {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 81) % 128;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            bArr[i] = (byte) i;
            i++;
            getOutputFormats = (getHighSpeedVideoFpsRanges + 125) % 128;
        }
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static char[] m26118(byte[] bArr) {
        int i = (getHighSpeedVideoFpsRanges + 115) % 128;
        getOutputFormats = i;
        int length = bArr.length;
        char[] cArr = new char[length];
        getHighSpeedVideoFpsRanges = (i + 49) % 128;
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = (char) bArr[i2];
        }
        return cArr;
    }
}
