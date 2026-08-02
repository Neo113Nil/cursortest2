package androidx.emoji2.text.flatbuffer;

/* loaded from: classes3.dex */
public abstract class Utf8 {
    private static androidx.emoji2.text.flatbuffer.Utf8 getHighSpeedVideoFpsRangesFor;

    /* loaded from: classes7.dex */
    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
    }

    public abstract java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer);

    public abstract int encodedLength(java.lang.CharSequence charSequence);

    public static androidx.emoji2.text.flatbuffer.Utf8 getDefault() {
        if (getHighSpeedVideoFpsRangesFor == null) {
            getHighSpeedVideoFpsRangesFor = new androidx.emoji2.text.flatbuffer.Utf8Safe();
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    public static void setDefault(androidx.emoji2.text.flatbuffer.Utf8 utf8) {
        getHighSpeedVideoFpsRangesFor = utf8;
    }

    /* loaded from: classes7.dex */
    static class DecodeUtil {
        static boolean getHighResolutionOutputSizeshNQ4ISI(byte b) {
            return b >= 0;
        }

        static boolean getHighSpeedVideoFpsRanges(byte b) {
            return b < -32;
        }

        static boolean getHighSpeedVideoFpsRangesFor(byte b) {
            return b < -16;
        }

        DecodeUtil() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        static void Camera2StreamConfigurationMap(byte b, byte b2, char[] cArr, int i) throws java.lang.IllegalArgumentException {
            if (b < -62) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (b2 > -65) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.US) << 6) | (b2 & 63));
        }

        static void getHighSpeedVideoFpsRangesFor(byte b, byte b2, byte b3, char[] cArr, int i) throws java.lang.IllegalArgumentException {
            if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || b3 > -65))) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        static void getHighResolutionOutputSizeshNQ4ISI(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws java.lang.IllegalArgumentException {
            if (b2 > -65 || (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || b3 > -65 || b4 > -65) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8");
            }
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
        }
    }
}
