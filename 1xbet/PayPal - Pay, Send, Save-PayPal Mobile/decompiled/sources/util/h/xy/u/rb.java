package util.h.xy.u;

/* loaded from: classes5.dex */
public class rb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r37.length == 0) goto L53;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m27547(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12) {
        boolean z;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 105) + (i | 105)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (bArr != null) {
            int i3 = i2 + 9;
            int i4 = i3 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                if (bArr2 != null) {
                    getHighSpeedVideoFpsRangesFor = (i4 + 93) % 128;
                    if (bArr2.length != 0) {
                        boolean z2 = true;
                        if (bArr3 == null || bArr3.length == 0) {
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m27686 = util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.WRONG_DIGITALIZED_CARD_STATE, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_WRONG_DIGITALIZED_CARD_STATE);
                            int i5 = getHighSpeedVideoFpsRangesFor;
                            getHighResolutionOutputSizeshNQ4ISI = (((i5 | 13) << 1) - (i5 ^ 13)) % 128;
                            return m27686;
                        }
                        if (bArr4 == null || bArr4.length == 0) {
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m276862 = util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.MINIMUM_PAYMENT_CREDS_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_MINIMUM_PAYMENT_CREDS_NULL);
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
                            return m276862;
                        }
                        if (bArr5 != null) {
                            int i6 = i4 + 79;
                            int i7 = i6 % 128;
                            getHighSpeedVideoFpsRangesFor = i7;
                            if (i6 % 2 != 0) {
                                int length2 = bArr5.length;
                                throw null;
                            }
                            if (bArr5.length != 0) {
                                if (bArr7 == null || bArr7.length == 0) {
                                    return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.MINDAY_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_MINDAY_NULL);
                                }
                                if (bArr8 != null) {
                                    int i8 = i7 + 109;
                                    getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        int length3 = bArr8.length;
                                        throw new java.lang.ArithmeticException();
                                    }
                                    if (bArr8.length != 0) {
                                        if (bArr10 == null || bArr10.length == 0) {
                                            return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ATC_START_INDEX_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ATC_START_INDEX_NULL);
                                        }
                                        if (bArr9 == null || bArr9.length == 0) {
                                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m276863 = util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.CACHED_ATC_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CACHED_ATC_NULL);
                                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
                                            return m276863;
                                        }
                                        if (bArr11 != null) {
                                            int i9 = ((i7 | 59) << 1) - (i7 ^ 59);
                                            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                int length4 = bArr11.length;
                                                throw null;
                                            }
                                            if (bArr11.length != 0) {
                                                if (util.h.xy.u.d.m27513(bArr6) == util.h.xy.d.mg.f1144) {
                                                    int i10 = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
                                                    getHighSpeedVideoFpsRangesFor = i10;
                                                    if (bArr12 != null) {
                                                        int i11 = (i10 & 101) + (i10 | 101);
                                                        getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
                                                        if (i11 % 2 == 0) {
                                                            int length5 = bArr12.length;
                                                            throw new java.lang.ArithmeticException();
                                                        }
                                                    }
                                                    return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.LUK_PAY_REMAINING_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_LUK_PAY_REMAINING_NULL);
                                                }
                                                if (bArr5 != null) {
                                                    int i12 = getHighResolutionOutputSizeshNQ4ISI;
                                                    int i13 = (((i12 | 65) << 1) - (i12 ^ 65)) % 128;
                                                    getHighSpeedVideoFpsRangesFor = i13;
                                                    if (bArr5[0] == 0) {
                                                        z2 = false;
                                                    } else {
                                                        getHighResolutionOutputSizeshNQ4ISI = (i13 + 27) % 128;
                                                    }
                                                    int i14 = (i13 & 111) + (i13 | 111);
                                                    getHighResolutionOutputSizeshNQ4ISI = i14 % 128;
                                                    if (i14 % 2 == 0) {
                                                        int i15 = 3 / 5;
                                                    }
                                                    z = z2;
                                                } else {
                                                    z = false;
                                                }
                                                return util.h.xy.x.a.m27696(new util.h.xy.d.b(util.h.xy.ar.b.m25084(bArr), util.h.xy.ar.b.m25084(bArr2), util.h.xy.ar.b.m25084(bArr4), util.h.xy.u.d.m27509(bArr3), z, util.h.xy.u.d.m27513(bArr6), util.h.xy.ar.b.m25084(bArr7), util.h.xy.ar.b.m25084(bArr8), util.h.xy.ar.b.m25084(bArr9), util.h.xy.ar.b.m25084(bArr10), util.h.xy.ar.b.m25084(bArr11), util.h.xy.ar.b.m25084(bArr12)));
                                            }
                                        }
                                        return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.REP_COUNTER_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_REP_COUNTER_NULL);
                                    }
                                }
                                return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.NEXT_ATC_INDEX_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_NEXT_ATC_INDEX_NULL);
                            }
                        }
                        return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.CARD_HAS_PROVISIONED_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CARD_HAS_PROVISIONED_NULL);
                    }
                }
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> m276864 = util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.NUMBER_OF_CREDS_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_NUMBER_OF_CREDS_NULL);
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
                return m276864;
            }
        }
        return util.h.xy.x.a.m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ATC_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ATC_NULL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r18.length == 0) goto L7;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.rb> m27546(boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 41) + (i | 41)) % 128;
        if (z) {
            if (bArr6 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (i + 103) % 128;
            }
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.rb> m27691 = util.h.xy.x.a.m27691(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.KEY_EXPIRY_DATE_NULL, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_KEY_EXPIRY_DATE_NULL);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i2 & 21) + (i2 | 21)) % 128;
            return m27691;
        }
        util.h.xy.d.rb.a aVar = util.h.xy.d.rb.a.f1149;
        int m25084 = util.h.xy.ar.b.m25084(bArr2);
        java.lang.String str = new java.lang.String(bArr4);
        if (util.h.xy.d.rb.a.f1149.m26236() == m25084) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
            aVar = util.h.xy.d.rb.a.f1149;
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 59) + ((i3 & 59) << 1)) % 128;
        } else if (util.h.xy.d.rb.a.f1146.m26236() == m25084) {
            aVar = util.h.xy.d.rb.a.f1146;
        } else if (util.h.xy.d.rb.a.f1147.m26236() == m25084) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (((i4 | 69) << 1) - (i4 ^ 69)) % 128;
            aVar = util.h.xy.d.rb.a.f1147;
        } else if (util.h.xy.d.rb.a.f1148.m26236() == m25084) {
            int i5 = getHighSpeedVideoFpsRangesFor;
            int i6 = (i5 ^ 9) + ((i5 & 9) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                util.h.xy.d.rb.a aVar2 = util.h.xy.d.rb.a.f1148;
                throw null;
            }
            aVar = util.h.xy.d.rb.a.f1148;
        } else if (util.h.xy.d.rb.a.f1150.m26236() == m25084) {
            int i7 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i7 ^ 121) + ((i7 & 121) << 1)) % 128;
            aVar = util.h.xy.d.rb.a.f1150;
        }
        util.h.xy.d.rb.a aVar3 = aVar;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.rb> m27696 = util.h.xy.x.a.m27696(new util.h.xy.d.rb(util.h.xy.ar.b.m25084(bArr), aVar3, bArr3, str, bArr5, new java.lang.String(bArr6), util.h.xy.ar.b.m25084(bArr7), com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.getProfileChannel(bArr8)));
        util.h.xy.ar.b.m25100(bArr, bArr2);
        return m27696;
    }
}
