package com.payair.hce;

/* loaded from: classes4.dex */
public final class IccPrivateKeyCrtComponents extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.access202 access202Var = (com.payair.hce.access202) objArr[1];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!((com.payair.hce.setUpMCBP) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, 611170860, -611170849, java.lang.System.identityHashCode(access202Var))).values()) {
            int i = AlternateContactlessPaymentDataJson;
            int i2 = (i & 81) + (i | 81);
            values = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(com.payair.hce.resetAuthenticationReferences.SdkCoreAlternateContactlessPaymentDataImpl);
                int i3 = AlternateContactlessPaymentDataJson;
                int i4 = i3 & 117;
                int i5 = -(-((i3 ^ 117) | i4));
                values = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
            } else {
                arrayList.add(com.payair.hce.resetAuthenticationReferences.SdkCoreAlternateContactlessPaymentDataImpl);
                throw new java.lang.ArithmeticException();
            }
        }
        int i6 = AlternateContactlessPaymentDataJson;
        values = ((i6 & 13) + (i6 | 13)) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        return (java.util.List) values(new java.lang.Object[]{this, access202Var}, 824009876, -824009876, java.lang.System.identityHashCode(this));
    }
}
