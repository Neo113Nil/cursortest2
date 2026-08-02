package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER;

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite> {
        T findValueByNumber(int i);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return kotlin.reflect.jvm.internal.impl.protobuf.Utf8.getHighSpeedVideoFpsRanges(bArr);
    }

    public static java.lang.String toStringUtf8(byte[] bArr) {
        try {
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = java.nio.ByteBuffer.wrap(bArr);
    }
}
