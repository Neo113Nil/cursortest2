package util.h.xy.s;

/* loaded from: classes5.dex */
public final class d {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27184(java.lang.String str) {
        int i = Camera2StreamConfigurationMap + 95;
        getHighSpeedVideoSizes = i % 128;
        byte[] m25076 = util.h.xy.ar.b.m25076(str);
        if (i % 2 == 0) {
            return m25076;
        }
        throw new java.lang.ArithmeticException();
    }
}
