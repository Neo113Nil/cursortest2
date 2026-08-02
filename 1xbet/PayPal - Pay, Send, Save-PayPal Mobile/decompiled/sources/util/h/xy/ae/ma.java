package util.h.xy.ae;

/* loaded from: classes5.dex */
public final class ma implements util.h.xy.ae.ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r3 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r3 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        r7 = util.h.xy.ae.ma.getHighSpeedVideoSizes;
        util.h.xy.ae.ma.getHighResolutionOutputSizeshNQ4ISI = ((r7 & 97) + (r7 | 97)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        r3 = r0;
        r7.write(0L, r3, 0, r3.length);
        util.h.xy.ae.ma.getHighSpeedVideoSizes = (util.h.xy.ae.ma.getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        return 0;
     */
    @Override // util.h.xy.ae.ra, util.h.xy.ai.b.ra.InterfaceC0257ra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int callback(com.sun.jna.Pointer pointer, com.sun.jna.Pointer pointer2) {
        byte[] bytes;
        int i = getHighSpeedVideoSizes + 119;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            bytes = android.provider.Settings.Secure.getString(util.h.xy.ag.a.m24556().m24558().getContentResolver(), util.h.xy.al.ra.f425).getBytes();
            int i2 = pointer2.getInt(1L);
            pointer2.setInt(0L, bytes.length);
        } else {
            bytes = android.provider.Settings.Secure.getString(util.h.xy.ag.a.m24556().m24558().getContentResolver(), util.h.xy.al.ra.f425).getBytes();
            int i3 = pointer2.getInt(0L);
            pointer2.setInt(0L, bytes.length);
        }
    }
}
