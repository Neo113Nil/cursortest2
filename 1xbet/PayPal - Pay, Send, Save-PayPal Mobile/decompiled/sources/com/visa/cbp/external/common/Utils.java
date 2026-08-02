package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
class Utils {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int BuildConfig = 0;
    private static char[] ConfirmReplenishRequest = null;
    public static final byte LEN = 1;
    private static int ReplenishAckRequest;
    private static final java.lang.String TAG;
    public static final byte TAG_BYTE_ZERO = 0;
    private static short _resultLEN;
    private static short _resultTAG;
    private static int getTokenInfo;
    private static java.security.SecureRandom secureRandom;
    private static boolean valueOf;
    private static boolean values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 * 4;
        byte[] bArr = $$a;
        int i5 = (s * 5) + 111;
        int i6 = (i * 4) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i5 += -i8;
            i6++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i3++;
            i5 += -i8;
            i6++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    Utils() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ReplenishAckRequest = 0;
        getTokenInfo = 1;
        BuildConfig();
        TAG = "Utils";
        secureRandom = new java.security.SecureRandom();
        getTokenInfo = (ReplenishAckRequest + 33) % 128;
    }

    static boolean arrayCompare(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr == null) {
            int i3 = getTokenInfo + 5;
            ReplenishAckRequest = i3 % 128;
            return i3 % 2 == 0;
        }
        if (bArr2 == null) {
            return false;
        }
        int i4 = i;
        while (i4 < bArr.length + i) {
            if (bArr2[i2] == bArr[i4]) {
                i4++;
                ReplenishAckRequest = (getTokenInfo + 41) % 128;
                i2++;
            } else {
                int i5 = getTokenInfo + 95;
                ReplenishAckRequest = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        return true;
    }

    static boolean arrayCompare(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = getTokenInfo;
        ReplenishAckRequest = (i4 + 97) % 128;
        if (bArr == null) {
            ReplenishAckRequest = (i4 + 75) % 128;
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i5 = i;
        while (i5 < i + i3) {
            if (bArr2[i2] != bArr[i5]) {
                return false;
            }
            i5++;
            ReplenishAckRequest = (getTokenInfo + 71) % 128;
            i2++;
        }
        return true;
    }

    public static java.lang.String byteHexString(int i) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i2 = 65535 & i;
        if ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) == 65280) {
            int i3 = getTokenInfo + 107;
            ReplenishAckRequest = i3 % 128;
            i2 = i3 % 2 != 0 ? i & 23476 : i & 255;
        }
        if (i2 > 256 && i2 < 16) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(android.view.KeyEvent.keyCodeFromString("") + 127, null, null, "\u0081", objArr);
            stringBuffer.append(((java.lang.String) objArr[0]).intern());
        } else if (i2 > 255) {
            ReplenishAckRequest = (getTokenInfo + 3) % 128;
            if (i2 < 4096) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, null, "\u0081", objArr2);
                stringBuffer.append(((java.lang.String) objArr2[0]).intern());
                getTokenInfo = (ReplenishAckRequest + 59) % 128;
            }
        }
        stringBuffer.append(java.lang.Integer.toHexString(i2).toUpperCase(java.util.Locale.US));
        return stringBuffer.toString();
    }

    public static long convertArraytoLong(byte[] bArr, int i, int i2) {
        getTokenInfo = (ReplenishAckRequest + 101) % 128;
        long j = 0;
        long j2 = 1;
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            ReplenishAckRequest = (getTokenInfo + 87) % 128;
            j += (bArr[i3] & 255) * j2;
            j2 <<= 8;
        }
        return j;
    }

    public static long convertArraytoLong(byte[] bArr) {
        getTokenInfo = (ReplenishAckRequest + 115) % 128;
        long convertArraytoLong = convertArraytoLong(bArr, 0, bArr.length);
        int i = ReplenishAckRequest + 87;
        getTokenInfo = i % 128;
        if (i % 2 != 0) {
            return convertArraytoLong;
        }
        throw null;
    }

    public static byte[] convertToBytes(java.lang.String str) {
        int i = getTokenInfo + 77;
        ReplenishAckRequest = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str);
        byte[] bArr = new byte[stringTokenizer.countTokens()];
        ReplenishAckRequest = (getTokenInfo + 75) % 128;
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i2] = (byte) (java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken(), 16)).byteValue() & 255);
            i2++;
        }
        return bArr;
    }

    public static byte[] convertToBytes(java.lang.String str, java.lang.String str2, int i) {
        int i2 = getTokenInfo + 31;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        if (str2.equals("")) {
            ReplenishAckRequest = (getTokenInfo + 97) % 128;
            int i3 = 0;
            int i4 = 0;
            while (i3 < str.length()) {
                int i5 = getTokenInfo + 63;
                ReplenishAckRequest = i5 % 128;
                if (i5 % 2 != 0) {
                    bArr[i4] = (byte) java.lang.Integer.parseInt(str.substring(i3, i3 >>> 2), i);
                    i3 += 52;
                    i4 += 24;
                } else {
                    int i6 = i3 + 2;
                    bArr[i4] = (byte) java.lang.Integer.parseInt(str.substring(i3, i6), i);
                    i4++;
                    i3 = i6;
                }
            }
            return bArr;
        }
        return convertToBytes(str);
    }

    public static java.lang.String getHexString(byte[] bArr, int i, int i2, java.lang.String str) {
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            getTokenInfo = (ReplenishAckRequest + 37) % 128;
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 != 0) {
                    int i4 = getTokenInfo + 71;
                    ReplenishAckRequest = i4 % 128;
                    int i5 = i4 % 2;
                }
                java.lang.String hexString = java.lang.Integer.toHexString(bArr[i3 + i] & 255);
                if (hexString.length() == 1) {
                    int i6 = getTokenInfo + 45;
                    ReplenishAckRequest = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
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

    static java.lang.String getAsciiString(byte[] bArr, int i, int i2, java.lang.String str) {
        java.lang.String hexString;
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            getTokenInfo = (ReplenishAckRequest + 107) % 128;
            for (int i3 = 0; i3 < i2; i3++) {
                ReplenishAckRequest = (getTokenInfo + 17) % 128;
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

    static java.lang.String getString(byte[] bArr, int i, int i2, java.lang.String str) {
        int i3 = ReplenishAckRequest + 47;
        getTokenInfo = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.String num = java.lang.Integer.toString(bArr[i4 + i] & 255);
                if (num.length() == 1) {
                    getTokenInfo = (ReplenishAckRequest + 53) % 128;
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

    public static java.lang.String getHexString(byte[] bArr) {
        int length;
        java.lang.Object obj;
        if (bArr != null) {
            int i = ReplenishAckRequest + 31;
            getTokenInfo = i % 128;
            if (i % 2 != 0) {
                length = bArr.length;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), null, null, "\u0082", objArr);
                obj = objArr[0];
            } else {
                length = bArr.length;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(65 - android.text.TextUtils.lastIndexOf("", 'b', 0, 0), null, null, "\u0082", objArr2);
                obj = objArr2[0];
            }
            return getHexString(bArr, 0, length, ((java.lang.String) obj).intern());
        }
        getTokenInfo = (ReplenishAckRequest + 107) % 128;
        return "";
    }

    public static void arrayCopy(byte[] bArr, short s, byte[] bArr2, short s2, short s3) {
        getTokenInfo = (ReplenishAckRequest + 11) % 128;
        int i = 0;
        while (i < s3) {
            bArr2[s2 + i] = bArr[s + i];
            i++;
            getTokenInfo = (ReplenishAckRequest + 53) % 128;
        }
    }

    static long convertBCDtoLong(byte[] bArr) {
        int length;
        long j;
        int i = getTokenInfo + 119;
        ReplenishAckRequest = i % 128;
        long j2 = 0;
        if (i % 2 != 0) {
            length = bArr.length;
            j = 0;
        } else {
            length = bArr.length - 1;
            j = 1;
        }
        while (length >= 0) {
            byte b = bArr[length];
            j2 = j2 + ((b & com.google.common.base.Ascii.SI) * j) + (10 * j * (b >> 4));
            j *= 100;
            length--;
            ReplenishAckRequest = (getTokenInfo + 9) % 128;
        }
        return j2;
    }

    public static byte[] DecToBCDArray(int i) {
        int i2 = i;
        int i3 = 0;
        while (i2 != 0) {
            int i4 = ReplenishAckRequest + 51;
            getTokenInfo = i4 % 128;
            if (i4 % 2 == 0) {
                i3 += 65;
                i2 %= 94;
            } else {
                i3++;
                i2 /= 10;
            }
        }
        int i5 = i3 % 2;
        int i6 = i5 == 0 ? i3 / 2 : (i3 + 1) / 2;
        boolean z = i5 != 0;
        byte[] bArr = new byte[i6];
        for (int i7 = 0; i7 < i3; i7++) {
            ReplenishAckRequest = (getTokenInfo + 57) % 128;
            byte b = (byte) (i % 10);
            if (i7 == i3 - 1 && z) {
                bArr[i7 / 2] = b;
            } else if (i7 % 2 == 0) {
                bArr[i7 / 2] = b;
            } else {
                int i8 = i7 / 2;
                bArr[i8] = (byte) (((byte) (b << 4)) | bArr[i8]);
            }
            i /= 10;
        }
        for (int i9 = 0; i9 < i6 / 2; i9++) {
            getTokenInfo = (ReplenishAckRequest + 15) % 128;
            byte b2 = bArr[i9];
            int i10 = (i6 - i9) - 1;
            bArr[i9] = bArr[i10];
            bArr[i10] = b2;
        }
        int i11 = ReplenishAckRequest + 105;
        getTokenInfo = i11 % 128;
        if (i11 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[EDGE_INSN: B:10:0x0052->B:11:0x0052 BREAK  A[LOOP:0: B:2:0x000a->B:9:0x0046], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[LOOP:0: B:2:0x000a->B:9:0x0046, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] getBCD(java.lang.String str) {
        int i;
        int i2;
        byte[] bArr = new byte[6];
        int length = str.length() - 1;
        int i3 = 5;
        while (i3 >= 0) {
            int i4 = ReplenishAckRequest + 17;
            getTokenInfo = i4 % 128;
            if (i4 % 2 == 0) {
                i = length + 107;
                bArr[i3] = (byte) (str.charAt(length) / 'r');
                if (i < 0) {
                    break;
                }
                i2 = i - 1;
                bArr[i3] = (byte) (bArr[i3] | ((byte) ((str.charAt(i) - '0') << 4)));
                if (i2 >= 0) {
                    break;
                }
                i3--;
                ReplenishAckRequest = (getTokenInfo + 55) % 128;
                length = i2;
            } else {
                i = length - 1;
                bArr[i3] = (byte) (str.charAt(length) - '0');
                if (i < 0) {
                    break;
                }
                i2 = i - 1;
                bArr[i3] = (byte) (bArr[i3] | ((byte) ((str.charAt(i) - '0') << 4)));
                if (i2 >= 0) {
                }
            }
        }
        int i5 = ReplenishAckRequest + 113;
        getTokenInfo = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public static byte[] convertToBytes(java.lang.String str, java.lang.String str2) {
        int i = (ReplenishAckRequest + 59) % 128;
        getTokenInfo = i;
        if (str == null) {
            ReplenishAckRequest = (i + 97) % 128;
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        if (!str2.equals("")) {
            return convertToBytes(str);
        }
        ReplenishAckRequest = (getTokenInfo + 27) % 128;
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i2 + 2;
            bArr[i3] = (byte) java.lang.Integer.parseInt(str.substring(i2, i4));
            i3++;
            i2 = i4;
        }
        ReplenishAckRequest = (getTokenInfo + 43) % 128;
        return bArr;
    }

    static java.lang.String getString(byte[] bArr) {
        int i = (getTokenInfo + 103) % 128;
        ReplenishAckRequest = i;
        if (bArr != null) {
            getTokenInfo = (i + 9) % 128;
            int length = bArr.length;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u0082", objArr);
            return getHexString(bArr, 0, length, ((java.lang.String) objArr[0]).intern());
        }
        return "";
    }

    public static final short makeShort(byte b, byte b2) {
        int i = getTokenInfo;
        ReplenishAckRequest = (i + 105) % 128;
        short s = (short) ((b << 8) + (b2 & 255));
        int i2 = i + 15;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 == 0) {
            return s;
        }
        throw null;
    }

    public static final short getShort(byte[] bArr, short s) {
        int i = (getTokenInfo + 15) % 128;
        ReplenishAckRequest = i;
        short s2 = (short) ((bArr[s] << 8) + (bArr[(short) (s + 1)] & 255));
        int i2 = i + 81;
        getTokenInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return s2;
        }
        throw null;
    }

    public static final short setShort(byte[] bArr, short s, short s2) {
        int i = ReplenishAckRequest;
        getTokenInfo = (i + 69) % 128;
        bArr[s] = (byte) (s2 >> 8);
        bArr[s + 1] = (byte) s2;
        short s3 = (short) (s + 2);
        int i2 = i + 29;
        getTokenInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return s3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static short getUByte(byte[] bArr, short s) {
        int i = (getTokenInfo + 87) % 128;
        ReplenishAckRequest = i;
        short s2 = (short) (bArr[s] & 255);
        getTokenInfo = (i + 5) % 128;
        return s2;
    }

    public static short parseDOL(byte[] bArr, short s, short[] sArr) throws java.lang.ArrayIndexOutOfBoundsException {
        byte b;
        short s2;
        short s3 = s;
        while (true) {
            b = bArr[s3];
            if (b != 0 && b != -1) {
                break;
            }
            s3 = (short) (s3 + 1);
            getTokenInfo = (ReplenishAckRequest + 11) % 128;
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
                int i2 = (ReplenishAckRequest + 71) % 128;
                getTokenInfo = i2;
                s4 = (short) (s4 + 1);
                short s7 = bArr[s4];
                short s8 = sArr[1];
                if (s7 < 0) {
                    s7 = (short) (s7 + com.visa.cbp.getEncExpo.initializeViewTreeOwners);
                    ReplenishAckRequest = (i2 + 7) % 128;
                }
                short s9 = (short) (s8 + s7);
                sArr[1] = s9;
                if (s6 > 1) {
                    getTokenInfo = (ReplenishAckRequest + 75) % 128;
                    sArr[1] = (short) (s9 << 8);
                }
                i = s6 - 1;
            }
        } else {
            sArr[1] = b2;
        }
        return (short) (((short) (s4 + 1)) - s);
    }

    public static short findFS(byte[] bArr, short s) {
        int i;
        getTokenInfo = (ReplenishAckRequest + 79) % 128;
        short length = (short) bArr.length;
        for (short s2 = s; s2 < length; s2 = (short) (s2 + 1)) {
            byte b = bArr[s2];
            if ((b & com.visa.cbp.getEncExpo.onUnminimized) == -48) {
                getTokenInfo = (ReplenishAckRequest + 89) % 128;
                i = (s2 - s) << 1;
            } else if ((b & com.google.common.base.Ascii.SI) == 13) {
                i = ((s2 - s) << 1) + 1;
            }
            return (short) i;
        }
        return (short) -1;
    }

    public static void nibbleCopy(byte[] bArr, short s, byte[] bArr2, short s2, short s3) {
        int i = (ReplenishAckRequest + 101) % 128;
        getTokenInfo = i;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = s % 2 == 0;
        if (s2 % 2 == 0) {
            z2 = true;
        } else {
            ReplenishAckRequest = (i + 71) % 128;
        }
        if (z3 || z2) {
            z = z3;
        } else {
            getTokenInfo = (ReplenishAckRequest + 101) % 128;
            short s4 = (short) (s2 / 2);
            bArr2[s4] = (byte) ((bArr2[s4] & com.visa.cbp.getEncExpo.onUnminimized) + (bArr[(short) (s / 2)] & com.google.common.base.Ascii.SI));
            s3 = (short) (s3 - 1);
            s2 = (short) (s2 + 1);
            s = (short) (s + 1);
            z2 = true;
        }
        if (z && z2) {
            getTokenInfo = (ReplenishAckRequest + 59) % 128;
            arrayCopy(bArr, (short) (s / 2), bArr2, (short) (s2 / 2), (short) (s3 / 2));
            if (s3 % 2 != 0) {
                int i2 = getTokenInfo + 29;
                ReplenishAckRequest = i2 % 128;
                if (i2 % 2 != 0) {
                    short s5 = (short) (((short) (s2 + s3)) >>> 4);
                    bArr2[s5] = (byte) ((bArr2[s5] & 72) - (bArr[(short) (((short) (s / s3)) - 3)] & 11067));
                    return;
                } else {
                    short s6 = (short) (((short) (s2 + s3)) / 2);
                    bArr2[s6] = (byte) ((bArr2[s6] & com.google.common.base.Ascii.SI) + (bArr[(short) (((short) (s + s3)) / 2)] & com.visa.cbp.getEncExpo.onUnminimized));
                    return;
                }
            }
            return;
        }
        if (z2) {
            short s7 = (short) (s / 2);
            short s8 = (short) (s2 / 2);
            short s9 = (short) ((s3 / 2) + s8);
            while (s8 < s9) {
                byte b = bArr[s7];
                s7 = (short) (s7 + 1);
                bArr2[s8] = (byte) ((b << 4) + ((bArr[s7] >> 4) & 15));
                s8 = (short) (s8 + 1);
            }
            if (s3 % 2 != 0) {
                bArr2[s8] = (byte) ((bArr2[s8] & com.google.common.base.Ascii.SI) + (bArr[s7] << 4));
                return;
            }
            return;
        }
        short s10 = (short) (s2 / 2);
        short s11 = (short) (s / 2);
        short s12 = (short) ((s3 / 2) + s11);
        while (s11 < s12) {
            bArr2[s10] = (byte) ((bArr2[s10] & com.visa.cbp.getEncExpo.onUnminimized) + ((bArr[s11] >> 4) & 15));
            s10 = (short) (s10 + 1);
            bArr2[s10] = (byte) ((bArr2[s10] & com.google.common.base.Ascii.SI) + (bArr[s11] << 4));
            s11 = (short) (s11 + 1);
        }
        if (s3 % 2 != 0) {
            bArr2[s10] = (byte) ((bArr2[s10] & com.visa.cbp.getEncExpo.onUnminimized) + ((bArr[s11] >> 4) & 15));
        }
    }

    public static short setDataOffsetsFromDOL(byte[] bArr, short s, short s2, short[] sArr, short[] sArr2, short s3) {
        getTokenInfo = (ReplenishAckRequest + 53) % 128;
        short dOLdataLength = getDOLdataLength(bArr, s, s2);
        if (dOLdataLength > 127) {
            s3 = (short) (s3 + 1);
        }
        short s4 = s;
        while (s4 < ((short) (s + s2))) {
            short _parseDOL = _parseDOL(bArr, s4);
            ReplenishAckRequest = (getTokenInfo + 107) % 128;
            short s5 = 0;
            while (true) {
                if (s5 >= sArr.length) {
                    break;
                }
                if (_resultTAG == sArr[s5]) {
                    sArr2[s5] = s3;
                    break;
                }
                s5 = (short) (s5 + 1);
            }
            s3 = (short) (s3 + _resultLEN);
            s4 = (short) (s4 + _parseDOL);
        }
        return dOLdataLength;
    }

    public static short getDOLdataLength(byte[] bArr, short s, short s2) {
        int i = (ReplenishAckRequest + 17) % 128;
        getTokenInfo = i;
        ReplenishAckRequest = (i + 75) % 128;
        short s3 = 0;
        short s4 = s;
        while (s4 < ((short) (s + s2))) {
            short _parseDOL = _parseDOL(bArr, s4);
            s3 = (short) (s3 + _resultLEN);
            s4 = (short) (s4 + _parseDOL);
        }
        return s3;
    }

    private static short _parseDOL(byte[] bArr, short s) {
        byte b;
        short s2;
        short s3 = s;
        while (true) {
            b = bArr[s3];
            if (b != 0) {
                getTokenInfo = (ReplenishAckRequest + 71) % 128;
                if (b != -1) {
                    break;
                }
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
            int i = ReplenishAckRequest + 65;
            getTokenInfo = i % 128;
            _resultTAG = (short) (i % 2 == 0 ? bArr[s3] | 13197 : bArr[s3] & 255);
        } else if (s5 == 2) {
            _resultTAG = (short) ((((short) (bArr[s3] & 255)) << 8) + ((short) (bArr[(short) (s3 + 1)] & 255)));
        }
        _resultLEN = (short) (bArr[s4] & 255);
        short s6 = (short) (((short) (s4 + 1)) - s);
        ReplenishAckRequest = (getTokenInfo + 91) % 128;
        return s6;
    }

    public static byte[] XOR(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i;
        int i2 = getTokenInfo + 77;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 != 0) {
            bArr3 = new byte[bArr.length];
            i = 1;
        } else {
            bArr3 = new byte[bArr.length];
            i = 0;
        }
        while (i < bArr.length) {
            int i3 = getTokenInfo + 1;
            ReplenishAckRequest = i3 % 128;
            if (i3 % 2 != 0) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            } else {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
                i++;
            }
            i = (short) i;
        }
        return bArr3;
    }

    public static short calcKeyLength(byte[] bArr, short s, short s2) {
        int i;
        ReplenishAckRequest = (getTokenInfo + 51) % 128;
        int i2 = s2 + s;
        do {
            i2 = (short) (i2 - 1);
            if (i2 <= s) {
                return (short) 0;
            }
            i = getTokenInfo;
            ReplenishAckRequest = (i + 107) % 128;
        } while (bArr[i2] != Byte.MIN_VALUE);
        int i3 = i + 33;
        ReplenishAckRequest = i3 % 128;
        return (short) (i3 % 2 != 0 ? i2 * s : i2 - s);
    }

    byte[] copyByteArray(byte[] bArr, int i, int i2) {
        getTokenInfo = (ReplenishAckRequest + 55) % 128;
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        ReplenishAckRequest = (getTokenInfo + 23) % 128;
        return bArr2;
    }

    public static long getSecureRandomLong() {
        ReplenishAckRequest = (getTokenInfo + 71) % 128;
        long nextLong = secureRandom.nextLong();
        getTokenInfo = (ReplenishAckRequest + 39) % 128;
        return nextLong;
    }

    public static int getSecureRandomInt() {
        ReplenishAckRequest = (getTokenInfo + 57) % 128;
        int nextInt = secureRandom.nextInt();
        int i = ReplenishAckRequest + 41;
        getTokenInfo = i % 128;
        if (i % 2 != 0) {
            return nextInt;
        }
        throw new java.lang.ArithmeticException();
    }

    public static java.lang.String getSecureRandomString() {
        java.lang.String bigInteger = new java.math.BigInteger(130, secureRandom).toString(32);
        int i = getTokenInfo + 11;
        ReplenishAckRequest = i % 128;
        if (i % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    public static byte[] fillByteArrayWithRandomBytes(byte[] bArr) {
        int i = (ReplenishAckRequest + 25) % 128;
        getTokenInfo = i;
        if (bArr == null) {
            return null;
        }
        int i2 = i + 107;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 == 0) {
            if (bArr.length <= 0) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            secureRandom.nextBytes(bArr2);
            return bArr2;
        }
        int length = bArr.length;
        throw null;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i2 = $11 + 95;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr = ConfirmReplenishRequest;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30832 - android.graphics.Color.red(0)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1923, 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(BuildConfig)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 959 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 20);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b((short) 0, 0, 0, objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (values) {
                setmac.BuildConfig = bArr2.length;
                char[] cArr3 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr3[setmac.valueOf] = (char) (cArr[bArr2[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                    try {
                        java.lang.Object[] objArr5 = {setmac, setmac};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 257 - (android.os.Process.myPid() >> 22), android.os.Process.getGidForName("") + 26);
                            byte b = (byte) ($$b & 7);
                            byte b2 = (byte) (b - 1);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b(b, b2, b2, objArr6);
                            obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
                return;
            }
            if (!valueOf) {
                setmac.BuildConfig = iArr.length;
                char[] cArr4 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr4[setmac.valueOf] = (char) (cArr[iArr[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    setmac.valueOf++;
                }
                java.lang.String str4 = new java.lang.String(cArr4);
                $11 = ($10 + 49) % 128;
                objArr[0] = str4;
                return;
            }
            $11 = ($10 + 107) % 128;
            setmac.BuildConfig = charArray.length;
            char[] cArr5 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                $10 = ($11 + 111) % 128;
                cArr5[setmac.valueOf] = (char) (cArr[charArray[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                try {
                    java.lang.Object[] objArr7 = {setmac, setmac};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                    if (obj4 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.getGidForName("") + 1), (android.os.Process.myTid() >> 22) + 257, 25 - android.text.TextUtils.getOffsetAfter("", 0));
                        byte b3 = (byte) ($$b & 7);
                        byte b4 = (byte) (b3 - 1);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr8);
                        obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new java.lang.String(cArr5);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$0() {
        $$a = new byte[]{87, -43, 106, 35};
        $$b = 113;
    }

    static void BuildConfig() {
        valueOf = true;
        values = true;
        BuildConfig = 514420510;
        ConfirmReplenishRequest = new char[]{28654, 28670};
    }
}
