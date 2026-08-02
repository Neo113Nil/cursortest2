package util.h.xy.cq;

/* loaded from: classes5.dex */
public class rb implements util.h.xy.ck.a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private final util.h.xy.cq.me getHighSpeedVideoFpsRangesFor;
    private util.h.xy.cq.a getInputFormats;
    private boolean getOutputMinFrameDuration = false;
    private util.h.xy.cl.b getHighSpeedVideoSizes = null;
    private byte[] getHighResolutionOutputSizeshNQ4ISI = null;

    static {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    rb(util.h.xy.cq.me meVar) {
        this.getHighSpeedVideoFpsRangesFor = meVar;
    }

    final void getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.ck.rc {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 105) + ((i & 105) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.cv.ra.m26066(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.cv.ra.m26066(this.getHighResolutionOutputSizeshNQ4ISI);
        util.h.xy.cq.a aVar = this.getInputFormats;
        if (aVar != null) {
            aVar.getHighSpeedVideoFpsRangesFor();
        }
        this.getHighSpeedVideoSizes = null;
        util.h.xy.cq.me meVar = this.getHighSpeedVideoFpsRangesFor;
        if (meVar != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 51) % 128;
            meVar.m26015();
            int i3 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (((i3 | 59) << 1) - (i3 ^ 59)) % 128;
        }
        int i4 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i4 | 53) << 1) - (i4 ^ 53)) % 128;
    }
}
