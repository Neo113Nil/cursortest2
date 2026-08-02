package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class DSTU7564Digest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private long getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private long[] getOutputSizes;
    private long[] getOutputSizeshNQ4ISI;
    private long[] getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private static final byte[] getHighSpeedVideoFpsRanges = {-88, 67, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 6, 107, 117, 108, 89, 113, -33, -121, -107, com.google.common.base.Ascii.ETB, com.visa.cbp.getEncExpo.onUnminimized, -40, 9, 109, -13, com.google.common.base.Ascii.GS, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -76, -74, -102, 14, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.NAK, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, com.google.common.base.Ascii.EM, -43, -83, 88, -92, -69, -95, -36, -14, -125, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 66, -28, 122, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -106, com.google.common.base.Ascii.SYN, 35, 43, -62, 101, 102, com.google.common.base.Ascii.SI, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, com.google.common.base.Ascii.RS, 34, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 36, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -57, -78, 59, -114, com.visa.cbp.getEncExpo.IResultReceiver, -70, -11, com.google.common.base.Ascii.DC4, -97, 8, 85, -101, 76, -2, com.visa.cbp.getEncExpo.IResultReceiver2, 92, -38, com.google.common.base.Ascii.CAN, 70, -51, 125, 33, -80, 63, com.google.common.base.Ascii.ESC, -119, -1, -21, -124, 105, 58, -99, -41, -45, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -59, 2, -90, 116, 45, com.google.common.base.Ascii.VT, -94, 118, -77, -66, -50, -67, -82, -23, -118, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.FS, -20, -15, com.visa.cbp.getEncExpo.registerForActivityResult, -108, -86, -10, 38, 47, -17, -24, -116, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, kotlin.io.encoding.Base64.padSymbol, -126, -9, -22, 10, 13, 126, -8, 80, com.google.common.base.Ascii.SUB, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, com.google.common.base.Ascii.FF, 18, 41, 81, -71, com.visa.cbp.getEncExpo.kernelVersion, -42, 115, -115, -127, 84, com.visa.cbp.getEncExpo.startTransaction, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};
    private static final byte[] getHighSpeedVideoSizes = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, com.google.common.base.Ascii.ETB, -8, 66, com.google.common.base.Ascii.NAK, 86, -76, 101, com.google.common.base.Ascii.FS, -120, 67, -59, 92, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, -11, 87, 103, -115, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -10, 100, 88, -98, -12, 34, -86, 117, com.google.common.base.Ascii.SI, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, com.google.common.base.Ascii.DC4, -56, -82, 84, 16, -40, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.SUB, 107, 105, -13, -67, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -85, -6, -47, -101, 104, 78, com.google.common.base.Ascii.SYN, -107, -111, -18, 76, 99, -114, 91, -52, 60, com.google.common.base.Ascii.EM, -95, -127, 73, 123, -39, 111, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.visa.cbp.getEncExpo.IResultReceiver2, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 42, -38, -55, 0, 126, -94, 85, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 17, -43, -100, com.visa.cbp.getEncExpo.kernelVersion, 14, 10, kotlin.io.encoding.Base64.padSymbol, 81, 125, -109, com.google.common.base.Ascii.ESC, -2, -60, 71, 9, -122, com.google.common.base.Ascii.VT, -113, -99, 106, 7, -71, -80, -104, com.google.common.base.Ascii.CAN, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 113, 75, -17, 59, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, com.google.common.base.Ascii.RS, 56, -31, -72, -88, -32, com.google.common.base.Ascii.FF, 35, 118, com.google.common.base.Ascii.GS, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.IResultReceiver, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -34, -51, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.registerForActivityResult, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -5, -37, 89, -74, -62, 1, com.visa.cbp.getEncExpo.onUnminimized, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, com.visa.cbp.getEncExpo.startTransaction, 41, -41};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, com.google.common.base.Ascii.ETB, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.google.common.base.Ascii.SYN, -31, 73, 60, com.visa.cbp.getEncExpo.startTransaction, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 16, -43, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -98, 77, -87, 85, -58, -48, 123, com.google.common.base.Ascii.CAN, -105, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -26, 72, 86, -127, -113, com.visa.cbp.getEncExpo.IResultReceiver, -52, -100, -71, -30, -84, -72, 47, com.google.common.base.Ascii.NAK, -92, 124, -38, 56, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, 5, -42, com.google.common.base.Ascii.DC4, 110, 108, 126, 102, -3, -79, -27, com.visa.cbp.getEncExpo.IResultReceiver2, -81, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -121, -55, com.visa.cbp.getEncExpo.onUnminimized, 93, 109, 63, -120, -115, -57, -9, com.google.common.base.Ascii.GS, -23, -20, -19, Byte.MIN_VALUE, 41, 39, com.visa.cbp.getEncExpo.kernelVersion, com.visa.cbp.getEncExpo.registerForActivityResult, -88, 80, com.google.common.base.Ascii.SI, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, com.google.common.base.Ascii.US, 7, com.google.common.base.Ascii.FS, -118, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -94, 115, -7, -54, 58, com.google.common.base.Ascii.SUB, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, com.google.common.base.Ascii.EM, -119, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 1, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 117, 99, com.google.common.base.Ascii.ESC, 35, kotlin.io.encoding.Base64.padSymbol, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 6, 70, 68, 66, 4, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -37, 57, -122, 84, -86, -116, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 33, -117, -8, com.google.common.base.Ascii.FF, 116, 103};
    private static final byte[] Camera2StreamConfigurationMap = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 34, 3, 70, kotlin.io.encoding.Base64.padSymbol, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, com.google.common.base.Ascii.SYN, 60, 102, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, com.google.common.base.Ascii.SUB, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -42, -123, 35, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, com.visa.cbp.getEncExpo.registerForActivityResult, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, com.google.common.base.Ascii.CAN, -60, 44, 113, 114, 68, com.google.common.base.Ascii.NAK, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -66, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -86, -101, -120, -40, -85, -119, -100, -6, com.visa.cbp.getEncExpo.IResultReceiver2, -22, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 98, com.google.common.base.Ascii.FF, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 126, 16, -15, 123, -113, 99, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 5, -102, 67, com.visa.cbp.getEncExpo.IResultReceiver, 33, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 39, 9, -61, -97, -74, -41, 41, -62, -21, com.visa.cbp.getEncExpo.startTransaction, -92, -117, -116, com.google.common.base.Ascii.GS, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, com.google.common.base.Ascii.SI, 10, 6, -26, 43, -106, -93, com.google.common.base.Ascii.FS, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 125, 120, com.google.common.base.Ascii.VT, -107, -29, -83, 116, -104, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 100, 109, -36, com.visa.cbp.getEncExpo.onUnminimized, 89, -87, 76, com.google.common.base.Ascii.ETB, Byte.MAX_VALUE, -111, -72, -55, 87, com.google.common.base.Ascii.ESC, -32, 97};

    private static long getHighSpeedVideoSizes(long j) {
        long j2 = ((9187201950435737471L & j) << 1) ^ (((j & (-9187201950435737472L)) >>> 7) * 29);
        long j3 = ((j << (-8)) | (j >>> 8)) ^ j;
        long j4 = (j3 ^ ((j3 << (-16)) | (j3 >>> 16))) ^ ((j << (-48)) | (j >>> 48));
        long j5 = (j ^ j4) ^ j2;
        long j6 = (((j5 & 4557430888798830399L) << 2) ^ ((((-9187201950435737472L) & j5) >>> 6) * 29)) ^ (((4629771061636907072L & j5) >>> 6) * 29);
        return ((((j6 >>> 32) | (j6 << (-32))) ^ j4) ^ ((j2 << (-40)) | (j2 >>> 40))) ^ ((j2 >>> 48) | (j2 << (-48)));
    }

    private void Camera2StreamConfigurationMap(long[] jArr) {
        for (int i = 0; i < this.getOutputStallDurationlomOqCM; i++) {
            long j = i;
            for (int i2 = 0; i2 < this.getOutputFormats; i2++) {
                jArr[i2] = jArr[i2] ^ j;
                j += 16;
            }
            getHighSpeedVideoFpsRangesFor(jArr);
            getHighSpeedVideoSizes(jArr);
            for (int i3 = 0; i3 < this.getOutputFormats; i3++) {
                jArr[i3] = getHighSpeedVideoSizes(jArr[i3]);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.getOutputFormats; i2++) {
            long littleEndianToLong = org.bouncycastle.util.Pack.littleEndianToLong(bArr, i);
            i += 8;
            this.getOutputStallDuration[i2] = this.getOutputSizeshNQ4ISI[i2] ^ littleEndianToLong;
            this.getOutputSizes[i2] = littleEndianToLong;
        }
        Camera2StreamConfigurationMap(this.getOutputStallDuration);
        long[] jArr = this.getOutputSizes;
        for (int i3 = 0; i3 < this.getOutputStallDurationlomOqCM; i3++) {
            long j = ((((this.getOutputFormats - 1) << 4) ^ i3) << 56) | 67818912035696883L;
            for (int i4 = 0; i4 < this.getOutputFormats; i4++) {
                jArr[i4] = jArr[i4] + j;
                j -= kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK;
            }
            getHighSpeedVideoFpsRangesFor(jArr);
            getHighSpeedVideoSizes(jArr);
            for (int i5 = 0; i5 < this.getOutputFormats; i5++) {
                jArr[i5] = getHighSpeedVideoSizes(jArr[i5]);
            }
        }
        for (int i6 = 0; i6 < this.getOutputFormats; i6++) {
            long[] jArr2 = this.getOutputSizeshNQ4ISI;
            jArr2[i6] = jArr2[i6] ^ (this.getOutputStallDuration[i6] ^ this.getOutputSizes[i6]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.getOutputMinFrameDuration != 0 && i2 > 0) {
            update(bArr[i]);
            i2--;
            i++;
        }
        if (i2 > 0) {
            while (i2 >= this.getHighResolutionOutputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRanges(bArr, i);
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                i += i3;
                i2 -= i3;
                this.getInputSizeshNQ4ISI++;
            }
            while (i2 > 0) {
                update(bArr[i]);
                i2--;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.getInputFormats;
        int i = this.getOutputMinFrameDuration;
        int i2 = i + 1;
        this.getOutputMinFrameDuration = i2;
        bArr[i] = b;
        if (i2 == this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoFpsRanges(bArr, 0);
            this.getOutputMinFrameDuration = 0;
            this.getInputSizeshNQ4ISI++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        Camera2StreamConfigurationMap((org.bouncycastle.crypto.digests.DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        org.bouncycastle.util.Arrays.fill(this.getOutputSizeshNQ4ISI, 0L);
        this.getOutputSizeshNQ4ISI[0] = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = 0L;
        this.getOutputMinFrameDuration = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = this.getOutputMinFrameDuration;
        byte[] bArr2 = this.getInputFormats;
        int i5 = i4 + 1;
        this.getOutputMinFrameDuration = i5;
        bArr2[i4] = Byte.MIN_VALUE;
        int i6 = this.getHighResolutionOutputSizeshNQ4ISI - 12;
        int i7 = 0;
        if (i5 > i6) {
            while (true) {
                int i8 = this.getOutputMinFrameDuration;
                if (i8 >= this.getHighResolutionOutputSizeshNQ4ISI) {
                    break;
                }
                byte[] bArr3 = this.getInputFormats;
                this.getOutputMinFrameDuration = i8 + 1;
                bArr3[i8] = 0;
            }
            this.getOutputMinFrameDuration = 0;
            getHighSpeedVideoFpsRanges(this.getInputFormats, 0);
        }
        while (true) {
            i2 = this.getOutputMinFrameDuration;
            if (i2 >= i6) {
                break;
            }
            byte[] bArr4 = this.getInputFormats;
            this.getOutputMinFrameDuration = i2 + 1;
            bArr4[i2] = 0;
        }
        long j = (((this.getInputSizeshNQ4ISI & 4294967295L) * this.getHighResolutionOutputSizeshNQ4ISI) + i4) << 3;
        org.bouncycastle.util.Pack.intToLittleEndian((int) j, this.getInputFormats, i2);
        int i9 = this.getOutputMinFrameDuration + 4;
        this.getOutputMinFrameDuration = i9;
        org.bouncycastle.util.Pack.longToLittleEndian((j >>> 32) + (((this.getInputSizeshNQ4ISI >>> 32) * this.getHighResolutionOutputSizeshNQ4ISI) << 3), this.getInputFormats, i9);
        getHighSpeedVideoFpsRanges(this.getInputFormats, 0);
        java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI, 0, this.getOutputStallDuration, 0, this.getOutputFormats);
        Camera2StreamConfigurationMap(this.getOutputStallDuration);
        while (true) {
            i3 = this.getOutputFormats;
            if (i7 >= i3) {
                break;
            }
            long[] jArr = this.getOutputSizeshNQ4ISI;
            jArr[i7] = jArr[i7] ^ this.getOutputStallDuration[i7];
            i7++;
        }
        for (int i10 = i3 - (this.getHighSpeedVideoSizesFor >>> 3); i10 < this.getOutputFormats; i10++) {
            org.bouncycastle.util.Pack.longToLittleEndian(this.getOutputSizeshNQ4ISI[i10], bArr, i);
            i += 8;
        }
        reset();
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.DSTU7564Digest(this);
    }

    private void getHighSpeedVideoSizes(long[] jArr) {
        for (int i = 0; i < this.getOutputFormats; i++) {
            long j = jArr[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte[] bArr = getHighSpeedVideoFpsRanges;
            byte b = bArr[i2 & 255];
            byte[] bArr2 = getHighSpeedVideoSizes;
            byte b2 = bArr2[(i2 >>> 8) & 255];
            byte[] bArr3 = getHighSpeedVideoFpsRangesFor;
            byte b3 = bArr3[(i2 >>> 16) & 255];
            byte[] bArr4 = Camera2StreamConfigurationMap;
            byte b4 = bArr4[i2 >>> 24];
            byte b5 = bArr[i3 & 255];
            byte b6 = bArr2[(i3 >>> 8) & 255];
            byte b7 = bArr3[(i3 >>> 16) & 255];
            byte b8 = bArr4[i3 >>> 24];
            jArr[i] = (((b8 << com.google.common.base.Ascii.CAN) | (((b5 & 255) | ((b6 & 255) << 8)) | ((b7 & 255) << 16))) << 32) | (((b4 << com.google.common.base.Ascii.CAN) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16)) & 4294967295L);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(long[] jArr) {
        int i = this.getOutputFormats;
        if (i == 8) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = (j ^ j5) & (-4294967296L);
            long j10 = j ^ j9;
            long j11 = j5 ^ j9;
            long j12 = (j2 ^ j6) & 72057594021150720L;
            long j13 = j2 ^ j12;
            long j14 = j6 ^ j12;
            long j15 = (j3 ^ j7) & 281474976645120L;
            long j16 = j3 ^ j15;
            long j17 = j7 ^ j15;
            long j18 = (j4 ^ j8) & 1099511627520L;
            long j19 = j4 ^ j18;
            long j20 = j8 ^ j18;
            long j21 = (j10 ^ j16) & (-281470681808896L);
            long j22 = j10 ^ j21;
            long j23 = j16 ^ j21;
            long j24 = (j13 ^ j19) & 72056494543077120L;
            long j25 = j13 ^ j24;
            long j26 = j19 ^ j24;
            long j27 = (j11 ^ j17) & (-281470681808896L);
            long j28 = j11 ^ j27;
            long j29 = j17 ^ j27;
            long j30 = (j14 ^ j20) & 72056494543077120L;
            long j31 = j14 ^ j30;
            long j32 = j20 ^ j30;
            long j33 = (j22 ^ j25) & (-71777214294589696L);
            long j34 = (j23 ^ j26) & (-71777214294589696L);
            long j35 = (j28 ^ j31) & (-71777214294589696L);
            long j36 = (j29 ^ j32) & (-71777214294589696L);
            jArr[0] = j22 ^ j33;
            jArr[1] = j25 ^ j33;
            jArr[2] = j23 ^ j34;
            jArr[3] = j26 ^ j34;
            jArr[4] = j28 ^ j35;
            jArr[5] = j31 ^ j35;
            jArr[6] = j29 ^ j36;
            jArr[7] = j32 ^ j36;
            return;
        }
        if (i != 16) {
            throw new java.lang.IllegalStateException("unsupported state size: only 512/1024 are allowed");
        }
        long j37 = jArr[0];
        long j38 = jArr[1];
        long j39 = jArr[2];
        long j40 = jArr[3];
        long j41 = jArr[4];
        long j42 = jArr[5];
        long j43 = jArr[6];
        long j44 = jArr[7];
        long j45 = jArr[8];
        long j46 = jArr[9];
        long j47 = jArr[10];
        long j48 = jArr[11];
        long j49 = jArr[12];
        long j50 = jArr[13];
        long j51 = jArr[14];
        long j52 = jArr[15];
        long j53 = (j37 ^ j45) & (-72057594037927936L);
        long j54 = j37 ^ j53;
        long j55 = j45 ^ j53;
        long j56 = (j38 ^ j46) & (-72057594037927936L);
        long j57 = j38 ^ j56;
        long j58 = j46 ^ j56;
        long j59 = (j39 ^ j47) & (-281474976710656L);
        long j60 = j39 ^ j59;
        long j61 = j47 ^ j59;
        long j62 = (j40 ^ j48) & (-1099511627776L);
        long j63 = j40 ^ j62;
        long j64 = j48 ^ j62;
        long j65 = (j41 ^ j49) & (-4294967296L);
        long j66 = j41 ^ j65;
        long j67 = j49 ^ j65;
        long j68 = (j42 ^ j50) & 72057594021150720L;
        long j69 = j42 ^ j68;
        long j70 = j50 ^ j68;
        long j71 = (j43 ^ j51) & 72057594037862400L;
        long j72 = j43 ^ j71;
        long j73 = j51 ^ j71;
        long j74 = (j44 ^ j52) & 72057594037927680L;
        long j75 = j44 ^ j74;
        long j76 = j52 ^ j74;
        long j77 = (j54 ^ j66) & 72057589742960640L;
        long j78 = j54 ^ j77;
        long j79 = j66 ^ j77;
        long j80 = (j57 ^ j69) & (-16777216);
        long j81 = j57 ^ j80;
        long j82 = j69 ^ j80;
        long j83 = (j60 ^ j72) & (-71776119061282816L);
        long j84 = j60 ^ j83;
        long j85 = j72 ^ j83;
        long j86 = (j63 ^ j75) & (-72056494526300416L);
        long j87 = j63 ^ j86;
        long j88 = j75 ^ j86;
        long j89 = (j55 ^ j67) & 72057589742960640L;
        long j90 = j55 ^ j89;
        long j91 = j67 ^ j89;
        long j92 = (j58 ^ j70) & (-16777216);
        long j93 = j58 ^ j92;
        long j94 = j70 ^ j92;
        long j95 = (j61 ^ j73) & (-71776119061282816L);
        long j96 = j61 ^ j95;
        long j97 = j73 ^ j95;
        long j98 = (j64 ^ j76) & (-72056494526300416L);
        long j99 = j64 ^ j98;
        long j100 = j76 ^ j98;
        long j101 = (j78 ^ j84) & (-281470681808896L);
        long j102 = j78 ^ j101;
        long j103 = j84 ^ j101;
        long j104 = (j81 ^ j87) & 72056494543077120L;
        long j105 = j81 ^ j104;
        long j106 = j87 ^ j104;
        long j107 = (j79 ^ j85) & (-281470681808896L);
        long j108 = j79 ^ j107;
        long j109 = j85 ^ j107;
        long j110 = (j82 ^ j88) & 72056494543077120L;
        long j111 = j82 ^ j110;
        long j112 = j88 ^ j110;
        long j113 = (j90 ^ j96) & (-281470681808896L);
        long j114 = j90 ^ j113;
        long j115 = j96 ^ j113;
        long j116 = (j93 ^ j99) & 72056494543077120L;
        long j117 = j93 ^ j116;
        long j118 = j99 ^ j116;
        long j119 = (j91 ^ j97) & (-281470681808896L);
        long j120 = j91 ^ j119;
        long j121 = j97 ^ j119;
        long j122 = (j94 ^ j100) & 72056494543077120L;
        long j123 = j94 ^ j122;
        long j124 = j100 ^ j122;
        long j125 = (j102 ^ j105) & (-71777214294589696L);
        long j126 = (j103 ^ j106) & (-71777214294589696L);
        long j127 = (j108 ^ j111) & (-71777214294589696L);
        long j128 = (j109 ^ j112) & (-71777214294589696L);
        long j129 = (j114 ^ j117) & (-71777214294589696L);
        long j130 = (j115 ^ j118) & (-71777214294589696L);
        long j131 = (j120 ^ j123) & (-71777214294589696L);
        long j132 = (j121 ^ j124) & (-71777214294589696L);
        jArr[0] = j102 ^ j125;
        jArr[1] = j105 ^ j125;
        jArr[2] = j103 ^ j126;
        jArr[3] = j106 ^ j126;
        jArr[4] = j108 ^ j127;
        jArr[5] = j111 ^ j127;
        jArr[6] = j109 ^ j128;
        jArr[7] = j112 ^ j128;
        jArr[8] = j114 ^ j129;
        jArr[9] = j117 ^ j129;
        jArr[10] = j115 ^ j130;
        jArr[11] = j118 ^ j130;
        jArr[12] = j120 ^ j131;
        jArr[13] = j123 ^ j131;
        jArr[14] = j121 ^ j132;
        jArr[15] = j124 ^ j132;
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.crypto.digests.DSTU7564Digest dSTU7564Digest) {
        this.getHighSpeedVideoSizesFor = dSTU7564Digest.getHighSpeedVideoSizesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = dSTU7564Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputStallDurationlomOqCM = dSTU7564Digest.getOutputStallDurationlomOqCM;
        int i = this.getOutputFormats;
        if (i <= 0 || i != dSTU7564Digest.getOutputFormats) {
            this.getOutputFormats = dSTU7564Digest.getOutputFormats;
            this.getOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(dSTU7564Digest.getOutputSizeshNQ4ISI);
            int i2 = this.getOutputFormats;
            this.getOutputStallDuration = new long[i2];
            this.getOutputSizes = new long[i2];
            this.getInputFormats = org.bouncycastle.util.Arrays.clone(dSTU7564Digest.getInputFormats);
        } else {
            java.lang.System.arraycopy(dSTU7564Digest.getOutputSizeshNQ4ISI, 0, this.getOutputSizeshNQ4ISI, 0, i);
            java.lang.System.arraycopy(dSTU7564Digest.getInputFormats, 0, this.getInputFormats, 0, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getInputSizeshNQ4ISI = dSTU7564Digest.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = dSTU7564Digest.getOutputMinFrameDuration;
    }

    public DSTU7564Digest(org.bouncycastle.crypto.digests.DSTU7564Digest dSTU7564Digest) {
        Camera2StreamConfigurationMap(dSTU7564Digest);
    }

    public DSTU7564Digest(int i) {
        int i2;
        if (i != 256 && i != 384 && i != 512) {
            throw new java.lang.IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.getHighSpeedVideoSizesFor = i >>> 3;
        if (i > 256) {
            this.getOutputFormats = 16;
            i2 = 14;
        } else {
            this.getOutputFormats = 8;
            i2 = 10;
        }
        this.getOutputStallDurationlomOqCM = i2;
        int i3 = this.getOutputFormats;
        int i4 = i3 << 3;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        long[] jArr = new long[i3];
        this.getOutputSizeshNQ4ISI = jArr;
        jArr[0] = i4;
        this.getOutputStallDuration = new long[i3];
        this.getOutputSizes = new long[i3];
        this.getInputFormats = new byte[i4];
    }
}
