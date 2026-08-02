package util.h.xy.eh;

/* loaded from: classes5.dex */
public abstract class ra implements util.h.xy.ef.e, util.h.xy.fb.c {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private long Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    /* renamed from: ʼ */
    protected abstract void mo26582();

    /* renamed from: ˊ */
    protected abstract void mo26583(byte[] bArr, int i);

    /* renamed from: ᐝ */
    protected abstract void mo26584(long j);

    @Override // util.h.xy.ef.e
    /* renamed from: ˋ */
    public int mo26541() {
        int i = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        getHighSpeedVideoFpsRanges = i;
        int i2 = (i & 97) + (i | 97);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return 64;
        }
        throw null;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public void mo26564() {
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            this.Camera2StreamConfigurationMap = 1L;
            this.getHighSpeedVideoSizes = 1;
            i = 1;
        } else {
            this.Camera2StreamConfigurationMap = 0L;
            this.getHighSpeedVideoSizes = 0;
            i = 0;
        }
        while (true) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= bArr.length) {
                return;
            }
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = i4 + 11;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 == 0) {
                bArr[i] = 0;
                i += 114;
            } else {
                bArr[i] = 0;
                int i6 = i - 51;
                i = ((i6 | 52) << 1) - (i6 ^ 52);
            }
            getHighSpeedVideoFpsRangesFor = (i4 + 67) % 128;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m26590() {
        long j;
        byte b;
        int i = getHighSpeedVideoFpsRangesFor + 13;
        getHighSpeedVideoFpsRanges = i % 128;
        long j2 = this.Camera2StreamConfigurationMap;
        if (i % 2 != 0) {
            j = j2 << 3;
            b = 98;
        } else {
            j = j2 << 3;
            b = Byte.MIN_VALUE;
        }
        mo26560(b);
        while (this.getHighSpeedVideoSizes != 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 15) % 128;
            mo26560((byte) 0);
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = ((i2 | 11) << 1) - (i2 ^ 11);
            getHighSpeedVideoFpsRanges = i3 % 128;
            int i4 = i3 % 2;
        }
        mo26584(j);
        mo26582();
        int i5 = getHighSpeedVideoFpsRanges;
        int i6 = (i5 & 77) + (i5 | 77);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo26562(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = (i5 & 17) + (i5 | 17);
        getHighSpeedVideoFpsRanges = i6 % 128;
        int i7 = 0;
        int max = java.lang.Math.max(0, i2);
        if (i6 % 2 != 0) {
            if (this.getHighSpeedVideoSizes != 0) {
                i3 = 1;
                while (true) {
                    if (i3 < max) {
                        i7 = i3;
                        break;
                    }
                    int i8 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = ((i8 ^ 65) + ((i8 & 65) << 1)) % 128;
                    byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i9 = this.getHighSpeedVideoSizes;
                    int i10 = i9 * (-622);
                    int i11 = (i10 & 624) + (i10 | 624);
                    int i12 = ~i9;
                    int i13 = (i12 ^ 1) | (i12 & 1);
                    int i14 = -(-((~((i13 ^ i) | (i13 & i))) * 623));
                    int i15 = (i11 ^ i14) + ((i11 & i14) << 1);
                    int i16 = ~i;
                    int i17 = ~(i9 | (-2));
                    int i18 = -(-(((i16 & i17) | (i16 ^ i17)) * (-623)));
                    int i19 = ((i15 | i18) << 1) - (i18 ^ i15);
                    int i20 = ~i13;
                    int i21 = ~((i12 ^ i) | (i12 & i));
                    int i22 = -(-(((i21 ^ i20) | (i21 & i20) | (~((i ^ 1) | (i & 1)))) * 623));
                    int i23 = ((i19 | i22) << 1) - (i22 ^ i19);
                    this.getHighSpeedVideoSizes = i23;
                    i4 = (i3 ^ (-116)) + ((i3 & (-116)) << 1) + 117;
                    int i24 = -(-i3);
                    bArr2[i9] = bArr[(i & i24) + (i24 | i)];
                    if (i23 == 4) {
                        int i25 = (i8 ^ 1) + ((i8 & 1) << 1);
                        getHighSpeedVideoFpsRanges = i25 % 128;
                        mo26583(bArr2, 0);
                        if (i25 % 2 != 0) {
                            this.getHighSpeedVideoSizes = 1;
                        } else {
                            this.getHighSpeedVideoSizes = 0;
                        }
                        i7 = i4;
                    } else {
                        i3 = i4;
                    }
                }
            } else {
                i7 = 1;
            }
        } else if (this.getHighSpeedVideoSizes != 0) {
            i3 = 0;
            while (true) {
                if (i3 < max) {
                }
                i3 = i4;
            }
        }
        int i26 = -i7;
        int i27 = (i26 * 714) + (max * (-712));
        int i28 = ~i26;
        int i29 = ~i;
        int i30 = ~((i28 & i29) | (i28 ^ i29));
        int i31 = ~(i28 | max);
        int i32 = (i31 ^ i30) | (i30 & i31);
        int i33 = ~max;
        int i34 = (i26 ^ i33) | (i26 & i33);
        int i35 = ~((i34 ^ i) | (i34 & i));
        int i36 = -(-(((i32 ^ i35) | (i32 & i35)) * (-713)));
        int i37 = ((((((i27 & i36) + (i27 | i36)) - (~(-(-((~(i34 | i)) * 1426))))) - 1) - (~(-(-((~((i33 ^ i29) | (i33 & i29))) * 713))))) - 1) & (-4);
        int i38 = i7;
        while (i38 < (i37 & i7) + (i37 | i7)) {
            int i39 = getHighSpeedVideoFpsRanges;
            int i40 = (i39 ^ 83) + ((i39 & 83) << 1);
            getHighSpeedVideoFpsRangesFor = i40 % 128;
            if (i40 % 2 == 0) {
                mo26583(bArr, i * i38);
                i38 += 28;
            } else {
                int i41 = -(-i38);
                mo26583(bArr, (i & i41) + (i41 | i));
                i38 += 4;
            }
        }
        while (i38 < max) {
            int i42 = getHighSpeedVideoFpsRangesFor + 51;
            getHighSpeedVideoFpsRanges = i42 % 128;
            if (i42 % 2 != 0) {
                byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i43 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i43 % 1;
                int i44 = (i38 & 95) + (i38 | 95);
                bArr3[i43] = bArr[i38 * i];
                i38 = ((i44 | (-14)) << 1) - (i44 ^ (-14));
            } else {
                byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i45 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i45 + 1;
                bArr4[i45] = bArr[i38 + i];
                i38++;
            }
        }
        this.Camera2StreamConfigurationMap += max;
        int i46 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i46 ^ 85) + ((i46 & 85) << 1)) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˋ */
    public void mo26560(byte b) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoSizes;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i2 = i * (-49);
        int i3 = ~i;
        int i4 = (i3 & (-2)) | (i3 ^ (-2));
        int i5 = ~((i4 ^ identityHashCode) | (i4 & identityHashCode));
        int i6 = ~identityHashCode;
        int i7 = (i6 & i3) | (i3 ^ i6);
        int i8 = ~((i7 & 1) | (i7 ^ 1));
        int i9 = (((((i2 | 51) << 1) - (i2 ^ 51)) - (~(((identityHashCode & 1) | (identityHashCode ^ 1)) * (-50)))) - 1) + (((i5 & i8) | (i5 ^ i8)) * 50);
        int i10 = -(-(((~((i6 & 1) | (i6 ^ 1))) | (~(i3 | 1)) | (~i7)) * 50));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        this.getHighSpeedVideoSizes = i11;
        bArr[i] = b;
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i11 == bArr2.length) {
            int i12 = getHighSpeedVideoFpsRanges + 73;
            getHighSpeedVideoFpsRangesFor = i12 % 128;
            mo26583(bArr2, 0);
            if (i12 % 2 == 0) {
                this.getHighSpeedVideoSizes = 1;
            } else {
                this.getHighSpeedVideoSizes = 0;
            }
            int i13 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i13 | 7) << 1) - (i13 ^ 7)) % 128;
        }
        this.Camera2StreamConfigurationMap++;
        int i14 = getHighSpeedVideoFpsRangesFor + 97;
        getHighSpeedVideoFpsRanges = i14 % 128;
        if (i14 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected void m26591(util.h.xy.eh.ra raVar) {
        int i = getHighSpeedVideoFpsRangesFor + 109;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] bArr = raVar.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr.length);
        } else {
            byte[] bArr2 = raVar.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr2, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr2.length);
        }
        this.getHighSpeedVideoSizes = raVar.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = raVar.Camera2StreamConfigurationMap;
        int i2 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    protected ra(util.h.xy.eh.ra raVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[4];
        m26591(raVar);
    }

    protected ra() {
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[4];
        this.getHighSpeedVideoSizes = 0;
    }
}
