package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class MD4Digest extends org.bouncycastle.crypto.digests.GeneralDigest {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = (((~i2) & i4) | (i3 & i2)) + i;
        int[] iArr = this.getHighSpeedVideoSizes;
        int i6 = iArr[0];
        int i7 = i5 + i6;
        int i8 = (i7 << 3) | (i7 >>> 29);
        int i9 = (((~i8) & i3) | (i2 & i8)) + i4;
        int i10 = iArr[1];
        int i11 = i9 + i10;
        int i12 = (i11 << 7) | (i11 >>> 25);
        int i13 = (((~i12) & i2) | (i8 & i12)) + i3;
        int i14 = iArr[2];
        int i15 = i13 + i14;
        int i16 = (i15 << 11) | (i15 >>> 21);
        int i17 = (((~i16) & i8) | (i12 & i16)) + i2;
        int i18 = iArr[3];
        int i19 = i17 + i18;
        int i20 = (i19 >>> 13) | (i19 << 19);
        int i21 = i8 + (((~i20) & i12) | (i16 & i20));
        int i22 = iArr[4];
        int i23 = i21 + i22;
        int i24 = (i23 >>> 29) | (i23 << 3);
        int i25 = i12 + (((~i24) & i16) | (i20 & i24));
        int i26 = iArr[5];
        int i27 = i25 + i26;
        int i28 = (i27 >>> 25) | (i27 << 7);
        int i29 = i16 + (((~i28) & i20) | (i24 & i28));
        int i30 = iArr[6];
        int i31 = i29 + i30;
        int i32 = (i31 >>> 21) | (i31 << 11);
        int i33 = i20 + (((~i32) & i24) | (i28 & i32));
        int i34 = iArr[7];
        int i35 = i33 + i34;
        int i36 = (i35 >>> 13) | (i35 << 19);
        int i37 = i24 + (((~i36) & i28) | (i32 & i36));
        int i38 = iArr[8];
        int i39 = i37 + i38;
        int i40 = (i39 >>> 29) | (i39 << 3);
        int i41 = i28 + (((~i40) & i32) | (i36 & i40));
        int i42 = iArr[9];
        int i43 = i41 + i42;
        int i44 = (i43 >>> 25) | (i43 << 7);
        int i45 = i32 + (((~i44) & i36) | (i40 & i44));
        int i46 = iArr[10];
        int i47 = i45 + i46;
        int i48 = (i47 >>> 21) | (i47 << 11);
        int i49 = i36 + (((~i48) & i40) | (i44 & i48));
        int i50 = iArr[11];
        int i51 = i49 + i50;
        int i52 = (i51 >>> 13) | (i51 << 19);
        int i53 = i40 + (((~i52) & i44) | (i48 & i52));
        int i54 = iArr[12];
        int i55 = i53 + i54;
        int i56 = (i55 >>> 29) | (i55 << 3);
        int i57 = i44 + (((~i56) & i48) | (i52 & i56));
        int i58 = iArr[13];
        int i59 = i57 + i58;
        int i60 = (i59 >>> 25) | (i59 << 7);
        int i61 = i48 + (((~i60) & i52) | (i56 & i60));
        int i62 = iArr[14];
        int i63 = i61 + i62;
        int i64 = (i63 >>> 21) | (i63 << 11);
        int i65 = i60 & i64;
        int i66 = i52 + (((~i64) & i56) | i65);
        int i67 = iArr[15];
        int i68 = i66 + i67;
        int i69 = (i68 >>> 13) | (i68 << 19);
        int i70 = i56 + ((i69 & (i64 | i60)) | i65) + i6 + 1518500249;
        int i71 = (i70 >>> 29) | (i70 << 3);
        int i72 = i60 + ((i71 & (i69 | i64)) | (i69 & i64)) + i22 + 1518500249;
        int i73 = (i72 >>> 27) | (i72 << 5);
        int i74 = i64 + ((i73 & (i71 | i69)) | (i71 & i69)) + i38 + 1518500249;
        int i75 = (i74 >>> 23) | (i74 << 9);
        int i76 = i69 + ((i75 & (i73 | i71)) | (i73 & i71)) + i54 + 1518500249;
        int i77 = (i76 >>> 19) | (i76 << 13);
        int i78 = i71 + ((i77 & (i75 | i73)) | (i75 & i73)) + i10 + 1518500249;
        int i79 = (i78 >>> 29) | (i78 << 3);
        int i80 = i73 + ((i79 & (i77 | i75)) | (i77 & i75)) + i26 + 1518500249;
        int i81 = (i80 >>> 27) | (i80 << 5);
        int i82 = i75 + ((i81 & (i79 | i77)) | (i79 & i77)) + i42 + 1518500249;
        int i83 = (i82 >>> 23) | (i82 << 9);
        int i84 = i77 + ((i83 & (i81 | i79)) | (i81 & i79)) + i58 + 1518500249;
        int i85 = (i84 >>> 19) | (i84 << 13);
        int i86 = i79 + ((i85 & (i83 | i81)) | (i83 & i81)) + i14 + 1518500249;
        int i87 = (i86 >>> 29) | (i86 << 3);
        int i88 = i81 + ((i87 & (i85 | i83)) | (i85 & i83)) + i30 + 1518500249;
        int i89 = (i88 >>> 27) | (i88 << 5);
        int i90 = i83 + ((i89 & (i87 | i85)) | (i87 & i85)) + i46 + 1518500249;
        int i91 = (i90 >>> 23) | (i90 << 9);
        int i92 = i85 + ((i91 & (i89 | i87)) | (i89 & i87)) + i62 + 1518500249;
        int i93 = (i92 >>> 19) | (i92 << 13);
        int i94 = i87 + ((i93 & (i91 | i89)) | (i91 & i89)) + i18 + 1518500249;
        int i95 = (i94 >>> 29) | (i94 << 3);
        int i96 = i89 + ((i95 & (i93 | i91)) | (i93 & i91)) + i34 + 1518500249;
        int i97 = (i96 >>> 27) | (i96 << 5);
        int i98 = i91 + ((i97 & (i95 | i93)) | (i95 & i93)) + i50 + 1518500249;
        int i99 = (i98 >>> 23) | (i98 << 9);
        int i100 = i93 + ((i99 & (i97 | i95)) | (i97 & i95)) + i67 + 1518500249;
        int i101 = (i100 >>> 19) | (i100 << 13);
        int i102 = i95 + ((i101 ^ i99) ^ i97) + i6 + 1859775393;
        int i103 = (i102 >>> 29) | (i102 << 3);
        int i104 = i97 + ((i103 ^ i101) ^ i99) + i38 + 1859775393;
        int i105 = (i104 << 9) | (i104 >>> 23);
        int i106 = i99 + ((i105 ^ i103) ^ i101) + i22 + 1859775393;
        int i107 = (i106 >>> 21) | (i106 << 11);
        int i108 = i101 + ((i107 ^ i105) ^ i103) + i54 + 1859775393;
        int i109 = (i108 >>> 17) | (i108 << 15);
        int i110 = i103 + ((i109 ^ i107) ^ i105) + i14 + 1859775393;
        int i111 = (i110 << 3) | (i110 >>> 29);
        int i112 = i105 + ((i111 ^ i109) ^ i107) + i46 + 1859775393;
        int i113 = (i112 >>> 23) | (i112 << 9);
        int i114 = i107 + ((i113 ^ i111) ^ i109) + i30 + 1859775393;
        int i115 = (i114 << 11) | (i114 >>> 21);
        int i116 = i109 + ((i115 ^ i113) ^ i111) + i62 + 1859775393;
        int i117 = (i116 >>> 17) | (i116 << 15);
        int i118 = i111 + ((i117 ^ i115) ^ i113) + i10 + 1859775393;
        int i119 = (i118 >>> 29) | (i118 << 3);
        int i120 = i113 + ((i119 ^ i117) ^ i115) + i42 + 1859775393;
        int i121 = (i120 << 9) | (i120 >>> 23);
        int i122 = i115 + ((i121 ^ i119) ^ i117) + i26 + 1859775393;
        int i123 = (i122 >>> 21) | (i122 << 11);
        int i124 = i117 + ((i123 ^ i121) ^ i119) + i58 + 1859775393;
        int i125 = (i124 << 15) | (i124 >>> 17);
        int i126 = i119 + ((i125 ^ i123) ^ i121) + i18 + 1859775393;
        int i127 = (i126 << 3) | (i126 >>> 29);
        int i128 = i121 + ((i127 ^ i125) ^ i123) + i50 + 1859775393;
        int i129 = (i128 >>> 23) | (i128 << 9);
        int i130 = i123 + ((i129 ^ i127) ^ i125) + i34 + 1859775393;
        int i131 = (i130 >>> 21) | (i130 << 11);
        int i132 = i125 + ((i131 ^ i129) ^ i127) + i67 + 1859775393;
        this.getHighSpeedVideoFpsRanges = i + i127;
        this.Camera2StreamConfigurationMap = i2 + ((i132 << 15) | (i132 >>> 17));
        this.getHighSpeedVideoFpsRangesFor = i3 + i131;
        this.getHighResolutionOutputSizeshNQ4ISI = i4 + i129;
        this.getInputSizeshNQ4ISI = 0;
        int i133 = 0;
        while (true) {
            int[] iArr2 = this.getHighSpeedVideoSizes;
            if (i133 == iArr2.length) {
                return;
            }
            iArr2[i133] = 0;
            i133++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighSpeedVideoSizes((org.bouncycastle.crypto.digests.MD4Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighSpeedVideoFpsRanges = 1732584193;
        this.Camera2StreamConfigurationMap = -271733879;
        this.getHighSpeedVideoFpsRangesFor = -1732584194;
        this.getHighResolutionOutputSizeshNQ4ISI = 271733878;
        this.getInputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.getHighSpeedVideoSizes;
        int i2 = this.getInputSizeshNQ4ISI;
        int i3 = i2 + 1;
        this.getInputSizeshNQ4ISI = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getInputSizeshNQ4ISI > 14) {
            processBlock();
        }
        int[] iArr = this.getHighSpeedVideoSizes;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, bArr, i);
        getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, bArr, i + 4);
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, bArr, i + 8);
        getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.MD4Digest(this);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.crypto.digests.MD4Digest mD4Digest) {
        super.copyIn(mD4Digest);
        this.getHighSpeedVideoFpsRanges = mD4Digest.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = mD4Digest.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = mD4Digest.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = mD4Digest.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr = mD4Digest.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(iArr, 0, this.getHighSpeedVideoSizes, 0, iArr.length);
        this.getInputSizeshNQ4ISI = mD4Digest.getInputSizeshNQ4ISI;
    }

    public MD4Digest(org.bouncycastle.crypto.digests.MD4Digest mD4Digest) {
        super(mD4Digest);
        this.getHighSpeedVideoSizes = new int[16];
        getHighSpeedVideoSizes(mD4Digest);
    }

    public MD4Digest() {
        this.getHighSpeedVideoSizes = new int[16];
        reset();
    }
}
