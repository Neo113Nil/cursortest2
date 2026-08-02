package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class requestSetWalletPin {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static char RecordsJson;
    private static int getAid;
    private static int getProfileVersion;
    private static char valueOf;
    private static char writeReplace;
    private com.payair.hce.access202 AlternateContactlessPaymentDataJson;
    protected com.payair.hce.setPinIvCvc3Track2 values = com.payair.hce.setMaximumPinTry.valueOf();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = (s * 653) + 65;
        int i4 = i * 34;
        int i5 = 38 - (b * 34);
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i4];
        int i6 = 34 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = (i8 + (-i5)) - 2;
            int i11 = i7 + 1;
            i2 = i9;
            i3 = i10;
            i5 = i11;
            cArr[i2] = (char) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i12 = i3;
            i7 = i5;
            i5 = bArr[i5];
            i8 = i12;
            int i102 = (i8 + (-i5)) - 2;
            int i112 = i7 + 1;
            i2 = i9;
            i3 = i102;
            i5 = i112;
            cArr[i2] = (char) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            cArr[i2] = (char) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static void c(short s, byte b, byte b2, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i = b2 * 3;
        int i2 = (s * 3) + 4;
        int i3 = (b * 4) + 110;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = i + i3;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i2];
                i2++;
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    public abstract com.payair.hce.activateVisaCardForToken values();

    public abstract com.payair.hce.replenishAllCards writeReplace();

    public requestSetWalletPin(com.payair.hce.access202 access202Var) {
        this.AlternateContactlessPaymentDataJson = access202Var;
    }

    public final com.payair.hce.requestReplenish DigitizedCardProfile() {
        com.payair.hce.requestReplenish requestreplenish = new com.payair.hce.requestReplenish(this.AlternateContactlessPaymentDataJson);
        getAid = (getProfileVersion + 107) % 128;
        return requestreplenish;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.requestSetWalletPin requestsetwalletpin = (com.payair.hce.requestSetWalletPin) objArr[0];
        com.payair.hce.reInitialize reinitialize = (com.payair.hce.reInitialize) objArr[1];
        com.payair.hce.getDefaultCardForContactlessPayments getdefaultcardforcontactlesspayments = (com.payair.hce.getDefaultCardForContactlessPayments) objArr[2];
        com.payair.hce.suspendCardForToken suspendcardfortoken = (com.payair.hce.suspendCardForToken) objArr[3];
        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = (com.payair.hce.getNumberOfTransactionLogEntries) objArr[4];
        com.payair.hce.activateCardForToken activatecardfortoken = (com.payair.hce.activateCardForToken) objArr[5];
        getAid = (getProfileVersion + 87) % 128;
        if (activatecardfortoken == com.payair.hce.activateCardForToken.writeReplace) {
            com.payair.hce.access202 access202Var = requestsetwalletpin.AlternateContactlessPaymentDataJson;
            if (!((com.payair.hce.initContext) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 1231592634, -1231592619, java.lang.System.identityHashCode(access202Var))).values()) {
                getProfileVersion = (getAid + 85) % 128;
                return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.valueOf);
            }
        }
        if (suspendcardfortoken == com.payair.hce.suspendCardForToken.writeReplace) {
            int i = getProfileVersion + 97;
            getAid = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries2 = com.payair.hce.getNumberOfTransactionLogEntries.values;
                throw null;
            }
            if (getnumberoftransactionlogentries != com.payair.hce.getNumberOfTransactionLogEntries.values && getnumberoftransactionlogentries != com.payair.hce.getNumberOfTransactionLogEntries.writeReplace) {
                return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.valueOf);
            }
            com.payair.hce.access202 access202Var2 = requestsetwalletpin.AlternateContactlessPaymentDataJson;
            if (((com.payair.hce.initContext) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var2}, 1231592634, -1231592619, java.lang.System.identityHashCode(access202Var2))).AlternateContactlessPaymentDataJson()) {
                return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.writeReplace);
            }
            com.payair.hce.access202 access202Var3 = requestsetwalletpin.AlternateContactlessPaymentDataJson;
            return !((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var3}, -1684199295, 1684199305, java.lang.System.identityHashCode(access202Var3))).DigitizedCardProfile() ? java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.DigitizedCardProfile) : java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.values);
        }
        if ((getdefaultcardforcontactlesspayments.DigitizedCardProfile().contains(com.payair.hce.resetAuthenticationReferences.getAid) || getdefaultcardforcontactlesspayments.DigitizedCardProfile().contains(com.payair.hce.resetAuthenticationReferences.values)) && reinitialize == com.payair.hce.reInitialize.valueOf && getdefaultcardforcontactlesspayments.valueOf() != com.payair.hce.reInitialize.valueOf) {
            return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.getProfileVersion);
        }
        com.payair.hce.access202 access202Var4 = requestsetwalletpin.AlternateContactlessPaymentDataJson;
        if (((com.payair.hce.initContext) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var4}, 1231592634, -1231592619, java.lang.System.identityHashCode(access202Var4))).AlternateContactlessPaymentDataJson()) {
            int i2 = getAid + 45;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.writeReplace);
            }
            int i3 = com.payair.hce.setApplicationExpiryDate.writeReplace;
            throw null;
        }
        if (getdefaultcardforcontactlesspayments.DigitizedCardProfile().contains(com.payair.hce.resetAuthenticationReferences.values)) {
            getAid = (getProfileVersion + 101) % 128;
            return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.AlternateContactlessPaymentDataJson);
        }
        if (!getdefaultcardforcontactlesspayments.DigitizedCardProfile().contains(com.payair.hce.resetAuthenticationReferences.getAid)) {
            com.payair.hce.access202 access202Var5 = requestsetwalletpin.AlternateContactlessPaymentDataJson;
            if (((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var5}, -1684199295, 1684199305, java.lang.System.identityHashCode(access202Var5))).DigitizedCardProfile()) {
                return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.values);
            }
        }
        return java.lang.Integer.valueOf(com.payair.hce.setApplicationExpiryDate.DigitizedCardProfile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r2 != com.payair.hce.setApplicationExpiryDate.getProfileVersion) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.payair.hce.clearInternalStorage DigitizedCardProfile(int i, com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries) {
        getAid = (getProfileVersion + 77) % 128;
        com.payair.hce.clearInternalStorage clearinternalstorage = com.payair.hce.clearInternalStorage.values;
        if (getnumberoftransactionlogentries == com.payair.hce.getNumberOfTransactionLogEntries.writeReplace) {
            getProfileVersion = (getAid + 19) % 128;
            if (i != com.payair.hce.setApplicationExpiryDate.values) {
            }
        }
        if (getnumberoftransactionlogentries != com.payair.hce.getNumberOfTransactionLogEntries.AlternateContactlessPaymentDataJson) {
            return clearinternalstorage;
        }
        com.payair.hce.clearInternalStorage clearinternalstorage2 = com.payair.hce.clearInternalStorage.AlternateContactlessPaymentDataJson;
        getProfileVersion = (getAid + 89) % 128;
        return clearinternalstorage2;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 15;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1335 - android.view.View.combineMeasuredStates(0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.MeasureSpec.getMode(0), android.view.View.MeasureSpec.getMode(0) + 1335, (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((short) 0, (byte) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3543, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $11 = ($10 + 21) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    public final com.payair.hce.getNumberOfAvailableCredentialsForToken AlternateContactlessPaymentDataJson() {
        com.payair.hce.getAppVersion getappversion;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed;
        com.payair.hce.clearAllWalletAppData clearallwalletappdata;
        com.payair.hce.access202 access202Var = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var));
        com.payair.hce.getAppVersion getappversion2 = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
        com.payair.hce.access202 access202Var2 = this.AlternateContactlessPaymentDataJson;
        if (((java.lang.Boolean) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var2}, -1867552031, 1867552044, java.lang.System.identityHashCode(access202Var2))).booleanValue()) {
            getappversion = valueOf();
        } else if (this.AlternateContactlessPaymentDataJson.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            getappversion = IccPrivateKeyCrtComponentsJson();
        } else {
            getappversion = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
        }
        com.payair.hce.getAppVersion getappversion3 = getappversion;
        try {
            transactioncanberesumed = ((com.payair.hce.getMobilePin) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var}, 636568534, -636568534, java.lang.System.identityHashCode(access400Var))).getAid();
        } catch (com.payair.hce.getSetPinRequestData unused) {
            transactioncanberesumed = null;
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = transactioncanberesumed;
        try {
            getappversion2 = access400Var.RecordsJson().DigitizedCardProfile() ? com.payair.hce.getAppVersion.writeReplace : com.payair.hce.getAppVersion.DigitizedCardProfile;
        } catch (com.payair.hce.getSetPinRequestData unused2) {
        }
        com.payair.hce.getAppVersion getappversion4 = getappversion2;
        if (this.AlternateContactlessPaymentDataJson.writeReplace() != com.payair.hce.activateCardForToken.writeReplace) {
            if (this.AlternateContactlessPaymentDataJson.writeReplace() == com.payair.hce.activateCardForToken.values) {
                com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) this.AlternateContactlessPaymentDataJson;
                return new com.payair.hce.requestChangeWalletPin(com.payair.hce.clearAllWalletAppData.getPaymentFci, com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson, ((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).writeReplace() == com.payair.hce.getTokenPan.values ? com.payair.hce.createMCBP.valueOf : com.payair.hce.createMCBP.writeReplace, com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson);
            }
            return new com.payair.hce.requestChangeWalletPin(com.payair.hce.clearAllWalletAppData.SdkCoreAlternateContactlessPaymentDataImpl, com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson, com.payair.hce.createMCBP.DigitizedCardProfile, com.payair.hce.getAppVersion.writeReplace);
        }
        byte byteValue = ((com.payair.hce.getDescription) access400Var.valueOf(com.payair.hce.getDescription.class)).getAid().byteValue();
        switch (byteValue) {
            case 17:
                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.DigitizedCardProfile;
                break;
            case 18:
                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.AlternateContactlessPaymentDataJson;
                break;
            case 19:
                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.valueOf;
                break;
            case 20:
                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.values;
                break;
            case 21:
                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.writeReplace;
                break;
            case 22:
                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getProfileVersion;
                break;
            default:
                switch (byteValue) {
                    case 33:
                        clearallwalletappdata = com.payair.hce.clearAllWalletAppData.SdkCoreAlternateContactlessPaymentDataImpl;
                        break;
                    case 34:
                        clearallwalletappdata = com.payair.hce.clearAllWalletAppData.RecordsJson;
                        break;
                    case 35:
                        clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getAid;
                        break;
                    case 36:
                        clearallwalletappdata = com.payair.hce.clearAllWalletAppData.IccPrivateKeyCrtComponentsJson;
                        break;
                    case 37:
                        clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getGpoResponse;
                        break;
                    case 38:
                        clearallwalletappdata = com.payair.hce.clearAllWalletAppData.SdkCoreBusinessLogicModuleImpl;
                        break;
                    default:
                        switch (byteValue) {
                            case 52:
                                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getPaymentFci;
                                break;
                            case 53:
                                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getCvrMaskAnd;
                                break;
                            case 54:
                                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getCiacDecline;
                                break;
                            default:
                                clearallwalletappdata = com.payair.hce.clearAllWalletAppData.getCvmResetTimeout;
                                break;
                        }
                }
        }
        com.payair.hce.clearAllWalletAppData clearallwalletappdata2 = clearallwalletappdata;
        com.payair.hce.access202 access202Var3 = this.AlternateContactlessPaymentDataJson;
        return new com.payair.hce.requestChangeWalletPin(clearallwalletappdata2, getappversion4, ((java.lang.Boolean) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var3}, -1867552031, 1867552044, java.lang.System.identityHashCode(access202Var3))).booleanValue() ? com.payair.hce.createMCBP.values : com.payair.hce.createMCBP.AlternateContactlessPaymentDataJson, getappversion3, transactioncanberesumed2, ((com.payair.hce.access000) this.AlternateContactlessPaymentDataJson).getCardholderValidators(), ((com.payair.hce.access000) this.AlternateContactlessPaymentDataJson).getAdditionalCheckTable(), ((com.payair.hce.access000) this.AlternateContactlessPaymentDataJson).getSecurityWord(), ((com.payair.hce.access000) this.AlternateContactlessPaymentDataJson).valueOf());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.payair.hce.removeCard getProfileVersion() throws com.payair.hce.getAtcCount {
        com.payair.hce.getAppVersion getappversion;
        com.payair.hce.unRegisterDevice unregisterdevice;
        com.payair.hce.access202 access202Var;
        com.payair.hce.clearHCEData clearhcedata;
        com.payair.hce.getAppVersion getappversion2;
        com.payair.hce.getAppVersion getappversion3;
        com.payair.hce.access202 access202Var2 = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var2}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var2));
        com.payair.hce.access202 access202Var3 = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.replenishAllCards writeReplace2 = ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var3}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var3))).writeReplace();
        com.payair.hce.clearHCEData clearhcedata2 = com.payair.hce.clearHCEData.values;
        com.payair.hce.getAppVersion getappversion4 = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
        com.payair.hce.unRegisterDevice unregisterdevice2 = com.payair.hce.unRegisterDevice.IccPrivateKeyCrtComponentsJson;
        try {
            com.payair.hce.requestReplenish requestreplenish = new com.payair.hce.requestReplenish(this.AlternateContactlessPaymentDataJson);
            com.payair.hce.unRegisterDevice unregisterdevice3 = (com.payair.hce.unRegisterDevice) com.payair.hce.requestReplenish.values(new java.lang.Object[]{requestreplenish}, -699536888, 699536888, java.lang.System.identityHashCode(requestreplenish));
            try {
                com.payair.hce.access202 access202Var4 = this.AlternateContactlessPaymentDataJson;
                com.payair.hce.access400 access400Var2 = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var4}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var4));
                com.payair.hce.access202 access202Var5 = this.AlternateContactlessPaymentDataJson;
                if (((java.lang.Boolean) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var5}, -1867552031, 1867552044, java.lang.System.identityHashCode(access202Var5))).booleanValue()) {
                    getProfileVersion = (getAid + 31) % 128;
                    getappversion3 = access400Var2.RecordsJson().AlternateContactlessPaymentDataJson() ? com.payair.hce.getAppVersion.writeReplace : com.payair.hce.getAppVersion.DigitizedCardProfile;
                } else {
                    getappversion3 = access400Var2.SdkCoreAlternateContactlessPaymentDataImpl().values() ? com.payair.hce.getAppVersion.writeReplace : com.payair.hce.getAppVersion.DigitizedCardProfile;
                }
                getappversion = getappversion3;
                unregisterdevice = unregisterdevice3;
            } catch (com.payair.hce.getSetPinRequestData unused) {
                unregisterdevice2 = unregisterdevice3;
                getappversion = getappversion4;
                unregisterdevice = unregisterdevice2;
                com.payair.hce.getAppVersion getappversion5 = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
                access202Var = this.AlternateContactlessPaymentDataJson;
                if (access202Var instanceof com.payair.hce.access000) {
                }
                com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl = ((com.payair.hce.readContactlessImk) access400Var.valueOf(com.payair.hce.readContactlessImk.class)).SdkCoreAlternateContactlessPaymentDataImpl();
                com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl2 = ((com.payair.hce.provisionFromLocalStorage) access400Var.valueOf(com.payair.hce.provisionFromLocalStorage.class)).SdkCoreAlternateContactlessPaymentDataImpl();
                com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl3 = ((com.payair.hce.readIccEncryptionKey) access400Var.valueOf(com.payair.hce.readIccEncryptionKey.class)).SdkCoreAlternateContactlessPaymentDataImpl();
                com.payair.hce.access202 access202Var6 = this.AlternateContactlessPaymentDataJson;
                com.payair.hce.requestDeleteCard requestdeletecard = new com.payair.hce.requestDeleteCard(SdkCoreAlternateContactlessPaymentDataImpl, SdkCoreAlternateContactlessPaymentDataImpl2, SdkCoreAlternateContactlessPaymentDataImpl3, (com.payair.hce.setNewDefaultCardForContactlessPayments) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var6}, -1636012707, 1636012736, java.lang.System.identityHashCode(access202Var6)), unregisterdevice, writeReplace2, clearhcedata, values(), getappversion, getappversion2);
                getProfileVersion = (getAid + 47) % 128;
                return requestdeletecard;
            }
        } catch (com.payair.hce.getSetPinRequestData unused2) {
        }
        com.payair.hce.getAppVersion getappversion52 = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
        access202Var = this.AlternateContactlessPaymentDataJson;
        if (access202Var instanceof com.payair.hce.access000) {
            clearhcedata = clearhcedata2;
            getappversion2 = getappversion52;
        } else {
            com.payair.hce.getAppVersion getappversion6 = ((com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 857149142, -857149112, java.lang.System.identityHashCode(access202Var)))).valueOf() ? com.payair.hce.getAppVersion.writeReplace : com.payair.hce.getAppVersion.DigitizedCardProfile;
            com.payair.hce.access000 access000Var = (com.payair.hce.access000) this.AlternateContactlessPaymentDataJson;
            getappversion2 = getappversion6;
            clearhcedata = (com.payair.hce.clearHCEData) com.payair.hce.access000.valueOf(new java.lang.Object[]{access000Var}, -339322648, 339322649, java.lang.System.identityHashCode(access000Var));
        }
        com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl4 = ((com.payair.hce.readContactlessImk) access400Var.valueOf(com.payair.hce.readContactlessImk.class)).SdkCoreAlternateContactlessPaymentDataImpl();
        com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl22 = ((com.payair.hce.provisionFromLocalStorage) access400Var.valueOf(com.payair.hce.provisionFromLocalStorage.class)).SdkCoreAlternateContactlessPaymentDataImpl();
        com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl32 = ((com.payair.hce.readIccEncryptionKey) access400Var.valueOf(com.payair.hce.readIccEncryptionKey.class)).SdkCoreAlternateContactlessPaymentDataImpl();
        com.payair.hce.access202 access202Var62 = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.requestDeleteCard requestdeletecard2 = new com.payair.hce.requestDeleteCard(SdkCoreAlternateContactlessPaymentDataImpl4, SdkCoreAlternateContactlessPaymentDataImpl22, SdkCoreAlternateContactlessPaymentDataImpl32, (com.payair.hce.setNewDefaultCardForContactlessPayments) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var62}, -1636012707, 1636012736, java.lang.System.identityHashCode(access202Var62)), unregisterdevice, writeReplace2, clearhcedata, values(), getappversion, getappversion2);
        getProfileVersion = (getAid + 47) % 128;
        return requestdeletecard2;
    }

    private com.payair.hce.getAppVersion valueOf() {
        com.payair.hce.readJsonFromLocalStorage readjsonfromlocalstorage;
        com.payair.hce.access202 access202Var = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var));
        try {
            com.payair.hce.readDsrpImk RecordsJson2 = access400Var.RecordsJson();
            try {
                readjsonfromlocalstorage = access400Var.DigitizedCardProfile();
            } catch (com.payair.hce.getSetPinRequestData unused) {
                readjsonfromlocalstorage = null;
            }
            if (readjsonfromlocalstorage != null && RecordsJson2 != null) {
                int i = getAid + 3;
                getProfileVersion = i % 128;
                if (i % 2 != 0) {
                    RecordsJson2.DigitizedCardProfile();
                    throw null;
                }
                if (RecordsJson2.DigitizedCardProfile()) {
                    getProfileVersion = (getAid + 101) % 128;
                    if (RecordsJson2.AlternateContactlessPaymentDataJson()) {
                        int i2 = getAid + 29;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 == 0) {
                            return com.payair.hce.getAppVersion.writeReplace;
                        }
                        com.payair.hce.getAppVersion getappversion = com.payair.hce.getAppVersion.writeReplace;
                        throw null;
                    }
                    if (!readjsonfromlocalstorage.values()) {
                        return com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
                    }
                    int i3 = getAid + 3;
                    getProfileVersion = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (((java.lang.Boolean) com.payair.hce.readJsonFromLocalStorage.values(new java.lang.Object[]{readjsonfromlocalstorage}, -1589615593, 1589615593, java.lang.System.identityHashCode(readjsonfromlocalstorage))).booleanValue()) {
                        com.payair.hce.getAppVersion getappversion2 = com.payair.hce.getAppVersion.writeReplace;
                        getAid = (getProfileVersion + 105) % 128;
                        return getappversion2;
                    }
                }
                return com.payair.hce.getAppVersion.DigitizedCardProfile;
            }
        } catch (com.payair.hce.getSetPinRequestData unused2) {
        }
        com.payair.hce.getAppVersion getappversion3 = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
        int i4 = getAid + 9;
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            return getappversion3;
        }
        throw null;
    }

    private com.payair.hce.getAppVersion IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.readJsonFromLocalStorage readjsonfromlocalstorage;
        getAid = (getProfileVersion + 21) % 128;
        com.payair.hce.access202 access202Var = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -2078363504, 2078363507, java.lang.System.identityHashCode(access202Var));
        try {
            com.payair.hce.getCmsCFormattedDigitizedCardProfile SdkCoreAlternateContactlessPaymentDataImpl = access400Var.SdkCoreAlternateContactlessPaymentDataImpl();
            try {
                readjsonfromlocalstorage = access400Var.DigitizedCardProfile();
            } catch (com.payair.hce.getSetPinRequestData unused) {
                readjsonfromlocalstorage = null;
            }
            if (readjsonfromlocalstorage != null && SdkCoreAlternateContactlessPaymentDataImpl != null) {
                if (!SdkCoreAlternateContactlessPaymentDataImpl.values()) {
                    if (readjsonfromlocalstorage.values()) {
                        if (((java.lang.Boolean) com.payair.hce.readJsonFromLocalStorage.values(new java.lang.Object[]{readjsonfromlocalstorage}, -1589615593, 1589615593, java.lang.System.identityHashCode(readjsonfromlocalstorage))).booleanValue()) {
                            com.payair.hce.getAppVersion getappversion = com.payair.hce.getAppVersion.writeReplace;
                            getProfileVersion = (getAid + 83) % 128;
                            return getappversion;
                        }
                        return com.payair.hce.getAppVersion.DigitizedCardProfile;
                    }
                    int i = getAid + 21;
                    getProfileVersion = i % 128;
                    if (i % 2 == 0) {
                        return com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
                    }
                    com.payair.hce.getAppVersion getappversion2 = com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
                    throw new java.lang.NullPointerException();
                }
                int i2 = getProfileVersion + 35;
                getAid = i2 % 128;
                if (i2 % 2 != 0) {
                    return com.payair.hce.getAppVersion.writeReplace;
                }
                com.payair.hce.getAppVersion getappversion3 = com.payair.hce.getAppVersion.writeReplace;
                throw new java.lang.NullPointerException();
            }
        } catch (com.payair.hce.getSetPinRequestData unused2) {
        }
        return com.payair.hce.getAppVersion.AlternateContactlessPaymentDataJson;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        getAid = 1;
        writeReplace = (char) 36623;
        valueOf = (char) 19557;
        DigitizedCardProfile = (char) 12071;
        RecordsJson = (char) 48494;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:37|38|(2:40|(3:89|90|91))(4:95|96|97|(12:99|100|43|44|45|(1:47)(5:55|56|57|58|(2:60|(1:62)(5:63|64|65|66|(2:68|(1:(6:71|72|(1:74)|75|76|77))(2:78|79)))))|48|49|(1:51)|52|53|54)(1:101))|42|43|44|45|(0)(0)|48|49|(0)|52|53|54) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02d1 A[Catch: all -> 0x07f8, TRY_ENTER, TryCatch #4 {all -> 0x07f8, blocks: (B:22:0x02d1, B:24:0x02e0, B:25:0x031d, B:29:0x03b5, B:31:0x03f9, B:32:0x0445, B:72:0x0676, B:74:0x06b6, B:75:0x0708, B:49:0x0747, B:51:0x0791, B:52:0x07e4, B:108:0x046f, B:110:0x04b9, B:111:0x0504, B:140:0x022e, B:142:0x0269, B:143:0x02b6, B:3:0x0017, B:5:0x004b, B:10:0x0080, B:17:0x0133, B:115:0x013c, B:117:0x0142, B:118:0x0143, B:7:0x0144, B:120:0x014a, B:127:0x0201, B:130:0x020a, B:132:0x0210, B:133:0x0211), top: B:2:0x0017, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0791 A[Catch: all -> 0x07f8, TryCatch #4 {all -> 0x07f8, blocks: (B:22:0x02d1, B:24:0x02e0, B:25:0x031d, B:29:0x03b5, B:31:0x03f9, B:32:0x0445, B:72:0x0676, B:74:0x06b6, B:75:0x0708, B:49:0x0747, B:51:0x0791, B:52:0x07e4, B:108:0x046f, B:110:0x04b9, B:111:0x0504, B:140:0x022e, B:142:0x0269, B:143:0x02b6, B:3:0x0017, B:5:0x004b, B:10:0x0080, B:17:0x0133, B:115:0x013c, B:117:0x0142, B:118:0x0143, B:7:0x0144, B:120:0x014a, B:127:0x0201, B:130:0x020a, B:132:0x0210, B:133:0x0211), top: B:2:0x0017, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05c4 A[Catch: Exception -> 0x0732, TRY_LEAVE, TryCatch #8 {Exception -> 0x0732, blocks: (B:45:0x05a2, B:55:0x05c4, B:58:0x05eb, B:60:0x05f3, B:63:0x061d, B:66:0x0643, B:82:0x0723, B:83:0x0729, B:86:0x072b, B:87:0x0731, B:65:0x0627, B:57:0x05ce), top: B:44:0x05a2, inners: #1, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        int i4;
        getProfileVersion = (getAid + 27) % 128;
        int i5 = 16;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("柆徽즉ﭔ섋욏ꂾ彄뾳윏\ue447宪\uddc3䣱ǵᔡ昜瞀㫨인", 19 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("\ue56b\udea6戜ᮠ\ue27d泦듆\ud95a䩢玮즉ﭔ섋욏ꂾ彄뾳윏", 18 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
                i3 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.lang.Exception unused) {
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-341220564) | i)) | 67502081) | r3) * (-470)) - 1628831314) + (((~((~i) | 937426903)) | (~((-273718483) | i))) * 470))};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                byte b = (byte) (-$$a[14]);
                byte b2 = (byte) (b - 1);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(b, b2, b2, objArr6);
                obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
            }
            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
        }
        try {
            while (i3 < 2) {
                java.lang.String str2 = strArr[i3];
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a("甮率胃苹埵䮲な\ud9d1诏펬蝫즛檇⾨㺃巊", 16 - android.view.View.getDefaultSize(0, 0), objArr7);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                    getAid = (getProfileVersion + 109) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    try {
                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf((((((~((-452958628) | r3)) | (~((-551970358) | i))) * (-370)) - 833501688) + ((((~((~i) | (-551970358))) | (~((-452958628) | i))) | (-989855672)) * (-370))) - 1174378480)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                            byte b3 = (byte) (-$$a[14]);
                            byte b4 = (byte) (b3 - 1);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(b3, b4, b4, objArr9);
                            obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                        }
                        ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                        if (i == ((int[]) objArr[1])[0]) {
                            return objArr;
                        }
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, 2391 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 29420));
                            byte b5 = $$a[14];
                            byte b6 = (byte) (b5 + 1);
                            byte b7 = (byte) (-b5);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b6, b7, b7, objArr10);
                            obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                        long j = i;
                        long j2 = ((530 * longValue) - 675051266022L) + (((~((~j) | (-1273681636))) | (~(longValue | (-1273681636)))) * 529) + (((~longValue) | ((-1) ^ (j | (-1273681636)))) * 529) + 1555765732;
                        int i6 = (int) (j2 >> 32);
                        int i7 = ~i;
                        if (((i6 & (((((~(i7 | (-1915843773))) | (~((-478617362) | i))) * 959) - 1338464073) + (((~((-1915843773) | i)) | (~((-478617362) | i7))) * 959))) | (((int) j2) & (((~((-86017417) | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 687625860 + (((~((-86017417) | i7)) | (-1878978559)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) == 1) {
                            getAid = (getProfileVersion + 21) % 128;
                            objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                            java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-579194401) | i) * (-627)) - 264790560) + (((~((-425210079) | i)) | 579718906) * (-627)) + (((~(425210078 | i7)) | (~(579718906 | i))) * 627))};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj5 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, android.view.KeyEvent.normalizeMetaState(0) + 2713, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                byte b8 = (byte) (-$$a[14]);
                                byte b9 = (byte) (b8 - 1);
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                b(b8, b9, b9, objArr12);
                                obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                            }
                            ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                        } else {
                            objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-68288731) | i7)) | (~(936640254 | i))) * (-272)) - 1335395944) + (((~((-127089883) | i)) | 58801152) * (-272)) + (((~(127089882 | i)) | 877839102) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj6 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, android.os.Process.getGidForName("") + 2714, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte b10 = (byte) (-$$a[14]);
                                byte b11 = (byte) (b10 - 1);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b(b10, b11, b11, objArr14);
                                obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                            }
                            ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                        }
                        if (i != ((int[]) objArr2[1])[0]) {
                            return objArr2;
                        }
                        try {
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a("\uf00b䤺\uef7f굇皲㒓뾳윏툇뜘浠蠾귿썸섋욏霋쀽퐍ô乳羠\ue27d泦霋쀽쁔똩ｩ\ue2b3خꖄ硭禱퐍ô乳羠뾳윏", 40 - android.text.TextUtils.getOffsetBefore("", 0), objArr15);
                            file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                        } catch (java.lang.Exception unused2) {
                        }
                        if (file2.canRead()) {
                            java.io.FileReader fileReader = new java.io.FileReader(file2);
                            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                            try {
                                str = bufferedReader.readLine();
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a("껢ꆦ䯐Ⳉ", 4 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr16);
                                if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                    getProfileVersion = (getAid + 85) % 128;
                                    fileReader.close();
                                    bufferedReader.close();
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a("歑텟懤飩吺Ὄ췵繕㫨㔲\uf14eﱔ\ue45d\u200e♍\ue7f4鍽瓍퐍ô乳羠奪홰خꖄ䘺㔔牼镞㫨인", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 17, objArr17);
                                    file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                    if (!file.canRead()) {
                                        try {
                                            java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            a("\uee6e佬", 1 - android.view.View.MeasureSpec.getSize(0), objArr18);
                                            if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                a("\uf00b䤺\uef7f굇皲㒓뾳윏툇뜘浠蠾귿썸섋욏霋쀽퐍ô乳羠\ue27d泦霋쀽퐍ô乳羠\ue27d泦ท쌶ꖍ㉔", 36 - android.text.TextUtils.indexOf("", ""), objArr19);
                                                java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                if (file3.canRead()) {
                                                    try {
                                                        java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                        a("\uee6e佬", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr20);
                                                        if (readLine2.equals(((java.lang.String) objArr20[0]).intern())) {
                                                            int i8 = getProfileVersion + 103;
                                                            int i9 = i8 % 128;
                                                            getAid = i9;
                                                            if (i8 % 2 == 0) {
                                                                throw new java.lang.ArithmeticException();
                                                            }
                                                            if (str != null) {
                                                                getProfileVersion = (i9 + 81) % 128;
                                                                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i | 46070706)) | 1006632969) * 576) + 1986419160 + (((~(1052703675 | i7)) | 44366722) * 576) + 5184)};
                                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj7 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                    byte b12 = (byte) (-$$a[14]);
                                                                    byte b13 = (byte) (b12 - 1);
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    b(b12, b13, b13, objArr23);
                                                                    obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                }
                                                                ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                return objArr21;
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                } else {
                                                    getAid = (getProfileVersion + 35) % 128;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                    java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(21275845 | i7)) | (-1026204831)) | (~((-21275846) | i))) * (-564)) - 1363652728) + ((~(i | (-16819333))) * 1128) + (((~((-1026204831) | i7)) | 4456513) * 564))};
                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                        byte b14 = (byte) (-$$a[14]);
                                        byte b15 = (byte) (b14 - 1);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        b(b14, b15, b15, objArr26);
                                        obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                    }
                                    ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                    return objArr24;
                                }
                                fileReader.close();
                                bufferedReader.close();
                            } finally {
                            }
                        } else {
                            int i10 = getAid + 25;
                            getProfileVersion = i10 % 128;
                            if (i10 % 2 != 0) {
                                throw new java.lang.NullPointerException();
                            }
                        }
                        str = null;
                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                        a("歑텟懤飩吺Ὄ췵繕㫨㔲\uf14eﱔ\ue45d\u200e♍\ue7f4鍽瓍퐍ô乳羠奪홰خꖄ䘺㔔牼镞㫨인", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 17, objArr172);
                        file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                        if (!file.canRead()) {
                        }
                        java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(21275845 | i7)) | (-1026204831)) | (~((-21275846) | i))) * (-564)) - 1363652728) + ((~(i | (-16819333))) * 1128) + (((~((-1026204831) | i7)) | 4456513) * 564))};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj == null) {
                        }
                        ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                        return objArr242;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                i3++;
                i5 = 16;
            }
            java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~((-665771718) | i4)) | (~((-339157268) | i))) | (~(339157267 | i4))) * 959) - 1316225064) + (((~(i4 | (-339157268))) | (~((-665771718) | i)) | (~(339157267 | i))) * 959))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                byte b16 = (byte) (-$$a[14]);
                byte b17 = (byte) (b16 - 1);
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b(b16, b17, b17, objArr28);
                obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
            if (i == ((int[]) objArr[1])[0]) {
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
        i4 = ~i;
    }

    static void init$1() {
        $$d = new byte[]{64, 104, -78, -117};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{34, -19, 77, -23, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 110;
    }

    public final int values(com.payair.hce.reInitialize reinitialize, com.payair.hce.getDefaultCardForContactlessPayments getdefaultcardforcontactlesspayments, com.payair.hce.suspendCardForToken suspendcardfortoken, com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries, com.payair.hce.activateCardForToken activatecardfortoken) {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this, reinitialize, getdefaultcardforcontactlesspayments, suspendcardfortoken, getnumberoftransactionlogentries, activatecardfortoken}, 1973476689, -1973476689, java.lang.System.identityHashCode(this))).intValue();
    }
}
