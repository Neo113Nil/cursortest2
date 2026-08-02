package util.h.xy.cb;

/* loaded from: classes5.dex */
public class ra {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 34;

    static {
        int i = 34 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m25859(java.lang.String str, java.lang.String str2) {
        java.lang.Exception e;
        java.io.InputStream inputStream;
        java.io.IOException e2;
        java.io.FileNotFoundException e3;
        ?? r0 = 0;
        try {
            try {
                android.content.res.AssetManager assets = util.h.xy.ag.a.m24556().m24558().getAssets();
                java.util.Properties properties = new java.util.Properties();
                inputStream = assets.open(str);
                try {
                    properties.load(inputStream);
                    java.lang.String property = properties.getProperty(str2);
                    if (property != null) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                        property = property.trim();
                        int i = getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRangesFor = ((i & 51) + (i | 51)) % 128;
                    }
                    if (inputStream != null) {
                        int i2 = getHighSpeedVideoSizes;
                        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
                        getHighSpeedVideoFpsRangesFor = i3 % 128;
                        try {
                            if (i3 % 2 == 0) {
                                inputStream.close();
                                throw new java.lang.ArithmeticException();
                            }
                            inputStream.close();
                            int i4 = getHighSpeedVideoSizes;
                            getHighSpeedVideoFpsRangesFor = (((i4 | 9) << 1) - (i4 ^ 9)) % 128;
                        } catch (java.io.IOException unused) {
                        }
                    }
                    return property;
                } catch (java.io.FileNotFoundException e4) {
                    e3 = e4;
                    e3.getMessage();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    int i5 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoSizes = ((i5 & 57) + (i5 | 57)) % 128;
                    return null;
                } catch (java.io.IOException e5) {
                    e2 = e5;
                    e2.getMessage();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            int i6 = getHighSpeedVideoFpsRangesFor;
                            int i7 = (i6 ^ 65) + ((i6 & 65) << 1);
                            getHighSpeedVideoSizes = i7 % 128;
                            int i8 = i7 % 2;
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    return null;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    e.getMessage();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                r0 = str;
                th = th;
                if (r0 != 0) {
                    try {
                        r0.close();
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                    } catch (java.io.IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e7) {
            e3 = e7;
            inputStream = null;
        } catch (java.io.IOException e8) {
            e2 = e8;
            inputStream = null;
        } catch (java.lang.Exception e9) {
            e = e9;
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r0 != 0) {
            }
            throw th;
        }
    }
}
