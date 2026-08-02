package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class t implements util.h.xy.dh.mj {
    private static int Camera2StreamConfigurationMap = -1231763718;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dh.rm getOutputMinFrameDuration;

    static util.h.xy.dh.rr getHighSpeedVideoSizes(util.h.xy.dh.rm rmVar) throws java.io.IOException {
        util.h.xy.dh.rr rrVar = new util.h.xy.dh.rr(util.h.xy.ez.ma.m26745(new util.h.xy.dh.u(rmVar)));
        int i = getHighSpeedVideoFpsRanges + 75;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return rrVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        try {
            return mo26278();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                int edgeSlop = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 45;
                int maximumDrawingCacheSize = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                int intValue = 203 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22);
                char[] charArray = "\uffc1\b\u000f\n\u0015\u0013\u0006\u0017\u000f\u0010\u0004\uffc1\u000f\u0010\n\u0015\u0011\u0006\u0004\u0019￦\ufff0￪\uffc1ￛ\u001a\u0002\u0013\u0013\u0002\uffc1\u0006\u0015\u001a\u0003\uffc1\u0010\u0015\uffc1\u000e\u0002\u0006\u0013\u0015\u0014".toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[edgeSlop];
                raVar.f2649 = 0;
                while (raVar.f2649 < edgeSlop) {
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + intValue);
                    int i = raVar.f2649;
                    cArr[i] = (char) (cArr[i] - ((int) (Camera2StreamConfigurationMap ^ (-4839292868003314026L))));
                    raVar.f2649++;
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
                }
                if (maximumDrawingCacheSize > 0) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 43) % 128;
                    raVar.f2648 = maximumDrawingCacheSize;
                    char[] cArr2 = new char[edgeSlop];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, edgeSlop);
                    java.lang.System.arraycopy(cArr2, 0, cArr, edgeSlop - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, edgeSlop - raVar.f2648);
                }
                char[] cArr3 = new char[edgeSlop];
                raVar.f2649 = 0;
                while (raVar.f2649 < edgeSlop) {
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
                    cArr3[raVar.f2649] = cArr[(edgeSlop - raVar.f2649) - 1];
                    raVar.f2649++;
                    int i2 = getHighResolutionOutputSizeshNQ4ISI + 83;
                    getHighSpeedVideoSizes = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 / 2;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e.getMessage());
                throw new util.h.xy.dh.ri(sb.toString(), e);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 43) % 128;
        util.h.xy.dh.rr highSpeedVideoSizes = getHighSpeedVideoSizes(this.getOutputMinFrameDuration);
        int i = getHighSpeedVideoFpsRangesFor + 125;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoSizes;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mj
    /* renamed from: ˋ */
    public final java.io.InputStream mo26280() {
        util.h.xy.dh.u uVar = new util.h.xy.dh.u(this.getOutputMinFrameDuration);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        return uVar;
    }

    t(util.h.xy.dh.rm rmVar) {
        this.getOutputMinFrameDuration = rmVar;
    }
}
