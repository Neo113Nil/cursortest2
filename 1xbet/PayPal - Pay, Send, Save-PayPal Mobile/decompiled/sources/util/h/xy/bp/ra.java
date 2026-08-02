package util.h.xy.bp;

/* loaded from: classes18.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final byte[][] getHighSpeedVideoSizes = {new byte[]{1}, new byte[]{2}, new byte[]{3}, new byte[]{4}, new byte[]{5}, new byte[]{6}, new byte[]{7}};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {1, 2, 3, 4, 5, 6, 7};

    static {
        int i = Camera2StreamConfigurationMap + 37;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r6.length <= 0) goto L13;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m25544(util.h.xy.bq.rc rcVar) {
        byte[] bArr;
        boolean z;
        byte[] bArr2;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i | 57) << 1) - (i ^ 57)) % 128;
        int i2 = i + 51;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = 0;
        byte[] bArr3 = null;
        if (i2 % 2 != 0 ? rcVar == null : rcVar == null) {
            z = true;
            bArr = null;
        } else {
            bArr = new byte[]{(byte) rcVar.m25576().ordinal()};
            z = false;
        }
        byte[] m25572 = rcVar.m25572();
        if (m25572 != null) {
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i4 ^ 27) + ((i4 & 27) << 1)) % 128;
        }
        int i5 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i5 | 97) << 1) - (i5 ^ 97)) % 128;
        z = true;
        byte[] bArr4 = new byte[4];
        if (m25572.length == 4) {
            int i6 = getHighSpeedVideoFpsRanges + 85;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                byte b = m25572[0];
                m25572[1] = b;
                m25572[0] = b;
                m25572[3] = m25572[3];
                m25572[2] = m25572[2];
            } else {
                m25572[0] = m25572[0];
                m25572[1] = m25572[1];
                m25572[2] = m25572[2];
                m25572[3] = m25572[3];
            }
            bArr2 = m25572;
        } else {
            if (m25572.length == 3) {
                int i7 = getHighSpeedVideoFpsRanges + 5;
                int i8 = i7 % 128;
                Camera2StreamConfigurationMap = i8;
                if (i7 % 2 != 0) {
                    bArr4[0] = 0;
                    byte b2 = m25572[1];
                    bArr4[0] = b2;
                    bArr4[4] = b2;
                    bArr4[2] = m25572[3];
                } else {
                    bArr4[0] = 0;
                    bArr4[1] = m25572[0];
                    bArr4[2] = m25572[1];
                    bArr4[3] = m25572[2];
                }
                int i9 = i8 + 13;
                getHighSpeedVideoFpsRanges = i9 % 128;
                int i10 = i9 % 2;
            } else if (m25572.length == 2) {
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i11 = ~((currentTimeMillis ^ (-19038273)) | (currentTimeMillis & (-19038273)));
                int i12 = -(-(((i11 ^ (-1467992047)) | (i11 & (-1467992047))) * (-756)));
                int i13 = (i12 & (-1679422984)) + (i12 | (-1679422984));
                int i14 = ~currentTimeMillis;
                int i15 = ((i14 ^ (-19038273)) | (i14 & (-19038273))) * 756;
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i16 = ~(currentTimeMillis2 | (-565734340));
                int i17 = -(-(((i16 & 756523401) | (i16 ^ 756523401)) * 398));
                int i18 = ~currentTimeMillis2;
                int i19 = ~((i18 ^ (-565734340)) | (i18 & (-565734340)));
                if ((i13 ^ i15) + ((i15 & i13) << 1) > (((i17 ^ 1416379971) + ((1416379971 & i17) << 1)) - 1629601998) + (((201818120 ^ i19) | (i19 & 201818120) | 554705281) * 398)) {
                    bArr4[1] = 1;
                    bArr4[1] = 1;
                    bArr4[3] = m25572[0];
                    bArr4[5] = m25572[1];
                } else {
                    bArr4[0] = 0;
                    bArr4[1] = 0;
                    bArr4[2] = m25572[0];
                    bArr4[3] = m25572[1];
                }
            } else if (m25572.length == 1) {
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                bArr4[3] = m25572[0];
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 39) % 128;
            }
            bArr2 = bArr4;
        }
        if (!z) {
            int i20 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i20 & 107) + (i20 | 107)) % 128;
            byte[][] bArr5 = {util.h.xy.ar.b.m25075(rcVar.m25578()), util.h.xy.ar.b.m25080(rcVar.m25581()), util.h.xy.ar.b.m25080(rcVar.m25583()), rcVar.m25577(), rcVar.m25580(), bArr, bArr2};
            bArr3 = util.h.xy.al.rd.m25024(getHighSpeedVideoSizes, bArr5);
            util.h.xy.ar.b.m25095(bArr);
            while (i3 < 7) {
                int i21 = getHighSpeedVideoFpsRanges;
                int i22 = (i21 & 37) + (i21 | 37);
                Camera2StreamConfigurationMap = i22 % 128;
                if (i22 % 2 != 0) {
                    util.h.xy.ar.b.m25095(bArr5[i3]);
                    i3 = (i3 & 28) + (i3 | 28);
                } else {
                    util.h.xy.ar.b.m25095(bArr5[i3]);
                    int i23 = (i3 & (-18)) + (i3 | (-18));
                    i3 = ((i23 | 19) << 1) - (i23 ^ 19);
                }
                int i24 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i24 ^ 71) + ((i24 & 71) << 1)) % 128;
            }
            util.h.xy.ar.b.m25074(bArr3);
        }
        int i25 = Camera2StreamConfigurationMap;
        int i26 = ((i25 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i25 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        getHighSpeedVideoFpsRanges = i26;
        Camera2StreamConfigurationMap = (((i26 | 25) << 1) - (i26 ^ 25)) % 128;
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0177  */
    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m25545(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        int i;
        byte[] m27595;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i2 | 79) << 1) - (i2 ^ 79)) % 128;
        getHighSpeedVideoFpsRanges = ((i2 ^ 117) + ((i2 & 117) << 1)) % 128;
        if (bArr != null) {
            int i3 = (((i2 | 13) << 1) - (i2 ^ 13)) % 128;
            getHighSpeedVideoFpsRanges = i3;
            if (bArr.length > 0) {
                int i4 = (i3 ^ 19) + ((i3 & 19) << 1);
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    util.h.xy.q.b.m27056(bArr);
                    util.h.xy.bu.c.f1051.m25650();
                    throw new java.lang.ArithmeticException();
                }
                byte[] m27056 = util.h.xy.q.b.m27056(bArr);
                util.h.xy.d.md m25650 = util.h.xy.bu.c.f1051.m25650();
                if (m25650 == null) {
                    int i5 = getHighSpeedVideoFpsRanges;
                    int i6 = (i5 ^ 89) + ((i5 & 89) << 1);
                    Camera2StreamConfigurationMap = i6 % 128;
                    if (i6 % 2 != 0) {
                        util.h.xy.v.b.f2439.m27629(m27056);
                        throw null;
                    }
                    m27595 = util.h.xy.v.b.f2439.m27629(m27056);
                } else {
                    java.lang.String tokenizedCardID = m25650.getTokenizedCardID();
                    m27595 = util.h.xy.v.b.f2439.m27595(new byte[]{2, 1}, util.h.xy.f.b.f2201.m26757(tokenizedCardID, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP, false, util.h.xy.k.ra.f2243.m26940(tokenizedCardID).booleanValue()), m27056);
                }
                if (m27595 != null) {
                    int i7 = getHighSpeedVideoFpsRanges;
                    Camera2StreamConfigurationMap = ((i7 ^ 69) + ((i7 & 69) << 1)) % 128;
                    bArr2 = new byte[m27595.length - 1];
                    int i8 = 0;
                    while (true) {
                        int length = m27595.length;
                        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                        int i9 = length * (-107);
                        int i10 = (i9 ^ (-55)) + ((i9 & (-55)) << 1);
                        int i11 = ~length;
                        int i12 = ~currentTimeMillis;
                        int i13 = ~((length ^ i12) | (i12 & length));
                        int i14 = -(-(((i13 ^ i11) | (i11 & i13)) * (-108)));
                        int i15 = (i10 ^ i14) + ((i14 & i10) << 1);
                        int i16 = ~((~i11) | i11);
                        int i17 = (i12 & i16) | (i12 ^ i16);
                        int i18 = ~((~i12) | i12);
                        int i19 = -(-(((i17 ^ i18) | (i17 & i18)) * 54));
                        int i20 = (i15 & i19) + (i19 | i15);
                        int i21 = -(-(((i16 ^ currentTimeMillis) | (i16 & currentTimeMillis)) * 54));
                        if (i8 >= ((i20 | i21) << 1) - (i21 ^ i20)) {
                            break;
                        }
                        int i22 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = (((i22 | 105) << 1) - (i22 ^ 105)) % 128;
                        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                        int i23 = (i8 * 306) + 916;
                        int i24 = ~(i8 | 1);
                        int i25 = ~((currentTimeMillis2 ^ 1) | (currentTimeMillis2 & 1));
                        int i26 = ((i24 ^ i25) | (i24 & i25)) * 305;
                        int i27 = (i23 ^ i26) + ((i23 & i26) << 1);
                        int i28 = ~i8;
                        int i29 = ~currentTimeMillis2;
                        int i30 = ~((i29 ^ 1) | (i29 & 1));
                        int i31 = ((i30 ^ i28) | (i30 & i28)) * 305;
                        bArr2[i8] = m27595[(i27 & i31) + (i31 | i27)];
                        i8++;
                    }
                    util.h.xy.af.mb.m24551().m24555(util.h.xy.af.mb.m24551().m24553(m27595[0]));
                    int i32 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i32 ^ 41) + ((i32 & 41) << 1)) % 128;
                } else {
                    bArr2 = null;
                }
                util.h.xy.ar.b.m25095(m27056);
                int i33 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = ((i33 ^ 43) + ((i33 & 43) << 1)) % 128;
                int i34 = Camera2StreamConfigurationMap;
                i = (i34 & 55) + (i34 | 55);
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    return bArr2;
                }
                throw null;
            }
        }
        bArr2 = null;
        int i342 = Camera2StreamConfigurationMap;
        i = (i342 & 55) + (i342 | 55);
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData m25543(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 45) << 1) - (i ^ 45);
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i + 97;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData remotePaymentOutputData = null;
        if (bArr != null) {
            int i5 = i4 + 59;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                util.h.xy.ar.mb[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
                util.h.xy.ar.b.m25095(bArr);
                if (highSpeedVideoFpsRanges != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 19) % 128;
                    if (highSpeedVideoFpsRanges.length > 0) {
                        com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
                        util.h.xy.al.rd.m25025(highSpeedVideoFpsRanges);
                        if (Camera2StreamConfigurationMap2 == null) {
                            int i6 = Camera2StreamConfigurationMap;
                            int i7 = (i6 & 95) + (i6 | 95);
                            getHighSpeedVideoFpsRanges = i7 % 128;
                            if (i7 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            remotePaymentOutputData = Camera2StreamConfigurationMap2;
                        }
                        if (i2 % 2 == 0) {
                            return remotePaymentOutputData;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                }
                int i8 = Camera2StreamConfigurationMap;
                int i9 = ((i8 | 57) << 1) - (i8 ^ 57);
                getHighSpeedVideoFpsRanges = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                if (i2 % 2 == 0) {
                }
            }
        }
        int i10 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i10 ^ 103) + ((i10 & 103) << 1)) % 128;
        if (i2 % 2 == 0) {
        }
    }

    private static util.h.xy.ar.mb[] getHighSpeedVideoFpsRanges(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 51) + (i | 51);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bArr == null || bArr.length == 0) {
            getHighSpeedVideoFpsRanges = (i3 + 99) % 128;
            return null;
        }
        byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
        util.h.xy.ar.mb[] mbVarArr = new util.h.xy.ar.mb[bArr2.length];
        int i4 = 0;
        for (byte b : bArr2) {
            try {
                util.h.xy.ar.mb m25057 = util.h.xy.ar.a.m25057(bArr, b);
                if (m25057 != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 55) % 128;
                    mbVarArr[i4] = m25057;
                    i4++;
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 43) % 128;
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                e.getMessage();
                return null;
            }
        }
        util.h.xy.ar.mb[] mbVarArr2 = new util.h.xy.ar.mb[i4];
        java.lang.System.arraycopy(mbVarArr, 0, mbVarArr2, 0, i4);
        int i5 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i5 ^ 51) + ((i5 & 51) << 1)) % 128;
        return mbVarArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData Camera2StreamConfigurationMap(util.h.xy.ar.mb[] mbVarArr) {
        int i;
        byte[] m25103;
        int i2;
        int i3;
        java.lang.String valueOf;
        int i4 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i4 & 45) + (i4 | 45)) % 128;
        if (mbVarArr == null || mbVarArr.length == 0) {
            return null;
        }
        util.h.xy.bp.ma maVar = new util.h.xy.bp.ma();
        int length = mbVarArr.length;
        for (int i5 = 0; i5 < length; i5 = ((i5 & 76) + (i5 | 76)) - 75) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 29) % 128;
            util.h.xy.ar.mb mbVar = mbVarArr[i5];
            byte m25109 = mbVar.m25109();
            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
            if (m25109 == bArr[0]) {
                maVar.m25536(getHighSpeedVideoSizes(util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25103(mbVar.m25110()))));
            } else {
                int i6 = 1;
                if (mbVar.m25109() == bArr[1]) {
                    maVar.m25537(util.h.xy.ar.b.m25073(mbVar.m25110()[0]));
                    maVar.getDpanSequenceNumber();
                } else {
                    if (mbVar.m25109() == bArr[2]) {
                        int i7 = getHighSpeedVideoFpsRanges + 75;
                        Camera2StreamConfigurationMap = i7 % 128;
                        if (i7 % 2 != 0) {
                            maVar.m25541(util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25103(mbVar.m25110())));
                            maVar.getPAR();
                            throw new java.lang.ArithmeticException();
                        }
                        maVar.m25541(util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25103(mbVar.m25110())));
                        maVar.getPAR();
                        i = getHighSpeedVideoFpsRanges + 93;
                    } else if (mbVar.m25109() == bArr[3]) {
                        int i8 = ~((int) java.lang.System.currentTimeMillis());
                        int i9 = ((-1567156981) ^ i8) | (i8 & (-1567156981));
                        int i10 = ((~((i9 ^ (-490655255)) | (i9 & (-490655255)))) | (-1568599799)) * (-828);
                        int i11 = (i10 & (-824327132)) + (i10 | (-824327132));
                        int i12 = ((i8 ^ (-489212437)) | (i8 & (-489212437))) * (-828);
                        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                        int i14 = ~((int) java.lang.System.currentTimeMillis());
                        int i15 = (i14 ^ (-1194542251)) | (i14 & (-1194542251));
                        int i16 = i15 * 495;
                        int i17 = ((i16 | 468205214) << 1) - (i16 ^ 468205214);
                        int i18 = ~i15;
                        int i19 = ((i18 ^ (-2000635579)) | (i18 & (-2000635579))) * 495;
                        if ((i13 ^ 1340971184) + ((i13 & 1340971184) << 1) > (i17 & i19) + (i19 | i17)) {
                            m25103 = util.h.xy.ar.b.m25103(mbVar.m25110());
                            if (m25103.length != 2) {
                                i2 = 0;
                                i3 = 0;
                                if (i3 >= 10) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(util.h.xy.al.ra.f393);
                                    sb.append(i3);
                                    valueOf = sb.toString();
                                } else {
                                    valueOf = java.lang.String.valueOf(i3);
                                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 47) % 128;
                                }
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(i2);
                                sb2.append(valueOf);
                                sb2.append(i6);
                                maVar.m25542(util.h.xy.ar.b.m25094(sb2.toString()));
                            }
                            i2 = util.h.xy.ar.b.m25073(m25103[0]);
                            i3 = util.h.xy.ar.b.m25073(m25103[1]);
                            i6 = util.h.xy.ar.b.m25073(m25103[2]);
                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 117) % 128;
                            if (i3 >= 10) {
                            }
                            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                            sb22.append(i2);
                            sb22.append(valueOf);
                            sb22.append(i6);
                            maVar.m25542(util.h.xy.ar.b.m25094(sb22.toString()));
                        } else {
                            m25103 = util.h.xy.ar.b.m25103(mbVar.m25110());
                            if (m25103.length != 3) {
                                i2 = 0;
                                i3 = 0;
                                i6 = 0;
                                if (i3 >= 10) {
                                }
                                java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                                sb222.append(i2);
                                sb222.append(valueOf);
                                sb222.append(i6);
                                maVar.m25542(util.h.xy.ar.b.m25094(sb222.toString()));
                            }
                            i2 = util.h.xy.ar.b.m25073(m25103[0]);
                            i3 = util.h.xy.ar.b.m25073(m25103[1]);
                            i6 = util.h.xy.ar.b.m25073(m25103[2]);
                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 117) % 128;
                            if (i3 >= 10) {
                            }
                            java.lang.StringBuilder sb2222 = new java.lang.StringBuilder();
                            sb2222.append(i2);
                            sb2222.append(valueOf);
                            sb2222.append(i6);
                            maVar.m25542(util.h.xy.ar.b.m25094(sb2222.toString()));
                        }
                    } else if (mbVar.m25109() == bArr[4]) {
                        maVar.m25538(getHighSpeedVideoSizes(util.h.xy.ar.b.m25074(util.h.xy.ar.b.m25103(mbVar.m25110()))));
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 79) % 128;
                    } else if (mbVar.m25109() == bArr[5]) {
                        int i20 = Camera2StreamConfigurationMap;
                        int i21 = (i20 ^ 69) + ((i20 & 69) << 1);
                        getHighSpeedVideoFpsRanges = i21 % 128;
                        if (i21 % 2 == 0) {
                            byte[] m251032 = util.h.xy.ar.b.m25103(mbVar.m25110());
                            util.h.xy.ar.b.m25074(m251032);
                            maVar.m25540(Camera2StreamConfigurationMap(m251032));
                            throw new java.lang.ArithmeticException();
                        }
                        byte[] m251033 = util.h.xy.ar.b.m25103(mbVar.m25110());
                        util.h.xy.ar.b.m25074(m251033);
                        maVar.m25540(Camera2StreamConfigurationMap(m251033));
                        i = getHighSpeedVideoFpsRanges + 89;
                    } else if (mbVar.m25109() == bArr[6]) {
                        int i22 = getHighSpeedVideoFpsRanges;
                        int i23 = (i22 ^ 109) + ((i22 & 109) << 1);
                        Camera2StreamConfigurationMap = i23 % 128;
                        if (i23 % 2 != 0) {
                            maVar.m25539(util.h.xy.ar.b.m25103(mbVar.m25110()));
                            util.h.xy.ar.b.m25098(maVar.getCryptogramData());
                            throw null;
                        }
                        maVar.m25539(util.h.xy.ar.b.m25103(mbVar.m25110()));
                        util.h.xy.ar.b.m25098(maVar.getCryptogramData());
                    } else {
                        continue;
                    }
                    Camera2StreamConfigurationMap = i % 128;
                }
            }
        }
        return maVar;
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 21) + (i | 21);
        Camera2StreamConfigurationMap = i2 % 128;
        java.lang.String str2 = util.h.xy.al.ra.f457;
        java.lang.String str3 = util.h.xy.al.ra.f733;
        if (i2 % 2 == 0) {
            return str.replaceAll(str2, str3);
        }
        throw null;
    }

    private static com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType Camera2StreamConfigurationMap(byte[] bArr) {
        com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType;
        java.lang.String str = util.h.xy.al.ra.f418;
        java.lang.String str2 = util.h.xy.al.ra.f419;
        java.lang.String str3 = util.h.xy.al.ra.f416;
        java.lang.String str4 = util.h.xy.al.ra.f420;
        java.lang.String str5 = util.h.xy.al.ra.f415;
        java.lang.String m25074 = util.h.xy.ar.b.m25074(bArr);
        if (m25074.equals(str)) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i | 43) << 1) - (i ^ 43)) % 128;
            cryptogramDataType = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.UCAF;
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
        } else if (m25074.equals(str2)) {
            int i3 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
            cryptogramDataType = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.DE55;
        } else if (m25074.equals(str3)) {
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 & 107) + (i4 | 107);
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType2 = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.TAVV;
                throw null;
            }
            cryptogramDataType = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.TAVV;
        } else if (m25074.equals(str4)) {
            int i6 = getHighSpeedVideoFpsRanges + 65;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType3 = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.CDF;
                throw new java.lang.ArithmeticException();
            }
            cryptogramDataType = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.CDF;
        } else if (m25074.equals(str5)) {
            cryptogramDataType = com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType.CCDF;
            int i7 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i7 & 11) + (i7 | 11)) % 128;
        } else {
            cryptogramDataType = null;
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 1) % 128;
        return cryptogramDataType;
    }
}
