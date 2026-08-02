package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSfi extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r2 >= 4294967295L) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        if (r2 != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        long longValue;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
                int i = AlternateContactlessPaymentDataJson;
                int i2 = i & 63;
                int i3 = ((i ^ 63) | i2) << 1;
                int i4 = -((i | 63) & (~i2));
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                values = i5 % 128;
                if (i5 % 2 == 0) {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                    longValue = java.lang.Long.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).valueOf()).writeReplace(), 97).longValue();
                    if (longValue != 0) {
                    }
                    arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                    int i6 = AlternateContactlessPaymentDataJson;
                    int i7 = ((i6 ^ 47) | (i6 & 47)) << 1;
                    int i8 = -((i6 & (-48)) | ((~i6) & 47));
                    values = ((i7 & i8) + (i8 | i7)) % 128;
                } else {
                    com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted2 = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
                    longValue = java.lang.Long.valueOf(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted2}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted2))).valueOf()).writeReplace(), 16).longValue();
                }
            }
            int i9 = values;
            int i10 = i9 & 125;
            int i11 = (i9 | 125) & (~i10);
            int i12 = i10 << 1;
            AlternateContactlessPaymentDataJson = ((i11 & i12) + (i11 | i12)) % 128;
        } catch (java.lang.NumberFormatException unused) {
            arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
        }
        int i13 = (-2) - (~(AlternateContactlessPaymentDataJson + 60));
        values = i13 % 128;
        if (i13 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) valueOf(new java.lang.Object[]{this, access202Var}, -1053244462, 1053244462, java.lang.System.identityHashCode(this));
    }
}
