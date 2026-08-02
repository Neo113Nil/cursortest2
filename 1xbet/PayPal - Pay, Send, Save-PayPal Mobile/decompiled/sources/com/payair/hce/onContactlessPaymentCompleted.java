package com.payair.hce;

/* loaded from: classes4.dex */
public final class onContactlessPaymentCompleted extends com.payair.hce.access202 {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;
    private com.payair.hce.onDeleteCardFailed writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i | i5);
        return ((((i * (-523)) + (i2 * 263)) + (((i4 | i6) | (~(i5 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)) + (i6 * (-786))) + ((((~((~i3) | i5)) | i4) | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) != 1 ? values(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = (-2) - (~(AlternateContactlessPaymentDataJson + 58));
        valueOf = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.activateCardForToken activatecardfortoken = com.payair.hce.activateCardForToken.values;
            throw null;
        }
        com.payair.hce.activateCardForToken activatecardfortoken2 = com.payair.hce.activateCardForToken.values;
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = i2 & 97;
        int i4 = ((i2 | 97) & (~i3)) + (i3 << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return activatecardfortoken2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onContactlessPaymentCompleted oncontactlesspaymentcompleted = (com.payair.hce.onContactlessPaymentCompleted) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 41;
        int i3 = ((i ^ 41) | i2) << 1;
        int i4 = -((~i2) & (i | 41));
        valueOf = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        com.payair.hce.onDeleteCardFailed ondeletecardfailed = oncontactlesspaymentcompleted.writeReplace;
        int i5 = i & 39;
        int i6 = (i5 - (~((i ^ 39) | i5))) - 1;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            return ondeletecardfailed;
        }
        throw null;
    }

    public final com.payair.hce.onDeleteCardFailed valueOf() {
        return (com.payair.hce.onDeleteCardFailed) valueOf(new java.lang.Object[]{this}, -691731172, 691731173, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.access202
    public final com.payair.hce.activateCardForToken writeReplace() {
        return (com.payair.hce.activateCardForToken) valueOf(new java.lang.Object[]{this}, -1164972470, 1164972470, java.lang.System.identityHashCode(this));
    }
}
