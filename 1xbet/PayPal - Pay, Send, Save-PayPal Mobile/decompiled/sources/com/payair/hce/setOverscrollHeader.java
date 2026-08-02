package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOverscrollHeader implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        int i = DigitizedCardProfile;
        values = (((i ^ 87) - (~(-(-((i & 87) << 1))))) - 1) % 128;
        if (!(obj instanceof com.payair.hce.setOnGroupClickListener)) {
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(obj.toString());
            int i2 = DigitizedCardProfile;
            int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
            values = i3 % 128;
            if (i3 % 2 != 0) {
                return bigDecimal;
            }
            throw null;
        }
        int i4 = i & 7;
        int i5 = (i ^ 7) | i4;
        values = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        java.math.BigDecimal AlternateContactlessPaymentDataJson = ((com.payair.hce.setOnGroupClickListener) obj).AlternateContactlessPaymentDataJson();
        int i6 = values;
        int i7 = ((i6 | 13) << 1) - (i6 ^ 13);
        DigitizedCardProfile = i7 % 128;
        if (i7 % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1139782720, -1139782720, java.lang.System.identityHashCode(this));
    }
}
