package com.visa.cbp;

/* loaded from: classes5.dex */
public final class setLabelColor extends com.visa.cbp.getForegroundColor {
    private static int[] getHighSpeedVideoSizes = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int[] getInputSizeshNQ4ISI = new int[64];
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputStallDurationlomOqCM;

    @Override // com.visa.cbp.getAdditionalProperties
    public final int values() {
        return 32;
    }

    public setLabelColor() {
        ReplenishAckRequest();
    }

    @Override // com.visa.cbp.getForegroundColor
    protected final void ConfirmReplenishRequest(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        iArr[i2] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i3 == 16) {
            ConfirmReplenishRequest();
        }
    }

    @Override // com.visa.cbp.getForegroundColor
    protected final void BuildConfig(long j) {
        if (this.getHighResolutionOutputSizeshNQ4ISI > 14) {
            ConfirmReplenishRequest();
        }
        int[] iArr = this.getInputSizeshNQ4ISI;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // com.visa.cbp.getAdditionalProperties
    public final int values(byte[] bArr) {
        valueOf();
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getHighSpeedVideoFpsRangesFor, bArr, 0);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getOutputStallDurationlomOqCM, bArr, 4);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.Camera2StreamConfigurationMap, bArr, 8);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getOutputMinFrameDuration, bArr, 12);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getHighSpeedVideoFpsRanges, bArr, 16);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getInputFormats, bArr, 20);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getOutputFormats, bArr, 24);
        com.visa.cbp.setContactEmail.ConfirmReplenishRequest(this.getHighSpeedVideoSizesFor, bArr, 28);
        ReplenishAckRequest();
        return 32;
    }

    @Override // com.visa.cbp.getForegroundColor, com.visa.cbp.getAdditionalProperties
    public final void ReplenishAckRequest() {
        super.ReplenishAckRequest();
        this.getHighSpeedVideoFpsRangesFor = 1779033703;
        this.getOutputStallDurationlomOqCM = -1150833019;
        this.Camera2StreamConfigurationMap = 1013904242;
        this.getOutputMinFrameDuration = -1521486534;
        this.getHighSpeedVideoFpsRanges = 1359893119;
        this.getInputFormats = -1694144372;
        this.getOutputFormats = 528734635;
        this.getHighSpeedVideoSizesFor = 1541459225;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getInputSizeshNQ4ISI;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // com.visa.cbp.getForegroundColor
    protected final void ConfirmReplenishRequest() {
        com.visa.cbp.setLabelColor setlabelcolor = this;
        for (int i = 16; i <= 63; i++) {
            int[] iArr = setlabelcolor.getInputSizeshNQ4ISI;
            int i2 = iArr[i - 2];
            int i3 = iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = ((((i2 << 13) | (i2 >>> 19)) ^ ((i2 >>> 17) | (i2 << 15))) ^ (i2 >>> 10)) + i3 + ((i4 >>> 3) ^ (((i4 << 14) | (i4 >>> 18)) ^ ((i4 >>> 7) | (i4 << 25)))) + iArr[i - 16];
        }
        int i5 = setlabelcolor.getHighSpeedVideoFpsRangesFor;
        int i6 = setlabelcolor.getOutputStallDurationlomOqCM;
        int i7 = setlabelcolor.Camera2StreamConfigurationMap;
        int i8 = setlabelcolor.getOutputMinFrameDuration;
        int i9 = setlabelcolor.getHighSpeedVideoFpsRanges;
        int i10 = setlabelcolor.getInputFormats;
        int i11 = setlabelcolor.getOutputFormats;
        int i12 = setlabelcolor.getHighSpeedVideoSizesFor;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int[] iArr2 = getHighSpeedVideoSizes;
            int i15 = iArr2[i14];
            int[] iArr3 = setlabelcolor.getInputSizeshNQ4ISI;
            int i16 = i12 + ((((i9 >>> 6) | (i9 << 26)) ^ ((i9 >>> 11) | (i9 << 21))) ^ ((i9 >>> 25) | (i9 << 7))) + (((~i9) & i11) ^ (i9 & i10)) + i15 + iArr3[i14];
            int i17 = i8 + i16;
            int i18 = i5 & i6;
            int i19 = i16 + ((((i5 >>> 2) | (i5 << 30)) ^ ((i5 >>> 13) | (i5 << 19))) ^ ((i5 >>> 22) | (i5 << 10))) + ((i18 ^ (i5 & i7)) ^ (i6 & i7));
            int i20 = i14 + 1;
            int i21 = i11 + ((((i17 >>> 6) | (i17 << 26)) ^ ((i17 >>> 11) | (i17 << 21))) ^ ((i17 >>> 25) | (i17 << 7))) + ((i17 & i9) ^ ((~i17) & i10)) + iArr2[i20] + iArr3[i20];
            int i22 = i7 + i21;
            int i23 = i19 & i5;
            int i24 = i21 + ((((i19 >>> 2) | (i19 << 30)) ^ ((i19 >>> 13) | (i19 << 19))) ^ ((i19 >>> 22) | (i19 << 10))) + ((i23 ^ (i19 & i6)) ^ i18);
            int i25 = i14 + 2;
            int i26 = i10 + ((((i22 >>> 6) | (i22 << 26)) ^ ((i22 >>> 11) | (i22 << 21))) ^ ((i22 >>> 25) | (i22 << 7))) + ((i22 & i17) ^ ((~i22) & i9)) + iArr2[i25] + iArr3[i25];
            int i27 = i6 + i26;
            int i28 = i24 & i19;
            int i29 = i26 + ((((i24 >>> 2) | (i24 << 30)) ^ ((i24 >>> 13) | (i24 << 19))) ^ ((i24 >>> 22) | (i24 << 10))) + (i23 ^ ((i24 & i5) ^ i28));
            int i30 = i14 + 3;
            int i31 = i9 + ((((i27 >>> 6) | (i27 << 26)) ^ ((i27 >>> 11) | (i27 << 21))) ^ ((i27 >>> 25) | (i27 << 7))) + (((~i27) & i17) ^ (i27 & i22)) + iArr2[i30] + iArr3[i30];
            int i32 = i5 + i31;
            int i33 = i29 & i24;
            int i34 = i31 + ((((i29 >>> 2) | (i29 << 30)) ^ ((i29 >>> 13) | (i29 << 19))) ^ ((i29 >>> 22) | (i29 << 10))) + (i28 ^ ((i29 & i19) ^ i33));
            int i35 = i14 + 4;
            int i36 = i17 + ((((i32 >>> 6) | (i32 << 26)) ^ ((i32 >>> 11) | (i32 << 21))) ^ ((i32 >>> 25) | (i32 << 7))) + ((i32 & i27) ^ ((~i32) & i22)) + iArr2[i35] + iArr3[i35];
            i12 = i19 + i36;
            int i37 = i34 & i29;
            i8 = i36 + ((((i34 >>> 2) | (i34 << 30)) ^ ((i34 >>> 13) | (i34 << 19))) ^ ((i34 >>> 22) | (i34 << 10))) + (i33 ^ ((i34 & i24) ^ i37));
            int i38 = i14 + 5;
            int i39 = i22 + ((((i12 >>> 6) | (i12 << 26)) ^ ((i12 >>> 11) | (i12 << 21))) ^ ((i12 >>> 25) | (i12 << 7))) + ((i12 & i32) ^ ((~i12) & i27)) + iArr2[i38] + iArr3[i38];
            i11 = i24 + i39;
            int i40 = i8 & i34;
            i7 = i39 + ((((i8 >>> 2) | (i8 << 30)) ^ ((i8 >>> 13) | (i8 << 19))) ^ ((i8 >>> 22) | (i8 << 10))) + (i37 ^ ((i8 & i29) ^ i40));
            int i41 = i14 + 6;
            int i42 = i27 + ((((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21))) ^ ((i11 >>> 25) | (i11 << 7))) + ((i11 & i12) ^ ((~i11) & i32)) + iArr2[i41] + iArr3[i41];
            i10 = i29 + i42;
            int i43 = i7 & i8;
            i6 = i42 + ((((i7 >>> 2) | (i7 << 30)) ^ ((i7 >>> 13) | (i7 << 19))) ^ ((i7 >>> 22) | (i7 << 10))) + (i40 ^ ((i7 & i34) ^ i43));
            int i44 = i14 + 7;
            int i45 = i32 + ((((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21))) ^ ((i10 >>> 25) | (i10 << 7))) + ((i10 & i11) ^ ((~i10) & i12)) + iArr2[i44] + iArr3[i44];
            i9 = i34 + i45;
            i5 = i45 + ((((i6 >>> 2) | (i6 << 30)) ^ ((i6 >>> 13) | (i6 << 19))) ^ ((i6 >>> 22) | (i6 << 10))) + (i43 ^ ((i6 & i7) ^ (i6 & i8)));
            i14 += 8;
            i13++;
            setlabelcolor = this;
        }
        setlabelcolor.getHighSpeedVideoFpsRangesFor += i5;
        setlabelcolor.getOutputStallDurationlomOqCM += i6;
        setlabelcolor.Camera2StreamConfigurationMap += i7;
        setlabelcolor.getOutputMinFrameDuration += i8;
        setlabelcolor.getHighSpeedVideoFpsRanges += i9;
        setlabelcolor.getInputFormats += i10;
        setlabelcolor.getOutputFormats += i11;
        setlabelcolor.getHighSpeedVideoSizesFor += i12;
        setlabelcolor.getHighResolutionOutputSizeshNQ4ISI = 0;
        for (int i46 = 0; i46 < 16; i46++) {
            setlabelcolor.getInputSizeshNQ4ISI[i46] = 0;
        }
    }
}
