package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = -1231763794;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getOutputFormats = 1;
    util.h.xy.ea.rj getHighSpeedVideoFpsRangesFor;
    util.h.xy.dj.ma getHighSpeedVideoSizes;
    private util.h.xy.ea.rh getInputFormats;
    private util.h.xy.dh.rk getInputSizeshNQ4ISI;
    private util.h.xy.ed.a getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 59;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26480() throws java.io.IOException {
        getHighSpeedVideoSizesFor = (getOutputFormats + 13) % 128;
        byte[] mo25969 = this.getHighSpeedVideoSizes.mo25969();
        int i = getHighSpeedVideoSizesFor + 111;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return mo25969;
        }
        throw new java.lang.ArithmeticException();
    }

    public b(util.h.xy.dj.ma maVar) throws util.h.xy.ea.d {
        this.getHighSpeedVideoSizes = maVar;
        try {
            util.h.xy.dj.d m26362 = util.h.xy.dj.d.m26362(maVar.m26382());
            if (m26362.m26364() != null) {
                this.getInputFormats = new util.h.xy.ea.rh(m26362.m26364());
            }
            util.h.xy.dh.rk m26365 = m26362.m26365();
            util.h.xy.dj.a m26363 = m26362.m26363();
            this.getOutputMinFrameDuration = m26363.m26355();
            this.getHighSpeedVideoFpsRangesFor = util.h.xy.ea.rc.getHighSpeedVideoFpsRangesFor(m26365, this.getOutputMinFrameDuration, new util.h.xy.ea.rc.mb(this.getOutputMinFrameDuration, m26363.m26354(), new util.h.xy.ea.md(m26363.m26356().m26337())));
            this.getInputSizeshNQ4ISI = m26362.m26366();
        } catch (java.lang.ClassCastException e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\u0011\f\u0004\u0003\uffbf\u0002\u000e\r\u0013\u0004\r\u0013ￍ￬\u0000\u000b\u0005\u000e", 18 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 12 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.getDefaultSize(0, 0) + 153, objArr);
            throw new util.h.xy.ea.d(((java.lang.String) objArr[0]).intern(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u0011\f\u0004\u0003\uffbf\u0002\u000e\r\u0013\u0004\r\u0013ￍ￬\u0000\u000b\u0005\u000e", 18 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 13 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 152 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr2);
                throw new util.h.xy.ea.d(((java.lang.String) objArr2[0]).intern(), e2);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }
}
