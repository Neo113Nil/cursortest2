package util.h.xy.du;

/* loaded from: classes18.dex */
public final class rc extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getOutputFormats = 1;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputFormats;
    private static char[] getHighSpeedVideoFpsRanges = {40003, 4411, 34515, 13360, 43294, 24227, 52306, 16649, 63164, 25692, 6636, 36493, 15461, 45549, 9874, 54318, 18900, 65328, 27719};
    private static long getHighSpeedVideoSizes = 4913870464418910554L;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(new util.h.xy.dh.f(m26423()));
        dVar.m26290(new util.h.xy.dh.f(m26422()));
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.math.BigInteger m26422() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 97;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return this.getInputFormats;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.math.BigInteger m26423() {
        int i = (getOutputFormats + 41) % 128;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizesFor;
        getHighResolutionOutputSizeshNQ4ISI = i;
        return bigInteger;
    }

    private rc(util.h.xy.dh.l lVar) {
        if (lVar.mo26286() == 2) {
            java.util.Enumeration mo26285 = lVar.mo26285();
            this.getHighSpeedVideoSizesFor = util.h.xy.dh.f.m26291(mo26285.nextElement()).m26294();
            this.getInputFormats = util.h.xy.dh.f.m26291(mo26285.nextElement()).m26294();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int axisFromString = android.view.MotionEvent.axisFromString("");
        int argb = android.graphics.Color.argb(0, 0, 0, 0);
        char c = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i = axisFromString + 20;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 117) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = ((rbVar.f2651 * (getHighSpeedVideoSizes ^ 3446303986615426049L)) ^ ((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + argb] ^ 3446303986615426049L))) ^ c;
            rbVar.f2651++;
            argb = argb;
        }
        char[] cArr = new char[i];
        int i2 = 0;
        while (true) {
            rbVar.f2651 = i2;
            if (rbVar.f2651 >= i) {
                objArr[0] = new java.lang.String(cArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(lVar.mo26286());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            int i3 = Camera2StreamConfigurationMap + 25;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i2 = rbVar.f2651;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i2 = rbVar.f2651 + 1;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.du.rc m26421(java.lang.Object obj) {
        if (obj instanceof util.h.xy.du.rc) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 87;
            getOutputFormats = i % 128;
            util.h.xy.du.rc rcVar = (util.h.xy.du.rc) obj;
            if (i % 2 != 0) {
                return rcVar;
            }
            throw null;
        }
        if (obj != null) {
            return new util.h.xy.du.rc(util.h.xy.dh.l.m26303(obj));
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 111;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
