package util.h.xy.ae;

/* loaded from: classes5.dex */
public final class b implements util.h.xy.ae.a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    @Override // util.h.xy.ae.a, util.h.xy.ai.b.ma.mb
    public final int callback(com.sun.jna.Pointer pointer, com.sun.jna.Pointer pointer2, com.sun.jna.Pointer pointer3) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 15) + ((i & 15) << 1)) % 128;
        byte[] bytes = util.h.xy.ag.a.m24556().m24558().getDir(pointer.getString(0L), 0).getAbsolutePath().getBytes();
        pointer3.setInt(0L, bytes.length);
        int length = bytes.length;
        pointer2.write(0L, bytes, 0, bytes.length);
        int i2 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 & 27) + (i2 | 27)) % 128;
        return 0;
    }
}
