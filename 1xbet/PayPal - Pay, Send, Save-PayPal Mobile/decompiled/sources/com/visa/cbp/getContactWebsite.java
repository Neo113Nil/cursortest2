package com.visa.cbp;

/* loaded from: classes16.dex */
public class getContactWebsite implements com.visa.cbp.CardDatum {
    private int[] getOutputSizes = null;
    private static final short[] getHighSpeedVideoFpsRangesFor = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] getOutputSizeshNQ4ISI = {8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {56, 48, 40, 32, com.google.common.base.Ascii.CAN, 16, 8, 0, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 41, 33, com.google.common.base.Ascii.EM, 17, 9, 1, 58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 42, 34, com.google.common.base.Ascii.SUB, 18, 10, 2, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 43, 35, 62, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 46, 38, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, 14, 6, kotlin.io.encoding.Base64.padSymbol, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 45, 37, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 13, 5, 60, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 44, 36, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 4, com.google.common.base.Ascii.ESC, 19, com.google.common.base.Ascii.VT, 3};
    private static final byte[] getHighSpeedVideoSizes = {1, 2, 4, 6, 8, 10, com.google.common.base.Ascii.FF, 14, com.google.common.base.Ascii.SI, 17, 19, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS};
    private static final byte[] Camera2StreamConfigurationMap = {13, 16, 10, com.google.common.base.Ascii.ETB, 0, 4, 2, com.google.common.base.Ascii.ESC, 14, 5, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SYN, 18, com.google.common.base.Ascii.VT, 3, com.google.common.base.Ascii.EM, 7, com.google.common.base.Ascii.SI, 6, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.FF, 1, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.RS, 36, 46, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 44, 32, 47, 43, 48, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 45, 41, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 35, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US};
    private static final int[] getOutputStallDurationlomOqCM = {android.R.attr.transitionName, 0, 65536, android.R.attr.fillColor, android.R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, android.R.attr.transitionName, android.R.attr.fillColor, 1024, 16778244, android.R.attr.manageSpaceActivity, 16777216, 4, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 16778240, 16778240, 66560, 66560, android.R.attr.theme, android.R.attr.theme, 16778244, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, 16777220, 16777220, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, 0, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 66564, 16777216, 65536, android.R.attr.fillColor, 4, android.R.attr.theme, android.R.attr.transitionName, 16777216, 16777216, 1024, android.R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, android.R.attr.fillColor, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, android.R.attr.theme, 16778244, 16777220, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 66564, android.R.attr.transitionName, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 16778240, 16778240, 0, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, 66560, 0, android.R.attr.manageSpaceActivity};
    private static final int[] getOutputMinFrameDuration = {-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
    private static final int[] getHighSpeedVideoSizesFor = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 134349312, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 131080, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] getOutputMinFrameDurationlomOqCM = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
    private static final int[] getInputSizeshNQ4ISI = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
    private static final int[] getOutputFormats = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312};
    private static final int[] getHighSpeedVideoFpsRanges = {2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] getInputFormats = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    @Override // com.visa.cbp.CardDatum
    public void valueOf() {
    }

    @Override // com.visa.cbp.CardDatum
    public int values() {
        return 8;
    }

    @Override // com.visa.cbp.CardDatum
    public void ReplenishAckRequest(boolean z, com.visa.cbp.setContent setcontent) {
        if (setcontent instanceof com.visa.cbp.getContactNumber) {
            com.visa.cbp.getContactNumber getcontactnumber = (com.visa.cbp.getContactNumber) setcontent;
            if (getcontactnumber.BuildConfig.length > 8) {
                throw new java.lang.IllegalArgumentException("DES key too long - should be 8 bytes");
            }
            this.getOutputSizes = valueOf(z, getcontactnumber.BuildConfig);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to DES init - ");
        sb.append(setcontent.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.visa.cbp.CardDatum
    public java.lang.String BuildConfig() {
        return "DES";
    }

    @Override // com.visa.cbp.CardDatum
    public int ReplenishAckRequest(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.getOutputSizes;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("DES engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new com.visa.cbp.setContentType("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new com.visa.cbp.getBackgroundColor("output buffer too short");
        }
        ConfirmReplenishRequest(iArr, bArr, i, bArr2, i2);
        return 8;
    }

    protected static int[] valueOf(boolean z, byte[] bArr) {
        int i;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 56) {
                break;
            }
            byte b = getHighResolutionOutputSizeshNQ4ISI[i2];
            if ((getHighSpeedVideoFpsRangesFor[b & 7] & bArr[b >>> 3]) == 0) {
                z2 = false;
            }
            zArr[i2] = z2;
            i2++;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = z ? i3 << 1 : (15 - i3) << 1;
            int i5 = i4 + 1;
            iArr[i5] = 0;
            iArr[i4] = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= 28) {
                    break;
                }
                int i7 = getHighSpeedVideoSizes[i3] + i6;
                if (i7 < 28) {
                    zArr2[i6] = zArr[i7];
                } else {
                    zArr2[i6] = zArr[i7 - 28];
                }
                i6++;
            }
            for (i = 28; i < 56; i++) {
                int i8 = getHighSpeedVideoSizes[i3] + i;
                if (i8 < 56) {
                    zArr2[i] = zArr[i8];
                } else {
                    zArr2[i] = zArr[i8 - 28];
                }
            }
            for (int i9 = 0; i9 < 24; i9++) {
                byte[] bArr2 = Camera2StreamConfigurationMap;
                if (zArr2[bArr2[i9]]) {
                    iArr[i4] = iArr[i4] | getOutputSizeshNQ4ISI[i9];
                }
                if (zArr2[bArr2[i9 + 24]]) {
                    iArr[i5] = iArr[i5] | getOutputSizeshNQ4ISI[i9];
                }
            }
        }
        for (int i10 = 0; i10 != 32; i10 += 2) {
            int i11 = iArr[i10];
            int i12 = i10 + 1;
            int i13 = iArr[i12];
            iArr[i10] = ((16515072 & i11) << 6) | ((i11 & 4032) << 10) | ((i13 & 16515072) >>> 10) | ((i13 & 4032) >>> 6);
            iArr[i12] = ((i11 & 258048) << 12) | ((i11 & 63) << 16) | ((i13 & 258048) >>> 4) | (i13 & 63);
        }
        return iArr;
    }

    protected static void ConfirmReplenishRequest(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int ReplenishAckRequest = com.visa.cbp.setContactEmail.ReplenishAckRequest(bArr, i);
        int ReplenishAckRequest2 = com.visa.cbp.setContactEmail.ReplenishAckRequest(bArr, i + 4);
        int i3 = ((ReplenishAckRequest >>> 4) ^ ReplenishAckRequest2) & 252645135;
        int i4 = ReplenishAckRequest2 ^ i3;
        int i5 = ReplenishAckRequest ^ (i3 << 4);
        int i6 = ((i5 >>> 16) ^ i4) & 65535;
        int i7 = i4 ^ i6;
        int i8 = i5 ^ (i6 << 16);
        int i9 = ((i7 >>> 2) ^ i8) & 858993459;
        int i10 = i8 ^ i9;
        int i11 = i7 ^ (i9 << 2);
        int i12 = ((i11 >>> 8) ^ i10) & 16711935;
        int i13 = i10 ^ i12;
        int i14 = i11 ^ (i12 << 8);
        int i15 = (i14 << 1) | (i14 >>> 31);
        int i16 = (i13 ^ i15) & (-1431655766);
        int i17 = i13 ^ i16;
        int i18 = i15 ^ i16;
        int i19 = (i17 << 1) | (i17 >>> 31);
        for (int i20 = 0; i20 < 8; i20++) {
            int i21 = i20 << 2;
            int i22 = ((i18 << 28) | (i18 >>> 4)) ^ iArr[i21];
            int[] iArr2 = getHighSpeedVideoFpsRanges;
            int i23 = iArr2[i22 & 63];
            int[] iArr3 = getInputSizeshNQ4ISI;
            int i24 = iArr3[(i22 >>> 8) & 63];
            int[] iArr4 = getHighSpeedVideoSizesFor;
            int i25 = iArr4[(i22 >>> 16) & 63];
            int[] iArr5 = getOutputStallDurationlomOqCM;
            int i26 = iArr5[(i22 >>> 24) & 63];
            int i27 = iArr[i21 + 1] ^ i18;
            int[] iArr6 = getInputFormats;
            int i28 = iArr6[i27 & 63];
            int[] iArr7 = getOutputFormats;
            int i29 = iArr7[(i27 >>> 8) & 63];
            int[] iArr8 = getOutputMinFrameDurationlomOqCM;
            int i30 = iArr8[(i27 >>> 16) & 63];
            int[] iArr9 = getOutputMinFrameDuration;
            i19 ^= ((((i26 | ((i23 | i24) | i25)) | i28) | i29) | i30) | iArr9[(i27 >>> 24) & 63];
            int i31 = ((i19 << 28) | (i19 >>> 4)) ^ iArr[i21 + 2];
            int i32 = iArr2[i31 & 63];
            int i33 = iArr3[(i31 >>> 8) & 63];
            int i34 = iArr4[(i31 >>> 16) & 63];
            int i35 = iArr5[(i31 >>> 24) & 63];
            int i36 = iArr[i21 + 3] ^ i19;
            int i37 = iArr6[i36 & 63];
            i18 ^= iArr9[(i36 >>> 24) & 63] | ((((i35 | ((i32 | i33) | i34)) | i37) | iArr7[(i36 >>> 8) & 63]) | iArr8[(i36 >>> 16) & 63]);
        }
        int i38 = (i18 << 31) | (i18 >>> 1);
        int i39 = (i19 ^ i38) & (-1431655766);
        int i40 = i19 ^ i39;
        int i41 = i38 ^ i39;
        int i42 = (i40 << 31) | (i40 >>> 1);
        int i43 = ((i42 >>> 8) ^ i41) & 16711935;
        int i44 = i41 ^ i43;
        int i45 = i42 ^ (i43 << 8);
        int i46 = ((i45 >>> 2) ^ i44) & 858993459;
        int i47 = i44 ^ i46;
        int i48 = i45 ^ (i46 << 2);
        int i49 = ((i47 >>> 16) ^ i48) & 65535;
        int i50 = i48 ^ i49;
        int i51 = i47 ^ (i49 << 16);
        int i52 = ((i51 >>> 4) ^ i50) & 252645135;
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(i51 ^ (i52 << 4), bArr2, i2);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(i50 ^ i52, bArr2, i2 + 4);
    }
}
