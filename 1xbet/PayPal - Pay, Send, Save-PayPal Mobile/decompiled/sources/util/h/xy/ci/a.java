package util.h.xy.ci;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final util.h.xy.ci.a getHighSpeedVideoFpsRanges = new util.h.xy.ci.a();
    private static int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes = false;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 101) + ((i & 101) << 1)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ci.a m25928() {
        int i = getHighSpeedVideoFpsRangesFor + 91;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    private a() {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25929() throws util.h.xy.ci.ma {
        synchronized (this) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | 117) << 1) - (i ^ 117);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                getHighSpeedVideoSizes();
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
            } else {
                getHighSpeedVideoSizes();
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static void getHighSpeedVideoSizes() throws util.h.xy.ci.ma {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        try {
            try {
                util.h.xy.ct.rc.m26047().mo26036();
                util.h.xy.cs.b m26021 = util.h.xy.cs.a.m26021();
                m26021.mo26022();
                m26021.mo26027(null, null);
                util.h.xy.cr.ra.m26020(null);
                util.h.xy.cr.ra.m26019(util.h.xy.ct.mb.f1127);
                util.h.xy.ci.ra.m25931().m25935();
                int i = getHighSpeedVideoFpsRangesFor + 79;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 3;
                }
                util.h.xy.ck.ra.f1116.m25950();
                int i3 = getHighSpeedVideoFpsRangesFor + 111;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            } catch (util.h.xy.ct.mc unused) {
                throw new util.h.xy.ci.ma(util.h.xy.al.ra.f517);
            }
        } catch (java.lang.Throwable th) {
            util.h.xy.cr.ra.m26020(null);
            util.h.xy.cr.ra.m26019(util.h.xy.ct.mb.f1127);
            util.h.xy.ci.ra.m25931().m25935();
            throw th;
        }
    }
}
