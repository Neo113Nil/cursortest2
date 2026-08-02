package common.emv.util;

/* loaded from: classes17.dex */
public class HexUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6718a = "0123456789ABCDEF".toCharArray();

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return 15;
        }
        return c - 'W';
    }

    public static boolean memcmp(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i4++;
            i2++;
        }
        return true;
    }

    public static java.lang.String encodeToString(byte[] bArr, int i, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i2 * 2);
        try {
            encode(byteArrayOutputStream, bArr, i, i2);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return new java.lang.String(byteArrayOutputStream.toByteArray());
    }

    public static java.lang.String encodeToString(byte[] bArr) {
        return encodeToString(bArr, 0, bArr.length);
    }

    public static void encode(java.io.OutputStream outputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i2 + i;
        if (bArr.length < i3) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        while (i < i3) {
            byte b = bArr[i];
            char[] cArr = f6718a;
            outputStream.write(cArr[(b & 255) >> 4]);
            outputStream.write(cArr[b & com.google.common.base.Ascii.SI]);
            i++;
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(str.length() / 2);
        try {
            decode(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static void decode(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            outputStream.write(a(charArray[i + 1]) | (a(charArray[i]) << 4));
        }
    }
}
