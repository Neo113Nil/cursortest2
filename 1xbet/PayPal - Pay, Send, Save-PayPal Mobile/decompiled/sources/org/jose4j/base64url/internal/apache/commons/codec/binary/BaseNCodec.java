package org.jose4j.base64url.internal.apache.commons.codec.binary;

/* loaded from: classes18.dex */
public abstract class BaseNCodec {
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    private final int Camera2StreamConfigurationMap;
    protected final byte PAD = 61;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    protected final int lineLength;

    protected static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    abstract void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context);

    protected int getDefaultBufferSize() {
        return 8192;
    }

    abstract void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context);

    protected abstract boolean isInAlphabet(byte b);

    static class Context {
        int Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        byte[] getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        int getOutputFormats;
        int getOutputMinFrameDuration;

        Context() {
        }

        public java.lang.String toString() {
            return java.lang.String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), java.util.Arrays.toString(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap), java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor), java.lang.Integer.valueOf(this.getHighSpeedVideoSizesFor), java.lang.Integer.valueOf(this.getOutputFormats), java.lang.Integer.valueOf(this.getOutputMinFrameDuration));
        }
    }

    protected BaseNCodec(int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.Camera2StreamConfigurationMap = i4;
    }

    protected byte[] ensureBufferSize(int i, org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighSpeedVideoSizes != null && context.getHighSpeedVideoSizes.length >= context.getOutputFormats + i) {
            return context.getHighSpeedVideoSizes;
        }
        if (context.getHighSpeedVideoSizes == null) {
            context.getHighSpeedVideoSizes = new byte[getDefaultBufferSize()];
            context.getOutputFormats = 0;
            context.getOutputMinFrameDuration = 0;
        } else {
            byte[] bArr = new byte[context.getHighSpeedVideoSizes.length * 2];
            java.lang.System.arraycopy(context.getHighSpeedVideoSizes, 0, bArr, 0, context.getHighSpeedVideoSizes.length);
            context.getHighSpeedVideoSizes = bArr;
        }
        return context.getHighSpeedVideoSizes;
    }

    private static int getHighSpeedVideoFpsRanges(byte[] bArr, int i, org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighSpeedVideoSizes == null) {
            return context.getHighResolutionOutputSizeshNQ4ISI ? -1 : 0;
        }
        int min = java.lang.Math.min(context.getHighSpeedVideoSizes != null ? context.getOutputFormats - context.getOutputMinFrameDuration : 0, i);
        java.lang.System.arraycopy(context.getHighSpeedVideoSizes, context.getOutputMinFrameDuration, bArr, 0, min);
        context.getOutputMinFrameDuration += min;
        if (context.getOutputMinFrameDuration >= context.getOutputFormats) {
            context.getHighSpeedVideoSizes = null;
        }
        return min;
    }

    public java.lang.String encodeToString(byte[] bArr) {
        return org.jose4j.lang.StringUtil.newStringUtf8(encode(bArr));
    }

    public java.lang.String encodeAsString(byte[] bArr) {
        return org.jose4j.lang.StringUtil.newStringUtf8(encode(bArr));
    }

    public byte[] decode(java.lang.String str) {
        return decode(org.jose4j.lang.StringUtil.getBytesUtf8(str));
    }

    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context = new org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context();
        Camera2StreamConfigurationMap(bArr, 0, bArr.length, context);
        Camera2StreamConfigurationMap(bArr, 0, -1, context);
        int i = context.getOutputFormats;
        byte[] bArr2 = new byte[i];
        getHighSpeedVideoFpsRanges(bArr2, i, context);
        return bArr2;
    }

    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context = new org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context();
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, bArr.length, context);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, -1, context);
        int i = context.getOutputFormats - context.getOutputMinFrameDuration;
        byte[] bArr2 = new byte[i];
        getHighSpeedVideoFpsRanges(bArr2, i, context);
        return bArr2;
    }

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        byte b;
        for (int i = 0; i < bArr.length; i++) {
            if (!isInAlphabet(bArr[i]) && (!z || ((b = bArr[i]) != 61 && !isWhiteSpace(b)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isInAlphabet(java.lang.String str) {
        return isInAlphabet(org.jose4j.lang.StringUtil.getBytesUtf8(str), true);
    }

    protected boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.getHighSpeedVideoFpsRanges;
        long j = (((length + i) - 1) / i) * this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.lineLength;
        if (i2 <= 0) {
            return j;
        }
        long j2 = i2;
        return j + ((((j2 + j) - 1) / j2) * this.Camera2StreamConfigurationMap);
    }
}
