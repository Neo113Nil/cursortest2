package my.com.softspace.reader.internal.encoding;

/* loaded from: classes17.dex */
public class SimpleTlvEncoding {
    public static byte[] decode(byte[] bArr) {
        return my.com.softspace.reader.internal.kernelconfig.BerTlv.create(bArr).getValue();
    }

    public static byte[] encode(int i, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
            i = 1;
        }
        byte[] encodeLength = my.com.softspace.reader.internal.kernelconfig.BerTlv.encodeLength(bArr.length);
        int length = encodeLength.length + 4 + bArr.length;
        byte[] bArr2 = new byte[length];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[length]);
        wrap.put((byte) 1);
        wrap.put((byte) 1);
        wrap.put((byte) (i & 255));
        wrap.put((byte) 2);
        wrap.put(encodeLength);
        wrap.put(bArr);
        return wrap.array();
    }
}
