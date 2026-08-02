package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawables implements com.payair.hce.setSelectedGroup {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        int i = DigitizedCardProfile;
        int i2 = i & 17;
        int i3 = ((i ^ 17) | i2) << 1;
        int i4 = -((i | 17) & (~i2));
        AlternateContactlessPaymentDataJson = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        com.payair.hce.setOnGroupClickListener setongroupclicklistener = (com.payair.hce.setOnGroupClickListener) obj;
        if (!setongroupclicklistener.values()) {
            double doubleValue = setongroupclicklistener.doubleValue();
            int i5 = DigitizedCardProfile;
            int i6 = ((i5 & 114) + (i5 | 114)) - 1;
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 != 0) {
                return java.lang.Double.valueOf(doubleValue);
            }
            throw null;
        }
        int i7 = DigitizedCardProfile;
        int i8 = (-2) - (~((i7 & 6) + (i7 | 6)));
        AlternateContactlessPaymentDataJson = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        long longValue = setongroupclicklistener.longValue();
        int i9 = DigitizedCardProfile;
        int i10 = i9 & 51;
        int i11 = -(-((i9 ^ 51) | i10));
        AlternateContactlessPaymentDataJson = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
        return java.lang.Long.valueOf(longValue);
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return writeReplace(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 747029576, -747029576, java.lang.System.identityHashCode(this));
    }
}
