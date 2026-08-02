package util.h.xy.bt;

/* loaded from: classes18.dex */
public class b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 51;

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25622(java.lang.Object obj) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 3) << 1) - (i ^ 3);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            getHighSpeedVideoFpsRanges();
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 37) + ((i3 & 37) << 1)) % 128;
            return;
        }
        getHighSpeedVideoFpsRanges();
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges() {
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData m26976;
        java.lang.String[] paths;
        int length;
        int i = getHighSpeedVideoFpsRangesFor + 59;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 != 0) {
                m26976 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).m26976();
                paths = m26976.getPaths();
                length = paths.length;
            } else {
                m26976 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).m26976();
                paths = m26976.getPaths();
                length = paths.length;
            }
            int i2 = 0;
            while (i2 < length) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 3) % 128;
                java.lang.String str = paths[i2];
                byte[] value = m26976.getValue(str);
                int length2 = value.length;
                java.lang.String str2 = util.h.xy.al.ra.f281;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(util.h.xy.al.ra.f605);
                sb.append(util.h.xy.al.ra.f602);
                util.h.xy.am.ma.m25027(str2, sb.toString());
                if (value == null) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f389);
                }
                if (str != null) {
                    int i3 = getHighSpeedVideoFpsRangesFor + 31;
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (str.length() != 0) {
                        byte[] m25076 = util.h.xy.ar.b.m25076(str);
                        byte[] bArr = new byte[m25076.length + value.length];
                        java.lang.System.arraycopy(m25076, 0, bArr, 0, m25076.length);
                        java.lang.System.arraycopy(value, 0, bArr, m25076.length, value.length);
                        try {
                            byte[] m27587 = util.h.xy.v.b.f2439.m27587(bArr);
                            if (m27587[0] != 1) {
                                java.lang.String str3 = new java.lang.String(java.util.Arrays.copyOfRange(m27587, 1, m27587.length));
                                util.h.xy.ar.b.m25074(value);
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(util.h.xy.al.ra.f451);
                                sb2.append(str);
                                sb2.append(util.h.xy.al.ra.f461);
                                sb2.append(str3);
                                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb2.toString());
                            }
                            int i4 = getHighSpeedVideoFpsRangesFor + 65;
                            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                            if (i4 % 2 != 0) {
                                util.h.xy.ar.b.m25074(value);
                                throw new java.lang.NullPointerException();
                            }
                            util.h.xy.ar.b.m25074(value);
                            int i5 = getHighSpeedVideoFpsRangesFor;
                            int i6 = (i5 ^ 5) + ((i5 & 5) << 1);
                            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                            if (i6 % 2 != 0) {
                                util.h.xy.ar.b.m25095(bArr);
                                throw new java.lang.NullPointerException();
                            }
                            int i7 = ((i2 | (-82)) << 1) - (i2 ^ (-82));
                            i2 = ((i7 | 83) << 1) - (i7 ^ 83);
                            int i8 = getHighResolutionOutputSizeshNQ4ISI;
                            getHighSpeedVideoFpsRangesFor = (((i8 | 63) << 1) - (i8 ^ 63)) % 128;
                        } finally {
                            util.h.xy.ar.b.m25095(bArr);
                        }
                    }
                }
                throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f441);
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
        }
        int i9 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i9 & 91) + (i9 | 91)) % 128;
    }
}
