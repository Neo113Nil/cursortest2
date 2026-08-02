package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class mb extends util.h.xy.dh.mh {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputSizeshNQ4ISI = 0;
    private static long getOutputFormats = -1041601479538159873L;
    private static int getOutputMinFrameDuration = 1;
    util.h.xy.dh.ma Camera2StreamConfigurationMap;
    util.h.xy.ed.d getHighResolutionOutputSizeshNQ4ISI;
    util.h.xy.ed.a getHighSpeedVideoFpsRanges;
    util.h.xy.dh.l getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = (getInputSizeshNQ4ISI + 3) % 128;
        getOutputMinFrameDuration = i;
        util.h.xy.dh.l lVar = this.getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i + 63) % 128;
        return lVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ed.d m26511() {
        int i = getInputSizeshNQ4ISI + 91;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ed.d dVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i % 2 != 0) {
            return dVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private mb(util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizes = lVar;
        if (lVar.mo26286() == 3) {
            this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.ed.d.m26502(lVar.mo26287(0));
            this.getHighSpeedVideoFpsRanges = util.h.xy.ed.a.m26491(lVar.mo26287(1));
            this.Camera2StreamConfigurationMap = util.h.xy.dh.ma.m26308(lVar.mo26287(2));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0) + 15329;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 1) % 128;
        char[] charArray = "紗䛠\u0ad7캲銅噯ᩁ\ude26ꉌ柺⯜\uefa0뎆睮㬊Ｘ쌝蓯䣓\u0cf7킖鑾塀ᱳ\ue01dꖽ槝ⶺ\uf18a땭祓㴽ĭ씆軧勓ᚥ".toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = normalizeMetaState;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 55) % 128;
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputFormats ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ed.mb m26510(java.lang.Object obj) {
        if (obj instanceof util.h.xy.ed.mb) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 31) % 128;
            return (util.h.xy.ed.mb) obj;
        }
        if (obj != null) {
            return new util.h.xy.ed.mb(util.h.xy.dh.l.m26303(obj));
        }
        int i = getInputSizeshNQ4ISI + 49;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }
}
