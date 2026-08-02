package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base32 extends org.apache.commons.codec.binary.BaseNCodec {
    private final byte[] getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;
    private static final byte[] getHighSpeedVideoFpsRanges = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM};
    private static final byte[] Camera2StreamConfigurationMap = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
    private static final byte[] getHighSpeedVideoSizes = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86};

    public Base32() {
        this(false);
    }

    public Base32(boolean z) {
        this(0, null, z, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(boolean z, byte b) {
        this(0, null, z, b);
    }

    public Base32(byte b) {
        this(false, b);
    }

    public Base32(int i) {
        this(i, getHighResolutionOutputSizeshNQ4ISI);
    }

    public Base32(int i, byte[] bArr) {
        this(i, bArr, false, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b) {
        this(i, bArr, z, b, DECODING_POLICY_DEFAULT);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(5, 8, i, bArr == null ? 0 : bArr.length, b, codecPolicy);
        if (z) {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoSizes;
        } else {
            this.getOutputMinFrameDuration = Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges;
        }
        if (i <= 0) {
            this.getInputFormats = 8;
            this.getOutputFormats = null;
        } else {
            if (bArr == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lineLength ");
                sb.append(i);
                sb.append(" > 0, but lineSeparator is null");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (containsAlphabetOrPad(bArr)) {
                java.lang.String newStringUtf8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(bArr);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("lineSeparator must not contain Base32 characters: [");
                sb2.append(newStringUtf8);
                sb2.append("]");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            this.getInputFormats = bArr.length + 8;
            this.getOutputFormats = (byte[]) bArr.clone();
        }
        this.getInputSizeshNQ4ISI = this.getInputFormats - 1;
        if (isInAlphabet(b) || java.lang.Character.isWhitespace(b)) {
            throw new java.lang.IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        int i3;
        byte b;
        if (context.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            context.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        int i4 = 0;
        int i5 = i;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            byte b2 = bArr[i5];
            if (b2 == this.pad) {
                context.getHighResolutionOutputSizeshNQ4ISI = r3;
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.getInputSizeshNQ4ISI, context);
            if (b2 >= 0) {
                byte[] bArr2 = this.getHighSpeedVideoSizesFor;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    context.getOutputFormats = (context.getOutputFormats + r3) % 8;
                    i3 = i5;
                    context.getHighSpeedVideoFpsRanges = (context.getHighSpeedVideoFpsRanges << 5) + b;
                    if (context.getOutputFormats == 0) {
                        int i6 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i6 + 1;
                        ensureBufferSize[i6] = (byte) ((context.getHighSpeedVideoFpsRanges >> 32) & 255);
                        int i7 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i7 + 1;
                        ensureBufferSize[i7] = (byte) ((context.getHighSpeedVideoFpsRanges >> 24) & 255);
                        int i8 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i8 + 1;
                        ensureBufferSize[i8] = (byte) ((context.getHighSpeedVideoFpsRanges >> 16) & 255);
                        int i9 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i9 + 1;
                        ensureBufferSize[i9] = (byte) ((context.getHighSpeedVideoFpsRanges >> 8) & 255);
                        int i10 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i10 + 1;
                        ensureBufferSize[i10] = (byte) (context.getHighSpeedVideoFpsRanges & 255);
                    }
                    i4++;
                    i5 = i3 + 1;
                    r3 = 1;
                }
            }
            i3 = i5;
            i4++;
            i5 = i3 + 1;
            r3 = 1;
        }
        if (!context.getHighResolutionOutputSizeshNQ4ISI || context.getOutputFormats <= 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.getInputSizeshNQ4ISI, context);
        switch (context.getOutputFormats) {
            case 1:
                if (isStrictDecoding()) {
                    throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
                }
                break;
            case 2:
                break;
            case 3:
                if (!isStrictDecoding()) {
                    int i11 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i11 + 1;
                    ensureBufferSize2[i11] = (byte) ((context.getHighSpeedVideoFpsRanges >> 7) & 255);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
            case 4:
                if (!isStrictDecoding() || (15 & context.getHighSpeedVideoFpsRanges) == 0) {
                    context.getHighSpeedVideoFpsRanges >>= 4;
                    int i12 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i12 + 1;
                    ensureBufferSize2[i12] = (byte) ((context.getHighSpeedVideoFpsRanges >> 8) & 255);
                    int i13 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i13 + 1;
                    ensureBufferSize2[i13] = (byte) (context.getHighSpeedVideoFpsRanges & 255);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            case 5:
                if (!isStrictDecoding() || (1 & context.getHighSpeedVideoFpsRanges) == 0) {
                    context.getHighSpeedVideoFpsRanges >>= 1;
                    int i14 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i14 + 1;
                    ensureBufferSize2[i14] = (byte) ((context.getHighSpeedVideoFpsRanges >> 16) & 255);
                    int i15 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i15 + 1;
                    ensureBufferSize2[i15] = (byte) ((context.getHighSpeedVideoFpsRanges >> 8) & 255);
                    int i16 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i16 + 1;
                    ensureBufferSize2[i16] = (byte) (context.getHighSpeedVideoFpsRanges & 255);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            case 6:
                if (!isStrictDecoding()) {
                    context.getHighSpeedVideoFpsRanges >>= 6;
                    int i17 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i17 + 1;
                    ensureBufferSize2[i17] = (byte) ((context.getHighSpeedVideoFpsRanges >> 16) & 255);
                    int i18 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i18 + 1;
                    ensureBufferSize2[i18] = (byte) ((context.getHighSpeedVideoFpsRanges >> 8) & 255);
                    int i19 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i19 + 1;
                    ensureBufferSize2[i19] = (byte) (context.getHighSpeedVideoFpsRanges & 255);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
            case 7:
                if (!isStrictDecoding() || (7 & context.getHighSpeedVideoFpsRanges) == 0) {
                    context.getHighSpeedVideoFpsRanges >>= 3;
                    int i20 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i20 + 1;
                    ensureBufferSize2[i20] = (byte) ((context.getHighSpeedVideoFpsRanges >> 24) & 255);
                    int i21 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i21 + 1;
                    ensureBufferSize2[i21] = (byte) ((context.getHighSpeedVideoFpsRanges >> 16) & 255);
                    int i22 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i22 + 1;
                    ensureBufferSize2[i22] = (byte) ((context.getHighSpeedVideoFpsRanges >> 8) & 255);
                    int i23 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i23 + 1;
                    ensureBufferSize2[i23] = (byte) (context.getHighSpeedVideoFpsRanges & 255);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                sb.append(context.getOutputFormats);
                throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!isStrictDecoding() || (3 & context.getHighSpeedVideoFpsRanges) == 0) {
            int i24 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i24 + 1;
            ensureBufferSize2[i24] = (byte) ((context.getHighSpeedVideoFpsRanges >> 2) & 255);
            return;
        }
        throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    final void getHighSpeedVideoSizes(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] ensureBufferSize = ensureBufferSize(this.getInputFormats, context);
                context.getOutputFormats = (context.getOutputFormats + 1) % 5;
                int i4 = bArr[i];
                if (i4 < 0) {
                    i4 += 256;
                }
                context.getHighSpeedVideoFpsRanges = (context.getHighSpeedVideoFpsRanges << 8) + i4;
                if (context.getOutputFormats == 0) {
                    int i5 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i5 + 1;
                    ensureBufferSize[i5] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 35)) & 31];
                    int i6 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i6 + 1;
                    ensureBufferSize[i6] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 30)) & 31];
                    int i7 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i7 + 1;
                    ensureBufferSize[i7] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 25)) & 31];
                    int i8 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i8 + 1;
                    ensureBufferSize[i8] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 20)) & 31];
                    int i9 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i9 + 1;
                    ensureBufferSize[i9] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 15)) & 31];
                    int i10 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i10 + 1;
                    ensureBufferSize[i10] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 10)) & 31];
                    int i11 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i11 + 1;
                    ensureBufferSize[i11] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 5)) & 31];
                    int i12 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i12 + 1;
                    ensureBufferSize[i12] = this.getOutputMinFrameDuration[((int) context.getHighSpeedVideoFpsRanges) & 31];
                    context.getHighSpeedVideoSizes += 8;
                    if (this.lineLength > 0 && this.lineLength <= context.getHighSpeedVideoSizes) {
                        java.lang.System.arraycopy(this.getOutputFormats, 0, ensureBufferSize, context.getHighSpeedVideoSizesFor, this.getOutputFormats.length);
                        context.getHighSpeedVideoSizesFor += this.getOutputFormats.length;
                        context.getHighSpeedVideoSizes = 0;
                    }
                }
                i3++;
                i++;
            }
            return;
        }
        context.getHighResolutionOutputSizeshNQ4ISI = true;
        if (context.getOutputFormats == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.getInputFormats, context);
        int i13 = context.getHighSpeedVideoSizesFor;
        int i14 = context.getOutputFormats;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i15 + 1;
                ensureBufferSize2[i15] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 3)) & 31];
                int i16 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i16 + 1;
                ensureBufferSize2[i16] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges << 2)) & 31];
                int i17 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i17 + 1;
                ensureBufferSize2[i17] = this.pad;
                int i18 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i18 + 1;
                ensureBufferSize2[i18] = this.pad;
                int i19 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i19 + 1;
                ensureBufferSize2[i19] = this.pad;
                int i20 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i20 + 1;
                ensureBufferSize2[i20] = this.pad;
                int i21 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i21 + 1;
                ensureBufferSize2[i21] = this.pad;
                int i22 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i22 + 1;
                ensureBufferSize2[i22] = this.pad;
            } else if (i14 == 2) {
                int i23 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i23 + 1;
                ensureBufferSize2[i23] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 11)) & 31];
                int i24 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i24 + 1;
                ensureBufferSize2[i24] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 6)) & 31];
                int i25 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i25 + 1;
                ensureBufferSize2[i25] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 1)) & 31];
                int i26 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i26 + 1;
                ensureBufferSize2[i26] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges << 4)) & 31];
                int i27 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i27 + 1;
                ensureBufferSize2[i27] = this.pad;
                int i28 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i28 + 1;
                ensureBufferSize2[i28] = this.pad;
                int i29 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i29 + 1;
                ensureBufferSize2[i29] = this.pad;
                int i30 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i30 + 1;
                ensureBufferSize2[i30] = this.pad;
            } else if (i14 == 3) {
                int i31 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i31 + 1;
                ensureBufferSize2[i31] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 19)) & 31];
                int i32 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i32 + 1;
                ensureBufferSize2[i32] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 14)) & 31];
                int i33 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i33 + 1;
                ensureBufferSize2[i33] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 9)) & 31];
                int i34 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i34 + 1;
                ensureBufferSize2[i34] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 4)) & 31];
                int i35 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i35 + 1;
                ensureBufferSize2[i35] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges << 1)) & 31];
                int i36 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i36 + 1;
                ensureBufferSize2[i36] = this.pad;
                int i37 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i37 + 1;
                ensureBufferSize2[i37] = this.pad;
                int i38 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i38 + 1;
                ensureBufferSize2[i38] = this.pad;
            } else if (i14 == 4) {
                int i39 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i39 + 1;
                ensureBufferSize2[i39] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 27)) & 31];
                int i40 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i40 + 1;
                ensureBufferSize2[i40] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 22)) & 31];
                int i41 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i41 + 1;
                ensureBufferSize2[i41] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 17)) & 31];
                int i42 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i42 + 1;
                ensureBufferSize2[i42] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 12)) & 31];
                int i43 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i43 + 1;
                ensureBufferSize2[i43] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 7)) & 31];
                int i44 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i44 + 1;
                ensureBufferSize2[i44] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges >> 2)) & 31];
                int i45 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i45 + 1;
                ensureBufferSize2[i45] = this.getOutputMinFrameDuration[((int) (context.getHighSpeedVideoFpsRanges << 3)) & 31];
                int i46 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i46 + 1;
                ensureBufferSize2[i46] = this.pad;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                sb.append(context.getOutputFormats);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        context.getHighSpeedVideoSizes += context.getHighSpeedVideoSizesFor - i13;
        if (this.lineLength <= 0 || context.getHighSpeedVideoSizes <= 0) {
            return;
        }
        java.lang.System.arraycopy(this.getOutputFormats, 0, ensureBufferSize2, context.getHighSpeedVideoSizesFor, this.getOutputFormats.length);
        context.getHighSpeedVideoSizesFor += this.getOutputFormats.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        return b < bArr.length && bArr[b] != -1;
    }
}
