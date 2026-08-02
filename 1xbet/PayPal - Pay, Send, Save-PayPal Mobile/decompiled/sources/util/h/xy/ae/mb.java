package util.h.xy.ae;

/* loaded from: classes5.dex */
public final class mb implements util.h.xy.ae.c {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;

    @Override // util.h.xy.ae.c, util.h.xy.ai.b.a.ra
    public final int callback(com.sun.jna.Pointer pointer) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = 1;
        int i3 = (i ^ 9) + ((i & 9) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            pointer.setLong(1L, android.os.SystemClock.elapsedRealtime());
        } else {
            pointer.setLong(0L, android.os.SystemClock.elapsedRealtime());
            i2 = 0;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 33) % 128;
        return i2;
    }
}
