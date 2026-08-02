package com.payair.hce;

/* loaded from: classes4.dex */
public final class setDivider implements com.payair.hce.setSelectedGroup {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        int i = values;
        int i2 = i ^ 19;
        int i3 = -(-((i & 19) << 1));
        AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        char charAt = obj.toString().charAt(0);
        int i4 = values;
        int i5 = (((i4 | 24) << 1) - (i4 ^ 24)) - 1;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Character.valueOf(charAt);
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 389555077, -389555077, java.lang.System.identityHashCode(this));
    }
}
