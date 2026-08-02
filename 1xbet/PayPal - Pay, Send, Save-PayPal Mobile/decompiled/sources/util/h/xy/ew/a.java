package util.h.xy.ew;

/* loaded from: classes18.dex */
public abstract class a implements util.h.xy.ew.rb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private util.h.xy.ed.a Camera2StreamConfigurationMap;

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.ed.a m26723() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 89) + (i | 89);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return this.Camera2StreamConfigurationMap;
        }
        throw null;
    }

    public a(util.h.xy.ed.a aVar) {
        this.Camera2StreamConfigurationMap = aVar;
    }
}
