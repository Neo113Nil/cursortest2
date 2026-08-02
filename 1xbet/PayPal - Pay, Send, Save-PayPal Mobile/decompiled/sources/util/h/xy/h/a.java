package util.h.xy.h;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.nio.charset.Charset f2221 = java.nio.charset.Charset.forName(util.h.xy.al.ra.f459);

    static {
        int i = getHighSpeedVideoFpsRangesFor + 73;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
