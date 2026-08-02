package com.payair.hce;

/* loaded from: classes4.dex */
public final class setDq extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onRequestSessionFailed onrequestsessionfailed;
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.values) {
            com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) access202Var;
            onrequestsessionfailed = new com.payair.hce.onRequestSessionFailed(((com.payair.hce.onDeleteCardFailed) com.payair.hce.onContactlessPaymentCompleted.valueOf(new java.lang.Object[]{oncontactlesspaymentcompleted}, -691731172, 691731173, java.lang.System.identityHashCode(oncontactlesspaymentcompleted))).RecordsJson());
            AlternateContactlessPaymentDataJson = (writeReplace + 87) % 128;
        } else {
            onrequestsessionfailed = null;
        }
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.valueOf) {
            onrequestsessionfailed = new com.payair.hce.onRequestSessionFailed(((com.payair.hce.access100) access202Var).valueOf().writeReplace());
            int i = writeReplace;
            AlternateContactlessPaymentDataJson = ((i & 15) + (i | 15)) % 128;
        }
        if (onrequestsessionfailed != null) {
            int i2 = writeReplace;
            int i3 = (i2 & 6) + (i2 | 6);
            int i4 = (~i3) + (i3 << 1);
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!((java.lang.Boolean) com.payair.hce.onRequestSessionFailed.DigitizedCardProfile(new java.lang.Object[]{onrequestsessionfailed}, 1900086275, -1900086275, java.lang.System.identityHashCode(onrequestsessionfailed))).booleanValue()) {
                int i5 = AlternateContactlessPaymentDataJson;
                writeReplace = ((i5 & 27) + (i5 | 27)) % 128;
                arrayList.add(com.payair.hce.resetAuthenticationReferences.RecordsJson);
                writeReplace = (AlternateContactlessPaymentDataJson + 51) % 128;
            }
        }
        int i6 = AlternateContactlessPaymentDataJson;
        int i7 = i6 & 95;
        writeReplace = ((i7 - (~((i6 ^ 95) | i7))) - 1) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, access202Var}, 156020926, -156020926, java.lang.System.identityHashCode(this));
    }
}
