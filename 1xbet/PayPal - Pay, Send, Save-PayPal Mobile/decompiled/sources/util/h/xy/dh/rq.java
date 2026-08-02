package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rq extends util.h.xy.dh.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizesFor;
    private static int[] getOutputMinFrameDuration = {1720930425, 7811304, -737139233, 1835005516, 1252202524, -297752843, -926089210, 485090476, -1406062513, 660294684, 355488851, -1445813320, 366728543, 931024816, 609992808, 920301427, -168412712, 1980935105};
    private final util.h.xy.dh.ma[] getInputSizeshNQ4ISI;
    private final int getOutputFormats;

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        if (!getHighResolutionOutputSizeshNQ4ISI()) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 27;
            getHighSpeedVideoSizesFor = i % 128;
            util.h.xy.dh.ai.getHighSpeedVideoFpsRanges(rjVar, z, this.getHighSpeedVideoSizes, i % 2 != 0 ? this.getHighSpeedVideoSizes.length : this.getHighSpeedVideoSizes.length);
            return;
        }
        rjVar.getHighSpeedVideoSizes(z, 35);
        int i2 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i2 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(128);
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.dh.ma[] maVarArr = this.getInputSizeshNQ4ISI;
        if (maVarArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 87) % 128;
            rjVar.getHighSpeedVideoFpsRanges((util.h.xy.dh.mi[]) maVarArr);
        } else if (this.getHighSpeedVideoSizes.length >= 2) {
            byte b = this.getHighSpeedVideoSizes[0];
            int length = this.getHighSpeedVideoSizes.length;
            int i3 = length - 1;
            int i4 = this.getOutputFormats - 1;
            while (i3 > i4) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 23) % 128;
                util.h.xy.dh.ai.getHighResolutionOutputSizeshNQ4ISI(rjVar, (byte) 0, this.getHighSpeedVideoSizes, length - i3, i4);
                i3 -= i4;
            }
            util.h.xy.dh.ai.getHighResolutionOutputSizeshNQ4ISI(rjVar, b, this.getHighSpeedVideoSizes, length - i3, i3);
        }
        int i5 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i5 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(0);
        if (i5 % 2 != 0) {
            throw null;
        }
        int i6 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i6 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(0);
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 41) % 128;
        if (!getHighResolutionOutputSizeshNQ4ISI()) {
            return util.h.xy.dh.ai.getHighResolutionOutputSizeshNQ4ISI(z, this.getHighSpeedVideoSizes.length);
        }
        int i = z ? 4 : 3;
        if (this.getInputSizeshNQ4ISI != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 87) % 128;
            int i2 = 0;
            while (true) {
                util.h.xy.dh.ma[] maVarArr = this.getInputSizeshNQ4ISI;
                if (i2 >= maVarArr.length) {
                    break;
                }
                i += maVarArr[i2].getHighSpeedVideoFpsRanges(true);
                i2++;
            }
        } else if (this.getHighSpeedVideoSizes.length >= 2) {
            int length = this.getHighSpeedVideoSizes.length;
            int i3 = this.getOutputFormats;
            int i4 = (length - 2) / (i3 - 1);
            i = i + (util.h.xy.dh.ai.getHighResolutionOutputSizeshNQ4ISI(true, i3) * i4) + util.h.xy.dh.ai.getHighResolutionOutputSizeshNQ4ISI(true, this.getHighSpeedVideoSizes.length - (i4 * (this.getOutputFormats - 1)));
        }
        int i5 = getHighSpeedVideoSizesFor + 91;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        boolean z;
        if (this.getInputSizeshNQ4ISI != null || this.getHighSpeedVideoSizes.length > this.getOutputFormats) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 59) % 128;
            z = true;
        } else {
            z = false;
        }
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        return z;
    }

    public rq(util.h.xy.dh.ma[] maVarArr, int i) {
        super(getHighSpeedVideoSizes(maVarArr), false);
        this.getInputSizeshNQ4ISI = maVarArr;
        this.getOutputFormats = i;
    }

    public rq(util.h.xy.dh.ma[] maVarArr) {
        this(maVarArr, 1000);
    }

    public rq(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.getInputSizeshNQ4ISI = null;
        this.getOutputFormats = i2;
    }

    public rq(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    static byte[] getHighSpeedVideoSizes(util.h.xy.dh.ma[] maVarArr) {
        int[] iArr;
        int length = maVarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return maVarArr[0].getHighSpeedVideoSizes;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = maVarArr[i3].getHighSpeedVideoSizes;
            if (bArr[0] != 0) {
                int[] iArr2 = {1528028682, -1534911854, 1607794461, 1844620166, -1825306967, 466750858, -812055478, 1667092414, 26692626, -690274392, 654166230, 1605617716, -1890591783, 698549370, -476733718, 1939737477, -1308161573, 1622101292, 1330699046, 62295005, 1563612993, 1769099875, -402801298, -2067255015};
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    int i4 = (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 46;
                    util.h.xz.b.c cVar = new util.h.xz.b.c();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[48];
                    int[] iArr3 = getOutputMinFrameDuration;
                    if (iArr3 != null) {
                        int length2 = iArr3.length;
                        int[] iArr4 = new int[length2];
                        int i5 = 0;
                        while (i5 < length2) {
                            int i6 = getHighSpeedVideoFpsRangesFor;
                            Camera2StreamConfigurationMap = (i6 + 3) % 128;
                            iArr4[i5] = (int) (iArr3[i5] ^ (-5569649899877129369L));
                            i5++;
                            Camera2StreamConfigurationMap = (i6 + 25) % 128;
                            iArr2 = iArr2;
                        }
                        iArr = iArr2;
                        iArr3 = iArr4;
                    } else {
                        iArr = iArr2;
                    }
                    int length3 = iArr3.length;
                    int[] iArr5 = new int[length3];
                    int[] iArr6 = getOutputMinFrameDuration;
                    if (iArr6 != null) {
                        int length4 = iArr6.length;
                        int[] iArr7 = new int[length4];
                        for (int i7 = 0; i7 < length4; i7++) {
                            iArr7[i7] = (int) (iArr6[i7] ^ (-5569649899877129369L));
                        }
                        iArr6 = iArr7;
                    }
                    java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
                    cVar.f2626 = 0;
                    while (cVar.f2626 < 24) {
                        cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                        cArr[1] = (char) iArr[cVar.f2626];
                        cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                        cArr[3] = (char) iArr[cVar.f2626 + 1];
                        cVar.f2627 = (cArr[0] << 16) + cArr[1];
                        cVar.f2625 = (cArr[2] << 16) + cArr[3];
                        util.h.xz.b.c.m27723(iArr5);
                        for (int i8 = 0; i8 < 16; i8++) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                            cVar.f2627 ^= iArr5[i8];
                            cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                            int i9 = cVar.f2627;
                            cVar.f2627 = cVar.f2625;
                            cVar.f2625 = i9;
                        }
                        int i10 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i10;
                        cVar.f2625 ^= iArr5[16];
                        cVar.f2627 ^= iArr5[17];
                        int i11 = cVar.f2627;
                        int i12 = cVar.f2625;
                        cArr[0] = (char) (cVar.f2627 >>> 16);
                        cArr[1] = (char) cVar.f2627;
                        cArr[2] = (char) (cVar.f2625 >>> 16);
                        cArr[3] = (char) cVar.f2625;
                        util.h.xz.b.c.m27723(iArr5);
                        cArr2[cVar.f2626 * 2] = cArr[0];
                        cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
                        cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
                        cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
                        cVar.f2626 += 2;
                    }
                    objArr[0] = new java.lang.String(cArr2, 0, i4);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = maVarArr[i].getHighSpeedVideoSizes;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i13 = 1;
        for (util.h.xy.dh.ma maVar : maVarArr) {
            byte[] bArr4 = maVar.getHighSpeedVideoSizes;
            int length5 = bArr4.length - 1;
            java.lang.System.arraycopy(bArr4, 1, bArr3, i13, length5);
            i13 += length5;
        }
        return bArr3;
    }
}
