package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class rb extends util.h.xy.eh.a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int[] getHighResolutionOutputSizeshNQ4ISI = {-535932088, 1515383787, -1908450695, -907319632, -23925954, 1764054826, -1149702223, -2072858375, -399229905, 1398278040, -853113809, -1534908860, -1008430014, 326376347, 1944730128, -2099131793, -1307318250, -958221261};
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getInputSizeshNQ4ISI = 1;

    private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int length2;
        int[] iArr3;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        int length3 = iArr.length;
        char[] cArr2 = new char[8];
        int[] iArr4 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr4 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 99;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i4 = 0;
            while (i4 < length2) {
                int i5 = getHighSpeedVideoFpsRangesFor + 75;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 != 0) {
                    iArr3[i4] = (int) (iArr4[i4] ^ (-5569649899877129369L));
                } else {
                    iArr3[i4] = (int) (iArr4[i4] ^ (-5569649899877129369L));
                    i4++;
                }
            }
            iArr4 = iArr3;
        }
        int length4 = iArr4.length;
        int[] iArr5 = new int[length4];
        int[] iArr6 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr6 != null) {
            int i6 = getHighSpeedVideoFpsRangesFor + 115;
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length4);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i7 = 0; i7 < 16; i7++) {
                cVar.f2627 ^= iArr5[i7];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i8 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i8;
            }
            int i9 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i9;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i10 = cVar.f2627;
            int i11 = cVar.f2625;
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
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ᐝ */
    public final void mo26585(util.h.xy.fb.c cVar) {
        int i = Camera2StreamConfigurationMap + 107;
        getInputSizeshNQ4ISI = i % 128;
        m26578((util.h.xy.eh.rb) cVar);
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ʻ */
    public final util.h.xy.fb.c mo26581() {
        util.h.xy.eh.rb rbVar = new util.h.xy.eh.rb(this);
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 105) % 128;
        return rbVar;
    }

    @Override // util.h.xy.eh.a, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final void mo26564() {
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 59) % 128;
        super.mo26564();
        this.f2160 = 7640891576956012808L;
        this.f2158 = -4942790177534073029L;
        this.f2157 = 4354685564936845355L;
        this.f2161 = -6534734903238641935L;
        this.f2159 = 5840696475078001361L;
        this.f2155 = -7276294671716946913L;
        this.f2162 = 2270897969802886507L;
        this.f2156 = 6620516959819538809L;
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 117) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 33) % 128;
        m26576();
        util.h.xy.fb.rb.m26848(this.f2160, bArr, i);
        util.h.xy.fb.rb.m26848(this.f2158, bArr, i + 8);
        util.h.xy.fb.rb.m26848(this.f2157, bArr, i + 16);
        util.h.xy.fb.rb.m26848(this.f2161, bArr, i + 24);
        util.h.xy.fb.rb.m26848(this.f2159, bArr, i + 32);
        util.h.xy.fb.rb.m26848(this.f2155, bArr, i + 40);
        util.h.xy.fb.rb.m26848(this.f2162, bArr, i + 48);
        util.h.xy.fb.rb.m26848(this.f2156, bArr, i + 56);
        mo26564();
        int i2 = Camera2StreamConfigurationMap + 83;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return 64;
        }
        throw null;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        int i = (getInputSizeshNQ4ISI + 21) % 128;
        Camera2StreamConfigurationMap = i;
        int i2 = i + 81;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return 64;
        }
        throw null;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.Object obj;
        int i = Camera2StreamConfigurationMap + 79;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-344667372, 1990765646, 17550164, -809508193}, android.view.ViewConfiguration.getDoubleTapTimeout() + 2, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-344667372, 1990765646, 17550164, -809508193}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, objArr2);
            obj = objArr2[0];
        }
        java.lang.String intern = ((java.lang.String) obj).intern();
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 29) % 128;
        return intern;
    }

    public rb(util.h.xy.eh.rb rbVar) {
        super(rbVar);
    }

    public rb() {
    }
}
