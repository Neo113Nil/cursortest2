package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class rc implements util.h.xy.ck.mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private final util.h.xy.cq.me getHighSpeedVideoSizes;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i | 13) << 1) - (i ^ 13)) % 128;
    }

    public rc(util.h.xy.cq.me meVar) {
        this.getHighSpeedVideoSizes = meVar;
    }

    @Override // util.h.xy.ck.mb
    /* renamed from: ˎ */
    public final byte[] mo25944(byte[] bArr) throws util.h.xy.ck.rc {
        int i = getHighResolutionOutputSizeshNQ4ISI + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i2 & 121) + (i2 | 121)) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.ck.rc {
        byte[] bArr2;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        if (util.h.xy.ck.ra.f1116.m25946()) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
            if (util.h.xy.ck.ra.f1116.m25949().mo25939()) {
                byte[] bArr3 = null;
                try {
                    try {
                        bArr2 = getHighSpeedVideoFpsRanges();
                    } catch (util.h.xy.cm.ma e) {
                        e = e;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr2 = bArr3;
                }
                try {
                    byte[] m25975 = util.h.xy.cm.rb.m25975(bArr2, new byte[16], bArr);
                    util.h.xy.cv.ra.m26066(bArr2);
                    int i2 = getHighSpeedVideoFpsRangesFor;
                    int i3 = (i2 & 93) + (i2 | 93);
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 == 0) {
                        return m25975;
                    }
                    throw null;
                } catch (util.h.xy.cm.ma e2) {
                    e = e2;
                    bArr3 = bArr2;
                    util.h.xy.ck.d dVar = util.h.xy.ck.d.f1110;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(util.h.xy.al.ra.f546);
                    sb.append(e.getMessage());
                    throw new util.h.xy.ck.rc(dVar, sb.toString(), e);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    util.h.xy.cv.ra.m26066(bArr2);
                    throw th;
                }
            }
        }
        throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1109, util.h.xy.al.ra.f547);
    }

    private byte[] getHighSpeedVideoFpsRanges() throws util.h.xy.ck.rc {
        byte[] bArr;
        byte[] bArr2;
        java.lang.Throwable th;
        byte[] bArr3;
        java.lang.Throwable th2;
        util.h.xy.ct.mc e;
        util.h.xy.cm.ma e2;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 113) % 128;
        byte[] bArr4 = null;
        try {
            try {
                bArr3 = util.h.xy.ct.rc.m26047().mo26035(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107), null, util.h.xy.ct.ma.b.f1123.m26043()).get(util.h.xy.ct.ma.b.f1123);
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr3 = null;
            }
        } catch (java.io.UnsupportedEncodingException unused) {
            bArr2 = null;
        } catch (util.h.xy.cm.ma e3) {
            e = e3;
        } catch (util.h.xy.ct.mc e4) {
            e = e4;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = null;
            util.h.xy.cv.ra.m26068(bArr4, bArr4, bArr);
            throw th;
        }
        try {
            bArr = util.h.xy.cv.ra.m26072(bArr3, this.getHighSpeedVideoSizes.m26004());
        } catch (java.io.UnsupportedEncodingException unused2) {
        } catch (util.h.xy.cm.ma e5) {
            e2 = e5;
        } catch (util.h.xy.ct.mc e6) {
            e = e6;
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr = null;
            th2 = th;
            byte[] bArr5 = bArr3;
            th = th2;
            bArr4 = bArr5;
            util.h.xy.cv.ra.m26068(bArr4, bArr4, bArr);
            throw th;
        }
        try {
            byte[] bArr6 = util.h.xy.cq.b.getHighSpeedVideoFpsRanges(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(), bArr, null, null).get(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI);
            util.h.xy.cv.ra.m26068(bArr3, bArr3, bArr);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i & 13) + (i | 13)) % 128;
            return bArr6;
        } catch (java.io.UnsupportedEncodingException unused3) {
            bArr4 = bArr;
            bArr2 = bArr4;
            bArr4 = bArr3;
            try {
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, util.h.xy.al.ra.f606);
            } catch (java.lang.Throwable th6) {
                byte[] bArr7 = bArr2;
                bArr3 = bArr4;
                th2 = th6;
                bArr = bArr7;
                byte[] bArr52 = bArr3;
                th = th2;
                bArr4 = bArr52;
                util.h.xy.cv.ra.m26068(bArr4, bArr4, bArr);
                throw th;
            }
        } catch (util.h.xy.cm.ma e7) {
            e2 = e7;
            e = e2;
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1110;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f633);
            sb.append(e.getMessage());
            throw new util.h.xy.ck.rc(dVar, sb.toString());
        } catch (util.h.xy.ct.mc e8) {
            e = e8;
            e = e;
            util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1108;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(util.h.xy.al.ra.f633);
            sb2.append(e.getMessage());
            throw new util.h.xy.ck.rc(dVar2, sb2.toString());
        } catch (java.lang.Throwable th7) {
            th2 = th7;
            byte[] bArr522 = bArr3;
            th = th2;
            bArr4 = bArr522;
            util.h.xy.cv.ra.m26068(bArr4, bArr4, bArr);
            throw th;
        }
    }

    @Override // util.h.xy.ck.mb
    /* renamed from: ˊ */
    public final byte[] mo25943(byte[] bArr) throws util.h.xy.ck.rc {
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap(bArr);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return Camera2StreamConfigurationMap;
        }
        throw null;
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 103) + ((i & 103) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        byte[] bArr2 = null;
        if (i2 % 2 != 0) {
            util.h.xy.ck.ra.f1116.m25946();
            throw null;
        }
        if (util.h.xy.ck.ra.f1116.m25946()) {
            int i3 = getHighSpeedVideoFpsRangesFor + 93;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                util.h.xy.ck.ra.f1116.m25949().mo25939();
                throw null;
            }
            if (util.h.xy.ck.ra.f1116.m25949().mo25939()) {
                try {
                    try {
                        bArr2 = getHighSpeedVideoFpsRanges();
                        byte[] m25974 = util.h.xy.cm.rb.m25974(bArr2, new byte[16], bArr);
                        util.h.xy.cv.ra.m26066(bArr2);
                        int i4 = getHighSpeedVideoFpsRangesFor;
                        getHighResolutionOutputSizeshNQ4ISI = ((i4 & 19) + (i4 | 19)) % 128;
                        return m25974;
                    } catch (util.h.xy.cm.ma e) {
                        util.h.xy.ck.d dVar = util.h.xy.ck.d.f1110;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(util.h.xy.al.ra.f622);
                        sb.append(e.getMessage());
                        throw new util.h.xy.ck.rc(dVar, sb.toString(), e);
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.cv.ra.m26066(bArr2);
                    throw th;
                }
            }
        }
        throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1109, util.h.xy.al.ra.f547);
    }
}
