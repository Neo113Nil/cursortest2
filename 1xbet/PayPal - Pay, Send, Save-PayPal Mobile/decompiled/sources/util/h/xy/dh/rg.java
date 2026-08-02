package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rg extends util.h.xy.dh.mi {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes = 0;
    private static int getInputFormats = 1;
    private static char[] getInputSizeshNQ4ISI;
    private final util.h.xy.dh.rf getOutputFormats;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRanges = new util.h.xy.dh.p(util.h.xy.dh.rg.class) { // from class: util.h.xy.dh.rg.1
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
                util.h.xy.dh.rg rgVar = new util.h.xy.dh.rg((util.h.xy.dh.rf) util.h.xy.dh.rf.getHighSpeedVideoSizes.getHighSpeedVideoSizes(lVar));
                int i = getHighSpeedVideoSizes + 21;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 != 0) {
                    return rgVar;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                util.h.xy.dh.rg rgVar = new util.h.xy.dh.rg((util.h.xy.dh.rf) util.h.xy.dh.rf.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(mzVar));
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i & 35) + (i | 35)) % 128;
                return rgVar;
            }
        };
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
    }

    static util.h.xy.dh.rg getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        util.h.xy.dh.rg rgVar = new util.h.xy.dh.rg(util.h.xy.dh.rf.getHighSpeedVideoSizes(bArr));
        int i = getHighResolutionOutputSizeshNQ4ISI + 59;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return rgVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 39) % 128;
        int hashCode = this.getOutputFormats.hashCode();
        int i = getHighResolutionOutputSizeshNQ4ISI + 1;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return ~hashCode;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 81;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (!(miVar instanceof util.h.xy.dh.rg)) {
            return false;
        }
        boolean highSpeedVideoFpsRanges = this.getOutputFormats.getHighSpeedVideoFpsRanges(((util.h.xy.dh.rg) miVar).getOutputFormats);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 7;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 93) % 128;
        util.h.xy.dh.rf rfVar = (util.h.xy.dh.rf) this.getOutputFormats.getHighSpeedVideoFpsRangesFor();
        if (rfVar != this.getOutputFormats) {
            return new util.h.xy.dh.rg(rfVar);
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 69;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.rg rgVar;
        util.h.xy.dh.rf rfVar = (util.h.xy.dh.rf) this.getOutputFormats.Camera2StreamConfigurationMap();
        if (rfVar == this.getOutputFormats) {
            int i = getInputFormats + 19;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            rgVar = this;
        } else {
            rgVar = new util.h.xy.dh.rg(rfVar);
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 105;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return rgVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 39) % 128;
        rjVar.getHighSpeedVideoSizes(z, 7);
        this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI(rjVar, false);
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 3) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getInputFormats + 111;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            this.getOutputFormats.getHighSpeedVideoFpsRanges(z);
            throw null;
        }
        int highSpeedVideoFpsRanges = this.getOutputFormats.getHighSpeedVideoFpsRanges(z);
        int i2 = getInputFormats + 3;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 61;
        getInputFormats = i % 128;
        return i % 2 == 0;
    }

    public rg(util.h.xy.dh.rf rfVar) {
        if (rfVar != null) {
            this.getOutputFormats = rfVar;
            return;
        }
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        char c = (char) (15035 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
        int i = (edgeSlop >> 16) + 34;
        int i2 = tapTimeout >> 16;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        int i3 = getHighSpeedVideoFpsRangesFor + 67;
        Camera2StreamConfigurationMap = i3 % 128;
        int i4 = i3 % 2;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 65) % 128;
            jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        throw new java.lang.NullPointerException(new java.lang.String(cArr).intern());
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputSizeshNQ4ISI = new char[]{42652, 42187, 41726, 41214, 44694, 44198, 43685, 43172, 46683, 46193, 45670, 45086, 48688, 48165, 47669, 47580, 34805, 34286, 33752, 33229, 36784, 36256, 35673, 35147, 38756, 38157, 37711, 37183, 40742, 39569, 39113, 59104, 58519, 57989};
        getHighSpeedVideoSizes = -3796362722136318445L;
    }
}
