package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class MD5Digest extends org.bouncycastle.crypto.digests.GeneralDigest implements org.bouncycastle.crypto.digests.EncodableDigest {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getInputFormats;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = this.getHighSpeedVideoSizes;
        int i5 = (((~i2) & i4) | (i3 & i2)) + i;
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i6 = iArr[0];
        int i7 = (i5 + i6) - 680876936;
        int i8 = ((i7 << 7) | (i7 >>> 25)) + i2;
        int i9 = (((~i8) & i3) | (i2 & i8)) + i4;
        int i10 = iArr[1];
        int i11 = (i9 + i10) - 389564586;
        int i12 = ((i11 << 12) | (i11 >>> 20)) + i8;
        int i13 = (((~i12) & i2) | (i8 & i12)) + i3;
        int i14 = iArr[2];
        int i15 = i13 + i14 + 606105819;
        int i16 = ((i15 << 17) | (i15 >>> 15)) + i12;
        int i17 = (((~i16) & i8) | (i12 & i16)) + i2;
        int i18 = iArr[3];
        int i19 = (i17 + i18) - 1044525330;
        int i20 = ((i19 >>> 10) | (i19 << 22)) + i16;
        int i21 = i8 + (((~i20) & i12) | (i16 & i20));
        int i22 = iArr[4];
        int i23 = (i21 + i22) - 176418897;
        int i24 = ((i23 >>> 25) | (i23 << 7)) + i20;
        int i25 = i12 + (((~i24) & i16) | (i20 & i24));
        int i26 = iArr[5];
        int i27 = i25 + i26 + 1200080426;
        int i28 = ((i27 >>> 20) | (i27 << 12)) + i24;
        int i29 = i16 + (((~i28) & i20) | (i24 & i28));
        int i30 = iArr[6];
        int i31 = (i29 + i30) - 1473231341;
        int i32 = ((i31 >>> 15) | (i31 << 17)) + i28;
        int i33 = i20 + (((~i32) & i24) | (i28 & i32));
        int i34 = iArr[7];
        int i35 = (i33 + i34) - 45705983;
        int i36 = ((i35 >>> 10) | (i35 << 22)) + i32;
        int i37 = i24 + (((~i36) & i28) | (i32 & i36));
        int i38 = iArr[8];
        int i39 = i37 + i38 + 1770035416;
        int i40 = ((i39 >>> 25) | (i39 << 7)) + i36;
        int i41 = i28 + (((~i40) & i32) | (i36 & i40));
        int i42 = iArr[9];
        int i43 = (i41 + i42) - 1958414417;
        int i44 = ((i43 >>> 20) | (i43 << 12)) + i40;
        int i45 = i32 + (((~i44) & i36) | (i40 & i44));
        int i46 = iArr[10];
        int i47 = (i45 + i46) - 42063;
        int i48 = ((i47 >>> 15) | (i47 << 17)) + i44;
        int i49 = i36 + (((~i48) & i40) | (i44 & i48));
        int i50 = iArr[11];
        int i51 = (i49 + i50) - 1990404162;
        int i52 = ((i51 >>> 10) | (i51 << 22)) + i48;
        int i53 = i40 + (((~i52) & i44) | (i48 & i52));
        int i54 = iArr[12];
        int i55 = i53 + i54 + 1804603682;
        int i56 = ((i55 << 7) | (i55 >>> 25)) + i52;
        int i57 = i44 + (((~i56) & i48) | (i52 & i56));
        int i58 = iArr[13];
        int i59 = (i57 + i58) - 40341101;
        int i60 = ((i59 >>> 20) | (i59 << 12)) + i56;
        int i61 = ~i60;
        int i62 = iArr[14];
        int i63 = ((i48 + ((i61 & i52) | (i56 & i60))) + i62) - 1502002290;
        int i64 = ((i63 >>> 15) | (i63 << 17)) + i60;
        int i65 = ~i64;
        int i66 = iArr[15];
        int i67 = i52 + ((i65 & i56) | (i60 & i64)) + i66 + 1236535329;
        int i68 = ((i67 >>> 10) | (i67 << 22)) + i64;
        int i69 = ((i56 + ((i68 & i60) | (i61 & i64))) + i10) - 165796510;
        int i70 = ((i69 >>> 27) | (i69 << 5)) + i68;
        int i71 = ((i60 + ((i65 & i68) | (i70 & i64))) + i30) - 1069501632;
        int i72 = ((i71 >>> 23) | (i71 << 9)) + i70;
        int i73 = i64 + ((i72 & i68) | ((~i68) & i70)) + i50 + 643717713;
        int i74 = ((i73 >>> 18) | (i73 << 14)) + i72;
        int i75 = ((i68 + ((i74 & i70) | ((~i70) & i72))) + i6) - 373897302;
        int i76 = ((i75 >>> 12) | (i75 << 20)) + i74;
        int i77 = ((i70 + ((i76 & i72) | ((~i72) & i74))) + i26) - 701558691;
        int i78 = ((i77 << 5) | (i77 >>> 27)) + i76;
        int i79 = i72 + ((i78 & i74) | ((~i74) & i76)) + i46 + 38016083;
        int i80 = ((i79 << 9) | (i79 >>> 23)) + i78;
        int i81 = ((i74 + ((i80 & i76) | ((~i76) & i78))) + i66) - 660478335;
        int i82 = ((i81 << 14) | (i81 >>> 18)) + i80;
        int i83 = ((i76 + ((i82 & i78) | ((~i78) & i80))) + i22) - 405537848;
        int i84 = ((i83 << 20) | (i83 >>> 12)) + i82;
        int i85 = i78 + ((i84 & i80) | ((~i80) & i82)) + i42 + 568446438;
        int i86 = ((i85 << 5) | (i85 >>> 27)) + i84;
        int i87 = ((i80 + ((i86 & i82) | ((~i82) & i84))) + i62) - 1019803690;
        int i88 = ((i87 << 9) | (i87 >>> 23)) + i86;
        int i89 = ((i82 + ((i88 & i84) | ((~i84) & i86))) + i18) - 187363961;
        int i90 = ((i89 << 14) | (i89 >>> 18)) + i88;
        int i91 = i84 + ((i90 & i86) | ((~i86) & i88)) + i38 + 1163531501;
        int i92 = ((i91 << 20) | (i91 >>> 12)) + i90;
        int i93 = ((i86 + ((i92 & i88) | ((~i88) & i90))) + i58) - 1444681467;
        int i94 = ((i93 << 5) | (i93 >>> 27)) + i92;
        int i95 = ((i88 + ((i94 & i90) | ((~i90) & i92))) + i14) - 51403784;
        int i96 = ((i95 << 9) | (i95 >>> 23)) + i94;
        int i97 = i90 + ((i96 & i92) | ((~i92) & i94)) + i34 + 1735328473;
        int i98 = ((i97 << 14) | (i97 >>> 18)) + i96;
        int i99 = ((i92 + ((i98 & i94) | ((~i94) & i96))) + i54) - 1926607734;
        int i100 = ((i99 << 20) | (i99 >>> 12)) + i98;
        int i101 = ((i94 + ((i100 ^ i98) ^ i96)) + i26) - 378558;
        int i102 = ((i101 << 4) | (i101 >>> 28)) + i100;
        int i103 = ((i96 + ((i102 ^ i100) ^ i98)) + i38) - 2022574463;
        int i104 = ((i103 << 11) | (i103 >>> 21)) + i102;
        int i105 = i98 + ((i104 ^ i102) ^ i100) + i50 + 1839030562;
        int i106 = ((i105 << 16) | (i105 >>> 16)) + i104;
        int i107 = ((i100 + ((i106 ^ i104) ^ i102)) + i62) - 35309556;
        int i108 = ((i107 << 23) | (i107 >>> 9)) + i106;
        int i109 = ((i102 + ((i108 ^ i106) ^ i104)) + i10) - 1530992060;
        int i110 = ((i109 << 4) | (i109 >>> 28)) + i108;
        int i111 = i104 + ((i110 ^ i108) ^ i106) + i22 + 1272893353;
        int i112 = ((i111 << 11) | (i111 >>> 21)) + i110;
        int i113 = ((i106 + ((i112 ^ i110) ^ i108)) + i34) - 155497632;
        int i114 = ((i113 << 16) | (i113 >>> 16)) + i112;
        int i115 = ((i108 + ((i114 ^ i112) ^ i110)) + i46) - 1094730640;
        int i116 = ((i115 << 23) | (i115 >>> 9)) + i114;
        int i117 = i110 + ((i116 ^ i114) ^ i112) + i58 + 681279174;
        int i118 = ((i117 << 4) | (i117 >>> 28)) + i116;
        int i119 = ((i112 + ((i118 ^ i116) ^ i114)) + i6) - 358537222;
        int i120 = ((i119 << 11) | (i119 >>> 21)) + i118;
        int i121 = ((i114 + ((i120 ^ i118) ^ i116)) + i18) - 722521979;
        int i122 = ((i121 << 16) | (i121 >>> 16)) + i120;
        int i123 = i116 + ((i122 ^ i120) ^ i118) + i30 + 76029189;
        int i124 = ((i123 << 23) | (i123 >>> 9)) + i122;
        int i125 = ((i118 + ((i124 ^ i122) ^ i120)) + i42) - 640364487;
        int i126 = ((i125 << 4) | (i125 >>> 28)) + i124;
        int i127 = ((i120 + ((i126 ^ i124) ^ i122)) + i54) - 421815835;
        int i128 = ((i127 << 11) | (i127 >>> 21)) + i126;
        int i129 = i122 + ((i128 ^ i126) ^ i124) + i66 + 530742520;
        int i130 = ((i129 << 16) | (i129 >>> 16)) + i128;
        int i131 = ((i124 + ((i130 ^ i128) ^ i126)) + i14) - 995338651;
        int i132 = ((i131 << 23) | (i131 >>> 9)) + i130;
        int i133 = ((i126 + (((~i128) | i132) ^ i130)) + i6) - 198630844;
        int i134 = ((i133 << 6) | (i133 >>> 26)) + i132;
        int i135 = i128 + (((~i130) | i134) ^ i132) + i34 + 1126891415;
        int i136 = ((i135 << 10) | (i135 >>> 22)) + i134;
        int i137 = ((i130 + (((~i132) | i136) ^ i134)) + i62) - 1416354905;
        int i138 = ((i137 << 15) | (i137 >>> 17)) + i136;
        int i139 = ((i132 + (((~i134) | i138) ^ i136)) + i26) - 57434055;
        int i140 = ((i139 >>> 11) | (i139 << 21)) + i138;
        int i141 = i134 + (((~i136) | i140) ^ i138) + i54 + 1700485571;
        int i142 = ((i141 << 6) | (i141 >>> 26)) + i140;
        int i143 = ((i136 + (((~i138) | i142) ^ i140)) + i18) - 1894986606;
        int i144 = ((i143 << 10) | (i143 >>> 22)) + i142;
        int i145 = ((i138 + (((~i140) | i144) ^ i142)) + i46) - 1051523;
        int i146 = ((i145 << 15) | (i145 >>> 17)) + i144;
        int i147 = ((i140 + (((~i142) | i146) ^ i144)) + i10) - 2054922799;
        int i148 = ((i147 << 21) | (i147 >>> 11)) + i146;
        int i149 = i142 + (((~i144) | i148) ^ i146) + i38 + 1873313359;
        int i150 = ((i149 << 6) | (i149 >>> 26)) + i148;
        int i151 = ((i144 + (((~i146) | i150) ^ i148)) + i66) - 30611744;
        int i152 = ((i151 << 10) | (i151 >>> 22)) + i150;
        int i153 = ((i146 + (((~i148) | i152) ^ i150)) + i30) - 1560198380;
        int i154 = ((i153 << 15) | (i153 >>> 17)) + i152;
        int i155 = i148 + (((~i150) | i154) ^ i152) + i58 + 1309151649;
        int i156 = ((i155 >>> 11) | (i155 << 21)) + i154;
        int i157 = ((i150 + (((~i152) | i156) ^ i154)) + i22) - 145523070;
        int i158 = ((i157 << 6) | (i157 >>> 26)) + i156;
        int i159 = ((i152 + (((~i154) | i158) ^ i156)) + i50) - 1120210379;
        int i160 = ((i159 << 10) | (i159 >>> 22)) + i158;
        int i161 = i154 + (((~i156) | i160) ^ i158) + i14 + 718787259;
        int i162 = ((i161 << 15) | (i161 >>> 17)) + i160;
        int i163 = ((i156 + (((~i158) | i162) ^ i160)) + i42) - 343485551;
        this.getHighSpeedVideoFpsRanges = i + i158;
        this.Camera2StreamConfigurationMap = i2 + ((i163 << 21) | (i163 >>> 11)) + i162;
        this.getHighResolutionOutputSizeshNQ4ISI = i3 + i162;
        this.getHighSpeedVideoSizes = i4 + i160;
        this.getInputFormats = 0;
        int i164 = 0;
        while (true) {
            int[] iArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (i164 == iArr2.length) {
                return;
            }
            iArr2[i164] = 0;
            i164++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighSpeedVideoFpsRanges((org.bouncycastle.crypto.digests.MD5Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighSpeedVideoFpsRanges = 1732584193;
        this.Camera2StreamConfigurationMap = -271733879;
        this.getHighResolutionOutputSizeshNQ4ISI = -1732584194;
        this.getHighSpeedVideoSizes = 271733878;
        this.getInputFormats = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getInputFormats;
        int i3 = i2 + 1;
        this.getInputFormats = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getInputFormats > 14) {
            processBlock();
        }
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.getInputFormats * 4) + 36];
        super.populateState(bArr);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, bArr, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 24);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, bArr, 28);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputFormats, bArr, 32);
        for (int i = 0; i != this.getInputFormats; i++) {
            org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor[i], bArr, (i * 4) + 36);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, bArr, i);
        getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, bArr, i + 4);
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i + 8);
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.MD5Digest(this);
    }

    private static void getHighSpeedVideoFpsRanges(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.digests.MD5Digest mD5Digest) {
        super.copyIn(mD5Digest);
        this.getHighSpeedVideoFpsRanges = mD5Digest.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = mD5Digest.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = mD5Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = mD5Digest.getHighSpeedVideoSizes;
        int[] iArr = mD5Digest.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(iArr, 0, this.getHighSpeedVideoFpsRangesFor, 0, iArr.length);
        this.getInputFormats = mD5Digest.getInputFormats;
    }

    public MD5Digest(byte[] bArr) {
        super(bArr);
        this.getHighSpeedVideoFpsRangesFor = new int[16];
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 16);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 20);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 24);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 28);
        this.getInputFormats = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 32);
        for (int i = 0; i != this.getInputFormats; i++) {
            this.getHighSpeedVideoFpsRangesFor[i] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, (i * 4) + 36);
        }
    }

    public MD5Digest(org.bouncycastle.crypto.digests.MD5Digest mD5Digest) {
        super(mD5Digest);
        this.getHighSpeedVideoFpsRangesFor = new int[16];
        getHighSpeedVideoFpsRanges(mD5Digest);
    }

    public MD5Digest() {
        this.getHighSpeedVideoFpsRangesFor = new int[16];
        reset();
    }
}
