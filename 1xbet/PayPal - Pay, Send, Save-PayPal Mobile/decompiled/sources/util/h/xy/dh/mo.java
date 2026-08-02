package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class mo extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    static final util.h.xy.dh.p Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final char[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static int getInputSizeshNQ4ISI;
    final byte[] getHighSpeedVideoFpsRangesFor;

    static {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap = new util.h.xy.dh.p(util.h.xy.dh.mo.class) { // from class: util.h.xy.dh.mo.1
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = ((i & 119) + (i | 119)) % 128;
                util.h.xy.dh.mo Camera2StreamConfigurationMap2 = util.h.xy.dh.mo.Camera2StreamConfigurationMap(mzVar.m26337());
                int i2 = getHighSpeedVideoSizes + 85;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw null;
            }
        };
        getHighSpeedVideoSizesFor = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = getInputFormats + 117;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.StringBuffer stringBuffer, int i) {
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        char[] cArr = getHighSpeedVideoSizesFor;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 125;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static util.h.xy.dh.mo Camera2StreamConfigurationMap(byte[] bArr) {
        util.h.xy.dh.ak akVar = new util.h.xy.dh.ak(bArr);
        int i = getInputFormats + 85;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return akVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = getInputFormats + 21;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.fb.a.m26817(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.ArithmeticException();
        }
        int m26817 = util.h.xy.fb.a.m26817(this.getHighSpeedVideoFpsRangesFor);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 13;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return m26817;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getInputFormats + 57;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (!(miVar instanceof util.h.xy.dh.mo)) {
            getInputFormats = (i2 + 117) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoFpsRangesFor, ((util.h.xy.dh.mo) miVar).getHighSpeedVideoFpsRangesFor);
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 1) % 128;
        return m26820;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 37;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            rjVar.getHighSpeedVideoSizes(z, 12, this.getHighSpeedVideoFpsRangesFor);
        } else {
            rjVar.getHighSpeedVideoSizes(z, 28, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 77;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoFpsRangesFor.length);
            throw new java.lang.ArithmeticException();
        }
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoFpsRangesFor.length);
        int i2 = getInputFormats + 53;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = (i + 21) % 128;
        int i2 = i + 41;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = getInputFormats + 1;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            mo26276();
            throw null;
        }
        java.lang.String mo26276 = mo26276();
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 41;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return mo26276;
        }
        throw null;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        int i;
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(((util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(length) + length) * 2) + 3);
        int resolveSize = 3 - android.view.View.resolveSize(0, 0);
        int indexOf = 3 - android.text.TextUtils.indexOf("", "");
        int longPressTimeout = 121 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 39) % 128;
        char[] charArray = "\u0011\uffff\ufff1".toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[resolveSize];
        raVar.f2649 = 0;
        while (raVar.f2649 < resolveSize) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 27) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + longPressTimeout);
            int i2 = raVar.f2649;
            cArr[i2] = (char) (cArr[i2] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (indexOf > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 43) % 128;
            raVar.f2648 = indexOf;
            char[] cArr2 = new char[resolveSize];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, resolveSize);
            java.lang.System.arraycopy(cArr2, 0, cArr, resolveSize - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, resolveSize - raVar.f2648);
        }
        char[] cArr3 = new char[resolveSize];
        raVar.f2649 = 0;
        while (raVar.f2649 < resolveSize) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 69) % 128;
            cArr3[raVar.f2649] = cArr[(resolveSize - raVar.f2649) - 1];
            raVar.f2649++;
        }
        stringBuffer.append(new java.lang.String(cArr3).intern());
        if (length >= 128) {
            byte[] bArr = new byte[5];
            int i3 = length;
            int i4 = 5;
            while (true) {
                i = i4 - 1;
                bArr[i] = (byte) i3;
                i3 >>>= 8;
                if (i3 == 0) {
                    break;
                }
                i4 = i;
            }
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
            int i5 = i4 - 2;
            bArr[i5] = (byte) ((5 - i) | 128);
            while (true) {
                int i6 = i5 + 1;
                getHighSpeedVideoSizes(stringBuffer, bArr[i5]);
                if (i6 >= 5) {
                    break;
                }
                i5 = i6;
            }
        } else {
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            getHighSpeedVideoSizes(stringBuffer, length);
        }
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 49) % 128;
        for (int i7 = 0; i7 < length; i7++) {
            getHighSpeedVideoSizes(stringBuffer, this.getHighSpeedVideoFpsRangesFor[i7]);
        }
        java.lang.String obj = stringBuffer.toString();
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 111) % 128;
        return obj;
    }

    mo(byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    static void getHighSpeedVideoSizes() {
        getInputSizeshNQ4ISI = -1231763759;
    }
}
