package util.h.xy.aq;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private final java.util.List<util.h.xy.aq.ra> getHighResolutionOutputSizeshNQ4ISI;

    protected a(java.util.List<util.h.xy.aq.ra> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.aq.ra m25039(util.h.xy.aq.b bVar) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 3) % 128;
        java.util.Iterator<util.h.xy.aq.ra> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
            util.h.xy.aq.ra m25048 = it.next().m25048(bVar);
            if (m25048 != null) {
                int i = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = (i + 15) % 128;
                int i2 = i + 23;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    return m25048;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 & 95) + (i3 | 95);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
