package util.h.xy.y;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    static {
        int i = getHighSpeedVideoFpsRangesFor + 125;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m27701(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        java.io.File file = new java.io.File(filesDir, util.h.xy.al.ra.f504);
        java.io.File file2 = new java.io.File(filesDir, util.h.xy.al.ra.f512);
        if (file.exists()) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i | 87) << 1) - (i ^ 87)) % 128;
            file.delete();
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            int i4 = i3 % 2;
        }
        if (file2.exists()) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            file2.delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        if ((r4 % 2) == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27700(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        boolean z3 = true;
        Camera2StreamConfigurationMap = (((i3 | 41) << 1) - (i3 ^ 41)) % 128;
        java.io.File filesDir = context.getFilesDir();
        java.io.File file = new java.io.File(filesDir, util.h.xy.al.ra.f504);
        java.io.File file2 = new java.io.File(filesDir, util.h.xy.al.ra.f512);
        if (file.exists()) {
            int i4 = Camera2StreamConfigurationMap + 25;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                file2.exists();
                throw null;
            }
            if (file2.exists()) {
                int i5 = Camera2StreamConfigurationMap;
                int i6 = ((i5 & 77) + (i5 | 77)) % 128;
                getHighSpeedVideoFpsRangesFor = i6;
                Camera2StreamConfigurationMap = (i6 + 65) % 128;
                z = true;
                int i7 = getHighSpeedVideoFpsRangesFor;
                i = (i7 & 81) + (i7 | 81);
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                if (z) {
                    int i8 = ((i7 ^ 47) + ((i7 & 47) << 1)) % 128;
                    Camera2StreamConfigurationMap = i8;
                    getHighSpeedVideoFpsRangesFor = (i8 + 105) % 128;
                    byte[] m27427 = util.h.xy.t.mb.f2417.m27427();
                    byte[] m27455 = util.h.xy.t.mb.f2417.m27455();
                    if (m27427 != null && m27427.length > 0) {
                        int i9 = Camera2StreamConfigurationMap;
                        int i10 = i9 + 41;
                        getHighSpeedVideoFpsRangesFor = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        if (m27455 != null) {
                            int i11 = i9 + 113;
                            int i12 = i11 % 128;
                            getHighSpeedVideoFpsRangesFor = i12;
                            if (i11 % 2 == 0) {
                                int length = m27455.length;
                                throw new java.lang.ArithmeticException();
                            }
                            if (m27455.length > 0) {
                                int i13 = (((i12 | 105) << 1) - (i12 ^ 105)) % 128;
                                Camera2StreamConfigurationMap = i13;
                                int i14 = (i13 & 83) + (i13 | 83);
                                getHighSpeedVideoFpsRangesFor = i14 % 128;
                                int i15 = i14 % 2;
                                z2 = true;
                                i2 = getHighSpeedVideoFpsRangesFor + 21;
                                int i16 = i2 % 128;
                                Camera2StreamConfigurationMap = i16;
                                if (i2 % 2 == 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                                if (z2) {
                                    int i17 = i16 + 7;
                                    getHighSpeedVideoFpsRangesFor = i17 % 128;
                                }
                            }
                        }
                    }
                    z2 = false;
                    i2 = getHighSpeedVideoFpsRangesFor + 21;
                    int i162 = i2 % 128;
                    Camera2StreamConfigurationMap = i162;
                    if (i2 % 2 == 0) {
                    }
                }
                z3 = false;
                int i18 = getHighSpeedVideoFpsRangesFor + 125;
                Camera2StreamConfigurationMap = i18 % 128;
                if (i18 % 2 == 0) {
                    return z3;
                }
                throw null;
            }
        }
        z = false;
        int i72 = getHighSpeedVideoFpsRangesFor;
        i = (i72 & 81) + (i72 | 81);
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
        }
    }
}
