package codec.binary;

/* loaded from: classes3.dex */
public abstract class BaseNCodec implements codec.BinaryEncoder, codec.BinaryDecoder {
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @java.lang.Deprecated
    protected final byte PAD;

    /* renamed from: a, reason: collision with root package name */
    public final int f2763a;
    public final int b;
    public final int c;
    protected final int lineLength;
    protected final byte pad;

    public BaseNCodec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    public static int c(byte[] bArr, int i, int i2, codec.binary.a aVar) {
        if (aVar.c == null) {
            return aVar.f ? -1 : 0;
        }
        int min = java.lang.Math.min(aVar.d - aVar.e, i2);
        java.lang.System.arraycopy(aVar.c, aVar.e, bArr, i, min);
        int i3 = aVar.e + min;
        aVar.e = i3;
        if (i3 >= aVar.d) {
            aVar.c = null;
        }
        return min;
    }

    public static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    public abstract void a(byte[] bArr, int i, int i2, codec.binary.a aVar);

    public abstract void b(byte[] bArr, int i, int i2, codec.binary.a aVar);

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.pad == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    @Override // codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws codec.DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof java.lang.String) {
            return decode((java.lang.String) obj);
        }
        throw new codec.DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public java.lang.String encodeAsString(byte[] bArr) {
        return codec.binary.StringUtils.newStringUtf8(encode(bArr));
    }

    public java.lang.String encodeToString(byte[] bArr) {
        return codec.binary.StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i, codec.binary.a aVar) {
        byte[] bArr = aVar.c;
        if (bArr != null && bArr.length >= aVar.d + i) {
            return bArr;
        }
        if (bArr == null) {
            aVar.c = new byte[getDefaultBufferSize()];
            aVar.d = 0;
            aVar.e = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.c = bArr2;
        }
        return aVar.c;
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.f2763a;
        long j = (((length + i) - 1) / i) * this.b;
        int i2 = this.lineLength;
        if (i2 <= 0) {
            return j;
        }
        long j2 = i2;
        return ((((j + j2) - 1) / j2) * this.c) + j;
    }

    public abstract boolean isInAlphabet(byte b);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        for (byte b : bArr) {
            if (!isInAlphabet(b) && (!z || (b != this.pad && !isWhiteSpace(b)))) {
                return false;
            }
        }
        return true;
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b) {
        this.PAD = (byte) 61;
        this.f2763a = i;
        this.b = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.c = i4;
        this.pad = b;
    }

    public boolean isInAlphabet(java.lang.String str) {
        return isInAlphabet(codec.binary.StringUtils.getBytesUtf8(str), true);
    }

    @Override // codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : encode(bArr, 0, bArr.length);
    }

    public byte[] decode(java.lang.String str) {
        return decode(codec.binary.StringUtils.getBytesUtf8(str));
    }

    @Override // codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        codec.binary.a aVar = new codec.binary.a();
        a(bArr, 0, bArr.length, aVar);
        a(bArr, 0, -1, aVar);
        int i = aVar.d;
        byte[] bArr2 = new byte[i];
        c(bArr2, 0, i, aVar);
        return bArr2;
    }

    public byte[] encode(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        codec.binary.a aVar = new codec.binary.a();
        b(bArr, i, i2, aVar);
        b(bArr, i, -1, aVar);
        int i3 = aVar.d - aVar.e;
        byte[] bArr2 = new byte[i3];
        c(bArr2, 0, i3, aVar);
        return bArr2;
    }
}
