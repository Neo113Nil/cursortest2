package codec.binary;

/* loaded from: classes7.dex */
public class Base32 extends codec.binary.BaseNCodec {
    public static final byte[] i = {13, 10};
    public static final byte[] j = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM};
    public static final byte[] k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
    public static final byte[] l = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US};
    public static final byte[] m = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86};
    public final int d;
    public final byte[] e;
    public final int f;
    public final byte[] g;
    public final byte[] h;

    public Base32() {
        this(false);
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // codec.binary.BaseNCodec
    public final void a(byte[] bArr, int i2, int i3, codec.binary.a aVar) {
        int i4;
        byte b;
        if (aVar.f) {
            return;
        }
        ?? r3 = 1;
        if (i3 < 0) {
            aVar.f = true;
        }
        int i5 = 0;
        int i6 = i2;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            byte b2 = bArr[i6];
            if (b2 == this.pad) {
                aVar.f = r3;
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.d, aVar);
            if (b2 >= 0) {
                byte[] bArr2 = this.e;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i7 = (aVar.h + r3) % 8;
                    aVar.h = i7;
                    i4 = i6;
                    aVar.b = (aVar.b << 5) + b;
                    if (i7 == 0) {
                        int i8 = aVar.d;
                        int i9 = i8 + 1;
                        aVar.d = i9;
                        ensureBufferSize[i8] = (byte) ((r12 >> 32) & 255);
                        int i10 = i8 + 2;
                        aVar.d = i10;
                        ensureBufferSize[i9] = (byte) ((r12 >> 24) & 255);
                        int i11 = i8 + 3;
                        aVar.d = i11;
                        ensureBufferSize[i10] = (byte) ((r12 >> 16) & 255);
                        int i12 = i8 + 4;
                        aVar.d = i12;
                        ensureBufferSize[i11] = (byte) ((r12 >> 8) & 255);
                        aVar.d = i8 + 5;
                        ensureBufferSize[i12] = (byte) (r12 & 255);
                    }
                    i5++;
                    i6 = i4 + 1;
                    r3 = 1;
                }
            }
            i4 = i6;
            i5++;
            i6 = i4 + 1;
            r3 = 1;
        }
        if (!aVar.f || aVar.h < 2) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.d, aVar);
        switch (aVar.h) {
            case 2:
                a(2, aVar);
                int i13 = aVar.d;
                aVar.d = i13 + 1;
                ensureBufferSize2[i13] = (byte) ((aVar.b >> 2) & 255);
                return;
            case 3:
                a(7, aVar);
                int i14 = aVar.d;
                aVar.d = i14 + 1;
                ensureBufferSize2[i14] = (byte) ((aVar.b >> 7) & 255);
                return;
            case 4:
                a(4, aVar);
                aVar.b = aVar.b >> 4;
                int i15 = aVar.d;
                int i16 = i15 + 1;
                aVar.d = i16;
                ensureBufferSize2[i15] = (byte) ((r8 >> 12) & 255);
                aVar.d = i15 + 2;
                ensureBufferSize2[i16] = (byte) (r4 & 255);
                return;
            case 5:
                a(1, aVar);
                aVar.b = aVar.b >> 1;
                int i17 = aVar.d;
                int i18 = i17 + 1;
                aVar.d = i18;
                ensureBufferSize2[i17] = (byte) ((r4 >> 17) & 255);
                int i19 = i17 + 2;
                aVar.d = i19;
                ensureBufferSize2[i18] = (byte) ((r4 >> 9) & 255);
                aVar.d = i17 + 3;
                ensureBufferSize2[i19] = (byte) (r9 & 255);
                return;
            case 6:
                a(6, aVar);
                aVar.b = aVar.b >> 6;
                int i20 = aVar.d;
                int i21 = i20 + 1;
                aVar.d = i21;
                ensureBufferSize2[i20] = (byte) ((r4 >> 22) & 255);
                int i22 = i20 + 2;
                aVar.d = i22;
                ensureBufferSize2[i21] = (byte) ((r4 >> 14) & 255);
                aVar.d = i20 + 3;
                ensureBufferSize2[i22] = (byte) (r9 & 255);
                return;
            case 7:
                a(3, aVar);
                aVar.b = aVar.b >> 3;
                int i23 = aVar.d;
                int i24 = i23 + 1;
                aVar.d = i24;
                ensureBufferSize2[i23] = (byte) ((r3 >> 27) & 255);
                int i25 = i23 + 2;
                aVar.d = i25;
                ensureBufferSize2[i24] = (byte) ((r3 >> 19) & 255);
                int i26 = i23 + 3;
                aVar.d = i26;
                ensureBufferSize2[i25] = (byte) ((r3 >> 11) & 255);
                aVar.d = i23 + 4;
                ensureBufferSize2[i26] = (byte) (r8 & 255);
                return;
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                sb.append(aVar.h);
                throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // codec.binary.BaseNCodec
    public final void b(byte[] bArr, int i2, int i3, codec.binary.a aVar) {
        boolean z;
        int i4;
        if (aVar.f) {
            return;
        }
        boolean z2 = false;
        int i5 = 1;
        if (i3 >= 0) {
            int i6 = i2;
            int i7 = 0;
            while (i7 < i3) {
                byte[] ensureBufferSize = ensureBufferSize(this.f, aVar);
                int i8 = (aVar.h + i5) % 5;
                aVar.h = i8;
                int i9 = i6 + 1;
                int i10 = bArr[i6];
                if (i10 < 0) {
                    i10 += 256;
                }
                long j2 = (aVar.b << 8) + i10;
                aVar.b = j2;
                if (i8 == 0) {
                    int i11 = aVar.d;
                    int i12 = i11 + 1;
                    aVar.d = i12;
                    byte[] bArr2 = this.g;
                    ensureBufferSize[i11] = bArr2[((int) (j2 >> 35)) & 31];
                    int i13 = i11 + 2;
                    aVar.d = i13;
                    i4 = i9;
                    ensureBufferSize[i12] = bArr2[((int) (j2 >> 30)) & 31];
                    int i14 = i11 + 3;
                    aVar.d = i14;
                    ensureBufferSize[i13] = bArr2[((int) (j2 >> 25)) & 31];
                    int i15 = i11 + 4;
                    aVar.d = i15;
                    ensureBufferSize[i14] = bArr2[((int) (j2 >> 20)) & 31];
                    int i16 = i11 + 5;
                    aVar.d = i16;
                    ensureBufferSize[i15] = bArr2[((int) (j2 >> 15)) & 31];
                    int i17 = i11 + 6;
                    aVar.d = i17;
                    ensureBufferSize[i16] = bArr2[((int) (j2 >> 10)) & 31];
                    int i18 = i11 + 7;
                    aVar.d = i18;
                    ensureBufferSize[i17] = bArr2[((int) (j2 >> 5)) & 31];
                    int i19 = i11 + 8;
                    aVar.d = i19;
                    ensureBufferSize[i18] = bArr2[((int) j2) & 31];
                    int i20 = aVar.g + 8;
                    aVar.g = i20;
                    int i21 = this.lineLength;
                    if (i21 <= 0 || i21 > i20) {
                        z = false;
                    } else {
                        byte[] bArr3 = this.h;
                        z = false;
                        java.lang.System.arraycopy(bArr3, 0, ensureBufferSize, i19, bArr3.length);
                        aVar.d += this.h.length;
                        aVar.g = 0;
                    }
                } else {
                    z = z2;
                    i4 = i9;
                }
                i7++;
                z2 = z;
                i6 = i4;
                i5 = 1;
            }
            return;
        }
        aVar.f = true;
        if (aVar.h == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.f, aVar);
        int i22 = aVar.d;
        int i23 = aVar.h;
        if (i23 != 0) {
            if (i23 == 1) {
                int i24 = i22 + 1;
                aVar.d = i24;
                byte[] bArr4 = this.g;
                long j3 = aVar.b;
                ensureBufferSize2[i22] = bArr4[((int) (j3 >> 3)) & 31];
                int i25 = i22 + 2;
                aVar.d = i25;
                ensureBufferSize2[i24] = bArr4[((int) (j3 << 2)) & 31];
                int i26 = i22 + 3;
                aVar.d = i26;
                byte b = this.pad;
                ensureBufferSize2[i25] = b;
                int i27 = i22 + 4;
                aVar.d = i27;
                ensureBufferSize2[i26] = b;
                int i28 = i22 + 5;
                aVar.d = i28;
                ensureBufferSize2[i27] = b;
                int i29 = i22 + 6;
                aVar.d = i29;
                ensureBufferSize2[i28] = b;
                int i30 = i22 + 7;
                aVar.d = i30;
                ensureBufferSize2[i29] = b;
                aVar.d = i22 + 8;
                ensureBufferSize2[i30] = b;
            } else if (i23 == 2) {
                int i31 = i22 + 1;
                aVar.d = i31;
                byte[] bArr5 = this.g;
                long j4 = aVar.b;
                ensureBufferSize2[i22] = bArr5[((int) (j4 >> 11)) & 31];
                int i32 = i22 + 2;
                aVar.d = i32;
                ensureBufferSize2[i31] = bArr5[((int) (j4 >> 6)) & 31];
                int i33 = i22 + 3;
                aVar.d = i33;
                ensureBufferSize2[i32] = bArr5[((int) (j4 >> 1)) & 31];
                int i34 = i22 + 4;
                aVar.d = i34;
                ensureBufferSize2[i33] = bArr5[((int) (j4 << 4)) & 31];
                int i35 = i22 + 5;
                aVar.d = i35;
                byte b2 = this.pad;
                ensureBufferSize2[i34] = b2;
                int i36 = i22 + 6;
                aVar.d = i36;
                ensureBufferSize2[i35] = b2;
                int i37 = i22 + 7;
                aVar.d = i37;
                ensureBufferSize2[i36] = b2;
                aVar.d = i22 + 8;
                ensureBufferSize2[i37] = b2;
            } else if (i23 == 3) {
                int i38 = i22 + 1;
                aVar.d = i38;
                byte[] bArr6 = this.g;
                long j5 = aVar.b;
                ensureBufferSize2[i22] = bArr6[((int) (j5 >> 19)) & 31];
                int i39 = i22 + 2;
                aVar.d = i39;
                ensureBufferSize2[i38] = bArr6[((int) (j5 >> 14)) & 31];
                int i40 = i22 + 3;
                aVar.d = i40;
                ensureBufferSize2[i39] = bArr6[((int) (j5 >> 9)) & 31];
                int i41 = i22 + 4;
                aVar.d = i41;
                ensureBufferSize2[i40] = bArr6[((int) (j5 >> 4)) & 31];
                int i42 = i22 + 5;
                aVar.d = i42;
                ensureBufferSize2[i41] = bArr6[((int) (j5 << 1)) & 31];
                int i43 = i22 + 6;
                aVar.d = i43;
                byte b3 = this.pad;
                ensureBufferSize2[i42] = b3;
                int i44 = i22 + 7;
                aVar.d = i44;
                ensureBufferSize2[i43] = b3;
                aVar.d = i22 + 8;
                ensureBufferSize2[i44] = b3;
            } else {
                if (i23 != 4) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Impossible modulus ");
                    sb.append(aVar.h);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                int i45 = i22 + 1;
                aVar.d = i45;
                byte[] bArr7 = this.g;
                long j6 = aVar.b;
                ensureBufferSize2[i22] = bArr7[((int) (j6 >> 27)) & 31];
                int i46 = i22 + 2;
                aVar.d = i46;
                ensureBufferSize2[i45] = bArr7[((int) (j6 >> 22)) & 31];
                int i47 = i22 + 3;
                aVar.d = i47;
                ensureBufferSize2[i46] = bArr7[((int) (j6 >> 17)) & 31];
                int i48 = i22 + 4;
                aVar.d = i48;
                ensureBufferSize2[i47] = bArr7[((int) (j6 >> 12)) & 31];
                int i49 = i22 + 5;
                aVar.d = i49;
                ensureBufferSize2[i48] = bArr7[((int) (j6 >> 7)) & 31];
                int i50 = i22 + 6;
                aVar.d = i50;
                ensureBufferSize2[i49] = bArr7[((int) (j6 >> 2)) & 31];
                int i51 = i22 + 7;
                aVar.d = i51;
                ensureBufferSize2[i50] = bArr7[((int) (j6 << 3)) & 31];
                aVar.d = i22 + 8;
                ensureBufferSize2[i51] = this.pad;
            }
        }
        int i52 = aVar.g;
        int i53 = aVar.d;
        int i54 = (i53 - i22) + i52;
        aVar.g = i54;
        if (this.lineLength <= 0 || i54 <= 0) {
            return;
        }
        byte[] bArr8 = this.h;
        java.lang.System.arraycopy(bArr8, 0, ensureBufferSize2, i53, bArr8.length);
        aVar.d += this.h.length;
    }

    @Override // codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.e;
        return b < bArr.length && bArr[b] != -1;
    }

    public Base32(byte b) {
        this(false, b);
    }

    public Base32(boolean z) {
        this(0, null, z, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(boolean z, byte b) {
        this(0, null, z, b);
    }

    public Base32(int i2) {
        this(i2, i);
    }

    public Base32(int i2, byte[] bArr) {
        this(i2, bArr, false, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i2, byte[] bArr, boolean z) {
        this(i2, bArr, z, kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i2, byte[] bArr, boolean z, byte b) {
        super(5, 8, i2, bArr == null ? 0 : bArr.length, b);
        if (z) {
            this.g = m;
            this.e = l;
        } else {
            this.g = k;
            this.e = j;
        }
        if (i2 <= 0) {
            this.f = 8;
            this.h = null;
        } else if (bArr != null) {
            if (!containsAlphabetOrPad(bArr)) {
                this.f = bArr.length + 8;
                byte[] bArr2 = new byte[bArr.length];
                this.h = bArr2;
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                java.lang.String newStringUtf8 = codec.binary.StringUtils.newStringUtf8(bArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("lineSeparator must not contain Base32 characters: [");
                sb.append(newStringUtf8);
                sb.append("]");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("lineLength ");
            sb2.append(i2);
            sb2.append(" > 0, but lineSeparator is null");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        this.d = this.f - 1;
        if (isInAlphabet(b) || codec.binary.BaseNCodec.isWhiteSpace(b)) {
            throw new java.lang.IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    public static void a(int i2, codec.binary.a aVar) {
        if ((i2 & aVar.b) != 0) {
            throw new java.lang.IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible value");
        }
    }
}
