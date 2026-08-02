package util.h.xy.cw;

/* loaded from: classes5.dex */
final class md extends util.h.xy.cw.b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static final byte[] getOutputMinFrameDurationlomOqCM;
    private static char getOutputStallDuration;
    private static char getOutputStallDurationlomOqCM;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        byte[] bArr = {115, 116, 97, 110, 100, 97, 114, 100};
        getOutputMinFrameDurationlomOqCM = bArr;
        getOutputMinFrameDuration = new java.lang.String(bArr);
        int i = getOutputFormats + 91;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    md(java.lang.String str) {
        super(str);
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˏ */
    public final void mo26073(util.h.xy.da.mb mbVar) throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizesFor + 79;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            int i2 = 1;
            if (mo26080()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                int indexOf = 69 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                int i4 = i3 + 37;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 != 0) {
                    getHighSpeedVideoFpsRangesFor = (i3 + 13) % 128;
                    char[] charArray = "់䊡㫒鹪뺊\ued7b剐〵䫔礿汓\uf0f0檒█球킝엺ꑞ꘎\ue1b6ẘ啅\ue329鱋艹嘛媾ᖀ厗㮙\uda97䀵\ue9a4ꮽ畆睞풸꼍末\ueae9ᇒ㡁꘎\ue1b6풸꼍ΰ僘泣\uda88풸꼍햕騮\udee2꼾\uee71冷剐〵鴳많쌆䯋䙞ὡ枅ꋲ覘됣".toCharArray();
                    util.h.xz.b.e eVar = new util.h.xz.b.e();
                    char[] cArr = new char[charArray.length];
                    eVar.f2630 = 0;
                    char[] cArr2 = new char[2];
                    while (eVar.f2630 < charArray.length) {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[i2] = charArray[eVar.f2630 + i2];
                        int i5 = 58224;
                        int i6 = 0;
                        while (i6 < 16) {
                            char c = cArr2[i2];
                            char c2 = cArr2[0];
                            char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputStallDuration ^ 3155153533016530592L)))));
                            cArr2[1] = c3;
                            cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i5)) ^ ((c3 >>> 5) + ((char) (getOutputStallDurationlomOqCM ^ 3155153533016530592L)))));
                            i5 -= 40503;
                            i6++;
                            indexOf = indexOf;
                            i2 = 1;
                        }
                        cArr[eVar.f2630] = cArr2[0];
                        i2 = 1;
                        cArr[eVar.f2630 + 1] = cArr2[1];
                        eVar.f2630 += 2;
                        indexOf = indexOf;
                    }
                    java.lang.String str = new java.lang.String(cArr, 0, indexOf);
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
                    objArr[0] = str;
                    throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
                }
                throw null;
            }
            this.Camera2StreamConfigurationMap = true;
            getOutputFormats = (getHighSpeedVideoSizesFor + 121) % 128;
            return;
        }
        mo26080();
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final java.lang.String getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoSizesFor + 79;
        getOutputFormats = i % 128;
        java.lang.String str = getOutputMinFrameDuration;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws util.h.xy.da.b {
        int i = (getOutputFormats + 9) % 128;
        getHighSpeedVideoSizesFor = i;
        int i2 = i + 5;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.da.b {
        int i = (getHighSpeedVideoSizesFor + 45) % 128;
        getOutputFormats = i;
        getHighSpeedVideoSizesFor = (i + 61) % 128;
        return bArr;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizesFor;
        getOutputFormats = (i + 17) % 128;
        int i2 = i + 83;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.cw.b
    protected final byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.da.b {
        int i = (getHighSpeedVideoSizesFor + 103) % 128;
        getOutputFormats = i;
        getHighSpeedVideoSizesFor = (i + 41) % 128;
        return bArr;
    }

    @Override // util.h.xy.cw.b
    protected final int getHighSpeedVideoFpsRangesFor() {
        int i = (getOutputFormats + 79) % 128;
        getHighSpeedVideoSizesFor = i;
        int i2 = i + 121;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.MAX_VALUE;
        }
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final void Camera2StreamConfigurationMap() {
        getOutputFormats = (getHighSpeedVideoSizesFor + 119) % 128;
    }

    @Override // util.h.xy.cw.b
    protected final void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = (getOutputFormats + 111) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = (char) 20123;
        getOutputStallDurationlomOqCM = (char) 41960;
        getInputSizeshNQ4ISI = (char) 21855;
        getOutputStallDuration = (char) 18518;
    }
}
