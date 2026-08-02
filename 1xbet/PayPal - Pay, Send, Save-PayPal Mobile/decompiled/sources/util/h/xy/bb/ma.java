package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class ma implements java.util.Observer {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private final util.h.xy.bv.b.ma getHighSpeedVideoFpsRanges;

    public ma(util.h.xy.bv.b.ma maVar) {
        this.getHighSpeedVideoFpsRanges = maVar;
    }

    @Override // java.util.Observer
    public final void update(java.util.Observable observable, java.lang.Object obj) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 9) + ((i & 9) << 1);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if ((observable instanceof util.h.xy.bv.b) && (obj instanceof util.h.xy.bv.b.ma.EnumC0265b)) {
            int i4 = (((i3 | 125) << 1) - (i3 ^ 125)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            util.h.xy.bv.b.ma maVar = this.getHighSpeedVideoFpsRanges;
            if (maVar != null) {
                Camera2StreamConfigurationMap = ((i4 ^ 15) + ((i4 & 15) << 1)) % 128;
                maVar.onUpdate((util.h.xy.bv.b.ma.EnumC0265b) obj);
                int i5 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i5 ^ 49) + ((i5 & 49) << 1)) % 128;
            }
        }
        int i6 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i6 | 109) << 1) - (i6 ^ 109)) % 128;
    }
}
