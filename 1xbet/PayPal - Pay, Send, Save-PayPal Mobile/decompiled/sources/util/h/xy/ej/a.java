package util.h.xy.ej;

/* loaded from: classes18.dex */
public class a implements util.h.xy.ef.ra {
    private static final int[] Camera2StreamConfigurationMap;
    private static final int[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final int[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static final int[] getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static final int[] getOutputFormats;
    private static final int[] getOutputMinFrameDuration;
    private static final byte[] getOutputMinFrameDurationlomOqCM;
    private static final byte[] getOutputSizes;
    private static int getOutputSizeshNQ4ISI = 0;
    private static final int[] getOutputStallDuration;
    private static final short[] getOutputStallDurationlomOqCM;
    private static final int[] getValidOutputFormatsForInputhNQ4ISI;
    private static final int[] isOutputSupportedFor;
    private static long toString = 0;
    private static int unwrapAs = 1;
    private int[] isOutputSupportedForhNQ4ISI = null;

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 85) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ toString))) ^ c;
            rbVar.f2651++;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 77) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 115) % 128;
        while (rbVar.f2651 < i) {
            int i4 = getHighSpeedVideoSizes + 55;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoSizes();
        getOutputStallDurationlomOqCM = new short[]{128, 64, 32, 16, 8, 4, 2, 1};
        getValidOutputFormatsForInputhNQ4ISI = new int[]{8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        getOutputMinFrameDurationlomOqCM = new byte[]{56, 48, 40, 32, com.google.common.base.Ascii.CAN, 16, 8, 0, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 41, 33, com.google.common.base.Ascii.EM, 17, 9, 1, 58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 42, 34, com.google.common.base.Ascii.SUB, 18, 10, 2, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 43, 35, 62, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 46, 38, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, 14, 6, kotlin.io.encoding.Base64.padSymbol, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 45, 37, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 13, 5, 60, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 44, 36, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 4, com.google.common.base.Ascii.ESC, 19, com.google.common.base.Ascii.VT, 3};
        getInputSizeshNQ4ISI = new byte[]{1, 2, 4, 6, 8, 10, com.google.common.base.Ascii.FF, 14, com.google.common.base.Ascii.SI, 17, 19, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS};
        getOutputSizes = new byte[]{13, 16, 10, com.google.common.base.Ascii.ETB, 0, 4, 2, com.google.common.base.Ascii.ESC, 14, 5, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SYN, 18, com.google.common.base.Ascii.VT, 3, com.google.common.base.Ascii.EM, 7, com.google.common.base.Ascii.SI, 6, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.FF, 1, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.RS, 36, 46, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 44, 32, 47, 43, 48, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 45, 41, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 35, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US};
        getHighSpeedVideoFpsRangesFor = new int[]{android.R.attr.transitionName, 0, 65536, android.R.attr.fillColor, android.R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, android.R.attr.transitionName, android.R.attr.fillColor, 1024, 16778244, android.R.attr.manageSpaceActivity, 16777216, 4, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 16778240, 16778240, 66560, 66560, android.R.attr.theme, android.R.attr.theme, 16778244, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, 16777220, 16777220, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, 0, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 66564, 16777216, 65536, android.R.attr.fillColor, 4, android.R.attr.theme, android.R.attr.transitionName, 16777216, 16777216, 1024, android.R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, android.R.attr.fillColor, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, android.R.attr.theme, 16778244, 16777220, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 66564, android.R.attr.transitionName, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, 16778240, 16778240, 0, androidx.core.view.InputDeviceCompat.SOURCE_TRACKBALL, 66560, 0, android.R.attr.manageSpaceActivity};
        getHighResolutionOutputSizeshNQ4ISI = new int[]{-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
        Camera2StreamConfigurationMap = new int[]{my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 134349312, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 131080, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 134348800, 131592, 8, 134348808, 131584};
        isOutputSupportedFor = new int[]{8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
        getOutputFormats = new int[]{256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
        getInputFormats = new int[]{536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312};
        getOutputStallDuration = new int[]{2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
        getOutputMinFrameDuration = new int[]{268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};
        getOutputSizeshNQ4ISI = (unwrapAs + 93) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected void m26594(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        unwrapAs = (getOutputSizeshNQ4ISI + 49) % 128;
        int m26839 = util.h.xy.fb.rb.m26839(bArr, i);
        int m268392 = util.h.xy.fb.rb.m26839(bArr, i + 4);
        int i3 = ((m26839 >>> 4) ^ m268392) & 252645135;
        int i4 = m268392 ^ i3;
        int i5 = m26839 ^ (i3 << 4);
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
        getOutputSizeshNQ4ISI = (unwrapAs + 45) % 128;
        for (int i20 = 0; i20 < 8; i20++) {
            int i21 = i20 * 4;
            int i22 = ((i18 << 28) | (i18 >>> 4)) ^ iArr[i21];
            int[] iArr2 = getOutputStallDuration;
            int i23 = iArr2[i22 & 63];
            int[] iArr3 = getOutputFormats;
            int i24 = iArr3[(i22 >>> 8) & 63];
            int[] iArr4 = Camera2StreamConfigurationMap;
            int i25 = iArr4[(i22 >>> 16) & 63];
            int[] iArr5 = getHighSpeedVideoFpsRangesFor;
            int i26 = iArr5[(i22 >>> 24) & 63];
            int i27 = iArr[i21 + 1] ^ i18;
            int[] iArr6 = getOutputMinFrameDuration;
            int i28 = iArr6[i27 & 63];
            int[] iArr7 = getInputFormats;
            int i29 = iArr7[(i27 >>> 8) & 63];
            int[] iArr8 = isOutputSupportedFor;
            int i30 = iArr8[(i27 >>> 16) & 63];
            int[] iArr9 = getHighResolutionOutputSizeshNQ4ISI;
            i19 ^= ((((i26 | ((i23 | i24) | i25)) | i28) | i29) | i30) | iArr9[(i27 >>> 24) & 63];
            int i31 = ((i19 << 28) | (i19 >>> 4)) ^ iArr[i21 + 2];
            int i32 = iArr2[i31 & 63];
            int i33 = iArr3[(i31 >>> 8) & 63];
            int i34 = iArr4[(i31 >>> 16) & 63];
            int i35 = iArr5[(i31 >>> 24) & 63];
            int i36 = iArr[i21 + 3] ^ i19;
            i18 ^= iArr9[(i36 >>> 24) & 63] | ((((i35 | ((i32 | i33) | i34)) | iArr6[i36 & 63]) | iArr7[(i36 >>> 8) & 63]) | iArr8[(i36 >>> 16) & 63]);
        }
        int i37 = (i18 << 31) | (i18 >>> 1);
        int i38 = (i19 ^ i37) & (-1431655766);
        int i39 = i19 ^ i38;
        int i40 = i37 ^ i38;
        int i41 = (i39 << 31) | (i39 >>> 1);
        int i42 = ((i41 >>> 8) ^ i40) & 16711935;
        int i43 = i40 ^ i42;
        int i44 = i41 ^ (i42 << 8);
        int i45 = ((i44 >>> 2) ^ i43) & 858993459;
        int i46 = i43 ^ i45;
        int i47 = i44 ^ (i45 << 2);
        int i48 = ((i46 >>> 16) ^ i47) & 65535;
        int i49 = i47 ^ i48;
        int i50 = i46 ^ (i48 << 16);
        int i51 = ((i50 >>> 4) ^ i49) & 252645135;
        util.h.xy.fb.rb.m26847(i50 ^ (i51 << 4), bArr2, i2);
        util.h.xy.fb.rb.m26847(i49 ^ i51, bArr2, i2 + 4);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected int[] m26595(boolean z, byte[] bArr) {
        int i;
        int i2;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= 56) {
                break;
            }
            byte b = getOutputMinFrameDurationlomOqCM[i3];
            if ((getOutputStallDurationlomOqCM[b & 7] & bArr[b >>> 3]) != 0) {
                int i4 = getOutputSizeshNQ4ISI + 119;
                unwrapAs = i4 % 128;
                if (i4 % 2 != 0) {
                    zArr[i3] = z2;
                    i3++;
                }
            }
            z2 = false;
            zArr[i3] = z2;
            i3++;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            int i6 = (getOutputSizeshNQ4ISI + 61) % 128;
            unwrapAs = i6;
            if (z) {
                i = i5 << 1;
                getOutputSizeshNQ4ISI = (i6 + 67) % 128;
            } else {
                i = (15 - i5) << 1;
            }
            int i7 = i + 1;
            iArr[i7] = 0;
            iArr[i] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= 28) {
                    break;
                }
                int i9 = getInputSizeshNQ4ISI[i5] + i8;
                if (i9 < 28) {
                    getOutputSizeshNQ4ISI = (unwrapAs + 79) % 128;
                    zArr2[i8] = zArr[i9];
                } else {
                    zArr2[i8] = zArr[i9 - 28];
                }
                i8++;
            }
            for (i2 = 28; i2 < 56; i2++) {
                int i10 = getInputSizeshNQ4ISI[i5] + i2;
                if (i10 < 56) {
                    zArr2[i2] = zArr[i10];
                } else {
                    zArr2[i2] = zArr[i10 - 28];
                }
            }
            for (int i11 = 0; i11 < 24; i11++) {
                int i12 = unwrapAs + 77;
                getOutputSizeshNQ4ISI = i12 % 128;
                if (i12 % 2 != 0) {
                    boolean z3 = zArr2[getOutputSizes[i11]];
                    throw null;
                }
                byte[] bArr2 = getOutputSizes;
                if (zArr2[bArr2[i11]]) {
                    iArr[i] = iArr[i] | getValidOutputFormatsForInputhNQ4ISI[i11];
                }
                if (zArr2[bArr2[i11 + 24]]) {
                    iArr[i7] = iArr[i7] | getValidOutputFormatsForInputhNQ4ISI[i11];
                }
            }
        }
        for (int i13 = 0; i13 != 32; i13 += 2) {
            int i14 = iArr[i13];
            int i15 = i13 + 1;
            int i16 = iArr[i15];
            iArr[i13] = ((16515072 & i14) << 6) | ((i14 & 4032) << 10) | ((i16 & 16515072) >>> 10) | ((i16 & 4032) >>> 6);
            iArr[i15] = ((i14 & 258048) << 12) | ((i14 & 63) << 16) | ((i16 & 258048) >>> 4) | (i16 & 63);
        }
        return iArr;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ᐝ */
    public void mo26557() {
        getOutputSizeshNQ4ISI = (unwrapAs + 47) % 128;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public int mo26555(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.isOutputSupportedForhNQ4ISI;
        if (iArr == null) {
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(26 - packedPositionGroup, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 75, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (i + 8 <= bArr.length) {
            if (i2 + 8 <= bArr2.length) {
                m26594(iArr, bArr, i, bArr2, i2);
                return 8;
            }
            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(22 - bitsPerPixel, (scrollBarFadeDuration >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) android.graphics.Color.blue(0), objArr2);
            throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
        }
        try {
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(23 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), 101 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.view.View.combineMeasuredStates(0, 0), objArr3);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr3[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public int mo26554() {
        int i = unwrapAs;
        getOutputSizeshNQ4ISI = (i + 71) % 128;
        int i2 = i + 115;
        getOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 8;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public void mo26556(boolean z, util.h.xy.ef.mb mbVar) {
        int i = getOutputSizeshNQ4ISI + 117;
        unwrapAs = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (!(mbVar instanceof util.h.xy.ep.mc)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int indexOf = android.text.TextUtils.indexOf("", "");
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(indexOf + 39, 36 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (39011 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(mbVar.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        util.h.xy.ep.mc mcVar = (util.h.xy.ep.mc) mbVar;
        if (mcVar.m26663().length <= 8) {
            this.isOutputSupportedForhNQ4ISI = m26595(z, mcVar.m26663());
            unwrapAs = (getOutputSizeshNQ4ISI + 109) % 128;
            return;
        }
        int indexOf2 = android.text.TextUtils.indexOf("", "", 0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(indexOf2 + 36, android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 39142), objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = new char[]{1187, 44861, 21386, 1562, 43760, 24217, 292, 46494, 22635, 3103, 45246, 23314, 4095, 45979, 26171, 2769, 48439, 24901, 5609, 47193, 27875, 4227, 47928, 28610, 4715, 50752, 27299, 7495, 49571, 30172, 6245, 52420, 30590, 7148, 53148, 29225, 1035, 44947, 21290, 1758, 43634, 24080, 444, 46363, 22762, 3220, 45094, 23510, 3963, 45844, 26276, 2646, 48608, 25037, 5436, 47310, 27773, 4122, 48045, 28495, 4778, 50833, 27179, 7559, 49474, 29988, 6291, 52227, 30699, 7027, 53013, 29355, 9758, 51636, 32216, 40005, 14299, 52076, 40700, 12824, 50804, 39388, 11569, 49303, 38131, 10263, 50106, 38682, 11110, 65171, 37433, 9631, 63975, 36187, 8357, 62476, 34918, 9154, 63291, 35468, 24290, 40040, 14320, 52047, 40617, 12809, 50746, 39385, 11565, 49311, 38128, 10322, 50086, 38741, 11110, 65244, 37439, 9681, 63997, 36167, 8355, 62495, 34942, 40046, 14315, 52043, 40620, 12808, 50798, 39323, 11578, 49292, 38128, 10321, 50097, 38663, 11058, 65223, 37439, 9630, 63918, 36188, 8356, 62466, 34936, 9183};
        toString = -7772578287174273122L;
    }
}
