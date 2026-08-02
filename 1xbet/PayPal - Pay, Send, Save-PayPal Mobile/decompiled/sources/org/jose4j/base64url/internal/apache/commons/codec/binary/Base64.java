package org.jose4j.base64url.internal.apache.commons.codec.binary;

/* loaded from: classes18.dex */
public class Base64 extends org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec {
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    static final byte[] Camera2StreamConfigurationMap = {13, 10};
    private static final byte[] getHighSpeedVideoFpsRanges = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    private static final byte[] getHighSpeedVideoSizes = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 45, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, -1, -1, -1, -1, 63, -1, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};

    public Base64() {
        this(0);
    }

    public Base64(boolean z) {
        this(76, Camera2StreamConfigurationMap, z);
    }

    public Base64(int i) {
        this(i, Camera2StreamConfigurationMap);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.getOutputFormats = getHighResolutionOutputSizeshNQ4ISI;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                java.lang.String newStringUtf8 = org.jose4j.lang.StringUtil.newStringUtf8(bArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lineSeparator must not contain base64 characters: [");
                sb.append(newStringUtf8);
                sb.append("]");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (i > 0) {
                this.getHighSpeedVideoSizesFor = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.getInputSizeshNQ4ISI = bArr2;
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.getHighSpeedVideoSizesFor = 4;
                this.getInputSizeshNQ4ISI = null;
            }
        } else {
            this.getHighSpeedVideoSizesFor = 4;
            this.getInputSizeshNQ4ISI = null;
        }
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor - 1;
        this.getInputFormats = z ? getHighSpeedVideoSizes : getHighSpeedVideoFpsRanges;
    }

    public boolean isUrlSafe() {
        return this.getInputFormats == getHighSpeedVideoSizes;
    }

    @Override // org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec
    final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context) {
        if (context.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] ensureBufferSize = ensureBufferSize(this.getHighSpeedVideoSizesFor, context);
                context.getHighSpeedVideoSizesFor = (context.getHighSpeedVideoSizesFor + 1) % 3;
                int i4 = bArr[i];
                if (i4 < 0) {
                    i4 += 256;
                }
                context.Camera2StreamConfigurationMap = (context.Camera2StreamConfigurationMap << 8) + i4;
                if (context.getHighSpeedVideoSizesFor == 0) {
                    int i5 = context.getOutputFormats;
                    context.getOutputFormats = i5 + 1;
                    ensureBufferSize[i5] = this.getInputFormats[(context.Camera2StreamConfigurationMap >> 18) & 63];
                    int i6 = context.getOutputFormats;
                    context.getOutputFormats = i6 + 1;
                    ensureBufferSize[i6] = this.getInputFormats[(context.Camera2StreamConfigurationMap >> 12) & 63];
                    int i7 = context.getOutputFormats;
                    context.getOutputFormats = i7 + 1;
                    ensureBufferSize[i7] = this.getInputFormats[(context.Camera2StreamConfigurationMap >> 6) & 63];
                    int i8 = context.getOutputFormats;
                    context.getOutputFormats = i8 + 1;
                    ensureBufferSize[i8] = this.getInputFormats[context.Camera2StreamConfigurationMap & 63];
                    context.getHighSpeedVideoFpsRanges += 4;
                    if (this.lineLength > 0 && this.lineLength <= context.getHighSpeedVideoFpsRanges) {
                        java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, 0, ensureBufferSize, context.getOutputFormats, this.getInputSizeshNQ4ISI.length);
                        context.getOutputFormats += this.getInputSizeshNQ4ISI.length;
                        context.getHighSpeedVideoFpsRanges = 0;
                    }
                }
                i3++;
                i++;
            }
            return;
        }
        context.getHighResolutionOutputSizeshNQ4ISI = true;
        if (context.getHighSpeedVideoSizesFor == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.getHighSpeedVideoSizesFor, context);
        int i9 = context.getOutputFormats;
        int i10 = context.getHighSpeedVideoSizesFor;
        if (i10 != 0) {
            if (i10 == 1) {
                int i11 = context.getOutputFormats;
                context.getOutputFormats = i11 + 1;
                ensureBufferSize2[i11] = this.getInputFormats[(context.Camera2StreamConfigurationMap >> 2) & 63];
                int i12 = context.getOutputFormats;
                context.getOutputFormats = i12 + 1;
                ensureBufferSize2[i12] = this.getInputFormats[(context.Camera2StreamConfigurationMap << 4) & 63];
                if (this.getInputFormats == getHighSpeedVideoFpsRanges) {
                    int i13 = context.getOutputFormats;
                    context.getOutputFormats = i13 + 1;
                    ensureBufferSize2[i13] = kotlin.io.encoding.Base64.padSymbol;
                    int i14 = context.getOutputFormats;
                    context.getOutputFormats = i14 + 1;
                    ensureBufferSize2[i14] = kotlin.io.encoding.Base64.padSymbol;
                }
            } else if (i10 == 2) {
                int i15 = context.getOutputFormats;
                context.getOutputFormats = i15 + 1;
                ensureBufferSize2[i15] = this.getInputFormats[(context.Camera2StreamConfigurationMap >> 10) & 63];
                int i16 = context.getOutputFormats;
                context.getOutputFormats = i16 + 1;
                ensureBufferSize2[i16] = this.getInputFormats[(context.Camera2StreamConfigurationMap >> 4) & 63];
                int i17 = context.getOutputFormats;
                context.getOutputFormats = i17 + 1;
                ensureBufferSize2[i17] = this.getInputFormats[(context.Camera2StreamConfigurationMap << 2) & 63];
                if (this.getInputFormats == getHighSpeedVideoFpsRanges) {
                    int i18 = context.getOutputFormats;
                    context.getOutputFormats = i18 + 1;
                    ensureBufferSize2[i18] = kotlin.io.encoding.Base64.padSymbol;
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                sb.append(context.getHighSpeedVideoSizesFor);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        context.getHighSpeedVideoFpsRanges += context.getOutputFormats - i9;
        if (this.lineLength <= 0 || context.getHighSpeedVideoFpsRanges <= 0) {
            return;
        }
        java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, 0, ensureBufferSize2, context.getOutputFormats, this.getInputSizeshNQ4ISI.length);
        context.getOutputFormats += this.getInputSizeshNQ4ISI.length;
    }

    @Override // org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec
    final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec.Context context) {
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
            byte[] ensureBufferSize = ensureBufferSize(this.getHighSpeedVideoFpsRangesFor, context);
            byte b2 = bArr[i];
            if (b2 == 61) {
                context.getHighResolutionOutputSizeshNQ4ISI = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    context.getHighSpeedVideoSizesFor = (context.getHighSpeedVideoSizesFor + 1) % 4;
                    context.Camera2StreamConfigurationMap = (context.Camera2StreamConfigurationMap << 6) + b;
                    if (context.getHighSpeedVideoSizesFor == 0) {
                        int i4 = context.getOutputFormats;
                        context.getOutputFormats = i4 + 1;
                        ensureBufferSize[i4] = (byte) ((context.Camera2StreamConfigurationMap >> 16) & 255);
                        int i5 = context.getOutputFormats;
                        context.getOutputFormats = i5 + 1;
                        ensureBufferSize[i5] = (byte) ((context.Camera2StreamConfigurationMap >> 8) & 255);
                        int i6 = context.getOutputFormats;
                        context.getOutputFormats = i6 + 1;
                        ensureBufferSize[i6] = (byte) (context.Camera2StreamConfigurationMap & 255);
                    }
                }
            }
            i3++;
            i++;
        }
        if (!context.getHighResolutionOutputSizeshNQ4ISI || context.getHighSpeedVideoSizesFor == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.getHighSpeedVideoFpsRangesFor, context);
        int i7 = context.getHighSpeedVideoSizesFor;
        if (i7 != 1) {
            if (i7 == 2) {
                context.Camera2StreamConfigurationMap >>= 4;
                int i8 = context.getOutputFormats;
                context.getOutputFormats = i8 + 1;
                ensureBufferSize2[i8] = (byte) (context.Camera2StreamConfigurationMap & 255);
                return;
            }
            if (i7 == 3) {
                context.Camera2StreamConfigurationMap >>= 2;
                int i9 = context.getOutputFormats;
                context.getOutputFormats = i9 + 1;
                ensureBufferSize2[i9] = (byte) ((context.Camera2StreamConfigurationMap >> 8) & 255);
                int i10 = context.getOutputFormats;
                context.getOutputFormats = i10 + 1;
                ensureBufferSize2[i10] = (byte) (context.Camera2StreamConfigurationMap & 255);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
            sb.append(context.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
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
        byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
        return b < bArr.length && bArr[b] != -1;
    }

    public static boolean isBase64(java.lang.String str) {
        return isBase64(org.jose4j.lang.StringUtil.getBytesUtf8(str));
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static java.lang.String encodeBase64String(byte[] bArr) {
        return org.jose4j.lang.StringUtil.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static java.lang.String encodeBase64URLSafeString(byte[] bArr) {
        return org.jose4j.lang.StringUtil.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        org.jose4j.base64url.internal.apache.commons.codec.binary.Base64 base64 = z ? new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64(z2) : new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64(0, Camera2StreamConfigurationMap, z2);
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

    public static byte[] decodeBase64(java.lang.String str) {
        return new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64().decode(bArr);
    }

    public static java.math.BigInteger decodeInteger(byte[] bArr) {
        return new java.math.BigInteger(1, decodeBase64(bArr));
    }

    @Override // org.jose4j.base64url.internal.apache.commons.codec.binary.BaseNCodec
    protected boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.getOutputFormats;
        return b < bArr.length && bArr[b] != -1;
    }

    public static byte[] encodeInteger(java.math.BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new java.lang.NullPointerException("encodeInteger called with null parameter");
        }
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
}
