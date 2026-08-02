package util.h.xy.dh;

/* loaded from: classes5.dex */
public class rc extends util.h.xy.dh.mi {
    private static int Camera2StreamConfigurationMap = 0;
    static final util.h.xy.dh.p getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final util.h.xy.dh.rc[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static char[] getInputSizeshNQ4ISI;
    private static boolean getOutputFormats;
    private static boolean getOutputMinFrameDuration;
    private final byte[] getOutputMinFrameDurationlomOqCM;
    private final int getOutputStallDurationlomOqCM;

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getInputSizeshNQ4ISI;
        if (cArr2 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 55;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 99) % 128;
                cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                i2++;
            }
            cArr2 = cArr;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizes);
        if (!getOutputFormats) {
            if (!getOutputMinFrameDuration) {
                throw null;
            }
            int i5 = getHighSpeedVideoFpsRanges + 27;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 59) % 128;
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.p(util.h.xy.dh.rc.class) { // from class: util.h.xy.dh.rc.2
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i | 87) << 1) - (i ^ 87)) % 128;
                util.h.xy.dh.rc highSpeedVideoFpsRangesFor = util.h.xy.dh.rc.getHighSpeedVideoFpsRangesFor(mzVar.m26337(), false);
                int i2 = getHighSpeedVideoSizes;
                int i3 = (i2 & 101) + (i2 | 101);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    return highSpeedVideoFpsRangesFor;
                }
                throw new java.lang.ArithmeticException();
            }
        };
        getHighSpeedVideoSizesFor = new util.h.xy.dh.rc[12];
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 45) % 128;
    }

    static util.h.xy.dh.rc getHighSpeedVideoFpsRangesFor(byte[] bArr, boolean z) {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        if (bArr.length > 1) {
            return new util.h.xy.dh.rc(bArr, z);
        }
        if (bArr.length == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u009b\u008c\u0090\u008a\u0087\u0083\u0089\u0085\u0086\u0087\u009c\u0089\u008d\u0082\u009b\u0089\u009a\u0093\u0099\u0098\u0097\u0093\u0096\u0095\u0094\u0093", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int i = bArr[0] & 255;
        util.h.xy.dh.rc[] rcVarArr = getHighSpeedVideoSizesFor;
        if (i >= rcVarArr.length) {
            return new util.h.xy.dh.rc(bArr, z);
        }
        util.h.xy.dh.rc rcVar = rcVarArr[i];
        if (rcVar == null) {
            rcVar = new util.h.xy.dh.rc(bArr, z);
            rcVarArr[i] = rcVar;
            getInputFormats = (getHighSpeedVideoFpsRangesFor + 17) % 128;
        }
        int i2 = getInputFormats + 103;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return rcVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = getHighSpeedVideoFpsRangesFor + 19;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.fb.a.m26817(this.getOutputMinFrameDurationlomOqCM);
            throw null;
        }
        int m26817 = util.h.xy.fb.a.m26817(this.getOutputMinFrameDurationlomOqCM);
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        return m26817;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        if (!(miVar instanceof util.h.xy.dh.rc)) {
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 1) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getOutputMinFrameDurationlomOqCM, ((util.h.xy.dh.rc) miVar).getOutputMinFrameDurationlomOqCM);
        int i = getInputFormats + 55;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return m26820;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 55) % 128;
        rjVar.getHighSpeedVideoSizes(z, 10, this.getOutputMinFrameDurationlomOqCM);
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 59) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getInputFormats + 95;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 != 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getInputFormats + 17) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = i + 45;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private rc(byte[] bArr, boolean z) {
        if (util.h.xy.dh.f.getHighResolutionOutputSizeshNQ4ISI(bArr)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0088\u0087\u008c\u0082\u0086\u0087\u0081\u008b\u008a\u0087\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if ((bArr[0] & 128) == 0) {
            this.getOutputMinFrameDurationlomOqCM = z ? util.h.xy.fb.a.m26821(bArr) : bArr;
            this.getOutputStallDurationlomOqCM = util.h.xy.dh.f.getHighSpeedVideoFpsRanges(bArr);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.KeyEvent.keyCodeFromString("") + 127, "\u0087\u0092\u0091\u008c\u0082\u0090\u0087\u008a\u008f\u008a\u0085\u008a\u0089\u0087\u008e\u0089\u008c\u008d\u008b\u0081\u0089\u0088\u0087\u008c\u0082\u0086\u0087\u0081\u008b\u008a\u0087", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputSizeshNQ4ISI = new char[]{64100, 64112, 64101, 64127, 64102, 64099, 64124, 64125, 64177, 64103, 64108, 64109, 64098, 64115, 64164, 64126, 64120, 64111, 64156, 64135, 64140, 64132, 64131, 64144, 64141, 64157, 64121, 64107};
        getHighSpeedVideoSizes = -1074857263;
        getOutputMinFrameDuration = true;
        getOutputFormats = true;
    }
}
