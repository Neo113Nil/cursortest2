package util.h.xy.az;

/* loaded from: classes5.dex */
public class ra {

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.lang.String f914 = "ra";
    private byte[] Camera2StreamConfigurationMap;
    private java.net.HttpURLConnection getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private long getInputFormats;
    private int getInputSizeshNQ4ISI;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 89) % 128;

    private ra() {
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = -1L;
        this.getHighSpeedVideoFpsRangesFor = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
    }

    public ra(java.net.HttpURLConnection httpURLConnection) {
        this();
        this.getHighSpeedVideoFpsRanges = httpURLConnection;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m25277(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 113) + (i | 113)) % 128;
        boolean equalsIgnoreCase = util.h.xy.al.ra.f470.equalsIgnoreCase(str);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 101;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return equalsIgnoreCase;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m25278(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        java.lang.String str2 = util.h.xy.al.ra.f492;
        if (i2 % 2 != 0) {
            return str2.equalsIgnoreCase(str);
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public int m25281() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 125) << 1) - (i ^ 125);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.getInputSizeshNQ4ISI;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i4 = ~identityHashCode;
        int i5 = -(-((~((398420121 ^ i4) | (i4 & 398420121))) * (-560)));
        int i6 = (i5 & 1905941794) + (i5 | 1905941794);
        int i7 = -(-((~((identityHashCode ^ 532674815) | (identityHashCode & 532674815))) * (-560)));
        int i8 = ~(i4 | (-480032887));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i9 = (identityHashCode2 ^ (-1305509984)) | (identityHashCode2 & (-1305509984));
        int i10 = ((i9 ^ (-933569176)) | (i9 & (-933569176))) * (-381);
        int i11 = (i10 ^ 1237391516) + ((i10 & 1237391516) << 1);
        int i12 = ~identityHashCode2;
        int i13 = ~((i12 ^ (-1305509984)) | (i12 & (-1305509984)));
        int i14 = ((i13 ^ 841294464) | (i13 & 841294464) | 1213235272) * 381;
        if (((((i6 | i7) << 1) - (i7 ^ i6)) - (~(((345778192 ^ i8) | (i8 & 345778192)) * 560))) - 1 > (i11 & i14) + (i14 | i11) + 796926523) {
            return i3;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m25280() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 59) % 128;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (bArr != null) {
            int i2 = (i ^ 35) + ((i & 35) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length > 0) {
                getHighResolutionOutputSizeshNQ4ISI = (i + 47) % 128;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                int i3 = getHighSpeedVideoSizes;
                int i4 = ((i3 | 77) << 1) - (i3 ^ 77);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    return copyOf;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        byte[] bArr2 = new byte[0];
        int i5 = getHighResolutionOutputSizeshNQ4ISI;
        int i6 = (i5 & 3) + (i5 | 3);
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r1.hasNext() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r2 = util.h.xy.az.ra.getHighResolutionOutputSizeshNQ4ISI;
        util.h.xy.az.ra.getHighSpeedVideoSizes = ((r2 & 31) + (r2 | 31)) % 128;
        r2 = r1.next();
        r3 = r2.getKey();
        r2 = r2.getValue();
        r2 = util.h.xy.az.ra.getHighSpeedVideoSizes + 27;
        util.h.xy.az.ra.getHighResolutionOutputSizeshNQ4ISI = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r4.getInputFormats = r4.getHighSpeedVideoFpsRanges.getContentLength();
        r1 = getHighSpeedVideoFpsRangesFor();
        r4.Camera2StreamConfigurationMap = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r2 = util.h.xy.az.ra.getHighSpeedVideoSizes + 13;
        util.h.xy.az.ra.getHighResolutionOutputSizeshNQ4ISI = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.length <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        new java.lang.String(r1, java.nio.charset.StandardCharsets.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r4.getInputFormats >= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r4.Camera2StreamConfigurationMap == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r1 = util.h.xy.az.ra.getHighResolutionOutputSizeshNQ4ISI;
        util.h.xy.az.ra.getHighSpeedVideoSizes = (((r1 | 47) << 1) - (r1 ^ 47)) % 128;
        r4.getInputFormats = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        util.h.xy.az.ra.getHighSpeedVideoSizes = (util.h.xy.az.ra.getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0026, code lost:
    
        if (r1 == 200) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 == 19615) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b2, code lost:
    
        r1 = new util.h.xy.az.ma();
        r1.m25273(r4.getInputSizeshNQ4ISI);
        r1.m25274(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00bf, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        Camera2StreamConfigurationMap();
        r1 = r4.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25279() throws java.io.IOException, util.h.xy.az.ma {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 61) + (i | 61);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            int responseCode = this.getHighSpeedVideoFpsRanges.getResponseCode();
            this.getInputSizeshNQ4ISI = responseCode;
        } else {
            int responseCode2 = this.getHighSpeedVideoFpsRanges.getResponseCode();
            this.getInputSizeshNQ4ISI = responseCode2;
        }
    }

    @util.h.xy.a.a
    private byte[] getHighSpeedVideoFpsRangesFor() throws java.io.IOException, util.h.xy.az.ma {
        this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getResponseCode();
        Camera2StreamConfigurationMap();
        byte[] bArr = null;
        try {
            java.io.InputStream inputStream = this.getHighSpeedVideoFpsRanges.getInputStream();
            if (inputStream != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 69) % 128;
                try {
                    bArr = getHighSpeedVideoFpsRanges(inputStream);
                    util.h.xy.az.c.m25265(inputStream);
                    int i = getHighSpeedVideoSizes;
                    int i2 = (i ^ 31) + ((i & 31) << 1);
                    getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 4 / 3;
                    }
                } catch (java.io.IOException unused) {
                    util.h.xy.az.c.m25265(inputStream);
                } catch (java.lang.Throwable th) {
                    util.h.xy.az.c.m25265(inputStream);
                    throw th;
                }
                int i4 = getHighSpeedVideoSizes + 109;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                }
            }
        } catch (java.io.IOException unused2) {
            java.io.InputStream errorStream = this.getHighSpeedVideoFpsRanges.getErrorStream();
            if (errorStream != null) {
                try {
                    bArr = getHighSpeedVideoFpsRanges(errorStream);
                } catch (java.io.IOException unused3) {
                } catch (java.lang.Throwable th2) {
                    util.h.xy.az.c.m25265(errorStream);
                    throw th2;
                }
                util.h.xy.az.c.m25265(errorStream);
            }
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    private static byte[] getHighSpeedVideoFpsRanges(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(1024);
        int read = inputStream.read(bArr);
        while (read != -1) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = ((i ^ 31) + ((i & 31) << 1)) % 128;
            try {
                try {
                    byteArrayOutputStream.write(bArr, 0, read);
                    read = inputStream.read(bArr);
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 97) % 128;
                } catch (java.lang.OutOfMemoryError e) {
                    throw new java.io.IOException(util.h.xy.al.ra.f274, e);
                }
            } catch (java.lang.Throwable th) {
                getHighResolutionOutputSizeshNQ4ISI(byteArrayOutputStream);
                util.h.xy.az.c.m25265(byteArrayOutputStream);
                util.h.xy.az.c.m25265(inputStream);
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        getHighResolutionOutputSizeshNQ4ISI(byteArrayOutputStream);
        util.h.xy.az.c.m25265(byteArrayOutputStream);
        util.h.xy.az.c.m25265(inputStream);
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 & 71) + (i2 | 71)) % 128;
        return byteArray;
    }

    @util.h.xy.a.a
    private void Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 73) << 1) - (i ^ 73)) % 128;
        getHighSpeedVideoSizes = i2;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 23) % 128;
        int i3 = 0;
        while (true) {
            java.lang.String headerFieldKey = this.getHighSpeedVideoFpsRanges.getHeaderFieldKey(i3);
            java.lang.String headerField = this.getHighSpeedVideoFpsRanges.getHeaderField(i3);
            if (headerFieldKey == null) {
                break;
            }
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = (i4 ^ 83) + ((i4 & 83) << 1);
            int i6 = i5 % 128;
            getHighSpeedVideoSizes = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (headerField == null) {
                getHighResolutionOutputSizeshNQ4ISI = (((i6 | 81) << 1) - (i6 ^ 81)) % 128;
                break;
            } else {
                this.getHighSpeedVideoFpsRangesFor.put(headerFieldKey, headerField);
                int i7 = (i3 ^ (-8)) + ((i3 & (-8)) << 1);
                i3 = (i7 & 9) + (i7 | 9);
            }
        }
        int i8 = getHighSpeedVideoSizes + 69;
        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        int i = getHighSpeedVideoSizes + 99;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            util.h.xy.az.c.m25266(byteArray);
            byteArrayOutputStream.write(byteArray);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 63) % 128;
            int i2 = getHighSpeedVideoSizes + 39;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        util.h.xy.az.c.m25266(byteArray2);
        byteArrayOutputStream.write(byteArray2);
        throw new java.lang.NullPointerException();
    }
}
