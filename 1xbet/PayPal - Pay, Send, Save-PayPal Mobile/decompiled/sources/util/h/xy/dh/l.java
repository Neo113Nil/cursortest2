package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class l extends util.h.xy.dh.mi implements util.h.xy.fb.ra<util.h.xy.dh.c> {
    static final util.h.xy.dh.p Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputSizeshNQ4ISI;
    util.h.xy.dh.c[] getHighSpeedVideoFpsRangesFor;

    abstract util.h.xy.dh.ma getHighSpeedVideoFpsRanges();

    abstract util.h.xy.dh.rk getHighSpeedVideoSizes();

    abstract util.h.xy.dh.rd getInputSizeshNQ4ISI();

    abstract util.h.xy.dh.rh getOutputFormats();

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 25) % 128;
        while (dVar.f2629 < charArray.length) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 103;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                jArr[dVar.f2629] = ((-7508379876853140581L) & getHighSpeedVideoSizes) | (charArray[dVar.f2629] / (dVar.f2629 * dVar.f2628));
                i2 = dVar.f2629;
            } else {
                jArr[dVar.f2629] = ((-7508379876853140581L) ^ getHighSpeedVideoSizes) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoSizesFor();
        Camera2StreamConfigurationMap = new util.h.xy.dh.p(util.h.xy.dh.l.class) { // from class: util.h.xy.dh.l.5
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                int i2 = (i ^ 13) + ((i & 13) << 1);
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    return lVar;
                }
                throw new java.lang.ArithmeticException();
            }
        };
        int i = getHighSpeedVideoSizesFor + 41;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    final util.h.xy.dh.rh[] getOutputStallDuration() {
        int mo26286 = mo26286();
        util.h.xy.dh.rh[] rhVarArr = new util.h.xy.dh.rh[mo26286];
        int i = 0;
        while (i < mo26286) {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 57) % 128;
            rhVarArr[i] = util.h.xy.dh.rh.m26335(this.getHighSpeedVideoFpsRangesFor[i]);
            i++;
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 81) % 128;
        }
        return rhVarArr;
    }

    final util.h.xy.dh.ma[] getOutputMinFrameDuration() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int mo26286 = mo26286();
        util.h.xy.dh.ma[] maVarArr = new util.h.xy.dh.ma[mo26286];
        for (int i = 0; i < mo26286; i++) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 47) % 128;
            maVarArr[i] = util.h.xy.dh.ma.m26308(this.getHighSpeedVideoFpsRangesFor[i]);
        }
        return maVarArr;
    }

    public java.util.Iterator<util.h.xy.dh.c> iterator() {
        util.h.xy.fb.a.ra raVar = new util.h.xy.fb.a.ra(this.getHighSpeedVideoFpsRangesFor);
        int i = getInputSizeshNQ4ISI + 125;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        int mo26286 = mo26286();
        if (mo26286 == 0) {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\udb25鄠", 18947 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr);
                return ((java.lang.String) objArr[0]).intern();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.getHighSpeedVideoFpsRangesFor[i]);
            i++;
            if (i >= mo26286) {
                int i2 = (getInputSizeshNQ4ISI + 1) % 128;
                getHighSpeedVideoSizesFor = i2;
                getInputSizeshNQ4ISI = (i2 + 17) % 128;
                stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                java.lang.String obj = stringBuffer.toString();
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 103) % 128;
                return obj;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\udb52ᨅ", 49500 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            stringBuffer.append(((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizesFor + 83;
        getInputSizeshNQ4ISI = i % 128;
        return i % 2 == 0;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.aq aqVar = new util.h.xy.dh.aq(this.getHighSpeedVideoFpsRangesFor);
        int i = getInputSizeshNQ4ISI + 59;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return aqVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 111) % 128;
        return aaVar;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        if (!(miVar instanceof util.h.xy.dh.l)) {
            return false;
        }
        util.h.xy.dh.l lVar = (util.h.xy.dh.l) miVar;
        int mo26286 = mo26286();
        if (lVar.mo26286() != mo26286) {
            return false;
        }
        for (int i = 0; i < mo26286; i++) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 81) % 128;
            util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoFpsRangesFor[i].mo26279();
            util.h.xy.dh.mi mo262792 = lVar.getHighSpeedVideoFpsRangesFor[i].mo26279();
            if (mo26279 != mo262792) {
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 67) % 128;
                if (!mo26279.getHighSpeedVideoFpsRanges(mo262792)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = (getHighSpeedVideoSizesFor + 99) % 128;
        getInputSizeshNQ4ISI = i;
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        int i2 = length + 1;
        getHighSpeedVideoSizesFor = (i + 13) % 128;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 55) % 128;
            i2 = (i2 * 257) ^ this.getHighSpeedVideoFpsRangesFor[length].mo26279().hashCode();
        }
    }

    /* renamed from: ʽ */
    public int mo26286() {
        int i = (getHighSpeedVideoSizesFor + 27) % 128;
        getInputSizeshNQ4ISI = i;
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        getHighSpeedVideoSizesFor = (i + 61) % 128;
        return length;
    }

    /* renamed from: ˊ */
    public util.h.xy.dh.c mo26287(int i) {
        int i2 = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i2 + 13) % 128;
        util.h.xy.dh.c cVar = this.getHighSpeedVideoFpsRangesFor[i];
        getHighSpeedVideoSizesFor = (i2 + 93) % 128;
        return cVar;
    }

    /* renamed from: ʼ */
    public java.util.Enumeration mo26285() {
        java.util.Enumeration enumeration = new java.util.Enumeration() { // from class: util.h.xy.dh.l.4
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;
            private int getHighSpeedVideoFpsRangesFor = 0;

            @Override // java.util.Enumeration
            public final java.lang.Object nextElement() {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i | 113) << 1) - (i ^ 113)) % 128;
                if (this.getHighSpeedVideoFpsRangesFor >= util.h.xy.dh.l.this.getHighSpeedVideoFpsRangesFor.length) {
                    throw new java.util.NoSuchElementException();
                }
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = ((i2 & 57) + (i2 | 57)) % 128;
                util.h.xy.dh.c[] cVarArr = util.h.xy.dh.l.this.getHighSpeedVideoFpsRangesFor;
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = (i3 * 46) + 46;
                int i5 = ~i3;
                int i6 = ~identityHashCode;
                int i7 = ~((i6 & i5) | (i5 ^ i6));
                int i8 = ((i7 ^ 1) | (i7 & 1)) * (-90);
                int i9 = ~(i5 | identityHashCode);
                int i10 = ~((i3 ^ 1) | (i3 & 1));
                int i11 = -(-(((i9 ^ i10) | (i9 & i10)) * (-45)));
                int i12 = ~((identityHashCode ^ (-2)) | (identityHashCode & (-2)));
                int i13 = (i12 ^ i5) | (i5 & i12);
                int i14 = ~((i6 & 1) | (i6 ^ 1));
                this.getHighSpeedVideoFpsRangesFor = ((((i4 & i8) + (i4 | i8)) - (~i11)) - 1) + (((i13 ^ i14) | (i14 & i13)) * 45);
                util.h.xy.dh.c cVar = cVarArr[i3];
                int i15 = getHighSpeedVideoSizes + 53;
                getHighResolutionOutputSizeshNQ4ISI = i15 % 128;
                if (i15 % 2 == 0) {
                    return cVar;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                boolean z;
                int i = getHighResolutionOutputSizeshNQ4ISI + 85;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    int length = util.h.xy.dh.l.this.getHighSpeedVideoFpsRangesFor.length;
                    throw null;
                }
                if (this.getHighSpeedVideoFpsRangesFor < util.h.xy.dh.l.this.getHighSpeedVideoFpsRangesFor.length) {
                    int i2 = getHighResolutionOutputSizeshNQ4ISI + 49;
                    getHighSpeedVideoSizes = i2 % 128;
                    if (i2 % 2 != 0) {
                        z = true;
                        int i3 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoSizes = (((i3 | 17) << 1) - (i3 ^ 17)) % 128;
                        return z;
                    }
                } else {
                    int i4 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoSizes = ((i4 & 89) + (i4 | 89)) % 128;
                }
                z = false;
                int i32 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i32 | 17) << 1) - (i32 ^ 17)) % 128;
                return z;
            }
        };
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 83) % 128;
        return enumeration;
    }

    util.h.xy.dh.c[] getInputFormats() {
        int i = getInputSizeshNQ4ISI + 7;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.c[] cVarArr = this.getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 57;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return cVarArr;
        }
        throw null;
    }

    l(util.h.xy.dh.c[] cVarArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = cVarArr;
    }

    protected l(util.h.xy.dh.c[] cVarArr) {
        if (!util.h.xy.fb.a.m26816(cVarArr)) {
            this.getHighSpeedVideoFpsRangesFor = util.h.xy.dh.d.getHighSpeedVideoFpsRangesFor(cVarArr);
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\udb59쁾\uedd8褴뚇叢罎擉%ⷔ쪬\uf64a鎣뼱꒖䇺浚૫㘆퍤\uf8ba\ue459膥괁䩪瞏ጜ㢶␀섯\ueecb訪랰匏硵旘Ĥ⻇쯮\uf768鳚렿", android.text.TextUtils.getTrimmedLength("") + 7013, objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
    }

    protected l(util.h.xy.dh.d dVar) {
        if (dVar != null) {
            this.getHighSpeedVideoFpsRangesFor = dVar.getHighSpeedVideoFpsRangesFor();
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\udb59Δ樌劶뤯\ue1d0졊ャὐ䘜꺋锯ﶥ\u244fಋ欿叭멠\ue11e즍〽ᢱ䜔꿅陳ﺩ▖ఞ璶匡", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55439, objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
    }

    protected l(util.h.xy.dh.c cVar) {
        if (cVar != null) {
            this.getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.c[]{cVar};
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\udb59᷐嚄轺쀿㫬珒뒇\ued01♽ᣳ冦誔썟Ћ绯럮\ue867⅝ᩏ峌閬칠ܯ", 50891 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
    }

    protected l() {
        this.getHighSpeedVideoFpsRangesFor = util.h.xy.dh.d.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dh.l m26304(util.h.xy.dh.mm mmVar, boolean z) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 87) % 128;
        util.h.xy.dh.l lVar = (util.h.xy.dh.l) Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(mmVar, z);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 23) % 128;
        return lVar;
    }

    static void getHighSpeedVideoSizesFor() {
        getHighSpeedVideoSizes = -3369314902507394843L;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.l m26303(java.lang.Object obj) {
        if (obj != null) {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 91) % 128;
            if (!(obj instanceof util.h.xy.dh.l)) {
                if (obj instanceof util.h.xy.dh.c) {
                    util.h.xy.dh.mi mo26279 = ((util.h.xy.dh.c) obj).mo26279();
                    if (mo26279 instanceof util.h.xy.dh.l) {
                        int i = getInputSizeshNQ4ISI + 81;
                        getHighSpeedVideoSizesFor = i % 128;
                        util.h.xy.dh.l lVar = (util.h.xy.dh.l) mo26279;
                        if (i % 2 != 0) {
                            return lVar;
                        }
                        throw null;
                    }
                } else if (obj instanceof byte[]) {
                    try {
                        util.h.xy.dh.l lVar2 = (util.h.xy.dh.l) Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((byte[]) obj);
                        int i2 = getHighSpeedVideoSizesFor + 57;
                        getInputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 == 0) {
                            return lVar2;
                        }
                        throw null;
                    } catch (java.io.IOException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\udb18撦ꑥ\ue439◿文ꔈ\ue505⛙曟꘧\ue7e2➼杨꜔\ue0dbₛ恔ꀈ\ue1e5ⅹ愶ꋩ\ue294≃戁ꏗ\ue398⍢泭겢\uec76ⰳ涇궎\ued4cⴎ溦깓\uee0c⾬濿", 49081 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(e.getMessage());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\udb0b껵ミ몿ಅ陰ᡎ\ue21d琹︑䇦쯌嶡➫꧘㍼蕀ཫ鄃擤\ueeee烾諭䲞홲塂≒됺㸗膵ஈ", 30181 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
                sb2.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        return (util.h.xy.dh.l) obj;
    }
}
