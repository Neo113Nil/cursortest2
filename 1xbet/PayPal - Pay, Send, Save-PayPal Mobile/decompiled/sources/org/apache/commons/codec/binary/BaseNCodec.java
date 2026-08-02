package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public abstract class BaseNCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder {
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    private final int Camera2StreamConfigurationMap;

    @java.lang.Deprecated
    protected final byte PAD;
    private final org.apache.commons.codec.CodecPolicy getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    protected final int lineLength;
    protected final byte pad;
    protected static final org.apache.commons.codec.CodecPolicy DECODING_POLICY_DEFAULT = org.apache.commons.codec.CodecPolicy.LENIENT;
    static final byte[] getHighResolutionOutputSizeshNQ4ISI = {13, 10};

    protected int getDefaultBufferSize() {
        return 8192;
    }

    abstract void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context);

    abstract void getHighSpeedVideoSizes(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context);

    protected abstract boolean isInAlphabet(byte b);

    static class Context {
        int Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        byte[] getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        int getInputSizeshNQ4ISI;
        int getOutputFormats;

        Context() {
        }

        public java.lang.String toString() {
            return java.lang.String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Integer.valueOf(this.getOutputFormats), java.lang.Integer.valueOf(this.getHighSpeedVideoSizesFor), java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI));
        }
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    @java.lang.Deprecated
    protected static boolean isWhiteSpace(byte b) {
        return java.lang.Character.isWhitespace(b);
    }

    protected BaseNCodec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    protected BaseNCodec(int i, int i2, int i3, int i4, byte b) {
        this(i, i2, i3, i4, b, DECODING_POLICY_DEFAULT);
    }

    protected BaseNCodec(int i, int i2, int i3, int i4, byte b, org.apache.commons.codec.CodecPolicy codecPolicy) {
        this.PAD = (byte) 61;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.Camera2StreamConfigurationMap = i4;
        this.pad = b;
        this.getHighSpeedVideoFpsRanges = (org.apache.commons.codec.CodecPolicy) java.util.Objects.requireNonNull(codecPolicy, "codecPolicy");
    }

    protected boolean containsAlphabetOrPad(byte[] bArr) {
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

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (org.apache.commons.codec.binary.BinaryCodec.Camera2StreamConfigurationMap(bArr)) {
            return bArr;
        }
        org.apache.commons.codec.binary.BaseNCodec.Context context = new org.apache.commons.codec.binary.BaseNCodec.Context();
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, bArr.length, context);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, -1, context);
        int i = context.getHighSpeedVideoSizesFor;
        byte[] bArr2 = new byte[i];
        getHighSpeedVideoFpsRanges(bArr2, 0, i, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws org.apache.commons.codec.DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof java.lang.String) {
            return decode((java.lang.String) obj);
        }
        throw new org.apache.commons.codec.DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] decode(java.lang.String str) {
        return decode(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str));
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return org.apache.commons.codec.binary.BinaryCodec.Camera2StreamConfigurationMap(bArr) ? bArr : encode(bArr, 0, bArr.length);
    }

    public byte[] encode(byte[] bArr, int i, int i2) {
        if (org.apache.commons.codec.binary.BinaryCodec.Camera2StreamConfigurationMap(bArr)) {
            return bArr;
        }
        org.apache.commons.codec.binary.BaseNCodec.Context context = new org.apache.commons.codec.binary.BaseNCodec.Context();
        getHighSpeedVideoSizes(bArr, i, i2, context);
        getHighSpeedVideoSizes(bArr, i, -1, context);
        int i3 = context.getHighSpeedVideoSizesFor - context.getInputSizeshNQ4ISI;
        byte[] bArr2 = new byte[i3];
        getHighSpeedVideoFpsRanges(bArr2, 0, i3, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof byte[])) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to Base-N encode is not a byte[]");
        }
        return encode((byte[]) obj);
    }

    public java.lang.String encodeAsString(byte[] bArr) {
        return org.apache.commons.codec.binary.StringUtils.newStringUtf8(encode(bArr));
    }

    public java.lang.String encodeToString(byte[] bArr) {
        return org.apache.commons.codec.binary.StringUtils.newStringUtf8(encode(bArr));
    }

    protected byte[] ensureBufferSize(int i, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighSpeedVideoFpsRangesFor == null) {
            context.getHighSpeedVideoFpsRangesFor = new byte[java.lang.Math.max(i, getDefaultBufferSize())];
            context.getHighSpeedVideoSizesFor = 0;
            context.getInputSizeshNQ4ISI = 0;
        } else if ((context.getHighSpeedVideoSizesFor + i) - context.getHighSpeedVideoFpsRangesFor.length > 0) {
            int i2 = context.getHighSpeedVideoSizesFor + i;
            int length = context.getHighSpeedVideoFpsRangesFor.length * 2;
            if (java.lang.Integer.compareUnsigned(length, i2) < 0) {
                length = i2;
            }
            if (java.lang.Integer.compareUnsigned(length, 2147483639) > 0) {
                if (i2 < 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to allocate array size: ");
                    sb.append(i2 & 4294967295L);
                    throw new java.lang.OutOfMemoryError(sb.toString());
                }
                length = java.lang.Math.max(i2, 2147483639);
            }
            byte[] copyOf = java.util.Arrays.copyOf(context.getHighSpeedVideoFpsRangesFor, length);
            context.getHighSpeedVideoFpsRangesFor = copyOf;
            return copyOf;
        }
        return context.getHighSpeedVideoFpsRangesFor;
    }

    public org.apache.commons.codec.CodecPolicy getCodecPolicy() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.getHighSpeedVideoFpsRangesFor;
        long j = (((length + i) - 1) / i) * this.getHighSpeedVideoSizes;
        int i2 = this.lineLength;
        if (i2 <= 0) {
            return j;
        }
        long j2 = i2;
        return j + ((((j2 + j) - 1) / j2) * this.Camera2StreamConfigurationMap);
    }

    static boolean getHighSpeedVideoFpsRanges(org.apache.commons.codec.binary.BaseNCodec.Context context) {
        return context.getHighSpeedVideoSizesFor > context.getInputSizeshNQ4ISI;
    }

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        for (byte b : bArr) {
            if (!isInAlphabet(b) && (!z || (b != this.pad && !java.lang.Character.isWhitespace(b)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isInAlphabet(java.lang.String str) {
        return isInAlphabet(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str), true);
    }

    public boolean isStrictDecoding() {
        return this.getHighSpeedVideoFpsRanges == org.apache.commons.codec.CodecPolicy.STRICT;
    }

    static int getHighSpeedVideoFpsRangesFor(org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighSpeedVideoSizesFor > context.getInputSizeshNQ4ISI) {
            return context.getHighSpeedVideoSizesFor - context.getInputSizeshNQ4ISI;
        }
        return 0;
    }

    final int getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighSpeedVideoSizesFor <= context.getInputSizeshNQ4ISI) {
            return context.getHighResolutionOutputSizeshNQ4ISI ? -1 : 0;
        }
        int min = java.lang.Math.min(getHighSpeedVideoFpsRangesFor(context), i2);
        java.lang.System.arraycopy(context.getHighSpeedVideoFpsRangesFor, context.getInputSizeshNQ4ISI, bArr, i, min);
        context.getInputSizeshNQ4ISI += min;
        if (context.getHighSpeedVideoSizesFor <= context.getInputSizeshNQ4ISI) {
            context.getInputSizeshNQ4ISI = 0;
            context.getHighSpeedVideoSizesFor = 0;
        }
        return min;
    }
}
