package codec.net;

/* loaded from: classes7.dex */
public class PercentCodec implements codec.BinaryEncoder, codec.BinaryDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.BitSet f2815a;
    public final boolean b;
    public final int c;
    public final int d;

    public PercentCodec() {
        java.util.BitSet bitSet = new java.util.BitSet();
        this.f2815a = bitSet;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        this.b = false;
        bitSet.set(37);
        this.c = 37;
        this.d = 37;
    }

    @Override // codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws codec.DecoderException {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= bArr.length) {
                break;
            }
            if (bArr[i2] == 37) {
                i4 = 3;
            }
            i2 += i4;
            i3++;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i3);
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                try {
                    i += 2;
                    allocate.put((byte) ((com.payair.csdk.c4.a(bArr[i + 1]) << 4) + com.payair.csdk.c4.a(bArr[i])));
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    throw new codec.DecoderException("Invalid percent decoding: ", e);
                }
            } else if (this.b && b == 43) {
                allocate.put((byte) 32);
            } else {
                allocate.put(b);
            }
            i++;
        }
        return allocate.array();
    }

    @Override // codec.BinaryEncoder
    public byte[] encode(byte[] bArr) throws codec.EncoderException {
        int i;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            byte b = bArr[i2];
            if (b < 0 || (b >= this.c && b <= this.d && this.f2815a.get(b))) {
                i = 3;
            }
            i3 += i;
            i2++;
        }
        i = i3 == bArr.length ? 0 : 1;
        if (i == 0) {
            if (this.b) {
                for (byte b2 : bArr) {
                    if (b2 != 32) {
                    }
                }
            }
            return bArr;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i3);
        for (byte b3 : bArr) {
            if (i != 0 && (b3 < 0 || (b3 >= this.c && b3 <= this.d && this.f2815a.get(b3)))) {
                if (b3 < 0) {
                    b3 = (byte) (b3 + 256);
                }
                char a2 = com.payair.csdk.c4.a(b3 >> 4);
                char a3 = com.payair.csdk.c4.a((int) b3);
                allocate.put((byte) 37);
                allocate.put((byte) a2);
                allocate.put((byte) a3);
            } else if (this.b && b3 == 32) {
                allocate.put((byte) 43);
            } else {
                allocate.put(b3);
            }
        }
        return allocate.array();
    }

    @Override // codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws codec.DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be Percent decoded");
        throw new codec.DecoderException(sb.toString());
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be Percent encoded");
        throw new codec.EncoderException(sb.toString());
    }

    public PercentCodec(byte[] bArr, boolean z) {
        this.f2815a = new java.util.BitSet();
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        this.b = z;
        if (bArr != null) {
            for (byte b : bArr) {
                this.f2815a.set(b);
                if (b < this.c) {
                    this.c = b;
                }
                if (b > this.d) {
                    this.d = b;
                }
            }
        }
        this.f2815a.set(37);
        if (37 < this.c) {
            this.c = 37;
        }
        if (37 > this.d) {
            this.d = 37;
        }
    }
}
