package util.h.xy.al;

/* loaded from: classes5.dex */
public class e {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;

    static {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i & 89) + (i | 89)) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m25006() {
        int i = getHighSpeedVideoSizes + 75;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            if (util.h.xy.ag.a.m24556().m24558() != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 83) % 128;
                return null;
            }
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ag.a.m24556().m24558();
        throw new java.lang.ArithmeticException();
    }
}
