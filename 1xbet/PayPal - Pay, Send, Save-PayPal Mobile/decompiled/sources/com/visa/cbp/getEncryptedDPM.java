package com.visa.cbp;

/* loaded from: classes5.dex */
class getEncryptedDPM implements com.visa.cbp.getEncExpo {
    private static final java.lang.String Camera2StreamConfigurationMap = "getEncryptedDPM";
    private static short getHighResolutionOutputSizeshNQ4ISI = 0;
    public static final byte getHighSpeedVideoFpsRanges = 1;
    private static short getHighSpeedVideoFpsRangesFor;
    public static final byte getHighSpeedVideoSizes = 0;

    public static final short getHighSpeedVideoFpsRangesFor(byte b, byte b2) {
        return (short) ((b << 8) + (b2 & 255));
    }

    getEncryptedDPM() {
    }

    static boolean getHighSpeedVideoFpsRanges(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr == null) {
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i3 = i;
        while (i3 < bArr.length + i) {
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i3++;
            i2++;
        }
        return true;
    }

    static boolean getHighSpeedVideoSizes(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i4 = i;
        while (i4 < i + i3) {
            if (bArr2[i2] != bArr[i4]) {
                return false;
            }
            i4++;
            i2++;
        }
        return true;
    }

    public static java.lang.String Camera2StreamConfigurationMap(int i) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i2 = 65535 & i;
        if ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) == 65280) {
            i2 = i & 255;
        }
        if (i2 > 256 && i2 < 16) {
            stringBuffer.append("0");
        } else if (i2 > 255 && i2 < 4096) {
            stringBuffer.append("0");
        }
        stringBuffer.append(java.lang.Integer.toHexString(i2).toUpperCase(java.util.Locale.US));
        return stringBuffer.toString();
    }

    public static long getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
        long j = 0;
        long j2 = 1;
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            j += (bArr[i3] & 255) * j2;
            j2 <<= 8;
        }
        return j;
    }

    public static long Camera2StreamConfigurationMap(byte[] bArr) {
        return getHighSpeedVideoFpsRangesFor(bArr, 0, bArr.length);
    }

    public static byte[] Camera2StreamConfigurationMap(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str);
        byte[] bArr = new byte[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i] = (byte) (java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken(), 16)).byteValue() & 255);
            i++;
        }
        return bArr;
    }

    public static byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, int i) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        if (str2.equals("")) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < str.length()) {
                int i4 = i2 + 2;
                bArr[i3] = (byte) java.lang.Integer.parseInt(str.substring(i2, i4), i);
                i3++;
                i2 = i4;
            }
            return bArr;
        }
        return Camera2StreamConfigurationMap(str);
    }

    public static java.lang.String getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, java.lang.String str) {
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                java.lang.String hexString = java.lang.Integer.toHexString(bArr[i3 + i] & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(java.lang.String.valueOf(hexString));
                }
                java.lang.String upperCase = hexString.toUpperCase(java.util.Locale.US);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(str);
                stringBuffer.append(sb.toString());
            }
            return stringBuffer.toString();
        }
        return "";
    }

    static java.lang.String Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, java.lang.String str) {
        java.lang.String hexString;
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b = bArr[i3 + i];
                if (b >= 32 && b <= 125) {
                    hexString = java.lang.String.valueOf((char) (b & 255));
                } else {
                    hexString = java.lang.Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(java.lang.String.valueOf(hexString));
                    }
                }
                java.lang.String upperCase = hexString.toUpperCase(java.util.Locale.US);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(str);
                stringBuffer.append(sb.toString());
            }
            return stringBuffer.toString();
        }
        return "";
    }

    static java.lang.String getHighSpeedVideoSizes(byte[] bArr, int i, int i2, java.lang.String str) {
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                java.lang.String num = java.lang.Integer.toString(bArr[i3 + i] & 255);
                if (num.length() == 1) {
                    num = "0".concat(java.lang.String.valueOf(num));
                }
                java.lang.String upperCase = num.toUpperCase(java.util.Locale.US);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(str);
                stringBuffer.append(sb.toString());
            }
            return stringBuffer.toString();
        }
        return "";
    }

    public static java.lang.String getHighSpeedVideoFpsRanges(byte[] bArr) {
        if (bArr != null) {
            return getHighResolutionOutputSizeshNQ4ISI(bArr, 0, bArr.length, " ");
        }
        return "";
    }

    public static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, short s, byte[] bArr2, short s2, short s3) {
        for (int i = 0; i < s3; i++) {
            bArr2[s2 + i] = bArr[s + i];
        }
    }

    static long getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        long j = 0;
        long j2 = 1;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = bArr[length];
            j = j + ((b & com.google.common.base.Ascii.SI) * j2) + (10 * j2 * (b >> 4));
            j2 *= 100;
        }
        return j;
    }

    public static byte[] getHighSpeedVideoSizes(int i) {
        int i2 = 0;
        for (int i3 = i; i3 != 0; i3 /= 10) {
            i2++;
        }
        int i4 = i2 % 2;
        int i5 = i4 == 0 ? i2 / 2 : (i2 + 1) / 2;
        boolean z = i4 != 0;
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i2; i6++) {
            byte b = (byte) (i % 10);
            if (i6 == i2 - 1 && z) {
                bArr[i6 / 2] = b;
            } else if (i6 % 2 == 0) {
                bArr[i6 / 2] = b;
            } else {
                int i7 = i6 / 2;
                bArr[i7] = (byte) (((byte) (b << 4)) | bArr[i7]);
            }
            i /= 10;
        }
        for (int i8 = 0; i8 < i5 / 2; i8++) {
            byte b2 = bArr[i8];
            int i9 = (i5 - i8) - 1;
            bArr[i8] = bArr[i9];
            bArr[i9] = b2;
        }
        return bArr;
    }

    static byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        byte[] bArr = new byte[6];
        int length = str.length() - 1;
        for (int i = 5; i >= 0; i--) {
            int i2 = length - 1;
            byte charAt = (byte) (str.charAt(length) - '0');
            bArr[i] = charAt;
            if (i2 < 0) {
                break;
            }
            length -= 2;
            bArr[i] = (byte) (((byte) ((str.charAt(i2) - '0') << 4)) | charAt);
            if (length < 0) {
                break;
            }
        }
        return bArr;
    }

    public static byte[] getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        if (str2.equals("")) {
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                int i3 = i + 2;
                bArr[i2] = (byte) java.lang.Integer.parseInt(str.substring(i, i3));
                i2++;
                i = i3;
            }
            return bArr;
        }
        return Camera2StreamConfigurationMap(str);
    }

    static java.lang.String getHighSpeedVideoSizes(byte[] bArr) {
        if (bArr != null) {
            return getHighResolutionOutputSizeshNQ4ISI(bArr, 0, bArr.length, " ");
        }
        return "";
    }

    public static final short Camera2StreamConfigurationMap(byte[] bArr, short s) {
        return (short) ((bArr[s] << 8) + (bArr[(short) (s + 1)] & 255));
    }

    public static final short Camera2StreamConfigurationMap(byte[] bArr, short s, short s2) {
        bArr[s] = (byte) (s2 >> 8);
        bArr[s + 1] = (byte) s2;
        return (short) (s + 2);
    }

    public static java.lang.String getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        return new java.lang.String(com.visa.cbp.external.common.Hex.encode(bArr));
    }

    public static byte[] getHighSpeedVideoFpsRanges(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) | java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static short getHighSpeedVideoFpsRangesFor(byte[] bArr, short s) {
        return (short) (bArr[s] & 255);
    }

    public static short getHighSpeedVideoFpsRangesFor(byte[] bArr, short s, short[] sArr) throws java.lang.ArrayIndexOutOfBoundsException {
        byte b;
        short s2;
        short s3 = s;
        while (true) {
            b = bArr[s3];
            if (b != 0 && b != -1) {
                break;
            }
            s3 = (short) (s3 + 1);
        }
        if ((b & com.google.common.base.Ascii.US) == 31) {
            s2 = s3;
            do {
                s2 = (short) (s2 + 1);
            } while ((bArr[s2] & 128) == 128);
        } else {
            s2 = s3;
        }
        short s4 = (short) (s2 + 1);
        short s5 = (short) (s4 - s3);
        if (s5 == 1) {
            sArr[0] = (short) (bArr[s3] & 255);
        } else if (s5 == 2) {
            sArr[0] = (short) ((((short) (bArr[s3] & 255)) << 8) + ((short) (bArr[(short) (s3 + 1)] & 255)));
        }
        sArr[1] = 0;
        byte b2 = bArr[s4];
        if ((b2 & Byte.MIN_VALUE) != 0) {
            int i = b2 & Byte.MAX_VALUE;
            while (true) {
                short s6 = (short) i;
                if (s6 <= 0) {
                    break;
                }
                s4 = (short) (s4 + 1);
                short s7 = bArr[s4];
                short s8 = sArr[1];
                if (s7 < 0) {
                    s7 = (short) (s7 + com.visa.cbp.getEncExpo.initializeViewTreeOwners);
                }
                short s9 = (short) (s8 + s7);
                sArr[1] = s9;
                if (s6 > 1) {
                    sArr[1] = (short) (s9 << 8);
                }
                i = s6 - 1;
            }
        } else {
            sArr[1] = b2;
        }
        return (short) (((short) (s4 + 1)) - s);
    }

    public static short getHighSpeedVideoFpsRanges(byte[] bArr, short s) {
        int i;
        short length = (short) bArr.length;
        for (short s2 = s; s2 < length; s2 = (short) (s2 + 1)) {
            byte b = bArr[s2];
            if ((b & com.visa.cbp.getEncExpo.onUnminimized) == -48) {
                i = (s2 - s) << 1;
            } else if ((b & com.google.common.base.Ascii.SI) == 13) {
                i = ((s2 - s) << 1) + 1;
            }
            return (short) i;
        }
        return (short) -1;
    }

    public static void getHighSpeedVideoFpsRanges(byte[] bArr, short s, byte[] bArr2, short s2, short s3) {
        boolean z = true;
        boolean z2 = s % 2 == 0;
        boolean z3 = s2 % 2 == 0;
        if (z2 || z3) {
            z = z2;
        } else {
            short s4 = (short) (s2 / 2);
            bArr2[s4] = (byte) ((bArr2[s4] & com.visa.cbp.getEncExpo.onUnminimized) + (bArr[(short) (s / 2)] & com.google.common.base.Ascii.SI));
            s3 = (short) (s3 - 1);
            s2 = (short) (s2 + 1);
            s = (short) (s + 1);
            z3 = true;
        }
        if (z && z3) {
            getHighResolutionOutputSizeshNQ4ISI(bArr, (short) (s / 2), bArr2, (short) (s2 / 2), (short) (s3 / 2));
            if (s3 % 2 != 0) {
                short s5 = (short) (((short) (s2 + s3)) / 2);
                bArr2[s5] = (byte) ((bArr2[s5] & com.google.common.base.Ascii.SI) + (bArr[(short) (((short) (s + s3)) / 2)] & com.visa.cbp.getEncExpo.onUnminimized));
                return;
            }
            return;
        }
        if (z3) {
            short s6 = (short) (s / 2);
            short s7 = (short) (s2 / 2);
            short s8 = (short) ((s3 / 2) + s7);
            while (s7 < s8) {
                byte b = bArr[s6];
                s6 = (short) (s6 + 1);
                bArr2[s7] = (byte) ((b << 4) + ((bArr[s6] >> 4) & 15));
                s7 = (short) (s7 + 1);
            }
            if (s3 % 2 != 0) {
                bArr2[s7] = (byte) ((bArr2[s7] & com.google.common.base.Ascii.SI) + (bArr[s6] << 4));
                return;
            }
            return;
        }
        short s9 = (short) (s2 / 2);
        short s10 = (short) (s / 2);
        short s11 = (short) ((s3 / 2) + s10);
        while (s10 < s11) {
            bArr2[s9] = (byte) ((bArr2[s9] & com.visa.cbp.getEncExpo.onUnminimized) + ((bArr[s10] >> 4) & 15));
            s9 = (short) (s9 + 1);
            bArr2[s9] = (byte) ((bArr2[s9] & com.google.common.base.Ascii.SI) + (bArr[s10] << 4));
            s10 = (short) (s10 + 1);
        }
        if (s3 % 2 != 0) {
            bArr2[s9] = (byte) ((bArr2[s9] & com.visa.cbp.getEncExpo.onUnminimized) + ((bArr[s10] >> 4) & 15));
        }
    }

    public static short Camera2StreamConfigurationMap(byte[] bArr, short s, short s2, short[] sArr, short[] sArr2, short s3) {
        short highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, s, s2);
        if (highSpeedVideoSizes > 127) {
            s3 = (short) (s3 + 1);
        }
        short s4 = s;
        while (s4 < ((short) (s + s2))) {
            short highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, s4);
            short s5 = 0;
            while (true) {
                if (s5 >= sArr.length) {
                    break;
                }
                if (getHighResolutionOutputSizeshNQ4ISI == sArr[s5]) {
                    sArr2[s5] = s3;
                    break;
                }
                s5 = (short) (s5 + 1);
            }
            s3 = (short) (s3 + getHighSpeedVideoFpsRangesFor);
            s4 = (short) (s4 + highResolutionOutputSizeshNQ4ISI);
        }
        return highSpeedVideoSizes;
    }

    public static short getHighSpeedVideoSizes(byte[] bArr, short s, short s2) {
        short s3 = 0;
        short s4 = s;
        while (s4 < ((short) (s + s2))) {
            short highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, s4);
            s3 = (short) (s3 + getHighSpeedVideoFpsRangesFor);
            s4 = (short) (s4 + highResolutionOutputSizeshNQ4ISI);
        }
        return s3;
    }

    private static short getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, short s) {
        byte b;
        short s2;
        short s3 = s;
        while (true) {
            b = bArr[s3];
            if (b != 0 && b != -1) {
                break;
            }
            s3 = (short) (s3 + 1);
        }
        if ((b & com.google.common.base.Ascii.US) == 31) {
            s2 = s3;
            do {
                s2 = (short) (s2 + 1);
            } while ((bArr[s2] & 128) == 128);
        } else {
            s2 = s3;
        }
        short s4 = (short) (s2 + 1);
        short s5 = (short) (s4 - s3);
        if (s5 == 1) {
            getHighResolutionOutputSizeshNQ4ISI = (short) (bArr[s3] & 255);
        } else if (s5 == 2) {
            getHighResolutionOutputSizeshNQ4ISI = (short) ((((short) (bArr[s3] & 255)) << 8) + ((short) (bArr[(short) (s3 + 1)] & 255)));
        }
        getHighSpeedVideoFpsRangesFor = (short) (bArr[s4] & 255);
        return (short) (((short) (s4 + 1)) - s);
    }

    public static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (short s = 0; s < bArr.length; s = (short) (s + 1)) {
            bArr3[s] = (byte) (bArr[s] ^ bArr2[s]);
        }
        return bArr3;
    }

    public static short getHighSpeedVideoFpsRanges(byte[] bArr, short s, short s2) {
        int i = s2 + s;
        do {
            i = (short) (i - 1);
            if (i <= s) {
                return (short) 0;
            }
        } while (bArr[i] != Byte.MIN_VALUE);
        return (short) (i - s);
    }

    public static boolean getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short s = 11;
        byte b = 0;
        while (true) {
            if (s < 0) {
                break;
            }
            b = (byte) (bArr[s] + bArr2[s] + (b <= 9 ? 0 : 1));
            short s2 = (short) (s - 1);
            bArr3[s] = (byte) (b - (b > 9 ? (byte) 10 : (byte) 0));
            s = s2;
        }
        return b <= 9;
    }

    byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        char[] charArray = str.toCharArray();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (char c : charArray) {
            stringBuffer.append(java.lang.Integer.toHexString(c));
        }
        return stringBuffer.toString();
    }
}
