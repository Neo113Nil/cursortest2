package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base16 extends org.apache.commons.codec.binary.BaseNCodec {
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private static final byte[] getHighSpeedVideoFpsRangesFor = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI};
    private static final byte[] getHighSpeedVideoSizes = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 65, 66, 67, 68, 69, 70};
    private static final byte[] Camera2StreamConfigurationMap = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI};
    private static final byte[] getHighSpeedVideoFpsRanges = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};

    public Base16() {
        this(false);
    }

    public Base16(boolean z) {
        this(z, DECODING_POLICY_DEFAULT);
    }

    public Base16(boolean z, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(1, 2, 0, 0, kotlin.io.encoding.Base64.padSymbol, codecPolicy);
        if (z) {
            this.getOutputFormats = getHighSpeedVideoFpsRanges;
            this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        } else {
            this.getOutputFormats = getHighSpeedVideoSizes;
            this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighResolutionOutputSizeshNQ4ISI || i2 < 0) {
            context.getHighResolutionOutputSizeshNQ4ISI = true;
            if (context.Camera2StreamConfigurationMap != 0 && isStrictDecoding()) {
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character is a valid base 16 alphabet character but not a possible encoding. Decoding requires at least two characters to create one byte.");
            }
            return;
        }
        int min = java.lang.Math.min(bArr.length - i, i2);
        int i3 = (context.Camera2StreamConfigurationMap != 0 ? 1 : 0) + min;
        if (i3 == 1 && i3 == min) {
            context.Camera2StreamConfigurationMap = getHighSpeedVideoSizes(bArr[i]) + 1;
            return;
        }
        int i4 = i + min;
        byte[] ensureBufferSize = ensureBufferSize((i3 % 2 == 0 ? i3 : i3 - 1) / 2, context);
        if (min < i3) {
            int i5 = context.Camera2StreamConfigurationMap;
            int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr[i]);
            int i6 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i6 + 1;
            ensureBufferSize[i6] = (byte) (((i5 - 1) << 4) | highSpeedVideoSizes);
            context.Camera2StreamConfigurationMap = 0;
            i++;
        }
        while (i < i4 - 1) {
            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(bArr[i]);
            int i7 = i + 2;
            int highSpeedVideoSizes3 = getHighSpeedVideoSizes(bArr[i + 1]);
            int i8 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i8 + 1;
            ensureBufferSize[i8] = (byte) (highSpeedVideoSizes3 | (highSpeedVideoSizes2 << 4));
            i = i7;
        }
        if (i < i4) {
            context.Camera2StreamConfigurationMap = getHighSpeedVideoSizes(bArr[i]) + 1;
        }
    }

    private int getHighSpeedVideoSizes(byte b) {
        byte[] bArr = this.getInputSizeshNQ4ISI;
        byte b2 = (b & 255) < bArr.length ? bArr[b] : (byte) -1;
        if (b2 != -1) {
            return b2;
        }
        throw new java.lang.IllegalArgumentException("Invalid octet in encoded value: ".concat(java.lang.String.valueOf((int) b)));
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    final void getHighSpeedVideoSizes(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (i2 < 0) {
            context.getHighResolutionOutputSizeshNQ4ISI = true;
            return;
        }
        int i3 = i2 * 2;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("Input length exceeds maximum size for encoded data: ".concat(java.lang.String.valueOf(i2)));
        }
        byte[] ensureBufferSize = ensureBufferSize(i3, context);
        for (int i4 = i; i4 < i2 + i; i4++) {
            byte b = bArr[i4];
            int i5 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i5 + 1;
            ensureBufferSize[i5] = this.getOutputFormats[(b >> 4) & 15];
            int i6 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i6 + 1;
            ensureBufferSize[i6] = this.getOutputFormats[b & com.google.common.base.Ascii.SI];
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        byte[] bArr = this.getInputSizeshNQ4ISI;
        return (b & 255) < bArr.length && bArr[b] != -1;
    }
}
