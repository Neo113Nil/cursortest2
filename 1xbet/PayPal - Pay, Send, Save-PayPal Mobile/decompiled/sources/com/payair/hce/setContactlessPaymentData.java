package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContactlessPaymentData extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x014e, code lost:
    
        if (r4 > 999) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        long j;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
                int i = DigitizedCardProfile + 16;
                AlternateContactlessPaymentDataJson = ((~i) + (i << 1)) % 128;
                com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                byte[] IccPrivateKeyCrtComponentsJson = ((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).IccPrivateKeyCrtComponentsJson();
                if (IccPrivateKeyCrtComponentsJson == null) {
                    int i2 = DigitizedCardProfile;
                    AlternateContactlessPaymentDataJson = (((i2 | 107) << 1) - (i2 ^ 107)) % 128;
                    AlternateContactlessPaymentDataJson = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    return arrayList;
                }
                j = java.lang.Integer.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(IccPrivateKeyCrtComponentsJson).writeReplace(), 16).intValue();
                int i3 = AlternateContactlessPaymentDataJson;
                int i4 = i3 ^ 57;
                int i5 = ((i3 & 57) | i4) << 1;
                int i6 = -i4;
                DigitizedCardProfile = ((i5 & i6) + (i5 | i6)) % 128;
            } else {
                j = 0;
            }
            try {
                if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.valueOf) {
                    int i7 = AlternateContactlessPaymentDataJson;
                    int i8 = (i7 | 69) << 1;
                    int i9 = -(i7 ^ 69);
                    DigitizedCardProfile = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                    com.payair.hce.onTaskStatusCompleted valueOf = ((com.payair.hce.access100) access202Var).valueOf();
                    if (((byte[]) com.payair.hce.onTaskStatusCompleted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf}, -520127426, 520127426, java.lang.System.identityHashCode(valueOf))) != null) {
                        int i10 = DigitizedCardProfile;
                        int i11 = i10 & 9;
                        int i12 = (i11 - (~(-(-((i10 ^ 9) | i11))))) - 1;
                        AlternateContactlessPaymentDataJson = i12 % 128;
                        if (i12 % 2 != 0) {
                            int length = ((byte[]) com.payair.hce.onTaskStatusCompleted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf}, -520127426, 520127426, java.lang.System.identityHashCode(valueOf))).length;
                            throw new java.lang.NullPointerException();
                        }
                        if (((byte[]) com.payair.hce.onTaskStatusCompleted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf}, -520127426, 520127426, java.lang.System.identityHashCode(valueOf))).length > 0) {
                            int i13 = DigitizedCardProfile;
                            int i14 = i13 ^ 41;
                            AlternateContactlessPaymentDataJson = (((((i13 & 41) | i14) << 1) - (~(-i14))) - 1) % 128;
                            j = java.lang.Integer.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.onTaskStatusCompleted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf}, -520127426, 520127426, java.lang.System.identityHashCode(valueOf))).writeReplace(), 16).intValue();
                            int i15 = AlternateContactlessPaymentDataJson;
                            DigitizedCardProfile = (((i15 | 91) << 1) - ((i15 & (-92)) | ((~i15) & 91))) % 128;
                        }
                    }
                }
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 57) % 128;
            } catch (java.lang.NumberFormatException unused) {
                arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                if (j >= 0) {
                }
                arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                int i16 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = (((i16 & (-12)) | ((~i16) & 11)) + ((i16 & 11) << 1)) % 128;
                int i17 = AlternateContactlessPaymentDataJson;
                int i18 = i17 & 65;
                int i19 = ((i17 ^ 65) | i18) << 1;
                int i20 = -((i17 | 65) & (~i18));
                DigitizedCardProfile = ((i19 ^ i20) + ((i20 & i19) << 1)) % 128;
                return arrayList;
            }
        } catch (java.lang.NumberFormatException unused2) {
            j = 0;
        }
        if (j >= 0) {
            int i21 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((i21 ^ 61) + ((i21 & 61) << 1)) % 128;
        }
        arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
        int i162 = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (((i162 & (-12)) | ((~i162) & 11)) + ((i162 & 11) << 1)) % 128;
        int i172 = AlternateContactlessPaymentDataJson;
        int i182 = i172 & 65;
        int i192 = ((i172 ^ 65) | i182) << 1;
        int i202 = -((i172 | 65) & (~i182));
        DigitizedCardProfile = ((i192 ^ i202) + ((i202 & i192) << 1)) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) valueOf(new java.lang.Object[]{this, access202Var}, -1633169895, 1633169895, java.lang.System.identityHashCode(this));
    }
}
