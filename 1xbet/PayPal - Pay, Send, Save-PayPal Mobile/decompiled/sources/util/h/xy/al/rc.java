package util.h.xy.al;

/* loaded from: classes5.dex */
public final class rc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25020(java.lang.String str, java.lang.String str2) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 71) + ((i & 71) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25021(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoSizes + 13;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25018(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 63) + (i | 63);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m25019(java.lang.Throwable th) {
        int i;
        int i2;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 105) % 128;
        int i3 = 0;
        while (th != null) {
            int i4 = getHighSpeedVideoSizes + 91;
            int i5 = i4 % 128;
            Camera2StreamConfigurationMap = i5;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i3 >= 50) {
                break;
            }
            int i6 = (i5 ^ 111) + ((i5 & 111) << 1);
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                stringBuffer.append(util.h.xy.al.ra.f650);
                stringBuffer.append(th.getMessage());
                th = th.getCause();
                i = i3 ^ 99;
                i2 = i3 & 99;
            } else {
                stringBuffer.append(util.h.xy.al.ra.f650);
                stringBuffer.append(th.getMessage());
                th = th.getCause();
                i = i3 ^ 1;
                i2 = i3 & 1;
            }
            i3 = (i2 << 1) + i;
        }
        java.lang.String obj = stringBuffer.toString();
        int i7 = Camera2StreamConfigurationMap + 55;
        getHighSpeedVideoSizes = i7 % 128;
        if (i7 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m25022(java.lang.Throwable th) {
        int i = Camera2StreamConfigurationMap + 15;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        try {
            if (i % 2 != 0) {
                throw null;
            }
            if (th != null) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                th.printStackTrace(new java.io.PrintWriter(stringWriter));
                java.lang.String obj = stringWriter.toString();
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 109) % 128;
                return obj;
            }
            int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                return "";
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception unused) {
            return util.h.xy.al.ra.f669;
        }
    }
}
