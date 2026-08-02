package util.h.xy.az;

/* loaded from: classes18.dex */
public class a {
    private static java.util.concurrent.ThreadPoolExecutor Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static util.h.xy.az.a getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = java.lang.Runtime.getRuntime().availableProcessors();
    private int getInputSizeshNQ4ISI = -1000;
    private int getInputFormats = -1000;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r9.m25272() >= 600) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r9.m25272() == 400) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.az.a aVar, util.h.xy.az.d dVar) {
        boolean z;
        boolean z2;
        util.h.xy.az.ma maVar;
        util.h.xy.az.ra raVar;
        int i = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
        getHighSpeedVideoFpsRanges = i;
        int i2 = (i & 7) + (i | 7);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            dVar.m25267();
            dVar.m25268();
            util.h.xy.bc.b.m25369();
            aVar.Camera2StreamConfigurationMap();
            aVar.getHighSpeedVideoSizes();
            throw null;
        }
        util.h.xy.az.b m25267 = dVar.m25267();
        util.h.xy.az.d.b m25268 = dVar.m25268();
        util.h.xy.bc.b m25369 = util.h.xy.bc.b.m25369();
        int Camera2StreamConfigurationMap2 = aVar.Camera2StreamConfigurationMap();
        long highSpeedVideoSizes = aVar.getHighSpeedVideoSizes();
        while (true) {
            try {
                raVar = m25369.m25370(m25267);
                try {
                    boolean highSpeedVideoFpsRangesFor = aVar.getHighSpeedVideoFpsRangesFor(raVar);
                    getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
                    z2 = highSpeedVideoFpsRangesFor;
                    maVar = null;
                } catch (org.json.JSONException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(util.h.xy.al.ra.f322);
                    sb.append(e);
                    throw new util.h.xy.az.ma(sb.toString(), 6);
                }
            } catch (util.h.xy.az.ma e2) {
                if (e2.m25271() != 5 && e2.m25271() != 4) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
                    if (e2.m25272() > 499) {
                        int i3 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 37) + (i3 | 37)) % 128;
                    }
                    if (e2.m25271() == 2) {
                        int i4 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRanges = ((i4 & 97) + (i4 | 97)) % 128;
                    }
                    int i5 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRanges = ((i5 & 77) + (i5 | 77)) % 128;
                    z = false;
                    z2 = z;
                    maVar = e2;
                    raVar = null;
                }
                z = true;
                z2 = z;
                maVar = e2;
                raVar = null;
            }
            int i6 = (Camera2StreamConfigurationMap2 ^ 25) + ((Camera2StreamConfigurationMap2 & 25) << 1);
            if (Camera2StreamConfigurationMap2 <= 0) {
                break;
            }
            int i7 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = ((i7 ^ 105) + ((i7 & 105) << 1)) % 128;
            if (!z2) {
                break;
            }
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
            Camera2StreamConfigurationMap2 = ((i6 | (-26)) << 1) - (i6 ^ (-26));
        }
        if (maVar != null) {
            m25267.m25256();
            m25268.mo25269(maVar);
        } else {
            m25267.m25256();
            m25268.mo25270(raVar);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 5) % 128;
        }
        int i8 = getHighResolutionOutputSizeshNQ4ISI;
        int i9 = (i8 ^ 39) + ((i8 & 39) << 1);
        getHighSpeedVideoFpsRanges = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private a() {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.az.a m25254() {
        if (getHighSpeedVideoFpsRangesFor == null) {
            synchronized (util.h.xy.az.mb.class) {
                getHighSpeedVideoFpsRangesFor = new util.h.xy.az.a();
                int i = getHighSpeedVideoSizes * 2;
                Camera2StreamConfigurationMap = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque());
            }
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25255(final util.h.xy.az.d dVar) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 119) + ((i & 119) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: util.h.xy.az.a.4
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getHighSpeedVideoSizes = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = getHighSpeedVideoSizes;
                    int i4 = ((i3 | 89) << 1) - (i3 ^ 89);
                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                    if (i4 % 2 == 0) {
                        util.h.xy.az.a.Camera2StreamConfigurationMap(util.h.xy.az.a.this, dVar);
                    } else {
                        util.h.xy.az.a.Camera2StreamConfigurationMap(util.h.xy.az.a.this, dVar);
                        throw new java.lang.ArithmeticException();
                    }
                }
            });
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        } else {
            Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: util.h.xy.az.a.4
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getHighSpeedVideoSizes = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = getHighSpeedVideoSizes;
                    int i4 = ((i3 | 89) << 1) - (i3 ^ 89);
                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                    if (i4 % 2 == 0) {
                        util.h.xy.az.a.Camera2StreamConfigurationMap(util.h.xy.az.a.this, dVar);
                    } else {
                        util.h.xy.az.a.Camera2StreamConfigurationMap(util.h.xy.az.a.this, dVar);
                        throw new java.lang.ArithmeticException();
                    }
                }
            });
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
            throw null;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(long j) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        try {
        } catch (java.lang.InterruptedException e) {
            e.getMessage();
        }
        if (i2 % 2 == 0) {
            java.lang.Thread.sleep(j);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 & 81) + (i3 | 81);
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        java.lang.Thread.sleep(j);
        throw new java.lang.NullPointerException();
    }

    private boolean getHighSpeedVideoFpsRangesFor(util.h.xy.az.ra raVar) throws org.json.JSONException {
        boolean equalsIgnoreCase;
        synchronized (this) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i & 107) + (i | 107)) % 128;
            equalsIgnoreCase = util.h.xy.al.ra.f516.equalsIgnoreCase(util.h.xy.au.g.m25127().m25142(raVar));
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i2 ^ 53) + ((i2 & 53) << 1)) % 128;
        }
        return equalsIgnoreCase;
    }

    private int Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 49) + ((i & 49) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        try {
            int i3 = this.getInputSizeshNQ4ISI;
            if (-1000 != i3) {
                int i4 = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                getHighSpeedVideoFpsRanges = i4;
                int i5 = ((i4 | 85) << 1) - (i4 ^ 85);
                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                if (i5 % 2 == 0) {
                    return i3;
                }
                throw null;
            }
            util.h.xy.au.re m25482 = util.h.xy.bh.mb.m25482();
            if (m25482 == null) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
                return 0;
            }
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i6 | 75) << 1) - (i6 ^ 75)) % 128;
            int m25207 = m25482.m25207();
            this.getInputSizeshNQ4ISI = m25207;
            return m25207;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0;
        }
    }

    private int getHighSpeedVideoSizes() {
        int i = (getHighSpeedVideoFpsRanges + 69) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        try {
            int i2 = this.getInputFormats;
            if (-1000 == i2) {
                util.h.xy.au.re m25482 = util.h.xy.bh.mb.m25482();
                if (m25482 == null) {
                    return 10000;
                }
                int m25208 = m25482.m25208();
                this.getInputFormats = m25208;
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                int i4 = (i3 & 99) + (i3 | 99);
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 != 0) {
                    return m25208;
                }
                throw null;
            }
            getHighSpeedVideoFpsRanges = (i + 29) % 128;
            getHighSpeedVideoFpsRanges = (((i | 87) << 1) - (i ^ 87)) % 128;
            return i2;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 10000;
        }
    }
}
