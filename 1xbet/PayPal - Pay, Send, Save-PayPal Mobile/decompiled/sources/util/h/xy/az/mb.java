package util.h.xy.az;

/* loaded from: classes5.dex */
public final class mb {
    private static java.util.concurrent.ExecutorService Camera2StreamConfigurationMap = null;
    private static util.h.xy.az.mb getHighSpeedVideoFpsRangesFor;
    private int getHighResolutionOutputSizeshNQ4ISI = 3;
    private int getOutputMinFrameDuration = 10000;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;

    private mb() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.az.mb m25275() {
        util.h.xy.az.mb mbVar;
        synchronized (util.h.xy.az.mb.class) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                synchronized (util.h.xy.az.mb.class) {
                    getHighSpeedVideoFpsRangesFor = new util.h.xy.az.mb();
                    Camera2StreamConfigurationMap = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
            mbVar = getHighSpeedVideoFpsRangesFor;
        }
        return mbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e6, code lost:
    
        if (r0.m25272() >= 600) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00de, code lost:
    
        if (r0.m25272() > 499) goto L29;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.az.ra m25276(util.h.xy.az.b bVar) throws util.h.xy.az.ma {
        boolean z;
        util.h.xy.az.ma maVar;
        util.h.xy.az.ra raVar;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRanges + 73;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                util.h.xy.bc.b.m25369();
                getHighSpeedVideoSizes();
                getHighSpeedVideoFpsRanges();
                throw null;
            }
            util.h.xy.bc.b m25369 = util.h.xy.bc.b.m25369();
            int highSpeedVideoSizes = getHighSpeedVideoSizes();
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            int i2 = highSpeedVideoSizes;
            while (true) {
                try {
                    raVar = m25369.m25370(bVar);
                } catch (util.h.xy.az.ma e) {
                    if (e.m25271() != 5 && e.m25271() != 4) {
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i3 = ~identityHashCode;
                        int i4 = ~(i3 | (-294305661));
                        int i5 = (i4 & 25830516) | (i4 ^ 25830516);
                        int i6 = ~(identityHashCode | (-137691137));
                        int i7 = (-1732807590) - (~(((i5 ^ i6) | (i6 & i5)) * 717));
                        int i8 = ~((i3 ^ (-137691137)) | (i3 & (-137691137)));
                        int i9 = (i8 ^ 25830516) | (i8 & 25830516);
                        int i10 = ~((identityHashCode ^ (-294305661)) | (identityHashCode & (-294305661)));
                        int i11 = ((i9 ^ i10) | (i9 & i10)) * 717;
                        int identityHashCode2 = java.lang.System.identityHashCode(this);
                        int i12 = ~identityHashCode2;
                        int i13 = (i12 ^ 108508840) | (i12 & 108508840);
                        int i14 = (~((i13 ^ 713893498) | (i13 & 713893498))) * 130;
                        int i15 = ~((identityHashCode2 ^ 788510458) | (identityHashCode2 & 788510458));
                        if ((i7 & i11) + (i11 | i7) > (((i14 ^ 1067262987) + ((1067262987 & i14) << 1)) - 1145710868) + (((33891880 ^ i15) | (i15 & 33891880)) * 130)) {
                            if (e.m25272() > 3341) {
                            }
                            if (e.m25271() == 2) {
                                int i16 = getHighSpeedVideoFpsRanges;
                                int i17 = (i16 & 5) + (i16 | 5);
                                getHighSpeedVideoSizes = i17 % 128;
                                if (i17 % 2 != 0) {
                                    if (e.m25272() != 6650) {
                                    }
                                } else if (e.m25272() != 400) {
                                }
                            }
                            z = false;
                        }
                        maVar = e;
                        raVar = null;
                    }
                    z = true;
                    maVar = e;
                    raVar = null;
                }
                try {
                    z = getHighSpeedVideoSizes(raVar);
                    int i18 = getHighSpeedVideoSizes + 97;
                    getHighSpeedVideoFpsRanges = i18 % 128;
                    int i19 = i18 % 2;
                    maVar = null;
                    if (i2 <= 0) {
                        break;
                    }
                    int i20 = getHighSpeedVideoFpsRanges;
                    int i21 = (i20 ^ 19) + ((i20 & 19) << 1);
                    getHighSpeedVideoSizes = i21 % 128;
                    if (i21 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (!z) {
                        break;
                    }
                    Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
                    i2 = (~i2) + (i2 << 1);
                } catch (org.json.JSONException e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(util.h.xy.al.ra.f322);
                    sb.append(e2);
                    throw new util.h.xy.az.ma(sb.toString(), 6);
                }
            }
            if (maVar != null) {
                int i22 = getHighSpeedVideoFpsRanges + 107;
                getHighSpeedVideoSizes = i22 % 128;
                if (i22 % 2 != 0) {
                    bVar.m25256();
                    throw new java.lang.ArithmeticException();
                }
                bVar.m25256();
                throw maVar;
            }
            bVar.m25256();
        }
        return raVar;
    }

    private static boolean Camera2StreamConfigurationMap(long j) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i & 111) + (i | 111)) % 128;
        try {
            java.lang.Thread.sleep(j);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 97) % 128;
        } catch (java.lang.InterruptedException e) {
            e.getMessage();
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 15) % 128;
        return true;
    }

    private boolean getHighSpeedVideoSizes(util.h.xy.az.ra raVar) throws org.json.JSONException {
        boolean equalsIgnoreCase;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = ((i | 77) << 1) - (i ^ 77);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                equalsIgnoreCase = util.h.xy.al.ra.f516.equalsIgnoreCase(util.h.xy.au.g.m25127().m25142(raVar));
                int i3 = getHighSpeedVideoSizes + 55;
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new java.lang.NullPointerException();
                }
            } else {
                util.h.xy.au.g.m25127().m25142(raVar);
                java.lang.String str = util.h.xy.al.ra.f516;
                throw new java.lang.ArithmeticException();
            }
        }
        return equalsIgnoreCase;
    }

    private int getHighSpeedVideoSizes() {
        util.h.xy.au.re m25482;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i & 89) + (i | 89)) % 128;
        try {
            m25482 = util.h.xy.bh.mb.m25482();
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (m25482 == null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 91) % 128;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 95) % 128;
            return 0;
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 95) % 128;
        int m25207 = m25482.m25207();
        this.getHighResolutionOutputSizeshNQ4ISI = m25207;
        int i2 = getHighSpeedVideoSizes;
        int i3 = (i2 & 111) + (i2 | 111);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return m25207;
        }
        throw new java.lang.ArithmeticException();
    }

    private int getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 49) + ((i & 49) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        try {
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (i2 % 2 == 0) {
            util.h.xy.au.re m25482 = util.h.xy.bh.mb.m25482();
            if (m25482 != null) {
                int m25208 = m25482.m25208();
                this.getOutputMinFrameDuration = m25208;
                int i3 = getHighSpeedVideoSizes + 115;
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 != 0) {
                    return m25208;
                }
                throw new java.lang.ArithmeticException();
            }
            int i4 = getHighSpeedVideoSizes + 97;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                return 10000;
            }
            throw null;
        }
        util.h.xy.bh.mb.m25482();
        throw new java.lang.ArithmeticException();
    }
}
