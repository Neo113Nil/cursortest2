package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class b extends util.h.xy.eh.ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = -8598549183470056951L;
    private int getHighSpeedVideoSizesFor;
    private int[] getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputStallDurationlomOqCM;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 23;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 31) % 128;
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 71) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void mo26585(util.h.xy.fb.c cVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 61;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.eh.b bVar = (util.h.xy.eh.b) cVar;
        super.m26591(bVar);
        Camera2StreamConfigurationMap(bVar);
        if (i % 2 == 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 51) % 128;
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ʻ, reason: contains not printable characters */
    public final util.h.xy.fb.c mo26581() {
        util.h.xy.eh.b bVar = new util.h.xy.eh.b(this);
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void mo26582() {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.getInputFormats;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 << 1) | (i2 >>> 31);
        }
        int i3 = this.getOutputMinFrameDuration;
        int i4 = this.getOutputMinFrameDurationlomOqCM;
        int i5 = this.getInputSizeshNQ4ISI;
        int i6 = this.getOutputFormats;
        int i7 = this.getOutputStallDurationlomOqCM;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int Camera2StreamConfigurationMap2 = i7 + ((i3 << 5) | (i3 >>> 27)) + Camera2StreamConfigurationMap(i4, i5, i6) + this.getInputFormats[i9] + 1518500249;
            int i10 = (i4 << 30) | (i4 >>> 2);
            int Camera2StreamConfigurationMap3 = i6 + ((Camera2StreamConfigurationMap2 << 5) | (Camera2StreamConfigurationMap2 >>> 27)) + Camera2StreamConfigurationMap(i3, i10, i5) + this.getInputFormats[i9 + 1] + 1518500249;
            int i11 = (i3 << 30) | (i3 >>> 2);
            int Camera2StreamConfigurationMap4 = i5 + ((Camera2StreamConfigurationMap3 << 5) | (Camera2StreamConfigurationMap3 >>> 27)) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, i11, i10) + this.getInputFormats[i9 + 2] + 1518500249;
            i7 = (Camera2StreamConfigurationMap2 << 30) | (Camera2StreamConfigurationMap2 >>> 2);
            i4 = i10 + ((Camera2StreamConfigurationMap4 << 5) | (Camera2StreamConfigurationMap4 >>> 27)) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3, i7, i11) + this.getInputFormats[i9 + 3] + 1518500249;
            i6 = (Camera2StreamConfigurationMap3 << 30) | (Camera2StreamConfigurationMap3 >>> 2);
            i3 = i11 + ((i4 << 5) | (i4 >>> 27)) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4, i6, i7) + this.getInputFormats[i9 + 4] + 1518500249;
            i5 = (Camera2StreamConfigurationMap4 << 30) | (Camera2StreamConfigurationMap4 >>> 2);
            i8++;
            i9 += 5;
        }
        int i12 = 0;
        while (i12 < 4) {
            int highSpeedVideoFpsRangesFor = i7 + ((i3 << 5) | (i3 >>> 27)) + getHighSpeedVideoFpsRangesFor(i4, i5, i6) + this.getInputFormats[i9] + 1859775393;
            int i13 = (i4 << 30) | (i4 >>> 2);
            int highSpeedVideoFpsRangesFor2 = i6 + ((highSpeedVideoFpsRangesFor << 5) | (highSpeedVideoFpsRangesFor >>> 27)) + getHighSpeedVideoFpsRangesFor(i3, i13, i5) + this.getInputFormats[i9 + 1] + 1859775393;
            int i14 = (i3 << 30) | (i3 >>> 2);
            int highSpeedVideoFpsRangesFor3 = i5 + ((highSpeedVideoFpsRangesFor2 << 5) | (highSpeedVideoFpsRangesFor2 >>> 27)) + getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, i14, i13) + this.getInputFormats[i9 + 2] + 1859775393;
            i7 = (highSpeedVideoFpsRangesFor << 30) | (highSpeedVideoFpsRangesFor >>> 2);
            i4 = i13 + ((highSpeedVideoFpsRangesFor3 << 5) | (highSpeedVideoFpsRangesFor3 >>> 27)) + getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, i7, i14) + this.getInputFormats[i9 + 3] + 1859775393;
            i6 = (highSpeedVideoFpsRangesFor2 << 30) | (highSpeedVideoFpsRangesFor2 >>> 2);
            i3 = i14 + ((i4 << 5) | (i4 >>> 27)) + getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, i6, i7) + this.getInputFormats[i9 + 4] + 1859775393;
            i5 = (highSpeedVideoFpsRangesFor3 << 30) | (highSpeedVideoFpsRangesFor3 >>> 2);
            i12++;
            i9 += 5;
        }
        int i15 = 40;
        int i16 = 0;
        while (i16 < 4) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 1) % 128;
            int highSpeedVideoSizes = i7 + (((((i3 << 5) | (i3 >>> 27)) + getHighSpeedVideoSizes(i4, i5, i6)) + this.getInputFormats[i15]) - 1894007588);
            int i17 = (i4 << 30) | (i4 >>> 2);
            int highSpeedVideoSizes2 = i6 + (((((highSpeedVideoSizes << 5) | (highSpeedVideoSizes >>> 27)) + getHighSpeedVideoSizes(i3, i17, i5)) + this.getInputFormats[i15 + 1]) - 1894007588);
            int i18 = (i3 << 30) | (i3 >>> 2);
            int highSpeedVideoSizes3 = i5 + (((((highSpeedVideoSizes2 << 5) | (highSpeedVideoSizes2 >>> 27)) + getHighSpeedVideoSizes(highSpeedVideoSizes, i18, i17)) + this.getInputFormats[i15 + 2]) - 1894007588);
            i7 = (highSpeedVideoSizes << 30) | (highSpeedVideoSizes >>> 2);
            i4 = i17 + (((((highSpeedVideoSizes3 << 5) | (highSpeedVideoSizes3 >>> 27)) + getHighSpeedVideoSizes(highSpeedVideoSizes2, i7, i18)) + this.getInputFormats[i15 + 3]) - 1894007588);
            i6 = (highSpeedVideoSizes2 << 30) | (highSpeedVideoSizes2 >>> 2);
            i3 = i18 + (((((i4 << 5) | (i4 >>> 27)) + getHighSpeedVideoSizes(highSpeedVideoSizes3, i6, i7)) + this.getInputFormats[i15 + 4]) - 1894007588);
            i5 = (highSpeedVideoSizes3 << 30) | (highSpeedVideoSizes3 >>> 2);
            i16++;
            i15 += 5;
        }
        int i19 = 0;
        while (i19 <= 3) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
            int highSpeedVideoFpsRangesFor4 = i7 + (((((i3 << 5) | (i3 >>> 27)) + getHighSpeedVideoFpsRangesFor(i4, i5, i6)) + this.getInputFormats[i15]) - 899497514);
            int i20 = (i4 << 30) | (i4 >>> 2);
            int highSpeedVideoFpsRangesFor5 = i6 + (((((highSpeedVideoFpsRangesFor4 << 5) | (highSpeedVideoFpsRangesFor4 >>> 27)) + getHighSpeedVideoFpsRangesFor(i3, i20, i5)) + this.getInputFormats[i15 + 1]) - 899497514);
            int i21 = (i3 << 30) | (i3 >>> 2);
            int highSpeedVideoFpsRangesFor6 = i5 + (((((highSpeedVideoFpsRangesFor5 << 5) | (highSpeedVideoFpsRangesFor5 >>> 27)) + getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor4, i21, i20)) + this.getInputFormats[i15 + 2]) - 899497514);
            i7 = (highSpeedVideoFpsRangesFor4 << 30) | (highSpeedVideoFpsRangesFor4 >>> 2);
            i4 = i20 + (((((highSpeedVideoFpsRangesFor6 << 5) | (highSpeedVideoFpsRangesFor6 >>> 27)) + getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor5, i7, i21)) + this.getInputFormats[i15 + 3]) - 899497514);
            i6 = (highSpeedVideoFpsRangesFor5 << 30) | (highSpeedVideoFpsRangesFor5 >>> 2);
            int i22 = i15 + 5;
            i3 = i21 + (((((i4 << 5) | (i4 >>> 27)) + getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor6, i6, i7)) + this.getInputFormats[i15 + 4]) - 899497514);
            i5 = (highSpeedVideoFpsRangesFor6 << 30) | (highSpeedVideoFpsRangesFor6 >>> 2);
            i19++;
            int i23 = Camera2StreamConfigurationMap + 39;
            getHighResolutionOutputSizeshNQ4ISI = i23 % 128;
            int i24 = i23 % 2;
            i15 = i22;
        }
        this.getOutputMinFrameDuration += i3;
        this.getOutputMinFrameDurationlomOqCM += i4;
        this.getInputSizeshNQ4ISI += i5;
        this.getOutputFormats += i6;
        this.getOutputStallDurationlomOqCM += i7;
        this.getHighSpeedVideoSizesFor = 0;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        for (int i25 = 0; i25 < 16; i25++) {
            this.getInputFormats[i25] = 0;
        }
    }

    private static int getHighSpeedVideoSizes(int i, int i2, int i3) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 93;
        int i5 = i4 % 128;
        Camera2StreamConfigurationMap = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i6 = i5 + 79;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            return (i & (i2 | i3)) | (i2 & i3);
        }
        throw null;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int i4 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 49) % 128;
        int i5 = i4 + 45;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            return (i ^ i2) ^ i3;
        }
        throw null;
    }

    private static int Camera2StreamConfigurationMap(int i, int i2, int i3) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i4 + 1) % 128;
        int i5 = i4 + 55;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return (i & i2) | (i3 & (~i));
    }

    @Override // util.h.xy.eh.ra, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final void mo26564() {
        super.mo26564();
        this.getOutputMinFrameDuration = 1732584193;
        this.getOutputMinFrameDurationlomOqCM = -271733879;
        this.getInputSizeshNQ4ISI = -1732584194;
        this.getOutputFormats = 271733878;
        this.getOutputStallDurationlomOqCM = -1009589776;
        this.getHighSpeedVideoSizesFor = 0;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 21) % 128;
        int i = 0;
        while (true) {
            int[] iArr = this.getInputFormats;
            if (i == iArr.length) {
                return;
            }
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            iArr[i] = 0;
            i++;
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        m26590();
        util.h.xy.fb.rb.m26847(this.getOutputMinFrameDuration, bArr, i);
        util.h.xy.fb.rb.m26847(this.getOutputMinFrameDurationlomOqCM, bArr, i + 4);
        util.h.xy.fb.rb.m26847(this.getInputSizeshNQ4ISI, bArr, i + 8);
        util.h.xy.fb.rb.m26847(this.getOutputFormats, bArr, i + 12);
        util.h.xy.fb.rb.m26847(this.getOutputStallDurationlomOqCM, bArr, i + 16);
        mo26564();
        int i2 = Camera2StreamConfigurationMap + 119;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 20;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void mo26584(long j) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 107;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0 ? this.getHighSpeedVideoSizesFor > 14 : this.getHighSpeedVideoSizesFor > 108) {
            mo26582();
        }
        int[] iArr = this.getInputFormats;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 99) % 128;
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void mo26583(byte[] bArr, int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i2 + 97) % 128;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.getInputFormats;
        int i3 = this.getHighSpeedVideoSizesFor;
        iArr[i3] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i4 = i3 + 1;
        this.getHighSpeedVideoSizesFor = i4;
        if (i4 == 16) {
            int i5 = i2 + 83;
            Camera2StreamConfigurationMap = i5 % 128;
            mo26582();
            if (i5 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        int i = (Camera2StreamConfigurationMap + 33) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        Camera2StreamConfigurationMap = (i + 33) % 128;
        return 20;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.Object obj;
        int i = getHighResolutionOutputSizeshNQ4ISI + 5;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("療䕭肽쾚\u0b7f", 48311 % android.view.View.resolveSize(1, 1), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("療䕭肽쾚\u0b7f", android.view.View.resolveSize(0, 0) + 48311, objArr2);
            obj = objArr2[0];
        }
        java.lang.String intern = ((java.lang.String) obj).intern();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 29) % 128;
        return intern;
    }

    private void Camera2StreamConfigurationMap(util.h.xy.eh.b bVar) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 95) % 128;
        this.getOutputMinFrameDuration = bVar.getOutputMinFrameDuration;
        this.getOutputMinFrameDurationlomOqCM = bVar.getOutputMinFrameDurationlomOqCM;
        this.getInputSizeshNQ4ISI = bVar.getInputSizeshNQ4ISI;
        this.getOutputFormats = bVar.getOutputFormats;
        this.getOutputStallDurationlomOqCM = bVar.getOutputStallDurationlomOqCM;
        int[] iArr = bVar.getInputFormats;
        java.lang.System.arraycopy(iArr, 0, this.getInputFormats, 0, iArr.length);
        this.getHighSpeedVideoSizesFor = bVar.getHighSpeedVideoSizesFor;
        int i = getHighResolutionOutputSizeshNQ4ISI + 27;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public b(util.h.xy.eh.b bVar) {
        super(bVar);
        this.getInputFormats = new int[80];
        Camera2StreamConfigurationMap(bVar);
    }

    public b() {
        this.getInputFormats = new int[80];
        mo26564();
    }
}
