package com.payair.hce;

/* loaded from: classes4.dex */
public final class onCardProvisionFailure {
    private static int getAid = 1;
    private static int writeReplace;
    private com.payair.hce.onSdkUnregistered AlternateContactlessPaymentDataJson;
    private com.payair.hce.onSystemHealthCompleted DigitizedCardProfile;
    private com.payair.hce.getCodeCacheDir valueOf;
    private com.payair.hce.onShowAuthenticateScreen values;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object ondeletecardcompleted;
        com.payair.hce.access000 access000Var;
        com.payair.hce.onCardProvisionFailure oncardprovisionfailure = (com.payair.hce.onCardProvisionFailure) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i4 = writeReplace;
        getAid = (((i4 & 114) + (i4 | 114)) - 1) % 128;
        int[] iArr = com.payair.hce.onCardProvisionFailure.AnonymousClass2.AlternateContactlessPaymentDataJson;
        int i5 = intValue * (-751);
        int i6 = ((i5 ^ 751) | (i5 & 751)) << 1;
        int i7 = -(((~i5) & 751) | (i5 & (-752)));
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = ~intValue;
        int i10 = ~i9;
        int i11 = i9 | i10;
        int i12 = i10 & i11;
        int i13 = (intValue | i9) & i9;
        int i14 = ((i12 ^ i13) | (i12 & i13)) * 1504;
        int i15 = i8 & i14;
        int i16 = -(-((i14 ^ i8) | i15));
        int i17 = (((i15 & i16) + (i16 | i15)) - (~(-(-(i13 * (-1504)))))) - 1;
        int i18 = ~i11;
        int i19 = -(-(((i18 & (i11 | i18)) | i9) * 752));
        int i20 = i17 & i19;
        int i21 = iArr[i20 + ((i19 ^ i17) | i20)];
        if (i21 == 1) {
            com.payair.hce.access000 access000Var2 = new com.payair.hce.access000();
            com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2, new com.payair.hce.setCardRiskManagementData()}, -782629219, 782629243, java.lang.System.identityHashCode(access000Var2));
            com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2, new com.payair.hce.requestChangePin(access000Var2)}, 109896524, -109896519, java.lang.System.identityHashCode(access000Var2));
            ondeletecardcompleted = new com.payair.hce.onDeleteCardCompleted(access000Var2);
            int i22 = getAid;
            writeReplace = ((i22 & 55) + (i22 | 55)) % 128;
            access000Var = access000Var2;
        } else if (i21 == 2) {
            com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = new com.payair.hce.onContactlessPaymentCompleted();
            com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{oncontactlesspaymentcompleted, new com.payair.hce.setRemotePaymentData()}, -782629219, 782629243, java.lang.System.identityHashCode(oncontactlesspaymentcompleted));
            com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{oncontactlesspaymentcompleted, new com.payair.hce.requestSetPin(oncontactlesspaymentcompleted)}, 109896524, -109896519, java.lang.System.identityHashCode(oncontactlesspaymentcompleted));
            ondeletecardcompleted = new com.payair.hce.onContactlessPaymentIncident(oncontactlesspaymentcompleted);
            int i23 = getAid;
            int i24 = i23 & 115;
            int i25 = (i23 | 115) & (~i24);
            int i26 = i24 << 1;
            writeReplace = ((i25 & i26) + (i25 | i26)) % 128;
            access000Var = oncontactlesspaymentcompleted;
        } else if (i21 != 3) {
            access000Var = null;
            ondeletecardcompleted = null;
        } else {
            com.payair.hce.access100 access100Var = new com.payair.hce.access100();
            com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access100Var, new com.payair.hce.setPan()}, -782629219, 782629243, java.lang.System.identityHashCode(access100Var));
            com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access100Var, new com.payair.hce.getRegistrationRequestData(access100Var)}, 109896524, -109896519, java.lang.System.identityHashCode(access100Var));
            ondeletecardcompleted = new com.payair.hce.onContactlessPaymentAborted(access100Var);
            int i27 = writeReplace;
            int i28 = i27 & 61;
            int i29 = (i27 ^ 61) | i28;
            getAid = ((i28 & i29) + (i29 | i28)) % 128;
            access000Var = access100Var;
        }
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, oncardprovisionfailure.values}, 1824321231, -1824321213, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, oncardprovisionfailure.valueOf}, 416557702, -416557675, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted = oncardprovisionfailure.DigitizedCardProfile;
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, (com.payair.hce.smallInitialization) com.payair.hce.onSystemHealthCompleted.valueOf(new java.lang.Object[]{onsystemhealthcompleted}, 862517323, -862517320, java.lang.System.identityHashCode(onsystemhealthcompleted))}, 489798977, -489798976, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, new com.payair.hce.access400()}, 1661508176, -1661508172, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, new com.payair.hce.access300()}, 899751733, -899751716, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted2 = oncardprovisionfailure.DigitizedCardProfile;
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, new com.payair.hce.processNotificationData((com.payair.hce.initContext) com.payair.hce.onSystemHealthCompleted.valueOf(new java.lang.Object[]{onsystemhealthcompleted2}, 1927097451, -1927097451, java.lang.System.identityHashCode(onsystemhealthcompleted2)))}, 1939173520, -1939173499, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted3 = oncardprovisionfailure.DigitizedCardProfile;
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, (com.payair.hce.setUpMCBP) com.payair.hce.onSystemHealthCompleted.valueOf(new java.lang.Object[]{onsystemhealthcompleted3}, -1376714403, 1376714405, java.lang.System.identityHashCode(onsystemhealthcompleted3))}, 2025967085, -2025967063, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted4 = oncardprovisionfailure.DigitizedCardProfile;
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, (com.payair.hce.initContext) com.payair.hce.onSystemHealthCompleted.valueOf(new java.lang.Object[]{onsystemhealthcompleted4}, 1927097451, -1927097451, java.lang.System.identityHashCode(onsystemhealthcompleted4))}, 170701434, -170701414, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted5 = oncardprovisionfailure.DigitizedCardProfile;
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, (com.payair.hce.useDemoMode) com.payair.hce.onSystemHealthCompleted.valueOf(new java.lang.Object[]{onsystemhealthcompleted5}, -790387121, 790387122, java.lang.System.identityHashCode(onsystemhealthcompleted5))}, 770021538, -770021530, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, oncardprovisionfailure.AlternateContactlessPaymentDataJson}, -1495583756, 1495583768, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, new com.payair.hce.createDeviceProtectedStorageContext(access000Var.DigitizedCardProfile(), access000Var.AlternateContactlessPaymentDataJson())}, -1493160897, 1493160897, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.getCodeCacheDir getcodecachedir = oncardprovisionfailure.valueOf;
        com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir));
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var, new com.payair.hce.onUserValidationObtained(((java.lang.Boolean) com.payair.hce.createConfigurationContext.valueOf(new java.lang.Object[]{createconfigurationcontext}, -1434712803, 1434712804, java.lang.System.identityHashCode(createconfigurationcontext))).booleanValue())}, 672908291, -672908265, java.lang.System.identityHashCode(access000Var));
        int i30 = writeReplace;
        int i31 = i30 & 1;
        int i32 = -(-((i30 ^ 1) | i31));
        getAid = (((i31 | i32) << 1) - (i32 ^ i31)) % 128;
        return ondeletecardcompleted;
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class values {
        private static final /* synthetic */ int[] AlternateContactlessPaymentDataJson = {1, 2, 3};
        private static int DigitizedCardProfile = 50;
        private static int RecordsJson = 1;
        public static final int valueOf = 1;
        public static final int values = 3;
        public static final int writeReplace = 2;

        static {
            int i = 50 % 2;
        }

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            DigitizedCardProfile = (RecordsJson + 59) % 128;
            int[] iArr = (int[]) AlternateContactlessPaymentDataJson.clone();
            int i4 = DigitizedCardProfile;
            int i5 = (i4 | 87) << 1;
            int i6 = -(i4 ^ 87);
            RecordsJson = ((i5 & i6) + (i6 | i5)) % 128;
            return iArr;
        }

        public static int[] valueOf() {
            return (int[]) DigitizedCardProfile(new java.lang.Object[0], 1736745733, -1736745733, (int) java.lang.System.currentTimeMillis());
        }
    }

    public onCardProvisionFailure(com.payair.hce.onSdkUnregistered onsdkunregistered, com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted, com.payair.hce.getCodeCacheDir getcodecachedir, com.payair.hce.onShowAuthenticateScreen onshowauthenticatescreen) {
        this.AlternateContactlessPaymentDataJson = onsdkunregistered;
        this.DigitizedCardProfile = onsystemhealthcompleted;
        this.valueOf = getcodecachedir;
        this.values = onshowauthenticatescreen;
    }

    /* renamed from: com.payair.hce.onCardProvisionFailure$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int values = 0;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[((int[]) com.payair.hce.onCardProvisionFailure.values.DigitizedCardProfile(new java.lang.Object[0], 1736745733, -1736745733, (int) java.lang.System.currentTimeMillis())).length];
            AlternateContactlessPaymentDataJson = iArr;
            try {
                int i = com.payair.hce.onCardProvisionFailure.values.valueOf;
                iArr[0] = 1;
                int i2 = writeReplace;
                values = ((i2 ^ 75) + ((i2 & 75) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = AlternateContactlessPaymentDataJson;
                int i3 = com.payair.hce.onCardProvisionFailure.values.writeReplace;
                iArr2[1] = 2;
                int i4 = writeReplace;
                int i5 = i4 ^ 45;
                int i6 = ((i4 & 45) | i5) << 1;
                int i7 = -i5;
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                values = i8 % 128;
                int i9 = i8 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = AlternateContactlessPaymentDataJson;
                int i10 = com.payair.hce.onCardProvisionFailure.values.values;
                iArr3[2] = 3;
                values = ((-2) - (~(writeReplace + 62))) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public final com.payair.hce.onTransactionStopped AlternateContactlessPaymentDataJson(int i) {
        return (com.payair.hce.onTransactionStopped) DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -2119412281, 2119412281, i);
    }
}
