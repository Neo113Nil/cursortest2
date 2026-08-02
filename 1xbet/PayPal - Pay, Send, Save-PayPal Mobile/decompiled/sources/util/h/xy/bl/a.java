package util.h.xy.bl;

/* loaded from: classes18.dex */
public class a {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 113;

    /* renamed from: util.h.xy.bl.a$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ALREADY_ACTIVATED.ordinal()] = 2;
                int i = getHighSpeedVideoFpsRangesFor;
                int i2 = ((i | 45) << 1) - (i ^ 45);
                Camera2StreamConfigurationMap = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ACTIVATION_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED.ordinal()] = 4;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 109) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.UNSUPPORTED_CARD_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_NOT_EXISTING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i4 ^ 13) + ((i4 & 13) << 1)) % 128;
        }
    }

    private static byte[] Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.bf.c.f934.m25413();
            util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f981);
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413 = util.h.xy.bf.c.f934.m25413();
        util.h.xy.bk.ra m25506 = util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f981);
        if (m25506 != null) {
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i3 | 23) << 1) - (i3 ^ 23)) % 128;
            if (!((java.lang.Boolean) m25506.m25508()).booleanValue()) {
                int i4 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i4 | 7) << 1) - (i4 ^ 7)) % 128;
                getHighSpeedVideoSizes();
                util.h.xy.bf.ma.m25415(m25413, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.BIOFP_CONDITION_NOT_SATISFIED, util.h.xy.al.ra.f378);
                return util.h.xy.bf.b.f932;
            }
        }
        int i5 = getHighSpeedVideoFpsRangesFor + 111;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void getHighSpeedVideoSizes() {
        new util.h.xy.bl.ra().m25511(null);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 37) << 1) - (i ^ 37);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener) {
        boolean z;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 85) + (i | 85);
        getHighSpeedVideoFpsRanges = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                util.h.xy.k.ra.f2243.m26956();
                throw null;
            }
            util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
            if (m26956 == null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 3) % 128;
                getHighSpeedVideoSizes(contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD, util.h.xy.al.ra.f852);
                return true;
            }
            if (m26956.m26179() != null) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (((i3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                z = true;
            } else {
                z = false;
            }
            boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(m26956.m26180(), util.h.xy.bm.ma.f984.m25518(m26956.m26180()), contactlessPaymentServiceListener, false);
            if (!Camera2StreamConfigurationMap) {
                int i4 = getHighSpeedVideoFpsRanges + 45;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (z) {
                    boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m26956.m26179(), util.h.xy.bm.ma.f984.m25518(m26956.m26179()), contactlessPaymentServiceListener, true);
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 111) % 128;
                    return Camera2StreamConfigurationMap2;
                }
            }
            return Camera2StreamConfigurationMap;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            getHighSpeedVideoSizes(contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.STORAGE_COMPONENT_ERROR, e.getMessage());
            return true;
        }
    }

    private boolean Camera2StreamConfigurationMap(java.lang.String str, util.h.xy.d.b bVar, com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean m25513;
        int i = getHighSpeedVideoFpsRanges + 69;
        getHighSpeedVideoFpsRangesFor = i % 128;
        boolean z2 = true;
        if (i % 2 != 0 ? bVar == null : bVar == null) {
            getHighSpeedVideoSizes(contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_OUT_OF_PAYMENT_KEYS, util.h.xy.al.ra.f838);
        } else if (bVar.m26136() == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i2 | 115) << 1) - (i2 ^ 115)) % 128;
            getHighSpeedVideoSizes(contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_SUSPENDED);
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i3 & 83) + (i3 | 83)) % 128;
        } else if (bVar.m26139() > 0) {
            bVar.m26139();
            if (z) {
                int i4 = getHighSpeedVideoFpsRanges;
                int i5 = (i4 & 77) + (i4 | 77);
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 == 0) {
                    util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2186);
                    throw null;
                }
                m25513 = util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2186);
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 125) % 128;
            } else {
                m25513 = util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2192);
                int i6 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (((i6 | 119) << 1) - (i6 ^ 119)) % 128;
            }
            if (!m25513) {
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i7 = (identityHashCode ^ 1179620555) | (identityHashCode & 1179620555);
                int i8 = ((i7 ^ 1790786800) | (i7 & 1790786800)) * (-381);
                int i9 = ((i8 | 1537637542) << 1) - (i8 ^ 1537637542);
                int i10 = ~identityHashCode;
                int i11 = ~((i10 ^ 1179620555) | (i10 & 1179620555));
                int i12 = ((i11 ^ 71467019) | (i11 & 71467019) | 682633264) * 381;
                int i13 = ((i9 | i12) << 1) - (i12 ^ i9);
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i14 = ~identityHashCode2;
                int i15 = -(-(((i14 ^ 18917666) | (i14 & 18917666)) * 1324));
                int i16 = ~((158448034 ^ identityHashCode2) | (identityHashCode2 & 158448034));
                int i17 = ~(identityHashCode2 | 1697179951);
                int i18 = (i15 ^ 1790548571) + ((i15 & 1790548571) << 1) + (((i17 ^ i16) | (i17 & i16)) * (-1324));
                if ((i13 ^ (-849101580)) + (((-849101580) & i13) << 1) > (i18 & 787893406) + (787893406 | i18)) {
                    getHighSpeedVideoSizes(str);
                    throw null;
                }
                if (getHighSpeedVideoSizes(str)) {
                    util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f976, new util.h.xy.bk.ra(java.lang.Boolean.TRUE));
                    z2 = false;
                } else {
                    int i19 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = ((i19 ^ 95) + ((i19 & 95) << 1)) % 128;
                    getHighSpeedVideoSizes(contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, util.h.xy.al.ra.f295);
                    int i20 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = (((i20 | 13) << 1) - (i20 ^ 13)) % 128;
                }
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 57) % 128;
        } else if (bVar.m26139() <= 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            getHighSpeedVideoSizes(contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_OUT_OF_PAYMENT_KEYS, util.h.xy.al.ra.f838);
        } else {
            bVar.m26136();
            bVar.m26139();
        }
        int i21 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i21 & 25) + (i21 | 25)) % 128;
        return z2;
    }

    private static void getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f605);
        sb.append(util.h.xy.al.ra.f475);
        util.h.xy.am.ma.m25027(str, sb.toString());
        getHighSpeedVideoSizes(contactlessPaymentServiceListener, paymentServiceErrorCode, "");
        int i = getHighSpeedVideoFpsRanges + 75;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 43) + (i | 43)) % 128;
        if (util.h.xy.bf.mb.f938.m25426().m25397()) {
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = (i2 & 111) + (i2 | 111);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
            } else {
                util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
                throw null;
            }
        }
        util.h.xy.bf.ma.m25415(contactlessPaymentServiceListener, paymentServiceErrorCode, str);
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = (i4 ^ 107) + ((i4 & 107) << 1);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2189) && !util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2192)) {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i | 49) << 1) - (i ^ 49)) % 128;
            boolean m25514 = util.h.xy.bm.b.f983.m25514(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, true);
            if (!m25514) {
                int i2 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (((i2 | 67) << 1) - (i2 ^ 67)) % 128;
                return m25514;
            }
        }
        if (util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2200) && !util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2185)) {
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = ((i3 | 27) << 1) - (i3 ^ 27);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                boolean m255142 = util.h.xy.bm.b.f983.m25514(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, false);
                if (!m255142) {
                    return m255142;
                }
            } else {
                boolean m255143 = util.h.xy.bm.b.f983.m25514(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, true);
                if (!m255143) {
                    return m255143;
                }
            }
        }
        if (util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2187) && !util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2190)) {
            int i5 = getHighSpeedVideoFpsRangesFor;
            int i6 = ((i5 | 79) << 1) - (i5 ^ 79);
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 != 0) {
                boolean m255144 = util.h.xy.bm.b.f983.m25514(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP, true);
                if (!m255144) {
                    return m255144;
                }
            } else {
                boolean m255145 = util.h.xy.bm.b.f983.m25514(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP, true);
                if (!m255145) {
                    return m255145;
                }
            }
        }
        int i7 = getHighSpeedVideoFpsRangesFor + 9;
        getHighSpeedVideoFpsRanges = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Byte> m25509(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges + 61;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.bf.c.f934.m25413();
            Camera2StreamConfigurationMap();
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413 = util.h.xy.bf.c.f934.m25413();
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i2 | 99) << 1) - (i2 ^ 99)) % 128;
            com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m254132 = util.h.xy.bf.c.f934.m25413();
            util.h.xy.bk.ra m25506 = util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f976);
            if (m25506 != null) {
                int i3 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i3 | 105) << 1) - (i3 ^ 105)) % 128;
                if (!((java.lang.Boolean) m25506.m25508()).booleanValue()) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
                    if (getHighResolutionOutputSizeshNQ4ISI(m254132)) {
                        int i4 = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRangesFor = (((i4 | 105) << 1) - (i4 ^ 105)) % 128;
                        Camera2StreamConfigurationMap = util.h.xy.bf.b.f932;
                        if (Camera2StreamConfigurationMap != null) {
                            util.h.xy.bk.ra m255062 = util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f979);
                            if (m255062 != null && m255062.m25508() != null) {
                                switch (util.h.xy.bl.a.AnonymousClass1.getHighSpeedVideoSizes[((com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode) ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorCode()).ordinal()]) {
                                    case 1:
                                        if (util.h.xy.bf.mb.f938.m25426().m25397()) {
                                            util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
                                        }
                                        util.h.xy.bf.ma.m25422(((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorMessage(), m25413);
                                        util.h.xy.bk.mb.f982.m25507();
                                        Camera2StreamConfigurationMap = util.h.xy.bf.b.f932;
                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 81) % 128;
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorCode();
                                        getHighSpeedVideoSizes(m25413, (com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode) ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorCode(), ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorMessage());
                                        util.h.xy.bk.mb.f982.m25507();
                                        Camera2StreamConfigurationMap = util.h.xy.bf.b.f932;
                                        break;
                                    case 7:
                                        util.h.xy.bk.ra m255063 = util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f978);
                                        if (m255063 != null) {
                                            int i5 = getHighSpeedVideoFpsRanges;
                                            getHighSpeedVideoFpsRangesFor = (((i5 | 109) << 1) - (i5 ^ 109)) % 128;
                                            if (m255063.m25508() != null) {
                                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 103) % 128;
                                                if (((util.h.xy.u.ma) m255063.m25508()).m27528() == util.h.xy.aa.d.f64 || ((util.h.xy.u.ma) m255063.m25508()).m27528() == util.h.xy.aa.d.f66) {
                                                    getHighSpeedVideoSizes();
                                                    int i6 = getHighSpeedVideoFpsRangesFor;
                                                    getHighSpeedVideoFpsRanges = ((i6 & 13) + (i6 | 13)) % 128;
                                                }
                                            }
                                        }
                                        ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorCode();
                                        getHighSpeedVideoSizes(m25413, (com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode) ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorCode(), ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorMessage());
                                        util.h.xy.bk.mb.f982.m25507();
                                        Camera2StreamConfigurationMap = util.h.xy.bf.b.f932;
                                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 9) % 128;
                                        break;
                                    default:
                                        ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorCode();
                                        getHighSpeedVideoSizes(m25413, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.BIOFP_CONDITION_NOT_SATISFIED, ((com.gemalto.mfs.mwsdk.sdkconfig.SDKError) m255062.m25508()).getErrorMessage());
                                        util.h.xy.bk.mb.f982.m25507();
                                        Camera2StreamConfigurationMap = util.h.xy.bf.b.f932;
                                        break;
                                }
                            } else {
                                Camera2StreamConfigurationMap = null;
                            }
                        } else {
                            int i7 = getHighSpeedVideoFpsRanges;
                            int i8 = ((i7 | 87) << 1) - (i7 ^ 87);
                            getHighSpeedVideoFpsRangesFor = i8 % 128;
                            if (i8 % 2 == 0) {
                                int length = Camera2StreamConfigurationMap.length;
                                throw new java.lang.ArithmeticException();
                            }
                            if (Camera2StreamConfigurationMap.length > 0) {
                                getHighSpeedVideoFpsRangesFor = (i7 + 101) % 128;
                                util.h.xy.ar.b.m25074(Camera2StreamConfigurationMap);
                            }
                            int i9 = getHighSpeedVideoFpsRangesFor;
                            getHighSpeedVideoFpsRanges = (((i9 | 55) << 1) - (i9 ^ 55)) % 128;
                        }
                    }
                }
            }
            int i10 = getHighSpeedVideoFpsRangesFor + 79;
            getHighSpeedVideoFpsRanges = i10 % 128;
            if (i10 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            Camera2StreamConfigurationMap = null;
            if (Camera2StreamConfigurationMap != null) {
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (Camera2StreamConfigurationMap != null) {
            int i11 = getHighSpeedVideoFpsRanges;
            int i12 = ((i11 | 47) << 1) - (i11 ^ 47);
            getHighSpeedVideoFpsRangesFor = i12 % 128;
            if (i12 % 2 == 0) {
                int length2 = Camera2StreamConfigurationMap.length;
                throw null;
            }
            if (Camera2StreamConfigurationMap.length != 0) {
                for (byte b : Camera2StreamConfigurationMap) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 119) % 128;
                    arrayList.add(java.lang.Byte.valueOf(b));
                }
                int i13 = getHighSpeedVideoFpsRangesFor;
                int i14 = (i13 & 7) + (i13 | 7);
                getHighSpeedVideoFpsRanges = i14 % 128;
                if (i14 % 2 == 0) {
                    return arrayList;
                }
                throw null;
            }
        }
        int i15 = getHighSpeedVideoFpsRangesFor + 81;
        getHighSpeedVideoFpsRanges = i15 % 128;
        if (i15 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
