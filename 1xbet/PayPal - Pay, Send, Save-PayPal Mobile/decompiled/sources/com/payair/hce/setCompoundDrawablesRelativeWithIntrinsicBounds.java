package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCompoundDrawablesRelativeWithIntrinsicBounds implements com.payair.hce.setSelectedGroup {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        int i = writeReplace;
        int i2 = (((i | 106) << 1) - (i ^ 106)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return DigitizedCardProfile(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1573422030, -1573422030, java.lang.System.identityHashCode(this));
    }
}
