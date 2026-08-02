package util.h.xy.ch;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m25927(java.lang.Throwable th) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 1) + ((i & 1) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (th == null) {
            Camera2StreamConfigurationMap = (((i2 | 89) << 1) - (i2 ^ 89)) % 128;
            return "";
        }
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (java.lang.Exception unused) {
            return util.h.xy.al.ra.f669;
        }
    }
}
