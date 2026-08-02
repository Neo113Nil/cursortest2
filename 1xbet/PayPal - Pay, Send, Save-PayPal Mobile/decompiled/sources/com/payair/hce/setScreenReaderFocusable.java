package com.payair.hce;

/* loaded from: classes4.dex */
final class setScreenReaderFocusable {
    private static int DigitizedCardProfile = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = (~i3) | i4;
        int i6 = ~i;
        int i7 = (i * (-112)) + (i2 * (-112)) + (((~i5) | i) * 226) + (((~(i | i5)) | (~(i2 | i6)) | (~(i6 | i3))) * (-113)) + ((~(i4 | i3)) * 113);
        if (i7 == 1) {
            return values(objArr);
        }
        if (i7 != 2) {
            return i7 != 3 ? valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        android.content.Context context = (android.content.Context) objArr[0];
        int i8 = values;
        int i9 = i8 & 13;
        int i10 = ((i8 | 13) & (~i9)) + (i9 << 1);
        DigitizedCardProfile = i10 % 128;
        int i11 = i10 % 2;
        return java.lang.Boolean.valueOf(((java.lang.Boolean) writeReplace(new java.lang.Object[]{context, java.lang.Boolean.TRUE}, -1619977357, 1619977357, (int) java.lang.System.currentTimeMillis())).booleanValue());
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1894088153, 1894088180, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1264232027, -1264231992, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis())}, -1644307546, 1644307609, (int) java.lang.System.currentTimeMillis());
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.payair.hce.setScreenReaderFocusable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.payair.hce.setSaveFromParentEnabled.AlternateContactlessPaymentDataJson();
            }
        });
        int i = DigitizedCardProfile;
        int i2 = i | 81;
        int i3 = ((i2 << 1) - (~(-((~(i & 81)) & i2)))) - 1;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 97) | (i & 97)) << 1;
        int i3 = -((i & (-98)) | ((~i) & 97));
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            writeReplace(new java.lang.Object[0], 656844064, -656844063, (int) java.lang.System.currentTimeMillis());
            int i5 = values;
            int i6 = i5 ^ 91;
            int i7 = ((i5 & 91) | i6) << 1;
            int i8 = -i6;
            DigitizedCardProfile = (((i7 | i8) << 1) - (i7 ^ i8)) % 128;
            return null;
        }
        writeReplace(new java.lang.Object[0], 656844064, -656844063, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if (((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())) == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured;
        android.content.Context context = (android.content.Context) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = DigitizedCardProfile;
        int i2 = (i & (-24)) | ((~i) & 23);
        int i3 = (i & 23) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            try {
                if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -681676126, 681676160, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    if (booleanValue) {
                        int i5 = values;
                        int i6 = (i5 ^ 105) + ((i5 & 105) << 1);
                        DigitizedCardProfile = i6 % 128;
                        if (i6 % 2 == 0) {
                            throw null;
                        }
                    }
                    int i7 = values;
                    DigitizedCardProfile = (((i7 & 78) + (i7 | 78)) - 1) % 128;
                    return java.lang.Boolean.FALSE;
                }
                com.payair.hce.setHasTransientState sethastransientstate = new com.payair.hce.setHasTransientState();
                java.lang.String str = (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, 759441492, -759441492, java.lang.System.identityHashCode(setfiltertoucheswhenobscured));
                java.lang.String str2 = (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, -1029034562, 1029034564, java.lang.System.identityHashCode(setfiltertoucheswhenobscured));
                com.payair.hce.AuthenticationEnum authenticationEnum = (com.payair.hce.AuthenticationEnum) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, 1004472773, -1004472768, java.lang.System.identityHashCode(setfiltertoucheswhenobscured));
                int intValue = ((java.lang.Integer) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, 1732164557, -1732164547, java.lang.System.identityHashCode(setfiltertoucheswhenobscured))).intValue();
                com.payair.hce.HCEInitializer.initialize(context, sethastransientstate, str, str2, authenticationEnum, java.lang.Integer.valueOf(intValue), (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, -1389129118, 1389129125, java.lang.System.identityHashCode(setfiltertoucheswhenobscured)), (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, 2107836179, -2107836170, java.lang.System.identityHashCode(setfiltertoucheswhenobscured)), ((java.lang.Boolean) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, 1287038477, -1287038473, java.lang.System.identityHashCode(setfiltertoucheswhenobscured))).booleanValue(), (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, -1059012793, 1059012801, java.lang.System.identityHashCode(setfiltertoucheswhenobscured)), (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, -2102605827, 2102605830, java.lang.System.identityHashCode(setfiltertoucheswhenobscured)), (java.lang.String) com.payair.hce.setFilterTouchesWhenObscured.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfiltertoucheswhenobscured}, 758756574, -758756568, java.lang.System.identityHashCode(setfiltertoucheswhenobscured)));
                com.payair.hce.HCEInitializer.setUpMCBP(booleanValue);
                int i8 = DigitizedCardProfile;
                int i9 = i8 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i10 = (((i8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i9)) - (~(i9 << 1))) - 1;
                values = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 / 4;
                }
                int i72 = values;
                DigitizedCardProfile = (((i72 & 78) + (i72 | 78)) - 1) % 128;
                return java.lang.Boolean.FALSE;
            } catch (java.lang.Throwable unused) {
                return java.lang.Boolean.TRUE;
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context}, -1230033843, 1230033934, (int) java.lang.System.currentTimeMillis());
            if (!((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[0], -1435836338, 1435836351, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i12 = ~currentTimeMillis;
                int i13 = ((~i12) & (-753192002)) | (i12 & 753192001);
                int i14 = i12 & (-753192002);
                int i15 = ~((i13 ^ i14) | (i14 & i13));
                int i16 = i15 & 604013568;
                int i17 = (i15 | 604013568) & (~i16);
                int i18 = -(-(((i17 ^ i16) | (i17 & i16)) * (-245)));
                int i19 = ((i18 ^ (-1412867974)) | (i18 & (-1412867974))) << 1;
                int i20 = -(((~i18) & (-1412867974)) | (1412867973 & i18));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = i14 | (currentTimeMillis & 753192001);
                int i23 = currentTimeMillis & (-753192002);
                int i24 = (~((i22 ^ i23) | (i22 & i23))) * (-245);
                int i25 = ((i21 | i24) << 1) - (i24 ^ i21);
                int i26 = (currentTimeMillis | (-753192002)) & (~i23);
                int i27 = ~((i26 ^ i23) | (i26 & i23));
                int i28 = ((~i27) & (-907064725)) | (907064724 & i27);
                int i29 = i27 & (-907064725);
                int i30 = -(~(((i29 ^ i28) | (i29 & i28)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i31 = ~currentTimeMillis2;
                int i32 = (i31 | currentTimeMillis2) & i31;
                int i33 = (i32 ^ 824244893) | (i32 & 824244893);
                int i34 = ~i33;
                int i35 = (i33 | i34) & i34;
                int i36 = ((i35 ^ (-1002110944)) | (i35 & (-1002110944))) * (-712);
                int i37 = (i36 & (-1969834402)) + (i36 | (-1969834402));
                int i38 = i31 & 716898142;
                int i39 = (~i38) & (i31 | 716898142);
                int i40 = (i38 & i39) | (i39 ^ i38);
                int i41 = i40 ^ 824244893;
                int i42 = 824244893 & i40;
                int i43 = ~((i42 & i41) | (i41 ^ i42));
                int i44 = (currentTimeMillis2 & 177866050) | (i31 & (-177866051)) | (currentTimeMillis2 & (-177866051));
                int i45 = ~i44;
                int i46 = (i44 | i45) & i45;
                int i47 = i43 ^ i46;
                int i48 = i46 & i43;
                int i49 = -(-(((i48 ^ i47) | (i48 & i47)) * (-712)));
                int i50 = i37 ^ i49;
                int i51 = ((i49 & i37) | i50) << 1;
                int i52 = -i50;
                if (((i25 ^ i30) + ((i30 & i25) << 1)) - 1 <= (i51 & i52) + (i51 | i52) + (((i34 & 716898142) | (i34 ^ 716898142)) * 712)) {
                    com.payair.hce.setLeft.values(new java.lang.Object[0], -792000361, 792000375, (int) java.lang.System.currentTimeMillis());
                } else {
                    com.payair.hce.setLeft.values(new java.lang.Object[0], -792000361, 792000375, (int) java.lang.System.currentTimeMillis());
                    throw null;
                }
            }
            setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace((java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"INITIALISATION_VALUES", "", ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis()), com.payair.hce.setFilterTouchesWhenObscured.class);
        } else {
            throw new java.lang.ArithmeticException();
        }
    }

    static boolean values(android.content.Context context, boolean z) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{context, java.lang.Boolean.valueOf(z)}, -1619977357, 1619977357, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean writeReplace(android.content.Context context) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{context}, -71797868, 71797870, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void writeReplace() {
        writeReplace(new java.lang.Object[0], 565724162, -565724159, (int) java.lang.System.currentTimeMillis());
    }

    static void values() {
        writeReplace(new java.lang.Object[0], 656844064, -656844063, (int) java.lang.System.currentTimeMillis());
    }
}
