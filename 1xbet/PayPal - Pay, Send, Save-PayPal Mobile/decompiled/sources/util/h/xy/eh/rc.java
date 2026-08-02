package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class rc extends util.h.xy.eh.ra {
    static final int[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static char[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputMinFrameDuration;
    private int getOutputFormats;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private int[] isOutputSupportedFor;
    private int toString;
    private int unwrapAs;

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRangesFor);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 29) % 128;
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ᐝ */
    public final void mo26585(util.h.xy.fb.c cVar) {
        int i = getOutputMinFrameDuration + 91;
        getInputSizeshNQ4ISI = i % 128;
        Camera2StreamConfigurationMap((util.h.xy.eh.rc) cVar);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getInputSizeshNQ4ISI + 37;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ʻ */
    public final util.h.xy.fb.c mo26581() {
        util.h.xy.eh.rc rcVar = new util.h.xy.eh.rc(this);
        int i = getOutputMinFrameDuration + 23;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return rcVar;
        }
        throw null;
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        int i2 = getInputSizeshNQ4ISI + 25;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private static int Camera2StreamConfigurationMap(int i) {
        int i2 = (getOutputMinFrameDuration + 33) % 128;
        getInputSizeshNQ4ISI = i2;
        getOutputMinFrameDuration = (i2 + 115) % 128;
        return (((i << 19) | (i >>> 13)) ^ ((i >>> 2) | (i << 30))) ^ ((i << 10) | (i >>> 22));
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        int i4 = getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i4 + 117) % 128;
        getOutputMinFrameDuration = (i4 + 105) % 128;
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int i4 = getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i4 + 57) % 128;
        getOutputMinFrameDuration = (i4 + 111) % 128;
        return (i & i2) ^ (i3 & (~i));
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ʼ */
    protected final void mo26582() {
        int i;
        int i2;
        for (int i3 = 16; i3 <= 63; i3++) {
            int[] iArr = this.isOutputSupportedFor;
            int i4 = iArr[i3 - 2];
            int i5 = (getInputSizeshNQ4ISI + 51) % 128;
            getOutputMinFrameDuration = i5;
            int i6 = (i5 + 19) % 128;
            getInputSizeshNQ4ISI = i6;
            int i7 = ((((i4 << 13) | (i4 >>> 19)) ^ ((i4 >>> 17) | (i4 << 15))) ^ (i4 >>> 10)) + iArr[i3 - 7];
            int i8 = iArr[i3 - 15];
            int i9 = i6 + 73;
            getOutputMinFrameDuration = i9 % 128;
            if (i9 % 2 != 0) {
                i = ((i8 >>> 121) | (i8 - 5)) ^ ((i8 / 54) | (i8 % 80));
                i2 = i8 - 3;
            } else {
                i = ((i8 >>> 7) | (i8 << 25)) ^ ((i8 >>> 18) | (i8 << 14));
                i2 = i8 >>> 3;
            }
            iArr[i3] = i7 + (i ^ i2) + iArr[i3 - 16];
        }
        int i10 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i11 = this.getOutputStallDuration;
        int i12 = this.unwrapAs;
        int i13 = this.getOutputMinFrameDurationlomOqCM;
        int i14 = this.getOutputStallDurationlomOqCM;
        int i15 = this.toString;
        int i16 = this.getOutputFormats;
        int i17 = this.getOutputSizes;
        int i18 = 0;
        for (int i19 = 0; i19 < 8; i19++) {
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i14);
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i14, i15, i16);
            int[] iArr2 = Camera2StreamConfigurationMap;
            int i20 = i17 + highSpeedVideoFpsRanges + highSpeedVideoFpsRangesFor + iArr2[i18] + this.isOutputSupportedFor[i18];
            int i21 = i13 + i20;
            int Camera2StreamConfigurationMap2 = i20 + Camera2StreamConfigurationMap(i10) + getHighSpeedVideoFpsRanges(i10, i11, i12);
            int i22 = i18 + 1;
            int highSpeedVideoFpsRanges2 = i16 + getHighSpeedVideoFpsRanges(i21) + getHighSpeedVideoFpsRangesFor(i21, i14, i15) + iArr2[i22] + this.isOutputSupportedFor[i22];
            int i23 = i12 + highSpeedVideoFpsRanges2;
            int Camera2StreamConfigurationMap3 = highSpeedVideoFpsRanges2 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2) + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2, i10, i11);
            int i24 = i18 + 2;
            int highSpeedVideoFpsRanges3 = i15 + getHighSpeedVideoFpsRanges(i23) + getHighSpeedVideoFpsRangesFor(i23, i21, i14) + iArr2[i24] + this.isOutputSupportedFor[i24];
            int i25 = i11 + highSpeedVideoFpsRanges3;
            int Camera2StreamConfigurationMap4 = highSpeedVideoFpsRanges3 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3) + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2, i10);
            int i26 = i18 + 3;
            int highSpeedVideoFpsRanges4 = i14 + getHighSpeedVideoFpsRanges(i25) + getHighSpeedVideoFpsRangesFor(i25, i23, i21) + iArr2[i26] + this.isOutputSupportedFor[i26];
            int i27 = i10 + highSpeedVideoFpsRanges4;
            int Camera2StreamConfigurationMap5 = highSpeedVideoFpsRanges4 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4) + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2);
            int i28 = i18 + 4;
            int highSpeedVideoFpsRanges5 = i21 + getHighSpeedVideoFpsRanges(i27) + getHighSpeedVideoFpsRangesFor(i27, i25, i23) + iArr2[i28] + this.isOutputSupportedFor[i28];
            i17 = Camera2StreamConfigurationMap2 + highSpeedVideoFpsRanges5;
            i13 = highSpeedVideoFpsRanges5 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5) + getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3);
            int i29 = i18 + 5;
            int highSpeedVideoFpsRanges6 = i23 + getHighSpeedVideoFpsRanges(i17) + getHighSpeedVideoFpsRangesFor(i17, i27, i25) + iArr2[i29] + this.isOutputSupportedFor[i29];
            i16 = Camera2StreamConfigurationMap3 + highSpeedVideoFpsRanges6;
            i12 = highSpeedVideoFpsRanges6 + Camera2StreamConfigurationMap(i13) + getHighSpeedVideoFpsRanges(i13, Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4);
            int i30 = i18 + 6;
            int highSpeedVideoFpsRanges7 = i25 + getHighSpeedVideoFpsRanges(i16) + getHighSpeedVideoFpsRangesFor(i16, i17, i27) + iArr2[i30] + this.isOutputSupportedFor[i30];
            i15 = Camera2StreamConfigurationMap4 + highSpeedVideoFpsRanges7;
            i11 = highSpeedVideoFpsRanges7 + Camera2StreamConfigurationMap(i12) + getHighSpeedVideoFpsRanges(i12, i13, Camera2StreamConfigurationMap5);
            int i31 = i18 + 7;
            int highSpeedVideoFpsRanges8 = i27 + getHighSpeedVideoFpsRanges(i15) + getHighSpeedVideoFpsRangesFor(i15, i16, i17) + iArr2[i31] + this.isOutputSupportedFor[i31];
            i14 = Camera2StreamConfigurationMap5 + highSpeedVideoFpsRanges8;
            i10 = highSpeedVideoFpsRanges8 + Camera2StreamConfigurationMap(i11) + getHighSpeedVideoFpsRanges(i11, i12, i13);
            i18 += 8;
        }
        this.getValidOutputFormatsForInputhNQ4ISI += i10;
        this.getOutputStallDuration += i11;
        this.unwrapAs += i12;
        this.getOutputMinFrameDurationlomOqCM += i13;
        this.getOutputStallDurationlomOqCM += i14;
        this.toString += i15;
        this.getOutputFormats += i16;
        this.getOutputSizes += i17;
        this.getOutputSizeshNQ4ISI = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 83) % 128;
            this.isOutputSupportedFor[i32] = 0;
        }
    }

    @Override // util.h.xy.eh.ra, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final void mo26564() {
        super.mo26564();
        this.getValidOutputFormatsForInputhNQ4ISI = -1056596264;
        this.getOutputStallDuration = 914150663;
        this.unwrapAs = 812702999;
        this.getOutputMinFrameDurationlomOqCM = -150054599;
        this.getOutputStallDurationlomOqCM = -4191439;
        this.toString = 1750603025;
        this.getOutputFormats = 1694076839;
        this.getOutputSizes = -1090891868;
        this.getOutputSizeshNQ4ISI = 0;
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 25) % 128;
        int i = 0;
        while (true) {
            int[] iArr = this.isOutputSupportedFor;
            if (i == iArr.length) {
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 97) % 128;
                return;
            } else {
                iArr[i] = 0;
                i++;
            }
        }
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 89) % 128;
        m26590();
        util.h.xy.fb.rb.m26847(this.getValidOutputFormatsForInputhNQ4ISI, bArr, i);
        util.h.xy.fb.rb.m26847(this.getOutputStallDuration, bArr, i + 4);
        util.h.xy.fb.rb.m26847(this.unwrapAs, bArr, i + 8);
        util.h.xy.fb.rb.m26847(this.getOutputMinFrameDurationlomOqCM, bArr, i + 12);
        util.h.xy.fb.rb.m26847(this.getOutputStallDurationlomOqCM, bArr, i + 16);
        util.h.xy.fb.rb.m26847(this.toString, bArr, i + 20);
        util.h.xy.fb.rb.m26847(this.getOutputFormats, bArr, i + 24);
        mo26564();
        int i2 = getInputSizeshNQ4ISI + 87;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return 28;
        }
        throw null;
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ᐝ */
    protected final void mo26584(long j) {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 95) % 128;
        if (this.getOutputSizeshNQ4ISI > 14) {
            mo26582();
        }
        int[] iArr = this.isOutputSupportedFor;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        int i = getInputSizeshNQ4ISI + 29;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.eh.ra
    /* renamed from: ˊ */
    protected final void mo26583(byte[] bArr, int i) {
        int i2 = getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i2 + 73) % 128;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.isOutputSupportedFor;
        int i3 = this.getOutputSizeshNQ4ISI;
        iArr[i3] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i4 = i3 + 1;
        this.getOutputSizeshNQ4ISI = i4;
        if (i4 == 16) {
            int i5 = i2 + 81;
            getOutputMinFrameDuration = i5 % 128;
            mo26582();
            if (i5 % 2 != 0) {
                throw null;
            }
        }
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        int i = getOutputMinFrameDuration + 73;
        int i2 = i % 128;
        getInputSizeshNQ4ISI = i2;
        int i3 = i % 2 == 0 ? 93 : 28;
        int i4 = i2 + 23;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.Object obj;
        int i = getInputSizeshNQ4ISI + 39;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionType(0L) * 9, "\u0086\u0085\u0085\u0084\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "\u0086\u0085\u0085\u0084\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern();
    }

    private void Camera2StreamConfigurationMap(util.h.xy.eh.rc rcVar) {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 11) % 128;
        super.m26591(rcVar);
        this.getValidOutputFormatsForInputhNQ4ISI = rcVar.getValidOutputFormatsForInputhNQ4ISI;
        this.getOutputStallDuration = rcVar.getOutputStallDuration;
        this.unwrapAs = rcVar.unwrapAs;
        this.getOutputMinFrameDurationlomOqCM = rcVar.getOutputMinFrameDurationlomOqCM;
        this.getOutputStallDurationlomOqCM = rcVar.getOutputStallDurationlomOqCM;
        this.toString = rcVar.toString;
        this.getOutputFormats = rcVar.getOutputFormats;
        this.getOutputSizes = rcVar.getOutputSizes;
        int[] iArr = rcVar.isOutputSupportedFor;
        java.lang.System.arraycopy(iArr, 0, this.isOutputSupportedFor, 0, iArr.length);
        this.getOutputSizeshNQ4ISI = rcVar.getOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 109) % 128;
    }

    public rc(util.h.xy.eh.rc rcVar) {
        super(rcVar);
        this.isOutputSupportedFor = new int[64];
        Camera2StreamConfigurationMap(rcVar);
    }

    public rc() {
        this.isOutputSupportedFor = new int[64];
        mo26564();
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = new char[]{64293, 64304, 64331, 64351, 64346, 64324};
        getHighSpeedVideoFpsRangesFor = -1074857080;
        getHighSpeedVideoSizesFor = true;
        getHighSpeedVideoFpsRanges = true;
    }
}
