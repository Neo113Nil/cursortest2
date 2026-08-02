package com.payair.hce;

/* loaded from: classes10.dex */
public final class setTransactionCredentialsStatus {
    private static int SdkCoreBusinessLogicModuleImpl = 0;
    private static int getPaymentFci = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "ppseFci")
    private java.lang.String IccPrivateKeyCrtComponentsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "alternateContactlessPaymentData")
    private com.payair.hce.getValidForSeconds RecordsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDeclineOnPpms")
    private java.lang.String getAid;

    @com.payair.hce.setSelectionFromTop(valueOf = "records")
    private com.payair.hce.ProvisionRequestEncrypted[] getCiacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    private java.lang.String getCvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinIvCvc3Track2")
    private java.lang.String getGpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    private java.lang.String getProfileVersion;

    @com.payair.hce.setSelectionFromTop(valueOf = "iccPrivateKeyCrtComponents")
    private com.payair.hce.GetTaskStatusResponseEncrypted valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "cdol1RelatedDataLength")
    private int values;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i4 | i);
        switch ((i * 465) + (i2 * (-463)) + (((~(i5 | i)) | (~(i5 | i4)) | i6) * 464) + (((~i) | i3 | i4) * (-464)) + (((~(i | i3)) | i6) * 464)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                int i7 = getPaymentFci;
                int i8 = (((i7 & 42) + (i7 | 42)) - 1) % 128;
                SdkCoreBusinessLogicModuleImpl = i8;
                java.lang.String str = settransactioncredentialsstatus.getCvrMaskAnd;
                int i9 = i8 | 15;
                getPaymentFci = ((i9 << 1) - (i9 & (~(i8 & 15)))) % 128;
                return str;
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return writeReplace(objArr);
            case 5:
                return values(objArr);
            case 6:
                return getAid(objArr);
            case 7:
                return RecordsJson(objArr);
            case 8:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 9:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus2 = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                int i10 = getPaymentFci;
                int i11 = (i10 | 7) << 1;
                int i12 = -((i10 & (-8)) | ((~i10) & 7));
                SdkCoreBusinessLogicModuleImpl = (((i11 | i12) << 1) - (i11 ^ i12)) % 128;
                java.lang.String str2 = settransactioncredentialsstatus2.getAid;
                SdkCoreBusinessLogicModuleImpl = (i10 + 29) % 128;
                return str2;
            case 10:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus3 = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                int i13 = getPaymentFci;
                int i14 = i13 & 35;
                int i15 = ((i13 ^ 35) | i14) << 1;
                int i16 = -((i13 | 35) & (~i14));
                int i17 = ((i15 & i16) + (i16 | i15)) % 128;
                SdkCoreBusinessLogicModuleImpl = i17;
                java.lang.String str3 = settransactioncredentialsstatus3.SdkCoreAlternateContactlessPaymentDataImpl;
                getPaymentFci = (((i17 | 3) << 1) - (i17 ^ 3)) % 128;
                return str3;
            case 11:
                return getProfileVersion(objArr);
            case 12:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 13:
                return getCiacDecline(objArr);
            case 14:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 15:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus4 = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                java.lang.String str4 = (java.lang.String) objArr[1];
                int i18 = getPaymentFci;
                int i19 = i18 & 125;
                SdkCoreBusinessLogicModuleImpl = ((i19 - (~((i18 ^ 125) | i19))) - 1) % 128;
                settransactioncredentialsstatus4.SdkCoreAlternateContactlessPaymentDataImpl = str4.toUpperCase();
                int i20 = SdkCoreBusinessLogicModuleImpl;
                int i21 = i20 & 125;
                int i22 = (i20 | 125) & (~i21);
                int i23 = i21 << 1;
                getPaymentFci = (((i22 | i23) << 1) - (i22 ^ i23)) % 128;
                return null;
            case 16:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus5 = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                java.lang.String str5 = (java.lang.String) objArr[1];
                int i24 = getPaymentFci;
                SdkCoreBusinessLogicModuleImpl = ((((i24 | 74) << 1) - (i24 ^ 74)) - 1) % 128;
                settransactioncredentialsstatus5.IccPrivateKeyCrtComponentsJson = str5.toUpperCase();
                int i25 = SdkCoreBusinessLogicModuleImpl;
                int i26 = i25 | 31;
                int i27 = i26 << 1;
                int i28 = -((~(i25 & 31)) & i26);
                getPaymentFci = (((i27 | i28) << 1) - (i28 ^ i27)) % 128;
                return null;
            case 17:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus6 = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                java.lang.String str6 = (java.lang.String) objArr[1];
                int i29 = SdkCoreBusinessLogicModuleImpl;
                int i30 = i29 & 39;
                int i31 = (i29 ^ 39) | i30;
                getPaymentFci = (((i30 | i31) << 1) - (i31 ^ i30)) % 128;
                settransactioncredentialsstatus6.getAid = str6.toUpperCase();
                int i32 = SdkCoreBusinessLogicModuleImpl;
                getPaymentFci = (((i32 | 33) << 1) - (i32 ^ 33)) % 128;
                return null;
            case 18:
                return getPaymentFci(objArr);
            case 19:
                return getGpoResponse(objArr);
            case 20:
                return getCvrMaskAnd(objArr);
            case 21:
                return getCvmResetTimeout(objArr);
            case 22:
                return getApplicationLifeCycleData(objArr);
            case 23:
                com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus7 = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
                java.lang.String str7 = (java.lang.String) objArr[1];
                int i33 = SdkCoreBusinessLogicModuleImpl;
                int i34 = ((i33 ^ 59) | (i33 & 59)) << 1;
                int i35 = -((i33 & (-60)) | ((~i33) & 59));
                getPaymentFci = ((i34 ^ i35) + ((i35 & i34) << 1)) % 128;
                settransactioncredentialsstatus7.getGpoResponse = str7.toUpperCase();
                int i36 = SdkCoreBusinessLogicModuleImpl;
                int i37 = i36 & 119;
                getPaymentFci = (i37 + ((i36 ^ 119) | i37)) % 128;
                return null;
            case 24:
                return getCardLayoutDescription(objArr);
            case 25:
                return getSecurityWord(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object getCvmResetTimeout(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i ^ 99;
        int i3 = ((i & 99) | i2) << 1;
        int i4 = -i2;
        getPaymentFci = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        java.lang.String str = settransactioncredentialsstatus.DigitizedCardProfile;
        int i5 = (((i ^ 77) | (i & 77)) << 1) - ((i & (-78)) | ((~i) & 77));
        getPaymentFci = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = ((i | 7) << 1) - ((i & (-8)) | ((~i) & 7));
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            settransactioncredentialsstatus.DigitizedCardProfile = str.toUpperCase();
            return null;
        }
        settransactioncredentialsstatus.DigitizedCardProfile = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = getPaymentFci;
        int i2 = i & 85;
        SdkCoreBusinessLogicModuleImpl = (((~i2) & (i | 85)) + (i2 << 1)) % 128;
        java.lang.String str = settransactioncredentialsstatus.writeReplace;
        int i3 = (i & (-48)) | ((~i) & 47);
        int i4 = -(-((i & 47) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        SdkCoreBusinessLogicModuleImpl = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        ((com.payair.hce.setTransactionCredentialsStatus) objArr[0]).writeReplace = ((java.lang.String) objArr[1]).toUpperCase();
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = ((i & 27) - (~(i | 27))) - 1;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 111;
        int i3 = ((~i2) & (i | 111)) + (i2 << 1);
        getPaymentFci = i3 % 128;
        int i4 = settransactioncredentialsstatus.values;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = ((i & (-14)) | ((~i) & 13)) + ((i & 13) << 1);
        getPaymentFci = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Integer.valueOf(i4);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = getPaymentFci;
        int i2 = (i ^ 93) + ((i & 93) << 1);
        int i3 = i2 % 128;
        SdkCoreBusinessLogicModuleImpl = i3;
        if (i2 % 2 == 0) {
            settransactioncredentialsstatus.values = intValue;
            int i4 = i3 ^ 33;
            getPaymentFci = (((((i3 & 33) | i4) << 1) - (~(-i4))) - 1) % 128;
            return null;
        }
        settransactioncredentialsstatus.values = intValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = ((i & (-124)) | ((~i) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        int i3 = i2 % 128;
        getPaymentFci = i3;
        java.lang.String str = settransactioncredentialsstatus.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = (i3 & (-94)) | ((~i3) & 93);
        int i5 = (i3 & 93) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        SdkCoreBusinessLogicModuleImpl = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = (-2) - (~((i & 102) + (i | 102)));
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            settransactioncredentialsstatus.AlternateContactlessPaymentDataJson = str.toUpperCase();
            int i3 = SdkCoreBusinessLogicModuleImpl;
            int i4 = ((i3 ^ 23) | (i3 & 23)) << 1;
            int i5 = -((i3 & (-24)) | ((~i3) & 23));
            int i6 = (i4 & i5) + (i5 | i4);
            getPaymentFci = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
        settransactioncredentialsstatus.AlternateContactlessPaymentDataJson = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = getPaymentFci;
        int i2 = (((i | 69) << 1) - (~(-(i ^ 69)))) - 1;
        int i3 = i2 % 128;
        SdkCoreBusinessLogicModuleImpl = i3;
        com.payair.hce.getValidForSeconds getvalidforseconds = settransactioncredentialsstatus.RecordsJson;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i3 ^ 53;
        int i5 = (i3 & 53) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getPaymentFci = i6 % 128;
        if (i6 % 2 != 0) {
            return getvalidforseconds;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[1];
        int i = getPaymentFci;
        int i2 = i ^ 35;
        int i3 = ((i & 35) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        SdkCoreBusinessLogicModuleImpl = i5 % 128;
        if (i5 % 2 == 0) {
            settransactioncredentialsstatus.RecordsJson = getvalidforseconds;
            SdkCoreBusinessLogicModuleImpl = ((((i & (-72)) | ((~i) & 71)) - (~((i & 71) << 1))) - 1) % 128;
            return null;
        }
        settransactioncredentialsstatus.RecordsJson = getvalidforseconds;
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = (((i | 90) << 1) - (i ^ 90)) - 1;
        getPaymentFci = i2 % 128;
        java.lang.String str = settransactioncredentialsstatus.IccPrivateKeyCrtComponentsJson;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = getPaymentFci;
        int i2 = (i ^ 103) + ((i & 103) << 1);
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        java.lang.String str = settransactioncredentialsstatus.getProfileVersion;
        if (i2 % 2 != 0) {
            throw null;
        }
        SdkCoreBusinessLogicModuleImpl = ((i ^ 99) + ((i & 99) << 1)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPaymentFci;
        int i2 = i & 77;
        int i3 = -(-((i ^ 77) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        if (i4 % 2 == 0) {
            settransactioncredentialsstatus.getProfileVersion = str.toUpperCase();
            int identityHashCode = java.lang.System.identityHashCode(settransactioncredentialsstatus);
            int i5 = ~identityHashCode;
            int i6 = (i5 | identityHashCode) & i5;
            int i7 = ~i6;
            int i8 = (i7 & (-545734071)) | (545734070 & i6);
            int i9 = i6 & (-545734071);
            int i10 = ~((i8 ^ i9) | (i9 & i8));
            int i11 = i10 ^ 537141510;
            int i12 = i10 & 537141510;
            int i13 = (i12 ^ i11) | (i12 & i11);
            int i14 = (i7 & 1239129272) | (i6 & (-1239129273));
            int i15 = i6 & 1239129272;
            int i16 = ~((i15 ^ i14) | (i15 & i14));
            int i17 = i13 ^ i16;
            int i18 = i16 & i13;
            int i19 = -(~(-(-(((i18 ^ i17) | (i18 & i17)) * 464))));
            int i20 = (-2) - (~((i19 ^ 1397689870) + ((i19 & 1397689870) << 1)));
            int i21 = identityHashCode & (-1239129273);
            int i22 = (identityHashCode ^ (-1239129273)) | i21;
            int i23 = i22 & (-545734071);
            int i24 = (i22 | (-545734071)) & (~i23);
            int i25 = -(~(-(-(((i24 ^ i23) | (i24 & i23)) * (-464)))));
            int i26 = (i5 & 1239129272) | i21;
            int i27 = identityHashCode & 1239129272;
            int i28 = ~((i27 ^ i26) | (i27 & i26));
            int i29 = i28 ^ 537141510;
            int i30 = i28 & 537141510;
            int i31 = -(-(((i30 ^ i29) | (i30 & i29)) * 464));
            int identityHashCode2 = java.lang.System.identityHashCode(settransactioncredentialsstatus);
            int i32 = ~identityHashCode2;
            int i33 = (i32 & 1348524038) | (identityHashCode2 & (-1348524039));
            int i34 = identityHashCode2 & 1348524038;
            int i35 = -(~(-(-(((i33 ^ i34) | (i33 & i34)) * (-50)))));
            int i36 = ((i35 ^ 624309760) + ((i35 & 624309760) << 1)) - 1;
            int i37 = (i32 & (-270571523)) | (270571522 & identityHashCode2);
            int i38 = (-270571523) & identityHashCode2;
            int i39 = ~((i38 ^ i37) | (i38 & i37));
            int i40 = i32 & (-514300883);
            int i41 = ((~i32) & (-514300883)) | (514300882 & i32) | i40;
            int i42 = (i41 ^ 1348524038) | (i41 & 1348524038);
            int i43 = ~i42;
            int i44 = (i42 | i43) & i43;
            int i45 = -(-(((i39 ^ i44) | (i39 & i44)) * 50));
            int i46 = (((i36 ^ i45) | (i36 & i45)) << 1) - (((~i45) & i36) | ((~i36) & i45));
            int i47 = (~i40) & (i32 | (-514300883));
            int i48 = ~((i47 ^ i40) | (i40 & i47));
            int i49 = i48 ^ 243729360;
            int i50 = i48 & 243729360;
            int i51 = (identityHashCode2 | i32) & i32;
            int i52 = ((~i51) & 1348524038) | ((-1348524039) & i51) | (i51 & 1348524038);
            int i53 = ~i52;
            int i54 = -(-((((i52 | i53) & i53) | (i50 & i49) | (i49 ^ i50)) * 50));
            if (((((i20 ^ i25) + ((i20 & i25) << 1)) - 1) - (~i31)) - 1 <= ((i46 | i54) << 1) - (i54 ^ i46)) {
                return null;
            }
            throw null;
        }
        settransactioncredentialsstatus.getProfileVersion = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPaymentFci;
        int i2 = (((i & (-84)) | ((~i) & 83)) - (~((i & 83) << 1))) - 1;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            settransactioncredentialsstatus.getCvrMaskAnd = str.toUpperCase();
            int i3 = SdkCoreBusinessLogicModuleImpl;
            int i4 = i3 & 111;
            int i5 = ((i3 ^ 111) | i4) << 1;
            int i6 = -((i3 | 111) & (~i4));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            getPaymentFci = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        settransactioncredentialsstatus.getCvrMaskAnd = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = getPaymentFci;
        int i2 = i | 73;
        int i3 = ((i2 << 1) - (~(-(i2 & (~(i & 73)))))) - 1;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        java.lang.String str = settransactioncredentialsstatus.getGpoResponse;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i & 23;
        int i5 = -(-((i ^ 23) | i4));
        SdkCoreBusinessLogicModuleImpl = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = getPaymentFci;
        SdkCoreBusinessLogicModuleImpl = (((i & 48) + (i | 48)) - 1) % 128;
        com.payair.hce.ProvisionRequestEncrypted[] provisionRequestEncryptedArr = settransactioncredentialsstatus.getCiacDecline;
        int i2 = (i ^ 11) + ((i & 11) << 1);
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return provisionRequestEncryptedArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        com.payair.hce.ProvisionRequestEncrypted[] provisionRequestEncryptedArr = (com.payair.hce.ProvisionRequestEncrypted[]) objArr[1];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i & 65;
        int i3 = (i2 - (~(-(-((i ^ 65) | i2))))) - 1;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            settransactioncredentialsstatus.getCiacDecline = provisionRequestEncryptedArr;
            return null;
        }
        settransactioncredentialsstatus.getCiacDecline = provisionRequestEncryptedArr;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = ((i & 58) + (i | 58)) - 1;
        getPaymentFci = i2 % 128;
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = settransactioncredentialsstatus.valueOf;
        if (i2 % 2 != 0) {
            return getTaskStatusResponseEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[0];
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[1];
        int i = getPaymentFci;
        int i2 = i + 49;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            settransactioncredentialsstatus.valueOf = getTaskStatusResponseEncrypted;
            int i3 = ((i | 126) << 1) - (i ^ 126);
            SdkCoreBusinessLogicModuleImpl = ((~i3) + (i3 << 1)) % 128;
            return null;
        }
        settransactioncredentialsstatus.valueOf = getTaskStatusResponseEncrypted;
        throw null;
    }

    public final void DigitizedCardProfile(com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted) {
        values(new java.lang.Object[]{this, getTaskStatusResponseEncrypted}, 1559507769, -1559507755, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.GetTaskStatusResponseEncrypted getPaymentFci() {
        return (com.payair.hce.GetTaskStatusResponseEncrypted) values(new java.lang.Object[]{this}, 944687884, -944687860, java.lang.System.identityHashCode(this));
    }

    public final void values(com.payair.hce.ProvisionRequestEncrypted[] provisionRequestEncryptedArr) {
        values(new java.lang.Object[]{this, provisionRequestEncryptedArr}, 146349442, -146349441, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.ProvisionRequestEncrypted[] getGpoResponse() {
        return (com.payair.hce.ProvisionRequestEncrypted[]) values(new java.lang.Object[]{this}, -1609363548, 1609363555, java.lang.System.identityHashCode(this));
    }

    public final void RecordsJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1081675126, -1081675103, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getCiacDecline() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1178558104, -1178558101, java.lang.System.identityHashCode(this));
    }

    public final void SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1484393426, 1484393446, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 714263624, -714263622, java.lang.System.identityHashCode(this));
    }

    public final void getProfileVersion(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 257999473, -257999469, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1158959258, 1158959270, java.lang.System.identityHashCode(this));
    }

    public final void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1087417281, -1087417265, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 251374181, -251374176, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -872883368, 872883383, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String RecordsJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1897930046, 1897930056, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.getValidForSeconds getvalidforseconds) {
        values(new java.lang.Object[]{this, getvalidforseconds}, -342179465, 342179476, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getValidForSeconds getAid() {
        return (com.payair.hce.getValidForSeconds) values(new java.lang.Object[]{this}, 481095094, -481095075, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1780446036, -1780446019, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1437442796, 1437442805, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1077412548, 1077412556, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1646687107, 1646687120, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(int i) {
        values(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 32854005, -32854005, i);
    }

    public final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, 743878840, -743878815, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void writeReplace(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -2044077409, 2044077415, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -2141780035, 2141780053, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1009290899, 1009290921, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 2040522844, -2040522823, java.lang.System.identityHashCode(this));
    }
}
