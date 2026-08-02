package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class me extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputSizeshNQ4ISI;
    private util.h.xy.dh.rk getOutputFormats;
    private util.h.xy.dh.rk getOutputMinFrameDuration;
    private static char[] Camera2StreamConfigurationMap = {40003, 51515, 14035, 39984, 51481, 13991, 40004, 51548, 14000, 40028, 51631, 13991, 39991, 51703, 13980, 39997, 51679, 14187, 39955, 51631, 14191, 39999, 51645, 14154, 40166, 51672, 14111, 42102, 61712, 3814, 42063, 61756, 3728, 42106, 61744, 3726, 42104, 61950, 3774, 42011, 61897, 3811, 42008, 61926, 3933, 42111, 61850, 3916, 42025};
    private static long getHighSpeedVideoFpsRanges = -3608483123644872358L;

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 15;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 % 1;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        objArr[0] = str;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        if (this.getOutputFormats != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 0, this.getOutputFormats));
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 47) % 128;
        }
        if (this.getOutputMinFrameDuration != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 1, this.getOutputMinFrameDuration));
        }
        return new util.h.xy.dh.aa(dVar);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dj.me m26388(java.lang.Object obj) {
        int i = (getHighSpeedVideoSizes + 79) % 128;
        getInputSizeshNQ4ISI = i;
        if (obj instanceof util.h.xy.dj.me) {
            return (util.h.xy.dj.me) obj;
        }
        if (obj != null) {
            return new util.h.xy.dj.me(util.h.xy.dh.l.m26303(obj));
        }
        int i2 = i + 91;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dj.me m26389(util.h.xy.dh.mm mmVar, boolean z) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 49) % 128;
        util.h.xy.dj.me m26388 = m26388(util.h.xy.dh.l.m26304(mmVar, z));
        int i = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m26388;
        }
        throw null;
    }

    private me(util.h.xy.dh.l lVar) {
        util.h.xy.dh.mm mmVar;
        int mo26286 = lVar.mo26286();
        if (mo26286 != 0) {
            if (mo26286 == 1) {
                mmVar = (util.h.xy.dh.mm) lVar.mo26287(0);
                int m26330 = mmVar.m26330();
                if (m26330 == 0) {
                    this.getOutputFormats = util.h.xy.dh.rk.m26340(mmVar, false);
                    return;
                }
                if (m26330 != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(28 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), android.view.ViewConfiguration.getPressedStateDuration() >> 16, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(mmVar.m26330());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            } else {
                if (mo26286 != 2) {
                    float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 21, 27 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.graphics.Color.alpha(0) + 14392), objArr2);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                }
                this.getOutputFormats = util.h.xy.dh.rk.m26340((util.h.xy.dh.mm) lVar.mo26287(0), false);
                mmVar = (util.h.xy.dh.mm) lVar.mo26287(1);
            }
            this.getOutputMinFrameDuration = util.h.xy.dh.rk.m26340(mmVar, false);
        }
    }
}
