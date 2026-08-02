package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class mc extends util.h.xy.dh.mh {
    private static long Camera2StreamConfigurationMap = 3055672978345120812L;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dh.ma getHighSpeedVideoSizesFor;
    private util.h.xy.ed.a getOutputMinFrameDuration;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getOutputMinFrameDuration);
        dVar.m26290(this.getHighSpeedVideoSizesFor);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        return aaVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.mi m26514() throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 87;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] m26309 = this.getHighSpeedVideoSizesFor.m26309();
        if (i % 2 == 0) {
            return util.h.xy.dh.mi.m26324(m26309);
        }
        util.h.xy.dh.mi.m26324(m26309);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ed.a m26513() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 37) % 128;
        util.h.xy.ed.a aVar = this.getOutputMinFrameDuration;
        int i2 = i + 51;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public mc(util.h.xy.dh.l lVar) {
        if (lVar.mo26286() == 2) {
            java.util.Enumeration mo26285 = lVar.mo26285();
            this.getOutputMinFrameDuration = util.h.xy.ed.a.m26491(mo26285.nextElement());
            this.getHighSpeedVideoSizesFor = util.h.xy.dh.rw.m26351(mo26285.nextElement());
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        int lastIndexOf = 18012 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        char[] charArray = "柵↋\ueb69뒀纰㠃쇨證唺ẜ\ud876戭⯋\uf57d뻈碾Ȃ쮠锝".toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 121) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = lastIndexOf;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (Camera2StreamConfigurationMap ^ (-7508379876853140581L));
            dVar.f2629++;
            length = length;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 1) % 128;
        while (dVar.f2629 < cArr.length) {
            int i = getHighSpeedVideoFpsRanges + 35;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            } else {
                cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            }
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr2);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(lVar.mo26286());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ed.mc m26512(java.lang.Object obj) {
        int i = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (obj instanceof util.h.xy.ed.mc) {
            util.h.xy.ed.mc mcVar = (util.h.xy.ed.mc) obj;
            getHighSpeedVideoFpsRangesFor = (i + 17) % 128;
            return mcVar;
        }
        if (obj != null) {
            return new util.h.xy.ed.mc(util.h.xy.dh.l.m26303(obj));
        }
        return null;
    }
}
