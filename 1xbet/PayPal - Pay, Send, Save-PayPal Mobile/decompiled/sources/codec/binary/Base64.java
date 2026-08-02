package codec.binary;

/* loaded from: classes3.dex */
public class Base64 extends codec.binary.BaseNCodec {
    public static final byte[] i = {13, 10};
    public static final byte[] j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    public static final byte[] k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 45, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
    public static final byte[] l = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, -1, -1, -1, -1, 63, -1, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final int h;

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(java.lang.String str) {
        return new codec.binary.Base64().decode(str);
    }

    public static java.math.BigInteger decodeInteger(byte[] bArr) {
        return new java.math.BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static java.lang.String encodeBase64String(byte[] bArr) {
        return codec.binary.StringUtils.newStringUsAscii(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static java.lang.String encodeBase64URLSafeString(byte[] bArr) {
        return codec.binary.StringUtils.newStringUsAscii(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(java.math.BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new java.lang.NullPointerException("encodeInteger called with null parameter");
        }
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i2 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i2 = 0;
            }
            int i3 = bitLength / 8;
            byte[] bArr = new byte[i3];
            java.lang.System.arraycopy(byteArray, i2, bArr, i3 - length, length);
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
        if (b >= 0) {
            return b < 123 && l[b] != -1;
        }
        return false;
    }

    @Override // codec.binary.BaseNCodec
    public final void a(byte[] bArr, int i2, int i3, codec.binary.a aVar) {
        byte b;
        if (aVar.f) {
            return;
        }
        if (i3 < 0) {
            aVar.f = true;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.g, aVar);
            byte b2 = bArr[i2];
            if (b2 == this.pad) {
                aVar.f = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = l;
                if (b2 < 123 && (b = bArr2[b2]) >= 0) {
                    int i5 = (aVar.h + 1) % 4;
                    aVar.h = i5;
                    int i6 = (aVar.f2768a << 6) + b;
                    aVar.f2768a = i6;
                    if (i5 == 0) {
                        int i7 = aVar.d;
                        int i8 = i7 + 1;
                        aVar.d = i8;
                        ensureBufferSize[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i7 + 2;
                        aVar.d = i9;
                        ensureBufferSize[i8] = (byte) ((i6 >> 8) & 255);
                        aVar.d = i7 + 3;
                        ensureBufferSize[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i4++;
            i2++;
        }
        if (!aVar.f || aVar.h == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.g, aVar);
        int i10 = aVar.h;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = aVar.f2768a;
                if ((i11 & 4) != 0) {
                    throw new java.lang.IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible value");
                }
                int i12 = i11 >> 4;
                aVar.f2768a = i12;
                int i13 = aVar.d;
                aVar.d = i13 + 1;
                ensureBufferSize2[i13] = (byte) (i12 & 255);
                return;
            }
            if (i10 != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                sb.append(aVar.h);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            int i14 = aVar.f2768a;
            if ((i14 & 2) != 0) {
                throw new java.lang.IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible value");
            }
            int i15 = i14 >> 2;
            aVar.f2768a = i15;
            int i16 = aVar.d;
            int i17 = i16 + 1;
            aVar.d = i17;
            ensureBufferSize2[i16] = (byte) ((i14 >> 10) & 255);
            aVar.d = i16 + 2;
            ensureBufferSize2[i17] = (byte) (i15 & 255);
        }
    }

    @Override // codec.binary.BaseNCodec
    public final void b(byte[] bArr, int i2, int i3, codec.binary.a aVar) {
        if (aVar.f) {
            return;
        }
        if (i3 >= 0) {
            int i4 = 0;
            while (i4 < i3) {
                byte[] ensureBufferSize = ensureBufferSize(this.h, aVar);
                int i5 = (aVar.h + 1) % 3;
                aVar.h = i5;
                int i6 = bArr[i2];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (aVar.f2768a << 8) + i6;
                aVar.f2768a = i7;
                if (i5 == 0) {
                    int i8 = aVar.d;
                    int i9 = i8 + 1;
                    aVar.d = i9;
                    byte[] bArr2 = this.d;
                    ensureBufferSize[i8] = bArr2[(i7 >> 18) & 63];
                    int i10 = i8 + 2;
                    aVar.d = i10;
                    ensureBufferSize[i9] = bArr2[(i7 >> 12) & 63];
                    int i11 = i8 + 3;
                    aVar.d = i11;
                    ensureBufferSize[i10] = bArr2[(i7 >> 6) & 63];
                    int i12 = i8 + 4;
                    aVar.d = i12;
                    ensureBufferSize[i11] = bArr2[i7 & 63];
                    int i13 = aVar.g + 4;
                    aVar.g = i13;
                    int i14 = this.lineLength;
                    if (i14 > 0 && i14 <= i13) {
                        byte[] bArr3 = this.f;
                        java.lang.System.arraycopy(bArr3, 0, ensureBufferSize, i12, bArr3.length);
                        aVar.d += this.f.length;
                        aVar.g = 0;
                    }
                }
                i4++;
                i2++;
            }
            return;
        }
        aVar.f = true;
        if (aVar.h == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.h, aVar);
        int i15 = aVar.d;
        int i16 = aVar.h;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = i15 + 1;
                aVar.d = i17;
                byte[] bArr4 = this.d;
                int i18 = aVar.f2768a;
                ensureBufferSize2[i15] = bArr4[(i18 >> 2) & 63];
                int i19 = i15 + 2;
                aVar.d = i19;
                ensureBufferSize2[i17] = bArr4[(i18 << 4) & 63];
                if (bArr4 == j) {
                    int i20 = i15 + 3;
                    aVar.d = i20;
                    byte b = this.pad;
                    ensureBufferSize2[i19] = b;
                    aVar.d = i15 + 4;
                    ensureBufferSize2[i20] = b;
                }
            } else {
                if (i16 != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                    sb.append(aVar.h);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                int i21 = i15 + 1;
                aVar.d = i21;
                byte[] bArr5 = this.d;
                int i22 = aVar.f2768a;
                ensureBufferSize2[i15] = bArr5[(i22 >> 10) & 63];
                int i23 = i15 + 2;
                aVar.d = i23;
                ensureBufferSize2[i21] = bArr5[(i22 >> 4) & 63];
                int i24 = i15 + 3;
                aVar.d = i24;
                ensureBufferSize2[i23] = bArr5[(i22 << 2) & 63];
                if (bArr5 == j) {
                    aVar.d = i15 + 4;
                    ensureBufferSize2[i24] = this.pad;
                }
            }
        }
        int i25 = aVar.g;
        int i26 = aVar.d;
        int i27 = (i26 - i15) + i25;
        aVar.g = i27;
        if (this.lineLength <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr6 = this.f;
        java.lang.System.arraycopy(bArr6, 0, ensureBufferSize2, i26, bArr6.length);
        aVar.d += this.f.length;
    }

    @Override // codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.e;
        return b < bArr.length && bArr[b] != -1;
    }

    public boolean isUrlSafe() {
        return this.d == k;
    }

    public Base64(boolean z) {
        this(76, i, z);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new codec.binary.Base64().decode(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static boolean isBase64(java.lang.String str) {
        return isBase64(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public Base64(int i2) {
        this(i2, i);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (!isBase64(bArr[i2]) && !codec.binary.BaseNCodec.isWhiteSpace(bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public Base64(int i2, byte[] bArr) {
        this(i2, bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        codec.binary.Base64 base64 = z ? new codec.binary.Base64(z2) : new codec.binary.Base64(0, i, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i2) {
            return base64.encode(bArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input array too big, the output array would be bigger (");
        sb.append(encodedLength);
        sb.append(") than the specified maximum size of ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public Base64(int i2, byte[] bArr, boolean z) {
        super(3, 4, i2, bArr == null ? 0 : bArr.length);
        this.e = l;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                java.lang.String newStringUtf8 = codec.binary.StringUtils.newStringUtf8(bArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lineSeparator must not contain base64 characters: [");
                sb.append(newStringUtf8);
                sb.append("]");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (i2 > 0) {
                this.h = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f = bArr2;
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.h = 4;
                this.f = null;
            }
        } else {
            this.h = 4;
            this.f = null;
        }
        this.g = this.h - 1;
        this.d = z ? k : j;
    }
}
