package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
public abstract class HexUtil {
    private static final char[] Camera2StreamConfigurationMap = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HexUtil() {
    }

    public static final java.lang.String byteArrayToHexString(byte[] bArr, int i, int i2, boolean z) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            char[] cArr = Camera2StreamConfigurationMap;
            int i4 = i + i3;
            stringBuffer.append(cArr[(bArr[i4] >> 4) & 15]);
            stringBuffer.append(cArr[bArr[i4] & com.google.common.base.Ascii.SI]);
            if (!z) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }

    public static final java.lang.String byteArrayToHexString(byte[] bArr, int i, int i2) {
        return byteArrayToHexString(bArr, i, i2, false);
    }

    public static final java.lang.String byteArrayToHexString(byte[] bArr, boolean z) {
        return byteArrayToHexString(bArr, 0, bArr.length, z);
    }

    public static final java.lang.String byteArrayToHexString(byte[] bArr) {
        return byteArrayToHexString(bArr, 0, bArr.length);
    }

    public static final byte[] hexStringToByteArray(char[] cArr, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            throw new java.lang.IllegalArgumentException("The argument 'len' can not be odd value");
        }
        byte[] bArr = new byte[i2 / 2];
        for (int i4 = 0; i4 < i2; i4++) {
            char c = cArr[i + i4];
            if ('0' <= c && c <= '9') {
                i3 = c - '0';
            } else if ('A' <= c && c <= 'F') {
                i3 = c - '7';
            } else {
                if ('a' > c || c > 'f') {
                    throw new java.lang.IllegalArgumentException("The argument 'src' can contains only HEX characters");
                }
                i3 = c - 'W';
            }
            if ((i4 & 1) != 0) {
                int i5 = i4 / 2;
                bArr[i5] = (byte) (bArr[i5] + i3);
            } else {
                bArr[i4 / 2] = (byte) (i3 << 4);
            }
        }
        return bArr;
    }

    public static final java.lang.String hexStringToAscii(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2;
            sb.append((char) java.lang.Integer.parseInt(str.substring(i, i2), 16));
            i = i2;
        }
        return sb.toString();
    }

    public static final byte[] hexStringToByteArray(char[] cArr) {
        return hexStringToByteArray(cArr, 0, cArr.length);
    }

    public static final byte[] hexStringToByteArray(java.lang.String str) {
        return hexStringToByteArray(str.toCharArray());
    }

    public static final byte[] hexStringToByteArray(java.lang.String str, char c) {
        char[] charArray = str.toCharArray();
        int i = 0;
        for (char c2 : charArray) {
            if (c2 != c) {
                charArray[i] = c2;
                i++;
            }
        }
        return hexStringToByteArray(charArray, 0, i);
    }

    public static final byte[] createByteBuffer(byte[] bArr, int i, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (bArr != null && bArr.length >= i2) {
            while (i < i2) {
                byteArrayOutputStream.write(bArr[i]);
                i++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
