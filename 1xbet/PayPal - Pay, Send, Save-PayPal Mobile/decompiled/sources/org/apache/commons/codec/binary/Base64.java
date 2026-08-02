package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base64 extends org.apache.commons.codec.binary.BaseNCodec {
    private final int Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private static final byte[] getHighSpeedVideoFpsRangesFor = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    private static final byte[] getHighSpeedVideoSizes = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 45, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
    private static final byte[] getHighSpeedVideoFpsRanges = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, -1, -1, -1, -1, 63, -1, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};

    public static byte[] decodeBase64(byte[] bArr) {
        return new org.apache.commons.codec.binary.Base64().decode(bArr);
    }

    public static byte[] decodeBase64(java.lang.String str) {
        return new org.apache.commons.codec.binary.Base64().decode(str);
    }

    public static java.math.BigInteger decodeInteger(byte[] bArr) {
        return new java.math.BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (org.apache.commons.codec.binary.BinaryCodec.Camera2StreamConfigurationMap(bArr)) {
            return bArr;
        }
        org.apache.commons.codec.binary.Base64 base64 = z ? new org.apache.commons.codec.binary.Base64(z2) : new org.apache.commons.codec.binary.Base64(0, getHighResolutionOutputSizeshNQ4ISI, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength > i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input array too big, the output array would be bigger (");
            sb.append(encodedLength);
            sb.append(") than the specified maximum size of ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return base64.encode(bArr);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static java.lang.String encodeBase64String(byte[] bArr) {
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static java.lang.String encodeBase64URLSafeString(byte[] bArr) {
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(java.math.BigInteger bigInteger) {
        java.util.Objects.requireNonNull(bigInteger, "bigInteger");
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i = 0;
            }
            int i2 = bitLength / 8;
            byte[] bArr = new byte[i2];
            java.lang.System.arraycopy(byteArray, i, bArr, i2 - length, length);
            byteArray = bArr;
        }
        return encodeBase64(byteArray, false);
    }

    @java.lang.Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b) {
        if (b == 61) {
            return true;
        }
        if (b < 0) {
            return false;
        }
        byte[] bArr = getHighSpeedVideoFpsRanges;
        return b < bArr.length && bArr[b] != -1;
    }

    public static boolean isBase64(byte[] bArr) {
        for (byte b : bArr) {
            if (!isBase64(b) && !java.lang.Character.isWhitespace(b)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBase64(java.lang.String str) {
        return isBase64(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str));
    }

    public Base64() {
        this(0);
    }

    public Base64(boolean z) {
        this(76, getHighResolutionOutputSizeshNQ4ISI, z);
    }

    public Base64(int i) {
        this(i, getHighResolutionOutputSizeshNQ4ISI);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, DECODING_POLICY_DEFAULT);
    }

    public Base64(int i, byte[] bArr, boolean z, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(3, 4, i, bArr == null ? 0 : bArr.length, kotlin.io.encoding.Base64.padSymbol, codecPolicy);
        this.getInputFormats = getHighSpeedVideoFpsRanges;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                java.lang.String newStringUtf8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(bArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lineSeparator must not contain base64 characters: [");
                sb.append(newStringUtf8);
                sb.append("]");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (i > 0) {
                this.getOutputFormats = bArr.length + 4;
                this.getHighSpeedVideoSizesFor = (byte[]) bArr.clone();
            } else {
                this.getOutputFormats = 4;
                this.getHighSpeedVideoSizesFor = null;
            }
        } else {
            this.getOutputFormats = 4;
            this.getHighSpeedVideoSizesFor = null;
        }
        this.Camera2StreamConfigurationMap = this.getOutputFormats - 1;
        this.getInputSizeshNQ4ISI = z ? getHighSpeedVideoSizes : getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        byte b;
        if (context.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (i2 < 0) {
            context.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.Camera2StreamConfigurationMap, context);
            byte b2 = bArr[i];
            if (b2 == this.pad) {
                context.getHighResolutionOutputSizeshNQ4ISI = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = getHighSpeedVideoFpsRanges;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    context.getOutputFormats = (context.getOutputFormats + 1) % 4;
                    context.Camera2StreamConfigurationMap = (context.Camera2StreamConfigurationMap << 6) + b;
                    if (context.getOutputFormats == 0) {
                        int i4 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i4 + 1;
                        ensureBufferSize[i4] = (byte) ((context.Camera2StreamConfigurationMap >> 16) & 255);
                        int i5 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i5 + 1;
                        ensureBufferSize[i5] = (byte) ((context.Camera2StreamConfigurationMap >> 8) & 255);
                        int i6 = context.getHighSpeedVideoSizesFor;
                        context.getHighSpeedVideoSizesFor = i6 + 1;
                        ensureBufferSize[i6] = (byte) (context.Camera2StreamConfigurationMap & 255);
                    }
                }
            }
            i3++;
            i++;
        }
        if (!context.getHighResolutionOutputSizeshNQ4ISI || context.getOutputFormats == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.Camera2StreamConfigurationMap, context);
        int i7 = context.getOutputFormats;
        if (i7 == 1) {
            if (isStrictDecoding()) {
                throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
            }
            return;
        }
        if (i7 == 2) {
            if (!isStrictDecoding() || (context.Camera2StreamConfigurationMap & 15) == 0) {
                context.Camera2StreamConfigurationMap >>= 4;
                int i8 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i8 + 1;
                ensureBufferSize2[i8] = (byte) (context.Camera2StreamConfigurationMap & 255);
                return;
            }
            throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
        if (i7 != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
            sb.append(context.getOutputFormats);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!isStrictDecoding() || (context.Camera2StreamConfigurationMap & 3) == 0) {
            context.Camera2StreamConfigurationMap >>= 2;
            int i9 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i9 + 1;
            ensureBufferSize2[i9] = (byte) ((context.Camera2StreamConfigurationMap >> 8) & 255);
            int i10 = context.getHighSpeedVideoSizesFor;
            context.getHighSpeedVideoSizesFor = i10 + 1;
            ensureBufferSize2[i10] = (byte) (context.Camera2StreamConfigurationMap & 255);
            return;
        }
        throw new java.lang.IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    final void getHighSpeedVideoSizes(byte[] bArr, int i, int i2, org.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] ensureBufferSize = ensureBufferSize(this.getOutputFormats, context);
                context.getOutputFormats = (context.getOutputFormats + 1) % 3;
                int i4 = bArr[i];
                if (i4 < 0) {
                    i4 += 256;
                }
                context.Camera2StreamConfigurationMap = (context.Camera2StreamConfigurationMap << 8) + i4;
                if (context.getOutputFormats == 0) {
                    int i5 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i5 + 1;
                    ensureBufferSize[i5] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap >> 18) & 63];
                    int i6 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i6 + 1;
                    ensureBufferSize[i6] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap >> 12) & 63];
                    int i7 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i7 + 1;
                    ensureBufferSize[i7] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap >> 6) & 63];
                    int i8 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i8 + 1;
                    ensureBufferSize[i8] = this.getInputSizeshNQ4ISI[context.Camera2StreamConfigurationMap & 63];
                    context.getHighSpeedVideoSizes += 4;
                    if (this.lineLength > 0 && this.lineLength <= context.getHighSpeedVideoSizes) {
                        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, ensureBufferSize, context.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizesFor.length);
                        context.getHighSpeedVideoSizesFor += this.getHighSpeedVideoSizesFor.length;
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
        byte[] ensureBufferSize2 = ensureBufferSize(this.getOutputFormats, context);
        int i9 = context.getHighSpeedVideoSizesFor;
        int i10 = context.getOutputFormats;
        if (i10 != 0) {
            if (i10 == 1) {
                int i11 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i11 + 1;
                ensureBufferSize2[i11] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap >> 2) & 63];
                int i12 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i12 + 1;
                ensureBufferSize2[i12] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap << 4) & 63];
                if (this.getInputSizeshNQ4ISI == getHighSpeedVideoFpsRangesFor) {
                    int i13 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i13 + 1;
                    ensureBufferSize2[i13] = this.pad;
                    int i14 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i14 + 1;
                    ensureBufferSize2[i14] = this.pad;
                }
            } else if (i10 == 2) {
                int i15 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i15 + 1;
                ensureBufferSize2[i15] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap >> 10) & 63];
                int i16 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i16 + 1;
                ensureBufferSize2[i16] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap >> 4) & 63];
                int i17 = context.getHighSpeedVideoSizesFor;
                context.getHighSpeedVideoSizesFor = i17 + 1;
                ensureBufferSize2[i17] = this.getInputSizeshNQ4ISI[(context.Camera2StreamConfigurationMap << 2) & 63];
                if (this.getInputSizeshNQ4ISI == getHighSpeedVideoFpsRangesFor) {
                    int i18 = context.getHighSpeedVideoSizesFor;
                    context.getHighSpeedVideoSizesFor = i18 + 1;
                    ensureBufferSize2[i18] = this.pad;
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                sb.append(context.getOutputFormats);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        context.getHighSpeedVideoSizes += context.getHighSpeedVideoSizesFor - i9;
        if (this.lineLength <= 0 || context.getHighSpeedVideoSizes <= 0) {
            return;
        }
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, ensureBufferSize2, context.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizesFor.length);
        context.getHighSpeedVideoSizesFor += this.getHighSpeedVideoSizesFor.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    protected boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.getInputFormats;
        return b < bArr.length && bArr[b] != -1;
    }

    public boolean isUrlSafe() {
        return this.getInputSizeshNQ4ISI == getHighSpeedVideoSizes;
    }
}
