package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class access202 {
    private static int getApplicationLifeCycleData = 1;
    private static int getCardLayoutDescription;
    private com.payair.hce.setDigitizedCardId AlternateContactlessPaymentDataJson;
    private com.payair.hce.processNotificationData DigitizedCardProfile;
    private com.payair.hce.requestSetWalletPin IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.createDeviceProtectedStorageContext RecordsJson;
    private com.payair.hce.setUpMCBP SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.onSdkUnregistered SdkCoreBusinessLogicModuleImpl;
    private com.payair.hce.useDemoMode getAid;
    private com.payair.hce.getCodeCacheDir getCiacDecline;
    private com.payair.hce.onUserValidationObtained getCvrMaskAnd;
    private com.payair.hce.smallInitialization getGpoResponse;
    private com.payair.hce.initContext getProfileVersion;
    private com.payair.hce.access400 valueOf;
    private com.payair.hce.onShowAuthenticateScreen values;
    private com.payair.hce.access300 writeReplace;
    private boolean getPaymentFci = false;
    private com.payair.hce.setPinIvCvc3Track2 getCvmResetTimeout = com.payair.hce.setMaximumPinTry.valueOf();

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        switch ((i * 306) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS + (i2 * 306) + (((~(i | i2)) | (~(i | i3))) * 305) + (((~(i | (~i3))) | (~i2)) * 305)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
                int i4 = getApplicationLifeCycleData;
                int i5 = i4 ^ 99;
                int i6 = ((i4 & 99) | i5) << 1;
                int i7 = -i5;
                int i8 = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
                getCardLayoutDescription = i8;
                com.payair.hce.access300 access300Var = access202Var.writeReplace;
                int i9 = ((i8 ^ 1) | (i8 & 1)) << 1;
                int i10 = -(((~i8) & 1) | (i8 & (-2)));
                getApplicationLifeCycleData = (((i9 | i10) << 1) - (i9 ^ i10)) % 128;
                return access300Var;
            case 3:
                return valueOf(objArr);
            case 4:
                return values(objArr);
            case 5:
                return AlternateContactlessPaymentDataJson(objArr);
            case 6:
                return DigitizedCardProfile(objArr);
            case 7:
                com.payair.hce.access202 access202Var2 = (com.payair.hce.access202) objArr[0];
                int i11 = getCardLayoutDescription;
                getApplicationLifeCycleData = (i11 + 65) % 128;
                com.payair.hce.onShowAuthenticateScreen onshowauthenticatescreen = access202Var2.values;
                getApplicationLifeCycleData = ((i11 & 21) + (i11 | 21)) % 128;
                return onshowauthenticatescreen;
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 9:
                return getAid(objArr);
            case 10:
                com.payair.hce.access202 access202Var3 = (com.payair.hce.access202) objArr[0];
                int i12 = getApplicationLifeCycleData;
                int i13 = i12 & 65;
                getCardLayoutDescription = (i13 + ((i12 ^ 65) | i13)) % 128;
                com.payair.hce.processNotificationData processnotificationdata = access202Var3.DigitizedCardProfile;
                getCardLayoutDescription = (((i12 | 105) << 1) - (i12 ^ 105)) % 128;
                return processnotificationdata;
            case 11:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 12:
                com.payair.hce.access202 access202Var4 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.onSdkUnregistered onsdkunregistered = (com.payair.hce.onSdkUnregistered) objArr[1];
                int i14 = getCardLayoutDescription;
                int i15 = i14 ^ 51;
                int i16 = -(-((i14 & 51) << 1));
                int i17 = ((i15 & i16) + (i16 | i15)) % 128;
                getApplicationLifeCycleData = i17;
                access202Var4.SdkCoreBusinessLogicModuleImpl = onsdkunregistered;
                int i18 = i17 & 23;
                getCardLayoutDescription = (i18 + ((i17 ^ 23) | i18)) % 128;
                return null;
            case 13:
                return RecordsJson(objArr);
            case 14:
                com.payair.hce.access202 access202Var5 = (com.payair.hce.access202) objArr[0];
                int i19 = getCardLayoutDescription;
                int i20 = (i19 & (-98)) | ((~i19) & 97);
                int i21 = (i19 & 97) << 1;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                getApplicationLifeCycleData = i22 % 128;
                if (i22 % 2 == 0) {
                    access202Var5.getPaymentFci = false;
                } else {
                    access202Var5.getPaymentFci = true;
                }
                return null;
            case 15:
                return getProfileVersion(objArr);
            case 16:
                return getCiacDecline(objArr);
            case 17:
                com.payair.hce.access202 access202Var6 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.access300 access300Var2 = (com.payair.hce.access300) objArr[1];
                int i23 = getCardLayoutDescription;
                int i24 = (i23 & (-16)) | ((~i23) & 15);
                int i25 = (i23 & 15) << 1;
                int i26 = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                getApplicationLifeCycleData = i26;
                access202Var6.writeReplace = access300Var2;
                getCardLayoutDescription = (i26 + 67) % 128;
                return null;
            case 18:
                return getCvrMaskAnd(objArr);
            case 19:
                return getPaymentFci(objArr);
            case 20:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 21:
                return getGpoResponse(objArr);
            case 22:
                com.payair.hce.access202 access202Var7 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.setUpMCBP setupmcbp = (com.payair.hce.setUpMCBP) objArr[1];
                int i27 = getCardLayoutDescription;
                getApplicationLifeCycleData = (i27 + 61) % 128;
                access202Var7.SdkCoreAlternateContactlessPaymentDataImpl = setupmcbp;
                getApplicationLifeCycleData = (((i27 ^ 51) - (~((i27 & 51) << 1))) - 1) % 128;
                return null;
            case 23:
                com.payair.hce.access202 access202Var8 = (com.payair.hce.access202) objArr[0];
                int i28 = getCardLayoutDescription;
                int i29 = ((i28 ^ 19) + ((i28 & 19) << 1)) % 128;
                getApplicationLifeCycleData = i29;
                com.payair.hce.setDigitizedCardId setdigitizedcardid = access202Var8.AlternateContactlessPaymentDataJson;
                getCardLayoutDescription = (i29 + 33) % 128;
                return setdigitizedcardid;
            case 24:
                com.payair.hce.access202 access202Var9 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.setDigitizedCardId setdigitizedcardid2 = (com.payair.hce.setDigitizedCardId) objArr[1];
                int i30 = getApplicationLifeCycleData;
                int i31 = i30 & 95;
                int i32 = (i30 ^ 95) | i31;
                getCardLayoutDescription = (((i31 | i32) << 1) - (i31 ^ i32)) % 128;
                access202Var9.AlternateContactlessPaymentDataJson = setdigitizedcardid2;
                getCardLayoutDescription = (i30 + 5) % 128;
                return null;
            case 25:
                return getCardLayoutDescription(objArr);
            case 26:
                com.payair.hce.access202 access202Var10 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.onUserValidationObtained onuservalidationobtained = (com.payair.hce.onUserValidationObtained) objArr[1];
                int i33 = getCardLayoutDescription;
                getApplicationLifeCycleData = (((i33 & 118) + (i33 | 118)) - 1) % 128;
                access202Var10.getCvrMaskAnd = onuservalidationobtained;
                int i34 = i33 & 39;
                getApplicationLifeCycleData = ((((i33 ^ 39) | i34) << 1) - ((~i34) & (i33 | 39))) % 128;
                return null;
            case 27:
                com.payair.hce.access202 access202Var11 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) objArr[1];
                int i35 = (getApplicationLifeCycleData + 107) % 128;
                getCardLayoutDescription = i35;
                access202Var11.getCiacDecline = getcodecachedir;
                int i36 = (i35 & (-106)) | ((~i35) & 105);
                int i37 = -(-((i35 & 105) << 1));
                getApplicationLifeCycleData = ((i36 ^ i37) + ((i36 & i37) << 1)) % 128;
                return null;
            case 28:
                return getSecurityWord(objArr);
            case 29:
                return getApplicationLifeCycleData(objArr);
            case 30:
                return getDualTapResetTimeout(objArr);
            default:
                com.payair.hce.access202 access202Var12 = (com.payair.hce.access202) objArr[0];
                com.payair.hce.createDeviceProtectedStorageContext createdeviceprotectedstoragecontext = (com.payair.hce.createDeviceProtectedStorageContext) objArr[1];
                int i38 = getCardLayoutDescription;
                getApplicationLifeCycleData = (((i38 & 66) + (i38 | 66)) - 1) % 128;
                access202Var12.RecordsJson = createdeviceprotectedstoragecontext;
                int i39 = (i38 ^ 104) + ((i38 & 104) << 1);
                getApplicationLifeCycleData = ((~i39) + (i39 << 1)) % 128;
                return null;
        }
    }

    public abstract com.payair.hce.activateCardForToken writeReplace();

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.onShowAuthenticateScreen onshowauthenticatescreen = (com.payair.hce.onShowAuthenticateScreen) objArr[1];
        int i = getApplicationLifeCycleData;
        int i2 = ((i | 88) << 1) - (i ^ 88);
        int i3 = (~i2) + (i2 << 1);
        int i4 = i3 % 128;
        getCardLayoutDescription = i4;
        if (i3 % 2 == 0) {
            access202Var.values = onshowauthenticatescreen;
            getApplicationLifeCycleData = ((i4 & 81) + (i4 | 81)) % 128;
            return null;
        }
        access202Var.values = onshowauthenticatescreen;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getApplicationLifeCycleData;
        int i2 = i + 66;
        int i3 = (~i2) + (i2 << 1);
        getCardLayoutDescription = i3 % 128;
        com.payair.hce.access400 access400Var = access202Var.valueOf;
        if (i3 % 2 != 0) {
            throw null;
        }
        getCardLayoutDescription = (i + 79) % 128;
        return access400Var;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) objArr[1];
        int i = getApplicationLifeCycleData;
        int i2 = ((i ^ 83) | (i & 83)) << 1;
        int i3 = -((i & (-84)) | ((~i) & 83));
        getCardLayoutDescription = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        access202Var.valueOf = access400Var;
        int i4 = i + 33;
        getCardLayoutDescription = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.processNotificationData processnotificationdata = (com.payair.hce.processNotificationData) objArr[1];
        int i = getCardLayoutDescription;
        int i2 = i & 121;
        int i3 = (i | 121) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getApplicationLifeCycleData = i5 % 128;
        if (i5 % 2 != 0) {
            access202Var.DigitizedCardProfile = processnotificationdata;
            return null;
        }
        access202Var.DigitizedCardProfile = processnotificationdata;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getApplicationLifeCycleData;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        getCardLayoutDescription = i2 % 128;
        if (i2 % 2 != 0) {
            access202Var.writeReplace();
            com.payair.hce.activateCardForToken activatecardfortoken = com.payair.hce.activateCardForToken.values;
            throw null;
        }
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values || access202Var.writeReplace() == com.payair.hce.activateCardForToken.valueOf) {
            com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile;
            int i3 = (-2) - (~(getApplicationLifeCycleData + 4));
            getCardLayoutDescription = i3 % 128;
            if (i3 % 2 == 0) {
                return setnewdefaultcardforcontactlesspayments;
            }
            throw null;
        }
        if (access202Var.getPaymentFci) {
            if (access202Var.valueOf.RecordsJson().values()) {
                getCardLayoutDescription = ((-2) - (~(getApplicationLifeCycleData + 26))) % 128;
                if (!access202Var.valueOf.RecordsJson().AlternateContactlessPaymentDataJson()) {
                    com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments2 = com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                    int i4 = getApplicationLifeCycleData;
                    getCardLayoutDescription = ((((i4 ^ 13) | (i4 & 13)) << 1) - ((i4 & (-14)) | ((~i4) & 13))) % 128;
                    return setnewdefaultcardforcontactlesspayments2;
                }
                int i5 = getApplicationLifeCycleData;
                int i6 = i5 & 119;
                int i7 = -(-((i5 ^ 119) | i6));
                int i8 = (i6 & i7) + (i7 | i6);
                getCardLayoutDescription = i8 % 128;
                if (i8 % 2 != 0) {
                    com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments3 = com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile;
                    throw null;
                }
                com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments4 = com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile;
                int i9 = getCardLayoutDescription;
                int i10 = i9 & 87;
                int i11 = ((((i9 ^ 87) | i10) << 1) - (~(-((i9 | 87) & (~i10))))) - 1;
                getApplicationLifeCycleData = i11 % 128;
                if (i11 % 2 != 0) {
                    return setnewdefaultcardforcontactlesspayments4;
                }
                throw null;
            }
            int i12 = getApplicationLifeCycleData + 86;
            getCardLayoutDescription = ((~i12) + (i12 << 1)) % 128;
            try {
                com.payair.hce.access400 access400Var = access202Var.valueOf;
                if (!((com.payair.hce.getTransactionCredentialData) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var}, -1080515727, 1080515728, java.lang.System.identityHashCode(access400Var))).RecordsJson()) {
                    int i13 = getApplicationLifeCycleData;
                    int i14 = i13 & 83;
                    getCardLayoutDescription = ((((i13 ^ 83) | i14) << 1) - ((i13 | 83) & (~i14))) % 128;
                    com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments5 = com.payair.hce.setNewDefaultCardForContactlessPayments.valueOf;
                    getCardLayoutDescription = (getApplicationLifeCycleData + 111) % 128;
                    return setnewdefaultcardforcontactlesspayments5;
                }
                com.payair.hce.access400 access400Var2 = access202Var.valueOf;
                if (!((com.payair.hce.getTransactionCredentialData) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var2}, -1080515727, 1080515728, java.lang.System.identityHashCode(access400Var2))).DigitizedCardProfile()) {
                    com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments6 = com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile;
                    int i15 = getApplicationLifeCycleData;
                    int i16 = ((i15 & (-4)) | ((~i15) & 3)) + ((i15 & 3) << 1);
                    getCardLayoutDescription = i16 % 128;
                    if (i16 % 2 == 0) {
                        return setnewdefaultcardforcontactlesspayments6;
                    }
                    throw new java.lang.ArithmeticException();
                }
                int i17 = getCardLayoutDescription;
                int i18 = i17 & 7;
                int i19 = (i17 | 7) & (~i18);
                int i20 = i18 << 1;
                int i21 = (i19 & i20) + (i19 | i20);
                getApplicationLifeCycleData = i21 % 128;
                if (i21 % 2 != 0) {
                    return com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                }
                com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments7 = com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                throw new java.lang.NullPointerException();
            } catch (com.payair.hce.getSetPinRequestData unused) {
                return com.payair.hce.setNewDefaultCardForContactlessPayments.valueOf;
            }
        }
        int i22 = getCardLayoutDescription;
        int i23 = ((i22 | 21) << 1) - (i22 ^ 21);
        getApplicationLifeCycleData = i23 % 128;
        try {
            if (i23 % 2 == 0) {
                access202Var.valueOf.SdkCoreAlternateContactlessPaymentDataImpl();
                throw new java.lang.NullPointerException();
            }
            com.payair.hce.getCmsCFormattedDigitizedCardProfile SdkCoreAlternateContactlessPaymentDataImpl = access202Var.valueOf.SdkCoreAlternateContactlessPaymentDataImpl();
            int i24 = getApplicationLifeCycleData;
            int i25 = ((i24 & 10) + (i24 | 10)) - 1;
            getCardLayoutDescription = i25 % 128;
            if (i25 % 2 != 0) {
                SdkCoreAlternateContactlessPaymentDataImpl.AlternateContactlessPaymentDataJson();
                throw null;
            }
            if (SdkCoreAlternateContactlessPaymentDataImpl.AlternateContactlessPaymentDataJson()) {
                try {
                    com.payair.hce.access400 access400Var3 = access202Var.valueOf;
                    com.payair.hce.getTransactionCredentialData gettransactioncredentialdata = (com.payair.hce.getTransactionCredentialData) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var3}, -1080515727, 1080515728, java.lang.System.identityHashCode(access400Var3));
                    int i26 = getApplicationLifeCycleData;
                    int i27 = i26 + 92;
                    getCardLayoutDescription = ((~i27) + (i27 << 1)) % 128;
                    int i28 = i26 & 9;
                    int i29 = (i28 - (~(-(-((i26 ^ 9) | i28))))) - 1;
                    getCardLayoutDescription = i29 % 128;
                    if (i29 % 2 != 0) {
                        gettransactioncredentialdata.RecordsJson();
                        throw null;
                    }
                    if (!gettransactioncredentialdata.RecordsJson()) {
                        int i30 = getApplicationLifeCycleData;
                        getCardLayoutDescription = ((((i30 ^ 77) | (i30 & 77)) << 1) - ((i30 & (-78)) | ((~i30) & 77))) % 128;
                        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments8 = com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                        int i31 = getApplicationLifeCycleData;
                        int i32 = i31 & 11;
                        int i33 = -(-((i31 ^ 11) | i32));
                        getCardLayoutDescription = ((i32 & i33) + (i33 | i32)) % 128;
                        return setnewdefaultcardforcontactlesspayments8;
                    }
                    if (gettransactioncredentialdata.DigitizedCardProfile()) {
                        int i34 = getCardLayoutDescription;
                        int i35 = i34 & 7;
                        int i36 = (((i34 ^ 7) | i35) << 1) - ((i34 | 7) & (~i35));
                        getApplicationLifeCycleData = i36 % 128;
                        if (i36 % 2 != 0) {
                            return com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                        }
                        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments9 = com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                        throw null;
                    }
                } catch (com.payair.hce.getSetPinRequestData unused2) {
                    return com.payair.hce.setNewDefaultCardForContactlessPayments.values;
                }
            }
            com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments10 = com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile;
            int i37 = getCardLayoutDescription;
            int i38 = i37 & 107;
            int i39 = (i37 | 107) & (~i38);
            int i40 = -(-(i38 << 1));
            int i41 = (i39 & i40) + (i39 | i40);
            getApplicationLifeCycleData = i41 % 128;
            if (i41 % 2 != 0) {
                return setnewdefaultcardforcontactlesspayments10;
            }
            throw null;
        } catch (com.payair.hce.getSetPinRequestData unused3) {
            return com.payair.hce.setNewDefaultCardForContactlessPayments.valueOf;
        }
    }

    private static /* synthetic */ java.lang.Object getDualTapResetTimeout(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription + 23;
        getApplicationLifeCycleData = i % 128;
        com.payair.hce.requestSetWalletPin requestsetwalletpin = access202Var.IccPrivateKeyCrtComponentsJson;
        if (i % 2 != 0) {
            return requestsetwalletpin;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.requestSetWalletPin requestsetwalletpin = (com.payair.hce.requestSetWalletPin) objArr[1];
        int i = getCardLayoutDescription;
        int i2 = i & 125;
        int i3 = -(-((i ^ 125) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getApplicationLifeCycleData = i4 % 128;
        if (i4 % 2 != 0) {
            access202Var.IccPrivateKeyCrtComponentsJson = requestsetwalletpin;
            return null;
        }
        access202Var.IccPrivateKeyCrtComponentsJson = requestsetwalletpin;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription;
        getApplicationLifeCycleData = (((((i ^ 73) | (i & 73)) << 1) - (~(-((i & (-74)) | ((~i) & 73))))) - 1) % 128;
        com.payair.hce.getCodeCacheDir getcodecachedir = access202Var.getCiacDecline;
        int identityHashCode = java.lang.System.identityHashCode(access202Var);
        int i2 = identityHashCode & 1680130600;
        int i3 = ~(((1680130600 | identityHashCode) & (~i2)) | i2);
        int i4 = i3 & (-2012216048);
        int i5 = (i3 | (-2012216048)) & (~i4);
        int i6 = ((i5 ^ i4) | (i5 & i4)) * (-283);
        int i7 = i6 & 740329086;
        int i8 = (i6 | 740329086) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        int i11 = ((i10 ^ 826296537) + ((826296537 & i10) << 1)) - 1;
        int i12 = identityHashCode ^ (-332085448);
        int i13 = identityHashCode & (-332085448);
        int i14 = (i13 ^ i12) | (i13 & i12);
        int i15 = ~i14;
        int i16 = ((i14 | i15) & i15) * 283;
        int i17 = ((i11 ^ i16) | (i11 & i16)) << 1;
        int i18 = -(((~i16) & i11) | ((~i11) & i16));
        int identityHashCode2 = java.lang.System.identityHashCode(access202Var);
        int i19 = identityHashCode2 ^ 62744153;
        int i20 = ~identityHashCode2;
        int i21 = identityHashCode2 & 62744153;
        int i22 = (-938216879) - (~(-(~(-(-((~((i21 ^ i19) | (i21 & i19))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))))));
        int i23 = i22 & 206921724;
        int i24 = -(-((206921724 ^ i22) | i23));
        int i25 = (i23 & i24) + (i24 | i23);
        int i26 = ((-62744154) & i20) | ((~i20) & 62744153);
        int i27 = 62744153 & i20;
        int i28 = (i26 ^ i27) | (i26 & i27);
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = ((~i30) & 43337288) | ((-43337289) & i30);
        int i32 = i30 & 43337288;
        int i33 = ((i32 ^ i31) | (i32 & i31)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
        int i34 = ((i25 ^ i33) | (i25 & i33)) << 1;
        int i35 = -(((~i33) & i25) | ((~i25) & i33));
        if (((i17 | i18) << 1) - (i18 ^ i17) > (i34 ^ i35) + ((i35 & i34) << 1)) {
            return getcodecachedir;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription;
        int i2 = (i ^ 82) + ((i & 82) << 1);
        getApplicationLifeCycleData = ((~i2) + (i2 << 1)) % 128;
        com.payair.hce.setUpMCBP setupmcbp = access202Var.SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = ((i & (-56)) | ((~i) & 55)) + ((i & 55) << 1);
        getApplicationLifeCycleData = i3 % 128;
        if (i3 % 2 != 0) {
            return setupmcbp;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription;
        int i2 = i ^ 23;
        int i3 = (((i & 23) | i2) << 1) - i2;
        getApplicationLifeCycleData = i3 % 128;
        com.payair.hce.initContext initcontext = access202Var.getProfileVersion;
        if (i3 % 2 == 0) {
            throw null;
        }
        getCardLayoutDescription = ((((r1 | 84) << 1) - (r1 ^ 84)) - 1) % 128;
        return initcontext;
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.initContext initcontext = (com.payair.hce.initContext) objArr[1];
        int i = getApplicationLifeCycleData;
        int i2 = i & 33;
        int i3 = i2 + ((i ^ 33) | i2);
        getCardLayoutDescription = i3 % 128;
        if (i3 % 2 == 0) {
            access202Var.getProfileVersion = initcontext;
            int i4 = i + 97;
            getCardLayoutDescription = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        access202Var.getProfileVersion = initcontext;
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getApplicationLifeCycleData & 51;
        int i2 = ((((r0 | 51) & (~i)) - (~(-(-(i << 1))))) - 1) % 128;
        getCardLayoutDescription = i2;
        com.payair.hce.useDemoMode usedemomode = access202Var.getAid;
        int i3 = (-2) - (~((i2 & 96) + (i2 | 96)));
        getApplicationLifeCycleData = i3 % 128;
        if (i3 % 2 != 0) {
            return usedemomode;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.useDemoMode usedemomode = (com.payair.hce.useDemoMode) objArr[1];
        int i = getApplicationLifeCycleData;
        int i2 = (i & (-12)) | ((~i) & 11);
        int i3 = (i & 11) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getCardLayoutDescription = i4 % 128;
        if (i4 % 2 == 0) {
            access202Var.getAid = usedemomode;
            return null;
        }
        access202Var.getAid = usedemomode;
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getApplicationLifeCycleData;
        int i2 = i & 83;
        int i3 = ((((i ^ 83) | i2) << 1) - ((i | 83) & (~i2))) % 128;
        getCardLayoutDescription = i3;
        boolean z = access202Var.getPaymentFci;
        int i4 = (i3 & (-38)) | ((~i3) & 37);
        int i5 = -(-((i3 & 37) << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        getApplicationLifeCycleData = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription;
        int i2 = (i & 73) + (i | 73);
        getApplicationLifeCycleData = i2 % 128;
        com.payair.hce.createDeviceProtectedStorageContext createdeviceprotectedstoragecontext = access202Var.RecordsJson;
        if (i2 % 2 != 0) {
            return createdeviceprotectedstoragecontext;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription;
        getApplicationLifeCycleData = (((i ^ 118) + ((i & 118) << 1)) - 1) % 128;
        com.payair.hce.smallInitialization smallinitialization = access202Var.getGpoResponse;
        int i2 = (i | 107) << 1;
        int i3 = -(i ^ 107);
        int i4 = (i2 & i3) + (i3 | i2);
        getApplicationLifeCycleData = i4 % 128;
        if (i4 % 2 != 0) {
            return smallinitialization;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        com.payair.hce.smallInitialization smallinitialization = (com.payair.hce.smallInitialization) objArr[1];
        int i = getApplicationLifeCycleData;
        int i2 = i | 105;
        int i3 = ((i2 << 1) - (~(-(i2 & (~(i & 105)))))) - 1;
        getCardLayoutDescription = i3 % 128;
        if (i3 % 2 == 0) {
            access202Var.getGpoResponse = smallinitialization;
            getCardLayoutDescription = ((i & 63) + (i | 63)) % 128;
            return null;
        }
        access202Var.getGpoResponse = smallinitialization;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getApplicationLifeCycleData;
        int i2 = i & 31;
        int i3 = i | 31;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getCardLayoutDescription = i4;
        com.payair.hce.onSdkUnregistered onsdkunregistered = access202Var.SdkCoreBusinessLogicModuleImpl;
        int i5 = i4 | 99;
        int i6 = i5 << 1;
        int i7 = -(i5 & (~(i4 & 99)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        getApplicationLifeCycleData = i8 % 128;
        if (i8 % 2 != 0) {
            return onsdkunregistered;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[0];
        int i = getCardLayoutDescription;
        int i2 = ((i ^ 81) + ((i & 81) << 1)) % 128;
        getApplicationLifeCycleData = i2;
        com.payair.hce.onUserValidationObtained onuservalidationobtained = access202Var.getCvrMaskAnd;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getCardLayoutDescription = i5 % 128;
        if (i5 % 2 == 0) {
            return onuservalidationobtained;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void valueOf(com.payair.hce.onUserValidationObtained onuservalidationobtained) {
        DigitizedCardProfile(new java.lang.Object[]{this, onuservalidationobtained}, 672908291, -672908265, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.onUserValidationObtained getDualTapResetTimeout() {
        return (com.payair.hce.onUserValidationObtained) DigitizedCardProfile(new java.lang.Object[]{this}, 706360202, -706360174, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(com.payair.hce.onSdkUnregistered onsdkunregistered) {
        DigitizedCardProfile(new java.lang.Object[]{this, onsdkunregistered}, -1495583756, 1495583768, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.onSdkUnregistered getCardLayoutDescription() {
        return (com.payair.hce.onSdkUnregistered) DigitizedCardProfile(new java.lang.Object[]{this}, -487406649, 487406674, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(com.payair.hce.smallInitialization smallinitialization) {
        DigitizedCardProfile(new java.lang.Object[]{this, smallinitialization}, 489798977, -489798976, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.smallInitialization getApplicationLifeCycleData() {
        return (com.payair.hce.smallInitialization) DigitizedCardProfile(new java.lang.Object[]{this}, 105584507, -105584498, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.createDeviceProtectedStorageContext createdeviceprotectedstoragecontext) {
        DigitizedCardProfile(new java.lang.Object[]{this, createdeviceprotectedstoragecontext}, -1493160897, 1493160897, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.createDeviceProtectedStorageContext getCvmResetTimeout() {
        return (com.payair.hce.createDeviceProtectedStorageContext) DigitizedCardProfile(new java.lang.Object[]{this}, 78805414, -78805398, java.lang.System.identityHashCode(this));
    }

    public final void getCvrMaskAnd() {
        DigitizedCardProfile(new java.lang.Object[]{this}, 1677078065, -1677078051, java.lang.System.identityHashCode(this));
    }

    public final boolean SdkCoreBusinessLogicModuleImpl() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1867552031, 1867552044, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void writeReplace(com.payair.hce.useDemoMode usedemomode) {
        DigitizedCardProfile(new java.lang.Object[]{this, usedemomode}, 770021538, -770021530, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.useDemoMode getGpoResponse() {
        return (com.payair.hce.useDemoMode) DigitizedCardProfile(new java.lang.Object[]{this}, -1433364550, 1433364556, java.lang.System.identityHashCode(this));
    }

    public final void values(com.payair.hce.initContext initcontext) {
        DigitizedCardProfile(new java.lang.Object[]{this, initcontext}, 170701434, -170701414, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.initContext getPaymentFci() {
        return (com.payair.hce.initContext) DigitizedCardProfile(new java.lang.Object[]{this}, 1231592634, -1231592619, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(com.payair.hce.setUpMCBP setupmcbp) {
        DigitizedCardProfile(new java.lang.Object[]{this, setupmcbp}, 2025967085, -2025967063, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setUpMCBP getCiacDecline() {
        return (com.payair.hce.setUpMCBP) DigitizedCardProfile(new java.lang.Object[]{this}, 611170860, -611170849, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getCodeCacheDir SdkCoreAlternateContactlessPaymentDataImpl() {
        return (com.payair.hce.getCodeCacheDir) DigitizedCardProfile(new java.lang.Object[]{this}, -1529917445, 1529917464, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(com.payair.hce.getCodeCacheDir getcodecachedir) {
        DigitizedCardProfile(new java.lang.Object[]{this, getcodecachedir}, 416557702, -416557675, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.requestSetWalletPin requestsetwalletpin) {
        DigitizedCardProfile(new java.lang.Object[]{this, requestsetwalletpin}, 109896524, -109896519, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.requestSetWalletPin RecordsJson() {
        return (com.payair.hce.requestSetWalletPin) DigitizedCardProfile(new java.lang.Object[]{this}, 857149142, -857149112, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setNewDefaultCardForContactlessPayments IccPrivateKeyCrtComponentsJson() throws com.payair.hce.getAtcCount {
        return (com.payair.hce.setNewDefaultCardForContactlessPayments) DigitizedCardProfile(new java.lang.Object[]{this}, -1636012707, 1636012736, java.lang.System.identityHashCode(this));
    }

    public final void values(com.payair.hce.processNotificationData processnotificationdata) {
        DigitizedCardProfile(new java.lang.Object[]{this, processnotificationdata}, 1939173520, -1939173499, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(com.payair.hce.setDigitizedCardId setdigitizedcardid) {
        DigitizedCardProfile(new java.lang.Object[]{this, setdigitizedcardid}, -782629219, 782629243, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.processNotificationData getProfileVersion() {
        return (com.payair.hce.processNotificationData) DigitizedCardProfile(new java.lang.Object[]{this}, -1684199295, 1684199305, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setDigitizedCardId getAid() {
        return (com.payair.hce.setDigitizedCardId) DigitizedCardProfile(new java.lang.Object[]{this}, -725902463, 725902486, java.lang.System.identityHashCode(this));
    }

    public final void values(com.payair.hce.access300 access300Var) {
        DigitizedCardProfile(new java.lang.Object[]{this, access300Var}, 899751733, -899751716, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(com.payair.hce.access400 access400Var) {
        DigitizedCardProfile(new java.lang.Object[]{this, access400Var}, 1661508176, -1661508172, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.access300 AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.access300) DigitizedCardProfile(new java.lang.Object[]{this}, 490902825, -490902823, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.access400 DigitizedCardProfile() {
        return (com.payair.hce.access400) DigitizedCardProfile(new java.lang.Object[]{this}, -2078363504, 2078363507, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(com.payair.hce.onShowAuthenticateScreen onshowauthenticatescreen) {
        DigitizedCardProfile(new java.lang.Object[]{this, onshowauthenticatescreen}, 1824321231, -1824321213, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.onShowAuthenticateScreen values() {
        return (com.payair.hce.onShowAuthenticateScreen) DigitizedCardProfile(new java.lang.Object[]{this}, 1571618569, -1571618562, java.lang.System.identityHashCode(this));
    }
}
