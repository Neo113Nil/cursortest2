package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class mc extends util.h.xy.eh.ra {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    static final int[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getOutputFormats;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int[] getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 105) % 128;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 1) % 128;
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(Camera2StreamConfigurationMap ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 45) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (Camera2StreamConfigurationMap ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 107) % 128;
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ᐝ */
    public final void mo26585(util.h.xy.fb.c cVar) {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        getHighSpeedVideoSizes((util.h.xy.eh.mc) cVar);
        int i = getHighResolutionOutputSizeshNQ4ISI + 63;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ʻ */
    public final util.h.xy.fb.c mo26581() {
        util.h.xy.eh.mc mcVar = new util.h.xy.eh.mc(this);
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
        return mcVar;
    }

    private static int getHighSpeedVideoSizes(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = getOutputFormats + 31;
        int i6 = i5 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i6;
        if (i5 % 2 == 0) {
            i2 = ((i % 44) | (i + 12)) ^ ((i / 68) | (i << com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
            i3 = i - 38;
            i4 = i % 8;
        } else {
            i2 = ((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21));
            i3 = i >>> 25;
            i4 = i << 7;
        }
        getOutputFormats = (i6 + 69) % 128;
        return (i4 | i3) ^ i2;
    }

    private static int Camera2StreamConfigurationMap(int i) {
        int i2 = (getOutputFormats + 25) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        getOutputFormats = (i2 + 89) % 128;
        return (((i << 19) | (i >>> 13)) ^ ((i >>> 2) | (i << 30))) ^ ((i << 10) | (i >>> 22));
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 21;
        int i5 = i4 % 128;
        getOutputFormats = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i5 + 75) % 128;
        return (i & i2) | (i3 & (i ^ i2));
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        int i4 = (getOutputFormats + 37) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        int i5 = i4 + 49;
        getOutputFormats = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        return (i & i2) ^ (i3 & (~i));
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ʼ */
    protected final void mo26582() {
        int i;
        int i2;
        int i3;
        int i4;
        for (int i5 = 16; i5 <= 63; i5++) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            getOutputFormats = (i6 + 49) % 128;
            int[] iArr = this.getOutputSizeshNQ4ISI;
            int i7 = iArr[i5 - 2];
            int i8 = i6 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getOutputFormats = i8 % 128;
            if (i8 % 2 != 0) {
                i = ((i7 << 59) | i7) ^ ((i7 - 59) | (i7 << 106));
                i2 = i7 * 71;
            } else {
                i = ((i7 >>> 17) | (i7 << 15)) ^ ((i7 >>> 19) | (i7 << 13));
                i2 = i7 >>> 10;
            }
            int i9 = (i2 ^ i) + iArr[i5 - 7];
            int i10 = iArr[i5 - 15];
            int i11 = i6 + 111;
            int i12 = i11 % 128;
            getOutputFormats = i12;
            if (i11 % 2 != 0) {
                i3 = ((i10 << 86) | (i10 * 45)) ^ ((i10 + 13) | (i10 + 84));
                i4 = i10 >> 3;
            } else {
                i3 = ((i10 >>> 7) | (i10 << 25)) ^ ((i10 >>> 18) | (i10 << 14));
                i4 = i10 >>> 3;
            }
            int i13 = i12 + 71;
            getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            iArr[i5] = i9 + (i3 ^ i4) + iArr[i5 - 16];
        }
        int i14 = this.getOutputSizes;
        int i15 = this.getOutputStallDuration;
        int i16 = this.getOutputStallDurationlomOqCM;
        int i17 = this.getOutputMinFrameDurationlomOqCM;
        int i18 = this.getInputSizeshNQ4ISI;
        int i19 = this.getOutputMinFrameDuration;
        int i20 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i21 = this.getInputFormats;
        int i22 = 0;
        int i23 = 0;
        while (i22 < 8) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(i18);
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i18, i19, i20);
            int[] iArr2 = getHighSpeedVideoFpsRangesFor;
            int i24 = i21 + highSpeedVideoSizes + highSpeedVideoFpsRanges + iArr2[i23] + this.getOutputSizeshNQ4ISI[i23];
            int i25 = i17 + i24;
            int Camera2StreamConfigurationMap2 = i24 + Camera2StreamConfigurationMap(i14) + getHighResolutionOutputSizeshNQ4ISI(i14, i15, i16);
            int i26 = i23 + 1;
            int highSpeedVideoSizes2 = i20 + getHighSpeedVideoSizes(i25) + getHighSpeedVideoFpsRanges(i25, i18, i19) + iArr2[i26] + this.getOutputSizeshNQ4ISI[i26];
            int i27 = i16 + highSpeedVideoSizes2;
            int Camera2StreamConfigurationMap3 = highSpeedVideoSizes2 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2) + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2, i14, i15);
            int i28 = i23 + 2;
            int highSpeedVideoSizes3 = i19 + getHighSpeedVideoSizes(i27) + getHighSpeedVideoFpsRanges(i27, i25, i18) + iArr2[i28] + this.getOutputSizeshNQ4ISI[i28];
            int i29 = i15 + highSpeedVideoSizes3;
            int Camera2StreamConfigurationMap4 = highSpeedVideoSizes3 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3) + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2, i14);
            int i30 = i23 + 3;
            int highSpeedVideoSizes4 = i18 + getHighSpeedVideoSizes(i29) + getHighSpeedVideoFpsRanges(i29, i27, i25) + iArr2[i30] + this.getOutputSizeshNQ4ISI[i30];
            int i31 = i14 + highSpeedVideoSizes4;
            int Camera2StreamConfigurationMap5 = highSpeedVideoSizes4 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4) + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2);
            int i32 = i23 + 4;
            int highSpeedVideoSizes5 = i25 + getHighSpeedVideoSizes(i31) + getHighSpeedVideoFpsRanges(i31, i29, i27) + iArr2[i32] + this.getOutputSizeshNQ4ISI[i32];
            i21 = Camera2StreamConfigurationMap2 + highSpeedVideoSizes5;
            i17 = highSpeedVideoSizes5 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5) + getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3);
            int i33 = i23 + 5;
            int highSpeedVideoSizes6 = i27 + getHighSpeedVideoSizes(i21) + getHighSpeedVideoFpsRanges(i21, i31, i29) + iArr2[i33] + this.getOutputSizeshNQ4ISI[i33];
            i20 = Camera2StreamConfigurationMap3 + highSpeedVideoSizes6;
            i16 = highSpeedVideoSizes6 + Camera2StreamConfigurationMap(i17) + getHighResolutionOutputSizeshNQ4ISI(i17, Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4);
            int i34 = i23 + 6;
            int highSpeedVideoSizes7 = i29 + getHighSpeedVideoSizes(i20) + getHighSpeedVideoFpsRanges(i20, i21, i31) + iArr2[i34] + this.getOutputSizeshNQ4ISI[i34];
            i19 = Camera2StreamConfigurationMap4 + highSpeedVideoSizes7;
            i15 = highSpeedVideoSizes7 + Camera2StreamConfigurationMap(i16) + getHighResolutionOutputSizeshNQ4ISI(i16, i17, Camera2StreamConfigurationMap5);
            int i35 = i23 + 7;
            int highSpeedVideoSizes8 = i31 + getHighSpeedVideoSizes(i19) + getHighSpeedVideoFpsRanges(i19, i20, i21) + iArr2[i35] + this.getOutputSizeshNQ4ISI[i35];
            i18 = Camera2StreamConfigurationMap5 + highSpeedVideoSizes8;
            i14 = highSpeedVideoSizes8 + Camera2StreamConfigurationMap(i15) + getHighResolutionOutputSizeshNQ4ISI(i15, i16, i17);
            i23 += 8;
            i22++;
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 119) % 128;
        }
        this.getOutputSizes += i14;
        this.getOutputStallDuration += i15;
        this.getOutputStallDurationlomOqCM += i16;
        this.getOutputMinFrameDurationlomOqCM += i17;
        this.getInputSizeshNQ4ISI += i18;
        this.getOutputMinFrameDuration += i19;
        this.getValidOutputFormatsForInputhNQ4ISI += i20;
        this.getInputFormats += i21;
        this.getHighSpeedVideoSizesFor = 0;
        for (int i36 = 0; i36 < 16; i36++) {
            this.getOutputSizeshNQ4ISI[i36] = 0;
        }
    }

    @Override // util.h.xy.eh.ra, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final void mo26564() {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        super.mo26564();
        this.getOutputSizes = 1779033703;
        this.getOutputStallDuration = -1150833019;
        this.getOutputStallDurationlomOqCM = 1013904242;
        this.getOutputMinFrameDurationlomOqCM = -1521486534;
        this.getInputSizeshNQ4ISI = 1359893119;
        this.getOutputMinFrameDuration = -1694144372;
        this.getValidOutputFormatsForInputhNQ4ISI = 528734635;
        this.getInputFormats = 1541459225;
        this.getHighSpeedVideoSizesFor = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getOutputSizeshNQ4ISI;
            if (i == iArr.length) {
                return;
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 19;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                iArr[i] = 0;
                i += 109;
            } else {
                iArr[i] = 0;
                i++;
            }
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 83) % 128;
        m26590();
        util.h.xy.fb.rb.m26847(this.getOutputSizes, bArr, i);
        util.h.xy.fb.rb.m26847(this.getOutputStallDuration, bArr, i + 4);
        util.h.xy.fb.rb.m26847(this.getOutputStallDurationlomOqCM, bArr, i + 8);
        util.h.xy.fb.rb.m26847(this.getOutputMinFrameDurationlomOqCM, bArr, i + 12);
        util.h.xy.fb.rb.m26847(this.getInputSizeshNQ4ISI, bArr, i + 16);
        util.h.xy.fb.rb.m26847(this.getOutputMinFrameDuration, bArr, i + 20);
        util.h.xy.fb.rb.m26847(this.getValidOutputFormatsForInputhNQ4ISI, bArr, i + 24);
        util.h.xy.fb.rb.m26847(this.getInputFormats, bArr, i + 28);
        mo26564();
        int i2 = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return 32;
        }
        throw null;
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ᐝ */
    protected final void mo26584(long j) {
        int i = getOutputFormats + 61;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0 ? this.getHighSpeedVideoSizesFor > 14 : this.getHighSpeedVideoSizesFor > 95) {
            mo26582();
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 47) % 128;
        }
        int[] iArr = this.getOutputSizeshNQ4ISI;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ˊ */
    protected final void mo26583(byte[] bArr, int i) {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.getOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoSizesFor;
        iArr[i2] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.getHighSpeedVideoSizesFor = i3;
        if (i3 == 16) {
            mo26582();
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 125) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        int i = (getOutputFormats + 117) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        getOutputFormats = (i + 25) % 128;
        return 32;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.Object obj;
        int i = getOutputFormats + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("밴뱧૱\ue389側噒\uf71f\ue755휲쳅썱", 1 >> (android.view.ViewConfiguration.getScrollBarFadeDuration() >>> 60), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("밴뱧૱\ue389側噒\uf71f\ue755휲쳅썱", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            obj = objArr2[0];
        }
        java.lang.String intern = ((java.lang.String) obj).intern();
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
        return intern;
    }

    private void getHighSpeedVideoSizes(util.h.xy.eh.mc mcVar) {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
        super.m26591(mcVar);
        this.getOutputSizes = mcVar.getOutputSizes;
        this.getOutputStallDuration = mcVar.getOutputStallDuration;
        this.getOutputStallDurationlomOqCM = mcVar.getOutputStallDurationlomOqCM;
        this.getOutputMinFrameDurationlomOqCM = mcVar.getOutputMinFrameDurationlomOqCM;
        this.getInputSizeshNQ4ISI = mcVar.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = mcVar.getOutputMinFrameDuration;
        this.getValidOutputFormatsForInputhNQ4ISI = mcVar.getValidOutputFormatsForInputhNQ4ISI;
        this.getInputFormats = mcVar.getInputFormats;
        int[] iArr = mcVar.getOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(iArr, 0, this.getOutputSizeshNQ4ISI, 0, iArr.length);
        this.getHighSpeedVideoSizesFor = mcVar.getHighSpeedVideoSizesFor;
        int i = getOutputFormats + 71;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public mc(util.h.xy.eh.mc mcVar) {
        super(mcVar);
        this.getOutputSizeshNQ4ISI = new int[64];
        getHighSpeedVideoSizes(mcVar);
    }

    public mc() {
        this.getOutputSizeshNQ4ISI = new int[64];
        mo26564();
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = 4063889191092003557L;
    }
}
