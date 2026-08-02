package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class rd extends util.h.xy.dh.mi {
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static boolean getInputSizeshNQ4ISI = false;
    private static boolean getOutputMinFrameDuration = false;
    private static int getOutputMinFrameDurationlomOqCM = 1;
    private static int getOutputSizes;
    private static char[] getOutputStallDuration;
    private static int getOutputStallDurationlomOqCM;
    util.h.xy.dh.mi Camera2StreamConfigurationMap;
    util.h.xy.dh.i getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    util.h.xy.dh.f getHighSpeedVideoSizes;
    util.h.xy.dh.mi getOutputFormats;

    abstract util.h.xy.dh.l getHighSpeedVideoFpsRanges();

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getInputFormats + 83;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputStallDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputStallDurationlomOqCM);
        if (!getOutputMinFrameDuration) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.rd.class) { // from class: util.h.xy.dh.rd.1
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 81;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                    return lVar.getInputSizeshNQ4ISI();
                }
                lVar.getInputSizeshNQ4ISI();
                throw null;
            }
        };
        getOutputMinFrameDurationlomOqCM = (getOutputSizes + 3) % 128;
    }

    private static util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar, int i) {
        getOutputSizes = (getOutputMinFrameDurationlomOqCM + 71) % 128;
        if (lVar.mo26286() <= i) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0088\u008a\u0082\u0088\u0084\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u0086\u0082\u0081\u0086\u0087\u0085\u008a\u0088\u0093\u0092\u008b\u0086\u009e\u0088\u0094\u0086\u008b\u008b\u0085", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.mi mo26279 = lVar.mo26287(i).mo26279();
        int i2 = getOutputMinFrameDurationlomOqCM + 19;
        getOutputSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return mo26279;
        }
        throw new java.lang.ArithmeticException();
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = getOutputMinFrameDurationlomOqCM;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        getOutputSizes = i4;
        if (i >= 0) {
            getOutputSizes = i4;
            if (i3 % 2 == 0 ? i <= 2 : i <= 4) {
                getOutputSizes = (i2 + 33) % 128;
                return i;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0086\u009d\u0088\u0084\u008c\u008d\u009c\u0086\u008f\u0082\u0081\u0091\u008b\u008a\u0082\u0088\u0086\u0091\u0081\u008c\u008d\u009c\u0082\u0081", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = (getOutputSizes + 109) % 128;
        getOutputMinFrameDurationlomOqCM = i;
        if (this == miVar) {
            getOutputSizes = (i + 7) % 128;
            return true;
        }
        if (!(miVar instanceof util.h.xy.dh.rd)) {
            return false;
        }
        util.h.xy.dh.rd rdVar = (util.h.xy.dh.rd) miVar;
        if (util.h.xy.fb.d.m26832(this.getHighResolutionOutputSizeshNQ4ISI, rdVar.getHighResolutionOutputSizeshNQ4ISI) && util.h.xy.fb.d.m26832(this.getHighSpeedVideoSizes, rdVar.getHighSpeedVideoSizes) && util.h.xy.fb.d.m26832(this.Camera2StreamConfigurationMap, rdVar.Camera2StreamConfigurationMap)) {
            getOutputMinFrameDurationlomOqCM = (getOutputSizes + 27) % 128;
            if (this.getHighSpeedVideoFpsRanges == rdVar.getHighSpeedVideoFpsRanges && this.getOutputFormats.m26325(rdVar.getOutputFormats)) {
                int i2 = getOutputSizes + 89;
                getOutputMinFrameDurationlomOqCM = i2 % 128;
                return i2 % 2 != 0;
            }
        }
        return false;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getOutputSizes;
        getOutputMinFrameDurationlomOqCM = (i + 55) % 128;
        getOutputMinFrameDurationlomOqCM = (i + 45) % 128;
        return true;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        getOutputMinFrameDurationlomOqCM = (getOutputSizes + 5) % 128;
        int m26831 = util.h.xy.fb.d.m26831(this.getHighResolutionOutputSizeshNQ4ISI);
        int m268312 = util.h.xy.fb.d.m26831(this.getHighSpeedVideoSizes);
        int m268313 = util.h.xy.fb.d.m26831(this.Camera2StreamConfigurationMap);
        int i = this.getHighSpeedVideoFpsRanges;
        int hashCode = this.getOutputFormats.hashCode();
        getOutputSizes = (getOutputMinFrameDurationlomOqCM + 109) % 128;
        return (((m26831 ^ m268312) ^ m268313) ^ i) ^ hashCode;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.an anVar = new util.h.xy.dh.an(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        getOutputSizes = (getOutputMinFrameDurationlomOqCM + 11) % 128;
        return anVar;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.rv rvVar = new util.h.xy.dh.rv(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        int i = getOutputMinFrameDurationlomOqCM + 7;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            return rvVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getOutputMinFrameDurationlomOqCM = (getOutputSizes + 19) % 128;
        rjVar.getHighSpeedVideoSizes(z, 40);
        getHighSpeedVideoFpsRanges().getHighResolutionOutputSizeshNQ4ISI(rjVar, false);
        getOutputSizes = (getOutputMinFrameDurationlomOqCM + 1) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        getOutputSizes = (getOutputMinFrameDurationlomOqCM + 95) % 128;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges().getHighSpeedVideoFpsRanges(z);
        int i = getOutputSizes + 21;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    rd(util.h.xy.dh.i iVar, util.h.xy.dh.f fVar, util.h.xy.dh.mi miVar, int i, util.h.xy.dh.mi miVar2) {
        util.h.xy.dh.p pVar;
        this.getHighResolutionOutputSizeshNQ4ISI = iVar;
        this.getHighSpeedVideoSizes = fVar;
        this.Camera2StreamConfigurationMap = miVar;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(i);
        int i2 = getOutputSizes + 23;
        int i3 = i2 % 128;
        getOutputMinFrameDurationlomOqCM = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i == 1) {
            pVar = util.h.xy.dh.rh.getHighSpeedVideoFpsRangesFor;
        } else {
            if (i != 2) {
                getOutputSizes = (i3 + 27) % 128;
                this.getOutputFormats = miVar2;
            }
            pVar = util.h.xy.dh.ma.getHighSpeedVideoFpsRanges;
        }
        miVar2 = pVar.getHighResolutionOutputSizeshNQ4ISI(miVar2);
        this.getOutputFormats = miVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (28064 == r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        r1 = new java.lang.StringBuilder();
        r3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - android.text.TextUtils.getTrimmedLength(""), "\u0086\u009d\u008f\u008d\u0085\u0086\u0091\u0081\u008c\u008d\u009c\u0082\u0081", r3);
        r1.append(((java.lang.String) r3[0]).intern());
        r1.append(util.h.xy.dh.q.m26331(r10, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r7 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r7 != 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r10 = util.h.xy.dh.ma.m26305(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        r9.getOutputFormats = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        r1 = new java.lang.StringBuilder();
        r3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.text.TextUtils.indexOf("", "", 0, 0) + 127, "\u0086\u009d\u008f\u008d\u0085\u0086\u0091\u0081\u008c\u008d\u009c\u0082\u0081", r3);
        r1.append(((java.lang.String) r3[0]).intern());
        r1.append(util.h.xy.dh.q.m26331(r10, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        r10 = util.h.xy.dh.rh.m26336(r1, false);
        util.h.xy.dh.rd.getOutputMinFrameDurationlomOqCM = (util.h.xy.dh.rd.getOutputSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        r10 = r1.m26326().mo26279();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (128 == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    rd(util.h.xy.dh.l lVar) {
        int i;
        int m26328;
        int m26330;
        util.h.xy.dh.mi highSpeedVideoSizes = getHighSpeedVideoSizes(lVar, 0);
        if (highSpeedVideoSizes instanceof util.h.xy.dh.i) {
            this.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.dh.i) highSpeedVideoSizes;
            highSpeedVideoSizes = getHighSpeedVideoSizes(lVar, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (highSpeedVideoSizes instanceof util.h.xy.dh.f) {
            this.getHighSpeedVideoSizes = (util.h.xy.dh.f) highSpeedVideoSizes;
            i++;
            highSpeedVideoSizes = getHighSpeedVideoSizes(lVar, i);
        }
        if (!(highSpeedVideoSizes instanceof util.h.xy.dh.mm)) {
            this.Camera2StreamConfigurationMap = highSpeedVideoSizes;
            i++;
            highSpeedVideoSizes = getHighSpeedVideoSizes(lVar, i);
        }
        if (lVar.mo26286() != i + 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.graphics.Color.blue(0), "\u0088\u008f\u008e\u008d\u008c\u0086\u008b\u008b\u0085\u0086\u0088\u008a\u0082\u0088\u0084\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!(highSpeedVideoSizes instanceof util.h.xy.dh.mm)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u008c\u008d\u0082\u008e\u0088\u0085\u009b\u009a\u0086\u0088\u0083\u0099\u0085\u0086\u0094\u008b\u0086\u0088\u0092\u0086\u008b\u0085\u0086\u0098\u0088\u0088\u0087\u0086\u0085\u0097\u0082\u0087\u0088\u008b\u0091\u0086\u0088\u008e\u0084\u0085\u008a\u0084\u008e\u0085\u0096\u0086\u0095\u0088\u008a\u0082\u0088\u0084\u0089\u0088\u0087\u0086\u0082\u0081\u0086\u0091\u0082\u0084\u008b\u0094\u0086\u0085\u008a\u0088\u0093\u0092\u008b\u0086\u0091\u0088\u008f\u008f\u008d\u0085\u0086\u008b\u0090", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(mmVar.m26330());
        int i2 = getOutputMinFrameDurationlomOqCM + 37;
        getOutputSizes = i2 % 128;
        if (i2 % 2 != 0) {
            m26328 = mmVar.m26328();
            m26330 = mmVar.m26330();
        } else {
            m26328 = mmVar.m26328();
            m26330 = mmVar.m26330();
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputStallDuration = new char[]{64201, 64180, 64182, 64189, 64178, 64262, 64179, 64205, 64177, 64195, 64183, 64202, 64193, 64176, 64207, 64212, 64194, 64192, 64200, 64204, 64244, 64211, 64271, 64181, 64185, 64237, 64190, 64188, 64248, 64191};
        getOutputStallDurationlomOqCM = -1074857178;
        getInputSizeshNQ4ISI = true;
        getOutputMinFrameDuration = true;
    }
}
