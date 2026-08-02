package util.h.xy.k;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.d.c m26925() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 85) % 128;
        util.h.xy.m.mb m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 121) << 1) - (i ^ 121);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return m26975;
        }
        throw null;
    }
}
