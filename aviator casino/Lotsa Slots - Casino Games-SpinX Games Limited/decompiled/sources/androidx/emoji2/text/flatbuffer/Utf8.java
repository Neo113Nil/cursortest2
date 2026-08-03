package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
public abstract class Utf8 {
    private static androidx.emoji2.text.flatbuffer.Utf8 DEFAULT;

    public abstract java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer);

    public abstract int encodedLength(java.lang.CharSequence charSequence);

    public static androidx.emoji2.text.flatbuffer.Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new androidx.emoji2.text.flatbuffer.Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(androidx.emoji2.text.flatbuffer.Utf8 utf8) {
        DEFAULT = utf8;
    }

    static class DecodeUtil {
        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        static boolean isOneByte(byte b) {
            return b >= 0;
        }

        static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }

        DecodeUtil() {
        }

        static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws java.lang.IllegalArgumentException {
            if (b < -62) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b2)) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.US) << 6) | trailingByteValue(b2));
        }

        static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws java.lang.IllegalArgumentException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.SI) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws java.lang.IllegalArgumentException {
            if (isNotTrailingByte(b2) || (((b << com.google.common.base.Ascii.FS) + (b2 + 112)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw new java.lang.IllegalArgumentException("Invalid UTF-8");
            }
            int trailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(trailingByteValue);
            cArr[i + 1] = lowSurrogate(trailingByteValue);
        }
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }
}
