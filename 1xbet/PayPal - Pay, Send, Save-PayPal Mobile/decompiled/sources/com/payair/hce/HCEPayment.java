package com.payair.hce;

/* loaded from: classes4.dex */
public class HCEPayment {
    static com.payair.hce.setDefaultFocusHighlightEnabled.writeReplace AlternateContactlessPaymentDataJson = null;
    private static int DigitizedCardProfile = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i4 = values;
        int i5 = (i4 & (-4)) | ((~i4) & 3);
        int i6 = (i4 & 3) << 1;
        DigitizedCardProfile = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        ((com.payair.hce.setDefaultFocusHighlightEnabled) com.payair.hce.setImportantForAccessibility.DigitizedCardProfile()).valueOf(longValue);
        int i7 = values;
        int i8 = (i7 & (-84)) | ((~i7) & 83);
        int i9 = -(-((i7 & 83) << 1));
        DigitizedCardProfile = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        return null;
    }

    private HCEPayment() {
    }

    public static void setUserValidationRequestListener() {
        com.payair.hce.setImportantForAccessibility.AlternateContactlessPaymentDataJson().DigitizedCardProfile(new com.payair.hce.UserValidationRequestListener.AlternateContactlessPaymentDataJson() { // from class: com.payair.hce.HCEPayment.2
            private static int valueOf = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                return DigitizedCardProfile(objArr);
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                valueOf = (values + 69) % 128;
                com.payair.hce.setImportantForAccessibility.DigitizedCardProfile();
                int i = values;
                int i2 = i ^ 63;
                int i3 = -(-((i & 63) << 1));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.UserValidationRequestListener.AlternateContactlessPaymentDataJson
            public final void DigitizedCardProfile() {
                valueOf(new java.lang.Object[]{this}, -835515520, 835515520, java.lang.System.identityHashCode(this));
            }
        });
        int i = DigitizedCardProfile;
        values = ((i & 121) + (i | 121)) % 128;
    }

    public static void setAuthenticationAquirer() {
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Boolean.TRUE}, 375609050, -375609049, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -194232775, 194232779, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setImportantForAccessibility.values(new com.payair.hce.setNextClusterForwardId() { // from class: com.payair.hce.HCEPayment.5
            private static int DigitizedCardProfile = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.HCEPayment.AnonymousClass5 anonymousClass5 = (com.payair.hce.HCEPayment.AnonymousClass5) objArr[0];
                final com.payair.hce.UserValidationRequestListener.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.payair.hce.UserValidationRequestListener.AlternateContactlessPaymentDataJson) objArr[1];
                int i4 = DigitizedCardProfile;
                writeReplace = (((i4 ^ 106) + ((i4 & 106) << 1)) - 1) % 128;
                if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1438091063, 1438091080, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    com.payair.hce.setDefaultFocusHighlightEnabled.writeReplace writereplace = new com.payair.hce.setDefaultFocusHighlightEnabled.writeReplace() { // from class: com.payair.hce.HCEPayment.5.1
                        private static int AlternateContactlessPaymentDataJson = 0;
                        private static int DigitizedCardProfile = 1;

                        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i5, int i6, int i7) {
                            return AlternateContactlessPaymentDataJson(objArr2);
                        }

                        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                            com.payair.hce.HCEPayment.AnonymousClass5.AnonymousClass1 anonymousClass1 = (com.payair.hce.HCEPayment.AnonymousClass5.AnonymousClass1) objArr2[0];
                            int identityHashCode = java.lang.System.identityHashCode(anonymousClass1);
                            int i5 = identityHashCode & (-808943831);
                            int i6 = ~((identityHashCode ^ (-808943831)) | i5);
                            int i7 = i6 & 268796096;
                            int i8 = (i6 | 268796096) & (~i7);
                            int i9 = -(~(-(-(((i8 ^ i7) | (i8 & i7)) * (-814)))));
                            int i10 = ~identityHashCode;
                            int i11 = (i10 | identityHashCode) & i10;
                            int i12 = i11 & (-495823841);
                            int i13 = (i11 | (-495823841)) & (~i12);
                            int i14 = ~((i13 ^ i12) | (i13 & i12));
                            int i15 = (i14 ^ (-1035971575)) | (i14 & (-1035971575));
                            int i16 = identityHashCode & 808943830;
                            int i17 = ((-808943831) & i10) | i16;
                            int i18 = (i17 ^ i5) | (i17 & i5);
                            int i19 = ~i18;
                            int i20 = (i18 | i19) & i19;
                            int i21 = -(-(((i20 ^ i15) | (i20 & i15)) * 407));
                            int i22 = (~i16) & (808943830 | identityHashCode);
                            int i23 = ~((i22 ^ i16) | (i16 & i22));
                            int i24 = ((~i23) & (-1035971575)) | (1035971574 & i23);
                            int i25 = i23 & (-1035971575);
                            int i26 = (i25 ^ i24) | (i25 & i24);
                            int i27 = identityHashCode & 495823840;
                            int i28 = (identityHashCode | 495823840) & (~i27);
                            int i29 = ~((i28 ^ i27) | (i28 & i27));
                            int i30 = ((~i29) & i26) | ((~i26) & i29);
                            int i31 = i29 & i26;
                            int i32 = -(~(-(-(((i31 ^ i30) | (i31 & i30)) * 407))));
                            int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass1);
                            int i33 = ~identityHashCode2;
                            int i34 = ((((-1074045174) ^ i33) | (i33 & (-1074045174))) * (-369)) - 934320124;
                            int i35 = i33 & (-869422857);
                            int i36 = ~((i33 ^ (-869422857)) | i35);
                            int i37 = ((~i36) & (-1347876854)) | (1347876853 & i36);
                            int i38 = i36 & (-1347876854);
                            int i39 = -(-(((i38 ^ i37) | (i38 & i37)) * (-369)));
                            int i40 = (i34 | i39) << 1;
                            int i41 = -((i34 & (~i39)) | ((~i34) & i39));
                            int i42 = (i40 & i41) + (i41 | i40);
                            int i43 = identityHashCode2 & 869422856;
                            int i44 = (identityHashCode2 | 869422856) & (~i43);
                            int i45 = ~((i44 ^ i43) | (i44 & i43));
                            int i46 = i45 & (-1943468030);
                            int i47 = (i45 | (-1943468030)) & (~i46);
                            int i48 = (i47 ^ i46) | (i47 & i46);
                            int i49 = ((~i33) & (-869422857)) | (869422856 & i33);
                            int i50 = ~((i49 ^ i35) | (i35 & i49) | (-1347876854));
                            int i51 = -(-(((i48 ^ i50) | (i48 & i50)) * 369));
                            if ((((-2) - (~((974002121 - (~i9)) - (~i21)))) - (~i32)) - 2 <= ((i42 | i51) << 1) - (i51 ^ i42)) {
                                alternateContactlessPaymentDataJson.DigitizedCardProfile();
                                com.payair.hce.HCEPayment.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis())}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
                                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Boolean.TRUE}, 375609050, -375609049, (int) java.lang.System.currentTimeMillis());
                                com.payair.hce.setFocusable.values(new java.lang.Object[]{null}, -1554538762, 1554538769, (int) java.lang.System.currentTimeMillis());
                            } else {
                                alternateContactlessPaymentDataJson.DigitizedCardProfile();
                                com.payair.hce.HCEPayment.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis())}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
                                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Boolean.FALSE}, 375609050, -375609049, (int) java.lang.System.currentTimeMillis());
                                com.payair.hce.setFocusable.values(new java.lang.Object[]{null}, -1554538762, 1554538769, (int) java.lang.System.currentTimeMillis());
                            }
                            int i52 = DigitizedCardProfile;
                            int i53 = i52 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                            int i54 = (i52 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i53;
                            int i55 = (i53 & i54) + (i54 | i53);
                            AlternateContactlessPaymentDataJson = i55 % 128;
                            if (i55 % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }

                        @Override // com.payair.hce.setDefaultFocusHighlightEnabled.writeReplace
                        public final void writeReplace() {
                            valueOf(new java.lang.Object[]{this}, 792557464, -792557464, java.lang.System.identityHashCode(this));
                        }
                    };
                    com.payair.hce.HCEPayment.AlternateContactlessPaymentDataJson = writereplace;
                    com.payair.hce.setFocusable.values(new java.lang.Object[]{writereplace}, -1554538762, 1554538769, (int) java.lang.System.currentTimeMillis());
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onShowAuthenticateScreen(false);
                    int i5 = writeReplace;
                    int i6 = i5 & 115;
                    int i7 = (i5 ^ 115) | i6;
                    DigitizedCardProfile = ((i6 & i7) + (i7 | i6)) % 128;
                }
                int i8 = DigitizedCardProfile;
                writeReplace = ((i8 ^ 1) + ((i8 & 1) << 1)) % 128;
                return null;
            }

            @Override // com.payair.hce.setNextClusterForwardId
            public final void DigitizedCardProfile(com.payair.hce.UserValidationRequestListener.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson) {
                DigitizedCardProfile(new java.lang.Object[]{this, alternateContactlessPaymentDataJson}, -1343081647, 1343081647, java.lang.System.identityHashCode(this));
            }
        });
        values = (DigitizedCardProfile + 31) % 128;
    }

    static void values(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
    }
}
