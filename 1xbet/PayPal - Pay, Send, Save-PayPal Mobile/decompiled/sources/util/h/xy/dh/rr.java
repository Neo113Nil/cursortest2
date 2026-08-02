package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rr extends util.h.xy.dh.rh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final util.h.xy.dh.rh[] getHighSpeedVideoSizesFor;
    private final int getOutputFormats;

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 109) << 1) - (i ^ 109);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            throw null;
        }
        if (!getHighResolutionOutputSizeshNQ4ISI()) {
            util.h.xy.dh.mz.getHighSpeedVideoSizes(rjVar, z, this.getHighSpeedVideoFpsRanges, 0, this.getHighSpeedVideoFpsRanges.length);
            return;
        }
        rjVar.getHighSpeedVideoSizes(z, 36);
        int i3 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i3 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(128);
        if (i3 % 2 != 0) {
            throw null;
        }
        util.h.xy.dh.rh[] rhVarArr = this.getHighSpeedVideoSizesFor;
        if (rhVarArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 35) % 128;
            rjVar.getHighSpeedVideoFpsRanges((util.h.xy.dh.mi[]) rhVarArr);
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i4 ^ 65) + ((i4 & 65) << 1)) % 128;
        } else {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
            int i5 = 0;
            while (i5 < this.getHighSpeedVideoFpsRanges.length) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
                int length = this.getHighSpeedVideoFpsRanges.length;
                int i6 = -i5;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i7 = i6 * 592;
                int i8 = -(-(length * (-590)));
                int i9 = ~i6;
                int i10 = (i7 ^ i8) + ((i7 & i8) << 1) + ((~(i9 | length)) * (-1182));
                int i11 = ~length;
                int i12 = i9 | i11;
                int i13 = ~identityHashCode;
                int i14 = ~((i12 ^ i13) | (i12 & i13));
                int i15 = ~(length | i6);
                int i16 = ((i15 ^ i14) | (i15 & i14)) * (-591);
                int i17 = ((i10 | i16) << 1) - (i16 ^ i10);
                int i18 = -(-(((identityHashCode ^ i9) | (identityHashCode & i9) | i11) * 591));
                int min = java.lang.Math.min((i17 & i18) + (i18 | i17), this.getOutputFormats);
                util.h.xy.dh.mz.getHighSpeedVideoSizes(rjVar, true, this.getHighSpeedVideoFpsRanges, i5, min);
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i19 = min * 829;
                int i20 = -(-(i5 * 829));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                int i22 = ~min;
                int i23 = ~i5;
                int i24 = ~((i22 ^ i23) | (i22 & i23));
                int i25 = ~identityHashCode2;
                int i26 = (i25 & min) | (i25 ^ min);
                int i27 = ~((i26 ^ i5) | (i26 & i5));
                int i28 = -(-(((i24 ^ i27) | (i24 & i27)) * (-828)));
                int i29 = ((i21 | i28) << 1) - (i28 ^ i21);
                int i30 = (i25 | (min ^ i5) | (min & i5)) * (-828);
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                int i32 = (~(i5 | min)) * 828;
                i5 = (i32 & i31) + (i32 | i31);
                int i33 = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = ((i33 ^ 101) + ((i33 & 101) << 1)) % 128;
            }
        }
        int i34 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i34 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(0);
        if (i34 % 2 != 0) {
            throw null;
        }
        int i35 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i35 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(0);
        if (i35 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i2 ^ 105) + ((i2 & 105) << 1)) % 128;
        if (!getHighResolutionOutputSizeshNQ4ISI()) {
            return util.h.xy.dh.mz.Camera2StreamConfigurationMap(z, this.getHighSpeedVideoFpsRanges.length);
        }
        if (z) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = (((i3 | 11) << 1) - (i3 ^ 11)) % 128;
            getHighSpeedVideoSizes = (i3 + 107) % 128;
            i = 4;
        } else {
            i = 3;
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            int length = this.getHighSpeedVideoFpsRanges.length;
            int i4 = this.getOutputFormats;
            int i5 = length / i4;
            int Camera2StreamConfigurationMap = i + (util.h.xy.dh.mz.Camera2StreamConfigurationMap(true, i4) * i5);
            int length2 = (this.getHighSpeedVideoFpsRanges.length - (~(-(i5 * this.getOutputFormats)))) - 1;
            if (length2 <= 0) {
                return Camera2StreamConfigurationMap;
            }
            int i6 = -(-util.h.xy.dh.mz.Camera2StreamConfigurationMap(true, length2));
            return (Camera2StreamConfigurationMap & i6) + (Camera2StreamConfigurationMap | i6);
        }
        int i7 = getHighResolutionOutputSizeshNQ4ISI + 87;
        getHighSpeedVideoSizes = i7 % 128;
        int i8 = i7 % 2 == 0 ? 1 : 0;
        while (true) {
            util.h.xy.dh.rh[] rhVarArr = this.getHighSpeedVideoSizesFor;
            if (i8 >= rhVarArr.length) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 75) % 128;
                return i;
            }
            int i9 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i9 ^ 47) + ((i9 & 47) << 1)) % 128;
            int highSpeedVideoFpsRanges = rhVarArr[i8].getHighSpeedVideoFpsRanges(true);
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i10 = highSpeedVideoFpsRanges * 70;
            int i11 = -(-(i * (-68)));
            int i12 = ~highSpeedVideoFpsRanges;
            int i13 = ~i;
            int i14 = (i12 ^ i13) | (i12 & i13);
            int i15 = (highSpeedVideoFpsRanges ^ i) | (highSpeedVideoFpsRanges & i);
            int i16 = ((((i10 | i11) << 1) - (i10 ^ i11)) - (~(-(-(((~((i14 & identityHashCode) | (i14 ^ identityHashCode))) | (~((i15 & identityHashCode) | (i15 ^ identityHashCode)))) * 69))))) - 1;
            int i17 = ~(i12 | i);
            int i18 = ~((i12 & identityHashCode) | (i12 ^ identityHashCode));
            int i19 = (i17 ^ i18) | (i18 & i17);
            int i20 = ~((i ^ identityHashCode) | (i & identityHashCode));
            int i21 = ((i20 ^ i19) | (i20 & i19)) * (-69);
            int i22 = ((i16 | i21) << 1) - (i21 ^ i16);
            int i23 = -(-((~((i13 ^ highSpeedVideoFpsRanges) | (highSpeedVideoFpsRanges & i13))) * 69));
            i = ((i22 | i23) << 1) - (i23 ^ i22);
            int i24 = (i8 << 1) - i8;
            i8 = ((i24 | 1) << 1) - (i24 ^ 1);
            int i25 = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = ((i25 ^ 97) + ((i25 & 97) << 1)) % 128;
        }
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 113) + (i | 113);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = true;
        if (this.getHighSpeedVideoSizesFor == null) {
            getHighSpeedVideoSizes = (i + 73) % 128;
            if (this.getHighSpeedVideoFpsRanges.length <= this.getOutputFormats) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = ((i3 ^ 119) + ((i3 & 119) << 1)) % 128;
                z = false;
            }
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    private rr(byte[] bArr, util.h.xy.dh.rh[] rhVarArr, int i) {
        super(bArr);
        this.getHighSpeedVideoSizesFor = rhVarArr;
        this.getOutputFormats = i;
    }

    public rr(util.h.xy.dh.rh[] rhVarArr, int i) {
        this(getHighSpeedVideoFpsRangesFor(rhVarArr), rhVarArr, i);
    }

    public rr(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    public rr(util.h.xy.dh.rh[] rhVarArr) {
        this(rhVarArr, 1000);
    }

    public rr(byte[] bArr) {
        this(bArr, 1000);
    }

    static byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.dh.rh[] rhVarArr) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = ~((i ^ (-254568532)) | (i & (-254568532)));
        int i3 = ~(currentTimeMillis | (-254568532));
        int i4 = ~((int) java.lang.System.currentTimeMillis());
        int i5 = ~((i4 & 732894505) | (i4 ^ 732894505));
        int i6 = -(-(((i5 ^ 272654982) | (i5 & 272654982)) * (-160)));
        int i7 = ~((i4 ^ 820798119) | (i4 & 820798119));
        if ((24853423 - (~(((i2 ^ 252446800) | (i2 & 252446800)) * 529))) + (((i3 ^ (-3400356)) | (i3 & (-3400356))) * 529) > (i6 & (-711783263)) + ((-711783263) | i6) + (((i7 & 732894505) | (i7 ^ 732894505)) * 160)) {
            int length = rhVarArr.length;
            throw new java.lang.ArithmeticException();
        }
        int length2 = rhVarArr.length;
        if (length2 == 0) {
            byte[] bArr = Camera2StreamConfigurationMap;
            int i8 = getHighSpeedVideoSizes + 117;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        if (length2 == 1) {
            byte[] bArr2 = rhVarArr[0].getHighSpeedVideoFpsRanges;
            int i9 = getHighSpeedVideoSizes;
            int i10 = (i9 & 109) + (i9 | 109);
            getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
            if (i10 % 2 == 0) {
                return bArr2;
            }
            throw null;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < length2) {
            int i13 = getHighResolutionOutputSizeshNQ4ISI + 79;
            getHighSpeedVideoSizes = i13 % 128;
            if (i13 % 2 == 0) {
                i12 >>>= rhVarArr[i11].getHighSpeedVideoFpsRanges.length;
                i11 = ((i11 | 62) << 1) - (i11 ^ 62);
            } else {
                i12 = (i12 - (~rhVarArr[i11].getHighSpeedVideoFpsRanges.length)) - 1;
                i11 = (i11 ^ 1) + ((i11 & 1) << 1);
            }
        }
        byte[] bArr3 = new byte[i12];
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15 = (i15 & 1) + (i15 | 1)) {
            int i16 = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (((i16 | 107) << 1) - (i16 ^ 107)) % 128;
            byte[] bArr4 = rhVarArr[i15].getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
            int length3 = bArr4.length;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i17 = length3 * 595;
            int i18 = i14 * (-1187);
            int i19 = (i17 & i18) + (i17 | i18);
            int i20 = ~((~length3) | i14);
            int i21 = ~currentTimeMillis2;
            int i22 = ~(i21 | i14);
            int i23 = ((i22 ^ i20) | (i20 & i22)) * (-1188);
            int i24 = ~i14;
            int i25 = ~(currentTimeMillis2 | i24);
            int i26 = (i25 ^ i20) | (i20 & i25);
            int i27 = ~((i21 ^ length3) | (i21 & length3));
            int i28 = (i19 ^ i23) + ((i19 & i23) << 1) + (((i26 ^ i27) | (i26 & i27)) * 594);
            int i29 = ~((i24 & i21) | (i21 ^ i24));
            int i30 = ~(i24 | length3);
            int i31 = (i30 ^ i29) | (i29 & i30);
            int i32 = ((i31 ^ i27) | (i31 & i27)) * 594;
            i14 = (i32 ^ i28) + ((i32 & i28) << 1);
        }
        int i33 = getHighSpeedVideoSizes;
        int i34 = ((i33 | 61) << 1) - (i33 ^ 61);
        getHighResolutionOutputSizeshNQ4ISI = i34 % 128;
        if (i34 % 2 == 0) {
            return bArr3;
        }
        throw new java.lang.ArithmeticException();
    }
}
