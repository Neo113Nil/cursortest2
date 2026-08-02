package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ae extends util.h.xy.dh.rk {
    private static int Camera2StreamConfigurationMap = 1;
    private static byte[] getHighSpeedVideoFpsRanges = {-14, 82, 78, -99, 76, 16, 35, -32, -98, 77, 76, -29, 60, -35, 74, com.google.common.base.Ascii.SYN, 36, 76, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -27, 71, -11, 84, 84, 14, 35, -25, -104, 73, 72, -102, 60, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -32, 73, 86, -25, 87, -26, 72, 10, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 80, 125, 78, 82, 78};
    private static int getHighSpeedVideoSizes;
    private int getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.rk, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 97) % 128;
        int i2 = i + 19;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.rk, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = Camera2StreamConfigurationMap + 79;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            boolean z = this.f1211;
            throw new java.lang.ArithmeticException();
        }
        if (!this.f1211) {
            return super.Camera2StreamConfigurationMap();
        }
        int i2 = Camera2StreamConfigurationMap + 105;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 5;
        }
        return this;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        rjVar.getHighSpeedVideoSizes(z, 49);
        util.h.xy.dh.z highResolutionOutputSizeshNQ4ISI = rjVar.getHighResolutionOutputSizeshNQ4ISI();
        int length = this.f1212.length;
        int i = 0;
        if (this.getHighSpeedVideoFpsRangesFor < 0) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = i2 + 49;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0 ? length <= 16 : length <= 64) {
                util.h.xy.dh.mi[] miVarArr = new util.h.xy.dh.mi[length];
                getHighSpeedVideoSizes = (i2 + 29) % 128;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    util.h.xy.dh.mi Camera2StreamConfigurationMap2 = this.f1212[i5].mo26279().Camera2StreamConfigurationMap();
                    miVarArr[i5] = Camera2StreamConfigurationMap2;
                    i4 += Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRanges(true);
                }
                this.getHighSpeedVideoFpsRangesFor = i4;
                rjVar.getHighSpeedVideoFpsRanges(i4);
                int i6 = getHighSpeedVideoSizes + 91;
                while (true) {
                    Camera2StreamConfigurationMap = i6 % 128;
                    if (i >= length) {
                        return;
                    }
                    miVarArr[i].getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
                    i++;
                    i6 = getHighSpeedVideoSizes + 99;
                }
            }
        }
        rjVar.getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes());
        while (i < length) {
            this.f1212[i].mo26279().Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
            i++;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 21;
        Camera2StreamConfigurationMap = i % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, getHighSpeedVideoSizes());
        if (i % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw new java.lang.ArithmeticException();
    }

    private int getHighSpeedVideoSizes() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor < 0) {
            int length = this.f1212.length;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 73) % 128;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f1212[i2].mo26279().Camera2StreamConfigurationMap().getHighSpeedVideoFpsRanges(true);
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            int i3 = getHighSpeedVideoSizes + 29;
            Camera2StreamConfigurationMap = i3 % 128;
            int i4 = i3 % 2;
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(util.h.xy.dh.c[] cVarArr, byte b) {
        super(true, cVarArr);
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 55) % 128;
        Camera2StreamConfigurationMap = (i + 29) % 128;
        this.getHighSpeedVideoFpsRangesFor = -1;
    }

    public ae(util.h.xy.dh.c[] cVarArr) {
        super(cVarArr, true);
        this.getHighSpeedVideoFpsRangesFor = -1;
    }

    public ae(util.h.xy.dh.d dVar) {
        super(dVar, true);
        this.getHighSpeedVideoFpsRangesFor = -1;
    }

    public ae(util.h.xy.dh.c cVar) {
        super(cVar);
        this.getHighSpeedVideoFpsRangesFor = -1;
    }

    public ae() {
        this.getHighSpeedVideoFpsRangesFor = -1;
    }
}
