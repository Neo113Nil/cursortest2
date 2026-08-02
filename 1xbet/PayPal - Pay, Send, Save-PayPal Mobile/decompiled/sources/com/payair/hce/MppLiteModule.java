package com.payair.hce;

/* loaded from: classes4.dex */
public final class MppLiteModule extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009f, code lost:
    
        r1.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a4, code lost:
    
        r2 = com.payair.hce.MppLiteModule.AlternateContactlessPaymentDataJson;
        r3 = (r2 ^ 98) + ((r2 & 98) << 1);
        com.payair.hce.MppLiteModule.DigitizedCardProfile = ((~r3) + (r3 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b3, code lost:
    
        com.payair.hce.MppLiteModule.AlternateContactlessPaymentDataJson = (com.payair.hce.MppLiteModule.DigitizedCardProfile + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        com.payair.hce.MppLiteModule.AlternateContactlessPaymentDataJson = (com.payair.hce.MppLiteModule.DigitizedCardProfile + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (r2 <= com.gemalto.mfs.mwsdk.payment.engine.remote.DSRPConstants.MAX_AMOUNT_LIMIT) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r2 > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
    
        if (r2 > com.gemalto.mfs.mwsdk.payment.engine.remote.DSRPConstants.MAX_AMOUNT_LIMIT) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (r2 > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        long longValue;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
            int i = DigitizedCardProfile;
            int i2 = i & 83;
            int i3 = ((i ^ 83) | i2) << 1;
            int i4 = -((i | 83) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            AlternateContactlessPaymentDataJson = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                    longValue = java.lang.Long.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).values()).writeReplace(), 6).longValue();
                } else {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted2 = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                    longValue = java.lang.Long.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted2}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted2))).values()).writeReplace(), 16).longValue();
                }
            } catch (java.lang.NumberFormatException unused) {
                arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
            }
        }
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.valueOf) {
            int i6 = AlternateContactlessPaymentDataJson + 17;
            DigitizedCardProfile = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    ((com.payair.hce.access100) access202Var).valueOf().valueOf();
                    throw null;
                }
                com.payair.hce.onTaskStatusCompleted valueOf = ((com.payair.hce.access100) access202Var).valueOf();
                if (valueOf.valueOf() != null && valueOf.valueOf().length > 0) {
                    int i7 = AlternateContactlessPaymentDataJson;
                    int i8 = i7 & 27;
                    int i9 = -(-(i7 | 27));
                    DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
                    long longValue2 = java.lang.Long.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf.valueOf()).writeReplace(), 16).longValue();
                    if (longValue2 >= 0) {
                        int i10 = AlternateContactlessPaymentDataJson;
                        int i11 = (i10 ^ 120) + ((i10 & 120) << 1);
                        DigitizedCardProfile = ((~i11) + (i11 << 1)) % 128;
                    }
                    arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                    int i12 = DigitizedCardProfile;
                    int i13 = i12 & 97;
                    int i14 = -(-((i12 ^ 97) | i13));
                    AlternateContactlessPaymentDataJson = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                }
                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 15) % 128;
            } catch (java.lang.NumberFormatException unused2) {
                arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
            }
        }
        int i15 = AlternateContactlessPaymentDataJson;
        int i16 = i15 | 85;
        DigitizedCardProfile = (((i16 << 1) - (~(-((~(i15 & 85)) & i16)))) - 1) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) values(new java.lang.Object[]{this, access202Var}, 1341977925, -1341977925, java.lang.System.identityHashCode(this));
    }
}
