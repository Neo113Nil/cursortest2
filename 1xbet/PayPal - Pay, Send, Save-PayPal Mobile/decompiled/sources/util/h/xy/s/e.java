package util.h.xy.s;

/* loaded from: classes5.dex */
public class e {
    private static boolean Camera2StreamConfigurationMap = false;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static boolean getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static long getOutputMinFrameDuration;
    private byte[] ArtificialStackFrames;
    private byte[] CoroutineDebuggingKt;
    private byte[] _CREATION;
    private byte[][] accessartificialFrame;
    private util.h.xy.s.mc coroutineBoundary;
    private int coroutineCreation;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private byte[] getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI = 0;
    private byte[] toString;
    private byte[][] unwrapAs;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.s.e.class.getName();
        getHighSpeedVideoFpsRanges = (getInputFormats + 105) % 128;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputMinFrameDuration ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 121) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m27200() {
        byte[][] bArr = {new byte[]{41}};
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 95;
        getInputFormats = i2 % 128;
        byte[] bArr2 = null;
        if (i2 % 2 == 0) {
            int i3 = this.coroutineCreation;
            this.unwrapAs = new byte[i3][];
            this.accessartificialFrame = new byte[i3][];
            if (i3 > 0) {
                getInputFormats = (i + 113) % 128;
                this.isOutputSupportedForhNQ4ISI = 0;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.getTrimmedLength(""), "\u0086\u0085\u0082\u0084\u0083\u0082\u0081", objArr);
                ((java.lang.String) objArr[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-112}, this.getOutputSizes);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("⯏䓗\uf5c6曣韪\u0082놅⊉厡첯絍\uee5dὈ衼㥲ꨜ\udb0a琒\ue534", 28428 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                ((java.lang.String) objArr2[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-111}, this.getOutputSizeshNQ4ISI);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("⯏ή䊂뗉亮ⲱ៏嬍躰\uf1f9├桋只蜶쩊㶟愴告龀쌫㙵禅곃", android.graphics.Color.green(0) + 13487, objArr3);
                ((java.lang.String) objArr3[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-110}, this.getOutputStallDurationlomOqCM);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0082\u0081\u0082\u0091\u0084\u0081\u0090\u008b\u008f\u0082\u008e\u0085\u008d\u008c\u008b\u0084\u008a\u0081\u0084\u0089\u0088\u0082\u0087\u0081\u0084\u0083\u0082\u0081", objArr4);
                ((java.lang.String) objArr4[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-109}, this._CREATION);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes("⯏턷\ude06\udb03쁦쵩쩆\uf7b5ﲶ列\ue686\ue3f5\ue8d7闂録頼蔊色轰", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 64236, objArr5);
                ((java.lang.String) objArr5[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-108}, this.CoroutineDebuggingKt);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u008f\u008b\u0091\u008a\u0092\u0084\u0092\u008e\u0088\u0084\u0083\u0082\u0081", objArr6);
                ((java.lang.String) objArr6[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-107}, this.getOutputMinFrameDurationlomOqCM);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes("⯏䐹\uf41a摭鑂ҹ뒍⓱哄씥甋\ue51fᕭ蕝㖥ꖟ헤䗆", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28643, objArr7);
                ((java.lang.String) objArr7[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-104}, this.getOutputStallDuration);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes("⯏⫁⧪⢕⾢\u2e5f\u2d78Ⱡ⌜∾⃐⟠⚌▍⒮㭀", 283 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
                ((java.lang.String) objArr8[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{com.visa.cbp.getEncExpo.registerForActivityResult}, this.getValidOutputFormatsForInputhNQ4ISI);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes("⯏ﬥ訢夹样㼡츳", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 53503, objArr9);
                ((java.lang.String) objArr9[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-102}, this.toString);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0093\u0090\u008a\u0085\u0081\u0085\u0091\u0090\u008a\u0088\u0084\u008b\u0090\u0085\u008f\u0088\u008b\u0091\u0084\u0083\u0082\u0081", objArr10);
                ((java.lang.String) objArr10[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{-101}, this.isOutputSupportedFor);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0091\u0085\u0084\u008b\u008f\u0085\u0094\u008a\u0087\u0086\u0084\u0091\u0086\u0088\u0084\u0083\u0082\u0081", objArr11);
                ((java.lang.String) objArr11[0]).intern();
                getHighResolutionOutputSizeshNQ4ISI(new byte[]{82}, this.ArtificialStackFrames);
            }
            byte[] m25024 = util.h.xy.al.rd.m25024(this.unwrapAs, this.accessartificialFrame);
            if (m25024 != null) {
                int length = m25024.length;
                getHighSpeedVideoFpsRanges = (getInputFormats + 15) % 128;
            }
            byte[] m250242 = util.h.xy.al.rd.m25024(bArr, new byte[][]{m25024});
            util.h.xy.s.mc mcVar = this.coroutineBoundary;
            if (mcVar != null) {
                int i4 = getHighSpeedVideoFpsRanges + 103;
                getInputFormats = i4 % 128;
                if (i4 % 2 != 0) {
                    byte[][] bArr3 = new byte[0][];
                    byte[][] bArr4 = new byte[1][];
                    bArr3[0] = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
                    bArr4[1] = mcVar.m27222();
                    bArr2 = util.h.xy.al.rd.m25024(bArr3, bArr4);
                } else {
                    bArr2 = util.h.xy.al.rd.m25024(new byte[][]{new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE}}, new byte[][]{mcVar.m27222()});
                }
            }
            byte[] m25090 = util.h.xy.ar.b.m25090(m250242, bArr2);
            if (m25090 != null) {
                getHighSpeedVideoFpsRanges = (getInputFormats + 55) % 128;
                int length2 = m25090.length;
            }
            return m25090;
        }
        int i5 = this.coroutineCreation;
        this.unwrapAs = new byte[i5][];
        this.accessartificialFrame = new byte[i5][];
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2 = getHighSpeedVideoFpsRangesFor + 81;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getHighSpeedVideoSizesFor;
        if (cArr2 != null) {
            int i3 = getHighSpeedVideoFpsRangesFor + 15;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                cArr[i4] = (char) (cArr2[i4] ^ (-3299939579226817547L));
            }
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getOutputFormats);
        if (!getInputSizeshNQ4ISI) {
            if (!Camera2StreamConfigurationMap) {
                throw null;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 99) % 128;
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 47) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
            int i6 = getHighSpeedVideoSizes + 79;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) {
        int i = (getInputFormats + 61) % 128;
        getHighSpeedVideoFpsRanges = i;
        if (bArr2 != null) {
            int i2 = i + 49;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                if (bArr2.length > 0) {
                    byte[][] bArr3 = this.unwrapAs;
                    int i3 = this.isOutputSupportedForhNQ4ISI;
                    bArr3[i3] = bArr;
                    byte[][] bArr4 = this.accessartificialFrame;
                    this.isOutputSupportedForhNQ4ISI = i3 + 1;
                    bArr4[i3] = bArr2;
                    return;
                }
                return;
            }
            int length = bArr2.length;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m27195() {
        int i = getInputFormats + 39;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.getOutputSizes;
        getInputFormats = (i2 + 55) % 128;
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27204(byte[] bArr) {
        this.getOutputSizes = bArr;
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRanges;
            getInputFormats = (i + 67) % 128;
            if (bArr.length > 0) {
                int i2 = i + 39;
                getInputFormats = i2 % 128;
                this.coroutineCreation = i2 % 2 != 0 ? this.coroutineCreation : this.coroutineCreation + 1;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27197() {
        int i = getHighSpeedVideoFpsRanges + 29;
        int i2 = i % 128;
        getInputFormats = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i2 + 31) % 128;
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27199(byte[] bArr) {
        this.getOutputSizeshNQ4ISI = bArr;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = (getInputFormats + 65) % 128;
            if (bArr.length > 0) {
                this.coroutineCreation++;
            }
        }
        getHighSpeedVideoFpsRanges = (getInputFormats + 19) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m27192() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 31;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getOutputStallDurationlomOqCM;
        int i3 = i + 89;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27194(byte[] bArr) {
        this.getOutputStallDurationlomOqCM = bArr;
        if (bArr != null) {
            int i = getInputFormats;
            getHighSpeedVideoFpsRanges = (i + 103) % 128;
            if (bArr.length > 0) {
                this.coroutineCreation++;
                getHighSpeedVideoFpsRanges = (i + 81) % 128;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27196(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 71;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            this._CREATION = bArr;
            if (bArr != null && bArr.length > 0) {
                this.coroutineCreation++;
            }
            getInputFormats = (i + 19) % 128;
            return;
        }
        this._CREATION = bArr;
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m27205() {
        int i = (getHighSpeedVideoFpsRanges + 25) % 128;
        getInputFormats = i;
        byte[] bArr = this.CoroutineDebuggingKt;
        getHighSpeedVideoFpsRanges = (i + 115) % 128;
        return bArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27191(byte[] bArr) {
        this.CoroutineDebuggingKt = bArr;
        if (bArr != null) {
            int i = getInputFormats;
            getHighSpeedVideoFpsRanges = (i + 25) % 128;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = (i + 99) % 128;
                this.coroutineCreation++;
            }
        }
        getHighSpeedVideoFpsRanges = (getInputFormats + 55) % 128;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m27186() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 113;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        int i3 = i + 25;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27193(java.lang.String str) {
        int i = getInputFormats + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] m27070 = util.h.xy.s.b.m27070(str);
            this.getOutputMinFrameDurationlomOqCM = m27070;
            if (m27070.length > 0) {
                this.coroutineCreation++;
            }
            getInputFormats = (getHighSpeedVideoFpsRanges + 91) % 128;
            return;
        }
        byte[] m270702 = util.h.xy.s.b.m27070(str);
        this.getOutputMinFrameDurationlomOqCM = m270702;
        int length = m270702.length;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m27189() {
        int i = (getInputFormats + 57) % 128;
        getHighSpeedVideoFpsRanges = i;
        byte[] bArr = this.getOutputStallDuration;
        getInputFormats = (i + 105) % 128;
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27203(java.lang.String str) {
        byte[] m27072 = util.h.xy.s.b.m27072(str);
        this.getOutputStallDuration = m27072;
        if (m27072.length > 0) {
            getHighSpeedVideoFpsRanges = (getInputFormats + 29) % 128;
            this.coroutineCreation++;
        }
        getInputFormats = (getHighSpeedVideoFpsRanges + 39) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public byte[] m27187() {
        int i = getInputFormats + 95;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27190(java.lang.String str) {
        int i;
        getHighSpeedVideoFpsRanges = (getInputFormats + 111) % 128;
        if (str == null || str.isEmpty()) {
            this.getValidOutputFormatsForInputhNQ4ISI = new byte[]{1};
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("⯍疀", android.text.TextUtils.getOffsetBefore("", 0) + 24107, objArr);
            if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                this.getValidOutputFormatsForInputhNQ4ISI = new byte[]{0};
                i = getInputFormats + 111;
            } else {
                this.getValidOutputFormatsForInputhNQ4ISI = new byte[]{1};
                i = getInputFormats + 101;
            }
            getHighSpeedVideoFpsRanges = i % 128;
        }
        byte[] bArr = this.getValidOutputFormatsForInputhNQ4ISI;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        int i2 = getInputFormats + 67;
        getHighSpeedVideoFpsRanges = i2 % 128;
        this.coroutineCreation = i2 % 2 == 0 ? this.coroutineCreation : this.coroutineCreation + 1;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] m27206() {
        int i = getInputFormats;
        getHighSpeedVideoFpsRanges = (i + 21) % 128;
        byte[] bArr = this.toString;
        int i2 = i + 115;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m27185(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 17;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            this.toString = bArr;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            this.coroutineCreation++;
            getInputFormats = (i + 57) % 128;
            return;
        }
        this.toString = bArr;
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] m27202() {
        int i = getInputFormats + 15;
        getHighSpeedVideoFpsRanges = i % 128;
        byte[] bArr = this.isOutputSupportedFor;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public void m27201(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 125;
        int i2 = i % 128;
        getInputFormats = i2;
        if (i % 2 != 0) {
            this.isOutputSupportedFor = bArr;
            throw new java.lang.ArithmeticException();
        }
        this.isOutputSupportedFor = bArr;
        if (bArr != null) {
            int i3 = i2 + 55;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length > 0) {
                int i4 = i2 + 29;
                getHighSpeedVideoFpsRanges = i4 % 128;
                this.coroutineCreation = i4 % 2 == 0 ? this.coroutineCreation % 1 : this.coroutineCreation + 1;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27198(util.h.xy.s.mc mcVar) {
        this.coroutineBoundary = mcVar;
        if (mcVar != null) {
            getInputFormats = (getHighSpeedVideoFpsRanges + 49) % 128;
            this.coroutineCreation++;
        }
        int i = getInputFormats + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m27188(byte[] bArr) {
        this.ArtificialStackFrames = bArr;
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRanges + 69;
            int i2 = i % 128;
            getInputFormats = i2;
            if (i % 2 == 0) {
                if (bArr.length > 0) {
                    getHighSpeedVideoFpsRanges = (i2 + 3) % 128;
                    this.coroutineCreation++;
                }
            } else {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
        }
        int i3 = getInputFormats + 19;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "¢¡\u0099\u009e \u009e\u009f\u0099\u009e\u0099\u0091\u009e\u009d\u009c\u009b\u009a\u0099\u0086\u0098\u0097\u0096\u0091\u0095\u0092", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.coroutineCreation);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "¢\u0096¥\u0099\u009e¤£", objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(java.util.Arrays.toString(this.unwrapAs));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("⮷疖鞷ㅽ千ﴏỰ룓\udace", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 24109, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(java.util.Arrays.toString(this.accessartificialFrame));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.red(0) + 127, "¢¨\u009c§\u009d¦¤£", objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(this.isOutputSupportedForhNQ4ISI);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "¢\u0098¦\u0099¤£", objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append(java.util.Arrays.toString(this.getOutputSizes));
        int i = getInputFormats;
        getHighSpeedVideoFpsRanges = (i + 83) % 128;
        getHighSpeedVideoFpsRanges = (i + 63) % 128;
        try {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes("⮷\uf1ca鼜꒰䈯濇㕏틭\uf867蘋ꎞ䤮ᚓ㱇\ud9c1\ue761貶", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 55922, objArr6);
            sb.append(((java.lang.String) objArr6[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputSizeshNQ4ISI));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 127, "¢\u0097\u009c«\u009bª\u0090\u009c\u0095\u009d\u009cª©\u009c\u0093\u009d\u0099\u0098¤£", objArr7);
            sb.append(((java.lang.String) objArr7[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputStallDurationlomOqCM));
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.view.View.MeasureSpec.getSize(0), "¢\u0099\u009e\u0099\u0091\u009e\u009d\u009c¡\u0099®¦ª©\u008b\u00ad¬\u0095\u0099\u0097\u009e¤£", objArr8);
            sb.append(((java.lang.String) objArr8[0]).intern());
            sb.append(java.util.Arrays.toString(this._CREATION));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "¢\u0099\u009e\u0099\u0091\u009d ¦\u009e\u0099\u0095¦¡\u0098\u0098\u0082\u0097\u009cª\u0096\u0096¦¤£", objArr9);
            sb.append(((java.lang.String) objArr9[0]).intern());
            sb.append(java.util.Arrays.toString(this.CoroutineDebuggingKt));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "¢¡\u009c§ \u0092\u009b®\u0095¤£", objArr10);
            sb.append(((java.lang.String) objArr10[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputMinFrameDurationlomOqCM));
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.indexOf("", ""), "¢\u009d ¦\u009e\u0099\u0097\u009c\u009d\u009c\u0083§\u009bª¤£", objArr11);
            sb.append(((java.lang.String) objArr11[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputStallDuration));
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoSizes("⮷Ｚ苬噻秾൸탋\ue479迡卡書\u0a7f\uddf9\ue12b", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 54401, objArr12);
            sb.append(((java.lang.String) objArr12[0]).intern());
            sb.append(java.util.Arrays.toString(this.getValidOutputFormatsForInputhNQ4ISI));
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.view.View.getDefaultSize(0, 0), "¢\u0097\u0099\u0098¤£", objArr13);
            sb.append(((java.lang.String) objArr13[0]).intern());
            sb.append(java.util.Arrays.toString(this.toString));
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.getOffsetBefore("", 0), "¢\u0096\u009d ¦\u009e¦§\u009d \u0088\u009c\u009d¦¡\u0095\u009c§¤£", objArr14);
            sb.append(((java.lang.String) objArr14[0]).intern());
            sb.append(java.util.Arrays.toString(this.isOutputSupportedFor));
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.text.TextUtils.getOffsetBefore("", 0), "¢§\u0085\u009c¡¦¯ \u0097\u0098¤£", objArr15);
            sb.append(((java.lang.String) objArr15[0]).intern());
            sb.append(java.util.Arrays.toString(this.ArtificialStackFrames));
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "¢\u0099\u009e\u0099\u0091\u009e\u009d\u009c\u009b\u009a\u0099\u0086\u009d \u009b\u009b \u0095¤£", objArr16);
            sb.append(((java.lang.String) objArr16[0]).intern());
            sb.append(this.coroutineBoundary);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = new char[]{64381, 64384, 64398, 64358, 64392, 64369, 64371, 64386, 64394, 64374, 64396, 64368, 64380, 64383, 64373, 64375, 64397, 64372, 64370, 64399, 64354, 64338, 64339, 64337, 64352, 64344, 64340, 64364, 64343, 64349, 64346, 64342, 64341, 64388, 64405, 64417, 64366, 64360, 64365, 64345, 64336, 64348, 64355, 64362, 64403, 64351, 64367};
        getOutputFormats = -1074857023;
        Camera2StreamConfigurationMap = true;
        getInputSizeshNQ4ISI = true;
        getOutputMinFrameDuration = 6869133610588641280L;
    }
}
