package com.payair.hce;

/* loaded from: classes4.dex */
public final class setU extends com.payair.hce.Record {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c0, code lost:
    
        if (r0 < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Integer valueOf;
        int i = 0;
        com.payair.hce.setU setu = (com.payair.hce.setU) objArr[0];
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
                int i2 = values + 121;
                DigitizedCardProfile = i2 % 128;
                if (i2 % 2 != 0) {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                    valueOf = java.lang.Integer.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).AlternateContactlessPaymentDataJson()).writeReplace(), 127);
                } else {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted2 = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                    valueOf = java.lang.Integer.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted2}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted2))).AlternateContactlessPaymentDataJson()).writeReplace(), 16);
                }
                i = valueOf.intValue();
                int i3 = values;
                DigitizedCardProfile = ((i3 & 97) + (i3 | 97)) % 128;
            }
            if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.valueOf) {
                int identityHashCode = java.lang.System.identityHashCode(setu);
                int i4 = ~identityHashCode;
                int i5 = i4 & 443031055;
                int i6 = (i4 | 443031055) & (~i5);
                int i7 = ~((i6 ^ i5) | (i6 & i5));
                int i8 = ((~i7) & (-1526439888)) | (1526439887 & i7);
                int i9 = i7 & (-1526439888);
                int i10 = (-694957315) - (~(((i9 ^ i8) | (i9 & i8)) * 446));
                int i11 = identityHashCode & (-1083408833);
                int i12 = ~(((identityHashCode | (-1083408833)) & (~i11)) | i11);
                int i13 = i12 & 2103818;
                int i14 = (i12 | 2103818) & (~i13);
                int i15 = -(~(((i14 ^ i13) | (i14 & i13)) * 446));
                int i16 = ((i10 & i15) + (i15 | i10)) - 1;
                int i17 = (i16 ^ 2107610017) + ((2107610017 & i16) << 1);
                int identityHashCode2 = java.lang.System.identityHashCode(setu);
                int i18 = ~identityHashCode2;
                int i19 = ~(((i18 | identityHashCode2) & i18) | (-1913651842));
                int i20 = (1920990931 & i19) | ((~i19) & (-1920990932));
                int i21 = i19 & (-1920990932);
                int i22 = (i21 ^ i20) | (i21 & i20);
                int i23 = identityHashCode2 & 1916255937;
                int i24 = (identityHashCode2 | 1916255937) & (~i23);
                int i25 = ~((i24 ^ i23) | (i24 & i23));
                int i26 = ((~i25) & i22) | ((~i22) & i25);
                int i27 = i25 & i22;
                int i28 = -(-(((i27 ^ i26) | (i27 & i26)) * (-68)));
                int i29 = i18 | (-1918386836);
                int i30 = (i29 & (-1916255938)) | ((~i29) & 1916255937);
                int i31 = i29 & 1916255937;
                int i32 = ((-315423461) - (~i28)) + ((~((i31 & i30) | (i31 ^ i30))) * (-68));
                int i33 = ((~i18) & (-1916255938)) | (1916255937 & i18);
                int i34 = i18 & (-1916255938);
                int i35 = (i33 ^ i34) | (i33 & i34);
                int i36 = ~i35;
                int i37 = (i35 | i36) & i36;
                int i38 = ((i37 & 1918386835) | ((-1918386836) & (~i37)) | (i37 & (-1918386836))) * 68;
                if ((~i17) + (i17 << 1) > ((((~i38) & i32) | ((~i32) & i38)) - (~((i38 & i32) << 1))) - 1) {
                    ((com.payair.hce.access100) access202Var).valueOf().DigitizedCardProfile();
                    throw null;
                }
                com.payair.hce.onTaskStatusCompleted valueOf2 = ((com.payair.hce.access100) access202Var).valueOf();
                if (valueOf2.DigitizedCardProfile() != null && valueOf2.DigitizedCardProfile().length > 0) {
                    int i39 = DigitizedCardProfile;
                    int i40 = i39 & 115;
                    int i41 = (i39 | 115) & (~i40);
                    int i42 = i40 << 1;
                    values = ((i41 & i42) + (i41 | i42)) % 128;
                    i = java.lang.Integer.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf2.DigitizedCardProfile()).writeReplace(), 16).intValue();
                    values = (DigitizedCardProfile + 105) % 128;
                }
            }
            int i43 = values;
            int i44 = i43 & 29;
            DigitizedCardProfile = (i44 + ((i43 ^ 29) | i44)) % 128;
        } catch (java.lang.NumberFormatException unused) {
            arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
        }
        if (i <= 999) {
            int i45 = DigitizedCardProfile;
            values = ((i45 ^ 121) + ((i45 & 121) << 1)) % 128;
        }
        arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
        values = (DigitizedCardProfile + 59) % 128;
        int i46 = values;
        int i47 = i46 & 57;
        int i48 = i47 + ((i46 ^ 57) | i47);
        DigitizedCardProfile = i48 % 128;
        if (i48 % 2 == 0) {
            return arrayList;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this, access202Var}, -2057860552, 2057860552, java.lang.System.identityHashCode(this));
    }
}
