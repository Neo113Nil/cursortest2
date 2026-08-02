package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public abstract class HarakaBase implements org.bouncycastle.crypto.Digest {
    private static final byte[][] Camera2StreamConfigurationMap = {new byte[]{99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118}, new byte[]{-54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction}, new byte[]{-73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK}, new byte[]{4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117}, new byte[]{9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124}, new byte[]{83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion}, new byte[]{-48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88}, new byte[]{81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46}, new byte[]{-51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115}, new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37}, new byte[]{-32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121}, new byte[]{-25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8}, new byte[]{-70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118}, new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98}, new byte[]{-31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33}, new byte[]{-116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN}};
    protected static final int DIGEST_SIZE = 32;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        byte b = bArr[0];
        byte[][] bArr4 = Camera2StreamConfigurationMap;
        byte b2 = bArr4[(b & 255) >>> 4][b & com.google.common.base.Ascii.SI];
        bArr3[0] = b2;
        byte b3 = bArr[1];
        byte b4 = bArr4[(b3 & 255) >>> 4][b3 & com.google.common.base.Ascii.SI];
        bArr3[1] = b4;
        byte b5 = bArr[2];
        byte b6 = bArr4[(b5 & 255) >>> 4][b5 & com.google.common.base.Ascii.SI];
        bArr3[2] = b6;
        byte b7 = bArr[3];
        byte b8 = bArr4[(b7 & 255) >>> 4][b7 & com.google.common.base.Ascii.SI];
        bArr3[3] = b8;
        byte b9 = bArr[4];
        byte b10 = bArr4[(b9 & 255) >>> 4][b9 & com.google.common.base.Ascii.SI];
        bArr3[4] = b10;
        byte b11 = bArr[5];
        byte b12 = bArr4[(b11 & 255) >>> 4][b11 & com.google.common.base.Ascii.SI];
        bArr3[5] = b12;
        byte b13 = bArr[6];
        byte b14 = bArr4[(b13 & 255) >>> 4][b13 & com.google.common.base.Ascii.SI];
        bArr3[6] = b14;
        byte b15 = bArr[7];
        byte b16 = bArr4[(b15 & 255) >>> 4][b15 & com.google.common.base.Ascii.SI];
        bArr3[7] = b16;
        byte b17 = bArr[8];
        byte b18 = bArr4[(b17 & 255) >>> 4][b17 & com.google.common.base.Ascii.SI];
        bArr3[8] = b18;
        byte b19 = bArr[9];
        byte b20 = bArr4[(b19 & 255) >>> 4][b19 & com.google.common.base.Ascii.SI];
        bArr3[9] = b20;
        byte b21 = bArr[10];
        byte b22 = bArr4[(b21 & 255) >>> 4][b21 & com.google.common.base.Ascii.SI];
        bArr3[10] = b22;
        byte b23 = bArr[11];
        byte b24 = bArr4[(b23 & 255) >>> 4][b23 & com.google.common.base.Ascii.SI];
        bArr3[11] = b24;
        byte b25 = bArr[12];
        byte b26 = bArr4[(b25 & 255) >>> 4][b25 & com.google.common.base.Ascii.SI];
        bArr3[12] = b26;
        byte b27 = bArr[13];
        byte b28 = bArr4[(b27 & 255) >>> 4][b27 & com.google.common.base.Ascii.SI];
        bArr3[13] = b28;
        byte b29 = bArr[14];
        byte b30 = bArr4[(b29 & 255) >>> 4][b29 & com.google.common.base.Ascii.SI];
        bArr3[14] = b30;
        byte b31 = bArr[15];
        byte b32 = bArr4[(b31 & 255) >>> 4][b31 & com.google.common.base.Ascii.SI];
        bArr3[15] = b32;
        byte[] bArr5 = {b2, b12, b22, b32, b10, b20, b30, b8, b18, b28, b6, b16, b26, b4, b14, b24};
        byte[] bArr6 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            int i3 = i * 4;
            byte b33 = bArr5[i3];
            int i4 = b33 << 1;
            if ((b33 >>> 7) > 0) {
                i4 ^= 27;
            }
            byte b34 = (byte) (i4 & 255);
            int i5 = i3 + 1;
            byte b35 = bArr5[i5];
            int i6 = b35 << 1;
            if ((b35 >>> 7) > 0) {
                i6 ^= 27;
            }
            int i7 = i3 + 2;
            int i8 = i3 + 3;
            bArr6[i2] = (byte) ((((b34 ^ ((byte) (i6 & 255))) ^ b35) ^ bArr5[i7]) ^ bArr5[i8]);
            int i9 = i2 + 1;
            byte b36 = bArr5[i3];
            byte b37 = bArr5[i5];
            int i10 = b37 << 1;
            if ((b37 >>> 7) > 0) {
                i10 ^= 27;
            }
            int i11 = b36 ^ ((byte) (i10 & 255));
            byte b38 = bArr5[i7];
            int i12 = b38 << 1;
            if ((b38 >>> 7) > 0) {
                i12 ^= 27;
            }
            bArr6[i9] = (byte) (((i11 ^ ((byte) (i12 & 255))) ^ b38) ^ bArr5[i8]);
            int i13 = i2 + 2;
            int i14 = bArr5[i3] ^ bArr5[i5];
            byte b39 = bArr5[i7];
            int i15 = b39 << 1;
            if ((b39 >>> 7) > 0) {
                i15 ^= 27;
            }
            int i16 = i14 ^ ((byte) (i15 & 255));
            byte b40 = bArr5[i8];
            int i17 = b40 << 1;
            if ((b40 >>> 7) > 0) {
                i17 ^= 27;
            }
            bArr6[i13] = (byte) ((i16 ^ ((byte) (i17 & 255))) ^ b40);
            int i18 = i2 + 4;
            int i19 = i2 + 3;
            byte b41 = bArr5[i3];
            int i20 = b41 << 1;
            if ((b41 >>> 7) > 0) {
                i20 ^= 27;
            }
            int i21 = ((b41 ^ ((byte) (i20 & 255))) ^ bArr5[i5]) ^ bArr5[i7];
            byte b42 = bArr5[i8];
            int i22 = b42 << 1;
            if ((b42 >>> 7) > 0) {
                i22 ^= 27;
            }
            bArr6[i19] = (byte) (i21 ^ ((byte) (i22 & 255)));
            i++;
            i2 = i18;
        }
        bArr6[0] = (byte) (bArr6[0] ^ bArr2[15]);
        bArr6[1] = (byte) (bArr6[1] ^ bArr2[14]);
        bArr6[2] = (byte) (bArr6[2] ^ bArr2[13]);
        bArr6[3] = (byte) (bArr6[3] ^ bArr2[12]);
        bArr6[4] = (byte) (bArr6[4] ^ bArr2[11]);
        bArr6[5] = (byte) (bArr6[5] ^ bArr2[10]);
        bArr6[6] = (byte) (bArr6[6] ^ bArr2[9]);
        bArr6[7] = (byte) (bArr6[7] ^ bArr2[8]);
        bArr6[8] = (byte) (bArr2[7] ^ bArr6[8]);
        bArr6[9] = (byte) (bArr6[9] ^ bArr2[6]);
        bArr6[10] = (byte) (bArr6[10] ^ bArr2[5]);
        bArr6[11] = (byte) (bArr6[11] ^ bArr2[4]);
        bArr6[12] = (byte) (bArr6[12] ^ bArr2[3]);
        bArr6[13] = (byte) (bArr6[13] ^ bArr2[2]);
        bArr6[14] = (byte) (bArr6[14] ^ bArr2[1]);
        bArr6[15] = (byte) (bArr6[15] ^ bArr2[0]);
        return bArr6;
    }

    static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i]);
            i2++;
            i++;
        }
        return bArr3;
    }
}
