package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ab implements util.h.xy.dh.mj {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static long getHighSpeedVideoFpsRanges = -305786856911548688L;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.ba getOutputMinFrameDuration;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRanges ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            int i3 = getHighSpeedVideoFpsRangesFor + 93;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 << 1;
            } else {
                cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        java.lang.String str2 = new java.lang.String(cArr2);
        int i4 = getHighSpeedVideoFpsRangesFor + 119;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ, reason: contains not printable characters */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 95;
        getHighSpeedVideoSizes = i % 128;
        try {
            if (i % 2 == 0) {
                return mo26278();
            }
            mo26278();
            throw new java.lang.NullPointerException();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ﴢ\ue3b1쀄ꚬ蝜旧䩥⬌প\uee39쳗괬鏴炕儣㞦ᑞ\ufafc\udb65렍麡缵嶅䉻⃧Ɣ\ue62c쒽ꕊ讪桩䤏\u2feb఼\uf2d8퍀뇺雂眔喪㩑ᣗ怒\ude56볗", 7829 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.dh.ri(sb.toString(), e);
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ, reason: contains not printable characters */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(this.getOutputMinFrameDuration.getHighSpeedVideoSizes());
        int i = getHighSpeedVideoSizes + 43;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return mzVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mj
    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.io.InputStream mo26280() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.dh.ba baVar = this.getOutputMinFrameDuration;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 21) % 128;
        return baVar;
    }

    ab(util.h.xy.dh.ba baVar) {
        this.getOutputMinFrameDuration = baVar;
    }
}
