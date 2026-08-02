package com.payair.hce;

/* loaded from: classes4.dex */
class setTransitionAlpha extends com.payair.hce.setPivotX {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~i3;
        switch ((i * 495) + (i2 * (-493)) + ((i | i4) * (-988)) + ((i2 | i5 | i6) * 494) + (((~(i | i2)) | (~(i2 | i6)) | (~(i4 | i5))) * 494)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return values(objArr);
            case 4:
                return valueOf(objArr);
            case 5:
                byte[] bArr = (byte[]) objArr[0];
                int i7 = IccPrivateKeyCrtComponentsJson;
                values = (((i7 & (-8)) | ((~i7) & 7)) + ((i7 & 7) << 1)) % 128;
                if (bArr != null) {
                    int i8 = i7 & 3;
                    int i9 = -(-((i7 ^ 3) | i8));
                    values = ((i8 & i9) + (i8 | i9)) % 128;
                    int length = bArr.length;
                    values = ((((i7 | 6) << 1) - (i7 ^ 6)) - 1) % 128;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = values;
                        int i12 = (i11 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i11 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1);
                        int i13 = (~i12) + (i12 << 1);
                        IccPrivateKeyCrtComponentsJson = i13 % 128;
                        if (i13 % 2 == 0) {
                            bArr[i10] = 1;
                            i10 = ((i10 | 69) << 1) - (i10 ^ 69);
                        } else {
                            bArr[i10] = 0;
                            int i14 = ((i10 ^ (-2)) + ((i10 & (-2)) << 1)) - 1;
                            i10 = ((i14 & (-5)) | ((~i14) & 4)) + ((i14 & 4) << 1);
                        }
                    }
                }
                int i15 = values;
                int i16 = i15 & 89;
                IccPrivateKeyCrtComponentsJson = (i16 + ((i15 ^ 89) | i16)) % 128;
                return null;
            case 6:
                return getProfileVersion(objArr);
            case 7:
                return getAid(objArr);
            case 8:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 9:
                com.payair.hce.initializeVisaPaymentSdk writeReplace = super.writeReplace((byte[]) objArr[1]);
                com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = new com.payair.hce.checkAutomaticTimeSettings((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace}, -1877837077, 1877837077, java.lang.System.identityHashCode(writeReplace)));
                int i17 = values;
                int i18 = i17 & 101;
                IccPrivateKeyCrtComponentsJson = (((i17 | 101) & (~i18)) + (i18 << 1)) % 128;
                return checkautomatictimesettings;
            case 10:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 11:
                com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
                int i19 = values;
                int i20 = i19 & 61;
                int i21 = (i19 | 61) & (~i20);
                int i22 = -(-(i20 << 1));
                IccPrivateKeyCrtComponentsJson = ((i21 & i22) + (i21 | i22)) % 128;
                super.RecordsJson();
                int i23 = values;
                IccPrivateKeyCrtComponentsJson = (((i23 | 27) << 1) - ((i23 & (-28)) | ((~i23) & 27))) % 128;
                return null;
            case 12:
                return RecordsJson(objArr);
            case 13:
                return getPaymentFci(objArr);
            case 14:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 15:
                return getCvrMaskAnd(objArr);
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    setTransitionAlpha(android.content.Context context) throws java.security.GeneralSecurityException, java.io.IOException {
        super(context);
        try {
            values(new java.lang.Object[]{this}, 399555928, -399555917, java.lang.System.identityHashCode(this));
        } catch (java.security.GeneralSecurityException unused) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2011275265, -2011275228, (int) java.lang.System.currentTimeMillis());
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        int i = values;
        int i2 = i & 69;
        int i3 = i | 69;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 != 0) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.payair.hce.setAlpha>> it = settransitionalpha.DigitizedCardProfile.entrySet().iterator();
            int i5 = values;
            IccPrivateKeyCrtComponentsJson = ((((i5 & (-12)) | ((~i5) & 11)) - (~((i5 & 11) << 1))) - 1) % 128;
            while (it.hasNext()) {
                int i6 = IccPrivateKeyCrtComponentsJson;
                int i7 = i6 & 57;
                int i8 = (i6 | 57) & (~i7);
                int i9 = -(-(i7 << 1));
                int i10 = (i8 & i9) + (i8 | i9);
                values = i10 % 128;
                if (i10 % 2 == 0) {
                    com.payair.hce.setAlpha value = it.next().getValue();
                    com.payair.hce.setAlpha.values(new java.lang.Object[]{value}, 6408503, -6408499, java.lang.System.identityHashCode(value));
                    int i11 = IccPrivateKeyCrtComponentsJson;
                    int i12 = (i11 ^ 12) + ((i11 & 12) << 1);
                    int i13 = (~i12) + (i12 << 1);
                    values = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    com.payair.hce.setAlpha value2 = it.next().getValue();
                    com.payair.hce.setAlpha.values(new java.lang.Object[]{value2}, 6408503, -6408499, java.lang.System.identityHashCode(value2));
                    throw null;
                }
            }
            int i15 = values;
            int i16 = i15 ^ 85;
            int i17 = ((i15 & 85) | i16) << 1;
            int i18 = -i16;
            int i19 = (i17 & i18) + (i17 | i18);
            IccPrivateKeyCrtComponentsJson = i19 % 128;
            if (i19 % 2 != 0) {
                return java.lang.Boolean.TRUE;
            }
            throw new java.lang.ArithmeticException();
        }
        settransitionalpha.DigitizedCardProfile.entrySet().iterator();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener;
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2;
        int i;
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        int i2 = values;
        IccPrivateKeyCrtComponentsJson = ((i2 & 35) + (i2 | 35)) % 128;
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener3 = null;
        try {
            setoncapturedpointerlistener2 = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{settransitionalpha, str2}, 1464714136, -1464714130, java.lang.System.identityHashCode(settransitionalpha));
            if (setoncapturedpointerlistener2 == null) {
                try {
                    byte[] values2 = new com.payair.hce.setVisibility().values();
                    com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
                    com.payair.hce.setVisibility setvisibility = settransitionalpha.writeReplace;
                    setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) com.payair.hce.setFitsSystemWindows.values(new java.lang.Object[]{setvisibility, values2, str2, str}, -1909065528, 1909065542, java.lang.System.identityHashCode(setvisibility));
                    try {
                    } catch (java.lang.Exception unused) {
                        if (setoncapturedpointerlistener2 != null) {
                            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener2));
                            int i3 = IccPrivateKeyCrtComponentsJson;
                            int i4 = i3 & 13;
                            int i5 = (i3 ^ 13) | i4;
                            values = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
                        }
                        if (setoncapturedpointerlistener != null) {
                            int i6 = values;
                            IccPrivateKeyCrtComponentsJson = ((i6 & 85) + (i6 | 85)) % 128;
                            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                            int i7 = values;
                            int i8 = i7 & 25;
                            int i9 = -(-((i7 ^ 25) | i8));
                            IccPrivateKeyCrtComponentsJson = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                            return null;
                        }
                        i = IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        values = i % 128;
                        if (i % 2 != 0) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        setoncapturedpointerlistener3 = setoncapturedpointerlistener2;
                        if (setoncapturedpointerlistener3 != null) {
                            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener3}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener3));
                            int i10 = values;
                            int i11 = i10 ^ 119;
                            int i12 = ((i10 & 119) | i11) << 1;
                            int i13 = -i11;
                            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                            IccPrivateKeyCrtComponentsJson = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i15 = 5 / 3;
                            }
                        }
                        if (setoncapturedpointerlistener != null) {
                            int i16 = IccPrivateKeyCrtComponentsJson;
                            values = ((i16 ^ 121) + ((i16 & 121) << 1)) % 128;
                            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                            int i17 = values;
                            IccPrivateKeyCrtComponentsJson = (((i17 | 57) << 1) - (i17 ^ 57)) % 128;
                        }
                        throw th;
                    }
                    try {
                        values(new java.lang.Object[]{values2}, -1230318647, 1230318652, (int) java.lang.System.currentTimeMillis());
                        int i18 = values;
                        int i19 = i18 & 39;
                        int i20 = (i18 | 39) & (~i19);
                        int i21 = i19 << 1;
                        IccPrivateKeyCrtComponentsJson = (((i20 | i21) << 1) - (i20 ^ i21)) % 128;
                        setoncapturedpointerlistener2 = setoncapturedpointerlistener;
                    } catch (java.lang.Exception unused2) {
                        setoncapturedpointerlistener2 = setoncapturedpointerlistener;
                        setoncapturedpointerlistener = setoncapturedpointerlistener2;
                        if (setoncapturedpointerlistener2 != null) {
                        }
                        if (setoncapturedpointerlistener != null) {
                        }
                        i = IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        values = i % 128;
                        if (i % 2 != 0) {
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        setoncapturedpointerlistener3 = setoncapturedpointerlistener;
                        if (setoncapturedpointerlistener3 != null) {
                        }
                        if (setoncapturedpointerlistener != null) {
                        }
                        throw th;
                    }
                } catch (java.lang.Exception unused3) {
                    setoncapturedpointerlistener = null;
                    if (setoncapturedpointerlistener2 != null) {
                    }
                    if (setoncapturedpointerlistener != null) {
                    }
                    i = IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    values = i % 128;
                    if (i % 2 != 0) {
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    setoncapturedpointerlistener = null;
                    setoncapturedpointerlistener3 = setoncapturedpointerlistener2;
                    if (setoncapturedpointerlistener3 != null) {
                    }
                    if (setoncapturedpointerlistener != null) {
                    }
                    throw th;
                }
            } else {
                setoncapturedpointerlistener = null;
            }
            settransitionalpha.AlternateContactlessPaymentDataJson.put(str2, setoncapturedpointerlistener2);
            if (settransitionalpha.DigitizedCardProfile != null) {
                settransitionalpha.DigitizedCardProfile.put(str2, new com.payair.hce.setAlpha(str2, settransitionalpha.valueOf));
                int i22 = IccPrivateKeyCrtComponentsJson;
                values = (((i22 | 5) << 1) - (i22 ^ 5)) % 128;
            }
            if (setoncapturedpointerlistener2 != null) {
                int i23 = values + 21;
                IccPrivateKeyCrtComponentsJson = i23 % 128;
                if (i23 % 2 == 0) {
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener2));
                    throw null;
                }
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener2));
            }
            if (setoncapturedpointerlistener != null) {
                int i24 = values;
                int i25 = i24 & 121;
                int i26 = i25 + ((i24 ^ 121) | i25);
                IccPrivateKeyCrtComponentsJson = i26 % 128;
                if (i26 % 2 != 0) {
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    return null;
                }
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                throw null;
            }
        } catch (java.lang.Exception unused4) {
            setoncapturedpointerlistener2 = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            setoncapturedpointerlistener = null;
        }
        i = IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        values = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener;
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 79) | (i & 79)) << 1;
        int i3 = -((i & (-80)) | ((~i) & 79));
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2 = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{settransitionalpha, str2}, 1464714136, -1464714130, java.lang.System.identityHashCode(settransitionalpha));
        if (setoncapturedpointerlistener2 == null) {
            com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener3 = new com.payair.hce.setOnCapturedPointerListener(str2, str, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{new com.payair.hce.setVisibility().writeReplace()}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis()));
            com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
            com.payair.hce.setVisibility setvisibility = settransitionalpha.writeReplace;
            setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) com.payair.hce.setFitsSystemWindows.values(new java.lang.Object[]{setvisibility, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener3}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), str2, str}, -1909065528, 1909065542, java.lang.System.identityHashCode(setvisibility));
            int i5 = IccPrivateKeyCrtComponentsJson;
            int i6 = i5 & 75;
            values = ((i6 - (~((i5 ^ 75) | i6))) - 1) % 128;
            setoncapturedpointerlistener2 = setoncapturedpointerlistener3;
        } else {
            setoncapturedpointerlistener = null;
        }
        settransitionalpha.AlternateContactlessPaymentDataJson.put(str2, setoncapturedpointerlistener2);
        if (setoncapturedpointerlistener != null) {
            int i7 = IccPrivateKeyCrtComponentsJson;
            int i8 = (i7 & (-44)) | ((~i7) & 43);
            int i9 = (i7 & 43) << 1;
            values = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
            int i10 = values;
            IccPrivateKeyCrtComponentsJson = ((i10 & 49) + (i10 | 49)) % 128;
        }
        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener2));
        values = (IccPrivateKeyCrtComponentsJson + 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = new com.payair.hce.setIsCredential().AlternateContactlessPaymentDataJson(null, null, (java.lang.String) objArr[1]);
        if (AlternateContactlessPaymentDataJson == null) {
            int i = (values + 31) % 128;
            IccPrivateKeyCrtComponentsJson = i;
            int i2 = ((i ^ 65) | (i & 65)) << 1;
            int i3 = -((i & (-66)) | ((~i) & 65));
            values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            return null;
        }
        int i4 = IccPrivateKeyCrtComponentsJson;
        int i5 = i4 & 117;
        int i6 = (i4 ^ 117) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i | 63;
        int i3 = i2 << 1;
        int i4 = -((~(i & 63)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            new com.payair.hce.setIsCredential();
            settransitionalpha.AlternateContactlessPaymentDataJson.remove(str);
            int i6 = IccPrivateKeyCrtComponentsJson;
            int i7 = i6 & 13;
            int i8 = i6 | 13;
            values = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        }
        int i9 = values;
        IccPrivateKeyCrtComponentsJson = ((((i9 & (-72)) | ((~i9) & 71)) - (~((i9 & 71) << 1))) - 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        com.payair.hce.internalEndTransaction internalendtransaction = new com.payair.hce.internalEndTransaction(new com.payair.hce.assertNotMainThread());
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = settransitionalpha.AlternateContactlessPaymentDataJson.get(str);
        internalendtransaction.DigitizedCardProfile(new com.payair.hce.getErrorDialog((byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())));
        byte[] bArr2 = new byte[((java.lang.Integer) com.payair.hce.internalEndTransaction.writeReplace(new java.lang.Object[]{internalendtransaction}, -1727069471, 1727069471, java.lang.System.identityHashCode(internalendtransaction))).intValue()];
        internalendtransaction.AlternateContactlessPaymentDataJson(bArr, bArr.length);
        internalendtransaction.valueOf(bArr2);
        internalendtransaction.AlternateContactlessPaymentDataJson();
        int i = values;
        int i2 = i ^ 57;
        int i3 = ((((i & 57) | i2) << 1) - (~(-i2))) - 1;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 95;
        int i3 = i | 95;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                byte[] values2 = settransitionalpha.DigitizedCardProfile.get(str).values(bArr);
                int i5 = values;
                int i6 = (i5 & 1) + (i5 | 1);
                IccPrivateKeyCrtComponentsJson = i6 % 128;
                if (i6 % 2 != 0) {
                    return values2;
                }
                throw null;
            }
            settransitionalpha.DigitizedCardProfile.get(str).values(bArr);
            throw new java.lang.NullPointerException();
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        int i = values;
        int i2 = ((i ^ 105) | (i & 105)) << 1;
        int i3 = -((i & (-106)) | ((~i) & 105));
        int i4 = (i2 & i3) + (i3 | i2);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                byte[] DigitizedCardProfile = settransitionalpha.DigitizedCardProfile.get(str).DigitizedCardProfile(bArr);
                int i5 = values;
                int i6 = ((i5 ^ 89) | (i5 & 89)) << 1;
                int i7 = -((i5 & (-90)) | ((~i5) & 89));
                int i8 = (i6 & i7) + (i7 | i6);
                IccPrivateKeyCrtComponentsJson = i8 % 128;
                if (i8 % 2 != 0) {
                    return DigitizedCardProfile;
                }
                throw new java.lang.ArithmeticException();
            }
            settransitionalpha.DigitizedCardProfile.get(str).DigitizedCardProfile(bArr);
            throw null;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = values;
        int i2 = i ^ 13;
        IccPrivateKeyCrtComponentsJson = ((((i & 13) | i2) << 1) - i2) % 128;
        com.payair.hce.isSessionAvailable DigitizedCardProfile = super.DigitizedCardProfile(bArr);
        int i3 = values;
        int i4 = ((i3 ^ 4) + ((i3 & 4) << 1)) - 1;
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 != 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = values;
        int i2 = i & 19;
        int i3 = ((i | 19) & (~i2)) + (i2 << 1);
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            super.writeReplace(bArr);
            throw null;
        }
        com.payair.hce.initializeVisaPaymentSdk writeReplace = super.writeReplace(bArr);
        int identityHashCode = java.lang.System.identityHashCode(settransitionalpha);
        int i4 = identityHashCode ^ (-1152672513);
        int i5 = ~identityHashCode;
        int i6 = identityHashCode & (-1152672513);
        int i7 = ~((i6 ^ i4) | (i6 & i4));
        int i8 = ((~i7) & 725715148) | ((-725715149) & i7);
        int i9 = i7 & 725715148;
        int i10 = ((i9 ^ i8) | (i9 & i8)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
        int i11 = i10 & 1404004824;
        int i12 = -(-((i10 ^ 1404004824) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 & com.google.android.gms.auth.api.proxy.AuthApiStatusCodes.AUTH_APP_CERT_ERROR;
        int i15 = i14 + ((i13 ^ com.google.android.gms.auth.api.proxy.AuthApiStatusCodes.AUTH_APP_CERT_ERROR) | i14);
        int i16 = i5 & (-1152672516);
        int i17 = ((-1152672516) | i5) & (~i16);
        int i18 = (i17 ^ i16) | (i17 & i16);
        int i19 = i18 & 725715151;
        int i20 = (i18 | 725715151) & (~i19);
        int i21 = -(-((~((i20 ^ i19) | (i20 & i19))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
        int i22 = i15 & i21;
        int i23 = (i15 ^ i21) | i22;
        int identityHashCode2 = java.lang.System.identityHashCode(settransitionalpha);
        int i24 = identityHashCode2 & 2117651091;
        int i25 = ~identityHashCode2;
        int i26 = ~(((2117651091 | identityHashCode2) & (~i24)) | i24);
        int i27 = i25 ^ (-1580746771);
        int i28 = i25 & (-1580746771);
        int i29 = i27 | i28;
        int i30 = ((~i29) & (-538479252)) | (i29 & 538479251) | (i29 & (-538479252));
        int i31 = ~i30;
        int i32 = (i30 | i31) & i31;
        int i33 = i26 ^ i32;
        int i34 = i26 & i32;
        int i35 = ((i34 ^ i33) | (i34 & i33)) * (-318);
        int i36 = i35 & (-1390636773);
        int i37 = identityHashCode2 & 1580746770;
        int i38 = ~(((-1580746771) & identityHashCode2) | i28 | i37);
        int i39 = ((i36 + ((i35 ^ (-1390636773)) | i36)) - (~(-(-((((1579171840 & (~i38)) | (i38 & (-1579171841))) | (i38 & 1579171840)) * (-318)))))) - 1;
        int i40 = (identityHashCode2 | 1580746770) & (~i37);
        int i41 = (i40 ^ i37) | (i40 & i37);
        int i42 = ~i41;
        int i43 = (i41 | i42) & i42;
        int i44 = ((~i43) & 538479251) | (i43 & (-538479252));
        int i45 = i43 & 538479251;
        int i46 = ((i45 ^ i44) | (i45 & i44)) * 318;
        int i47 = i39 & i46;
        int i48 = -(-(i46 | i39));
        if ((i22 ^ i23) + ((i23 & i22) << 1) > ((i47 | i48) << 1) - (i48 ^ i47)) {
            return writeReplace;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        int i = IccPrivateKeyCrtComponentsJson;
        values = (((i | 81) << 1) - (i ^ 81)) % 128;
        byte[] values2 = super.values(bArr, bArr2);
        int i2 = IccPrivateKeyCrtComponentsJson;
        int i3 = i2 & 63;
        int i4 = i3 + ((i2 ^ 63) | i3);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return values2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        int i = values;
        int i2 = (i & (-78)) | ((~i) & 77);
        int i3 = (i & 77) << 1;
        IccPrivateKeyCrtComponentsJson = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        byte[] DigitizedCardProfile = super.DigitizedCardProfile(bArr, bArr2);
        int i4 = IccPrivateKeyCrtComponentsJson;
        int i5 = i4 & 59;
        int i6 = -(-(i4 | 59));
        int i7 = (i5 & i6) + (i6 | i5);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return DigitizedCardProfile;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionAlpha settransitionalpha = (com.payair.hce.setTransitionAlpha) objArr[0];
        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) objArr[1];
        int identityHashCode = java.lang.System.identityHashCode(settransitionalpha);
        int i = ~identityHashCode;
        int i2 = i & 74617259;
        int i3 = (~i2) & (i | 74617259);
        int i4 = (i2 ^ i3) | (i2 & i3);
        int i5 = ~i4;
        int i6 = (i4 | i5) & i5;
        int i7 = i & (-2013540878);
        int i8 = (2013540877 & identityHashCode) | i7;
        int i9 = identityHashCode & (-2013540878);
        int i10 = ~((i8 ^ i9) | (i8 & i9));
        int i11 = ((~i10) & i6) | ((~i6) & i10);
        int i12 = i6 & i10;
        int i13 = (((i12 ^ i11) | (i12 & i11)) * 959) + 1043406972;
        int i14 = i13 & 1456492651;
        int i15 = -(-((i13 ^ 1456492651) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = identityHashCode & 74617259;
        int i18 = (identityHashCode | 74617259) & (~i17);
        int i19 = ~((i18 ^ i17) | (i17 & i18));
        int i20 = (i ^ (-2013540878)) | i7;
        int i21 = ~i20;
        int i22 = (i20 | i21) & i21;
        int i23 = -(-((((~i19) & i22) | ((~i22) & i19) | (i22 & i19)) * 959));
        int identityHashCode2 = java.lang.System.identityHashCode(settransitionalpha);
        int i24 = ((-307303825) ^ identityHashCode2) | (identityHashCode2 & (-307303825));
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = ~identityHashCode2;
        int i28 = ~i27;
        int i29 = (1840169549 & i28) | ((-1840169550) & i27) | (i27 & 1840169549);
        int i30 = i29 & 309581720;
        int i31 = (i29 | 309581720) & (~i30);
        int i32 = ~((i31 ^ i30) | (i31 & i30));
        int i33 = -(~(-(-((((~i26) & i32) | ((~i32) & i26) | (i26 & i32)) * 497))));
        int i34 = (309581720 & i27) | (i28 & (-309581721));
        int i35 = i27 & (-309581721);
        int i36 = ~((i35 ^ i34) | (i35 & i34));
        int i37 = i36 ^ 2277896;
        int i38 = i36 & 2277896;
        int i39 = (i38 ^ i37) | (i38 & i37);
        int i40 = (identityHashCode2 ^ 2147473373) | (identityHashCode2 & 2147473373);
        int i41 = ~i40;
        int i42 = (i40 | i41) & i41;
        int i43 = i42 & i39;
        java.util.concurrent.Future<byte[]> values2 = super.values(initializevisapaymentsdk);
        if ((((i16 | i23) << 1) - (~(-(i23 ^ i16)))) - 1 > (-2) - (~(((((i33 | 1368497456) << 1) - (1368497456 ^ i33)) - 1) - (~(-(-(((i42 ^ i39) | i43) * 497))))))) {
            throw new java.lang.ArithmeticException();
        }
        int i44 = (-2) - (~(IccPrivateKeyCrtComponentsJson + 90));
        values = i44 % 128;
        if (i44 % 2 == 0) {
            return values2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getGpoResponse(byte[] bArr) {
        values(new java.lang.Object[]{bArr}, -1230318647, 1230318652, (int) java.lang.System.currentTimeMillis());
    }

    final java.util.concurrent.Future<byte[]> AlternateContactlessPaymentDataJson(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) values(new java.lang.Object[]{this, initializevisapaymentsdk}, 1735867052, -1735867048, java.lang.System.identityHashCode(this));
    }

    final byte[] IccPrivateKeyCrtComponentsJson(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) values(new java.lang.Object[]{this, bArr, bArr2}, -1532971113, 1532971120, java.lang.System.identityHashCode(this));
    }

    final byte[] writeReplace(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) values(new java.lang.Object[]{this, bArr, bArr2}, 1273890719, -1273890707, java.lang.System.identityHashCode(this));
    }

    final com.payair.hce.initializeVisaPaymentSdk getAid(byte[] bArr) throws java.security.GeneralSecurityException {
        return (com.payair.hce.initializeVisaPaymentSdk) values(new java.lang.Object[]{this, bArr}, 202220383, -202220375, java.lang.System.identityHashCode(this));
    }

    final com.payair.hce.isSessionAvailable RecordsJson(byte[] bArr) throws java.security.GeneralSecurityException {
        return (com.payair.hce.isSessionAvailable) values(new java.lang.Object[]{this, bArr}, -1613709807, 1613709820, java.lang.System.identityHashCode(this));
    }

    final com.payair.hce.checkAutomaticTimeSettings IccPrivateKeyCrtComponentsJson(byte[] bArr) throws java.security.GeneralSecurityException {
        return (com.payair.hce.checkAutomaticTimeSettings) values(new java.lang.Object[]{this, bArr}, -1372350044, 1372350053, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final byte[] values(java.lang.String str, byte[] bArr) {
        return (byte[]) values(new java.lang.Object[]{this, str, bArr}, 195599839, -195599829, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final byte[] writeReplace(java.lang.String str, byte[] bArr) {
        return (byte[]) values(new java.lang.Object[]{this, str, bArr}, 159488, -159488, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final byte[] valueOf(java.lang.String str, byte[] bArr) throws java.security.UnrecoverableEntryException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        return (byte[]) values(new java.lang.Object[]{this, str, bArr}, -473428158, 473428173, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final void valueOf(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -139726939, 139726942, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson(java.lang.String str) throws java.security.UnrecoverableEntryException, java.security.NoSuchAlgorithmException {
        return (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, str}, 1464714136, -1464714130, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final void valueOf(java.lang.String str, java.lang.String str2) throws java.security.GeneralSecurityException {
        values(new java.lang.Object[]{this, str, str2}, 2054736201, -2054736187, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final void values(java.lang.String str, java.lang.String str2) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        values(new java.lang.Object[]{this, str, str2}, -1207040519, 1207040520, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setPivotX
    final boolean getAid() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -399116324, 399116326, java.lang.System.identityHashCode(this))).booleanValue();
    }

    private void getPaymentFci() throws java.security.GeneralSecurityException {
        values(new java.lang.Object[]{this}, 399555928, -399555917, java.lang.System.identityHashCode(this));
    }
}
