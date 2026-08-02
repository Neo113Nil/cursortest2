package util.h.xy.eb;

/* loaded from: classes18.dex */
public class a extends util.h.xy.dh.mh implements util.h.xy.eb.c {
    private util.h.xy.eu.mb getHighSpeedVideoFpsRanges;
    private util.h.xy.eb.b getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputFormats;
    private java.math.BigInteger getInputSizeshNQ4ISI;
    private util.h.xy.eb.mb getOutputMinFrameDuration;
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(1);
    private static int getHighSpeedVideoSizes = 1;
    private static int Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 59) % 128;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(6);
        dVar.m26290(new util.h.xy.dh.f(getHighResolutionOutputSizeshNQ4ISI));
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        dVar.m26290(new util.h.xy.eb.ra(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor));
        dVar.m26290(this.getOutputMinFrameDuration);
        dVar.m26290(new util.h.xy.dh.f(this.getInputSizeshNQ4ISI));
        if (this.getInputFormats != null) {
            dVar.m26290(new util.h.xy.dh.f(this.getInputFormats));
            int i = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (((i | 49) << 1) - (i ^ 49)) % 128;
        }
        return new util.h.xy.dh.aa(dVar);
    }
}
