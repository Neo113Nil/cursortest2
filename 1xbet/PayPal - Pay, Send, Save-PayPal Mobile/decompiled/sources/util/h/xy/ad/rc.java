package util.h.xy.ad;

/* loaded from: classes5.dex */
final class rc {
    static int getHighResolutionOutputSizeshNQ4ISI = 0;
    static int getHighSpeedVideoFpsRanges = 1;
    private static java.util.Hashtable<java.lang.String, java.lang.Integer> getOutputMinFrameDuration;
    int Camera2StreamConfigurationMap;
    util.h.xy.ad.b getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    byte[] getInputSizeshNQ4ISI;

    static {
        java.util.Hashtable<java.lang.String, java.lang.Integer> hashtable = new java.util.Hashtable<>();
        getOutputMinFrameDuration = hashtable;
        hashtable.put(util.h.xy.al.ra.f354, 64);
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 45) + (i | 45)) % 128;
    }

    private rc(util.h.xy.ad.b bVar, int i) {
        this.getHighSpeedVideoFpsRangesFor = bVar;
        this.Camera2StreamConfigurationMap = bVar.getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizesFor = i;
        this.getInputSizeshNQ4ISI = new byte[i];
        this.getHighSpeedVideoSizes = new byte[i];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rc(util.h.xy.ad.b bVar) {
        this(bVar, 64);
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 1) + (i | 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 91) + (i | 91)) % 128;
        ((util.h.xy.ad.ma) bVar).getHighSpeedVideoSizes();
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i2 | 41) << 1) - (i2 ^ 41)) % 128;
    }
}
