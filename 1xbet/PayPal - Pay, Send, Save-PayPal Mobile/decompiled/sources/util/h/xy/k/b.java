package util.h.xy.k;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 63) + (i | 63);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m26917(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i & 85) + (i | 85)) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        byte[] m27479 = util.h.xy.t.mb.f2417.m27479(bytes);
        if (m27479 == null) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1010, util.h.xy.al.ra.f273);
        }
        java.lang.String str2 = new java.lang.String(m27479, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27479);
        byte[] m27410 = util.h.xy.t.mb.f2417.m27410(bytes);
        if (m27410 == null) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1010, util.h.xy.al.ra.f273);
        }
        java.lang.String str3 = new java.lang.String(m27410, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27410);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        arrayList.add(str3);
        byte[] m27413 = util.h.xy.t.mb.f2417.m27413(bytes);
        if (m27413 == null) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1010, util.h.xy.al.ra.f273);
        }
        java.lang.String str4 = new java.lang.String(m27413, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27413);
        arrayList.add(str4);
        byte[] m27417 = util.h.xy.t.mb.f2417.m27417(bytes);
        if (m27417 == null) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1010, util.h.xy.al.ra.f273);
        }
        java.lang.String str5 = new java.lang.String(m27417, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27417);
        arrayList.add(str5);
        util.h.xy.ar.b.m25095(bytes);
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i2 & 101) + (i2 | 101)) % 128;
        return arrayList;
    }

    /* renamed from: util.h.xy.k.b$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;

        static {
            int[] iArr = new int[util.h.xy.d.ma.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[util.h.xy.d.ma.f1140.ordinal()] = 1;
                int i = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = (((i | 119) << 1) - (i ^ 119)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.d.ma.f1142.ordinal()] = 2;
                int i2 = getHighSpeedVideoFpsRanges;
                int i3 = ((i2 | 45) << 1) - (i2 ^ 45);
                getHighSpeedVideoSizes = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.d.ma.f1143.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.d.ma.f1141.ordinal()] = 4;
                int i5 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = (((i5 | 85) << 1) - (i5 ^ 85)) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26911(java.lang.String str, util.h.xy.d.ma maVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27479;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 57) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        int i = util.h.xy.k.b.AnonymousClass3.getHighResolutionOutputSizeshNQ4ISI[maVar.ordinal()];
        if (i == 1) {
            m27479 = util.h.xy.t.mb.f2417.m27479(bytes);
        } else if (i == 2) {
            m27479 = util.h.xy.t.mb.f2417.m27410(bytes);
        } else if (i == 3) {
            m27479 = util.h.xy.t.mb.f2417.m27417(bytes);
        } else if (i != 4) {
            m27479 = null;
        } else {
            m27479 = util.h.xy.t.mb.f2417.m27413(bytes);
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        if (m27479 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f410);
            sb.append(maVar.toString());
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1010, sb.toString());
        }
        java.lang.String str2 = new java.lang.String(m27479, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27479);
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m27696 = util.h.xy.x.a.m27696(str2);
        util.h.xy.ar.b.m25095(bytes);
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i2 & 33) + (i2 | 33)) % 128;
        return m27696;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m26921(java.lang.String str, util.h.xy.d.ma maVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 41) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] m27457 = util.h.xy.t.mb.f2417.m27457(str.getBytes(util.h.xy.h.a.f2221), maVar);
        if (util.h.xy.ar.b.m25068(m27457)) {
            return null;
        }
        java.lang.String str2 = new java.lang.String(m27457, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27457);
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i & 99) + (i | 99)) % 128;
        return str2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m26920(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 99) + ((i & 99) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        java.lang.String str2 = null;
        if (i2 % 2 != 0) {
            util.h.xy.u.d.m27510(str);
            byte[] m27448 = util.h.xy.t.mb.f2417.m27448(str.getBytes(util.h.xy.h.a.f2221));
            if (!util.h.xy.ar.b.m25068(m27448)) {
                str2 = new java.lang.String(m27448, util.h.xy.h.a.f2221);
                util.h.xy.ar.b.m25095(m27448);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 119) % 128;
            }
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i3 & 93) + (i3 | 93)) % 128;
            return str2;
        }
        util.h.xy.u.d.m27510(str);
        util.h.xy.ar.b.m25068(util.h.xy.t.mb.f2417.m27448(str.getBytes(util.h.xy.h.a.f2221)));
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m26908(java.lang.String str) {
        int i;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m26953;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i2 | 13) << 1) - (i2 ^ 13)) % 128;
        util.h.xy.u.d.m27510(str);
        try {
            byte[] m27462 = util.h.xy.t.mb.f2417.m27462(str.getBytes(util.h.xy.h.a.f2221));
            if (util.h.xy.ar.b.m25070(m27462)) {
                i = Camera2StreamConfigurationMap + 61;
            } else {
                util.h.xy.ar.b.m25074(m27462);
                i = Camera2StreamConfigurationMap + 113;
            }
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (util.h.xy.ar.b.m25070(m27462)) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                int i4 = (i3 & 43) + (i3 | 43);
                Camera2StreamConfigurationMap = i4 % 128;
                m26953 = null;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } else {
                m26953 = util.h.xy.k.ra.f2243.m26953(str.getBytes(util.h.xy.h.a.f2221), m27462);
            }
            if (m26953 != null) {
                int i5 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = (((i5 | 37) << 1) - (i5 ^ 37)) % 128;
                if (m26953.getResult() != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
                    m26953.getResult().m26136();
                }
            }
            return m26953;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            return util.h.xy.x.a.m27692((java.lang.Exception) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.d.ra m26913(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.d.rc rcVar;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 9) % 128;
        util.h.xy.u.d.m27510(str);
        util.h.xy.d.b bVar = null;
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
            util.h.xy.d.b m26955 = util.h.xy.k.ra.f2243.m26955(bytes);
            if (m26955.m26139() != 0) {
                int i = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = (((i | 105) << 1) - (i ^ 105)) % 128;
                util.h.xy.d.rc highSpeedVideoSizes = getHighSpeedVideoSizes(util.h.xy.t.mb.f2417.m27430(bytes, util.h.xy.ar.b.m25088(m26955.m26143()), m26955.m26133()));
                if (highSpeedVideoSizes != 0) {
                    int i2 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = ((i2 & 5) + (i2 | 5)) % 128;
                    if (util.h.xy.k.ra.f2243.m26968(str)) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 115) % 128;
                        util.h.xy.t.mb.f2417.m27469(highSpeedVideoSizes.m26244(), util.h.xy.k.ra.f2243.m26940(str).booleanValue());
                        int i3 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = (((i3 | 83) << 1) - (i3 ^ 83)) % 128;
                    }
                }
                bVar = highSpeedVideoSizes;
            }
            rcVar = bVar;
            bVar = m26955;
        } else {
            rcVar = 0;
        }
        return new util.h.xy.d.ra(bVar, rcVar);
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.d.ra m26910(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        util.h.xy.d.rc rcVar;
        byte[] m27430;
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        util.h.xy.d.b m26955 = util.h.xy.k.ra.f2243.m26955(bytes);
        if (m26955.m26139() != 0) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 121) << 1) - (i ^ 121);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                util.h.xy.ar.b.m25088(m26955.m26143());
                m26955.m26133();
                util.h.xy.f.b.f2201.m26759(str);
                java.lang.String str2 = util.h.xy.al.ra.f534;
                throw null;
            }
            byte[] m25088 = util.h.xy.ar.b.m25088(m26955.m26143());
            util.h.xy.d.mg m26133 = m26955.m26133();
            if (util.h.xy.al.ra.f534.equalsIgnoreCase(util.h.xy.f.b.f2201.m26759(str)) && m26955.m26144(str)) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 47) % 128;
                return null;
            }
            if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                m27430 = util.h.xy.t.mb.f2417.m27449(bytes, m25088, m26133);
                int i3 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i3 ^ 77) + ((i3 & 77) << 1)) % 128;
            } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                int i4 = getHighSpeedVideoFpsRangesFor + 83;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 == 0) {
                    util.h.xy.t.mb.f2417.m27458(bytes, m25088, m26133);
                    throw null;
                }
                m27430 = util.h.xy.t.mb.f2417.m27458(bytes, m25088, m26133);
            } else {
                m27430 = util.h.xy.t.mb.f2417.m27430(bytes, m25088, m26133);
            }
            rcVar = getHighSpeedVideoSizes(m27430);
            int i5 = Camera2StreamConfigurationMap + 101;
            int i6 = i5 % 128;
            getHighSpeedVideoFpsRangesFor = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (rcVar != null) {
                Camera2StreamConfigurationMap = (((i6 | 113) << 1) - (i6 ^ 113)) % 128;
                if (util.h.xy.k.ra.f2243.m26968(str)) {
                    if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                        int i7 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = (((i7 | 79) << 1) - (i7 ^ 79)) % 128;
                        util.h.xy.t.mb.f2417.m27469(rcVar.m26244(), z2);
                    } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                        util.h.xy.t.mb.f2417.m27453(rcVar.m26244(), z2);
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 103) % 128;
                    } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                        util.h.xy.t.mb.f2417.m27433(rcVar.m26244(), z2);
                    }
                }
            }
        } else {
            rcVar = null;
        }
        if (z) {
            int i8 = Camera2StreamConfigurationMap;
            int i9 = (i8 & 91) + (i8 | 91);
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            if (i9 % 2 != 0) {
                util.h.xy.k.ra.m26935(m26955, bytes);
                throw null;
            }
            util.h.xy.d.b m26935 = util.h.xy.k.ra.m26935(m26955, bytes);
            if (m26935 == null) {
                int i10 = (getHighSpeedVideoFpsRangesFor + 41) % 128;
                Camera2StreamConfigurationMap = i10;
                getHighSpeedVideoFpsRangesFor = (i10 + 63) % 128;
                return null;
            }
            if (m26955.m26133() == util.h.xy.d.mg.f1144) {
                int i11 = getHighSpeedVideoFpsRangesFor;
                int i12 = (i11 & 23) + (i11 | 23);
                Camera2StreamConfigurationMap = i12 % 128;
                if (i12 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                m26955 = m26935;
            }
        }
        return new util.h.xy.d.ra(m26955, rcVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26918(java.lang.String str, util.h.xy.d.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i & 11) + (i | 11)) % 128;
        if (bVar.m26142() != 0) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                bVar.m26133();
                util.h.xy.d.mg mgVar = util.h.xy.d.mg.f1145;
                throw null;
            }
            if (bVar.m26133() == util.h.xy.d.mg.f1145) {
                util.h.xy.k.ra.f2243.m26966(str.getBytes(util.h.xy.h.a.f2221), new util.h.xy.d.b(bVar.m26143(), bVar.m26139(), bVar.m26141(), bVar.m26136(), true, bVar.m26133(), bVar.m26131(), bVar.m26132(), 0, bVar.m26145(), bVar.m26134(), bVar.m26135()));
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 87) % 128;
            }
        }
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i4 = ~currentTimeMillis;
        int i5 = ~((-2066318549) | i4);
        int i6 = ~((-174547757) | currentTimeMillis);
        int i7 = ((i5 ^ i6) | (i5 & i6)) * 1900;
        int i8 = (i7 ^ (-573310976)) + ((i7 & (-573310976)) << 1);
        int i9 = ~((i4 ^ 174547756) | (i4 & 174547756));
        int i10 = ~((currentTimeMillis ^ 2066318548) | (currentTimeMillis & 2066318548));
        int i11 = -(-(((i9 ^ i10) | (i9 & i10)) * (-950)));
        int i12 = ~((i4 ^ 2066318548) | (i4 & 2066318548));
        int i13 = ~((currentTimeMillis ^ 174547756) | (currentTimeMillis & 174547756));
        int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * 950));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i15 = ~currentTimeMillis2;
        int i16 = (~(i15 | 1784165363)) | 277315588;
        int i17 = ~((currentTimeMillis2 ^ (-168829057)) | (currentTimeMillis2 & (-168829057)));
        int i18 = ((i16 ^ i17) | (i16 & i17)) * 717;
        int i19 = (i18 & 1474662699) + (i18 | 1474662699);
        int i20 = ~((i15 ^ (-168829057)) | (i15 & (-168829057)));
        int i21 = (i20 ^ 277315588) | (i20 & 277315588);
        int i22 = ~((currentTimeMillis2 ^ 1784165363) | (currentTimeMillis2 & 1784165363));
        int i23 = -(-(((i22 ^ i21) | (i22 & i21)) * 717));
        if ((((i8 & i11) + (i11 | i8)) - (~i14)) - 1 > ((i19 | i23) << 1) - (i23 ^ i19)) {
            throw null;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26924(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        byte[] m27430;
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i | 15) << 1) - (i ^ 15)) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        util.h.xy.d.b m26955 = util.h.xy.k.ra.f2243.m26955(bytes);
        if (m26955.m26139() == 0) {
            return new byte[0];
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 43) % 128;
        byte[] m25088 = util.h.xy.ar.b.m25088(m26955.m26143());
        util.h.xy.d.mg m26133 = m26955.m26133();
        if (util.h.xy.al.ra.f534.equalsIgnoreCase(util.h.xy.f.b.f2201.m26759(str))) {
            int i2 = Camera2StreamConfigurationMap + 21;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                m26955.m26144(str);
                throw null;
            }
            if (m26955.m26144(str)) {
                return null;
            }
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = (i3 ^ 89) + ((i3 & 89) << 1);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                util.h.xy.t.mb.f2417.m27449(bytes, m25088, m26133);
                throw null;
            }
            m27430 = util.h.xy.t.mb.f2417.m27449(bytes, m25088, m26133);
        } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            int i5 = Camera2StreamConfigurationMap + 105;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 != 0) {
                util.h.xy.t.mb.f2417.m27458(bytes, m25088, m26133);
                throw null;
            }
            m27430 = util.h.xy.t.mb.f2417.m27458(bytes, m25088, m26133);
        } else {
            m27430 = util.h.xy.t.mb.f2417.m27430(bytes, m25088, m26133);
        }
        util.h.xy.d.rc highSpeedVideoSizes = getHighSpeedVideoSizes(m27430);
        int i6 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i6 | 15) << 1) - (i6 ^ 15)) % 128;
        return highSpeedVideoSizes.m26244();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.d.b m26923(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.d.b bVar;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 27) % 128;
        util.h.xy.u.d.m27510(str);
        byte[] m27473 = util.h.xy.t.mb.f2417.m27473(str.getBytes(util.h.xy.h.a.f2221));
        if (!util.h.xy.ar.b.m25070(m27473)) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i | 11) << 1) - (i ^ 11)) % 128;
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m26953 = util.h.xy.k.ra.f2243.m26953(str.getBytes(util.h.xy.h.a.f2221), m27473);
            if (m26953.isSuccessful()) {
                int i2 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
                bVar = m26953.getResult();
                int i3 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i3 ^ 9) + ((i3 & 9) << 1)) % 128;
                util.h.xy.ar.b.m25095(m27473);
                return bVar;
            }
        }
        bVar = null;
        util.h.xy.ar.b.m25095(m27473);
        return bVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m26909(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
            throw null;
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 71) % 128;
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                int i4 = ((i3 | 21) << 1) - (i3 ^ 21);
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 == 0) {
                    com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType3 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                    throw null;
                }
                if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f381);
                }
            }
        }
        util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
        if (m26956 != null) {
            int i5 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i5 & 65) + (i5 | 65)) % 128;
            return m26956.m26180();
        }
        java.lang.String str = new java.lang.String(new byte[0], util.h.xy.h.a.f2221);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 119) % 128;
        return str;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            int i = getHighSpeedVideoFpsRangesFor + 51;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                throw new java.lang.ArithmeticException();
            }
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i2 = ~currentTimeMillis;
                int i3 = (((-1036063167) ^ i2) | (i2 & (-1036063167))) * (-757);
                int i4 = ((i3 | (-908230730)) << 1) - (i3 ^ (-908230730));
                int i5 = (~((-876679345) | currentTimeMillis)) * 1514;
                int i6 = ~((i2 ^ (-1950694641)) | (i2 & (-1950694641)));
                int i7 = (i6 ^ 1074015296) | (i6 & 1074015296);
                int i8 = ~(currentTimeMillis | (-159383823));
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i9 = ~currentTimeMillis2;
                int i10 = ~((i9 & 584324744) | (i9 ^ 584324744) | 1626620575);
                int i11 = ~((i9 ^ 1626620575) | (i9 & 1626620575));
                if ((i4 & i5) + (i5 | i4) + (((i8 ^ i7) | (i8 & i7)) * 757) <= (539129186 - (~(((550765192 ^ i10) | (i10 & 550765192)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) + (((i11 & 584324744) | (i11 ^ 584324744)) * (-440)) + (((1660180127 ^ currentTimeMillis2) | (currentTimeMillis2 & 1660180127)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) {
                    com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType3 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                    throw new java.lang.ArithmeticException();
                }
                if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                    return null;
                }
            }
        }
        util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
        if (m26956 == null) {
            return null;
        }
        int i12 = Camera2StreamConfigurationMap + 93;
        getHighSpeedVideoFpsRangesFor = i12 % 128;
        if (i12 % 2 == 0) {
            return m26956.m26180();
        }
        m26956.m26180();
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26915(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i & 93) + (i | 93)) % 128;
        java.lang.String[] m26919 = m26919();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 7) % 128;
        for (java.lang.String str2 : m26919) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
            if (str2.equals(str)) {
                int i2 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = (i2 + 83) % 128;
                getHighSpeedVideoFpsRangesFor = (i2 + 93) % 128;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String[] m26919() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 51) + ((i & 51) << 1)) % 128;
        java.lang.String[] m26916 = m26916(false);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 19) % 128;
        return m26916;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String[] m26916(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (z) {
            int i = getHighSpeedVideoFpsRangesFor + 95;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                util.h.xy.j.ma.f2241.m26902();
                throw null;
            }
            if (util.h.xy.j.ma.f2241.m26902()) {
                int i2 = Camera2StreamConfigurationMap;
                int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                    util.h.xy.j.ma.f2241.m26899();
                    throw null;
                }
                if (!util.h.xy.j.ma.f2241.m26899()) {
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1015, util.h.xy.al.ra.f392);
                }
            }
        }
        byte[] m27471 = util.h.xy.t.mb.f2417.m27471();
        if (util.h.xy.ar.b.m25070(m27471)) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i4 | 23) << 1) - (i4 ^ 23)) % 128;
            java.lang.String[] strArr = new java.lang.String[0];
            int i5 = (i4 & 109) + (i4 | 109);
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                return strArr;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = new java.lang.String(m27471, util.h.xy.h.a.f2221);
        util.h.xy.ar.b.m25095(m27471);
        java.lang.String[] split = str.split(util.h.xy.al.ra.f543);
        int i6 = Camera2StreamConfigurationMap;
        int i7 = (i6 ^ 81) + ((i6 & 81) << 1);
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 == 0) {
            return split;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static org.json.JSONArray m26912() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap + 81;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return util.h.xy.k.ra.f2243.m26942(util.h.xy.f.b.f2201.m26781());
        }
        util.h.xy.k.ra.f2243.m26942(util.h.xy.f.b.f2201.m26781());
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    private static util.h.xy.d.rc getHighSpeedVideoSizes(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 53;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ar.b.m25070(bArr);
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr2 = null;
        if (util.h.xy.ar.b.m25070(bArr)) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        char c = 0;
        util.h.xy.ar.mb[] m25063 = util.h.xy.ar.a.m25063(bArr, new byte[]{1}, new byte[]{2}, new byte[]{3}, new byte[]{4}, new byte[]{5}, new byte[]{17}, new byte[]{18}, new byte[]{19}, new byte[]{com.google.common.base.Ascii.DC4});
        int length = m25063.length;
        int i4 = 0;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        byte[] bArr9 = null;
        byte[] bArr10 = null;
        while (i4 < length) {
            int i5 = Camera2StreamConfigurationMap;
            int i6 = i5 + 3;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            if (i6 % 2 != 0) {
                util.h.xy.ar.mb mbVar = m25063[i4];
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.ar.mb mbVar2 = m25063[i4];
            if (mbVar2 == null) {
                getHighSpeedVideoFpsRangesFor = (((i5 | 15) << 1) - (i5 ^ 15)) % 128;
            } else {
                byte b = mbVar2.m25111()[c];
                if (b == 1) {
                    bArr2 = mbVar2.m25110();
                } else if (b == 2) {
                    bArr3 = mbVar2.m25110();
                } else if (b == 3) {
                    bArr4 = mbVar2.m25110();
                    int i7 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = (((i7 | 19) << 1) - (i7 ^ 19)) % 128;
                } else if (b == 4) {
                    bArr5 = mbVar2.m25110();
                } else if (b != 5) {
                    switch (b) {
                        case 17:
                            bArr6 = mbVar2.m25110();
                            break;
                        case 18:
                            bArr7 = mbVar2.m25110();
                            break;
                        case 19:
                            bArr8 = mbVar2.m25110();
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 119) % 128;
                            break;
                        case 20:
                            bArr10 = mbVar2.m25110();
                            break;
                    }
                } else {
                    bArr9 = mbVar2.m25110();
                }
            }
            i4 = ((i4 & 1) << 1) + (i4 ^ 1);
            c = 0;
        }
        byte[] bArr11 = bArr3;
        util.h.xy.d.rc rcVar = new util.h.xy.d.rc(bArr11, bArr2, bArr4, bArr5, bArr9, bArr6, util.h.xy.ar.b.m25084(bArr7), util.h.xy.ar.b.m25084(bArr8), bArr10);
        util.h.xy.ar.b.m25100(bArr2, bArr11, bArr4, bArr5, bArr, bArr6, bArr7, bArr8, bArr10, null);
        int i8 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i8 ^ 55) + ((i8 & 55) << 1)) % 128;
        return rcVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26914(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 49) % 128;
        java.lang.String m26922 = m26922(paymentType);
        if (m26922 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 23) % 128;
            if (!m26922.isEmpty()) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 75) % 128;
                z = true;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 79) % 128;
                return z;
            }
        }
        z = false;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 79) % 128;
        return z;
    }
}
